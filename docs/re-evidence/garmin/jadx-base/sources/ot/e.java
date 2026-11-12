package ot;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lot/e;", "Lot/b0;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/b;", "activityCaloriesData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/b;Lot/x;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends b0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tt.b f133583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f133584t;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, tt.b bVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133583s = bVar;
        this.f133584t = "ActivityCaloriesChapter";
    }

    @Override // ot.b0
    public final boolean A() {
        tt.b bVar = this.f133583s;
        return (bVar != null ? bVar.getCakeCount() : null) == null || bVar.getCakeCount().intValue() <= 0;
    }

    @Override // ot.b0
    public final int H() {
        return R.string.lbl_activity_calories;
    }

    @Override // ot.b0
    public final String I(Context context) {
        Double totalCalories;
        context.getClass();
        tt.b bVar = this.f133583s;
        if (bVar == null || (totalCalories = bVar.getTotalCalories()) == null) {
            return "";
        }
        double dDoubleValue = totalCalories.doubleValue();
        l3.f23124b.getClass();
        String str = l3.f23131i.format(dDoubleValue);
        return str == null ? "" : str;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133671n() {
        return this.f133584t;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/activity_calories";
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.ACTIVITY_SUMMARY;
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133583s == null || e() == null) ? false : true;
    }

    @Override // ot.b0
    public final String r(Number number, Context context) {
        context.getClass();
        number.getClass();
        l3.f23124b.getClass();
        String str = l3.f23131i.format(Integer.valueOf(number.intValue()));
        str.getClass();
        return str;
    }

    @Override // ot.b0
    public final String s(Context context) {
        Integer cakeCount;
        context.getClass();
        tt.b bVar = this.f133583s;
        if (bVar == null || (cakeCount = bVar.getCakeCount()) == null) {
            return null;
        }
        int iIntValue = cakeCount.intValue();
        return context.getResources().getQuantityString(R.plurals.activity_calories_fun_fact_text, iIntValue, Integer.valueOf(iIntValue));
    }

    @Override // ot.b0
    public final String t(Context context) {
        return context.getString(R.string.annual_report_activity_calories_intro_text);
    }

    @Override // ot.b0
    public final int u() {
        return R.color.gcm_annual_report_activity_calories_month_bar;
    }

    @Override // ot.b0
    public final List<Number> v() {
        List<Double> listB;
        tt.b bVar = this.f133583s;
        if (bVar == null || (listB = bVar.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((Number) it.next()).doubleValue()));
        }
        return arrayList;
    }

    @Override // ot.b0
    public final int w() {
        return R.string.annual_report_activity_calories_month_chart_title;
    }

    @Override // ot.b0
    public final String x() {
        return "ActivityCaloriesChapter";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lot/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
