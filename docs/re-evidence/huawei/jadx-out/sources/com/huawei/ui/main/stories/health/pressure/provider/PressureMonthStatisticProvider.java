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
import defpackage.ltb;
import defpackage.ugh;
import defpackage.uis;
import defpackage.uyg;
import defpackage.wut;
import defpackage.wvb;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class PressureMonthStatisticProvider extends MinorProvider<uyg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Date f28022a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28024c;
    private uis d;
    private uyg g;
    private SectionBean i;
    private Date j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28023b = true;
    private final d e = new d(this);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, uyg uygVar) {
        LogUtil.a("PressureMonthStatisticProvider", "parseParams");
        map.put("STATISTIC_AVERAGE", uygVar.d());
        map.put("STATISTIC_MAX_MIN", uygVar.e());
        c(map, uygVar);
        a(map, uygVar);
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
            LogUtil.e("PressureMonthStatisticProvider", "setDescForPieChart type error ");
            i = 10001;
        }
        String[] strArrD = ugh.d(i);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(strArrD[0]);
        arrayList.add(strArrD[1]);
        map.put("PIE_CHART_DESC", arrayList);
        map.put("PIE_CHART_ITEM", uygVar.g());
    }

    private void a(HashMap<String, Object> map, uyg uygVar) {
        if (uygVar.o()) {
            LogUtil.a("PressureMonthStatisticProvider", "setDataForAdvice is nature", Boolean.valueOf(uygVar.o()));
            map.put("ADVICE_HAVE_DATA", 1);
            map.put("ADVICE", uygVar.i());
        } else {
            LogUtil.a("PressureMonthStatisticProvider", "setDataForAdvice is not nature", Boolean.valueOf(uygVar.o()));
            map.put("ADVICE_HAVE_DATA", 0);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f28023b;
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("PressureMonthStatisticProvider", "loadData");
        this.i = sectionBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, uyg uygVar) {
        if (uygVar != null) {
            this.f28023b = true;
            this.g = uygVar;
            this.j = new Date(uygVar.j());
            this.f28022a = new Date(uygVar.a() - 1000);
            e();
            if (this.d == null) {
                this.d = new uis();
            }
            c();
            return;
        }
        this.f28023b = false;
        SectionBean sectionBean2 = this.i;
        if (sectionBean2 != null) {
            sectionBean2.d(this, this.g);
        }
    }

    private void c() {
        if (this.j == null) {
            return;
        }
        this.d.a(this.g.j() / 1000, this.g.a() / 1000, 3, new a(this, 2));
    }

    static class a extends BaseCallback<PressureMonthStatisticProvider> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f28025a;

        a(PressureMonthStatisticProvider pressureMonthStatisticProvider, int i) {
            super(pressureMonthStatisticProvider);
            this.f28025a = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.huawei.ui.main.stories.health.pressure.provider.BaseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onCall(PressureMonthStatisticProvider pressureMonthStatisticProvider, int i, Object obj) {
            int i2 = this.f28025a;
            if (i2 == 1) {
                LogUtil.a("PressureMonthStatisticProvider", "month requestAdviceLibData errorCode = ", Integer.valueOf(i));
                if (i == 0) {
                    pressureMonthStatisticProvider.e.obtainMessage(1001, Integer.valueOf(i)).sendToTarget();
                    return;
                }
                return;
            }
            if (i2 != 2) {
                LogUtil.j("PressureMonthStatisticProvider", "error type");
            } else if (obj != null) {
                pressureMonthStatisticProvider.e.obtainMessage(1005, obj).sendToTarget();
            }
        }
    }

    static class d extends BaseHandler<PressureMonthStatisticProvider> {
        d(PressureMonthStatisticProvider pressureMonthStatisticProvider) {
            super(Looper.getMainLooper(), pressureMonthStatisticProvider);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PressureMonthStatisticProvider pressureMonthStatisticProvider, Message message) {
            int i = message.what;
            if (i == 1001) {
                pressureMonthStatisticProvider.b(((Integer) message.obj).intValue());
                LogUtil.a("PressureMonthStatisticProvider", "update pressure advice");
            } else if (i == 1005) {
                ArrayList arrayList = (ArrayList) message.obj;
                pressureMonthStatisticProvider.c(arrayList);
                pressureMonthStatisticProvider.e(arrayList, arrayList.size() > 0);
            } else if (i == 1006) {
                pressureMonthStatisticProvider.a();
            } else {
                LogUtil.a("PressureMonthStatisticProvider", "no case match!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ArrayList<HiStressMetaData> arrayList) {
        int iC = ugh.c(arrayList);
        if (iC > 0) {
            this.g.a(ugh.c(BaseApplication.getContext().getString(R.string.IDS_hw_pressure_averge_pressure_of_month), UnitUtil.e(iC, 1, 0), ugh.a(iC)));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiStressMetaData> list, boolean z) {
        int iS;
        LogUtil.a("PressureMonthStatisticProvider", "upToGradePieChart,isNature= ", Boolean.valueOf(this.f28024c), " haveData = ", Boolean.valueOf(z));
        if (this.f28024c) {
            iS = ltb.s(this.j);
        } else {
            iS = (ltb.s(this.j) - (ltb.a(this.j) - 1)) + ltb.a(this.f28022a);
        }
        List<wut> listD = this.d.d(this.j, iS, list);
        if (z && wvb.a(listD)) {
            this.g.e(ugh.b(listD));
            this.e.removeMessages(1006);
            this.e.sendEmptyMessageDelayed(1006, 100L);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.d.c(this.f28022a, 59, new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        String strD = UnitUtil.d("M/d", this.j.getTime());
        String strD2 = UnitUtil.d("M/d", this.f28022a.getTime());
        String str = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_pressure_month_analysis), strD, strD2, this.d.d());
        if (this.f28024c) {
            this.g.a(str);
        } else {
            LogUtil.a("PressureMonthStatisticProvider", "is not nature month");
        }
        b();
    }

    private void b() {
        SectionBean sectionBean = this.i;
        if (sectionBean != null) {
            sectionBean.d(this, this.g);
        }
    }

    private void e() {
        this.f28024c = false;
        long j = this.g.j();
        Date date = new Date(j);
        LogUtil.a("PressureMonthStatisticProvider", "currentClickMonth = ", date);
        if (ltb.f(date.getTime()) == j) {
            this.f28024c = true;
            this.g.b(true);
        } else {
            this.f28024c = false;
            this.g.b(false);
            LogUtil.a("PressureMonthStatisticProvider", "judgeNatureMonth,isNature = ", Boolean.valueOf(this.f28024c));
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        this.i = null;
    }
}
