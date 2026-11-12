package uy0;

import c22.s3;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetMoreMenuItemsUseCase$invoke$2", f = "GetMoreMenuItemsUseCase.kt", l = {67, 191}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f173342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.model.g f173343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f173344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f173345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f173346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f173347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f173348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f173349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f173350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f173351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<String> f173352k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, List<String> list, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f173351j = yVar;
        this.f173352k = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f173351j, this.f173352k, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0212  */
    /* JADX WARN: Code duplicated, block: B:118:0x023a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0244 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0246  */
    /* JADX WARN: Code duplicated, block: B:122:0x024c  */
    /* JADX WARN: Code duplicated, block: B:123:0x024e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0234 A[SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0;
        int i14;
        boolean zA0;
        boolean zK;
        boolean zR0;
        boolean zE0;
        List list;
        boolean z14;
        com.garmin.android.apps.connectmobile.userprofile.model.g gVar;
        List list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        com.garmin.android.apps.connectmobile.navigation.more.b lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f173350i;
        y yVar = this.f173351j;
        if (i15 == 0) {
            o13.r.b(obj);
            ty0.b[] bVarArr = ty0.b.f166892l3.f166941g;
            if (bVarArr == null) {
                return p13.j0.f134944a;
            }
            ArrayList arrayListL0 = p13.u.l0(bVarArr);
            f12.l lVar2 = yVar.f173357a;
            com.garmin.android.apps.connectmobile.b1 b1Var = yVar.f173358b;
            gVarW0 = lVar2.W0();
            i14 = (!s3.b() || gVarW0 == null) ? 0 : 1;
            zA0 = b1Var.a0();
            zK = b1Var.K();
            zR0 = b1Var.r0();
            boolean zX0 = b1Var.x0();
            zE0 = b1Var.E0();
            if (i14 == 0) {
                arrayListL0.remove(ty0.b.R2);
            }
            zd0.j1 j1Var = yVar.f173360d;
            this.f173342a = arrayListL0;
            this.f173343b = gVarW0;
            this.f173344c = i14;
            this.f173345d = zA0;
            this.f173346e = zK;
            this.f173347f = zR0;
            this.f173348g = zX0;
            this.f173349h = zE0;
            this.f173350i = 1;
            Object objI = j1Var.i(this);
            if (objI != aVar) {
                list = arrayListL0;
                obj = objI;
                z14 = zX0;
            }
            return aVar;
        }
        if (i15 == 1) {
            boolean z15 = this.f173349h;
            z14 = this.f173348g;
            boolean z16 = this.f173347f;
            zK = this.f173346e;
            zA0 = this.f173345d;
            i14 = this.f173344c;
            com.garmin.android.apps.connectmobile.userprofile.model.g gVar2 = this.f173343b;
            list = this.f173342a;
            o13.r.b(obj);
            zE0 = z15;
            gVarW0 = gVar2;
            zR0 = z16;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = this.f173343b;
            list2 = this.f173342a;
            o13.r.b(obj);
        }
        if (((Boolean) obj).booleanValue() || !bo1.a.a().c().f0()) {
            list2.remove(ty0.b.O1);
        }
        arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (!p13.h0.R(this.f173352k, ((ty0.b) obj2).f166942h)) {
                arrayList.add(obj2);
            }
        }
        List<ty0.b> listA = ty0.c.a(arrayList);
        arrayList2 = new ArrayList();
        for (ty0.b bVar : listA) {
            if (bVar == ty0.b.R2) {
                lVar = new com.garmin.android.apps.connectmobile.navigation.more.b.l(bVar);
            } else if (gVar != null) {
                lVar = new com.garmin.android.apps.connectmobile.navigation.more.b.f(bVar, gVar);
            } else {
                lVar = null;
            }
            if (lVar != null) {
                arrayList2.add(lVar);
            }
        }
        return arrayList2;
        c80.s sVar = (c80.s) obj;
        if (!(sVar instanceof c80.s.a) && !(sVar instanceof c80.s.b)) {
            list.remove(ty0.b.F1);
        }
        if (zA0 || zK || z14 || !zR0) {
            list.remove(ty0.b.T1);
            list.remove(ty0.b.U1);
        } else if (yVar.f173359c.invoke().booleanValue()) {
            list.remove(ty0.b.T1);
        } else {
            list.remove(ty0.b.U1);
        }
        if (!zA0 && !zK && !z14 && !zE0) {
            list.remove(ty0.b.V1);
        }
        com.garmin.android.apps.connectmobile.b1 b1Var2 = yVar.f173358b;
        com.garmin.android.apps.connectmobile.b1 b1Var3 = yVar.f173358b;
        if (!b1Var2.v0()) {
            list.remove(ty0.b.f166855a2);
        }
        if (!b1Var3.S()) {
            list.remove(ty0.b.H1);
        }
        if (!b1Var3.R0()) {
            list.remove(ty0.b.Z1);
        }
        if (!b1Var3.J()) {
            list.remove(ty0.b.I1);
        }
        if (!b1Var3.R()) {
            list.remove(ty0.b.R0);
        }
        if (b1Var3.P0()) {
            list.remove(ty0.b.f166878i1);
        } else {
            list.remove(ty0.b.f166881j1);
        }
        if (!b1Var3.L0()) {
            list.remove(ty0.b.Y1);
        }
        if (!b1Var3.L0()) {
            list.remove(ty0.b.W1);
            list.remove(ty0.b.X1);
            list.remove(ty0.b.Y1);
        } else if (!b1Var3.s0()) {
            list.remove(ty0.b.W1);
        }
        if (b1Var3.z0()) {
            list.remove(ty0.b.G1);
            list.remove(ty0.b.J1);
            list.remove(ty0.b.N1);
            list.remove(ty0.b.R1);
        }
        if (!b1Var3.f0()) {
            list.remove(ty0.b.f166878i1);
            list.remove(ty0.b.f166881j1);
        }
        if (!b1Var3.f0()) {
            list.remove(ty0.b.f166898n1);
        }
        if (!b1Var3.S0()) {
            list.remove(ty0.b.K1);
        }
        if (!b1Var3.m0()) {
            list.remove(ty0.b.L1);
        }
        if (!b1Var3.U()) {
            list.remove(ty0.b.S1);
        }
        if (!b1Var3.F0()) {
            list.remove(ty0.b.H1);
        }
        if (!b1Var3.F0()) {
            list.remove(ty0.b.D1);
        }
        zd0.j1 j1Var2 = yVar.f173360d;
        c80.q qVar = c80.q.ADVANCED_REPORTING;
        this.f173342a = list;
        this.f173343b = gVarW0;
        this.f173344c = i14;
        this.f173345d = zA0;
        this.f173346e = zK;
        this.f173347f = zR0;
        this.f173348g = z14;
        this.f173349h = zE0;
        this.f173350i = 2;
        obj = j1Var2.l(qVar, this);
        if (obj != aVar) {
            gVar = gVarW0;
            list2 = list;
            if (((Boolean) obj).booleanValue()) {
                list2.remove(ty0.b.O1);
            } else {
                list2.remove(ty0.b.O1);
            }
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                if (!p13.h0.R(this.f173352k, ((ty0.b) obj2).f166942h)) {
                    arrayList.add(obj2);
                }
            }
            List<ty0.b> listA2 = ty0.c.a(arrayList);
            arrayList2 = new ArrayList();
            while (r14.hasNext()) {
                if (bVar == ty0.b.R2) {
                    lVar = new com.garmin.android.apps.connectmobile.navigation.more.b.l(bVar);
                } else if (gVar != null) {
                    lVar = new com.garmin.android.apps.connectmobile.navigation.more.b.f(bVar, gVar);
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    arrayList2.add(lVar);
                }
            }
            return arrayList2;
        }
        return aVar;
    }
}
