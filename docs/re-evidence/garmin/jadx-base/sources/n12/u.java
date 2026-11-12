package n12;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln12/u;", "Landroid/view/View$OnClickListener;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.a f122311a;

    public u(com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar) {
        this.f122311a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96716e;
        bVar.getClass();
        boolean zK = j22.b.k(aVar);
        boolean zD = j22.b.d();
        ArrayList arrayList = new ArrayList();
        if (!zK) {
            arrayList.add(aVar);
        }
        if (!zD) {
            arrayList.add(j22.a.f96722k);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar2 = this.f122311a;
        if (!zIsEmpty) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "EditProfileImageTabImageFragment", "Camera and Storage permission has NOT been granted. Requesting permission.");
            j22.a[] aVarArr = (j22.a[]) arrayList.toArray(new j22.a[0]);
            com.garmin.android.apps.connectmobile.userprofile.editimage.a.u6(aVar2, 1411, (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
            return;
        }
        i2.a aVar4 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var2, "EditProfileImageTabImageFragment", "Camera and storage permission has already been granted. Opening camera app ...");
        int i14 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
        f.c<File> cVar = aVar2.f46644b;
        EditProfileImageViewModel editProfileImageViewModelW6 = aVar2.w6();
        Context contextRequireContext = aVar2.requireContext();
        contextRequireContext.getClass();
        if (editProfileImageViewModelW6.K0 == null) {
            editProfileImageViewModelW6.K0 = new File(pi1.b.a(contextRequireContext, null), "temp_file");
        }
        cVar.a(editProfileImageViewModelW6.K0, null);
    }
}
