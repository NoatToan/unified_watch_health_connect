package gb1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PregnancyDetailsActivity f76676b;

    public /* synthetic */ i(PregnancyDetailsActivity pregnancyDetailsActivity, int i14) {
        this.f76675a = i14;
        this.f76676b = pregnancyDetailsActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f76675a;
        PregnancyDetailsActivity pregnancyDetailsActivity = this.f76676b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        PregnancyDetailsActivity.a aVar = PregnancyDetailsActivity.f40489x;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pregnancyDetailsActivity.va();
                break;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pregnancyDetailsActivity.va();
                break;
        }
        return Unit.INSTANCE;
    }
}
