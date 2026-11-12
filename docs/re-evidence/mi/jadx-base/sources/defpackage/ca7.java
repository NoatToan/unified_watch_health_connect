package defpackage;

import android.animation.TimeInterpolator;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(11)
public class ca7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f5115a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f5116b = new u();
    public static final c0 c = new v();
    public static final c0 d = new w();
    public static final c0 e = new x();
    public static final c0 f = new y();
    public static final c0 g = new z();
    public static final c0 h = new a0();
    public static final c0 i = new b0();
    public static final c0 j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c0 f5117k = new b();
    public static final c0 l = new c();
    public static final c0 m = new d();
    public static final c0 n = new e();
    public static final c0 o = new f();
    public static final c0 p = new g();
    public static final c0 q = new h();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c0 f5118r = new i();
    public static final c0 s = new j();
    public static final c0 t = new l();
    public static final c0 u = new m();
    public static final c0 v = new n();
    public static final c0 w = new o();
    public static final c0 x = new p();
    public static final c0 y = new q();
    public static final c0 z = new r();
    public static final c0 A = new s();
    public static final c0 B = new t();

    public class a implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float fPow;
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                fPow = (float) Math.pow(f3, 4.0d);
                f2 = 0.5f;
            } else {
                fPow = ((float) Math.pow(f3 - 2.0f, 4.0d)) - 2.0f;
                f2 = -0.5f;
            }
            return fPow * f2;
        }
    }

    public class a0 implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) Math.pow(f, 4.0d);
        }
    }

    public class b implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (-((float) Math.cos(((double) f) * 1.5707963267948966d))) + 1.0f;
        }
    }

    public class b0 implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return -(((float) Math.pow(f - 1.0f, 4.0d)) - 1.0f);
        }
    }

    public class c implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) Math.sin(((double) f) * 1.5707963267948966d);
        }
    }

    public interface c0 extends TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        float getInterpolation(float f);
    }

    public class d implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (((float) Math.cos(((double) f) * 3.141592653589793d)) - 1.0f) * (-0.5f);
        }
    }

    public class e implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            return (float) Math.pow(2.0d, (f - 1.0f) * 10.0f);
        }
    }

    public class f implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (f + 1.0f) * (-10.0f)));
        }
    }

    public class g implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f * 2.0f;
            return (f2 < 1.0f ? (float) Math.pow(2.0d, (f2 - 1.0f) * 10.0f) : (-((float) Math.pow(2.0d, (f2 - 1.0f) * (-10.0f)))) + 2.0f) * 0.5f;
        }
    }

    public class h implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return -(((float) Math.sqrt(1.0f - (f * f))) - 1.0f);
        }
    }

    public class i implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (float) Math.sqrt(1.0f - (f2 * f2));
        }
    }

    public class j implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float fSqrt;
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                fSqrt = ((float) Math.sqrt(1.0f - (f3 * f3))) - 1.0f;
                f2 = -0.5f;
            } else {
                float f4 = f3 - 2.0f;
                fSqrt = ((float) Math.sqrt(1.0f - (f4 * f4))) + 1.0f;
                f2 = 0.5f;
            }
            return fSqrt * f2;
        }
    }

    public class k implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f;
        }
    }

    public class l implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f - 1.0f;
            return -(((float) Math.pow(2.0d, 10.0f * f2)) * ((float) Math.sin(((f2 - (0.047746483f * ((float) Math.asin(1.0d)))) * 6.2831855f) / 0.3f)));
        }
    }

    public class m implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (-10.0f) * f)) * ((float) Math.sin(((f - (0.047746483f * ((float) Math.asin(1.0d)))) * 6.2831855f) / 0.3f))) + 1.0f;
        }
    }

    public class n implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            float f2 = f * 2.0f;
            if (f2 == 2.0f) {
                return 1.0f;
            }
            float fAsin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f2 < 1.0f) {
                float f3 = f2 - 1.0f;
                return ((float) Math.pow(2.0d, 10.0f * f3)) * ((float) Math.sin(((f3 * 1.0f) - fAsin) * 6.2831855f * 2.2222223f)) * (-0.5f);
            }
            float f4 = f2 - 1.0f;
            return (((float) Math.pow(2.0d, (-10.0f) * f4)) * 0.5f * ((float) Math.sin(((f4 * 1.0f) - fAsin) * 6.2831855f * 2.2222223f))) + 1.0f;
        }
    }

    public class o implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f * f * ((f * 2.70158f) - 1.70158f);
        }
    }

    public class p implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * ((f2 * 2.70158f) + 1.70158f)) + 1.0f;
        }
    }

    public class q implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return f2 * f2 * ((3.5949094f * f2) - 2.5949094f) * 0.5f;
            }
            float f3 = f2 - 2.0f;
            return ((f3 * f3 * ((3.5949094f * f3) + 2.5949094f)) + 2.0f) * 0.5f;
        }
    }

    public class r implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return 1.0f - ca7.A.getInterpolation(1.0f - f);
        }
    }

    public class s implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f < 0.36363637f) {
                return 7.5625f * f * f;
            }
            if (f < 0.72727275f) {
                float f2 = f - 0.54545456f;
                return (7.5625f * f2 * f2) + 0.75f;
            }
            if (f < 0.90909094f) {
                float f3 = f - 0.8181818f;
                return (7.5625f * f3 * f3) + 0.9375f;
            }
            float f4 = f - 0.95454544f;
            return (7.5625f * f4 * f4) + 0.984375f;
        }
    }

    public class t implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f < 0.5f ? ca7.z.getInterpolation(f * 2.0f) * 0.5f : (ca7.A.getInterpolation((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    }

    public class u implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f * f;
        }
    }

    public class v implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (-f) * (f - 2.0f);
        }
    }

    public class w implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2;
            }
            float f3 = f2 - 1.0f;
            return ((f3 * (f3 - 2.0f)) - 1.0f) * (-0.5f);
        }
    }

    public class x implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) Math.pow(f, 3.0d);
        }
    }

    public class y implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return ((float) Math.pow(f - 1.0f, 3.0d)) + 1.0f;
        }
    }

    public class z implements c0 {
        @Override // ca7.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            return (f2 < 1.0f ? (float) Math.pow(f2, 3.0d) : ((float) Math.pow(f2 - 2.0f, 3.0d)) + 2.0f) * 0.5f;
        }
    }
}
