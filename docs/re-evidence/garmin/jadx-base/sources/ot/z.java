package ot;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lot/z;", "Lot/b0;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/q;", "sleepScoreData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/q;Lot/x;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends b0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tt.q f133704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f133705t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, tt.q qVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133704s = qVar;
        this.f133705t = "SleepScoreChapter";
    }

    @Override // ot.b0
    public final boolean A() {
        tt.q qVar = this.f133704s;
        return (qVar != null ? qVar.getSleepQualityTypeCount() : null) == null || qVar.getSleepQualityType() == null;
    }

    @Override // ot.b0
    public final String C(Context context) {
        return androidx.room.a0.e(R.string.annual_report_sleep_score_highest_title, context);
    }

    @Override // ot.b0
    public final String D(Context context) {
        Integer highestSleepScore;
        String strValueOf;
        context.getClass();
        tt.q qVar = this.f133704s;
        return (qVar == null || (highestSleepScore = qVar.getHighestSleepScore()) == null || (strValueOf = String.valueOf(highestSleepScore.intValue())) == null) ? "" : strValueOf;
    }

    @Override // ot.b0
    public final String F(Context context) {
        String string = context.getString(R.string.lbl_avg_sleep_duration);
        string.getClass();
        return string;
    }

    @Override // ot.b0
    public final String G(Context context) {
        Integer avgSleepSeconds;
        tt.q qVar = this.f133704s;
        if (qVar == null || (avgSleepSeconds = qVar.getAvgSleepSeconds()) == null) {
            return "";
        }
        int iIntValue = avgSleepSeconds.intValue();
        pt.h.f140570a.getClass();
        return pt.h.c(iIntValue, context);
    }

    @Override // ot.b0
    public final int H() {
        return R.string.lbl_sleep_score;
    }

    @Override // ot.b0
    public final String I(Context context) {
        Integer avgSleepScore;
        String strValueOf;
        context.getClass();
        tt.q qVar = this.f133704s;
        return (qVar == null || (avgSleepScore = qVar.getAvgSleepScore()) == null || (strValueOf = String.valueOf(avgSleepScore.intValue())) == null) ? "" : strValueOf;
    }

    @Override // ot.b0
    public final String J(Context context) {
        return androidx.room.a0.e(R.string.annual_report_sleep_score_avg_score_unit, context);
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133677s() {
        return this.f133705t;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/sleep_score";
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.SLEEP_SCORE;
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133704s == null || e() == null) ? false : true;
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
        String sleepQualityType;
        context.getClass();
        tt.q qVar = this.f133704s;
        if ((qVar != null ? qVar.getSleepQualityTypeCount() : null) == null || qVar.getSleepQualityTypeCount().intValue() <= 0 || (sleepQualityType = qVar.getSleepQualityType()) == null || sleepQualityType.length() <= 0) {
            return null;
        }
        Integer sleepQualityTypeCount = qVar.getSleepQualityTypeCount();
        sleepQualityTypeCount.intValue();
        String sleepQualityType2 = qVar.getSleepQualityType();
        pt.i iVar = pt.i.f140571a;
        sleepQualityType2.getClass();
        String lowerCase = new b10.d(context).c(sleepQualityType2).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.annual_report_sleep_score_fun_fact);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{sleepQualityTypeCount, lowerCase}, 2));
    }

    @Override // ot.b0
    public final String t(Context context) {
        String avgSleepQualityType;
        tt.q qVar = this.f133704s;
        if (qVar == null || (avgSleepQualityType = qVar.getAvgSleepQualityType()) == null || avgSleepQualityType.length() <= 0) {
            return null;
        }
        String avgSleepQualityType2 = qVar.getAvgSleepQualityType();
        pt.i iVar = pt.i.f140571a;
        avgSleepQualityType2.getClass();
        String upperCase = new b10.d(context).c(avgSleepQualityType2).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.annual_report_sleep_score_intro_text);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{upperCase}, 1));
    }

    @Override // ot.b0
    public final int u() {
        return R.color.gcm_annual_report_sleep_score_month_bar;
    }

    @Override // ot.b0
    public final List<Integer> v() {
        tt.q qVar = this.f133704s;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    @Override // ot.b0
    public final int w() {
        return R.string.annual_report_sleep_score_month_chart_title;
    }

    @Override // ot.b0
    public final String x() {
        return "SleepScoreChapter";
    }

    @Override // ot.b0
    public final boolean y() {
        return true;
    }

    @Override // ot.b0
    public final boolean z() {
        return true;
    }
}
