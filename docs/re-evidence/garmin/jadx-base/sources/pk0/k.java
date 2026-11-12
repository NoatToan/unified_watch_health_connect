package pk0;

import c80.u;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.brand.BrandSelectionScreenKt$BrandSelectionScreen$1$1", f = "BrandSelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<String, Unit> f138242a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super String, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138242a = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f138242a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f138242a.invoke("");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120 A[LOOP:0: B:62:0x011a->B:64:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x014d  */
    /* JADX WARN: Code duplicated, block: B:87:0x019d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cc  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final u uVar, final o oVar, final String str, final e23.a<Unit> aVar, final e23.l<? super jk0.h, Unit> lVar, final e23.l<? super String, Unit> lVar2, p3.m mVar, final int i14) {
        u uVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        ArrayList arrayList;
        Iterator<E> it;
        uVar.getClass();
        oVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1131026951);
        int i15 = i14 | (o0VarE.k(uVar.ordinal()) ? 4 : 2) | (o0VarE.B(oVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = oVar.t4(uVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = oVar.t4(uVar);
                    o0VarE.K(objQ);
                }
            }
            i53.c cVar = (i53.c) objQ;
            if (cVar.isEmpty()) {
                o0VarE.C(405821180);
                boolean z15 = (i15 & 458752) == 131072;
                Object objQ2 = o0VarE.q();
                if (z15) {
                    objQ2 = new a(lVar2, null);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(lVar2, null);
                        o0VarE.K(objQ2);
                    }
                }
                l0.e((e23.p) objQ2, cVar, o0VarE);
                o0VarE.g0(false);
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new e23.p(uVar, oVar, str, aVar, lVar, lVar2, i14, i17) { // from class: pk0.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f138224a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u f138225b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ o f138226c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f138227d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.a f138228e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.l f138229f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ e23.l f138230g;

                    {
                        this.f138224a = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f138224a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                k.a(this.f138225b, this.f138226c, this.f138227d, this.f138228e, this.f138229f, this.f138230g, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                k.a(this.f138225b, this.f138226c, this.f138227d, this.f138228e, this.f138229f, this.f138230g, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                uVar2 = uVar;
                o0VarE.C(405912475);
                o0VarE.g0(false);
                boolean zB = o0VarE.B(cVar);
                Object objQ3 = o0VarE.q();
                if (zB) {
                    arrayList = new ArrayList(y.r(cVar, 10));
                    it = cVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((jk0.h) it.next()).f99254a);
                    }
                    objQ3 = i53.a.e(arrayList);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        arrayList = new ArrayList(y.r(cVar, 10));
                        it = cVar.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((jk0.h) it.next()).f99254a);
                        }
                        objQ3 = i53.a.e(arrayList);
                        o0VarE.K(objQ3);
                    }
                }
                i53.c cVar2 = (i53.c) objQ3;
                Object[] objArr = {uVar2};
                boolean z16 = (i15 & 896) == 256;
                Object objQ4 = o0VarE.q();
                if (z16) {
                    objQ4 = new a90.c(str, 9);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new a90.c(str, 9);
                        o0VarE.K(objQ4);
                    }
                }
                p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ4, o0VarE, 0);
                String strP = gl1.y.P(R.string.select_placeholder_brand, new Object[]{xy2.b.l(uVar2, o0VarE)}, o0VarE);
                String strP2 = gl1.y.P(R.string.search_placeholder_brands, new Object[]{xy2.b.l(uVar2, o0VarE)}, o0VarE);
                String str2 = (String) p1Var.getF182175a();
                boolean z17 = (i16 == 4) | ((i15 & 458752) == 131072);
                Object objQ5 = o0VarE.q();
                if (z17) {
                    objQ5 = new h(uVar2, lVar2, 0);
                    o0VarE.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new h(uVar2, lVar2, 0);
                        o0VarE.K(objQ5);
                    }
                }
                e23.p pVar2 = (e23.p) objQ5;
                boolean zR = o0VarE.r(cVar) | o0VarE.B(p1Var) | ((57344 & i15) == 16384);
                Object objQ6 = o0VarE.q();
                if (zR) {
                    objQ6 = new i(cVar, lVar, p1Var);
                    o0VarE.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new i(cVar, lVar, p1Var);
                        o0VarE.K(objQ6);
                    }
                }
                n.a(strP, strP2, cVar2, str2, pVar2, aVar, (e23.l) objQ6, o0VarE, (i15 << 6) & 458752);
                x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        uVar2 = uVar;
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            final u uVar3 = uVar2;
            pVar = new e23.p(uVar3, oVar, str, aVar, lVar, lVar2, i14, i18) { // from class: pk0.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f138224a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f138225b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o f138226c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f138227d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.a f138228e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.l f138229f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.l f138230g;

                {
                    this.f138224a = i18;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f138224a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            k.a(this.f138225b, this.f138226c, this.f138227d, this.f138228e, this.f138229f, this.f138230g, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            k.a(this.f138225b, this.f138226c, this.f138227d, this.f138228e, this.f138229f, this.f138230g, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
