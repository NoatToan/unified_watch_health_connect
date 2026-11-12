package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.cj4;
import defpackage.eud;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class NumberSerializer extends StdScalarSerializer<Number> implements cj4 {
    public static final NumberSerializer instance = new NumberSerializer(Number.class);
    protected final boolean _isInt;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7710a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f7710a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public NumberSerializer(Class<? extends Number> cls) {
        super(cls, false);
        this._isInt = cls == BigInteger.class;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        if (this._isInt) {
            visitIntFormat(ksdVar, javaType, JsonParser.NumberType.BIG_INTEGER);
        } else if (handledType() == BigDecimal.class) {
            visitFloatFormat(ksdVar, javaType, JsonParser.NumberType.BIG_DECIMAL);
        } else {
            ksdVar.l(javaType);
        }
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, handledType());
        return (valueFindFormatOverrides == null || a.f7710a[valueFindFormatOverrides.getShape().ordinal()] != 1) ? this : ToStringSerializer.instance;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) {
        return createSchemaNode(this._isInt ? "integer" : RealNameWebViewActivity.NUMBER, true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Number number, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (number instanceof BigDecimal) {
            jsonGenerator.y0((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            jsonGenerator.z0((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            jsonGenerator.w0(number.longValue());
            return;
        }
        if (number instanceof Double) {
            jsonGenerator.t0(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            jsonGenerator.u0(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.v0(number.intValue());
        } else {
            jsonGenerator.x0(number.toString());
        }
    }
}
