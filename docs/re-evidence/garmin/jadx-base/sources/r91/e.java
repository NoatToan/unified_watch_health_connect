package r91;

import am.x0;
import b63.o;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import j53.l;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import ps.q1;
import r53.b2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.BestEffortsUseCase$getBestEffortsStateForTimeLine$1", f = "BestEffortsUseCase.kt", l = {93, 119}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f151380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f151381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f151382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f151383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f151384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f151385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q91.d f151386g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.BestEffortsUseCase$getBestEffortsStateForTimeLine$1$2$1", f = "BestEffortsUseCase.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public dn.a f151387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b0 f151388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f151389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f151390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f151391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ dn.a f151392f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, dn.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151391e = cVar;
            this.f151392f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f151391e, this.f151392f, dVar);
            aVar.f151390d = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            dn.a aVar;
            String startTimeLocal;
            b0 b0Var = (b0) this.f151390d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151389c;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    c cVar = this.f151391e;
                    dn.a aVar3 = this.f151392f;
                    int i15 = q.f128596b;
                    zp.a aVar4 = cVar.f151371b;
                    long activityId = aVar3.getActivityId();
                    this.f151390d = null;
                    this.f151387a = aVar3;
                    this.f151388b = b0Var;
                    this.f151389c = 1;
                    obj = aVar4.K3(activityId, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    aVar = aVar3;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = this.f151387a;
                    r.b(obj);
                }
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    aVar.f60488e = ((ps.r) ((v2.b) v2Var).f47386a).getActivityName();
                    q1 summaryDTO = ((ps.r) ((v2.b) v2Var).f47386a).getSummaryDTO();
                    if (summaryDTO == null || (startTimeLocal = summaryDTO.getStartTimeLocal()) == null) {
                        startTimeLocal = "";
                    }
                    aVar.f60489f = startTimeLocal;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var, "BestEffortsUseCase", "Error occurred while getting activity details for fastest split");
                }
                bVar = Unit.INSTANCE;
                int i16 = q.f128596b;
            } catch (Throwable th3) {
                int i17 = q.f128596b;
                bVar = new q.b(th3);
            }
            if (bVar instanceof q.b) {
                return null;
            }
            return bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, o oVar, o oVar2, q91.d dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f151383d = cVar;
        this.f151384e = oVar;
        this.f151385f = oVar2;
        this.f151386g = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f151383d, this.f151384e, this.f151385f, this.f151386g, dVar);
        eVar.f151382c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
    
        if (r1 == r2) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        aa1.a value;
        x0 x0Var;
        Object objP3;
        aa1.a value2;
        ArrayList arrayList;
        Object objO;
        aa1.a value3;
        k kVar;
        b2 b2Var;
        b0 b0Var = (b0) this.f151382c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151381b;
        q91.d dVar = this.f151386g;
        c cVar = this.f151383d;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                objP3 = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList2 = this.f151380a;
                r.b(obj);
                arrayList = arrayList2;
                objO = obj;
            }
            h0.Z((Iterable) objO);
            z1<aa1.a> z1Var = cVar.f151373d;
            do {
                value3 = z1Var.getValue();
                kVar = cVar.f151370a;
                b2Var = kVar.f151437k;
            } while (!z1Var.b(value3, aa1.a.b(value3, false, false, this.f151386g, ((aa1.e) kVar.f151437k.f150540a.getValue()).f2263e, ((aa1.e) b2Var.f150540a.getValue()).f2264f, ((aa1.e) b2Var.f150540a.getValue()).f2265g, ((aa1.e) b2Var.f150540a.getValue()).f2266h, ((aa1.e) b2Var.f150540a.getValue()).f2267i, ((aa1.e) b2Var.f150540a.getValue()).f2268j, ((aa1.e) b2Var.f150540a.getValue()).f2269k, i53.a.e(arrayList), 512)));
            return Unit.INSTANCE;
        }
        r.b(obj);
        z1<aa1.a> z1Var2 = cVar.f151373d;
        do {
            value = z1Var2.getValue();
        } while (!z1Var2.b(value, aa1.a.b(value, true, false, this.f151386g, null, null, null, null, null, null, null, null, 4088)));
        zp.a aVar2 = cVar.f151371b;
        q91.g gVar = dVar.f143580b;
        gVar.getClass();
        int i15 = q91.g.c.f143599a[gVar.ordinal()];
        if (i15 == 1) {
            x0Var = x0.f4308n;
        } else if (i15 != 2) {
            x0Var = i15 != 3 ? null : x0.f4324r;
        } else {
            x0Var = x0.f4312o;
        }
        if (x0Var == null) {
            x0Var = x0.f4308n;
        }
        this.f151382c = b0Var;
        this.f151381b = 1;
        objP3 = aVar2.P3(this.f151384e, this.f151385f, x0Var, this);
        if (objP3 != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) objP3;
        if (v2Var instanceof v2.b) {
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((dn.a) obj2).getDistance() == dVar.f143582d) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(ge1.b.j(b0Var, null, null, new a(cVar, (dn.a) it.next(), null), 3));
            }
            this.f151382c = null;
            this.f151380a = arrayList;
            this.f151381b = 2;
            objO = g8.i.o(arrayList3, this);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            z1<aa1.a> z1Var3 = cVar.f151373d;
            do {
                value2 = z1Var3.getValue();
            } while (!z1Var3.b(value2, aa1.a.b(value2, false, true, this.f151386g, null, null, null, null, null, null, null, i53.a.e(l.b()), 2040)));
        }
        return Unit.INSTANCE;
    }
}
