package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.servicesui.R;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.coq;
import defpackage.gxq;
import defpackage.ltb;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class SleepEnvNoiseLineChartProvider extends MinorProvider<gxq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f26795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f26796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26797c;
    private long d;
    private long e;
    private SectionBean f;
    private boolean g;
    private long h;
    private Observer i;
    private long j;
    private gxq m = new gxq(SleepViewConstants.ViewTypeEnum.DAY);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        this.f26797c = context;
        if (this.m == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("isActive: ");
        gxq gxqVar = this.m;
        sb.append(gxqVar == null ? "false" : Boolean.valueOf(gxqVar.g().n()));
        LogUtil.a("SleepEnvNoiseLineChartProvider", sb.toString());
        gxq gxqVar2 = this.m;
        return gxqVar2 != null && gxqVar2.g().n();
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("SleepEnvNoiseLineChartProvider", "loadData");
        e();
        this.f = sectionBean;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepEnvNoiseLineChartProvider", "parseParams");
        this.m = gxqVar;
        e(context, map, gxqVar);
    }

    private void e(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepEnvNoiseLineChartProvider", "start to set env noise data");
        map.put("ENV_NOISE_TITLE", context.getResources().getString(R.string.IDS_env_noise_chart_title));
        map.put("ENV_NOISE_UNIT", context.getResources().getString(R.string.IDS_env_noise_chart_unit));
        map.put("ENV_NOISE_REGION_DEFINITION", context.getResources().getString(R.string.IDS_env_noise_region_definition));
        map.put("SLEEP_START_TIME", Long.valueOf(gxqVar.g().w()));
        map.put("SLEEP_END_TIME", Long.valueOf(gxqVar.g().p()));
        String strR = gxqVar.g().r();
        if (TextUtils.isEmpty(strR)) {
            map.put("ENVIRONMENTAL_NOISE_AVERAGEDB", 0);
        } else {
            try {
                map.put("ENVIRONMENTAL_NOISE_AVERAGEDB", Integer.valueOf(new JSONObject(strR).getInt("avgSnoreDb")));
            } catch (JSONException unused) {
                LogUtil.a("SleepEnvNoiseLineChartProvider", "sleep environmental noise MetaData get fail");
            }
        }
        map.put("ENVIRONMENTAL_NOISE_DATA_LIST", gxqVar.g().v());
        LogUtil.a("SleepEnvNoiseLineChartProvider", "noise sequencedata: ", gxqVar.g().v());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "SleepEnvNoiseLineChartProvider";
    }

    public void d(Context context, SectionBean sectionBean) {
        LogUtil.a("SleepEnvNoiseLineChartProvider", "begin to request envnoise data!");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(this.h);
        hiDataReadOption.setEndTime(this.j);
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.ENVIRONMENT_NOISE_TYPE.value()});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(5);
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).a(1).b(), new c(this));
    }

    static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<SleepEnvNoiseLineChartProvider> f26798b;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public c(SleepEnvNoiseLineChartProvider sleepEnvNoiseLineChartProvider) {
            this.f26798b = new WeakReference<>(sleepEnvNoiseLineChartProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            SleepEnvNoiseLineChartProvider sleepEnvNoiseLineChartProvider;
            if (i == 0 && (obj instanceof SparseArray) && (sleepEnvNoiseLineChartProvider = this.f26798b.get()) != null) {
                Object obj2 = ((SparseArray) obj).get(DicDataTypeUtil.DataType.ENVIRONMENT_NOISE_TYPE.value());
                sleepEnvNoiseLineChartProvider.d((List<HiHealthData>) (obj2 instanceof List ? (List) obj2 : null));
            }
        }
    }

    private void b(gxq gxqVar) {
        Date date = new Date(gxqVar.g().j());
        this.f26796b = date;
        this.e = ltb.e(date) * 1000;
        long jE = ltb.e(this.f26796b) * 1000;
        this.h = jE - 28800000;
        this.j = jE + 86400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        this.m = gxqVar;
        this.f = sectionBean;
        b(gxqVar);
        d(this.f26797c, sectionBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list) {
        if (coq.d(list)) {
            LogUtil.e(getLogTag(), "no env noise data!");
            return;
        }
        boolean zA = a(list);
        HiHealthData hiHealthData = list.get(0);
        LogUtil.a("SleepEnvNoiseLineChartProvider", "lastHihealthData.getStartTime(): ", Long.valueOf(hiHealthData.getStartTime()));
        LogUtil.a("SleepEnvNoiseLineChartProvider", "lastHihealthData.getEndTime(): ", Long.valueOf(hiHealthData.getEndTime()));
        if (!zA) {
            boolean z = this.e < hiHealthData.getEndTime();
            LogUtil.a("SleepEnvNoiseLineChartProvider", "isValidEnvNoise: ", Boolean.valueOf(z));
            if (z) {
                this.g = false;
                this.d = hiHealthData.getStartTime();
                this.f26795a = hiHealthData.getEndTime();
            } else {
                this.g = true;
            }
        }
        e(this.d, this.f26795a);
    }

    private boolean a(List<HiHealthData> list) {
        if (coq.d(list)) {
            LogUtil.e(getLogTag(), "no env noise data!");
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            LogUtil.a("SleepEnvNoiseLineChartProvider", "hiHealthData start time:", Long.valueOf(hiHealthData.getStartTime()));
            if (this.e < hiHealthData.getEndTime() && hiHealthData.getEndTime() - hiHealthData.getStartTime() > 10800000) {
                LogUtil.a("SleepEnvNoiseLineChartProvider", "coresleep start time:", Long.valueOf(hiHealthData.getStartTime()));
                LogUtil.a("SleepEnvNoiseLineChartProvider", "coresleep end time:", Long.valueOf(hiHealthData.getEndTime()));
                LogUtil.a("SleepEnvNoiseLineChartProvider", "coresleep meta data:", hiHealthData.getMetaData());
                this.g = false;
                this.d = hiHealthData.getStartTime();
                this.f26795a = hiHealthData.getEndTime();
                return true;
            }
        }
        return false;
    }

    private void e(long j, long j2) {
        LogUtil.a("SleepEnvNoiseLineChartProvider", "begin to request envnoise sequence data!");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.ENVIRONMENT_NOISE_TYPE.value()});
        HiHealthNativeApi.a(this.f26797c).readHiHealthData(hiDataReadOption, new b(this));
    }

    static class b implements HiDataReadResultListener {
        private final WeakReference<SleepEnvNoiseLineChartProvider> d;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public b(SleepEnvNoiseLineChartProvider sleepEnvNoiseLineChartProvider) {
            this.d = new WeakReference<>(sleepEnvNoiseLineChartProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            SleepEnvNoiseLineChartProvider sleepEnvNoiseLineChartProvider;
            if (i == 0 && (obj instanceof SparseArray) && (sleepEnvNoiseLineChartProvider = this.d.get()) != null) {
                Object obj2 = ((SparseArray) obj).get(DicDataTypeUtil.DataType.ENVIRONMENT_NOISE_TYPE.value());
                List list = obj2 instanceof List ? (List) obj2 : null;
                if (coq.d(list)) {
                    LogUtil.e(sleepEnvNoiseLineChartProvider.getLogTag(), "no env noise data!");
                    return;
                }
                HiHealthData hiHealthData = (HiHealthData) list.get(0);
                sleepEnvNoiseLineChartProvider.m.g().g(hiHealthData.getStartTime());
                sleepEnvNoiseLineChartProvider.m.g().h(hiHealthData.getEndTime());
                sleepEnvNoiseLineChartProvider.m.g().b(hiHealthData.getMetaData());
                sleepEnvNoiseLineChartProvider.m.g().c(hiHealthData.getSequenceData());
                sleepEnvNoiseLineChartProvider.d(sleepEnvNoiseLineChartProvider.f26797c, sleepEnvNoiseLineChartProvider.f, sleepEnvNoiseLineChartProvider.g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, SectionBean sectionBean, boolean z) {
        LogUtil.a(getLogTag(), "mIsEnvNoiseSeqEmpty:", Boolean.valueOf(this.g));
        if (this.g) {
            this.f.d(this, (Object) null);
        } else {
            this.f.d(this, this.m);
        }
    }

    private void e() {
        if (this.i == null) {
            Observer observer = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepEnvNoiseLineChartProvider.1
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    SleepEnvNoiseLineChartProvider sleepEnvNoiseLineChartProvider = SleepEnvNoiseLineChartProvider.this;
                    sleepEnvNoiseLineChartProvider.d(sleepEnvNoiseLineChartProvider.f26797c, SleepEnvNoiseLineChartProvider.this.f);
                }
            };
            this.i = observer;
            ObserverManagerUtil.d(observer, "ENVIRONMENT_NOISE_SAVED_TIME");
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("SleepEnvNoiseLineChartProvider", "clear envnoise section");
        ObserverManagerUtil.a(this.i, "ENVIRONMENT_NOISE_SAVED_TIME");
    }
}
