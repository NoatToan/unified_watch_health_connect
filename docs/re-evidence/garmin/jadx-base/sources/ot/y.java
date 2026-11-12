package ot;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lot/y;", "Lot/b0;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/p;", "sleepData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/p;Lot/x;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends b0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tt.p f133702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f133703t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, tt.p pVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133702s = pVar;
        this.f133703t = "SleepChapter";
    }

    @Override // ot.b0
    public final boolean A() {
        tt.p pVar = this.f133702s;
        return (pVar != null ? pVar.getEightHoursSleepCount() : null) == null || pVar.getEightHoursSleepCount().intValue() < 2;
    }

    @Override // ot.b0
    public final String C(Context context) {
        return androidx.room.a0.e(R.string.lbl_avg_bedtime, context);
    }

    @Override // ot.b0
    public final String D(Context context) {
        Integer avgLocalSleepStartTime;
        context.getClass();
        tt.p pVar = this.f133702s;
        if (pVar == null || (avgLocalSleepStartTime = pVar.getAvgLocalSleepStartTime()) == null) {
            return "";
        }
        int iIntValue = avgLocalSleepStartTime.intValue();
        pt.h.f140570a.getClass();
        return new b10.d(new pt.b(context).f140561a).f(iIntValue);
    }

    @Override // ot.b0
    public final String F(Context context) {
        String string = context.getString(R.string.lbl_avg_wake_time);
        string.getClass();
        return string;
    }

    @Override // ot.b0
    public final String G(Context context) {
        Integer avgLocalSleepEndTime;
        tt.p pVar = this.f133702s;
        if (pVar == null || (avgLocalSleepEndTime = pVar.getAvgLocalSleepEndTime()) == null) {
            return "";
        }
        int iIntValue = avgLocalSleepEndTime.intValue();
        pt.h.f140570a.getClass();
        return new b10.d(new pt.b(context).f140561a).f(iIntValue);
    }

    @Override // ot.b0
    public final int H() {
        return R.string.concept_sleep;
    }

    @Override // ot.b0
    public final String I(Context context) {
        Integer avgSleepSeconds;
        context.getClass();
        tt.p pVar = this.f133702s;
        if (pVar == null || (avgSleepSeconds = pVar.getAvgSleepSeconds()) == null) {
            return "";
        }
        int iIntValue = avgSleepSeconds.intValue();
        pt.h.f140570a.getClass();
        return pt.h.c(iIntValue, context);
    }

    @Override // ot.b0
    public final String J(Context context) {
        return androidx.room.a0.e(R.string.annual_report_sleep_avg_duration_unit, context);
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133671n() {
        return this.f133703t;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/sleep";
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.SLEEP_SCORE;
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133702s == null || e() == null) ? false : true;
    }

    @Override // ot.b0
    public final String r(Number number, Context context) {
        context.getClass();
        number.getClass();
        pt.h hVar = pt.h.f140570a;
        int iIntValue = number.intValue();
        hVar.getClass();
        return pt.h.c(iIntValue, context);
    }

    @Override // ot.b0
    public final String s(Context context) {
        context.getClass();
        tt.p pVar = this.f133702s;
        if ((pVar != null ? pVar.getEightHoursSleepCount() : null) == null || pVar.getEightHoursSleepCount().intValue() < 2) {
            return null;
        }
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.annual_report_sleep_fun_fact);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{pVar.getEightHoursSleepCount()}, 1));
    }

    @Override // ot.b0
    public final String t(Context context) {
        String string = context.getString(R.string.annual_report_sleep_intro_text);
        string.getClass();
        return string;
    }

    @Override // ot.b0
    public final int u() {
        return R.color.gcm_annual_report_sleep_month_bar;
    }

    @Override // ot.b0
    public final List<Number> v() {
        tt.p pVar = this.f133702s;
        if (pVar != null) {
            return pVar.e();
        }
        return null;
    }

    @Override // ot.b0
    public final int w() {
        return R.string.annual_report_sleep_month_chart_title;
    }

    @Override // ot.b0
    public final String x() {
        return "SleepChapter";
    }

    @Override // ot.b0
    public final boolean y() {
        return true;
    }
}
