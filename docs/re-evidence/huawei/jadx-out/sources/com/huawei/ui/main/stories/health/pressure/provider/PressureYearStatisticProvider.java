package com.huawei.ui.main.stories.health.pressure.provider;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.ugh;
import defpackage.uis;
import defpackage.uyg;
import defpackage.wut;
import defpackage.wvb;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class PressureYearStatisticProvider extends MinorProvider<uyg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private uyg f28033a;
    private uis d;
    private SectionBean i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28034b = true;
    private Date g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f28035c = null;
    private final d e = new d(this);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, uyg uygVar) {
        LogUtil.a("PressureYearStatisticProvider", "parseParams");
        map.put("STATISTIC_AVERAGE", uygVar.d());
        map.put("STATISTIC_MAX_MIN", uygVar.e());
        c(map, uygVar);
        map.put("ADVICE_HAVE_DATA", 0);
    }

    protected void c(HashMap<String, Object> map, uyg uygVar) {
        int i;
        if (uygVar.c().isDayData()) {
            i = 10001;
        } else if (uygVar.c().isMonthData()) {
            i = 10003;
        } else if (uygVar.c().isWeekData()) {
            i = 10002;
        } else if (uygVar.c().isYearData()) {
            i = 10004;
        } else {
            LogUtil.e("PressureYearStatisticProvider", "setDescForPieChart type error ");
            i = 10001;
        }
        String[] strArrD = ugh.d(i);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(strArrD[0]);
        arrayList.add(strArrD[1]);
        map.put("PIE_CHART_DESC", arrayList);
        map.put("PIE_CHART_ITEM", uygVar.g());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f28034b;
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("PressureYearStatisticProvider", "loadData");
        this.i = sectionBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, uyg uygVar) {
        if (uygVar != null) {
            this.f28034b = true;
            this.f28033a = uygVar;
            Date date = new Date(uygVar.j());
            this.g = date;
            this.f28035c = b(date);
            if (this.d == null) {
                this.d = new uis();
            }
            e();
            return;
        }
        this.f28034b = false;
        SectionBean sectionBean2 = this.i;
        if (sectionBean2 != null) {
            sectionBean2.d(this, this.f28033a);
        }
    }

    private void e() {
        if (this.g == null) {
            return;
        }
        this.d.a(this.f28033a.j() / 1000, this.f28033a.a() / 1000, 4, new e(this, 2));
    }

    static class e extends BaseCallback<PressureYearStatisticProvider> {
        private final int e;

        e(PressureYearStatisticProvider pressureYearStatisticProvider, int i) {
            super(pressureYearStatisticProvider);
            this.e = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.huawei.ui.main.stories.health.pressure.provider.BaseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onCall(PressureYearStatisticProvider pressureYearStatisticProvider, int i, Object obj) {
            int i2 = this.e;
            if (i2 == 1) {
                LogUtil.a("PressureYearStatisticProvider", "month requestAdviceLibData errorCode = ", Integer.valueOf(i));
                if (i == 0) {
                    pressureYearStatisticProvider.e.obtainMessage(1001, Integer.valueOf(i)).sendToTarget();
                    return;
                }
                return;
            }
            if (i2 != 2) {
                LogUtil.j("PressureYearStatisticProvider", "error type");
            } else if (obj != null) {
                pressureYearStatisticProvider.e.obtainMessage(1005, obj).sendToTarget();
            }
        }
    }

    static class d extends BaseHandler<PressureYearStatisticProvider> {
        d(PressureYearStatisticProvider pressureYearStatisticProvider) {
            super(Looper.getMainLooper(), pressureYearStatisticProvider);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PressureYearStatisticProvider pressureYearStatisticProvider, Message message) {
            if (message.what == 1005) {
                ArrayList arrayList = (ArrayList) message.obj;
                pressureYearStatisticProvider.e(arrayList, arrayList.size() > 0);
            } else {
                LogUtil.a("PressureYearStatisticProvider", "no case match!");
            }
        }
    }

    private void b(List<wut> list) {
        int iC = ugh.c(list);
        if (iC > 0) {
            this.f28033a.a(ugh.c(BaseApplication.getContext().getString(R.string.IDS_hw_pressure_averge_pressure_of_year), UnitUtil.e(iC, 1, 0), ugh.a(iC)));
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiStressMetaData> list, boolean z) {
        LogUtil.a("PressureYearStatisticProvider", "upToGradePieChart haveData = ", Boolean.valueOf(z));
        List<wut> listA = this.d.a(this.f28035c, list);
        if (z && wvb.a(listA)) {
            this.f28033a.e(ugh.b(listA));
            b(listA);
        }
        c();
    }

    private void c() {
        SectionBean sectionBean = this.i;
        if (sectionBean != null) {
            sectionBean.d(this, this.f28033a);
        }
    }

    private Date b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        this.i = null;
    }
}
