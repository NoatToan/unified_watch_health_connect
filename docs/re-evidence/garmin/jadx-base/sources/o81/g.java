package o81;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.b0;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.u;
import q81.o;
import u61.i;
import u61.j;
import x61.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo81/g;", "Lcom/garmin/android/apps/connectmobile/b0;", "Lo81/f;", "supportingStat", "Lu81/a;", "dailyDetails", "<init>", "(Lo81/f;Lu81/a;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f130840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u81.a f130841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f130842h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, u81.a aVar) {
        super(R.layout.close_action_bottom_sheet_header, R.layout.supporting_stats_bottom_sheet, false, false, false, 28, null);
        fVar.getClass();
        aVar.getClass();
        this.f130840f = fVar;
        this.f130841g = aVar;
        this.f130842h = new o();
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        Integer numValueOf;
        String string;
        String string2;
        this.f130842h.getClass();
        u81.a aVar = this.f130841g;
        aVar.getClass();
        Double d14 = aVar.f169464f;
        f fVar = this.f130840f;
        fVar.getClass();
        if (fVar == f.VO2_MAX) {
            HorseshoePieChart horseshoePieChart = (HorseshoePieChart) view2.findViewById(R.id.supporting_stat_pie_chart);
            horseshoePieChart.getClass();
            Context context = view2.getContext();
            context.getClass();
            vz.a aVar2 = new vz.a(horseshoePieChart, new i(context), new j(horseshoePieChart));
            a61.e.f1563a.getClass();
            List<Double> listE0 = u.e0(a61.e.g());
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            Double d15 = aVar.f169465g;
            double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
            Context context2 = view2.getContext();
            context2.getClass();
            q71.a aVarB = a61.e.b(d14 != null ? d14.doubleValue() : 0.0d, a61.e.g());
            if (aVarB == q71.a.POOR) {
                string2 = context2.getString(R.string.lbl_poor);
                string2.getClass();
            } else {
                string2 = context2.getString(aVarB.f143227a);
                string2.getClass();
            }
            aVar2.a(new t(listE0, dDoubleValue, dDoubleValue2, string2, null, null, null, false, 112, null));
        } else {
            HorseshoePieChart horseshoePieChart2 = (HorseshoePieChart) view2.findViewById(R.id.supporting_stat_pie_chart);
            horseshoePieChart2.getClass();
            Context context3 = view2.getContext();
            context3.getClass();
            new vz.a(horseshoePieChart2, new r81.c(context3, fVar), new t71.g(horseshoePieChart2)).a(aVar);
        }
        int[] iArr = o.a.f143356a;
        int i14 = iArr[fVar.ordinal()];
        String strA = null;
        if (i14 == 1) {
            numValueOf = aVar.f169462d;
        } else if (i14 == 2) {
            numValueOf = aVar.f169463e;
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            numValueOf = d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Context context4 = view2.getContext();
        TextView textView = (TextView) view2.findViewById(R.id.supporting_stat_feedback_phrase);
        int i15 = iArr[fVar.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                context4.getClass();
                try {
                    strA = o.a(context4, iIntValue);
                } catch (NumberFormatException unused) {
                }
            } else if (iIntValue < 0 || iIntValue >= 30) {
                string = (30 > iIntValue || iIntValue >= 70) ? context4.getString(R.string.hill_endurance_feedback_phrase_high) : context4.getString(R.string.hill_endurance_feedback_phrase_moderate);
            } else {
                string = context4.getString(R.string.hill_endurance_feedback_phrase_low);
            }
            textView.setText(strA);
            String string3 = textView.getText().toString();
            Context context5 = view2.getContext();
            context5.getClass();
            textView.setContentDescription(oi0.c.A(context5, new po2.o(26), string3));
        }
        if (iIntValue < 0 || iIntValue >= 30) {
            string = (30 > iIntValue || iIntValue >= 70) ? context4.getString(R.string.hill_strength_feedback_phrase_high) : context4.getString(R.string.hill_strength_feedback_phrase_moderate);
        } else {
            string = context4.getString(R.string.hill_strength_feedback_phrase_low);
        }
        strA = string;
        textView.setText(strA);
        String string4 = textView.getText().toString();
        Context context6 = view2.getContext();
        context6.getClass();
        textView.setContentDescription(oi0.c.A(context6, new po2.o(26), string4));
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void v6(View view2) {
        int i14;
        n82.i iVar = new n82.i(this, 16);
        this.f130842h.getClass();
        f fVar = this.f130840f;
        fVar.getClass();
        TextView textView = (TextView) view2.findViewById(R.id.bottom_sheet_header_tv);
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_subhead_tv);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(8);
        int i15 = o.a.f143356a[fVar.ordinal()];
        if (i15 == 1) {
            i14 = R.string.lbl_hill_strength;
        } else if (i15 == 2) {
            i14 = R.string.lbl_hill_endurance;
        } else {
            if (i15 != 3) {
                u0.r();
                return;
            }
            i14 = R.string.lbl_vo2_max;
        }
        textView.setText(i14);
        String string = textView.getText().toString();
        Context context = view2.getContext();
        context.getClass();
        textView.setContentDescription(oi0.c.A(context, new po2.o(27), string));
        ((ImageView) view2.findViewById(R.id.bottom_sheet_close_iv)).setOnClickListener(new oq.a(iVar, 7));
    }
}
