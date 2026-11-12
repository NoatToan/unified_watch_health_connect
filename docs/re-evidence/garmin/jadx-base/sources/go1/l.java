package go1;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f78288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78289b;

    public l(k kVar, int i14) {
        this.f78288a = kVar;
        this.f78289b = i14;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        view2.removeOnLayoutChangeListener(this);
        this.f78288a.z6().scrollToPositionWithOffset(this.f78289b, view2.getHeight() / 2);
    }
}
