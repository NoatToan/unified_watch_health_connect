package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.chart.view.SleepChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.sleep.ui.SleepLandScapeActivity;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepDistributeAdapter;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.health.sleep.valueformater.DaySleepHighLightFormatter;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import com.xiaomi.fitness.widget.view.DurationTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class ylm {
    public static final int t = iji.e3;
    public static final int u = iji.i3;
    public static final int v = iji.g3;
    public static final int w = iji.j3;
    public static final int x = iji.h3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f40303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f40304b;
    public oim d;
    public View e;
    public RecyclerView f;
    public SleepDistributeAdapter g;
    public List<uz6> h;
    public SleepChartRecyclerView i;
    public tim j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SleepSegmentReport f40305k;
    public AppCompatImageView l;
    public TextView m;
    public TextView n;
    public LinearLayout o;
    public DurationTextView p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f40306r;
    public LinearLayout s;
    public final List<SleepItemEntry> c = new LinkedList();
    public int q = 0;

    public class a extends xcm {
        public a() {
        }

        @Override // defpackage.xcm, defpackage.u8h
        public void onItemClick(View view, int i, Boolean bool) {
            if (bool.booleanValue() && ylm.this.i.clickTwoStatus.booleanValue()) {
                Intent intent = new Intent(ylm.this.f40304b, (Class<?>) SleepLandScapeActivity.class);
                SleepSegmentReport sleepSegmentReport = ylm.this.f40305k;
                intent.putExtra(SleepLandScapeActivity.PARAM_SLEEP_REPORT_DATE, TimeDateUtil.timestampToLocalDate(sleepSegmentReport.getWakeupTime()));
                intent.putExtra(SleepLandScapeActivity.PARAM_SLEEP_REPORT_POSITION, ylm.this.q);
                intent.putExtra(SleepLandScapeActivity.PARAM_SLEEP_REPORT_DATE_UNIQUE, sleepSegmentReport.getBedTime());
                ylm.this.f40304b.startActivity(intent);
                SleepTrackHelper.INSTANCE.trackSleepLandDetailActivityOrigin(true);
            }
        }

        @Override // defpackage.xcm, defpackage.u8h
        public void onItemSelected(RecyclerBarEntry recyclerBarEntry, int i) {
            if (recyclerBarEntry == null || !recyclerBarEntry.isSelected()) {
                ylm.this.e.setVisibility(0);
            } else {
                ylm.this.e.setVisibility(4);
            }
        }
    }

    public ylm(View view) {
        this.f40304b = view.getContext();
        this.f40303a = view;
        n();
    }

    public final boolean h() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceSize() > 0;
    }

    public final boolean i(SleepSegmentReport sleepSegmentReport) {
        DeviceInfo<? extends Device> deviceInfoInAll;
        String sid = sleepSegmentReport.getSid();
        if (sid == null || (deviceInfoInAll = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceInfoInAll(sid)) == null) {
            return false;
        }
        return deviceInfoInAll.isPhone();
    }

    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public List<uz6> j(SleepSegmentReport sleepSegmentReport) {
        ?? r3;
        ArrayList arrayList = new ArrayList();
        if (sleepSegmentReport.getSleepDuration() == 0.0f) {
            return arrayList;
        }
        int[] iArrH = gjm.h(sleepSegmentReport);
        int deepDuration = sleepSegmentReport.getDeepDuration();
        int lightDuration = sleepSegmentReport.getLightDuration();
        int iIntValue = sleepSegmentReport.getRemDuration() == null ? 0 : sleepSegmentReport.getRemDuration().intValue();
        int iIntValue2 = sleepSegmentReport.getSleepTraceDuration() == null ? 0 : sleepSegmentReport.getSleepTraceDuration().intValue();
        LocaleUtil.INSTANCE.isChinese();
        int i = iArrH[0];
        if (i > 0) {
            int iA = x44.a(t);
            String string = this.f40304b.getString(c0j.cf);
            long millis = TimeUnit.MINUTES.toMillis(deepDuration);
            r3 = 1;
            uz6 uz6Var = new uz6(iA, string, 3, i, true, millis);
            uz6Var.m = true;
            uz6Var.l = 4;
            arrayList.add(uz6Var);
        } else {
            r3 = 1;
        }
        int i2 = iArrH[r3];
        if (i2 > 0) {
            uz6 uz6Var2 = new uz6(x44.a(u), this.f40304b.getString(c0j.lk), 2, i2, true, TimeUnit.MINUTES.toMillis(lightDuration));
            uz6Var2.m = r3;
            uz6Var2.l = 3;
            arrayList.add(uz6Var2);
        }
        int i3 = iArrH[2];
        if (i3 > 0) {
            uz6 uz6Var3 = new uz6(x44.a(v), this.f40304b.getString(c0j.Nf), 1, i3, true, TimeUnit.MINUTES.toMillis(iIntValue));
            uz6Var3.m = r3;
            uz6Var3.l = 5;
            arrayList.add(uz6Var3);
        }
        int i4 = iArrH[3];
        if (i4 > 0) {
            uz6 uz6Var4 = new uz6(x44.a(x), this.f40304b.getString(c0j.Wc), 4, i4, true, TimeUnit.MINUTES.toMillis(iIntValue2));
            uz6Var4.m = r3;
            uz6Var4.l = 4;
            arrayList.add(uz6Var4);
        }
        Integer wakeCount = sleepSegmentReport.getWakeCount();
        Integer wakeDuration = sleepSegmentReport.getWakeDuration();
        int i5 = 0;
        if (wakeDuration == null) {
            wakeDuration = 0;
        }
        if ((wakeCount == null || wakeCount.intValue() == 0) && wakeDuration.intValue() > 0) {
            List<SleepStateItem> sleepItems = sleepSegmentReport.getSleepItems();
            if (!ArrayUtils.isEmpty(sleepItems)) {
                Iterator<SleepStateItem> it = sleepItems.iterator();
                while (it.hasNext()) {
                    if (it.next().getSleepState() == 5) {
                        i5++;
                    }
                }
                wakeCount = Integer.valueOf(i5);
                Logger.i("MiHealth", "SleepDistributeDayHolder: data wake count is null, but  wake duration is " + wakeDuration + "stat count:" + wakeCount);
            }
        }
        if (wakeCount != null && wakeCount.intValue() > 0) {
            AppUtil.getApp().getResources().getQuantityString(qxi.V0, wakeCount.intValue());
            uz6 uz6Var5 = new uz6(x44.a(w), this.f40304b.getString(c0j.Td), 0, wakeCount.intValue(), true, TimeUnit.MINUTES.toMillis(wakeDuration.intValue()));
            uz6Var5.m = r3;
            uz6Var5.l = 6;
            arrayList.add(uz6Var5);
        }
        return arrayList;
    }

    public final void k() {
        this.i = (SleepChartRecyclerView) this.f40303a.findViewById(eri.y1);
        this.l = (AppCompatImageView) this.f40303a.findViewById(eri.Q8);
        this.d = new oim(this.f40304b, this.c, this.i);
        qim qimVar = (qim) this.i.mAttrs;
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this.f40304b, qimVar);
        tim timVar = new tim(qimVar);
        this.j = timVar;
        timVar.setHighLightValueFormatter(new DaySleepHighLightFormatter(0));
        this.i.setLayoutManager(speedRatioLayoutManager);
        this.i.addItemDecoration(this.j);
        this.i.setAdapter(this.d);
        this.i.addOnItemTouchListener(new hak(this.f40304b, this.i, new a()));
    }

    public final void l() {
        this.h = new ArrayList();
        RecyclerView recyclerView = (RecyclerView) this.f40303a.findViewById(eri.Bd);
        this.f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f40304b));
        this.f.addItemDecoration(new bl5(false));
        SleepDistributeAdapter sleepDistributeAdapter = new SleepDistributeAdapter(this.f40304b, this.h);
        this.g = sleepDistributeAdapter;
        sleepDistributeAdapter.setOnTitleItemClickListener(new SleepDistributeAdapter.OnTitleItemClickListener() { // from class: xlm
            @Override // com.xiaomi.fitness.health.sleep.ui.adapter.SleepDistributeAdapter.OnTitleItemClickListener
            public final void onClick(int i) {
                this.f39247a.o(i);
            }
        });
        this.f.setAdapter(this.g);
        this.f.setHasFixedSize(true);
    }

    public final void m() {
        this.f40306r = (LinearLayout) this.f40303a.findViewById(eri.cf);
        LinearLayout linearLayout = (LinearLayout) this.f40303a.findViewById(eri.g1);
        this.s = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: wlm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewUtilKt.startWebView("https://m.mi.com/p?g_utm=MIUI.Mijia.Others.xmyd.cdzn2&pid=111&root=com.xiaomi.shop2.plugin.webview.RootFragment&url=https%3A%2F%2Fm.mi.com%2Fmfbs%2Fdghd%2Fm_universal%3F_rt%3Drn%26pageid%3D11771%26pdl%3Dmishop%26sign%3Dcc12401e973dfd2803341b68a91e277e%26mute%3D0.1.0.1&pageType=jianyu&fallback=https%3A%2F%2Fm.mi.com%2Fmfbs%2Fdghd%2Fm_universal%3F_rt%3Drn%26pageid%3D11771%26pdl%3Dmishop%26sign%3Dcc12401e973dfd2803341b68a91e277e%26mute%3D0.1.0.1%26g_utm%3DMIUI.Mijia.Others.xmyd.cdzn2");
            }
        });
    }

    public final void n() {
        k();
        l();
        m();
        this.e = this.f40303a.findViewById(eri.x3);
        this.p = (DurationTextView) this.f40303a.findViewById(eri.p4);
        this.m = (TextView) this.f40303a.findViewById(eri.Vl);
        this.o = (LinearLayout) this.f40303a.findViewById(eri.w1);
        this.n = (TextView) this.f40303a.findViewById(eri.Wm);
    }

    public final /* synthetic */ void o(int i) {
        if (i == 2) {
            this.g.setCoverViewStatus(!this.g.getCoverViewStatus());
            this.g.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final void q(SleepSegmentReport sleepSegmentReport) {
        String name;
        this.p.setDuration(TimeUnit.MINUTES.toMillis(sleepSegmentReport.getSleepDuration()));
        String sid = sleepSegmentReport.getSid();
        if (sid == null || sid.isEmpty()) {
            name = "--";
        } else if (sid.equals("xiaomiwear_app_manually")) {
            name = this.f40304b.getString(c0j.D);
        } else {
            DeviceInfo<? extends Device> deviceInfoInAll = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceInfoInAll(sid);
            if (deviceInfoInAll != null) {
                name = deviceInfoInAll.getName();
            } else {
                name = "--";
            }
        }
        this.m.setText(this.f40304b.getString(c0j.Ze, name));
        this.n.setText(SleepExtKt.getSleepTimeRangeStr(this.f40304b, sleepSegmentReport.getBedTime(), sleepSegmentReport.getWakeupTime()));
        View viewFindViewById = this.e.findViewById(eri.A1);
        View viewFindViewById2 = this.e.findViewById(eri.C1);
        View viewFindViewById3 = this.e.findViewById(eri.B1);
        View viewFindViewById4 = this.e.findViewById(eri.D1);
        if (sleepSegmentReport.getDeepDuration() > 0) {
            viewFindViewById.setVisibility(0);
        }
        if (sleepSegmentReport.getLightDuration() > 0) {
            viewFindViewById2.setVisibility(0);
        }
        if (sleepSegmentReport.getRemDuration() != null && sleepSegmentReport.getRemDuration().intValue() > 0) {
            viewFindViewById3.setVisibility(0);
        }
        if (sleepSegmentReport.getWakeDuration() == null || sleepSegmentReport.getWakeDuration().intValue() <= 0) {
            return;
        }
        viewFindViewById4.setVisibility(0);
    }

    public final void r(SleepSegmentReport sleepSegmentReport) {
        List<uz6> listJ = j(sleepSegmentReport);
        if (!sleepSegmentReport.hasStageData() || ArrayUtils.isEmpty(listJ)) {
            this.f.setVisibility(8);
            return;
        }
        DistributeDataUtil.setPositionOfList(listJ);
        this.f.setVisibility(0);
        this.h.clear();
        this.h.addAll(listJ);
        if (sleepSegmentReport.getRemDuration() == null || sleepSegmentReport.getRemDuration().intValue() <= 0) {
            this.g.setHasRemData(false);
        } else {
            this.g.setHasRemData(true);
        }
        this.g.notifyDataSetChanged();
    }

    public final void s(SleepSegmentReport sleepSegmentReport) {
        boolean zI = i(sleepSegmentReport);
        boolean zH = h();
        if (!zI || zH) {
            this.f40306r.setVisibility(8);
        } else {
            this.f40306r.setVisibility(0);
        }
    }

    public void t(SleepSegmentReport sleepSegmentReport, int i) {
        this.q = i;
        this.f40305k = sleepSegmentReport;
        if (sleepSegmentReport.hasStageData()) {
            this.n.setVisibility(8);
            int stageCount = sleepSegmentReport.getStageCount();
            this.i.setVisibility(0);
            this.l.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            int iA = ez5.a(153);
            int dimensionPixelSize = this.f40304b.getResources().getDimensionPixelSize(ili.h);
            this.j.c(Float.valueOf(((4 - stageCount) * dimensionPixelSize) / stageCount));
            layoutParams.height = (dimensionPixelSize * 4) + iA;
            this.i.setLayoutParams(layoutParams);
            this.j.updateStageSize(stageCount);
            this.c.clear();
            this.c.addAll(gjm.b(sleepSegmentReport, Boolean.FALSE));
            this.d.setEntries(this.c);
        } else {
            this.i.setVisibility(8);
            this.l.setVisibility(8);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            this.n.setVisibility(0);
        }
        q(sleepSegmentReport);
        r(sleepSegmentReport);
        if (AppUtil.INSTANCE.isPlayChannel() || !"cn".equals(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion())) {
            return;
        }
        s(sleepSegmentReport);
    }
}
