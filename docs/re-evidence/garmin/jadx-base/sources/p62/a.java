package p62;

import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements SpinnerDialogView.b, SpinnerDialogView.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f136213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.j0 f136214b;

    public /* synthetic */ a(b bVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        this.f136213a = bVar;
        this.f136214b = j0Var;
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView.d
    public void j(SpinnerDialogView spinnerDialogView, int[] iArr) {
        iArr.getClass();
        b bVar = this.f136213a;
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = this.f136214b;
        bVar.i(j0Var, iArr);
        String strA = bVar.a(j0Var);
        if (strA != null) {
            spinnerDialogView.setSubtitle(strA);
        }
    }
}
