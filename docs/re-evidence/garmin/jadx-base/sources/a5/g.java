package a5;

import g6.s;
import h4.r;
import h5.e2;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La5/g;", "Lh5/e2;", "La5/a;", "Lh4/r$c;", "connection", "La5/b;", "dispatcher", "<init>", "(La5/a;La5/b;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends r.c implements e2, a5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a5.a f1218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a5.b f1219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f1220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1221d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {113, 118}, m = "onPostFling-RZ2iAVY", v = 1)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f1224c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1226e;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f1224c = obj;
            this.f1226e |= Integer.MIN_VALUE;
            return g.this.mo1onPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {106, 107}, m = "onPreFling-QWom1Mo", v = 1)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1228b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1230d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f1228b = obj;
            this.f1230d |= Integer.MIN_VALUE;
            return g.this.mo3onPreFlingQWom1Mo(0L, this);
        }
    }

    public g(a5.a aVar, a5.b bVar) {
        this.f1218a = aVar;
        this.f1219b = bVar == null ? new a5.b() : bVar;
        this.f1221d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final b0 U1() {
        g gVar = getIsAttached() ? (g) gl1.d.u(this) : null;
        b0 b0VarU1 = gVar != null ? gVar.U1() : null;
        if (b0VarU1 != null && c0.g(b0VarU1)) {
            return b0VarU1;
        }
        b0 b0Var = this.f1219b.f1208d;
        if (b0Var != null) {
            return b0Var;
        }
        vb.h.z("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    @Override // h5.e2
    public final Object X() {
        return this.f1221d;
    }

    @Override // h4.r.c
    public final void onAttach() {
        a5.b bVar = this.f1219b;
        bVar.f1205a = this;
        bVar.f1206b = null;
        this.f1220c = null;
        bVar.f1207c = new h(this);
        this.f1219b.f1208d = getCoroutineScope();
    }

    @Override // h4.r.c
    public final void onDetach() {
        r0 r0Var = new r0();
        gl1.d.i0(this, new i(r0Var));
        g gVar = (g) ((e2) r0Var.f105810a);
        this.f1220c = gVar;
        a5.b bVar = this.f1219b;
        bVar.f1206b = gVar;
        if (bVar.f1205a == this) {
            bVar.f1205a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // a5.a
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo1onPostFlingRZ2iAVY(long j8, long j14, t13.d<? super s> dVar) {
        a aVar;
        long j15;
        long j16;
        long j17;
        g gVar;
        long j18;
        long j19;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f1226e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f1226e = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objMo1onPostFlingRZ2iAVY = aVar2.f1224c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f1226e;
        if (i15 == 0) {
            o13.r.b(objMo1onPostFlingRZ2iAVY);
            a5.a aVar4 = this.f1218a;
            aVar2.f1222a = j8;
            aVar2.f1223b = j14;
            aVar2.f1226e = 1;
            objMo1onPostFlingRZ2iAVY = aVar4.mo1onPostFlingRZ2iAVY(j8, j14, aVar2);
            if (objMo1onPostFlingRZ2iAVY != aVar3) {
                j15 = j8;
                j16 = j14;
            }
            return aVar3;
        }
        if (i15 == 1) {
            j16 = aVar2.f1223b;
            j15 = aVar2.f1222a;
            o13.r.b(objMo1onPostFlingRZ2iAVY);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j19 = aVar2.f1222a;
            o13.r.b(objMo1onPostFlingRZ2iAVY);
        }
        j18 = ((s) objMo1onPostFlingRZ2iAVY).f76027a;
        j17 = j19;
        return s.a(s.f(j17, j18));
        j17 = ((s) objMo1onPostFlingRZ2iAVY).f76027a;
        if (getIsAttached()) {
            gVar = null;
            if (getIsAttached() && getIsAttached()) {
                gVar = (g) gl1.d.u(this);
            }
        } else {
            gVar = this.f1220c;
        }
        if (gVar != null) {
            long jF = s.f(j15, j17);
            long jE = s.e(j16, j17);
            aVar2.f1222a = j17;
            aVar2.f1226e = 2;
            objMo1onPostFlingRZ2iAVY = gVar.mo1onPostFlingRZ2iAVY(jF, jE, aVar2);
            if (objMo1onPostFlingRZ2iAVY != aVar3) {
                j19 = j17;
                j18 = ((s) objMo1onPostFlingRZ2iAVY).f76027a;
                j17 = j19;
            }
            return aVar3;
        }
        s.f76026b.getClass();
        j18 = 0;
        return s.a(s.f(j17, j18));
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo2onPostScrollDzOQY0M(long j8, long j14, int i14) {
        long jMo2onPostScrollDzOQY0M;
        long jMo2onPostScrollDzOQY0M2 = this.f1218a.mo2onPostScrollDzOQY0M(j8, j14, i14);
        g gVar = null;
        if (getIsAttached() && getIsAttached()) {
            gVar = (g) gl1.d.u(this);
        }
        g gVar2 = gVar;
        if (gVar2 != null) {
            jMo2onPostScrollDzOQY0M = gVar2.mo2onPostScrollDzOQY0M(n4.c.j(j8, jMo2onPostScrollDzOQY0M2), n4.c.i(j14, jMo2onPostScrollDzOQY0M2), i14);
        } else {
            n4.c.f123541b.getClass();
            jMo2onPostScrollDzOQY0M = 0;
        }
        return n4.c.j(jMo2onPostScrollDzOQY0M2, jMo2onPostScrollDzOQY0M);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r11 == r1) goto L30;
     */
    @Override // a5.a
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3onPreFlingQWom1Mo(long j8, t13.d<? super s> dVar) {
        b bVar;
        long j14;
        long j15;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f1230d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f1230d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objMo3onPreFlingQWom1Mo = bVar.f1228b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f1230d;
        if (i15 != 0) {
            if (i15 == 1) {
                j8 = bVar.f1227a;
                o13.r.b(objMo3onPreFlingQWom1Mo);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j15 = bVar.f1227a;
                o13.r.b(objMo3onPreFlingQWom1Mo);
            }
            return s.a(s.f(j15, ((s) objMo3onPreFlingQWom1Mo).f76027a));
        }
        o13.r.b(objMo3onPreFlingQWom1Mo);
        g gVar = null;
        if (getIsAttached() && getIsAttached()) {
            gVar = (g) gl1.d.u(this);
        }
        if (gVar != null) {
            bVar.f1227a = j8;
            bVar.f1230d = 1;
            objMo3onPreFlingQWom1Mo = gVar.mo3onPreFlingQWom1Mo(j8, bVar);
        } else {
            s.f76026b.getClass();
            j14 = 0;
            long j16 = j14;
            long j17 = j8;
            j15 = j16;
            a5.a aVar2 = this.f1218a;
            long jE = s.e(j17, j15);
            bVar.f1227a = j15;
            bVar.f1230d = 2;
            objMo3onPreFlingQWom1Mo = aVar2.mo3onPreFlingQWom1Mo(jE, bVar);
        }
        return aVar;
        j14 = ((s) objMo3onPreFlingQWom1Mo).f76027a;
        long j18 = j14;
        long j19 = j8;
        j15 = j18;
        a5.a aVar3 = this.f1218a;
        long jE2 = s.e(j19, j15);
        bVar.f1227a = j15;
        bVar.f1230d = 2;
        objMo3onPreFlingQWom1Mo = aVar3.mo3onPreFlingQWom1Mo(jE2, bVar);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo4onPreScrollOzD1aCk(long j8, int i14) {
        long jMo4onPreScrollOzD1aCk;
        g gVar = null;
        if (getIsAttached() && getIsAttached()) {
            gVar = (g) gl1.d.u(this);
        }
        if (gVar != null) {
            jMo4onPreScrollOzD1aCk = gVar.mo4onPreScrollOzD1aCk(j8, i14);
        } else {
            n4.c.f123541b.getClass();
            jMo4onPreScrollOzD1aCk = 0;
        }
        return n4.c.j(jMo4onPreScrollOzD1aCk, this.f1218a.mo4onPreScrollOzD1aCk(n4.c.i(j8, jMo4onPreScrollOzD1aCk), i14));
    }
}
