package qm;

import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.github.mikephil.chartingv2.charts.LineChart;
import java.util.WeakHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/d1", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f145348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LineChart f145349b;

    public d0(View view2, LineChart lineChart) {
        this.f145348a = view2;
        this.f145349b = lineChart;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        this.f145348a.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        this.f145349b.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
    }
}
