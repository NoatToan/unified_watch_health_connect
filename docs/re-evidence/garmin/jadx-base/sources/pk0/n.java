package pk0;

import c.w;
import c2.n0;
import c2.n3;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.f0;
import e2.i0;
import e2.k0;
import i3.mh;
import java.util.List;
import o53.b0;
import o72.h3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import p40.q0;
import s5.x0;
import uk0.u;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.brand.GearStringSelectionScreenKt$GearStringSelectionScreen$1$1", f = "GearStringSelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f138246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f138247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138246a = p1Var;
            this.f138247b = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f138246a, this.f138247b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f138246a.getF182175a().booleanValue()) {
                m4.b0.a(this.f138247b);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<String, Unit> f138248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f138249b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super String, Unit> lVar, r rVar) {
            this.f138248a = lVar;
            this.f138249b = rVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f138248a.invoke(((r.b) this.f138249b).f138268a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f138250a = new c();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f138251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f138252b;

        public d(e23.l lVar, List list) {
            this.f138251a = lVar;
            this.f138252b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f138251a.invoke(this.f138252b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f138253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f138254b;

        public e(e23.l lVar, List list) {
            this.f138253a = lVar;
            this.f138254b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f138253a.invoke(this.f138254b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f138255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f138256b;

        public f(List list, e23.l lVar) {
            this.f138255a = list;
            this.f138256b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0092  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                r rVar = (r) this.f138255a.get(iIntValue);
                mVar2.C(825479981);
                if (rVar instanceof r.a) {
                    mVar2.C(825517118);
                    n.b(((r.a) rVar).f138266a, mVar2, 0);
                    mVar2.f();
                } else {
                    if (!(rVar instanceof r.b)) {
                        throw n23.j.m(mVar2, -389013610);
                    }
                    mVar2.C(825652402);
                    r.b bVar = (r.b) rVar;
                    String str = bVar.f138268a;
                    boolean z14 = bVar.f138269b;
                    e23.l lVar = this.f138256b;
                    boolean zB = mVar2.B(lVar) | mVar2.r(rVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new b(lVar, rVar);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b(lVar, rVar);
                            mVar2.K(objQ);
                        }
                    }
                    u.c(0, (e23.a) objQ, str, mVar2, z14);
                    mVar2.f();
                }
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, String str2, i53.c<String> cVar, String str3, e23.p<? super f0, ? super String, Unit> pVar, e23.a<Unit> aVar, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        String str4;
        e23.p<? super f0, ? super String, Unit> pVar2;
        e23.a<Unit> aVar2;
        e23.l<? super String, Unit> lVar2;
        str.getClass();
        str2.getClass();
        cVar.getClass();
        pVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1592252726);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            str4 = str2;
            i15 |= o0VarE.B(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            pVar2 = pVar;
            i15 |= o0VarE.r(pVar2) ? 16384 : 8192;
        } else {
            pVar2 = pVar;
        }
        if ((196608 & i14) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        } else {
            aVar2 = aVar;
        }
        if ((1572864 & i14) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar2 = lVar;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new p40.f(29);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new m(0);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ3;
            T f182175a = p1Var.getF182175a();
            boolean zB = o0VarE.B(p1Var);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new a(p1Var, b0Var, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, f182175a, o0VarE);
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.f(new q0(p1Var, p1Var2, 1));
                o0VarE.K(objQ5);
            }
            x3 x3Var = (x3) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.f(new nw0.p(cVar, 25, x3Var, p1Var2));
                o0VarE.K(objQ6);
            }
            x3 x3Var2 = (x3) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p0.f(new nw0.p(x3Var2, 26, str3, x3Var));
                o0VarE.K(objQ7);
            }
            x3 x3Var3 = (x3) objQ7;
            boolean zB2 = o0VarE.B(p1Var) | o0VarE.B(p1Var2);
            Object objQ8 = o0VarE.q();
            if (zB2 || objQ8 == c2565a) {
                objQ8 = new q0(p1Var, p1Var2, 2);
                o0VarE.K(objQ8);
            }
            e23.a aVar3 = (e23.a) objQ8;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zB3 = o0VarE.B(aVar3);
            Object objQ9 = o0VarE.q();
            if (zB3 || objQ9 == c2565a) {
                objQ9 = new pf0.j(aVar3, 3);
                o0VarE.K(objQ9);
            }
            w.a(0, 0, (e23.a) objQ9, o0VarE, zBooleanValue);
            z3.e eVarC = z3.f.c(1627559249, new b21.l0((Object) p1Var, (Object) aVar3, str, (e23.a) aVar2, (Object) b0Var, (Object) p1Var2, (Object) str4, 24), o0VarE);
            n0 n0Var = n3.f22788a;
            z02.d.a(false, eVarC, null, null, new n0(0, 0, 0, 0), z3.f.c(-293453363, new b21.l0(i0VarA, lVar2, pVar2, p1Var2, x3Var, x3Var2, x3Var3, 25), o0VarE), o0VarE, 196656, 13);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(str, str2, cVar, str3, pVar, aVar, lVar, i14);
        }
    }

    public static final void b(String str, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1800382850);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strG = sn.a.g(str);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            o0Var = o0VarE;
            mh.c(strG, c2.l.z(rVarF, f14, eVar.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h3(str, i14, 7);
        }
    }
}
