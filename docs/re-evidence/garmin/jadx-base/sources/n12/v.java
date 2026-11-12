package n12;

import android.view.View;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln12/v;", "Landroid/view/View$OnClickListener;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.a f122318a;

    public v(com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar) {
        this.f122318a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        j22.b.f96736a.getClass();
        boolean zD = j22.b.d();
        com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar = this.f122318a;
        if (!zD) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "EditProfileImageTabImageFragment", "Storage permission has NOT been granted.  Requesting permission.");
            com.garmin.android.apps.connectmobile.userprofile.editimage.a.u6(aVar, 1412, j22.a.f96722k);
            return;
        }
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var2, "EditProfileImageTabImageFragment", "Storage permission has already been granted.  Opening gallery app ...");
        int i14 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
        aVar.f46643a.a(Unit.INSTANCE, null);
    }
}
