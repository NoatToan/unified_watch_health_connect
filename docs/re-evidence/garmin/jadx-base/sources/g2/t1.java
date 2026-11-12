package g2;

import android.os.Trace;
import com.google.firebase.analytics.FirebaseAnalytics;
import f5.j2;
import g2.z0.a;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lg2/t1;", "", "Lg2/h0;", "itemContentFactory", "Lf5/j2;", "subcomposeLayoutState", "Lg2/x1;", "executor", "<init>", "(Lg2/h0;Lf5/j2;Lg2/x1;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f75217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f75218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f75219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75220d = true;

    public t1(h0 h0Var, j2 j2Var, x1 x1Var) {
        this.f75217a = h0Var;
        this.f75218b = j2Var;
        this.f75219c = x1Var;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0012B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBA\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"Lg2/t1$a;", "Lg2/z0$b;", "Lg2/v1;", "Lg2/z0$c;", "", FirebaseAnalytics.Param.INDEX, "Lg2/u1;", "prefetchMetrics", "Lg2/z1;", "priorityPrefetchScheduler", "Lkotlin/Function1;", "", "onItemPremeasured", "<init>", "(Lg2/t1;ILg2/u1;Lg2/z1;Le23/l;)V", "Lg6/a;", "constraints", "(Lg2/t1;IJLg2/u1;Lg2/z1;Le23/l;Lkotlin/jvm/internal/j;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a implements z0.b, v1, z0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f75221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u1 f75222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.l<z0.c, Unit> f75223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g6.a f75224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j2.b f75225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public j2.a f75226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f75227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f75228h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f75229i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f75230j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f75231k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public C1516a f75232l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f75233m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f75234n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f75235o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f75236p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f75237q;

        /* JADX INFO: renamed from: g2.t1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg2/t1$a$a;", "", "", "Lg2/z0;", "states", "<init>", "(Lg2/t1$a;Ljava/util/List;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class C1516a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<z0> f75239a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List<v1>[] f75240b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f75241c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f75242d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f75243e;

            public C1516a(List<z0> list) {
                this.f75239a = list;
                this.f75240b = new List[list.size()];
                if (list.isEmpty()) {
                    b2.e.a("NestedPrefetchController shouldn't be created with no states");
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i14, u1 u1Var, z1 z1Var, e23.l<? super z0.c, Unit> lVar) {
            this.f75221a = i14;
            this.f75222b = u1Var;
            this.f75223c = lVar;
            e53.p.a.f63127a.getClass();
            e53.o.f63125a.getClass();
            this.f75236p = e53.o.b();
        }

        @Override // g2.v1
        public final boolean a(w1 w1Var) {
            boolean zF;
            if (!t1.this.f75220d) {
                return false;
            }
            if (this.f75233m) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zF = f(w1Var);
                    Trace.endSection();
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            } else {
                zF = f(w1Var);
            }
            i6.a.a(-1L, "compose:lazy:prefetch:execute:item");
            return zF;
        }

        @Override // g2.z0.c
        public final int b() {
            j2.b bVar = this.f75225e;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }

        @Override // g2.z0.c
        public final long c(int i14) {
            j2.b bVar = this.f75225e;
            if (bVar != null) {
                return bVar.c(i14);
            }
            g6.m.f76012b.getClass();
            return 0L;
        }

        @Override // g2.z0.b
        public final void cancel() {
            if (this.f75228h) {
                return;
            }
            this.f75228h = true;
            e();
        }

        @Override // g2.z0.b
        public final void d() {
            this.f75233m = true;
        }

        public final void e() {
            j2.a aVar = this.f75226f;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f75226f = null;
            j2.b bVar = this.f75225e;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f75225e = null;
            this.f75232l = null;
        }

        /* JADX WARN: Code duplicated, block: B:124:0x0239  */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r9v12 */
        public final boolean f(w1 w1Var) {
            g6.a aVar;
            ?? r14;
            List<v1> list;
            int i14 = this.f75221a;
            long j8 = i14;
            i6.a.a(j8, "compose:lazy:prefetch:execute:item");
            t1 t1Var = t1.this;
            i0 i0VarInvoke = t1Var.f75217a.f75125b.invoke();
            if (!this.f75228h) {
                int itemCount = i0VarInvoke.getItemCount();
                if (i14 >= 0 && i14 < itemCount) {
                    Object key = i0VarInvoke.getKey(i14);
                    Object obj = this.f75230j;
                    if (obj != null && !key.equals(obj)) {
                        e();
                        return false;
                    }
                    Object objF = i0VarInvoke.f(i14);
                    u1 u1Var = this.f75222b;
                    b bVar = u1Var.f75249c;
                    if (u1Var.f75248b != objF || bVar == null) {
                        p1.t0<Object, b> t0Var = u1Var.f75247a;
                        b bVarD = t0Var.d(objF);
                        if (bVarD == null) {
                            bVarD = new b();
                            t0Var.m(objF, bVarD);
                        }
                        bVar = bVarD;
                        u1Var.f75248b = objF;
                        u1Var.f75249c = bVar;
                    }
                    g();
                    long jA = w1Var.a();
                    this.f75234n = jA;
                    e53.p.a.f63127a.getClass();
                    e53.o.f63125a.getClass();
                    this.f75236p = e53.o.b();
                    this.f75235o = 0L;
                    i6.a.a(jA, "compose:lazy:prefetch:available_time_nanos");
                    if (!g()) {
                        boolean z14 = u1.g0.f167497d;
                        long j14 = this.f75234n;
                        if (z14) {
                            if (i(j14, bVar.f75030b + bVar.f75031c)) {
                                Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    h(key, objF, bVar);
                                    Unit unit = Unit.INSTANCE;
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        } else if (i(j14, bVar.f75029a)) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                if (this.f75225e != null) {
                                    b2.e.a("Request was already composed!");
                                }
                                e23.p<p3.m, Integer, Unit> pVarA = t1Var.f75217a.a(i14, key, objF);
                                this.f75230j = key;
                                f5.q0 q0VarA = t1Var.f75218b.a();
                                q0VarA.l(key, pVarA, false);
                                this.f75225e = q0VarA.f(key);
                                this.f75229i = true;
                                Unit unit2 = Unit.INSTANCE;
                                Trace.endSection();
                                j();
                                bVar.f75029a = b.a(this.f75235o, bVar.f75029a);
                            } catch (Throwable th4) {
                                Trace.endSection();
                                throw th4;
                            }
                        }
                        if (!g()) {
                            return true;
                        }
                    }
                    if (this.f75226f != null) {
                        if (!i(this.f75234n, bVar.f75032d)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            j2.a aVar2 = this.f75226f;
                            if (aVar2 == null) {
                                throw new IllegalArgumentException("Nothing to apply!");
                            }
                            this.f75225e = aVar2.apply();
                            this.f75226f = null;
                            this.f75229i = true;
                            Unit unit3 = Unit.INSTANCE;
                            Trace.endSection();
                            j();
                            bVar.f75032d = b.a(this.f75235o, bVar.f75032d);
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                    if (!this.f75231k) {
                        if (this.f75234n <= r13) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            j2.b bVar2 = this.f75225e;
                            if (bVar2 != null) {
                                p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                                bVar2.e(new c2.s0(r0Var, 5));
                                List list2 = (List) r0Var.f105810a;
                                C1516a c1516a = list2 != null ? new C1516a(list2) : null;
                                this.f75232l = c1516a;
                                this.f75231k = true;
                                Unit unit4 = Unit.INSTANCE;
                                Trace.endSection();
                            } else {
                                b2.e.b("Should precompose before resolving nested prefetch states");
                                o2.c.f();
                            }
                            this.f75232l = c1516a;
                            this.f75231k = true;
                            Unit unit5 = Unit.INSTANCE;
                            Trace.endSection();
                        } catch (Throwable th6) {
                            Trace.endSection();
                            throw th6;
                        }
                    }
                    C1516a c1516a2 = this.f75232l;
                    if (c1516a2 != null) {
                        int i15 = bVar.f75034f;
                        boolean z15 = this.f75233m;
                        List<v1>[] listArr = c1516a2.f75240b;
                        int i16 = c1516a2.f75241c;
                        List<z0> list3 = c1516a2.f75239a;
                        if (i16 < list3.size()) {
                            if (a.this.f75228h) {
                                b2.e.c("Should not execute nested prefetch on canceled request");
                            }
                            Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                            try {
                                int size = list3.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    list3.get(i17).f75316e = i15;
                                }
                                Unit unit6 = Unit.INSTANCE;
                                Trace.endSection();
                                Trace.beginSection("compose:lazy:prefetch:nested");
                                while (c1516a2.f75241c < list3.size()) {
                                    try {
                                        if (listArr[c1516a2.f75241c] == null) {
                                            if (w1Var.a() <= r13) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i18 = c1516a2.f75241c;
                                            z0 z0Var = list3.get(i18);
                                            e23.l<? super r1, Unit> lVar = z0Var.f75313b;
                                            if (lVar == null) {
                                                list = p13.j0.f134944a;
                                            } else {
                                                z0.a aVar3 = z0Var.new a(z0Var.f75316e);
                                                lVar.invoke(aVar3);
                                                ArrayList arrayList = aVar3.f75320b;
                                                z0Var.f75318g = arrayList.size();
                                                list = arrayList;
                                            }
                                            listArr[i18] = list;
                                        }
                                        List<v1> list4 = listArr[c1516a2.f75241c];
                                        list4.getClass();
                                        while (c1516a2.f75242d < list4.size()) {
                                            v1 v1Var = list4.get(c1516a2.f75242d);
                                            if (z15) {
                                                a aVar4 = v1Var instanceof a ? (a) v1Var : null;
                                                if (aVar4 != null) {
                                                    r14 = 1;
                                                    aVar4.f75233m = true;
                                                } else {
                                                    r14 = 1;
                                                }
                                            } else {
                                                r14 = 1;
                                            }
                                            c1516a2.f75243e = r14;
                                            if (v1Var.a(w1Var)) {
                                                Trace.endSection();
                                                return r14;
                                            }
                                            c1516a2.f75242d += r14;
                                        }
                                        c1516a2.f75242d = 0;
                                        c1516a2.f75241c++;
                                    } catch (Throwable th7) {
                                        Trace.endSection();
                                        throw th7;
                                    }
                                }
                                Unit unit7 = Unit.INSTANCE;
                                Trace.endSection();
                            } catch (Throwable th8) {
                                Trace.endSection();
                                throw th8;
                            }
                        }
                    }
                    C1516a c1516a3 = this.f75232l;
                    if (c1516a3 != null && c1516a3.f75243e) {
                        j();
                        i6.a.a(j8, "compose:lazy:prefetch:execute:item");
                        C1516a c1516a4 = this.f75232l;
                        if (c1516a4 != null) {
                            c1516a4.f75243e = false;
                        }
                    }
                    if (!this.f75227g && (aVar = this.f75224d) != null) {
                        if (!i(this.f75234n, bVar.f75033e)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            long j15 = aVar.f75988a;
                            if (this.f75228h) {
                                b2.e.a("Callers should check whether the request is still valid before calling performMeasure()");
                            }
                            if (this.f75227g) {
                                b2.e.a("Request was already measured!");
                            }
                            this.f75227g = true;
                            j2.b bVar3 = this.f75225e;
                            if (bVar3 != null) {
                                int iB = bVar3.b();
                                for (int i19 = 0; i19 < iB; i19++) {
                                    bVar3.d(i19, j15);
                                }
                            } else {
                                b2.e.b("performComposition() must be called before performMeasure()");
                                o2.c.f();
                            }
                            Unit unit8 = Unit.INSTANCE;
                            Trace.endSection();
                            j();
                            bVar.f75033e = b.a(this.f75235o, bVar.f75033e);
                            e23.l<z0.c, Unit> lVar2 = this.f75223c;
                            if (lVar2 != null) {
                                lVar2.invoke(this);
                            }
                        } catch (Throwable th9) {
                            Trace.endSection();
                            throw th9;
                        }
                    }
                    C1516a c1516a5 = this.f75232l;
                    if (!this.f75227g || !this.f75231k || c1516a5 == null) {
                        return false;
                    }
                    List<z0> list5 = c1516a5.f75239a;
                    int size2 = list5.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i24 = 0; i24 < size2; i24++) {
                        iMin = Math.min(iMin, list5.get(i24).f75317f);
                    }
                    int i25 = iMin == Integer.MAX_VALUE ? 0 : iMin;
                    int i26 = bVar.f75034f;
                    bVar.f75034f = i26 == -1 ? i25 : ((i26 * 3) + i25) / 4;
                    int size3 = list5.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i27 = 0; i27 < size3; i27++) {
                        iMin2 = Math.min(iMin2, list5.get(i27).f75318g);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 >= i25) {
                        return false;
                    }
                    bVar.f75033e = 0L;
                    return false;
                }
            }
            e();
            return false;
        }

        public final boolean g() {
            j2.a aVar;
            return this.f75229i || ((aVar = this.f75226f) != null && aVar.isComplete());
        }

        public final void h(Object obj, Object obj2, b bVar) {
            j2.a u0Var;
            j2.a aVar = this.f75226f;
            if (aVar == null) {
                t1 t1Var = t1.this;
                e23.p<p3.m, Integer, Unit> pVarA = t1Var.f75217a.a(this.f75221a, obj, obj2);
                f5.q0 q0VarA = t1Var.f75218b.a();
                if (q0VarA.f69023a.isAttached()) {
                    q0VarA.l(obj, pVarA, true);
                    u0Var = new f5.u0(q0VarA, obj);
                } else {
                    u0Var = new f5.t0(q0VarA, obj);
                }
                aVar = u0Var;
                this.f75226f = aVar;
                this.f75230j = obj;
            }
            this.f75237q = false;
            while (!aVar.isComplete() && !this.f75237q) {
                aVar.a(new com.google.android.exoplayer2.analytics.q(20, this, bVar));
            }
            j();
            boolean z14 = this.f75237q;
            long j8 = this.f75235o;
            if (z14) {
                bVar.f75031c = b.a(j8, bVar.f75031c);
            } else {
                bVar.f75030b = b.a(j8, bVar.f75030b);
            }
        }

        public final boolean i(long j8, long j14) {
            if (this.f75233m) {
                j14 = 0;
            }
            return j8 > j14;
        }

        public final void j() {
            e53.p.a.f63127a.getClass();
            e53.o.f63125a.getClass();
            long jB = e53.o.b();
            long jC = e53.p.a.C1330a.c(jB, this.f75236p);
            long j8 = jC >> 1;
            e53.c.a aVar = e53.c.f63094b;
            if ((((int) jC) & 1) != 0) {
                if (j8 > 9223372036854L) {
                    j8 = Long.MAX_VALUE;
                } else {
                    j8 = j8 < -9223372036854L ? Long.MIN_VALUE : j8 * ((long) 1000000);
                }
            }
            this.f75235o = j8;
            long j14 = this.f75234n - j8;
            this.f75234n = j14;
            this.f75236p = jB;
            i6.a.a(j14, "compose:lazy:prefetch:available_time_nanos");
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("HandleAndRequestImpl { index = ");
            sb3.append(this.f75221a);
            sb3.append(", constraints = ");
            sb3.append(this.f75224d);
            sb3.append(", isComposed = ");
            sb3.append(g());
            sb3.append(", isMeasured = ");
            sb3.append(this.f75227g);
            sb3.append(", isCanceled = ");
            return hb.a.k(sb3, this.f75228h, " }");
        }

        public /* synthetic */ a(t1 t1Var, int i14, long j8, u1 u1Var, z1 z1Var, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
            this(t1Var, i14, j8, u1Var, z1Var, lVar);
        }

        private a(t1 t1Var, int i14, long j8, u1 u1Var, z1 z1Var, e23.l<? super z0.c, Unit> lVar) {
            this(i14, u1Var, z1Var, lVar);
            this.f75224d = g6.a.a(j8);
        }
    }
}
