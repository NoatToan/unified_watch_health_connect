package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.dynamicanimation.animation.b;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends b<T>> implements androidx.dynamicanimation.animation.a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f6989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k f6990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l f6991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m f6992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n f6993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f6994r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.dynamicanimation.animation.c f6999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f7001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<q> f7005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<r> f7006l;

    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getY();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setY(f14);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.b$b, reason: collision with other inner class name */
    public static class C0097b extends s {
        public C0097b(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            return view2.getZ();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.setZ(f14);
        }
    }

    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setAlpha(f14);
        }
    }

    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setScrollX((int) f14);
        }
    }

    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setScrollY((int) f14);
        }
    }

    public class f extends androidx.dynamicanimation.animation.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.dynamicanimation.animation.d f7007a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar, String str, androidx.dynamicanimation.animation.d dVar) {
            super(str);
            this.f7007a = dVar;
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(Object obj) {
            return this.f7007a.f7011a;
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(Object obj, float f14) {
            this.f7007a.f7011a = f14;
        }
    }

    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setTranslationX(f14);
        }
    }

    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setTranslationY(f14);
        }
    }

    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            return view2.getTranslationZ();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.setTranslationZ(f14);
        }
    }

    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setScaleX(f14);
        }
    }

    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setScaleY(f14);
        }
    }

    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setRotation(f14);
        }
    }

    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setRotationX(f14);
        }
    }

    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setRotationY(f14);
        }
    }

    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(View view2) {
            return view2.getX();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(View view2, float f14) {
            view2.setX(f14);
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f7008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f7009b;
    }

    public interface q {
        void a(float f14);
    }

    public interface r {
        void a(float f14);
    }

    static {
        new g("translationX");
        new h("translationY");
        new i("translationZ");
        f6989m = new j("scaleX");
        f6990n = new k("scaleY");
        f6991o = new l("rotation");
        f6992p = new m("rotationX");
        f6993q = new n("rotationY");
        new o("x");
        new a(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE);
        new C0097b("z");
        f6994r = new c("alpha");
        new d("scrollX");
        new e("scrollY");
    }

    public <K> b(K k14, androidx.dynamicanimation.animation.c<K> cVar) {
        this.f6995a = 0.0f;
        this.f6996b = Float.MAX_VALUE;
        this.f6997c = false;
        this.f7000f = false;
        this.f7001g = Float.MAX_VALUE;
        this.f7002h = -3.4028235E38f;
        this.f7003i = 0L;
        this.f7005k = new ArrayList<>();
        this.f7006l = new ArrayList<>();
        this.f6998d = k14;
        this.f6999e = cVar;
        if (cVar == f6991o || cVar == f6992p || cVar == f6993q) {
            this.f7004j = 0.1f;
            return;
        }
        if (cVar == f6994r) {
            this.f7004j = 0.00390625f;
        } else if (cVar == f6989m || cVar == f6990n) {
            this.f7004j = 0.00390625f;
        } else {
            this.f7004j = 1.0f;
        }
    }

    @Override // androidx.dynamicanimation.animation.a.b
    public final boolean a(long j8) {
        ArrayList<q> arrayList;
        long j14 = this.f7003i;
        int i14 = 0;
        if (j14 == 0) {
            this.f7003i = j8;
            b(this.f6996b);
            return false;
        }
        this.f7003i = j8;
        boolean zC = c(j8 - j14);
        float fMin = Math.min(this.f6996b, this.f7001g);
        this.f6996b = fMin;
        float fMax = Math.max(fMin, this.f7002h);
        this.f6996b = fMax;
        b(fMax);
        if (zC) {
            this.f7000f = false;
            ThreadLocal<androidx.dynamicanimation.animation.a> threadLocal = androidx.dynamicanimation.animation.a.f6978f;
            if (threadLocal.get() == null) {
                threadLocal.set(new androidx.dynamicanimation.animation.a());
            }
            androidx.dynamicanimation.animation.a aVar = threadLocal.get();
            aVar.f6979a.remove(this);
            ArrayList<androidx.dynamicanimation.animation.a.b> arrayList2 = aVar.f6980b;
            int iIndexOf = arrayList2.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList2.set(iIndexOf, null);
                aVar.f6983e = true;
            }
            this.f7003i = 0L;
            this.f6997c = false;
            while (true) {
                arrayList = this.f7005k;
                if (i14 >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i14) != null) {
                    arrayList.get(i14).a(this.f6996b);
                }
                i14++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
        return zC;
    }

    public final void b(float f14) {
        ArrayList<r> arrayList;
        this.f6999e.setValue(this.f6998d, f14);
        int i14 = 0;
        while (true) {
            arrayList = this.f7006l;
            if (i14 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i14) != null) {
                arrayList.get(i14).a(this.f6996b);
            }
            i14++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public abstract boolean c(long j8);

    public static abstract class s extends androidx.dynamicanimation.animation.c<View> {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    public b(androidx.dynamicanimation.animation.d dVar) {
        this.f6995a = 0.0f;
        this.f6996b = Float.MAX_VALUE;
        this.f6997c = false;
        this.f7000f = false;
        this.f7001g = Float.MAX_VALUE;
        this.f7002h = -Float.MAX_VALUE;
        this.f7003i = 0L;
        this.f7005k = new ArrayList<>();
        this.f7006l = new ArrayList<>();
        this.f6998d = null;
        this.f6999e = new f(this, "FloatValueHolder", dVar);
        this.f7004j = 1.0f;
    }
}
