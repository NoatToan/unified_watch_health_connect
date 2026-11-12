package qs1;

import c22.l3;
import c22.m3;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqs1/n;", "", "", "minValue", "maxValue", "Lc22/m3;", "unit", "<init>", "(IILc22/m3;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3 f147319c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147320a;

        static {
            int[] iArr = new int[m3.values().length];
            try {
                iArr[m3.KILOMETER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m3.MILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m3.FOOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f147320a = iArr;
        }
    }

    public n(int i14, int i15, m3 m3Var) {
        m3Var.getClass();
        this.f147317a = i14;
        this.f147318b = i15;
        this.f147319c = m3Var;
    }

    public static int c(int i14) {
        return (int) (Math.rint(((double) i14) / 100.0d) * ((double) 100));
    }

    public final n a(boolean z14) {
        int i14 = a.f147320a[this.f147319c.ordinal()];
        int i15 = this.f147318b;
        int i16 = this.f147317a;
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (!z14) {
                        l3.f23124b.getClass();
                        return new n(c(MathKt.b(((double) i16) * 3.2808399d)), c(MathKt.b(((double) i15) * 3.2808399d)), m3.FOOT);
                    }
                } else if (z14) {
                    l3.f23124b.getClass();
                    return new n(c(MathKt.b(((double) i16) / 3.2808399d)), c(MathKt.b(((double) i15) / 3.2808399d)), m3.METER);
                }
            } else if (z14) {
                l3.f23124b.getClass();
                return new n(MathKt.b(((double) i16) * 1.609344d), MathKt.b(((double) i15) * 1.609344d), m3.KILOMETER);
            }
        } else if (!z14) {
            l3.f23124b.getClass();
            return new n(MathKt.b(Math.ceil(((double) i16) / 1.609344d)), MathKt.b(Math.ceil(((double) i15) / 1.609344d)), m3.MILE);
        }
        return this;
    }

    public final int b(int i14) {
        int i15 = a.f147320a[this.f147319c.ordinal()];
        if (i15 == 1) {
            l3.f23124b.getClass();
            return MathKt.b(((double) i14) * 1000.0d);
        }
        if (i15 == 2) {
            l3.f23124b.getClass();
            return MathKt.b(((double) i14) * 1609.344d);
        }
        if (i15 != 3) {
            return i14;
        }
        l3.f23124b.getClass();
        return MathKt.b(((double) i14) / 3.2808399d);
    }

    public final j23.e d(n nVar) {
        int i14 = this.f147318b;
        int i15 = this.f147317a;
        if (nVar == null) {
            return new j23.e(i15, i14);
        }
        int i16 = nVar.f147317a;
        if (i15 < i16) {
            i15 = i16;
        }
        float f14 = i15;
        int i17 = nVar.f147318b;
        if (i14 > i17) {
            i14 = i17;
        }
        return new j23.e(f14, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f147317a == nVar.f147317a && this.f147318b == nVar.f147318b && this.f147319c == nVar.f147319c;
    }

    public final int hashCode() {
        return this.f147319c.hashCode() + q2.d(this.f147318b, Integer.hashCode(this.f147317a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f147317a, this.f147318b, "SearchRange(minValue=", ", maxValue=", ", unit=");
        sbJ.append(this.f147319c);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ n(int i14, int i15, m3 m3Var, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? m3.METER : m3Var);
    }
}
