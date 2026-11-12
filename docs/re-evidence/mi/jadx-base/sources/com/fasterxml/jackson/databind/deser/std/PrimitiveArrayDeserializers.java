package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import defpackage.aj4;
import defpackage.esd;
import defpackage.ij1;
import defpackage.q4q;
import defpackage.qqd;
import defpackage.z1h;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements aj4 {
    private transient Object _emptyValue;
    protected final z1h _nuller;
    protected final Boolean _unwrapSingle;

    @qqd
    public static final class a extends PrimitiveArrayDeserializers<boolean[]> {
        private static final long serialVersionUID = 1;

        public a() {
            super(boolean[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean[] _concat(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
            return zArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean[] _constructEmpty() {
            return new boolean[0];
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            boolean z_parseBooleanPrimitive;
            int i;
            if (!jsonParser.B0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ij1.b bVarC = deserializationContext.getArrayBuilders().c();
            boolean[] zArrF = bVarC.f();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.G0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return bVarC.e(zArrF, i2);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_TRUE) {
                            z_parseBooleanPrimitive = true;
                        } else {
                            if (jsonTokenG0 != JsonToken.VALUE_FALSE) {
                                if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                                    z1h z1hVar = this._nuller;
                                    if (z1hVar != null) {
                                        z1hVar.getNullValue(deserializationContext);
                                    } else {
                                        _verifyNullForPrimitive(deserializationContext);
                                    }
                                } else {
                                    z_parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                                }
                            }
                            z_parseBooleanPrimitive = false;
                        }
                        zArrF[i2] = z_parseBooleanPrimitive;
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        i2 = i;
                        throw JsonMappingException.wrapWithPath(e, zArrF, bVarC.d() + i2);
                    }
                    if (i2 >= zArrF.length) {
                        boolean[] zArrC = bVarC.c(zArrF, i2);
                        i2 = 0;
                        zArrF = zArrC;
                    }
                    i = i2 + 1;
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(z1h z1hVar, Boolean bool) {
            return new a(this, z1hVar, bool);
        }

        public a(a aVar, z1h z1hVar, Boolean bool) {
            super(aVar, z1hVar, bool);
        }
    }

    @qqd
    public static final class b extends PrimitiveArrayDeserializers<byte[]> {
        private static final long serialVersionUID = 1;

        public b() {
            super(byte[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] _concat(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
            return bArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] _constructEmpty() {
            return new byte[0];
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte bY;
            int i;
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.s(deserializationContext.getBase64Variant());
                } catch (JsonParseException e) {
                    String originalMessage = e.getOriginalMessage();
                    if (originalMessage.contains(ViewShot.Results.BASE_64)) {
                        return (byte[]) deserializationContext.handleWeirdStringValue(byte[].class, jsonParser.d0(), originalMessage, new Object[0]);
                    }
                }
            }
            if (jsonTokenK == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objP = jsonParser.P();
                if (objP == null) {
                    return null;
                }
                if (objP instanceof byte[]) {
                    return (byte[]) objP;
                }
            }
            if (!jsonParser.B0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ij1.c cVarD = deserializationContext.getArrayBuilders().d();
            byte[] bArrF = cVarD.f();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.G0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return cVarD.e(bArrF, i2);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_NUMBER_INT || jsonTokenG0 == JsonToken.VALUE_NUMBER_FLOAT) {
                            bY = jsonParser.y();
                        } else if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                            z1h z1hVar = this._nuller;
                            if (z1hVar != null) {
                                z1hVar.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                bY = 0;
                            }
                        } else {
                            bY = _parseBytePrimitive(jsonParser, deserializationContext);
                        }
                        bArrF[i2] = bY;
                        i2 = i;
                    } catch (Exception e2) {
                        e = e2;
                        i2 = i;
                        throw JsonMappingException.wrapWithPath(e, bArrF, cVarD.d() + i2);
                    }
                    if (i2 >= bArrF.length) {
                        byte[] bArrC = cVarD.c(bArrF, i2);
                        i2 = 0;
                        bArrF = bArrC;
                    }
                    i = i2 + 1;
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte bY;
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_NUMBER_INT || jsonTokenK == JsonToken.VALUE_NUMBER_FLOAT) {
                bY = jsonParser.y();
            } else {
                if (jsonTokenK == JsonToken.VALUE_NULL) {
                    z1h z1hVar = this._nuller;
                    if (z1hVar != null) {
                        z1hVar.getNullValue(deserializationContext);
                        return (byte[]) getEmptyValue(deserializationContext);
                    }
                    _verifyNullForPrimitive(deserializationContext);
                    return null;
                }
                bY = ((Number) deserializationContext.handleUnexpectedToken(this._valueClass.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{bY};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(z1h z1hVar, Boolean bool) {
            return new b(this, z1hVar, bool);
        }

        public b(b bVar, z1h z1hVar, Boolean bool) {
            super(bVar, z1hVar, bool);
        }
    }

    @qqd
    public static final class c extends PrimitiveArrayDeserializers<char[]> {
        private static final long serialVersionUID = 1;

        public c() {
            super(char[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] _concat(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
            return cArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public char[] _constructEmpty() {
            return new char[0];
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strD0;
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_STRING) {
                char[] cArrF0 = jsonParser.f0();
                int iI0 = jsonParser.i0();
                int iG0 = jsonParser.g0();
                char[] cArr = new char[iG0];
                System.arraycopy(cArrF0, iI0, cArr, 0, iG0);
                return cArr;
            }
            if (!jsonParser.B0()) {
                if (jsonTokenK == JsonToken.VALUE_EMBEDDED_OBJECT) {
                    Object objP = jsonParser.P();
                    if (objP == null) {
                        return null;
                    }
                    if (objP instanceof char[]) {
                        return (char[]) objP;
                    }
                    if (objP instanceof String) {
                        return ((String) objP).toCharArray();
                    }
                    if (objP instanceof byte[]) {
                        return com.fasterxml.jackson.core.a.a().encode((byte[]) objP, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            StringBuilder sb = new StringBuilder(64);
            while (true) {
                JsonToken jsonTokenG0 = jsonParser.G0();
                if (jsonTokenG0 == JsonToken.END_ARRAY) {
                    return sb.toString().toCharArray();
                }
                if (jsonTokenG0 == JsonToken.VALUE_STRING) {
                    strD0 = jsonParser.d0();
                } else if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                    z1h z1hVar = this._nuller;
                    if (z1hVar != null) {
                        z1hVar.getNullValue(deserializationContext);
                    } else {
                        _verifyNullForPrimitive(deserializationContext);
                        strD0 = "\u0000";
                    }
                } else {
                    strD0 = ((CharSequence) deserializationContext.handleUnexpectedToken(Character.TYPE, jsonParser)).toString();
                }
                if (strD0.length() != 1) {
                    deserializationContext.reportInputMismatch(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(strD0.length()));
                }
                sb.append(strD0.charAt(0));
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public char[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(z1h z1hVar, Boolean bool) {
            return this;
        }
    }

    @qqd
    public static final class d extends PrimitiveArrayDeserializers<double[]> {
        private static final long serialVersionUID = 1;

        public d() {
            super(double[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public double[] _concat(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
            return dArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public double[] _constructEmpty() {
            return new double[0];
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            z1h z1hVar;
            if (!jsonParser.B0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ij1.d dVarE = deserializationContext.getArrayBuilders().e();
            double[] dArr = (double[]) dVarE.f();
            int i = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.G0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (double[]) dVarE.e(dArr, i);
                    }
                    if (jsonTokenG0 != JsonToken.VALUE_NULL || (z1hVar = this._nuller) == null) {
                        double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                        if (i >= dArr.length) {
                            double[] dArr2 = (double[]) dVarE.c(dArr, i);
                            i = 0;
                            dArr = dArr2;
                        }
                        int i2 = i + 1;
                        try {
                            dArr[i] = d_parseDoublePrimitive;
                            i = i2;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                            throw JsonMappingException.wrapWithPath(e, dArr, dVarE.d() + i);
                        }
                    } else {
                        z1hVar.getNullValue(deserializationContext);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public double[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(z1h z1hVar, Boolean bool) {
            return new d(this, z1hVar, bool);
        }

        public d(d dVar, z1h z1hVar, Boolean bool) {
            super(dVar, z1hVar, bool);
        }
    }

    @qqd
    public static final class e extends PrimitiveArrayDeserializers<float[]> {
        private static final long serialVersionUID = 1;

        public e() {
            super(float[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] _concat(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
            return fArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public float[] _constructEmpty() {
            return new float[0];
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            z1h z1hVar;
            if (!jsonParser.B0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ij1.e eVarF = deserializationContext.getArrayBuilders().f();
            float[] fArr = (float[]) eVarF.f();
            int i = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.G0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (float[]) eVarF.e(fArr, i);
                    }
                    if (jsonTokenG0 != JsonToken.VALUE_NULL || (z1hVar = this._nuller) == null) {
                        float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                        if (i >= fArr.length) {
                            float[] fArr2 = (float[]) eVarF.c(fArr, i);
                            i = 0;
                            fArr = fArr2;
                        }
                        int i2 = i + 1;
                        try {
                            fArr[i] = f_parseFloatPrimitive;
                            i = i2;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                            throw JsonMappingException.wrapWithPath(e, fArr, eVarF.d() + i);
                        }
                    } else {
                        z1hVar.getNullValue(deserializationContext);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(z1h z1hVar, Boolean bool) {
            return new e(this, z1hVar, bool);
        }

        public e(e eVar, z1h z1hVar, Boolean bool) {
            super(eVar, z1hVar, bool);
        }
    }

    @qqd
    public static final class f extends PrimitiveArrayDeserializers<int[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f7656a = new f();
        private static final long serialVersionUID = 1;

        public f() {
            super(int[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int[] _concat(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
            return iArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int[] _constructEmpty() {
            return new int[0];
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int iR;
            int i;
            if (!jsonParser.B0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ij1.f fVarG = deserializationContext.getArrayBuilders().g();
            int[] iArr = (int[]) fVarG.f();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.G0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (int[]) fVarG.e(iArr, i2);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_NUMBER_INT) {
                            iR = jsonParser.R();
                        } else if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                            z1h z1hVar = this._nuller;
                            if (z1hVar != null) {
                                z1hVar.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                iR = 0;
                            }
                        } else {
                            iR = _parseIntPrimitive(jsonParser, deserializationContext);
                        }
                        iArr[i2] = iR;
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        i2 = i;
                        throw JsonMappingException.wrapWithPath(e, iArr, fVarG.d() + i2);
                    }
                    if (i2 >= iArr.length) {
                        int[] iArr2 = (int[]) fVarG.c(iArr, i2);
                        i2 = 0;
                        iArr = iArr2;
                    }
                    i = i2 + 1;
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(z1h z1hVar, Boolean bool) {
            return new f(this, z1hVar, bool);
        }

        public f(f fVar, z1h z1hVar, Boolean bool) {
            super(fVar, z1hVar, bool);
        }
    }

    @qqd
    public static final class g extends PrimitiveArrayDeserializers<long[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f7657a = new g();
        private static final long serialVersionUID = 1;

        public g() {
            super(long[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public long[] _concat(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
            return jArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public long[] _constructEmpty() {
            return new long[0];
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            long jS;
            int i;
            if (!jsonParser.B0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ij1.g gVarH = deserializationContext.getArrayBuilders().h();
            long[] jArr = (long[]) gVarH.f();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.G0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (long[]) gVarH.e(jArr, i2);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_NUMBER_INT) {
                            jS = jsonParser.S();
                        } else if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                            z1h z1hVar = this._nuller;
                            if (z1hVar != null) {
                                z1hVar.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                jS = 0;
                            }
                        } else {
                            jS = _parseLongPrimitive(jsonParser, deserializationContext);
                        }
                        jArr[i2] = jS;
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        i2 = i;
                        throw JsonMappingException.wrapWithPath(e, jArr, gVarH.d() + i2);
                    }
                    if (i2 >= jArr.length) {
                        long[] jArr2 = (long[]) gVarH.c(jArr, i2);
                        i2 = 0;
                        jArr = jArr2;
                    }
                    i = i2 + 1;
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public long[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(z1h z1hVar, Boolean bool) {
            return new g(this, z1hVar, bool);
        }

        public g(g gVar, z1h z1hVar, Boolean bool) {
            super(gVar, z1hVar, bool);
        }
    }

    @qqd
    public static final class h extends PrimitiveArrayDeserializers<short[]> {
        private static final long serialVersionUID = 1;

        public h() {
            super(short[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public short[] _concat(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
            return sArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public short[] _constructEmpty() {
            return new short[0];
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            short s_parseShortPrimitive;
            int i;
            if (!jsonParser.B0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ij1.h hVarI = deserializationContext.getArrayBuilders().i();
            short[] sArrF = hVarI.f();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.G0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return hVarI.e(sArrF, i2);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                            z1h z1hVar = this._nuller;
                            if (z1hVar != null) {
                                z1hVar.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                s_parseShortPrimitive = 0;
                            }
                        } else {
                            s_parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                        }
                        sArrF[i2] = s_parseShortPrimitive;
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        i2 = i;
                        throw JsonMappingException.wrapWithPath(e, sArrF, hVarI.d() + i2);
                    }
                    if (i2 >= sArrF.length) {
                        short[] sArrC = hVarI.c(sArrF, i2);
                        i2 = 0;
                        sArrF = sArrC;
                    }
                    i = i2 + 1;
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public short[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(z1h z1hVar, Boolean bool) {
            return new h(this, z1hVar, bool);
        }

        public h(h hVar, z1h z1hVar, Boolean bool) {
            super(hVar, z1hVar, bool);
        }
    }

    public PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    public static esd<?> forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return f.f7656a;
        }
        if (cls == Long.TYPE) {
            return g.f7657a;
        }
        if (cls == Byte.TYPE) {
            return new b();
        }
        if (cls == Short.TYPE) {
            return new h();
        }
        if (cls == Float.TYPE) {
            return new e();
        }
        if (cls == Double.TYPE) {
            return new d();
        }
        if (cls == Boolean.TYPE) {
            return new a();
        }
        if (cls == Character.TYPE) {
            return new c();
        }
        throw new IllegalStateException();
    }

    public abstract T _concat(T t, T t2);

    public abstract T _constructEmpty();

    public void _failOnNull(DeserializationContext deserializationContext) throws IOException {
        throw InvalidNullException.from(deserializationContext, (PropertyName) null, deserializationContext.constructType(this._valueClass));
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        z1h z1hVarConstructForRootValue;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._valueClass, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Nulls nullsFindContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (nullsFindContentNullStyle == Nulls.SKIP) {
            z1hVarConstructForRootValue = NullsConstantProvider.skipper();
        } else if (nullsFindContentNullStyle == Nulls.FAIL) {
            z1hVarConstructForRootValue = beanProperty == null ? NullsFailProvider.constructForRootValue(deserializationContext.constructType(this._valueClass)) : NullsFailProvider.constructForProperty(beanProperty);
        } else {
            z1hVarConstructForRootValue = null;
        }
        return (boolFindFormatFeature == this._unwrapSingle && z1hVarConstructForRootValue == this._nuller) ? this : withResolved(z1hVarConstructForRootValue, boolFindFormatFeature);
    }

    @Override // defpackage.esd
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        T tDeserialize = deserialize(jsonParser, deserializationContext);
        return (t == null || Array.getLength(t) == 0) ? tDeserialize : _concat(t, tDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // defpackage.esd
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        Object obj = this._emptyValue;
        if (obj != null) {
            return obj;
        }
        T t_constructEmpty = _constructEmpty();
        this._emptyValue = t_constructEmpty;
        return t_constructEmpty;
    }

    public T handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.d0().length() == 0) {
            return null;
        }
        Boolean bool = this._unwrapSingle;
        return (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) ? handleSingleElementUnwrapped(jsonParser, deserializationContext) : (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public abstract T handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract PrimitiveArrayDeserializers<?> withResolved(z1h z1hVar, Boolean bool);

    public PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, z1h z1hVar, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
        this._nuller = z1hVar;
    }
}
