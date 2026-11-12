package ty1;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EditEventImageActivity;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lty1/e;", "Lcom/yalantis/ucrop/callback/BitmapCropCallback;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements BitmapCropCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditEventImageActivity f167094a;

    public e(EditEventImageActivity editEventImageActivity) {
        this.f167094a = editEventImageActivity;
    }

    @Override // com.yalantis.ucrop.callback.BitmapCropCallback
    public final void onBitmapCropped(Uri uri, int i14, int i15, int i16, int i17) {
        uri.getClass();
        EditEventImageActivity editEventImageActivity = this.f167094a;
        editEventImageActivity.setResult(-1);
        editEventImageActivity.finish();
    }

    @Override // com.yalantis.ucrop.callback.BitmapCropCallback
    public final void onCropFailure(Throwable th3) {
        th3.getClass();
        String strN = fb1.c.n("Crop Image Failed, message: ", th3.getMessage());
        p92.y.f136664a.getClass();
        p92.y.a.b(strN);
        this.f167094a.da();
    }
}
