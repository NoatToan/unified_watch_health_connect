package n12;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageActivity;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln12/e;", "Lcom/yalantis/ucrop/callback/BitmapCropCallback;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements BitmapCropCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Uri, Unit> f122232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfileImageActivity f122233b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(e23.l<? super Uri, Unit> lVar, EditProfileImageActivity editProfileImageActivity) {
        this.f122232a = lVar;
        this.f122233b = editProfileImageActivity;
    }

    @Override // com.yalantis.ucrop.callback.BitmapCropCallback
    public final void onBitmapCropped(Uri uri, int i14, int i15, int i16, int i17) {
        uri.getClass();
        this.f122232a.invoke(uri);
    }

    @Override // com.yalantis.ucrop.callback.BitmapCropCallback
    public final void onCropFailure(Throwable th3) {
        th3.getClass();
        String strN = fb1.c.n("Crop Image Failed: ", th3.getMessage());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "EditProfileImageActivity", strN);
        ei0.q0.b(this.f122233b);
    }
}
