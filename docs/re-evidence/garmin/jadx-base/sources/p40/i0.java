package p40;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f135683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135684b;

    public i0(h0 h0Var, int i14) {
        this.f135683a = h0Var;
        this.f135684b = i14;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        view2.removeOnLayoutChangeListener(this);
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_header);
        h0.a aVar = h0.f135666q;
        h0 h0Var = this.f135683a;
        h0Var.w6().setPeekHeight(viewFindViewById.getMeasuredHeight() + this.f135684b);
        h0Var.w6().setState(3);
    }
}
