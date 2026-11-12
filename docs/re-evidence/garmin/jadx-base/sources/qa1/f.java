package qa1;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c22.i;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e32.l;
import e32.p;
import g22.n;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lqa1/f;", "Le32/p;", "Lna1/c;", "Landroid/view/View;", "view", "Le32/l;", "Lja1/c;", "navigator", "", "intervalType", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lma1/a;", "powerCurveSport", "<init>", "(Landroid/view/View;Le32/l;ILorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lma1/a;)V", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements p<na1.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f143881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tz.a<na1.c> f143882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f143883d;

    /* JADX WARN: Code duplicated, block: B:17:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0135  */
    /* JADX WARN: Code duplicated, block: B:9:0x0071  */
    public f(View view2, l<ja1.c> lVar, int i14, LocalDate localDate, LocalDate localDate2, ma1.a aVar) {
        int i15;
        int i16;
        int i17;
        view2.getClass();
        lVar.getClass();
        localDate.getClass();
        localDate2.getClass();
        aVar.getClass();
        Context context = view2.getContext();
        context.getClass();
        String string = context.getString(R.string.common_no_certain_data, context.getString(R.string.power_curve_label));
        string.getClass();
        this.f143880a = string;
        View viewFindViewById = view2.findViewById(R.id.chart_title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.chart_view);
        viewFindViewById2.getClass();
        CustomLineChart customLineChart = (CustomLineChart) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.power_records_layout);
        viewFindViewById3.getClass();
        this.f143881b = (ConstraintLayout) viewFindViewById3;
        if (i14 == 5) {
            i15 = R.string.lbl_4_weeks;
        } else if (i14 == 11) {
            i15 = R.string.lbl_3_months;
        } else if (i14 != 12) {
            i15 = R.string.lbl_4_weeks;
        } else {
            i15 = R.string.lbl_one_year;
        }
        String string2 = context.getString(i15);
        string2.getClass();
        String strH = n.h(string2);
        if (i14 == 5) {
            i16 = R.string.power_curve_no_four_week_data;
        } else if (i14 == 11) {
            i16 = R.string.power_curve_no_three_month_data;
        } else if (i14 != 12) {
            i16 = R.string.power_curve_no_four_week_data;
        } else {
            i16 = R.string.power_curve_no_twelve_month_data;
        }
        String string3 = context.getString(i16);
        string3.getClass();
        this.f143882c = new tz.a<>(customLineChart, new la1.a(context, localDate, localDate2, strH, string3), new la1.d(customLineChart), new la1.b(customLineChart), new la1.c(customLineChart, strH), null, 32, null);
        b bVar = new b(context, new dp1.e(lVar, 2));
        this.f143883d = bVar;
        if (i14 == 5) {
            int i18 = g.f143884a[aVar.ordinal()];
            if (i18 != 1) {
                if (i18 != 2) {
                    u0.r();
                    throw null;
                }
                i17 = R.string.lbl_4_week_rowing_power_curve;
            } else {
                i17 = R.string.lbl_4_week_cycling_power_curve;
            }
        } else if (i14 == 11) {
            int i19 = g.f143884a[aVar.ordinal()];
            if (i19 == 1) {
                i17 = R.string.lbl_3_month_cycling_power_curve;
            } else {
                if (i19 != 2) {
                    u0.r();
                    throw null;
                }
                i17 = R.string.lbl_3_month_rowing_power_curve;
            }
        } else if (i14 != 12) {
            int i24 = g.f143884a[aVar.ordinal()];
            if (i24 != 1) {
                if (i24 != 2) {
                    u0.r();
                    throw null;
                }
                i17 = R.string.lbl_4_week_rowing_power_curve;
            } else {
                i17 = R.string.lbl_4_week_cycling_power_curve;
            }
        } else {
            int i25 = g.f143884a[aVar.ordinal()];
            if (i25 == 1) {
                i17 = R.string.lbl_1_year_cycling_power_curve;
            } else {
                if (i25 != 2) {
                    u0.r();
                    throw null;
                }
                i17 = R.string.lbl_1_year_rowing_power_curve;
            }
        }
        Parcelable.Creator<i> creator = i.CREATOR;
        String string4 = context.getString(i17);
        string4.getClass();
        textView.setText(string4);
        new e32.g(null, view2, null, 1, null).a(bVar);
    }

    @Override // e32.p
    public final void a() {
        qz.a.b(this.f143882c, null, this.f143880a, 4);
        v22.e.j(this.f143881b);
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(na1.c cVar) {
        return false;
    }

    @Override // e32.p
    public final void c(na1.c cVar) {
        na1.c cVar2 = cVar;
        qz.a.b(this.f143882c, cVar2, this.f143880a, 4);
        List<na1.a> list = cVar2 != null ? cVar2.f125206b : null;
        b bVar = this.f143883d;
        ArrayList arrayList = bVar.f143872f;
        arrayList.clear();
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        bVar.notifyDataSetChanged();
        List<na1.a> list2 = cVar2 != null ? cVar2.f125206b : null;
        v22.e.v(this.f143881b, true ^ (list2 == null || list2.isEmpty()));
    }
}
