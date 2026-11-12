package rc;

import ch.qos.logback.classic.spi.CallerData;
import d53.u;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151836a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.STRING_NULLABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.BOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f.INT_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f.BOOL_NULLABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f.DOUBLE_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f.FLOAT_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[f.LONG_NULLABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[f.INT_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[f.BOOL_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[f.DOUBLE_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[f.FLOAT_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[f.LONG_ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[f.ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[f.LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[f.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f151836a = iArr;
        }
    }

    public static final f a(k63.e eVar) {
        String strV = u.v(eVar.getF116983a(), CallerData.NA, "", false);
        if (s.g(eVar.getF103234b(), k63.l.b.f103252a)) {
            return eVar.b() ? f.ENUM_NULLABLE : f.ENUM;
        }
        if (strV.equals("kotlin.Int")) {
            return eVar.b() ? f.INT_NULLABLE : f.INT;
        }
        if (strV.equals("kotlin.Boolean")) {
            return eVar.b() ? f.BOOL_NULLABLE : f.BOOL;
        }
        if (strV.equals("kotlin.Double")) {
            return eVar.b() ? f.DOUBLE_NULLABLE : f.DOUBLE;
        }
        if (strV.equals("kotlin.Float")) {
            return eVar.b() ? f.FLOAT_NULLABLE : f.FLOAT;
        }
        if (strV.equals("kotlin.Long")) {
            return eVar.b() ? f.LONG_NULLABLE : f.LONG;
        }
        if (strV.equals("kotlin.String")) {
            return eVar.b() ? f.STRING_NULLABLE : f.STRING;
        }
        if (strV.equals("kotlin.IntArray")) {
            return f.INT_ARRAY;
        }
        if (strV.equals("kotlin.DoubleArray")) {
            return f.DOUBLE_ARRAY;
        }
        if (strV.equals("kotlin.BooleanArray")) {
            return f.BOOL_ARRAY;
        }
        if (strV.equals("kotlin.FloatArray")) {
            return f.FLOAT_ARRAY;
        }
        if (strV.equals("kotlin.LongArray")) {
            return f.LONG_ARRAY;
        }
        if (strV.equals("kotlin.Array")) {
            return f.ARRAY;
        }
        return u.y(strV, "kotlin.collections.ArrayList", false) ? f.LIST : f.UNKNOWN;
    }
}
