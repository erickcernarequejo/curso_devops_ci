package com.paymentchain.billing.common;

import com.paymentchain.billing.dto.InvoiceRequest;
import com.paymentchain.billing.entities.Invoice;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-29T19:38:39-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class InvoiceRequestMapperImpl implements InvoiceRequestMapper {

    @Override
    public Invoice InvoiceRequestToInvoice(InvoiceRequest source) {
        if ( source == null ) {
            return null;
        }

        Invoice invoice = new Invoice();

        invoice.setCustomerId( source.getCustomer() );
        invoice.setAmount( source.getAmount() );
        invoice.setDetail( source.getDetail() );
        invoice.setNumber( source.getNumber() );

        return invoice;
    }

    @Override
    public List<Invoice> InvoiceRequestListToInvoiceList(List<InvoiceRequest> source) {
        if ( source == null ) {
            return null;
        }

        List<Invoice> list = new ArrayList<Invoice>( source.size() );
        for ( InvoiceRequest invoiceRequest : source ) {
            list.add( InvoiceRequestToInvoice( invoiceRequest ) );
        }

        return list;
    }
}
