package f62;

import android.content.DialogInterface;
import androidx.lifecycle.v1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.a f69219b;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.workouts.presentation.edit.a aVar, int i14) {
        this.f69218a = i14;
        this.f69219b = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f69218a;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.a aVar = this.f69219b;
        switch (i15) {
            case 0:
                int i16 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVarGa = aVar.ga();
                ge1.b.T(v1.a(rVarGa), null, null, new j0(rVarGa, null), 3);
                break;
            default:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.ca(aVar);
                break;
        }
    }
}
