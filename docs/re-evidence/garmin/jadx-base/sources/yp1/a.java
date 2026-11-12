package yp1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import i53.c;
import java.util.ArrayList;
import java.util.List;
import km1.v;
import np1.f;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import xp1.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyp1/a;", "Landroidx/lifecycle/u1;", "", "deviceUnitId", "Lop1/a;", "solarIntensityRepository", "<init>", "(JLop1/a;)V", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f198689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final op1.a f198690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f198691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f198692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f198693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f198694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u82.a<o82.a, b> f198695g;

    /* JADX INFO: renamed from: yp1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "dateInterval", "Lxp1/b;", "<anonymous>", "(Lo82/a;)Lxp1/b;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.solarintensity.presentation.viewmodel.SolarIntensityViewModel$dailySolarIntensityPageState$1", f = "SolarIntensityViewModel.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class C3720a extends i implements p<o82.a, d<? super b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f198697b;

        public C3720a(d<? super C3720a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C3720a c3720a = a.this.new C3720a(dVar);
            c3720a.f198697b = obj;
            return c3720a;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, d<? super b> dVar) {
            return ((C3720a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA;
            c cVarE;
            c cVarE2;
            List<np1.b> listA;
            List<np1.e> listA2;
            np1.e eVar;
            List<np1.d> listB;
            List<np1.e> listA3;
            np1.e eVar2;
            o82.a aVar = (o82.a) this.f198697b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198696a;
            c cVarE3 = null;
            if (i14 == 0) {
                r.b(obj);
                a aVar3 = a.this;
                op1.a aVar4 = aVar3.f198690b;
                long j8 = aVar3.f198689a;
                o oVar = aVar.f130843a;
                o oVar2 = aVar.f130844b;
                this.f198697b = null;
                this.f198696a = 1;
                objA = aVar4.a(j8, oVar, oVar2, this);
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objA = obj;
            }
            v2 v2Var = (v2) objA;
            if (!(v2Var instanceof v2.b)) {
                throw new Exception(b71.i.f("Failed to get daily solar intensity: ", v2Var));
            }
            wp1.a aVar5 = wp1.a.f186533a;
            f fVar = (f) ((v2.b) v2Var).f47386a;
            aVar5.getClass();
            fVar.getClass();
            List<v> listA4 = fVar.a();
            if (listA4 != null) {
                ArrayList<v> arrayListZ = h0.Z(listA4);
                ArrayList arrayList = new ArrayList(y.r(arrayListZ, 10));
                for (v vVar : arrayListZ) {
                    arrayList.add(new xp1.c(vVar.getSleepStartTimestampGMT(), vVar.getSleepEndTimestampGMT()));
                }
                cVarE = i53.a.e(arrayList);
            } else {
                cVarE = null;
            }
            np1.c deviceSolarInputDTO = fVar.getDeviceSolarInputDTO();
            String localConnectDate = (deviceSolarInputDTO == null || (listA3 = deviceSolarInputDTO.a()) == null || (eVar2 = (np1.e) h0.d0(listA3)) == null) ? null : eVar2.getLocalConnectDate();
            np1.c deviceSolarInputDTO2 = fVar.getDeviceSolarInputDTO();
            if (deviceSolarInputDTO2 == null || (listA2 = deviceSolarInputDTO2.a()) == null || (eVar = (np1.e) h0.d0(listA2)) == null || (listB = eVar.b()) == null) {
                cVarE2 = null;
            } else {
                ArrayList arrayList2 = new ArrayList(y.r(listB, 10));
                for (np1.d dVar : listB) {
                    arrayList2.add(new xp1.d(dVar.getReadingTimestampLocal(), dVar.getReadingTimestampGmt(), dVar.getSolarUtilization(), dVar.getIsCharging(), dVar.getNotChargingTooHot(), dVar.getNotChargingTooCold(), dVar.getNotChargingBatteryFull(), dVar.getNotChargingExternalPower(), dVar.getNotChargingUserDisabled(), dVar.getNotChargingOther()));
                }
                cVarE2 = i53.a.e(arrayList2);
            }
            np1.a listOfAllActivities = fVar.getListOfAllActivities();
            if (listOfAllActivities != null && (listA = listOfAllActivities.a()) != null) {
                ArrayList arrayList3 = new ArrayList(y.r(listA, 10));
                for (np1.b bVar : listA) {
                    Long activityId = bVar.getActivityId();
                    String activityName = bVar.getActivityName();
                    String startTimeGMT = bVar.getStartTimeGMT();
                    String startTimeLocal = bVar.getStartTimeLocal();
                    to.o activityType = bVar.getActivityType();
                    String strJ = activityType != null ? activityType.j() : null;
                    to.o activityType2 = bVar.getActivityType();
                    arrayList3.add(new xp1.a(activityId, activityName, startTimeGMT, startTimeLocal, strJ, activityType2 != null ? activityType2.getParentTypeId() : null));
                }
                cVarE3 = i53.a.e(arrayList3);
            }
            return new b(cVarE, localConnectDate, cVarE2, cVarE3);
        }
    }

    public a(long j8, op1.a aVar) {
        aVar.getClass();
        this.f198689a = j8;
        this.f198690b = aVar;
        p2 p2VarA = q2.a(Boolean.TRUE);
        this.f198691c = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f198692d = p2VarA2;
        this.f198693e = s.d(p2VarA);
        this.f198694f = s.d(p2VarA2);
        this.f198695g = new u82.a<>(v1.a(this), new y82.e(new y82.c(new C3720a(null)), null, 2, null), false, 4, null);
    }
}
