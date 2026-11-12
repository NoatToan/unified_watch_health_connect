package z11;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.CaloriesLinkAccountsActivity;
import vz2.i;
import vz2.j;
import vz2.k;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CaloriesLinkAccountsActivity f201354b;

    public /* synthetic */ b(CaloriesLinkAccountsActivity caloriesLinkAccountsActivity, int i14) {
        this.f201353a = i14;
        this.f201354b = caloriesLinkAccountsActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f201353a;
        CaloriesLinkAccountsActivity caloriesLinkAccountsActivity = this.f201354b;
        switch (i15) {
            case 0:
                CaloriesLinkAccountsActivity.a aVar = CaloriesLinkAccountsActivity.f39595i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                i iVar = caloriesLinkAccountsActivity.f39597b;
                iVar.getClass();
                iVar.a(caloriesLinkAccountsActivity, k.f180958a, j.f180954a, caloriesLinkAccountsActivity.f39598c);
                break;
            case 1:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                i iVar2 = caloriesLinkAccountsActivity.f39597b;
                iVar2.getClass();
                iVar2.a(caloriesLinkAccountsActivity, k.f180958a, j.f180954a, caloriesLinkAccountsActivity.f39598c);
                break;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                CaloriesLinkAccountsActivity.a aVar2 = CaloriesLinkAccountsActivity.f39595i;
                if (caloriesLinkAccountsActivity.hasInternetConnection()) {
                    i iVar3 = caloriesLinkAccountsActivity.f39597b;
                    iVar3.getClass();
                    iVar3.a(caloriesLinkAccountsActivity, k.f180958a, j.f180954a, caloriesLinkAccountsActivity.f39598c);
                }
                break;
        }
    }
}
