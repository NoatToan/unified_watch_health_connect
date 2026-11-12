package fb1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f70291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f70292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70293d;

    public /* synthetic */ q0(Context context, int i14, int i15, int i16) {
        this.f70290a = i16;
        this.f70291b = context;
        this.f70292c = i14;
        this.f70293d = i15;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object string;
        String string2;
        int i14;
        String string3;
        String strValueOf;
        p5.k0 k0Var = (p5.k0) obj;
        switch (this.f70290a) {
            case 0:
                k0Var.getClass();
                tb1.e.f163745a.getClass();
                Context context = this.f70291b;
                context.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i15 = this.f70292c;
                if (i15 < 1) {
                    string = context.getString(R.string.txt_empty_page_no_data);
                    string.getClass();
                } else if (this.f70293d < ww0.q.FIRST.f187646a) {
                    string = context.getString(R.string.txt_empty_page_no_data);
                    string.getClass();
                } else if (i15 >= 295.0f) {
                    string = spannableStringBuilder.append((CharSequence) "42").append((CharSequence) Marker.ANY_NON_NULL_MARKER).append((CharSequence) StringUtils.SPACE).append((CharSequence) context.getString(R.string.pregnancy_weeks));
                    string.getClass();
                } else {
                    int i16 = i15 - 1;
                    o13.p pVar = new o13.p(Integer.valueOf(i16 / 7), Integer.valueOf((i16 % 7) + 1));
                    string = new oi0.a(new l22.a(context)).b(((Number) pVar.f128594a).intValue(), ((Number) pVar.f128595b).intValue());
                }
                p5.h0.n(k0Var, string.toString());
                break;
            case 1:
                k0Var.getClass();
                Context context2 = this.f70291b;
                int i17 = this.f70292c;
                if (i17 < 0 || (i14 = this.f70293d) < 0) {
                    string2 = context2.getString(R.string.txt_empty_page_no_data);
                    string2.getClass();
                } else {
                    string2 = context2.getString(R.string.lbl_body_battery_score_detailed, String.valueOf(i14), String.valueOf(i17));
                    string2.getClass();
                }
                p5.h0.n(k0Var, string2);
                break;
            default:
                k0Var.getClass();
                Context context3 = this.f70291b;
                x00.a aVar = new x00.a(context3);
                int i18 = this.f70292c;
                int i19 = this.f70293d;
                String strD = (i18 == 0 && i19 == 0) ? aVar.d() : aVar.b(Integer.valueOf(i18));
                if (i19 > 0) {
                    String strB = aVar.b(Integer.valueOf(i19));
                    Integer numG = oe2.f.g(i19, Integer.valueOf(i18));
                    if (numG == null || (strValueOf = String.valueOf(numG.intValue())) == null) {
                        strValueOf = "";
                    }
                    string3 = context3.getString(R.string.lbl_intensity_minutes_pie_chart_weekly_goal, strD, strB, strValueOf);
                } else {
                    string3 = context3.getString(R.string.lbl_intensity_minutes_pie_chart_value_only, strD);
                }
                string3.getClass();
                p5.h0.n(k0Var, xy2.b.O(context3, string3));
                break;
        }
        return Unit.INSTANCE;
    }
}
