package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.wwl;
import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes4.dex */
public class InetAddressSerializer extends StdScalarSerializer<InetAddress> implements cj4 {
    protected final boolean _asNumeric;

    public InetAddressSerializer() {
        this(false);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        boolean z;
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
            if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z != this._asNumeric ? new InetAddressSerializer(z) : this;
    }

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this._asNumeric = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(InetAddress inetAddress, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        String strTrim;
        if (this._asNumeric) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : strTrim.substring(0, iIndexOf);
            }
        }
        jsonGenerator.Q0(strTrim);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, defpackage.eud
    public void serializeWithType(InetAddress inetAddress, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.f(inetAddress, InetAddress.class, JsonToken.VALUE_STRING));
        serialize(inetAddress, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }
}
