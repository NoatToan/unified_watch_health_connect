package d62;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import c22.j0;
import com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeActivity;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideGenesisActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o53.s0;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p3.o1;
import p3.p1;
import pt0.f0;
import pt0.h0;
import qw0.y;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f58067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f58068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f58069d;

    public /* synthetic */ s(long j8, ca2.a aVar, y92.e eVar) {
        this.f58066a = 7;
        this.f58068c = j8;
        this.f58069d = aVar;
        this.f58067b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f58066a;
        long j8 = this.f58068c;
        Object obj = this.f58067b;
        Object obj2 = this.f58069d;
        switch (i14) {
            case 0:
                WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity = (WorkoutActivityProfileSelectionActivity) obj2;
                WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
                j jVar = ((b) ((p1) obj).getF182175a()).f58000c;
                Intent intent = new Intent();
                intent.putExtra("extra_selected_device_unit_id", j8);
                intent.putExtra("extra_selected_profile", jVar);
                workoutActivityProfileSelectionActivity.setResult(-1, intent);
                workoutActivityProfileSelectionActivity.finish();
                return Unit.INSTANCE;
            case 1:
                ((p1) obj).setValue(Boolean.FALSE);
                ((o1) obj2).setValue(Long.valueOf(j8));
                return Unit.INSTANCE;
            case 2:
                hu1.h hVar = (hu1.h) obj2;
                List list = (List) obj;
                hu1.i iVar = hVar.f85727l;
                if (iVar != null) {
                    DateTime dateTime = hVar.f85723h;
                    if (dateTime == null) {
                        p005kotlin.jvm.internal.s.m("startDate");
                        throw null;
                    }
                    DateTime dateTime2 = hVar.f85724i;
                    if (dateTime2 == null) {
                        p005kotlin.jvm.internal.s.m("endDate");
                        throw null;
                    }
                    list.getClass();
                    HashMap map = iVar.f85734d;
                    map.put(new hu1.b(dateTime, dateTime2), list);
                    DateTime dateTimeNow = DateTime.now();
                    for (Map.Entry entry : map.entrySet()) {
                        if (iVar.f85736f == 0) {
                            for (fu1.u uVar : (List) entry.getValue()) {
                                if (uVar.f73558c != null) {
                                    fu1.q qVar = uVar.f73557b;
                                    if ((qVar != null ? qVar.getActivityId() : null) == null) {
                                        j0 j0Var = j0.f23099a;
                                        DateTime dateTime3 = uVar.f73556a;
                                        j0Var.getClass();
                                        if (j0.F(dateTimeNow, dateTime3) || uVar.f73556a.compareTo((ReadableInstant) DateTime.now()) > 0) {
                                            if (iVar.f85736f == 0) {
                                                WorkoutDTO workoutDTO = uVar.f73558c;
                                                iVar.f85736f = workoutDTO != null ? workoutDTO.f48040a : 0L;
                                            }
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                hu1.i iVar2 = hVar.f85727l;
                if (iVar2 != null) {
                    iVar2.f85733c.remove(Long.valueOf(j8));
                }
                return Unit.INSTANCE;
            case 3:
                ((p1) obj).setValue(Boolean.TRUE);
                ((kv0.j) obj2).getClass();
                wd2.m.h(j8, com.garmin.android.library.livetrack.i.a.f50228a);
                return Unit.INSTANCE;
            case 4:
                ((e23.a) obj2).invoke();
                ((nw0.r) obj).z4(j8);
                return Unit.INSTANCE;
            case 5:
                f0 f0Var = (f0) obj2;
                int i15 = f0.f140659k;
                w9.a aVarA = v1.a(f0Var);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new h0(f0Var, (String) obj, this.f58068c, null), 2);
                return Unit.INSTANCE;
            case 6:
                CardDestinationSelectionActivity cardDestinationSelectionActivity = (CardDestinationSelectionActivity) obj2;
                CardDestinationSelectionActivity.a aVar = CardDestinationSelectionActivity.f52143n;
                qr2.e eVar = (qr2.e) new x1(cardDestinationSelectionActivity).b(p005kotlin.jvm.internal.s0.f105811a.b(qr2.e.class));
                long j14 = this.f58068c;
                eVar.J2(j14);
                eVar.N1(j14);
                eVar.L2().f(cardDestinationSelectionActivity, new CardDestinationSelectionActivity.c(new y(cardDestinationSelectionActivity, 23)));
                eVar.S1().f(cardDestinationSelectionActivity, new CardDestinationSelectionActivity.c(new c31.e(cardDestinationSelectionActivity, j14, (String) obj, 5)));
                return Unit.INSTANCE;
            case 7:
                DevicePasscodeActivity.a aVar2 = DevicePasscodeActivity.f33744a;
                return ParametersHolderKt.parametersOf(Long.valueOf(j8), (ca2.a) obj2, (y92.e) obj);
            case 8:
                ((e23.a) obj2).invoke();
                ((e23.l) obj).invoke(Long.valueOf(j8));
                return Unit.INSTANCE;
            case 9:
                xk1.f fVar = (xk1.f) obj2;
                fVar.f191227i.i((Context) obj, j8, fVar.f191224f);
                return Unit.INSTANCE;
            case 10:
                xk1.n nVar = (xk1.n) obj2;
                nVar.f191269i.d((Context) obj, j8, nVar.f191266f);
                return Unit.INSTANCE;
            case 11:
                ((p1) obj).setValue(Boolean.FALSE);
                ((ya0.a) obj2).x4(j8);
                return Unit.INSTANCE;
            default:
                GroupRideGenesisActivity groupRideGenesisActivity = (GroupRideGenesisActivity) obj;
                GroupRideGenesisActivity.a aVar3 = GroupRideGenesisActivity.f44734a;
                ((vo1.b) obj2).d(groupRideGenesisActivity, j8);
                groupRideGenesisActivity.finish();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ s(Object obj, long j8, Object obj2, int i14) {
        this.f58066a = i14;
        this.f58069d = obj;
        this.f58068c = j8;
        this.f58067b = obj2;
    }

    public /* synthetic */ s(Object obj, Object obj2, long j8, int i14) {
        this.f58066a = i14;
        this.f58069d = obj;
        this.f58067b = obj2;
        this.f58068c = j8;
    }

    public /* synthetic */ s(p1 p1Var, o1 o1Var, long j8) {
        this.f58066a = 1;
        this.f58067b = p1Var;
        this.f58069d = o1Var;
        this.f58068c = j8;
    }
}
