package c41;

import android.content.Context;
import b00.h;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import pz.d;
import qz.e;
import zz.j;
import zz.k;
import zz.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc41/a;", "Lqz/e;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomCombinedChart f24333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f24334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f24335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f24336d;

    public a(CustomCombinedChart customCombinedChart) {
        customCombinedChart.getClass();
        this.f24333a = customCombinedChart;
        this.f24334b = new h(customCombinedChart, null, null, 6, null);
        ViewPortHandler viewPortHandler = customCombinedChart.getViewPortHandler();
        viewPortHandler.getClass();
        this.f24335c = new v(viewPortHandler, 0.0f, 2, null);
        Context context = customCombinedChart.getContext();
        context.getClass();
        this.f24336d = new c(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f24336d;
    }

    @Override // qz.e
    public final j c() {
        return this.f24335c;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entry = new Entry();
        entry.setData(d.a(this.f24333a, highlight.getX()));
        return entry;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    public final b00.b f() {
        return this.f24334b;
    }
}
