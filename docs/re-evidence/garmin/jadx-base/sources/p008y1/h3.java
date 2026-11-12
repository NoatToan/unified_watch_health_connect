package p008y1;

import a5.b;
import a5.j;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.p;
import g6.s;
import gl1.d;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;
import u1.k1;
import u1.r1;
import v13.c;
import v13.i;
import vb.h;
import xa2.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly1/h3;", "Ly1/n2;", "Ly1/e3;", "scrollableState", "Lu1/r1;", "overscrollEffect", "Ly1/e1;", "flingBehavior", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "", "reverseDirection", "La5/b;", "nestedScrollDispatcher", "Ly1/a2;", "onScrollChangedDispatcher", "Lkotlin/Function0;", "isScrollableNodeAttached", "<init>", "(Ly1/e3;Lu1/r1;Ly1/e1;Ly1/b2;ZLa5/b;Ly1/a2;Le23/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h3 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e3 f193254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r1 f193255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e1 f193256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b2 f193257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f193258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f193259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f193260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e23.a<Boolean> f193261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f193262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f193263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o2 f193264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f193265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f193266m;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/h3$a", "Ly1/y1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements y1 {
        public a() {
        }

        @Override // p008y1.y1
        public final long a(int i14, long j8) {
            h3 h3Var = h3.this;
            h3Var.f193263j = i14;
            r1 r1Var = h3Var.f193255b;
            return (r1Var == null || !(h3Var.f193254a.c() || h3Var.f193254a.e())) ? h3Var.e(h3Var.f193264k, j8, i14) : r1Var.b(h3Var.f193263j, j8, h3Var.f193266m);
        }

        @Override // p008y1.y1
        public final long b(int i14, long j8) {
            h3 h3Var = h3.this;
            return h3Var.e(h3Var.f193264k, j8, i14);
        }
    }

    public h3(e3 e3Var, r1 r1Var, e1 e1Var, b2 b2Var, boolean z14, b bVar, a2 a2Var, e23.a<Boolean> aVar) {
        this.f193254a = e3Var;
        this.f193255b = r1Var;
        this.f193256c = e1Var;
        this.f193257d = b2Var;
        this.f193258e = z14;
        this.f193259f = bVar;
        this.f193260g = a2Var;
        this.f193261h = aVar;
        j.f1233b.getClass();
        this.f193263j = j.f1234c;
        this.f193264k = t2.f193655b;
        this.f193265l = new a();
        this.f193266m = new g(this, 18);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p008y1.n2
    public final Object a(long j8, c cVar) {
        f3 f3Var;
        h3 h3Var;
        Throwable th3;
        q0 q0Var;
        if (cVar instanceof f3) {
            f3Var = (f3) cVar;
            int i14 = f3Var.f193205d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f3Var.f193205d = i14 - Integer.MIN_VALUE;
            } else {
                f3Var = new f3(this, cVar);
            }
        } else {
            f3Var = new f3(this, cVar);
        }
        Object obj = f3Var.f193203b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f3Var.f193205d;
        if (i15 != 0) {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q0Var = f3Var.f193202a;
            try {
                r.b(obj);
                h3Var = this;
                h3Var.f193262i = false;
                return s.a(q0Var.f105808a);
            } catch (Throwable th4) {
                th3 = th4;
                h3Var = this;
                h3Var.f193262i = false;
                throw th3;
            }
        }
        r.b(obj);
        q0 q0Var2 = new q0();
        q0Var2.f105808a = j8;
        this.f193262i = true;
        try {
            k1 k1Var = k1.Default;
            h3Var = this;
            try {
                g3 g3Var = new g3(h3Var, q0Var2, j8, null);
                f3Var.f193202a = q0Var2;
                f3Var.f193205d = 1;
                if (h(k1Var, g3Var, f3Var) == aVar) {
                    return aVar;
                }
                q0Var = q0Var2;
                h3Var.f193262i = false;
                return s.a(q0Var.f105808a);
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
                h3Var.f193262i = false;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
            h3Var = this;
        }
    }

    @Override // p008y1.n2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF193262i() {
        return this.f193262i;
    }

    @Override // p008y1.n2
    public final long c(long j8) {
        if (!this.f193254a.a()) {
            return j(f(this.f193254a.d(f(i(j8)))));
        }
        n4.c.f123541b.getClass();
        return 0L;
    }

    public final Object d(long j8, boolean z14, i iVar) {
        if (z14) {
            e1 e1Var = this.f193256c;
            y0 y0Var = t2.f193654a;
            if (e1Var instanceof q2) {
                return Unit.INSTANCE;
            }
        }
        long jB = s.b(0.0f, 0.0f, j8, this.f193257d == b2.Horizontal ? 1 : 2);
        i3 i3Var = new i3(this, null);
        r1 r1Var = this.f193255b;
        if (r1Var == null || !(this.f193254a.c() || this.f193254a.e())) {
            Object objInvoke = i3Var.invoke(s.a(jB), iVar);
            return objInvoke == u13.a.COROUTINE_SUSPENDED ? objInvoke : Unit.INSTANCE;
        }
        Object objC = r1Var.c(jB, i3Var, iVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    public final long e(o2 o2Var, long j8, int i14) {
        long jMo4onPreScrollOzD1aCk;
        a5.g gVar = this.f193259f.f1205a;
        a5.g gVar2 = null;
        if (gVar != null && gVar.getIsAttached()) {
            gVar2 = (a5.g) d.u(gVar);
        }
        if (gVar2 != null) {
            jMo4onPreScrollOzD1aCk = gVar2.mo4onPreScrollOzD1aCk(j8, i14);
        } else {
            n4.c.f123541b.getClass();
            jMo4onPreScrollOzD1aCk = 0;
        }
        long jI = n4.c.i(j8, jMo4onPreScrollOzD1aCk);
        long jG = g(j(o2Var.f(i(g(n4.c.b(0.0f, jI, this.f193257d == b2.Horizontal ? 1 : 2))))));
        this.f193260g.O0(jG);
        return n4.c.j(n4.c.j(jMo4onPreScrollOzD1aCk, jG), this.f193259f.b(i14, jG, n4.c.i(jI, jG)));
    }

    public final float f(float f14) {
        return this.f193258e ? f14 * (-1) : f14;
    }

    public final long g(long j8) {
        return this.f193258e ? n4.c.k(-1.0f, j8) : j8;
    }

    public final Object h(k1 k1Var, p pVar, c cVar) {
        Object objB = this.f193254a.b(k1Var, new j3(this, pVar, null), cVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    public final float i(long j8) {
        return Float.intBitsToFloat((int) (this.f193257d == b2.Horizontal ? j8 >> 32 : j8 & 4294967295L));
    }

    public final long j(float f14) {
        if (f14 == 0.0f) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        if (this.f193257d == b2.Horizontal) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            return jFloatToRawIntBits;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        n4.c.a aVar2 = n4.c.f123541b;
        return jFloatToRawIntBits2;
    }

    public final float k(long j8) {
        int i14 = (int) (4294967295L & j8);
        int i15 = (int) (j8 >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i14)), Math.abs(Float.intBitsToFloat(i15)));
        b2 b2Var = this.f193257d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (b2Var == b2.Vertical) {
                return Float.intBitsToFloat(i14);
            }
            return 0.0f;
        }
        if (b2Var == b2.Horizontal) {
            return Float.intBitsToFloat(i15);
        }
        return 0.0f;
    }
}
