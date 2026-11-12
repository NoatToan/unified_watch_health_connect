package vd0;

import android.view.View;
import com.yalantis.ucrop.view.UCropView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvd0/z0;", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g6.c f177441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UCropView f177442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f177443c;

    public z0(g6.c cVar, UCropView uCropView, float f14) {
        this.f177441a = cVar;
        this.f177442b = uCropView;
        this.f177443c = f14;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        view2.removeOnLayoutChangeListener(this);
        UCropView uCropView = this.f177442b;
        int measuredWidth = uCropView.getMeasuredWidth();
        g6.c cVar = this.f177441a;
        float fC1 = cVar.c1(measuredWidth);
        float f14 = this.f177443c;
        g6.f.a aVar = g6.f.f75994b;
        float f15 = 2;
        int iF0 = cVar.f0((fC1 - f14) / f15);
        int iF1 = cVar.f0((cVar.c1(uCropView.getMeasuredHeight()) - f14) / f15);
        uCropView.getOverlayView().setPadding(iF0, iF1, iF0, iF1);
        uCropView.getOverlayView().layout(1, 1, 1, 1);
        uCropView.getOverlayView().requestLayout();
    }
}
