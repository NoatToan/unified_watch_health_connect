package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.seekbar.HealthSeekBarExtend;
import com.huawei.ui.main.R;
import defpackage.fdi;
import defpackage.fej;
import defpackage.kjy;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SleepBreatheBannerProvider extends BaseKnitDataProvider<HiHealthData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Integer, Integer> f26770a;
    public static final Map<Integer, Integer> e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SectionBean f26772c;
    private boolean d = false;
    private List<Integer> g;

    static {
        HashMap map = new HashMap(4);
        e = map;
        map.put(1, Integer.valueOf(R.string.IDS_sleep_breathe_normal));
        map.put(2, Integer.valueOf(R.string.IDS_sleep_breathe_mild));
        map.put(3, Integer.valueOf(R.string.IDS_sleep_breathe_moderate));
        map.put(4, Integer.valueOf(R.string.IDS_sleep_breathe_severe));
        HashMap map2 = new HashMap(4);
        f26770a = map2;
        map2.put(1, Integer.valueOf(R.string.IDS_sleep_breathe_normal));
        map2.put(2, Integer.valueOf(R.string.IDS_sleep_breathe_mild_sus));
        map2.put(3, Integer.valueOf(R.string.IDS_sleep_breathe_moderate_sus));
        map2.put(4, Integer.valueOf(R.string.IDS_sleep_breathe_severe_sus));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.sleep-apnea");
    }

    public static boolean a() {
        Map mapE = e();
        if (mapE == null) {
            ReleaseLogUtil.a("Sleep_SleepBreatheBannerProvider", "checkMedicalTypeNMPA extInfo is null!");
            return false;
        }
        Object obj = mapE.get("medical");
        ReleaseLogUtil.d("Sleep_SleepBreatheBannerProvider", "checkMedicalTypeNMPA medicalValue = ", obj);
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return false;
        }
        Object obj2 = mapE.get("medicalType");
        ReleaseLogUtil.d("Sleep_SleepBreatheBannerProvider", "checkMedicalTypeNMPA medicalTypeValue = ", obj2);
        if (obj2 instanceof String) {
            return "NMPA".equals((String) obj2);
        }
        return false;
    }

    private static Map e() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.sleep-apnea");
        if (fdiVarD == null) {
            ReleaseLogUtil.e("Sleep_SleepBreatheBannerProvider", "getExtInfo featureConfig is null");
            return null;
        }
        return fdiVarD.e();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.d = a();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        if (!isActive(BaseApplication.b())) {
            LogUtil.j("Sleep_SleepBreatheBannerProvider", "loadData can not show SleepBreatheBanner section");
            return;
        }
        this.f26772c = sectionBean;
        d(sectionBean);
        if (njy.e(this.g)) {
            LogUtil.a("Sleep_SleepBreatheBannerProvider", "loadData type:", Integer.valueOf(DicDataTypeUtil.DataType.OSA_SET.value()));
            HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(DicDataTypeUtil.DataType.OSA_SET.value(), new b(this, null));
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, HiHealthData hiHealthData) {
        c(map, hiHealthData);
    }

    private void c(HashMap<String, Object> map, HiHealthData hiHealthData) {
        String string;
        String string2;
        String string3;
        LogUtil.a("Sleep_SleepBreatheBannerProvider", "setData");
        map.clear();
        if (this.d) {
            string = BaseApplication.b().getResources().getString(R.string.IDS_sleep_breathe_banner_title_nmpa);
        } else {
            string = BaseApplication.b().getResources().getString(R.string.IDS_sleep_breathe_banner_title);
        }
        map.put("TITLE", string);
        if (LanguageUtil.ba(BaseApplication.b())) {
            map.put("LEFT_ICON_IMAGE", qqz.e(BaseApplication.b(), R.drawable.ic_sleep_breathe));
        } else {
            map.put("LEFT_ICON_IMAGE", ContextCompat.getDrawable(BaseApplication.b(), R.drawable.ic_sleep_breathe));
        }
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass5());
        if (hiHealthData == null || hiHealthData.getStartTime() == 0) {
            LogUtil.j("Sleep_SleepBreatheBannerProvider", "data is null");
            if (this.d) {
                string2 = BaseApplication.b().getResources().getString(R.string.IDS_sleep_breathe_no_data_nmpa);
            } else {
                string2 = BaseApplication.b().getResources().getString(R.string.IDS_sleep_breathe_no_data);
            }
            map.put("SUBTITLE", string2);
            return;
        }
        int i = hiHealthData.getInt("osaLevel");
        if (i > 0 && i <= 4) {
            if (this.d) {
                string3 = BaseApplication.b().getResources().getString(f26770a.get(Integer.valueOf(i)).intValue());
            } else {
                string3 = BaseApplication.b().getResources().getString(e.get(Integer.valueOf(i)).intValue());
            }
            map.put("SUBTITLE", string3);
        }
        map.put("SECTION_CHART", a(i));
        map.put("BAR_CHART_DATE_TEXT", Long.valueOf(hiHealthData.getStartTime()));
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBreatheBannerProvider$5, reason: invalid class name */
    public class AnonymousClass5 implements View.OnClickListener {
        AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qrs.r()) {
                return;
            }
            LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: tyt
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f49805a.d(i, obj);
                }
            }, "");
        }

        public /* synthetic */ void d(int i, Object obj) {
            if (i == 0) {
                SleepBreatheBannerProvider.this.b();
            } else {
                LogUtil.j("Sleep_SleepBreatheBannerProvider", "onClick errorCode = ", Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        kjy.b().startOsaH5(BaseApplication.b(), "Sleep_0001");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(final SectionBean sectionBean) {
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: tyo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49799c.d(sectionBean);
                }
            });
            return;
        }
        LogUtil.a("Sleep_SleepBreatheBannerProvider", "start queryLastData");
        HiAggregateOption hiAggregateOptionD = d();
        hiAggregateOptionD.setCount(5);
        hiAggregateOptionD.setTimeRange(0L, System.currentTimeMillis());
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOptionD, new e(this, sectionBean, null));
    }

    public static HiAggregateOption d() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.OSA_LEVEL.value()});
        hiAggregateOption.setConstantsKey(new String[]{"osaLevel"});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    private View a(int i) {
        View viewInflate = LayoutInflater.from(BaseApplication.b()).inflate(R.layout.sleep_breathe_banner_chart, (ViewGroup) null);
        LogUtil.a("Sleep_SleepBreatheBannerProvider", "initSleepBreatheSeekBar inflated view: ", viewInflate);
        HealthSeekBarExtend healthSeekBarExtend = (HealthSeekBarExtend) viewInflate.findViewById(R.id.sleep_breathe_seek_bar);
        if (healthSeekBarExtend == null) {
            LogUtil.e("Sleep_SleepBreatheBannerProvider", "initSleepBreatheSeekBar mSeekBarExtend is null");
            return null;
        }
        healthSeekBarExtend.setMax(40);
        LogUtil.a("Sleep_SleepBreatheBannerProvider", "osaLevel = ", Integer.valueOf(i));
        if (i < 0) {
            i = 0;
        } else if (i > 4) {
            i = 4;
        } else {
            LogUtil.d("Sleep_SleepBreatheBannerProvider", "The progress is normal. No special handling is required.");
        }
        healthSeekBarExtend.setProgress((i * 10) - 5);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        super.onResume();
        SectionBean sectionBean = this.f26772c;
        if (sectionBean == null) {
            LogUtil.j("Sleep_SleepBreatheBannerProvider", "onResume mSectionBean is null, return");
        } else if (this.f26771b) {
            this.f26771b = false;
            d(sectionBean);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        if (njy.e(this.g)) {
            LogUtil.j("Sleep_SleepBreatheBannerProvider", "onDestroy mSuccessList is empty");
        } else {
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.g, new HiUnSubscribeListener() { // from class: typ
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("Sleep_SleepBreatheBannerProvider", "unSubscribeData isSuccess = ", Boolean.valueOf(z));
                }
            });
        }
    }

    static class e implements HiAggregateListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SleepBreatheBannerProvider> f26775c;
        private final WeakReference<SectionBean> e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        /* synthetic */ e(SleepBreatheBannerProvider sleepBreatheBannerProvider, SectionBean sectionBean, AnonymousClass5 anonymousClass5) {
            this(sleepBreatheBannerProvider, sectionBean);
        }

        private e(SleepBreatheBannerProvider sleepBreatheBannerProvider, SectionBean sectionBean) {
            this.f26775c = new WeakReference<>(sleepBreatheBannerProvider);
            this.e = new WeakReference<>(sectionBean);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            HiHealthData next;
            SleepBreatheBannerProvider sleepBreatheBannerProvider = this.f26775c.get();
            SectionBean sectionBean = this.e.get();
            if (sleepBreatheBannerProvider == null || sectionBean == null) {
                LogUtil.j("Sleep_SleepBreatheBannerProvider", "SleepBreatheBannerProvider is null in InnerHiAggregateListener");
                return;
            }
            if (njy.e(list)) {
                LogUtil.j("Sleep_SleepBreatheBannerProvider", "queryLastData dataList is empty");
                sectionBean.c(new HiHealthData());
                return;
            }
            Iterator<HiHealthData> it = list.iterator();
            HiHealthData hiHealthData = null;
            while (it.hasNext() && (next = it.next()) != null) {
                if (hiHealthData == null || hiHealthData.getEndTime() < next.getEndTime()) {
                    hiHealthData = next;
                }
            }
            sectionBean.c(hiHealthData);
        }
    }

    static final class b implements HiSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SleepBreatheBannerProvider> f26774c;

        /* synthetic */ b(SleepBreatheBannerProvider sleepBreatheBannerProvider, AnonymousClass5 anonymousClass5) {
            this(sleepBreatheBannerProvider);
        }

        private b(SleepBreatheBannerProvider sleepBreatheBannerProvider) {
            this.f26774c = new WeakReference<>(sleepBreatheBannerProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            SleepBreatheBannerProvider sleepBreatheBannerProvider = this.f26774c.get();
            if (sleepBreatheBannerProvider != null) {
                sleepBreatheBannerProvider.g = list;
                LogUtil.a("Sleep_SleepBreatheBannerProvider", "subscribeData, onResult:" + list);
                return;
            }
            LogUtil.j("Sleep_SleepBreatheBannerProvider", "SleepBreatheBannerProvider is null in InnerHiAggregateListener");
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("Sleep_SleepBreatheBannerProvider", "onChange, type=", i + "-client-" + hiHealthClient + "-changeKey-" + str + "-newValue-" + hiHealthData + "-time=" + j);
            SleepBreatheBannerProvider sleepBreatheBannerProvider = this.f26774c.get();
            if (sleepBreatheBannerProvider != null) {
                sleepBreatheBannerProvider.f26771b = true;
            } else {
                LogUtil.j("Sleep_SleepBreatheBannerProvider", "SleepBreatheBannerProvider is null in InnerHiAggregateListener");
            }
        }
    }
}
