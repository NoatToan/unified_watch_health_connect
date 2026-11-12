package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes21.dex */
public class agl extends StdScalarSerializer<InetAddress> implements ContextualSerializer {
    protected final boolean d;

    public agl() {
        this(false);
    }

    public agl(boolean z) {
        super(InetAddress.class);
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        boolean z;
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (cVarFindFormatOverrides != null) {
            JsonFormat.Shape shapeB = cVarFindFormatOverrides.b();
            if (shapeB.isNumeric() || shapeB == JsonFormat.Shape.ARRAY) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z != this.d ? new agl(z) : this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InetAddress inetAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String strTrim;
        if (this.d) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                if (iIndexOf == 0) {
                    strTrim = strTrim.substring(1);
                } else {
                    strTrim = strTrim.substring(0, iIndexOf);
                }
            }
        }
        jsonGenerator.writeString(strTrim);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serializeWithType(InetAddress inetAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(inetAddress, InetAddress.class, JsonToken.VALUE_STRING));
        serialize(inetAddress, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }
}
