package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import defpackage.oz5;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* JADX INFO: loaded from: classes4.dex */
public class CoreXMLDeserializers extends oz5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DatatypeFactory f7667a;

    public static class Std extends FromStringDeserializer<Object> {
        private static final long serialVersionUID = 1;
        protected final int _kind;

        public Std(Class<?> cls, int i) {
            super(cls);
            this._kind = i;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            int i = this._kind;
            if (i == 1) {
                return CoreXMLDeserializers.f7667a.newDuration(str);
            }
            if (i == 2) {
                try {
                    return _gregorianFromDate(deserializationContext, _parseDate(str, deserializationContext));
                } catch (JsonMappingException unused) {
                    return CoreXMLDeserializers.f7667a.newXMLGregorianCalendar(str);
                }
            }
            if (i == 3) {
                return QName.valueOf(str);
            }
            throw new IllegalStateException();
        }

        public XMLGregorianCalendar _gregorianFromDate(DeserializationContext deserializationContext, Date date) {
            if (date == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            TimeZone timeZone = deserializationContext.getTimeZone();
            if (timeZone != null) {
                gregorianCalendar.setTimeZone(timeZone);
            }
            return CoreXMLDeserializers.f7667a.newXMLGregorianCalendar(gregorianCalendar);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, defpackage.esd
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return (this._kind == 2 && jsonParser.y0(JsonToken.VALUE_NUMBER_INT)) ? _gregorianFromDate(deserializationContext, _parseDate(jsonParser, deserializationContext)) : super.deserialize(jsonParser, deserializationContext);
        }
    }

    static {
        try {
            f7667a = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
