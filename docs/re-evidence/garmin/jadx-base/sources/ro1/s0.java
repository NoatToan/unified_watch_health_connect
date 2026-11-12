package ro1;

import android.view.View;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro1/s0;", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UCropImageActivity f154005a;

    public s0(UCropImageActivity uCropImageActivity) {
        this.f154005a = uCropImageActivity;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        view2.removeOnLayoutChangeListener(this);
        UCropImageActivity.a aVar = UCropImageActivity.f44623o;
        this.f154005a.da();
    }
}
