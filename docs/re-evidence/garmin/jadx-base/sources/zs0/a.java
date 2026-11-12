package zs0;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.model.LactateSummaryMeasurementsDTO;
import e32.p;
import f12.l;
import oi0.h;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzs0/a;", "Le32/p;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "Lvs0/a;", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "intervalType", "Landroid/view/View;", "rootView", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILandroid/view/View;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements p<o13.p<? extends LactateSummaryMeasurementsDTO, ? extends vs0.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f206815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final at0.d<LactateSummaryMeasurementsDTO> f206816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f206817c;

    public a(DateTime dateTime, DateTime dateTime2, int i14, View view2) {
        dateTime.getClass();
        dateTime2.getClass();
        view2.getClass();
        Context context = view2.getContext();
        this.f206815a = context;
        View viewFindViewById = view2.findViewById(R.id.legend_view);
        CustomLegendView customLegendView = (CustomLegendView) viewFindViewById;
        String string = customLegendView.getContext().getString(R.string.lbl_lactate_threshold);
        string.getClass();
        customLegendView.setChartTitle(string);
        viewFindViewById.getClass();
        CustomLegendView customLegendView2 = (CustomLegendView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.chart_view_v3);
        viewFindViewById2.getClass();
        CustomLineChart customLineChart = (CustomLineChart) viewFindViewById2;
        context.getClass();
        this.f206816b = new at0.d<>(customLineChart, new at0.a(context, i14, dateTime, dateTime2), new at0.b(customLineChart, i14), null, null, customLegendView2, 24, null);
        View viewFindViewById3 = view2.findViewById(R.id.gcm_stats_row_1);
        viewFindViewById3.getClass();
        this.f206817c = (ComposeView) viewFindViewById3;
    }

    @Override // e32.p
    public final void a() {
        this.f206816b.c();
        d(null, null, null, null, null);
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(o13.p<? extends LactateSummaryMeasurementsDTO, ? extends vs0.a> pVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e32.p
    public final void c(o13.p<? extends LactateSummaryMeasurementsDTO, ? extends vs0.a> pVar) {
        vs0.a aVar;
        o13.p<? extends LactateSummaryMeasurementsDTO, ? extends vs0.a> pVar2 = pVar;
        LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO = pVar2 != null ? (LactateSummaryMeasurementsDTO) pVar2.f128594a : null;
        Context context = this.f206815a;
        qz.a.b(this.f206816b, lactateSummaryMeasurementsDTO, context.getString(R.string.txt_empty_page_no_data), 4);
        if (pVar2 == null || (aVar = (vs0.a) pVar2.f128595b) == null) {
            return;
        }
        String strL0 = l3.a.l0(l3.f23124b, new l22.a(context), aVar.f179717b, false);
        if (TextUtils.isEmpty(strL0)) {
            strL0 = context.getString(R.string.no_value);
            strL0.getClass();
        }
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        h hVar = new h(context);
        ft0.a aVar2 = ft0.a.f73439a;
        xs0.a aVar3 = aVar.f179716a;
        double d14 = aVar.f179718c;
        String string = context.getString(R.string.no_duration_value);
        string.getClass();
        aVar2.getClass();
        String strA = ft0.a.a(context, aVar3, d14, zY, false, string);
        xs0.a aVar4 = aVar.f179716a;
        double d15 = aVar.f179718c;
        String string2 = context.getString(R.string.txt_empty_page_no_data);
        string2.getClass();
        d(ft0.a.c(context, aVar.f179716a, zY, true), strL0, strA, context.getString(R.string.lbl_current_lactate_threshold_bpm, xy2.b.O(context, strL0)), context.getString(R.string.string_space_string_pattern, context.getString(R.string.lbl_pace), ft0.a.b(context, hVar, aVar4, d15, zY, true, string2)));
    }

    public final void d(String str, String str2, String str3, String str4, String str5) {
        Context context = this.f206815a;
        if (str2 == null) {
            str2 = context.getString(R.string.no_value);
            str2.getClass();
        }
        String str6 = str2;
        if (str3 == null) {
            str3 = context.getString(R.string.no_duration_value);
            str3.getClass();
        }
        this.f206817c.setContent(new z3.e(675375748, true, new xy.c(str6, str4, str3, str, str5, 1, (byte) 0)));
    }
}
