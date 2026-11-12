package tz;

import android.graphics.Shader;
import android.view.ViewTreeObserver;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz/b;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CustomLineChart f167292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a<Object> f167293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f167294c;

    public b(CustomLineChart customLineChart, a<Object> aVar, Object obj) {
        this.f167292a = customLineChart;
        this.f167293b = aVar;
        this.f167294c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        CustomLineChart customLineChart = this.f167292a;
        if (customLineChart.getContentRect().height() > 0.0f) {
            customLineChart.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Shader shaderB = this.f167293b.f167285b.b(customLineChart.getContentRect().bottom, customLineChart.getContentRect().top, this.f167294c);
            if (shaderB != null) {
                customLineChart.getRenderer().getPaintRender().setShader(shaderB);
            }
            customLineChart.invalidate();
        }
    }
}
