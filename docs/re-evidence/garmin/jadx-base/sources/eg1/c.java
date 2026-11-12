package eg1;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leg1/c;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f63984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f63985b;

    public c(View view2, View view3) {
        this.f63984a = view2;
        this.f63985b = view3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view2 = this.f63985b;
        this.f63984a.setLayoutParams(new LinearLayout.LayoutParams(-1, view2.getMeasuredHeight()));
        view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
