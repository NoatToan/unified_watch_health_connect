package d80;

import android.text.TextUtils;
import c22.o;
import com.garmin.android.apps.connectmobile.s1;
import lj0.i;
import lj0.j;
import o53.m1;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class f<T extends s1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f58257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj0.g f58258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d80.b f58259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<T> f58260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f58261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f58262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f58263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f58264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f58265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f58266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f58267k;

    public class a extends g22.c<Void, Void> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f<T>.c f58268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f58269d;

        public a() {
        }

        @Override // g22.c
        public final Void b(Void[] voidArr) {
            f<T>.c cVar;
            Object objB;
            boolean zA = ((o) KoinJavaComponent.get(o.class)).a();
            f fVar = f.this;
            h hVar = fVar.f58263g;
            Class<T> cls = fVar.f58260d;
            d dVar = fVar.f58262f;
            g gVar = fVar.f58261e;
            if (hVar != null && (fVar.f58265i || (fVar.f58266j && !zA))) {
                String strA = hVar.a();
                this.f58269d = strA;
                if (!TextUtils.isEmpty(strA)) {
                    this.f58268c = new c(fVar, d80.b.a.CACHE);
                }
            }
            if (!zA && TextUtils.isEmpty(this.f58269d)) {
                this.f58268c = new c(fVar, lj0.b.f112951e, d80.b.a.GARMIN_CONNECT);
                return null;
            }
            m1 m1Var = this.f75549a;
            if (m1Var.isActive() && zA && TextUtils.isEmpty(this.f58269d)) {
                new j(fVar.f58264h, new e(this)).c(new i(fVar.f58258b, fVar.f58257a));
            }
            if (m1Var.isActive() && (cVar = this.f58268c) != null && cVar.f58279b == null && gVar != null && gVar != g.NO_PARSING) {
                h hVar2 = fVar.f58263g;
                if (hVar2 != null && cVar.f58280c == d80.b.a.GARMIN_CONNECT) {
                    hVar2.b(this.f58269d);
                }
                if (gVar == g.JSON_OBJECT) {
                    String str = this.f58269d;
                    dVar.getClass();
                    objB = d.c(cls, str);
                } else if (gVar == g.JSON_ARRAY) {
                    String str2 = this.f58269d;
                    dVar.getClass();
                    objB = d.b(cls, str2);
                } else {
                    objB = gVar == g.STRING ? this.f58269d : null;
                }
                if (objB == null) {
                    this.f58268c.f58279b = lj0.b.f112956j;
                }
                this.f58268c.f58278a = objB;
            }
            return null;
        }

        @Override // g22.c
        public final void d(Void r14) {
            f<T>.c cVar = this.f58268c;
            f fVar = f.this;
            if (cVar == null) {
                lj0.b bVar = lj0.b.f112956j;
                d80.b bVar2 = fVar.f58259c;
                if (bVar2 != null) {
                    bVar2.a(bVar);
                    return;
                }
                return;
            }
            lj0.b bVar3 = cVar.f58279b;
            if (bVar3 != null) {
                d80.b bVar4 = fVar.f58259c;
                if (bVar4 != null) {
                    bVar4.a(bVar3);
                    return;
                }
                return;
            }
            Object obj = cVar.f58278a;
            d80.b.a aVar = cVar.f58280c;
            d80.b bVar5 = fVar.f58259c;
            if (bVar5 != null) {
                bVar5.b(obj, aVar);
            }
        }
    }

    public static class b<T extends s1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f58271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final lj0.g f58272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<T> f58273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d80.b f58274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g f58275e = g.NO_PARSING;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public dm.a f58276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f58277g;

        public b(Object[] objArr, lj0.g gVar) {
            this.f58271a = objArr;
            this.f58272b = gVar;
        }

        public final f<T> a() {
            g gVar;
            Class<T> cls = this.f58273c;
            if (cls != null || ((gVar = this.f58275e) != g.JSON_ARRAY && gVar != g.JSON_OBJECT)) {
                return new f<>(this.f58271a, this.f58272b, cls, this.f58274d, this.f58275e, this.f58276f, this.f58277g);
            }
            org.apache.commons.lang3.e.w("Response object type must be set for parsing objects or list of objects");
            return null;
        }
    }

    private f(Object[] objArr, lj0.g gVar, Class<T> cls, d80.b bVar, g gVar2, h hVar, boolean z14, boolean z15, boolean z16) {
        this.f58257a = objArr;
        this.f58258b = gVar;
        this.f58259c = bVar;
        this.f58260d = cls;
        this.f58261e = gVar2;
        this.f58263g = hVar;
        this.f58265i = z15;
        this.f58264h = z14;
        this.f58266j = z16;
        this.f58262f = new d();
    }

    public final void a() {
        a aVar = this.f58267k;
        if (aVar != null) {
            aVar.a();
        }
        this.f58259c = null;
    }

    public final void b() {
        a aVar = new a();
        this.f58267k = aVar;
        aVar.c(new Void[0]);
    }

    public final boolean c() {
        a aVar = this.f58267k;
        if (aVar != null) {
            return aVar.f75549a.e();
        }
        return true;
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f58278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public lj0.b f58279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d80.b.a f58280c;

        public c(f fVar, d80.b.a aVar) {
            this.f58278a = null;
            this.f58280c = aVar;
            this.f58279b = null;
        }

        public c(f fVar, lj0.b bVar, d80.b.a aVar) {
            this.f58279b = bVar;
            this.f58280c = aVar;
            this.f58278a = null;
        }
    }

    private f(Class<T> cls) {
        this.f58264h = false;
        this.f58260d = cls;
        this.f58262f = null;
        this.f58263g = null;
    }

    public /* synthetic */ f(Object[] objArr, lj0.g gVar, Class cls, d80.b bVar, g gVar2, dm.a aVar, boolean z14) {
        this(objArr, gVar, cls, bVar, gVar2, aVar, false, z14, false);
    }
}
