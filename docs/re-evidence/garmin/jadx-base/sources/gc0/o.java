package gc0;

import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.dashboard.DevicesDashboardViewModel$removeOrphanDevice$1", f = "DevicesDashboardViewModel.kt", l = {191}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f76902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sd2.f f76903c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.dashboard.DevicesDashboardViewModel$removeOrphanDevice$1$1", f = "DevicesDashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sd2.f f76904a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sd2.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f76904a = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f76904a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            rd2.m mVarF = rd2.m.f();
            long unitID = this.f76904a.getUnitID();
            mVarF.getClass();
            return Boolean.valueOf(rd2.m.e(unitID));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, sd2.f fVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f76902b = lVar;
        this.f76903c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f76902b, this.f76903c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List<? extends e> list;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76901a;
        sd2.f fVar = this.f76903c;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(fVar, null);
            this.f76901a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        l lVar = this.f76902b;
        t tVarD = lVar.f76885i.d();
        if (tVarD == null || (list = tVarD.f76923a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                sd2.f fVar2 = ((e) obj2).f76845a;
                if (fVar2 == null || fVar2.getUnitID() != fVar.getUnitID()) {
                    arrayList.add(obj2);
                }
            }
        }
        y0<t> y0Var = lVar.f76885i;
        t tVarD2 = y0Var.d();
        y0Var.j(tVarD2 != null ? new t(arrayList, tVarD2.f76924b) : null);
        return Unit.INSTANCE;
    }
}
