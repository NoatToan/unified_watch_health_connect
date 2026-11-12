package g42;

import android.view.View;
import android.widget.ImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg42/k;", "Landroidx/core/view/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.a f75803a;

    public k(com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar) {
        this.f75803a = aVar;
    }

    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
        view2.getClass();
        fVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        ImageView imageView = this.f75803a.f47912f;
        if (imageView != null) {
            fVar.t(imageView.getVisibility() == 0);
        } else {
            p005kotlin.jvm.internal.s.m("useStaticLocationImageView");
            throw null;
        }
    }
}
