package com.garmin.android.apps.connectmobile.userprofile.editimage;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.TransformImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/d;", "Lcom/yalantis/ucrop/view/TransformImageView$TransformImageListener;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements TransformImageView.TransformImageListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureCropImageView f46682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f46683b;

    public d(GestureCropImageView gestureCropImageView, c cVar) {
        this.f46682a = gestureCropImageView;
        this.f46683b = cVar;
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onLoadComplete() {
        GestureCropImageView gestureCropImageView = this.f46682a;
        gestureCropImageView.post(new l0.e(11, gestureCropImageView, this.f46683b));
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onLoadFailure(Exception exc) {
        exc.getClass();
        String strN = fb1.c.n("load image failed with exception: ", exc.getMessage());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "EditProfileImageViewHolder", strN);
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onRotate(float f14) {
        this.f46683b.f46659b.a();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "EditProfileImageViewHolder", "onRotate: " + f14);
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onScale(float f14) {
        this.f46683b.f46659b.a();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "EditProfileImageViewHolder", "onScale: " + f14);
    }
}
