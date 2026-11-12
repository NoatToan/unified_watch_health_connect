package bv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbv1/p;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "<init>", "(Landroid/view/LayoutInflater;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HorseshoePieChart f21427b;

    /* JADX WARN: Illegal instructions before constructor call */
    public p(LayoutInflater layoutInflater) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fbt_dashboard_plan_info, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f21427b = (HorseshoePieChart) this.f21420a.findViewById(R.id.plan_progress_chart_view);
    }

    public final void c(xu1.a aVar) {
        aVar.getClass();
        HorseshoePieChart horseshoePieChart = this.f21427b;
        horseshoePieChart.getClass();
        Context context = this.f21420a.getContext();
        context.getClass();
        new vz.a(horseshoePieChart, new xu1.b(context), new du1.b(horseshoePieChart)).a(aVar);
    }
}
