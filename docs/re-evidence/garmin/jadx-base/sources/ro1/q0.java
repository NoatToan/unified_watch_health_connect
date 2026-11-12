package ro1;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.view.GestureCropImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro1/q0;", "Lcom/yalantis/ucrop/callback/BitmapCropCallback;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 implements BitmapCropCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UCropImageActivity f154000a;

    public q0(UCropImageActivity uCropImageActivity) {
        this.f154000a = uCropImageActivity;
    }

    @Override // com.yalantis.ucrop.callback.BitmapCropCallback
    public final void onBitmapCropped(Uri uri, int i14, int i15, int i16, int i17) {
        uri.getClass();
        Intent intent = new Intent();
        intent.putExtra("input_uri", uri);
        UCropImageActivity uCropImageActivity = this.f154000a;
        Uri uri2 = uCropImageActivity.f44626c;
        if (uri2 == null) {
            p005kotlin.jvm.internal.s.m("imageUri");
            throw null;
        }
        intent.putExtra("original_uri", uri2);
        intent.putExtra("crop_rect", new Rect(i14, i15, i16 + i14, i17 + i15));
        GestureCropImageView gestureCropImageView = uCropImageActivity.f44625b;
        intent.putExtra("rotate_angle", gestureCropImageView != null ? gestureCropImageView.getCurrentAngle() : 0.0f);
        uCropImageActivity.setResult(-1, intent);
        uCropImageActivity.finish();
    }

    @Override // com.yalantis.ucrop.callback.BitmapCropCallback
    public final void onCropFailure(Throwable th3) {
        th3.getClass();
        String strN = fb1.c.n("Crop image failed with throwable: ", th3.getMessage());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "UCropImageActivity", strN);
        UCropImageActivity uCropImageActivity = this.f154000a;
        ei0.q0.b(uCropImageActivity);
        uCropImageActivity.setResult(0, null);
        uCropImageActivity.finish();
    }
}
