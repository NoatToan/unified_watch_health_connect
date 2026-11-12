package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

/* JADX INFO: loaded from: classes21.dex */
public class afo implements BeanPropertyFilter, PropertyFilter {
    protected boolean a(Object obj) {
        return true;
    }

    protected boolean b(aez aezVar) {
        return true;
    }

    protected boolean e(PropertyWriter propertyWriter) {
        return true;
    }

    protected afo() {
    }

    public static PropertyFilter c(final BeanPropertyFilter beanPropertyFilter) {
        return new PropertyFilter() { // from class: afo.4
            @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
            public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
                beanPropertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, (aez) propertyWriter);
            }

            @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
            public void depositSchemaProperty(PropertyWriter propertyWriter, aeu aeuVar, SerializerProvider serializerProvider) throws ym {
                beanPropertyFilter.depositSchemaProperty((aez) propertyWriter, aeuVar, serializerProvider);
            }

            @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
            public void depositSchemaProperty(PropertyWriter propertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
                beanPropertyFilter.depositSchemaProperty((aez) propertyWriter, jsonObjectFormatVisitor, serializerProvider);
            }

            @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
            public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyFilter
    @Deprecated
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, aez aezVar) throws Exception {
        if (b(aezVar)) {
            aezVar.serializeAsField(obj, jsonGenerator, serializerProvider);
        } else {
            if (jsonGenerator.canOmitFields()) {
                return;
            }
            aezVar.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyFilter
    @Deprecated
    public void depositSchemaProperty(aez aezVar, aeu aeuVar, SerializerProvider serializerProvider) throws ym {
        if (b(aezVar)) {
            aezVar.depositSchemaProperty(aeuVar, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyFilter
    @Deprecated
    public void depositSchemaProperty(aez aezVar, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
        if (b(aezVar)) {
            aezVar.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
        if (e(propertyWriter)) {
            propertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
        } else {
            if (jsonGenerator.canOmitFields()) {
                return;
            }
            propertyWriter.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
        if (a(obj)) {
            propertyWriter.serializeAsElement(obj, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    @Deprecated
    public void depositSchemaProperty(PropertyWriter propertyWriter, aeu aeuVar, SerializerProvider serializerProvider) throws ym {
        if (e(propertyWriter)) {
            propertyWriter.depositSchemaProperty(aeuVar, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    public void depositSchemaProperty(PropertyWriter propertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
        if (e(propertyWriter)) {
            propertyWriter.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }
}
