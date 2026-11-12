package o4;

import ch.qos.logback.core.CoreConstants;
import okhttp3.internal.ws.WebSocketProtocol;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo4/d0;", "", "a", "value", "Lo13/z;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f128823b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f128824c = f0.d(4278190080L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f128825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f128826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f128827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f128828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f128829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f128830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f128831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f128832k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f128833a;

    static {
        f0.d(4282664004L);
        f128825d = f0.d(4287137928L);
        f0.d(4291611852L);
        f128826e = f0.d(4294967295L);
        f128827f = f0.d(4294901760L);
        f0.d(4278255360L);
        f128828g = f0.d(4278190335L);
        f128829h = f0.d(4294967040L);
        f0.d(4278255615L);
        f128830i = f0.d(4294902015L);
        f128831j = f0.b(0);
        p4.e.f135544a.getClass();
        f128832k = f0.a(0.0f, 0.0f, 0.0f, 0.0f, p4.e.f135565v);
    }

    private /* synthetic */ d0(long j8) {
        this.f128833a = j8;
    }

    public static final /* synthetic */ d0 a(long j8) {
        return new d0(j8);
    }

    public static final long b(long j8, p4.c cVar) {
        p4.g gVarD;
        p4.c cVarG = g(j8);
        p4.m.f135589b.getClass();
        int i14 = cVarG.f135543c;
        int i15 = cVar.f135543c;
        if ((i14 | i15) < 0) {
            gVarD = p4.d.d(cVarG, cVar);
        } else {
            p1.i0<p4.g> i0Var = p4.h.f135578a;
            int i16 = i14 | (i15 << 6);
            p4.g gVarB = i0Var.b(i16);
            if (gVarB == null) {
                gVarB = p4.d.d(cVarG, cVar);
                i0Var.i(i16, gVarB);
            }
            gVarD = gVarB;
        }
        return gVarD.a(j8);
    }

    public static long c(float f14, long j8, int i14) {
        if ((i14 & 1) != 0) {
            f14 = e(j8);
        }
        return f0.a(i(j8), h(j8), f(j8), f14, g(j8));
    }

    public static final boolean d(long j8, long j14) {
        o13.z.a aVar = o13.z.f128618b;
        return j8 == j14;
    }

    public static final float e(long j8) {
        float fC0;
        float f14;
        long j14 = 63 & j8;
        o13.z.a aVar = o13.z.f128618b;
        if (j14 == 0) {
            fC0 = (float) ge1.b.c0((j8 >>> 56) & 255);
            f14 = 255.0f;
        } else {
            fC0 = (float) ge1.b.c0((j8 >>> 6) & 1023);
            f14 = 1023.0f;
        }
        return fC0 / f14;
    }

    public static final float f(long j8) {
        int i14;
        int i15;
        int i16;
        long j14 = 63 & j8;
        o13.z.a aVar = o13.z.f128618b;
        if (j14 == 0) {
            return ((float) ge1.b.c0((j8 >>> 32) & 255)) / 255.0f;
        }
        short s8 = (short) ((j8 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i17 = Short.MIN_VALUE & s8;
        int i18 = ((65535 & s8) >>> 10) & 31;
        int i19 = s8 & 1023;
        if (i18 != 0) {
            int i24 = i19 << 13;
            if (i18 == 31) {
                i14 = 255;
                if (i24 != 0) {
                    i24 |= 4194304;
                }
            } else {
                i14 = i18 + 112;
            }
            int i25 = i14;
            i15 = i24;
            i16 = i25;
        } else {
            if (i19 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i19 + 1056964608) - p0.f128927a;
                return i17 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i16 = 0;
            i15 = 0;
        }
        return Float.intBitsToFloat((i16 << 23) | (i17 << 16) | i15);
    }

    public static final p4.c g(long j8) {
        p4.e eVar = p4.e.f135544a;
        o13.z.a aVar = o13.z.f128618b;
        eVar.getClass();
        return p4.e.f135569z[(int) (j8 & 63)];
    }

    public static final float h(long j8) {
        int i14;
        int i15;
        int i16;
        long j14 = 63 & j8;
        o13.z.a aVar = o13.z.f128618b;
        if (j14 == 0) {
            return ((float) ge1.b.c0((j8 >>> 40) & 255)) / 255.0f;
        }
        short s8 = (short) ((j8 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i17 = Short.MIN_VALUE & s8;
        int i18 = ((65535 & s8) >>> 10) & 31;
        int i19 = s8 & 1023;
        if (i18 != 0) {
            int i24 = i19 << 13;
            if (i18 == 31) {
                i14 = 255;
                if (i24 != 0) {
                    i24 |= 4194304;
                }
            } else {
                i14 = i18 + 112;
            }
            int i25 = i14;
            i15 = i24;
            i16 = i25;
        } else {
            if (i19 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i19 + 1056964608) - p0.f128927a;
                return i17 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i16 = 0;
            i15 = 0;
        }
        return Float.intBitsToFloat((i16 << 23) | (i17 << 16) | i15);
    }

    public static final float i(long j8) {
        int i14;
        int i15;
        int i16;
        long j14 = 63 & j8;
        o13.z.a aVar = o13.z.f128618b;
        if (j14 == 0) {
            return ((float) ge1.b.c0((j8 >>> 48) & 255)) / 255.0f;
        }
        short s8 = (short) ((j8 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i17 = Short.MIN_VALUE & s8;
        int i18 = ((65535 & s8) >>> 10) & 31;
        int i19 = s8 & 1023;
        if (i18 != 0) {
            int i24 = i19 << 13;
            if (i18 == 31) {
                i14 = 255;
                if (i24 != 0) {
                    i24 |= 4194304;
                }
            } else {
                i14 = i18 + 112;
            }
            int i25 = i14;
            i15 = i24;
            i16 = i25;
        } else {
            if (i19 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i19 + 1056964608) - p0.f128927a;
                return i17 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i16 = 0;
            i15 = 0;
        }
        return Float.intBitsToFloat((i16 << 23) | (i17 << 16) | i15);
    }

    public static String j(long j8) {
        StringBuilder sb3 = new StringBuilder("Color(");
        sb3.append(i(j8));
        sb3.append(", ");
        sb3.append(h(j8));
        sb3.append(", ");
        sb3.append(f(j8));
        sb3.append(", ");
        sb3.append(e(j8));
        sb3.append(", ");
        return androidx.room.a0.m(sb3, g(j8).f135541a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.f128833a == ((d0) obj).f128833a;
        }
        return false;
    }

    public final int hashCode() {
        o13.z.a aVar = o13.z.f128618b;
        return Long.hashCode(this.f128833a);
    }

    public final String toString() {
        return j(this.f128833a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/d0$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
