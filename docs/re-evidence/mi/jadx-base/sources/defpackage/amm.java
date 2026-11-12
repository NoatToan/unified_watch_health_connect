package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.chart.view.SleepChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.sleep.ui.UnderstandSleepFragment;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class amm {
    public static final int h = iji.e3;
    public static final int i = iji.i3;
    public static final int j = iji.g3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f1215k = iji.j3;
    public static final int l = iji.h3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1217b;
    public DataTitleView c;
    public RecyclerView d;
    public sz6 e;
    public List<uz6> f;
    public SleepChartRecyclerView g;

    public class a extends GridLayoutManager.b {
        public a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int getSpanSize(int i) {
            return amm.this.e.isHeaderView(i) ? 2 : 1;
        }
    }

    public amm(View view) {
        this.f1217b = view.getContext();
        this.f1216a = view;
        f();
    }

    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    public List<uz6> c(SleepSegmentReport sleepSegmentReport) {
        ?? r6;
        int i2;
        String str;
        int i3;
        String string;
        String string2;
        String string3;
        String string4;
        ArrayList arrayList = new ArrayList();
        if (sleepSegmentReport.getSleepDuration() == 0.0f) {
            return arrayList;
        }
        int[] iArrH = gjm.h(sleepSegmentReport);
        int deepDuration = sleepSegmentReport.getDeepDuration();
        int lightDuration = sleepSegmentReport.getLightDuration();
        int iIntValue = sleepSegmentReport.getRemDuration() == null ? 0 : sleepSegmentReport.getRemDuration().intValue();
        int iIntValue2 = sleepSegmentReport.getSleepTraceDuration() == null ? 0 : sleepSegmentReport.getSleepTraceDuration().intValue();
        String str2 = LocaleUtil.INSTANCE.isChinese() ? "%s%s" : "%s %s";
        int i4 = iArrH[0];
        if (i4 > 0) {
            int iA = x44.a(h);
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = this.f1217b.getString(c0j.cf);
            if (AppUtil.isRTLDirection()) {
                string4 = i4 + "%";
            } else {
                string4 = this.f1217b.getString(c0j.common_percent_join_str, Integer.valueOf(i4));
            }
            objArr[1] = string4;
            uz6 uz6Var = new uz6(iA, String.format(locale, str2, objArr), 6, i4, true, TimeUnit.MINUTES.toMillis(deepDuration));
            r6 = 1;
            uz6Var.m = true;
            uz6Var.l = 4;
            arrayList.add(uz6Var);
        } else {
            r6 = 1;
        }
        int i5 = iArrH[r6];
        if (i5 > 0) {
            int iA2 = x44.a(i);
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[2];
            objArr2[0] = this.f1217b.getString(c0j.lk);
            if (AppUtil.isRTLDirection()) {
                string3 = i5 + "%";
            } else {
                string3 = this.f1217b.getString(c0j.common_percent_join_str, Integer.valueOf(i5));
            }
            objArr2[r6] = string3;
            i2 = 2;
            uz6 uz6Var2 = new uz6(iA2, String.format(locale2, str2, objArr2), 6, i5, true, TimeUnit.MINUTES.toMillis(lightDuration));
            uz6Var2.m = r6;
            uz6Var2.l = 3;
            arrayList.add(uz6Var2);
        } else {
            i2 = 2;
        }
        int i6 = iArrH[i2];
        if (i6 > 0) {
            int iA3 = x44.a(j);
            Locale locale3 = Locale.US;
            Object[] objArr3 = new Object[i2];
            objArr3[0] = this.f1217b.getString(c0j.Nf);
            if (AppUtil.isRTLDirection()) {
                string2 = i6 + r14;
            } else {
                string2 = this.f1217b.getString(c0j.common_percent_join_str, Integer.valueOf(i6));
            }
            objArr3[r6] = string2;
            String str3 = str2;
            str = str3;
            uz6 uz6Var3 = new uz6(iA3, String.format(locale3, str3, objArr3), 6, i6, true, TimeUnit.MINUTES.toMillis(iIntValue));
            uz6Var3.m = true;
            uz6Var3.l = 5;
            arrayList.add(uz6Var3);
        } else {
            str = str2;
        }
        int i7 = iArrH[3];
        if (i7 > 0) {
            int iA4 = x44.a(l);
            Locale locale4 = Locale.US;
            Object[] objArr4 = new Object[2];
            i3 = 0;
            objArr4[0] = this.f1217b.getString(c0j.Wc);
            if (AppUtil.isRTLDirection()) {
                string = i7 + r14;
            } else {
                string = this.f1217b.getString(c0j.common_percent_join_str, Integer.valueOf(i7));
            }
            objArr4[1] = string;
            uz6 uz6Var4 = new uz6(iA4, String.format(locale4, str, objArr4), 6, i7, true, TimeUnit.MINUTES.toMillis(iIntValue2));
            uz6Var4.m = true;
            uz6Var4.l = 4;
            arrayList.add(uz6Var4);
        } else {
            i3 = 0;
        }
        Integer wakeCount = sleepSegmentReport.getWakeCount();
        Integer wakeDuration = sleepSegmentReport.getWakeDuration();
        if ((wakeCount == null || wakeCount.intValue() == 0) && wakeDuration != null && wakeDuration.intValue() > 0) {
            List<SleepStateItem> sleepItems = sleepSegmentReport.getSleepItems();
            if (!ArrayUtils.isEmpty(sleepItems)) {
                Iterator<SleepStateItem> it = sleepItems.iterator();
                int i8 = i3;
                while (it.hasNext()) {
                    if (it.next().getSleepState() == 5) {
                        i8++;
                    }
                }
                wakeCount = Integer.valueOf(i8);
                Logger.i("MiHealthRelative", "SleepDistributeRDayHolder: data wake count is null, but  wake duration is " + wakeDuration + "stat count:" + wakeCount);
            }
        }
        if (wakeCount != null && wakeCount.intValue() > 0) {
            uz6 uz6Var5 = new uz6(x44.a(f1215k), this.f1217b.getString(c0j.Td), 6, 0, String.valueOf(wakeCount), "");
            uz6Var5.m = true;
            uz6Var5.l = 6;
            arrayList.add(uz6Var5);
        }
        return arrayList;
    }

    public final void d() {
        this.g = (SleepChartRecyclerView) this.f1216a.findViewById(eri.y1);
        DataTitleView dataTitleView = (DataTitleView) this.f1216a.findViewById(eri.H2);
        this.c = dataTitleView;
        dataTitleView.c(this.f1217b.getString(c0j.L6));
    }

    public final void e() {
        this.f = new ArrayList();
        this.d = (RecyclerView) this.f1216a.findViewById(eri.Bd);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f1217b, 2);
        gridLayoutManager.D(new a());
        this.d.setLayoutManager(gridLayoutManager);
        this.d.addItemDecoration(new bl5(false));
        sz6 sz6Var = new sz6(this.f1217b, this.f, 6);
        this.e = sz6Var;
        sz6Var.setDistributeItemClickListener(new sz6.c() { // from class: zlm
            @Override // sz6.c
            public final void a(uz6 uz6Var, int i2) {
                this.f41444a.g(uz6Var, i2);
            }
        });
        this.e.l(true);
        this.d.setAdapter(this.e);
        this.d.setHasFixedSize(true);
    }

    public final void f() {
        d();
        e();
    }

    public final /* synthetic */ void g(uz6 uz6Var, int i2) {
        int i3 = uz6Var.l;
        Bundle bundle = new Bundle();
        bundle.putInt("index", i3);
        dih.a().e(this.f1217b, new FragmentParams.b().e(UnderstandSleepFragment.class).c(bundle).a(true).b());
    }

    public final void h(SleepSegmentReport sleepSegmentReport) {
        List<uz6> listC = c(sleepSegmentReport);
        if (sleepSegmentReport.getStageCount() < 2) {
            this.d.setVisibility(8);
            return;
        }
        DistributeDataUtil.setPositionOfList(listC);
        this.d.setVisibility(0);
        this.f.clear();
        this.f.addAll(listC);
        this.e.notifyDataSetChanged();
    }

    public void i(SleepSegmentReport sleepSegmentReport) {
        this.g.setVisibility(8);
        int sleepDuration = sleepSegmentReport.getSleepDuration();
        String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getBedTime());
        String dateHHmm24Format2 = TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getWakeupTime());
        String hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(this.f1217b, sleepDuration);
        this.c.b(this.f1217b, hMFormatInMinutes, hMFormatInMinutes, String.format("%s-%s", dateHHmm24Format, dateHHmm24Format2), Typeface.create(this.f1217b.getString(c0j.fq), 1));
        h(sleepSegmentReport);
    }
}
