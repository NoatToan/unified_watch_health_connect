package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.symptoms;

import a7.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/symptoms/a;", "Lmx0/a;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/symptoms/PregnancyFourWeekGridChartView$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends mx0.a<PregnancyFourWeekGridChartView.b> {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.symptoms.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/symptoms/a$a;", "Lmx0/a$a;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/symptoms/PregnancyFourWeekGridChartView$b;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0769a extends mx0.a.AbstractC2298a<PregnancyFourWeekGridChartView.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f40855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PregnancyFourWeekGridChartView f40856b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0769a(View view2) {
            super(view2);
            view2.getClass();
            this.f40855a = (TextView) view2.findViewById(R.id.view_grid_chart_title);
            this.f40856b = (PregnancyFourWeekGridChartView) view2.findViewById(R.id.view_grid_chart);
        }

        @Override // mx0.a.AbstractC2298a
        public final void d(PregnancyFourWeekGridChartView.b bVar) {
            PregnancyFourWeekGridChartView.b bVar2 = bVar;
            bVar2.getClass();
            this.f40855a.setText(bVar2.f40847a);
            int i14 = bVar2.f40848b;
            List<PregnancyFourWeekGridChartView.c> list = bVar2.f40849c;
            int i15 = bVar2.f40850d;
            List<String> list2 = bVar2.f40851e;
            PregnancyFourWeekGridChartView pregnancyFourWeekGridChartView = this.f40856b;
            pregnancyFourWeekGridChartView.getClass();
            pregnancyFourWeekGridChartView.f40844h = i14;
            pregnancyFourWeekGridChartView.f40839c.setColor(b.getColor(pregnancyFourWeekGridChartView.getContext(), i15));
            pregnancyFourWeekGridChartView.f40843g = list;
            pregnancyFourWeekGridChartView.f40846j = list2;
            pregnancyFourWeekGridChartView.requestLayout();
            pregnancyFourWeekGridChartView.invalidate();
            String str = "";
            for (PregnancyFourWeekGridChartView.c cVar : list) {
                String str2 = "";
                String str3 = str2;
                int i16 = 0;
                for (Object obj : cVar.f40854b) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        x.q();
                        throw null;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        int i18 = i16 / 7;
                        List<Integer> list3 = bVar2.f40852f;
                        int iC = 1;
                        int iMin = Math.min(pregnancyFourWeekGridChartView.f40844h - 1, !list3.isEmpty() ? list3.size() : 4);
                        if (!list3.isEmpty() && list3.size() > i18) {
                            iC = list3.get(i18).intValue();
                        } else if (i18 != 0) {
                            int i19 = iMin - 1;
                            int i24 = pregnancyFourWeekGridChartView.f40844h;
                            iC = i18 == i19 ? i24 : MathKt.c((i18 / i19) * i24);
                        }
                        if (!w.z(str2, String.valueOf(iC), false)) {
                            str2 = ((Object) str2) + StringUtils.SPACE + this.itemView.getContext().getString(R.string.lbl_week_number, String.valueOf(iC)) + ", ";
                        }
                        if (str3.length() > 0) {
                            str3 = ((Object) str3) + ", ";
                        }
                        int i25 = i17 % 7;
                        str3 = ((Object) str3) + (i25 == 0 ? "7" : String.valueOf(i25));
                    }
                    if (i17 % 7 == 0 && str3.length() > 0) {
                        String string = this.itemView.getContext().getString(R.string.lbl_day_number, str3);
                        str3 = "";
                        str2 = ((Object) str2) + StringUtils.SPACE + string + ".";
                    }
                    i16 = i17;
                }
                str = ((Object) str) + StringUtils.SPACE + cVar.f40853a + StringUtils.SPACE + ((Object) str2);
            }
            pregnancyFourWeekGridChartView.setContentDescription(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
    }

    @Override // mx0.a
    public final mx0.a.AbstractC2298a r(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.view_grid_chart_pregnancy_4w, viewGroup, false);
        viewInflate.getClass();
        return new C0769a(viewInflate);
    }
}
