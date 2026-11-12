package a71;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La71/o;", "", "Landroid/view/View;", "view", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/view/View;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f1792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f1793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CustomLineChart f1794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f1795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ComposeView f1796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f1797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f1798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k32.e<String> f1799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b71.h f1800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ComposeView f1801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1802m;

    public o(View view2, LocalDate localDate, LocalDate localDate2) {
        view2.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f1790a = view2;
        View viewFindViewById = view2.findViewById(R.id.chart_acute_load);
        viewFindViewById.getClass();
        this.f1791b = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.load_ratio_container);
        viewFindViewById2.getClass();
        this.f1792c = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.load_ratio_chart_title);
        viewFindViewById3.getClass();
        this.f1793d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.load_ratio_summary_chart);
        viewFindViewById4.getClass();
        CustomLineChart customLineChart = (CustomLineChart) viewFindViewById4;
        this.f1794e = customLineChart;
        View viewFindViewById5 = view2.findViewById(R.id.load_ratio_stats_container);
        viewFindViewById5.getClass();
        this.f1795f = (ViewGroup) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.load_ratio_tab_no_data);
        viewFindViewById6.getClass();
        this.f1796g = (ComposeView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.load_ratio_value);
        viewFindViewById7.getClass();
        this.f1797h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.load_ratio_message);
        viewFindViewById8.getClass();
        this.f1798i = (TextView) viewFindViewById8;
        k32.e<String> eVar = new k32.e<>(viewFindViewById.findViewById(R.id.chart_chronic_option), "", true);
        eVar.d(R.string.chronic_load_title);
        eVar.a(false);
        this.f1799j = eVar;
        b71.j.a aVar = b71.j.f16342m;
        Context context = view2.getContext();
        context.getClass();
        aVar.getClass();
        this.f1800k = new b71.h(customLineChart, new b71.j(context, localDate, localDate2, new i(new l22.a(context), new pi0.e(context))), new b71.l(customLineChart, localDate, localDate2), new k00.j(customLineChart), new k00.g(customLineChart));
        this.f1801l = (ComposeView) view2.findViewById(R.id.load_ratio_stats_row);
        this.f1802m = z.b(R.string.msg_no_data_available, view2);
    }

    public final void a(e eVar) {
        Integer num;
        boolean z14 = false;
        ComposeView composeView = this.f1796g;
        if (eVar == null) {
            composeView.setContent(new z3.e(114057094, true, new j(this, 0)));
            composeView.setVisibility(0);
            return;
        }
        boolean z15 = eVar.f1760j;
        ViewGroup viewGroup = this.f1792c;
        v22.e.v(viewGroup, z15);
        k kVar = new k(eVar.f1764n, 0);
        k32.e<String> eVar2 = this.f1799j;
        Button button = eVar2.f102679d;
        if (button != null) {
            button.setOnClickListener(kVar);
        }
        eVar2.a(eVar.f1761k);
        c cVar = eVar.f1763m;
        if (cVar == null) {
            v22.e.v(composeView, z15);
            return;
        }
        v22.e.v(this.f1793d, cVar.f1730b);
        v22.e.v(this.f1794e, cVar.f1731c);
        Boolean bool = cVar.f1733e;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            b71.h hVar = this.f1800k;
            if (zBooleanValue) {
                qz.a.b(hVar, null, this.f1802m, 4);
            } else {
                qz.a.b(hVar, eVar, null, 6);
            }
        }
        v22.e.v(this.f1795f, cVar.f1732d);
        if (z15 && cVar.f1734f) {
            z14 = true;
        }
        v22.e.v(composeView, z14);
        if (z14 && (num = cVar.f1735g) != null) {
            int iIntValue = num.intValue();
            Integer num2 = cVar.f1736h;
            if (num2 != null) {
                composeView.setContent(new z3.e(389676732, true, new l(iIntValue, num2.intValue(), 0)));
            }
        }
        v22.e.v(viewGroup, cVar.f1729a);
        ComposeView composeView2 = this.f1801l;
        if (composeView2 != null) {
            composeView2.setContent(new z3.e(-2067614527, true, new m(eVar, 0)));
        }
        String str = eVar.f1753c;
        TextView textView = this.f1798i;
        TextView textView2 = this.f1797h;
        if (str == null || str.length() == 0) {
            v22.e.j(textView2);
            v22.e.j(textView);
        } else {
            textView2.setText(eVar.f1754d);
            textView.setText(eVar.f1755e);
        }
    }
}
