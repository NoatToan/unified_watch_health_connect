package zm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomHorizontalBarChart;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzm/u;", "Lzm/q;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lwm/a;", "chartData", "<init>", "(Landroid/content/Context;Lwm/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f205257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wm.a f205258b;

    public u(Context context, wm.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f205257a = context;
        this.f205258b = aVar;
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        Context context = this.f205257a;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm3_horizontal_bar_chart_view, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.bar_chart_view);
        viewFindViewById.getClass();
        CustomHorizontalBarChart customHorizontalBarChart = (CustomHorizontalBarChart) viewFindViewById;
        rz.b bVar = new rz.b(customHorizontalBarChart, new vm.a(context), new vm.b(customHorizontalBarChart), null, null, null, 56, null);
        bVar.c();
        qz.a.b(bVar, this.f205258b, null, 6);
        View viewFindViewById2 = viewInflate.findViewById(R.id.legend_container);
        viewFindViewById2.getClass();
        ((LinearLayout) viewFindViewById2).addView(LayoutInflater.from(context).inflate(R.layout.climb_routes_chart_legend, viewGroup, false));
        return viewInflate;
    }
}
