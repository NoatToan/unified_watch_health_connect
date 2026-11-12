package f61;

import android.content.Context;
import b00.h;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import qz.e;
import zz.j;
import zz.k;
import zz.u;
import zz.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf61/b;", "Lqz/e;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomLineChart f69200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f69201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f69202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f69203d;

    public b(CustomLineChart customLineChart) {
        customLineChart.getClass();
        this.f69200a = customLineChart;
        this.f69201b = new h(customLineChart, null, null, 6, null);
        ViewPortHandler viewPortHandler = customLineChart.getViewPortHandler();
        viewPortHandler.getClass();
        this.f69202c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = customLineChart.getContext();
        context.getClass();
        this.f69203d = new u(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f69203d;
    }

    @Override // qz.e
    public final j c() {
        return this.f69202c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entryForHighlight = ((LineData) this.f69200a.getData()).getEntryForHighlight(highlight);
        return entryForHighlight == null ? new Entry() : entryForHighlight;
    }

    @Override // qz.e
    public final /* bridge */ /* synthetic */ k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f69201b;
    }
}
