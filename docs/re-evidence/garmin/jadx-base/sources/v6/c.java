package v6;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w6.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends o6.f {

    public static class a extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setAlpha(a(f14));
        }
    }

    public static class b extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float[] f175781g = new float[1];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.constraintlayout.widget.a f175782h;

        @Override // o6.f
        public final void b(androidx.constraintlayout.widget.a aVar) {
            this.f175782h = aVar;
        }

        @Override // v6.c
        public final void d(float f14, View view2) {
            float fA = a(f14);
            float[] fArr = this.f175781g;
            fArr[0] = fA;
            v6.a.b(this.f175782h, view2, fArr);
        }
    }

    /* JADX INFO: renamed from: v6.c$c, reason: collision with other inner class name */
    public static class C3280c extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setElevation(a(f14));
        }
    }

    public static class d extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
        }
    }

    public static class e extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f175783g = false;

        @Override // v6.c
        public final void d(float f14, View view2) {
            Method method;
            if (view2 instanceof q) {
                ((q) view2).setProgress(a(f14));
                return;
            }
            if (this.f175783g) {
                return;
            }
            try {
                method = view2.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f175783g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view2, Float.valueOf(a(f14)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    public static class f extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setRotation(a(f14));
        }
    }

    public static class g extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setRotationX(a(f14));
        }
    }

    public static class h extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setRotationY(a(f14));
        }
    }

    public static class i extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setScaleX(a(f14));
        }
    }

    public static class j extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setScaleY(a(f14));
        }
    }

    public static class k extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setTranslationX(a(f14));
        }
    }

    public static class l extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setTranslationY(a(f14));
        }
    }

    public static class m extends c {
        @Override // v6.c
        public final void d(float f14, View view2) {
            view2.setTranslationZ(a(f14));
        }
    }

    public abstract void d(float f14, View view2);
}
