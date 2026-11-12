package ot;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lot/c0;", "Lot/b0;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/r;", "stepsData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/r;Lot/x;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends b0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tt.r f133575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f133576t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, tt.r rVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133575s = rVar;
        this.f133576t = "StepsChapter";
    }

    @Override // ot.b0
    public final boolean A() {
        tt.r rVar = this.f133575s;
        if ((rVar != null ? rVar.getTotalStepDistance() : null) == null || rVar.getMarathonCount() == null) {
            return true;
        }
        Integer marathonCount = rVar.getMarathonCount();
        return marathonCount != null && marathonCount.intValue() == 0;
    }

    @Override // ot.b0
    public final String B(Context context) {
        DateTime mostStepDate;
        context.getClass();
        tt.r rVar = this.f133575s;
        if (rVar == null || (mostStepDate = rVar.getMostStepDate()) == null) {
            return "";
        }
        pt.h.f140570a.getClass();
        return pt.h.a(mostStepDate);
    }

    @Override // ot.b0
    public final String C(Context context) {
        return androidx.room.a0.e(R.string.personal_records_label_steps_best_day, context);
    }

    @Override // ot.b0
    public final String D(Context context) {
        Integer mostDailySteps;
        context.getClass();
        tt.r rVar = this.f133575s;
        if (rVar == null || (mostDailySteps = rVar.getMostDailySteps()) == null) {
            return "";
        }
        int iIntValue = mostDailySteps.intValue();
        l3.f23124b.getClass();
        String str = l3.f23131i.format(Integer.valueOf(iIntValue));
        return str == null ? "" : str;
    }

    @Override // ot.b0
    public final String E(Context context) {
        pt.h hVar = pt.h.f140570a;
        tt.r rVar = this.f133575s;
        DateTime longestStepGoalStartDate = rVar != null ? rVar.getLongestStepGoalStartDate() : null;
        hVar.getClass();
        return e5.g(pt.h.a(longestStepGoalStartDate), " - ", pt.h.a(rVar != null ? rVar.getLongestStepGoalEndDate() : null));
    }

    @Override // ot.b0
    public final String F(Context context) {
        String string = context.getString(R.string.personal_records_label_steps_longest_streak);
        string.getClass();
        return string;
    }

    @Override // ot.b0
    public final String G(Context context) {
        Integer longestStepGoalDayCount;
        tt.r rVar = this.f133575s;
        if (rVar == null || (longestStepGoalDayCount = rVar.getLongestStepGoalDayCount()) == null) {
            return "";
        }
        int iIntValue = longestStepGoalDayCount.intValue();
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.challenge_time_remaining_days);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
    }

    @Override // ot.b0
    public final int H() {
        return R.string.lbl_steps;
    }

    @Override // ot.b0
    public final String I(Context context) {
        Integer totalSteps;
        context.getClass();
        tt.r rVar = this.f133575s;
        if (rVar == null || (totalSteps = rVar.getTotalSteps()) == null) {
            return "";
        }
        int iIntValue = totalSteps.intValue();
        l3.f23124b.getClass();
        String str = l3.f23131i.format(Integer.valueOf(iIntValue));
        return str == null ? "" : str;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133666o() {
        return this.f133576t;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/steps";
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.STEPS_PUSHES;
    }

    @Override // ot.b0, ot.l
    public final Map<String, String> l() {
        return t0.b(new o13.p("image_0", "sharing_bg.png"));
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133575s == null || e() == null) ? false : true;
    }

    @Override // ot.b0
    public final String r(Number number, Context context) {
        context.getClass();
        number.getClass();
        l3.f23124b.getClass();
        String str = l3.f23131i.format(number);
        str.getClass();
        return str;
    }

    @Override // ot.b0
    public final String s(Context context) {
        context.getClass();
        tt.r rVar = this.f133575s;
        if ((rVar != null ? rVar.getTotalStepDistance() : null) == null || rVar.getTotalStepDistance().intValue() <= 0 || rVar.getMarathonCount() == null || rVar.getMarathonCount().intValue() <= 0) {
            return null;
        }
        return pt.i.j(rVar.getTotalStepDistance().intValue(), rVar.getMarathonCount().intValue(), context);
    }

    @Override // ot.b0
    public final String t(Context context) {
        String string = context.getString(R.string.annual_report_distance_intro_text);
        string.getClass();
        return string;
    }

    @Override // ot.b0
    public final int u() {
        return R.color.gcm_annual_report_steps_month_bar;
    }

    @Override // ot.b0
    public final List<Number> v() {
        tt.r rVar = this.f133575s;
        if (rVar != null) {
            return rVar.e();
        }
        return null;
    }

    @Override // ot.b0
    public final int w() {
        return R.string.annual_report_steps_month_chart_title;
    }

    @Override // ot.b0
    public final String x() {
        return "StepsChapter";
    }

    @Override // ot.b0
    public final boolean y() {
        return true;
    }

    @Override // ot.b0
    public final boolean z() {
        tt.r rVar = this.f133575s;
        return ((rVar != null ? rVar.getLongestStepGoalDayCount() : null) == null || rVar.getLongestStepGoalDayCount().intValue() <= 0 || rVar.getLongestStepGoalStartDate() == null || rVar.getLongestStepGoalEndDate() == null) ? false : true;
    }
}
