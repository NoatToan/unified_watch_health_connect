package d61;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import e32.p;
import java.util.List;
import k00.m;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld61/d;", "Le32/p;", "", "Lx61/e;", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lc61/a;", "acclimationType", "Landroid/view/View;", "view", "", "customTitle", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lc61/a;Landroid/view/View;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements p<List<? extends x61.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c61.a f57980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f57981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sz.a<List<x61.e>> f57982c;

    public d(LocalDate localDate, LocalDate localDate2, c61.a aVar, View view2, String str) {
        String string;
        localDate.getClass();
        localDate2.getClass();
        aVar.getClass();
        view2.getClass();
        this.f57980a = aVar;
        Context context = view2.getContext();
        this.f57981b = context;
        View viewFindViewById = view2.findViewById(R.id.chart_acclimation_summary);
        viewFindViewById.getClass();
        CustomCombinedChart customCombinedChart = (CustomCombinedChart) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.view_custom_legend);
        CustomLegendView customLegendView = (CustomLegendView) viewFindViewById2;
        if (str == null) {
            string = customLegendView.getContext().getString(R.string.lbl_daily_progress);
            string.getClass();
        } else {
            string = str;
        }
        customLegendView.setChartTitle(string);
        viewFindViewById2.getClass();
        context.getClass();
        this.f57982c = new sz.a<>(customCombinedChart, new e61.c(context, localDate, localDate2, aVar), new e61.d(customCombinedChart, localDate, localDate2, aVar), new m(customCombinedChart), null, (CustomLegendView) viewFindViewById2, 16, null);
        TextView textView = (TextView) view2.findViewById(R.id.text_view_daily_progress);
        if (str != null) {
            textView.setText(str);
            textView.setContentDescription(str);
        }
        textView.getContext().getString(R.string.lbl_chart_ada_content_description, textView.getText());
    }

    @Override // e32.p
    public final void a() {
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(List<? extends x61.e> list) {
        return false;
    }

    @Override // e32.p
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(List<x61.e> list) {
        b61.b.f16165a.getClass();
        c61.a aVar = this.f57980a;
        boolean zD = b61.b.d(b61.b.b(list, aVar));
        sz.a<List<x61.e>> aVar2 = this.f57982c;
        if (zD) {
            qz.a.b(aVar2, list, null, 6);
            return;
        }
        if (aVar == c61.a.ALTITUDE) {
            i00.b f63187e = aVar2.f161314c.getF63187e();
            f63187e.f();
            f63187e.g();
            f63187e.h();
            aVar2.c();
        }
        qz.a.b(aVar2, null, this.f57981b.getString(R.string.msg_no_data_available), 4);
    }

    public /* synthetic */ d(LocalDate localDate, LocalDate localDate2, c61.a aVar, View view2, String str, int i14, j jVar) {
        this(localDate, localDate2, aVar, view2, (i14 & 16) != 0 ? null : str);
    }
}
