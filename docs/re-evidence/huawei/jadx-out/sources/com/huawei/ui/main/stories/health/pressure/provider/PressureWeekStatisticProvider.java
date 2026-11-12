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
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class PressureWeekStatisticProvider extends MinorProvider<uyg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Date f28030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28031b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f28032c = new c(this);
    private boolean d;
    private uis e;
    private uyg f;
    private SectionBean g;
    private Date h;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, uyg uygVar) {
        LogUtil.a("PressureWeekStatisticProvider", "parseParams");
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
            LogUtil.e("PressureWeekStatisticProvider", "setDescForPieChart type error ");
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
            LogUtil.a("PressureWeekStatisticProvider", "setDataForAdvice is nature", Boolean.valueOf(uygVar.o()));
            map.put("ADVICE_HAVE_DATA", 1);
            map.put("ADVICE", uygVar.i());
        } else {
            LogUtil.a("PressureWeekStatisticProvider", "setDataForAdvice is not nature", Boolean.valueOf(uygVar.o()));
            map.put("ADVICE_HAVE_DATA", 0);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f28031b;
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("PressureWeekStatisticProvider", "loadData");
        this.g = sectionBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, uyg uygVar) {
        if (uygVar != null) {
            this.f28031b = true;
            this.f = uygVar;
            this.h = new Date(uygVar.j());
            this.f28030a = new Date(uygVar.a() - 1000);
            e();
            if (this.e == null) {
                this.e = new uis();
            }
            c();
            return;
        }
        this.f28031b = false;
        SectionBean sectionBean2 = this.g;
        if (sectionBean2 != null) {
            sectionBean2.d(this, this.f);
        }
    }

    private void c() {
        if (this.h == null) {
            return;
        }
        this.e.a(this.f.j() / 1000, this.f.a() / 1000, 2, new b(this, 2));
    }

    static class b extends BaseCallback<PressureWeekStatisticProvider> {
        private final int d;

        b(PressureWeekStatisticProvider pressureWeekStatisticProvider, int i) {
            super(pressureWeekStatisticProvider);
            this.d = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.huawei.ui.main.stories.health.pressure.provider.BaseCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onCall(PressureWeekStatisticProvider pressureWeekStatisticProvider, int i, Object obj) {
            int i2 = this.d;
            if (i2 == 1) {
                LogUtil.a("PressureWeekStatisticProvider", "week requestAdviceLibData errorCode = ", Integer.valueOf(i));
                if (i == 0) {
                    pressureWeekStatisticProvider.f28032c.obtainMessage(1001, Integer.valueOf(i)).sendToTarget();
                    return;
                }
                return;
            }
            if (i2 != 2) {
                LogUtil.j("PressureWeekStatisticProvider", "error type");
            } else if (obj != null) {
                pressureWeekStatisticProvider.f28032c.obtainMessage(1005, obj).sendToTarget();
            }
        }
    }

    static class c extends BaseHandler<PressureWeekStatisticProvider> {
        c(PressureWeekStatisticProvider pressureWeekStatisticProvider) {
            super(Looper.getMainLooper(), pressureWeekStatisticProvider);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PressureWeekStatisticProvider pressureWeekStatisticProvider, Message message) {
            int i = message.what;
            if (i == 1001) {
                pressureWeekStatisticProvider.d(((Integer) message.obj).intValue());
                LogUtil.a("PressureWeekStatisticProvider", "update pressure advice");
            } else if (i == 1005) {
                ArrayList arrayList = (ArrayList) message.obj;
                pressureWeekStatisticProvider.a(arrayList);
                pressureWeekStatisticProvider.d(arrayList, arrayList.size() > 0);
            } else if (i == 1006) {
                pressureWeekStatisticProvider.a();
            } else {
                LogUtil.a("PressureWeekStatisticProvider", "no case match!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<HiStressMetaData> arrayList) {
        int iC = ugh.c(arrayList);
        if (iC > 0) {
            this.f.a(ugh.c(BaseApplication.getContext().getString(R.string.IDS_hw_pressure_averge_pressure_of_week), UnitUtil.e(iC, 1, 0), ugh.a(iC)));
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiStressMetaData> list, boolean z) {
        LogUtil.a("PressureWeekStatisticProvider", "upToGradePieChart haveData = ", Boolean.valueOf(z));
        List<wut> listD = this.e.d(this.h, 7, list);
        if (z && wvb.a(listD)) {
            this.f.e(ugh.b(listD));
            this.f28032c.removeMessages(1006);
            this.f28032c.sendEmptyMessageDelayed(1006, 100L);
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.e.c(this.f28030a, 13, new b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        String strD = UnitUtil.d("M/d", this.h.getTime());
        String strD2 = UnitUtil.d("M/d", this.f28030a.getTime());
        String str = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_pressure_week_analysis), strD, strD2, this.e.d());
        if (this.d) {
            this.f.a(str);
        } else {
            LogUtil.a("PressureWeekStatisticProvider", "is not nature week");
        }
        d();
    }

    private void d() {
        SectionBean sectionBean = this.g;
        if (sectionBean != null) {
            sectionBean.d(this, this.f);
        }
    }

    private void e() {
        this.d = false;
        int iH = ltb.h(new Date(this.f.j()));
        LogUtil.a("PressureWeekStatisticProvider", "getDayOfWeek", Integer.valueOf(iH));
        if (Utils.o()) {
            if (iH == 1) {
                this.d = true;
            }
        } else if (iH == 2) {
            this.d = true;
        }
        this.f.b(this.d);
        LogUtil.a("PressureWeekStatisticProvider", "isNature = ", Boolean.valueOf(this.d));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        this.g = null;
    }
}
