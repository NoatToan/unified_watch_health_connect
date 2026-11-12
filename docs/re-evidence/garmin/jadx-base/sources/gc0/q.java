package gc0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import o53.c0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import pc0.d0;
import pc0.l0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.dashboard.DevicesDashboardViewModel$updateIndexDevicesWithLastSyncDate$1", f = "DevicesDashboardViewModel.kt", l = {151, 173}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f76909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f76910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f76912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<e> f76913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f76914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar, List<e> list, boolean z14, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f76912e = lVar;
        this.f76913f = list;
        this.f76914g = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f76912e, this.f76913f, this.f76914g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r5 == r1) goto L44;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int userProfilePk;
        Object objJ;
        List list;
        Iterator<e> it;
        e next;
        boolean zN;
        long unitID;
        Iterator it3;
        Object next2;
        s sVar;
        long jLongValue;
        Object objE;
        Long lastUploadTimestamp;
        Long deviceId;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76911d;
        List<e> list2 = this.f76913f;
        l lVar = this.f76912e;
        if (i14 != 0) {
            if (i14 == 1) {
                userProfilePk = this.f76908a;
                o13.r.b(obj);
                objJ = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                userProfilePk = this.f76908a;
                it = this.f76910c;
                list = this.f76909b;
                o13.r.b(obj);
            }
            while (it.hasNext()) {
                next = it.next();
                sd2.f fVar = next.f76845a;
                zN = u0.n(fVar.getProductNumber(), u0.S5, u0.P5, u0.H0);
                boolean zN2 = u0.n(fVar.getProductNumber(), u0.Y5);
                if (!zN || zN2) {
                    unitID = fVar.getUnitID();
                    it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        deviceId = ((s) next2).getDeviceId();
                        if (deviceId != null && deviceId.longValue() == unitID) {
                            break;
                        }
                    }
                    sVar = (s) next2;
                    if (sVar != null || (lastUploadTimestamp = sVar.getLastUploadTimestamp()) == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = lastUploadTimestamp.longValue();
                    }
                    if (jLongValue > 0) {
                        next.f76853i = jLongValue;
                        pc0.j jVar = lVar.f76883g;
                        this.f76909b = list;
                        this.f76910c = it;
                        this.f76908a = userProfilePk;
                        this.f76911d = 2;
                        jVar.getClass();
                        objE = c0.e(new l0(unitID, jLongValue, null), this);
                        if (objE != u13.a.COROUTINE_SUSPENDED) {
                            objE = Unit.INSTANCE;
                        }
                        if (objE == aVar) {
                            return aVar;
                        }
                    } else {
                        continue;
                    }
                }
            }
            lVar.f76885i.m(new t(h0.b1(list2), this.f76914g));
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        pc0.j jVar2 = lVar.f76883g;
        this.f76908a = userProfilePk;
        this.f76911d = 1;
        jVar2.getClass();
        objJ = f0.J(jVar2, new d0(jVar2, userProfilePk, null), this);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            list = (List) ((v2.b) v2Var).f47386a;
            it = list2.iterator();
            while (it.hasNext()) {
                next = it.next();
                sd2.f fVar2 = next.f76845a;
                zN = u0.n(fVar2.getProductNumber(), u0.S5, u0.P5, u0.H0);
                boolean zN3 = u0.n(fVar2.getProductNumber(), u0.Y5);
                if (!zN) {
                }
                unitID = fVar2.getUnitID();
                it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    deviceId = ((s) next2).getDeviceId();
                    if (deviceId != null) {
                        break;
                        break;
                    }
                }
                sVar = (s) next2;
                if (sVar != null) {
                    jLongValue = 0;
                } else {
                    jLongValue = 0;
                }
                if (jLongValue > 0) {
                    next.f76853i = jLongValue;
                    pc0.j jVar3 = lVar.f76883g;
                    this.f76909b = list;
                    this.f76910c = it;
                    this.f76908a = userProfilePk;
                    this.f76911d = 2;
                    jVar3.getClass();
                    objE = c0.e(new l0(unitID, jLongValue, null), this);
                    if (objE != u13.a.COROUTINE_SUSPENDED) {
                        objE = Unit.INSTANCE;
                    }
                    if (objE == aVar) {
                        return aVar;
                    }
                } else {
                    continue;
                }
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            lVar.f76882f.error("DevicesDashboardViewModel - Got ERROR with http code " + aVar2.f47384b + " and message " + aVar2.f47385c);
        }
        lVar.f76885i.m(new t(h0.b1(list2), this.f76914g));
        return Unit.INSTANCE;
    }
}
