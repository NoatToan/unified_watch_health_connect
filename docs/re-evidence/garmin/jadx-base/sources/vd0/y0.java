package vd0;

import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.TransformImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvd0/y0;", "Lcom/yalantis/ucrop/view/TransformImageView$TransformImageListener;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 implements TransformImageView.TransformImageListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureCropImageView f177434a;

    public y0(GestureCropImageView gestureCropImageView) {
        this.f177434a = gestureCropImageView;
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onLoadComplete() {
        GestureCropImageView gestureCropImageView = this.f177434a;
        gestureCropImageView.post(new v.b0(gestureCropImageView, 7));
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onLoadFailure(Exception exc) {
        exc.getClass();
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onRotate(float f14) {
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onScale(float f14) {
    }
}
