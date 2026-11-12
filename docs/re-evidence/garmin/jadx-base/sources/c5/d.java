package c5;

import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lc5/d;", "", "", "isDataDifferential", "Lc5/d$a;", "strategy", "<init>", "(ZLc5/d$a;)V", "(Z)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c5.a[] f24455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f24457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f24458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f24459h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc5/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        Lsq2,
        Impulse
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24463a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24463a = iArr;
        }
    }

    public d(boolean z14, a aVar) {
        this.f24452a = z14;
        this.f24453b = aVar;
        if (z14 && aVar.equals(a.Lsq2)) {
            h.z("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i14 = b.f24463a[aVar.ordinal()];
        int i15 = 2;
        if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                throw null;
            }
            i15 = 3;
        }
        this.f24454c = i15;
        this.f24455d = new c5.a[20];
        this.f24457f = new float[20];
        this.f24458g = new float[20];
        this.f24459h = new float[3];
    }

    public final void a(float f14, long j8) {
        int i14 = (this.f24456e + 1) % 20;
        this.f24456e = i14;
        c5.a[] aVarArr = this.f24455d;
        c5.a aVar = aVarArr[i14];
        if (aVar == null) {
            aVarArr[i14] = new c5.a(j8, f14);
        } else {
            aVar.f24445a = j8;
            aVar.f24446b = f14;
        }
    }

    public final float b(float f14) {
        a aVar;
        float[] fArr;
        float[] fArr2;
        float f15;
        boolean z14;
        int i14;
        float fSignum;
        float f16 = f14;
        float f17 = 0.0f;
        if (f16 <= 0.0f) {
            e5.a.b("maximumVelocity should be a positive value. You specified=" + f16);
        }
        int i15 = this.f24456e;
        c5.a[] aVarArr = this.f24455d;
        c5.a aVar2 = aVarArr[i15];
        if (aVar2 == null) {
            f15 = 0.0f;
        } else {
            int i16 = 0;
            c5.a aVar3 = aVar2;
            while (true) {
                c5.a aVar4 = aVarArr[i15];
                boolean z15 = this.f24452a;
                aVar = this.f24453b;
                fArr = this.f24457f;
                fArr2 = this.f24458g;
                if (aVar4 == null) {
                    f15 = f17;
                    z14 = z15;
                    i14 = 1;
                    break;
                }
                long j8 = aVar2.f24445a;
                f15 = f17;
                int i17 = i15;
                long j14 = aVar4.f24445a;
                float f18 = j8 - j14;
                z14 = z15;
                i14 = 1;
                float fAbs = Math.abs(j14 - aVar3.f24445a);
                aVar3 = (aVar == a.Lsq2 || z14) ? aVar4 : aVar2;
                if (f18 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i16] = aVar4.f24446b;
                fArr2[i16] = -f18;
                i15 = (i17 == 0 ? 20 : i17) - 1;
                i16++;
                if (i16 >= 20) {
                    break;
                }
                f17 = f15;
            }
            if (i16 >= this.f24454c) {
                int i18 = b.f24463a[aVar.ordinal()];
                if (i18 == i14) {
                    int i19 = i16 - i14;
                    float f19 = fArr2[i19];
                    int i24 = i19;
                    float fAbs2 = f15;
                    while (i24 > 0) {
                        int i25 = i24 - 1;
                        float f22 = fArr2[i25];
                        if (f19 != f22) {
                            float f24 = (z14 ? -fArr[i25] : fArr[i24] - fArr[i25]) / (f19 - f22);
                            fAbs2 += Math.abs(f24) * (f24 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i24 == i19) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i24--;
                        f19 = f22;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                } else {
                    if (i18 != 2) {
                        u0.r();
                        return 0.0f;
                    }
                    try {
                        float[] fArr3 = this.f24459h;
                        f.c(fArr2, fArr, i16, fArr3);
                        fSignum = fArr3[i14];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f15;
                    }
                }
                f17 = fSignum * 1000;
            } else {
                f17 = f15;
            }
        }
        if (f17 == f15 || Float.isNaN(f17)) {
            return f15;
        }
        if (f17 <= f15) {
            f16 = -f16;
            if (f17 >= f16) {
                return f17;
            }
        } else if (f17 <= f16) {
            f16 = f17;
        }
        return f16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ d(boolean z14, a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? a.Lsq2 : aVar);
    }

    public d(boolean z14) {
        this(z14, a.Impulse);
    }
}
