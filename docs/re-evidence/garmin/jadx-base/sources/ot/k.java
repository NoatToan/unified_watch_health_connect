package ot;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lot/k;", "Lot/b0;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/g;", "activityTimeData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/g;Lot/x;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends b0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tt.g f133612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f133613t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, tt.g gVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133612s = gVar;
        this.f133613t = "ActivityTimeChapter";
    }

    @Override // ot.b0
    public final boolean A() {
        tt.g gVar = this.f133612s;
        return (gVar != null ? gVar.getDaysCount() : null) == null || gVar.getDaysCount().intValue() < 1;
    }

    @Override // ot.b0
    public final int H() {
        return R.string.lbl_activity_time;
    }

    @Override // ot.b0
    public final String I(Context context) {
        Double totalDuration;
        context.getClass();
        tt.g gVar = this.f133612s;
        if (gVar == null || (totalDuration = gVar.getTotalDuration()) == null) {
            return "";
        }
        double dDoubleValue = totalDuration.doubleValue();
        pt.h.f140570a.getClass();
        return pt.h.c((int) dDoubleValue, context);
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133671n() {
        return this.f133613t;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/activity_time";
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.ACTIVITY_TIME;
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133612s == null || e() == null) ? false : true;
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
        Integer daysCount;
        context.getClass();
        tt.g gVar = this.f133612s;
        if (gVar == null || (daysCount = gVar.getDaysCount()) == null) {
            return null;
        }
        int iIntValue = daysCount.intValue();
        pt.i iVar = pt.i.f140571a;
        String quantityString = context.getResources().getQuantityString(R.plurals.activity_time_fun_fact, iIntValue, Integer.valueOf(iIntValue));
        quantityString.getClass();
        return quantityString;
    }

    @Override // ot.b0
    public final String t(Context context) {
        return context.getString(R.string.annual_report_activity_time_intro_text);
    }

    @Override // ot.b0
    public final int u() {
        return R.color.gcm_annual_report_activity_time_month_bar;
    }

    @Override // ot.b0
    public final List<Number> v() {
        List<Double> listB;
        tt.g gVar = this.f133612s;
        if (gVar == null || (listB = gVar.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(MathKt.b(((Number) it.next()).doubleValue())));
        }
        return arrayList;
    }

    @Override // ot.b0
    public final int w() {
        return R.string.annual_report_activity_time_month_chart_title;
    }

    @Override // ot.b0
    public final String x() {
        return "ActivityTimeChapter";
    }
}
