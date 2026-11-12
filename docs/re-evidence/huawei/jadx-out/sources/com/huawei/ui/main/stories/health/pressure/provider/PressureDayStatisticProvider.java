package com.huawei.ui.main.stories.health.pressure.provider;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.ltb;
import defpackage.nkp;
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

/* JADX INFO: loaded from: classes43.dex */
public class PressureDayStatisticProvider extends MinorProvider<uyg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private uis f28005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28006b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f28007c = new a(this);
    private SectionBean d;
    private uyg e;
    private Date g;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, uyg uygVar) {
        LogUtil.a("PressureDayStatisticProvider", "parseParams");
        map.put("STATISTIC_AVERAGE", uygVar.d());
        map.put("STATISTIC_MAX_MIN", uygVar.e());
        a(map, uygVar);
        b(map, uygVar);
    }

    protected void a(HashMap<String, Object> map, uyg uygVar) {
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
            LogUtil.e("PressureDayStatisticProvider", "setDescForPieChart type error ");
            i = 10001;
        }
        String[] strArrD = ugh.d(i);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(strArrD[0]);
        arrayList.add(strArrD[1]);
        map.put("PIE_CHART_DESC", arrayList);
        map.put("PIE_CHART_ITEM", uygVar.g());
    }

    private void b(HashMap<String, Object> map, uyg uygVar) {
        map.put("ADVICE_HAVE_DATA", 1);
        map.put("ADVICE", uygVar.i());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f28006b;
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("PressureDayStatisticProvider", "loadData");
        this.d = sectionBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, uyg uygVar) {
        if (uygVar != null && uygVar.f()) {
            this.f28006b = true;
            this.e = uygVar;
            this.g = new Date(uygVar.j());
            if (this.f28005a == null) {
                this.f28005a = new uis();
            }
            e();
            return;
        }
        this.f28006b = false;
        SectionBean sectionBean2 = this.d;
        if (sectionBean2 != null) {
            sectionBean2.d(this, this.e);
        }
    }

    private void e() {
        Date date = this.g;
        if (date == null) {
            return;
        }
        this.f28005a.d(ltb.b(date), 1, new d(this, 2));
    }

    static class d extends BaseCallback<PressureDayStatisticProvider> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f28008b;

        d(PressureDayStatisticProvider pressureDayStatisticProvider, int i) {
            super(pressureDayStatisticProvider);
            this.f28008b = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.huawei.ui.main.stories.health.pressure.provider.BaseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onCall(PressureDayStatisticProvider pressureDayStatisticProvider, int i, Object obj) {
            int i2 = this.f28008b;
            if (i2 == 1) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = obj;
                messageObtain.arg1 = i;
                messageObtain.what = 1004;
                pressureDayStatisticProvider.f28007c.sendMessage(messageObtain);
                return;
            }
            if (i2 == 2) {
                if (obj != null) {
                    pressureDayStatisticProvider.f28007c.obtainMessage(1005, obj).sendToTarget();
                }
            } else if (i2 != 3) {
                LogUtil.j("PressureDayStatisticProvider", "error type");
            } else if (i == 0) {
                pressureDayStatisticProvider.f28007c.obtainMessage(1001, Integer.valueOf(i)).sendToTarget();
            }
        }
    }

    static class a extends BaseHandler<PressureDayStatisticProvider> {
        a(PressureDayStatisticProvider pressureDayStatisticProvider) {
            super(Looper.getMainLooper(), pressureDayStatisticProvider);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PressureDayStatisticProvider pressureDayStatisticProvider, Message message) {
            int i = message.what;
            if (i == 1001) {
                pressureDayStatisticProvider.c(((Integer) message.obj).intValue());
                return;
            }
            switch (i) {
                case 1004:
                    if (message.arg1 != 0) {
                        LogUtil.j("PressureDayStatisticProvider", "get SCORE values err , Code = ", Integer.valueOf(message.arg1));
                    } else {
                        List list = (List) message.obj;
                        if (list.size() == 1) {
                            LogUtil.a("PressureDayStatisticProvider", "SCORE = ", Integer.valueOf(((HiStressMetaData) list.get(0)).fetchStressScore()));
                            pressureDayStatisticProvider.d(((HiStressMetaData) list.get(0)).fetchStressScore());
                        } else {
                            LogUtil.a("PressureDayStatisticProvider", "SCORE values is 0");
                            pressureDayStatisticProvider.d(0);
                        }
                    }
                    break;
                case 1005:
                    if (message.obj instanceof List) {
                        pressureDayStatisticProvider.c((List<HiHealthData>) message.obj);
                    }
                    break;
                case 1006:
                    pressureDayStatisticProvider.d();
                    break;
                default:
                    LogUtil.j("PressureDayStatisticProvider", "MyHandler handleMessage switch default");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list) {
        LogUtil.a("PressureDayStatisticProvider", "now it updateDiagram");
        List<wut> listB = this.f28005a.b(list);
        a();
        this.e.e(ugh.e(listB, BaseApplication.getContext().getString(R.string.IDS_hw_pressure_averge_pressure_of_day), 10001));
        if (list.size() > 0) {
            this.f28007c.removeMessages(1006);
            this.f28007c.sendEmptyMessageDelayed(1006, 100L);
            this.e.e(ugh.b(this.f28005a.b(list)));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.e.a(this.f28005a.d());
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Date date = this.g;
        if (date == null) {
            return;
        }
        this.f28005a.c(ltb.c(date), 7, new d(this, 3));
    }

    private void a() {
        Date date = this.g;
        if (date != null) {
            nkp.a().b(ltb.l(date), ltb.o(this.g), new d(this, 1));
        } else {
            LogUtil.a("PressureDayStatisticProvider", "getScoreValue mStartDateTimeDate is null ");
            d(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i > 0) {
            this.e.a(ugh.c(BaseApplication.getContext().getString(R.string.IDS_hw_pressure_averge_pressure_of_day), UnitUtil.e(i, 1, 0), wvb.a(i)));
        }
        b();
    }

    private void b() {
        SectionBean sectionBean = this.d;
        if (sectionBean != null) {
            sectionBean.d(this, this.e);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        this.d = null;
    }
}
