package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ksd;
import defpackage.wwl;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.datatype.XMLGregorianCalendar;

/* JADX INFO: loaded from: classes4.dex */
public class CoreXMLSerializers$XMLGregorianCalendarSerializer extends StdSerializer<XMLGregorianCalendar> implements cj4 {
    static final CoreXMLSerializers$XMLGregorianCalendarSerializer instance = new CoreXMLSerializers$XMLGregorianCalendarSerializer();
    final eud<Object> _delegate;

    public CoreXMLSerializers$XMLGregorianCalendarSerializer() {
        this(CalendarSerializer.instance);
    }

    public Calendar _convert(XMLGregorianCalendar xMLGregorianCalendar) {
        if (xMLGregorianCalendar == null) {
            return null;
        }
        return xMLGregorianCalendar.toGregorianCalendar();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        this._delegate.acceptJsonFormatVisitor(ksdVar, null);
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<?> eudVarHandlePrimaryContextualization = wwlVar.handlePrimaryContextualization(this._delegate, beanProperty);
        return eudVarHandlePrimaryContextualization != this._delegate ? new CoreXMLSerializers$XMLGregorianCalendarSerializer(eudVarHandlePrimaryContextualization) : this;
    }

    @Override // defpackage.eud
    public eud<?> getDelegatee() {
        return this._delegate;
    }

    public CoreXMLSerializers$XMLGregorianCalendarSerializer(eud<?> eudVar) {
        super(XMLGregorianCalendar.class);
        this._delegate = eudVar;
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, XMLGregorianCalendar xMLGregorianCalendar) {
        return this._delegate.isEmpty(wwlVar, _convert(xMLGregorianCalendar));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(XMLGregorianCalendar xMLGregorianCalendar, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        this._delegate.serialize(_convert(xMLGregorianCalendar), jsonGenerator, wwlVar);
    }

    @Override // defpackage.eud
    public void serializeWithType(XMLGregorianCalendar xMLGregorianCalendar, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        this._delegate.serializeWithType(_convert(xMLGregorianCalendar), jsonGenerator, wwlVar, e5qVar);
    }
}
