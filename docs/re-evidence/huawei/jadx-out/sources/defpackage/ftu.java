package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.knit.section.chart.CoreSleepBarChartView;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ftu {
    private static ftu e;
    private int d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<View> f34575b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<CoreSleepBarChartView> f34574a = new CopyOnWriteArrayList<>();

    private ftu() {
    }

    public static ftu c() {
        if (e == null) {
            e = new ftu();
        }
        return e;
    }

    public void c(final Context context) {
        HandlerCenter.a().execute(new Runnable() { // from class: fub
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(context);
            }
        });
    }

    /* synthetic */ void d(Context context) {
        this.f34575b.add(b(context));
        this.f34575b.add(b(context));
        this.f34575b.add(b(context));
    }

    private View b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_common_bar_layout, (ViewGroup) null);
        ArrayList arrayList = new ArrayList(3);
        CoreSleepBarChartView coreSleepBarChartView = new CoreSleepBarChartView(context);
        coreSleepBarChartView.setLayerType(1, null);
        arrayList.add(0, coreSleepBarChartView);
        HealthViewPager healthViewPager = (HealthViewPager) qsp.a(viewInflate, R.id.calorie_day_detail_viewpager);
        healthViewPager.setAdapter(new qto(arrayList));
        healthViewPager.setIsScroll(false);
        this.f34574a.add(coreSleepBarChartView);
        return viewInflate;
    }

    public View e() {
        if (this.d >= this.f34575b.size()) {
            ReleaseLogUtil.a("R_Sleep_SleepSectionViewManager", "error index: ", Integer.valueOf(this.d));
            return null;
        }
        CopyOnWriteArrayList<View> copyOnWriteArrayList = this.f34575b;
        int i = this.d;
        this.d = i + 1;
        return copyOnWriteArrayList.get(i);
    }

    public int d() {
        return this.d;
    }

    public CoreSleepBarChartView c(int i) {
        if (i >= this.f34574a.size()) {
            ReleaseLogUtil.a("R_Sleep_SleepSectionViewManager", "error index: ", Integer.valueOf(i));
            return null;
        }
        return this.f34574a.get(i);
    }

    public void b() {
        this.f34574a.clear();
        this.f34575b.clear();
        e = null;
        this.d = 0;
        ObserverManagerUtil.a("SLEEP_WEEK_MONTH_YEAR_AVERAGE_DAILY");
    }
}
