package g62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import java.io.File;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76084b;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar, int i14) {
        this.f76083a = i14;
        this.f76084b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f76083a;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar = this.f76084b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = (com.garmin.android.apps.connectmobile.workouts.data.model.a) obj;
                File file = (File) obj2;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                WorkoutDetailsDTO workoutDetailsDTO = bVar.y6().f49138r;
                workoutDetailsDTO.X = aVar;
                workoutDetailsDTO.T = aVar != null ? aVar.getAudioNoteUuid() : null;
                bVar.w6().f182502b = file;
                break;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                ((h0) obj).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = bVar.y6();
                j23.l lVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.C;
                WorkoutDetailsDTO workoutDetailsDTO2 = cVarY6.f49138r;
                m52.k kVar = m52.k.A;
                workoutDetailsDTO2.getClass();
                kVar.getClass();
                workoutDetailsDTO2.f48044e = kVar;
                bVar.A6(iIntValue, cVarY6.f49138r);
                break;
        }
        return Unit.INSTANCE;
    }
}
