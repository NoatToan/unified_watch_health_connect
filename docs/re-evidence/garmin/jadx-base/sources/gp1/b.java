package gp1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import zz.j;
import zz.k;
import zz.u;
import zz.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgp1/b;", "Lqz/e;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomLineChart f78436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00.h f78437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f78438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f78439d;

    public b(CustomLineChart customLineChart) {
        customLineChart.getClass();
        this.f78436a = customLineChart;
        this.f78437b = new b00.h(customLineChart, null, null, 6, null);
        ViewPortHandler viewPortHandler = customLineChart.getViewPortHandler();
        viewPortHandler.getClass();
        this.f78438c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = customLineChart.getContext();
        context.getClass();
        this.f78439d = new u(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f78439d;
    }

    @Override // qz.e
    public final j c() {
        return this.f78438c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entry = new Entry();
        entry.setData(pz.d.a(this.f78436a, highlight.getX()));
        return entry;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f78437b;
    }
}
