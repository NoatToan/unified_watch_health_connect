package com.huawei.ui.homehealth.runcard.trackfragments.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.section.listener.IPageResTrigger;
import com.huawei.health.knit.section.model.MarketingIdInfo;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.TabGeneralTemplate;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.tabtemplate.BaseTemplateConfig;
import com.huawei.tabtemplate.SportSubTabConfig;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.trackfragments.H5SportFragment;
import com.huawei.ui.homehealth.runcard.trackfragments.SportTabPageResTrigger;
import com.huawei.ui.homehealth.runcard.trackfragments.viewmodel.SportViewModel;
import com.huawei.ui.main.stories.me.util.StepCounterSupportUtil;
import defpackage.erj;
import defpackage.lls;
import defpackage.njy;
import defpackage.pjd;
import defpackage.pjg;
import defpackage.qen;
import defpackage.qle;
import defpackage.qpm;
import defpackage.qqt;
import defpackage.qrs;
import defpackage.sze;
import defpackage.szu;
import defpackage.wpd;
import defpackage.wpf;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class SportViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MutableLiveData<ArrayList<qpm>> f25971a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25973c;
    private MutableLiveData<qpm> d;
    private Context e;
    private boolean f;
    private boolean h;
    private wpf<qen> i;
    private wpf<qen> k;
    private List<SportSubTabConfig> l;
    private List<ResourceBriefInfo> m;
    private Observer n;
    private MutableLiveData<qpm> o;
    private e q;
    private ArrayList<qpm> t;
    private boolean g = false;
    private WeakReference<qpm> j = new WeakReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<qpm> f25972b = new WeakReference<>(null);
    private List<String> p = new ArrayList();

    public SportViewModel() {
        ReleaseLogUtil.d("Track_SportViewModel", "SportViewModel start");
        this.t = new ArrayList<>();
        this.f25971a = new MutableLiveData<>();
        this.d = new MutableLiveData<>();
        this.o = new MutableLiveData<>();
        this.e = BaseApplication.b();
        this.q = new e(this);
        if (Utils.o()) {
            c cVar = new c(this);
            this.n = cVar;
            ObserverManagerUtil.d(cVar, "OPERATION_FUNCTION_ENTRANCE");
        }
    }

    public void c(Context context) {
        if (context == null) {
            LogUtil.j("Track_SportViewModel", "initStepCounter context is null");
        } else {
            this.g = StepCounterSupportUtil.d(context.getApplicationContext(), new StepCounterSupportUtil.StepCounterSupportCallback() { // from class: szi
                @Override // com.huawei.ui.main.stories.me.util.StepCounterSupportUtil.StepCounterSupportCallback
                public final void onIsSupportStepCounter(boolean z) {
                    this.e.d(z);
                }
            });
        }
    }

    public /* synthetic */ void d(boolean z) {
        this.g = z;
        qpm qpmVar = this.j.get();
        if (qpmVar == null) {
            return;
        }
        if (z) {
            this.d.postValue(qpmVar);
        } else {
            this.o.postValue(qpmVar);
        }
    }

    private qpm h(int i, SportSubTabConfig sportSubTabConfig) {
        if (i != 137) {
            if (i == 264) {
                return f(i, sportSubTabConfig);
            }
            if (i == 286) {
                return c(i, sportSubTabConfig);
            }
            if (i == 10001) {
                return b(i, sportSubTabConfig);
            }
            if (i == 500001) {
                return e(i, sportSubTabConfig);
            }
            if (i != 282) {
                if (i == 283) {
                    return g(i, sportSubTabConfig);
                }
                switch (i) {
                    case 257:
                    case 259:
                        return j(i, sportSubTabConfig);
                    case 258:
                        return j(i, sportSubTabConfig);
                }
            }
            return d(i, sportSubTabConfig);
        }
        if (CommonUtil.az()) {
            return null;
        }
        return a(i, sportSubTabConfig);
    }

    private qpm a(int i, SportSubTabConfig sportSubTabConfig) {
        if (Utils.o() || !LanguageUtil.l(BaseApplication.b())) {
            return null;
        }
        return j(i, sportSubTabConfig);
    }

    private qpm b(int i, SportSubTabConfig sportSubTabConfig) {
        if (!SportSupportUtil.b()) {
            return null;
        }
        qpm qpmVarJ = j(i, sportSubTabConfig);
        this.f25972b = new WeakReference<>(qpmVarJ);
        return qpmVarJ;
    }

    private qpm d(int i, SportSubTabConfig sportSubTabConfig) {
        if (CommonUtil.bu() || CommonUtil.ap() || CommonUtil.ca()) {
            return null;
        }
        return j(i, sportSubTabConfig);
    }

    private qpm c(int i, SportSubTabConfig sportSubTabConfig) {
        if (SportSupportUtil.o()) {
            return j(i, sportSubTabConfig);
        }
        return null;
    }

    private qpm e(int i, SportSubTabConfig sportSubTabConfig) {
        if (Utils.o() || !LanguageUtil.l(BaseApplication.b())) {
            if (CommonUtil.cl() || CommonUtil.ao()) {
                return j(i, sportSubTabConfig);
            }
            return null;
        }
        return j(i, sportSubTabConfig);
    }

    private qpm g(int i, SportSubTabConfig sportSubTabConfig) {
        if (!SportSupportUtil.k()) {
            LogUtil.a("Track_SportViewModel", "device not support skipping");
            return null;
        }
        return j(i, sportSubTabConfig);
    }

    private qpm f(int i, SportSubTabConfig sportSubTabConfig) {
        if (!this.g) {
            return null;
        }
        qpm qpmVarJ = j(i, sportSubTabConfig);
        this.j = new WeakReference<>(qpmVarJ);
        return qpmVarJ;
    }

    private qpm j(int i, SportSubTabConfig sportSubTabConfig) {
        int i2;
        LogUtil.a("Track_SportViewModel", "buildFragmentSubTabPagerBean sportType = ", Integer.valueOf(i));
        if (((FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class)) == null) {
            return null;
        }
        String strB = qqt.b(sportSubTabConfig);
        Bundle bundle = new Bundle();
        boolean z = false;
        if (i == 283) {
            i2 = R.string.IDS_indoor_skipper_rope_sport_type;
        } else if (i == 137) {
            i2 = R.string.IDS_start_fitness_type_yoga;
        } else if (i == 258) {
            i2 = R.string.IDS_start_track_sport_type_outdoor_run;
        } else if (i == 264) {
            i2 = R.string.IDS_start_track_sport_type_indoor_run;
        } else if (i == 260) {
            i2 = R.string.IDS_motiontrack_climb_hill_tip;
        } else if (i == 282) {
            i2 = R.string.IDS_hwh_sport_type_hiking;
        } else if (i == 257) {
            i2 = R.string.IDS_settings_one_level_menu_settings_item_text_id6;
        } else if (i == 259) {
            i2 = R.string.IDS_hwh_start_track_sport_type_cycle;
        } else if (i == 286) {
            i2 = R.string.IDS_motiontrack_golf_tip;
        } else if (i == 500001) {
            i2 = R.string.IDS_settings_recommend;
            z = true;
        } else if (i == 10001) {
            i2 = R.string.IDS_hwh_home_other_onboarding_workout;
        } else {
            int i3 = R.string.IDS_device_setting_other;
            LogUtil.e("Track_SportViewModel", "no sportType found for KnitFragment type = ", Integer.valueOf(i));
            i2 = i3;
        }
        IPageResTrigger iPageResTriggerA = a(i, bundle);
        if (iPageResTriggerA != null) {
            iPageResTriggerA.setExtra(bundle).setIsNeedToLoadEmptyLayout(z);
        }
        KnitFragment knitFragmentNewInstance = KnitFragment.newInstance(strB, iPageResTriggerA);
        if (i == 283) {
            knitFragmentNewInstance.setOnActivityResultListener(new KnitFragment.OnActivityResultListener() { // from class: szd
                @Override // com.huawei.health.knit.ui.KnitFragment.OnActivityResultListener
                public final void onActivityResult(int i4, int i5, Intent intent) {
                    SportViewModel.c(i4, i5, intent);
                }
            });
        }
        qpm qpmVar = new qpm(knitFragmentNewInstance, this.e.getString(i2), i);
        qpmVar.a(iPageResTriggerA);
        return qpmVar;
    }

    public static /* synthetic */ void c(int i, int i2, Intent intent) {
        if (i == 102 && i2 == -1) {
            erj.b((Context) BaseApplication.j(), true);
        }
    }

    private IPageResTrigger a(int i, Bundle bundle) {
        sze szeVar;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (i == 137) {
            szeVar = new sze(4020, 23, 23, 3024);
            arrayList.add(1008);
        } else if (i == 283) {
            szeVar = new sze(4019, 390, 27, 3023);
            arrayList.add(1013);
        } else if (i == 258) {
            szeVar = new sze(4012, 4, 4, 3016);
            arrayList.add(1005);
        } else if (i == 264) {
            szeVar = new sze(4013, 240, 4, 3017);
            arrayList.add(1006);
        } else if (i == 260) {
            szeVar = new sze(4022, 26, 26, 3026);
            arrayList.add(1011);
        } else if (i == 282) {
            szeVar = new sze(4023, 25, 25, 3027);
            arrayList.add(1012);
        } else if (i == 257) {
            szeVar = new sze(4015, 5, 5, 3019);
            arrayList.add(1009);
        } else if (i == 259) {
            szeVar = new sze(4016, 6, 6, 3020);
            arrayList.add(1010);
        } else if (i == 286) {
            szeVar = new sze(4056, 420, 29, 3043);
        } else if (i == 500001) {
            szeVar = new sze(4040, 410, 0, 3042);
            bundle.putBoolean(BasePageResTrigger.KET_EXTRA_IS_SET_BI_ON_VISIBLE, true);
        } else if (i == 10001) {
            szeVar = new sze(4014, 22, 22, 3018);
            arrayList.add(1007);
        } else {
            LogUtil.j("Track_SportViewModel", "no res pos id found for sportType = ", Integer.valueOf(i));
            return null;
        }
        bundle.putIntegerArrayList(BasePageResTrigger.KEY_EXTRA_RES_POS_ID_LIST, arrayList);
        return new SportTabPageResTrigger(this.e, szeVar.e, new MarketingIdInfo.a().a(szeVar.d).b(szeVar.f48823a).d());
    }

    public void d() {
        if (this.f25971a == null) {
            LogUtil.e("Track_SportViewModel", "mFragmentSubTabPagerBeans is null.");
            return;
        }
        if (njy.b(this.t)) {
            this.f25971a.postValue(this.t);
            return;
        }
        this.l = m();
        this.p = szu.d();
        this.t = e(this.l);
        b(this.p);
        this.f25971a.postValue(this.t);
    }

    public void i() {
        if (this.f25971a == null) {
            LogUtil.e("Track_SportViewModel", "mFragmentSubTabPagerBeans is null.");
        } else {
            if (njy.b(this.t)) {
                return;
            }
            this.l = m();
            this.p = szu.d();
            this.t = e(this.l);
            b(this.p);
        }
    }

    public void j() {
        this.t.clear();
    }

    private List<SportSubTabConfig> m() {
        c(this.e, "SportTabConstructor.json");
        c("SportTabConstructor");
        wpf wpfVarK = k();
        if (wpfVarK == null) {
            return null;
        }
        BaseTemplateConfig baseTemplateConfigB = wpfVarK.b();
        if (baseTemplateConfigB instanceof qen) {
            return ((qen) baseTemplateConfigB).d();
        }
        return null;
    }

    public void h() {
        if (CommonUtil.ab(this.e)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.viewmodel.SportViewModel.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SportViewModel.this.h();
                    }
                });
                return;
            }
            if (njy.e(this.l)) {
                this.l = m();
            }
            MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
            if (marketingApi != null) {
                Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(7001);
                LogUtil.a("Track_SportViewModel", "start marketingApi getResourceResultInfo");
                resourceResultInfo.addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.viewmodel.SportViewModel.3
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                        LogUtil.a("Track_SportViewModel", "getResourceResultInfo onSuccess = ", map);
                        if (map == null) {
                            LogUtil.j("Track_SportViewModel", "resourceResultInfoMap is null");
                            return;
                        }
                        ResourceResultInfo resourceResultInfo2 = map.get(7001);
                        if (resourceResultInfo2 == null) {
                            LogUtil.e("Track_SportViewModel", "resourceResultInfoMap not have key 7001 error");
                            return;
                        }
                        SportViewModel.this.m = resourceResultInfo2.getResources();
                        SportViewModel.this.g();
                    }
                });
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (!this.f) {
            LogUtil.a("Track_SportViewModel", "[dealMergedSportTabData]: getSportTypeList is not ready.");
            return;
        }
        if (this.f25971a == null) {
            LogUtil.e("Track_SportViewModel", "mFragmentSubTabPagerBeans is null.");
            return;
        }
        if (this.h && njy.b(this.t)) {
            this.h = false;
            this.f25971a.postValue(this.t);
        }
        List<ResourceBriefInfo> list = this.m;
        if (list == null || list.size() == 0) {
            LogUtil.e("Track_SportViewModel", "resourceBriefInfoList.isEmpty()");
        } else {
            a(a(this.m), this.l);
            this.f = false;
        }
    }

    private int a(ResourceBriefInfo resourceBriefInfo) {
        TabGeneralTemplate tabGeneralTemplateD;
        if (resourceBriefInfo == null || (tabGeneralTemplateD = d(resourceBriefInfo)) == null || tabGeneralTemplateD.getSelectedTab() != 600001) {
            return -1;
        }
        LogUtil.a("Track_SportViewModel", "tabGeneralTemplate is ", tabGeneralTemplateD.toString());
        return tabGeneralTemplateD.getTabPosition();
    }

    private List<ResourceBriefInfo> a(List<ResourceBriefInfo> list) {
        if (njy.e(list)) {
            return null;
        }
        Collections.sort(list, new Comparator<ResourceBriefInfo>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.viewmodel.SportViewModel.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(ResourceBriefInfo resourceBriefInfo, ResourceBriefInfo resourceBriefInfo2) {
                return resourceBriefInfo2.getPriority() - resourceBriefInfo.getPriority();
            }
        });
        if (njy.e(this.p)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.p.size(); i++) {
            for (ResourceBriefInfo resourceBriefInfo : list) {
                if (resourceBriefInfo != null && String.valueOf(b(resourceBriefInfo)).equals(this.p.get(i))) {
                    arrayList.add(resourceBriefInfo);
                }
            }
        }
        if (arrayList.size() != list.size()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (!arrayList.contains(list.get(i2))) {
                    arrayList.add(i2, list.get(i2));
                }
            }
        }
        return arrayList;
    }

    private qpm c(ResourceBriefInfo resourceBriefInfo) {
        H5SportFragment h5SportFragment = new H5SportFragment();
        Bundle bundle = new Bundle();
        TabGeneralTemplate tabGeneralTemplateD = d(resourceBriefInfo);
        int iA = a(resourceBriefInfo);
        if (tabGeneralTemplateD == null) {
            return null;
        }
        bundle.putString("url", tabGeneralTemplateD.getLinkValue());
        h5SportFragment.setArguments(bundle);
        return new qpm(h5SportFragment, e(resourceBriefInfo), iA + 600001);
    }

    private void a(List<ResourceBriefInfo> list, List<SportSubTabConfig> list2) {
        qpm qpmVarC;
        if (njy.e(list) || njy.e(list2)) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList<qpm> arrayList = new ArrayList<>();
        HashMap map = new HashMap();
        for (ResourceBriefInfo resourceBriefInfo : list) {
            if (resourceBriefInfo != null) {
                int iB = b(resourceBriefInfo);
                if (!hashSet.contains(Integer.valueOf(iB)) || iB == 600001) {
                    if (iB == 600001) {
                        int iA = a(resourceBriefInfo);
                        ReleaseLogUtil.d("Track_SportViewModel", "dealMergedSportTabBeans sport");
                        qpmVarC = c(resourceBriefInfo);
                        map.put(Integer.valueOf(iA), qpmVarC);
                    } else {
                        qpmVarC = a(resourceBriefInfo, e(iB, list2));
                        if (qpmVarC != null) {
                            hashSet.add(Integer.valueOf(iB));
                            arrayList.add(qpmVarC);
                        }
                    }
                    c(resourceBriefInfo, qpmVarC);
                }
            }
        }
        LogUtil.a("Track_SportViewModel", "request market config and show ui");
        if (a(arrayList, map)) {
            if (this.t == null) {
                this.t = new ArrayList<>();
            }
            qpm.e(arrayList, this.t);
            j(arrayList);
            for (Map.Entry<Integer, qpm> entry : map.entrySet()) {
                LogUtil.a("Track_SportViewModel", "position is ", entry.getKey());
                this.t.remove(entry.getValue());
                if (njy.c(this.t, entry.getKey().intValue())) {
                    this.t.add(entry.getKey().intValue(), entry.getValue());
                } else {
                    this.t.add(entry.getValue());
                }
            }
            if (o()) {
                return;
            }
            this.f25971a.postValue(this.t);
        }
    }

    private void j(List<qpm> list) {
        qpm next;
        for (qpm qpmVar : list) {
            if (qpmVar != null && qpmVar.c() == 500001) {
                Iterator<qpm> it = this.t.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next != null && next.c() == 500001) {
                        it.remove();
                        break;
                    }
                }
                if (next != null) {
                    this.t.add(0, next);
                    return;
                }
                return;
            }
        }
    }

    private boolean o() {
        ArrayList<qpm> arrayList = this.t;
        if (arrayList == null) {
            return false;
        }
        for (final qpm qpmVar : arrayList) {
            if (qpmVar != null && qpmVar.c() == 500001) {
                Object objB = qpmVar.b();
                if (!(objB instanceof BasePageResTrigger)) {
                    return false;
                }
                final BasePageResTrigger basePageResTrigger = (BasePageResTrigger) objB;
                basePageResTrigger.onPageLoadOnlineSections(new Consumer() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.viewmodel.SportViewModel$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        this.e.d(basePageResTrigger, qpmVar, (List) obj);
                    }
                }, null);
                return true;
            }
        }
        return false;
    }

    /* synthetic */ void d(BasePageResTrigger basePageResTrigger, qpm qpmVar, List list) {
        if (!njy.e(list)) {
            basePageResTrigger.setCacheBeansList(list);
        } else {
            this.t.remove(qpmVar);
        }
        MutableLiveData<ArrayList<qpm>> mutableLiveData = this.f25971a;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(this.t);
        }
    }

    private qpm f() {
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        BaseFragment baseFragmentCreateIntelligencePlanTabFragment = fitnessAdviceApi != null ? fitnessAdviceApi.createIntelligencePlanTabFragment() : null;
        if (baseFragmentCreateIntelligencePlanTabFragment == null) {
            LogUtil.j("Track_SportViewModel", "constructSportPlanFragment  tabFragment == null");
            return null;
        }
        return new qpm(baseFragmentCreateIntelligencePlanTabFragment, this.e.getString(R.string.IDS_hwh_fitness_plan), 2);
    }

    private boolean a(ArrayList<qpm> arrayList, Map<Integer, qpm> map) {
        if (!map.isEmpty()) {
            return true;
        }
        if (!njy.e(arrayList) && !njy.e(this.t)) {
            if (arrayList.size() != this.t.size()) {
                return true;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).c() != this.t.get(i).c()) {
                    return true;
                }
            }
        }
        return false;
    }

    private int b(ResourceBriefInfo resourceBriefInfo) {
        TabGeneralTemplate tabGeneralTemplateD;
        if (resourceBriefInfo == null || (tabGeneralTemplateD = d(resourceBriefInfo)) == null) {
            return -1;
        }
        LogUtil.a("Track_SportViewModel", "tabGeneralTemplate is ", tabGeneralTemplateD.toString());
        if (tabGeneralTemplateD.getSelectedTab() != 0) {
            return tabGeneralTemplateD.getSelectedTab();
        }
        return -1;
    }

    private String e(ResourceBriefInfo resourceBriefInfo) {
        TabGeneralTemplate tabGeneralTemplateD = d(resourceBriefInfo);
        if (tabGeneralTemplateD != null) {
            return tabGeneralTemplateD.getName();
        }
        return "";
    }

    private TabGeneralTemplate d(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null) {
            return null;
        }
        try {
            return (TabGeneralTemplate) new Gson().fromJson(resourceBriefInfo.getContent().getContent(), TabGeneralTemplate.class);
        } catch (JsonSyntaxException e2) {
            LogUtil.e("Track_SportViewModel", "getOperationSportType exception = ", LogAnonymous.b(e2));
            return null;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b() {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: szc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48822b.b();
                }
            });
            return;
        }
        List<String> listA = szu.a();
        if (listA != null) {
            if (njy.e(this.p) && !njy.e(listA)) {
                b(listA);
                this.h = true;
                szu.b(listA);
            }
            this.p = listA;
        }
        this.q.sendEmptyMessage(100);
    }

    private void c(Context context, String str) {
        InputStream inputStreamOpen = null;
        AssetManager assets = context != null ? context.getAssets() : null;
        try {
            if (assets == null) {
                return;
            }
            try {
                inputStreamOpen = assets.open(str);
                this.i = (wpf) lls.e(inputStreamOpen, new TypeToken<wpf<qen>>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.viewmodel.SportViewModel.4
                });
            } catch (IOException | NullPointerException e2) {
                LogUtil.e("Track_SportViewModel", "sport template assets load failed: ", LogAnonymous.b(e2));
                IoUtils.c(inputStreamOpen);
            }
        } finally {
            IoUtils.c(null);
        }
    }

    private void c(String str) {
        this.k = (wpf) lls.b(wpd.d(str), new TypeToken<wpf<qen>>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.viewmodel.SportViewModel.5
        });
    }

    private wpf k() {
        wpf<qen> wpfVar = this.i;
        String strD = wpfVar != null ? wpfVar.d() : null;
        wpf<qen> wpfVar2 = this.k;
        String strD2 = wpfVar2 != null ? wpfVar2.d() : null;
        if (TextUtils.isEmpty(strD)) {
            return this.k;
        }
        if (TextUtils.isEmpty(strD2)) {
            return this.i;
        }
        return CommonUtil.e(strD, strD2) > 0 ? this.i : this.k;
    }

    private ArrayList<qpm> e(List<SportSubTabConfig> list) {
        ArrayList<qpm> arrayList = new ArrayList<>();
        if (!njy.e(list)) {
            LogUtil.d("Track_SportViewModel", "tabConfigList size: ", Integer.valueOf(list.size()));
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                SportSubTabConfig sportSubTabConfig = (SportSubTabConfig) copyOnWriteArrayList.get(i);
                if (sportSubTabConfig.getPageType() != 500001 || (!CommonUtil.ca() && VersionControlUtil.isSupportOperationAccount() && !Utils.o() && LanguageUtil.l(com.huawei.hwcommonmodel.application.BaseApplication.getContext()))) {
                    if (sportSubTabConfig.getPageType() == 10001) {
                        this.f25973c = i;
                    }
                    qpm qpmVarA = a((ResourceBriefInfo) null, sportSubTabConfig);
                    if (qpmVarA != null) {
                        arrayList.add(qpmVarA);
                    }
                }
            }
        }
        return arrayList;
    }

    private SportSubTabConfig e(int i, List<SportSubTabConfig> list) {
        if (list == null) {
            return null;
        }
        for (SportSubTabConfig sportSubTabConfig : list) {
            if (sportSubTabConfig != null && i == sportSubTabConfig.getPageType()) {
                return sportSubTabConfig;
            }
        }
        return null;
    }

    private qpm a(ResourceBriefInfo resourceBriefInfo, SportSubTabConfig sportSubTabConfig) {
        LogUtil.a("Track_SportViewModel", "getFragmentSubTabPagerBean");
        if (resourceBriefInfo == null && sportSubTabConfig == null) {
            return null;
        }
        int pageType = sportSubTabConfig != null ? sportSubTabConfig.getPageType() : 0;
        if (resourceBriefInfo != null) {
            pageType = b(resourceBriefInfo);
        }
        if (pageType == 0 || pageType == -1) {
            LogUtil.j("Track_SportViewModel", "sportType is default");
            return null;
        }
        LogUtil.a("Track_SportViewModel", "tabConfig sportType: ", Integer.valueOf(pageType));
        if (pageType == 2) {
            return f();
        }
        if (qrs.ah(com.huawei.hwcommonmodel.application.BaseApplication.getContext()) && (pageType == 258 || pageType == 264 || pageType == 257 || pageType == 259 || pageType == 282 || pageType == 260)) {
            return null;
        }
        return h(pageType, sportSubTabConfig);
    }

    private void c(ResourceBriefInfo resourceBriefInfo, qpm qpmVar) {
        TabGeneralTemplate tabGeneralTemplateD;
        if (resourceBriefInfo == null || qpmVar == null || (tabGeneralTemplateD = d(resourceBriefInfo)) == null) {
            return;
        }
        LogUtil.a("Track_SportViewModel", "tabGeneralTemplate is ", tabGeneralTemplateD.toString());
        qpmVar.d(tabGeneralTemplateD.getName());
        qpmVar.e(tabGeneralTemplateD.getPicture());
        qpmVar.c(tabGeneralTemplateD.getCornerIcon());
    }

    public void c(BaseFragment baseFragment, androidx.lifecycle.Observer<ArrayList<qpm>> observer) {
        this.f25971a.observe(baseFragment, observer);
    }

    public void d(BaseFragment baseFragment, androidx.lifecycle.Observer<qpm> observer) {
        this.d.observe(baseFragment, observer);
    }

    public void e(BaseFragment baseFragment, androidx.lifecycle.Observer<qpm> observer) {
        this.o.observe(baseFragment, observer);
    }

    public ArrayList<qpm> c(List<qle> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        final ArrayList arrayList = new ArrayList();
        for (qle qleVar : list) {
            if (qleVar != null) {
                arrayList.add(String.valueOf(qleVar.f()));
            }
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: szg
                @Override // java.lang.Runnable
                public final void run() {
                    SportViewModel.d(arrayList);
                }
            });
        }
        return h(list);
    }

    public static /* synthetic */ void d(List list) {
        szu.b(list);
        szu.d(list);
    }

    private ArrayList<qpm> h(List<qle> list) {
        if (this.t == null) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            if (this.t.get(i2).c() == 1) {
                i++;
            } else {
                int i3 = i2 - i;
                if (njy.c(list, i3) && list.get(i3).f() != this.t.get(i2).c()) {
                    return i(list);
                }
            }
        }
        return null;
    }

    private ArrayList<qpm> i(List<qle> list) {
        ArrayList<qpm> arrayList = new ArrayList<>();
        for (qle qleVar : list) {
            for (qpm qpmVar : this.t) {
                if (qpmVar.c() == qleVar.f()) {
                    arrayList.add(qpmVar);
                }
            }
        }
        for (int i = 0; i < this.t.size(); i++) {
            if (this.t.get(i).c() == 1) {
                arrayList.add(i, this.t.get(i));
            }
        }
        this.t.clear();
        this.t.addAll(arrayList);
        return arrayList;
    }

    private void b(List<String> list) {
        if (this.t == null || njy.e(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap();
        for (qpm qpmVar : this.t) {
            if (qpmVar != null) {
                treeMap.put(Integer.valueOf(qpmVar.c()), qpmVar);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int iJ = CommonUtil.j(list.get(i));
            if (treeMap.containsKey(Integer.valueOf(iJ))) {
                arrayList.add((qpm) treeMap.get(Integer.valueOf(iJ)));
                treeMap.remove(Integer.valueOf(iJ));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            if (this.t == null) {
                break;
            }
            ArrayList arrayList2 = new ArrayList(this.t);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                qpm qpmVar2 = (qpm) arrayList2.get(i2);
                if (qpmVar2 != null && qpmVar2.c() == ((Integer) entry.getKey()).intValue()) {
                    if (i2 <= arrayList.size()) {
                        arrayList.add(i2, (qpm) entry.getValue());
                    } else {
                        arrayList.add((qpm) entry.getValue());
                    }
                }
            }
        }
        ArrayList<qpm> arrayList3 = new ArrayList<>();
        this.t = arrayList3;
        arrayList3.addAll(arrayList);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        ArrayList<qpm> arrayList = this.t;
        if (arrayList != null) {
            arrayList.clear();
            this.t = null;
        }
        List<SportSubTabConfig> list = this.l;
        if (list != null) {
            list.clear();
            this.l = null;
        }
        List<ResourceBriefInfo> list2 = this.m;
        if (list2 != null) {
            list2.clear();
            this.m = null;
        }
        this.f25971a = null;
        if (this.n != null) {
            ReleaseLogUtil.d("Track_SportViewModel", "onCleared mObserver");
            ObserverManagerUtil.a(this.n, "OPERATION_FUNCTION_ENTRANCE");
            this.n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(List<pjd> list) {
        if (!pjg.c(list, "2")) {
            n();
        } else {
            l();
        }
    }

    private void n() {
        qpm next;
        if (njy.e(this.t) || this.f25971a == null) {
            LogUtil.j("Track_SportViewModel", "hideFitnessTab mTabFragmentList is null");
            return;
        }
        Iterator<qpm> it = this.t.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && next.c() == 10001) {
                break;
            }
        }
        if (next == null) {
            ReleaseLogUtil.d("Track_SportViewModel", "hideFitnessTab has hided");
            return;
        }
        ReleaseLogUtil.d("Track_SportViewModel", "hideFitnessTab");
        this.t.remove(next);
        this.f25971a.postValue(this.t);
    }

    private void l() {
        qpm next;
        if (njy.e(this.t) || this.f25971a == null) {
            LogUtil.j("Track_SportViewModel", "showFitnessTab mTabFragmentList is null");
            return;
        }
        Iterator<qpm> it = this.t.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && next.c() == 10001) {
                break;
            }
        }
        if (next != null) {
            ReleaseLogUtil.d("Track_SportViewModel", "showFitnessTab has showed");
            return;
        }
        SportSubTabConfig sportSubTabConfigE = e(10001, this.l);
        if (sportSubTabConfigE == null) {
            ReleaseLogUtil.d("Track_SportViewModel", "showFitnessTab fitnessTabConfig is null");
            return;
        }
        ReleaseLogUtil.d("Track_SportViewModel", "showFitnessTab, mFitnessTabDefPosition:", Integer.valueOf(this.f25973c), " tab size:", Integer.valueOf(this.t.size()));
        qpm qpmVarH = h(10001, sportSubTabConfigE);
        ArrayList<qpm> arrayList = new ArrayList<>(this.t);
        if (njy.e(arrayList, this.f25973c)) {
            arrayList.add(qpmVarH);
        } else {
            arrayList.add(this.f25973c, qpmVarH);
        }
        this.t = arrayList;
        this.f25971a.postValue(arrayList);
    }

    static class e extends BaseHandler<SportViewModel> {
        e(SportViewModel sportViewModel) {
            super(sportViewModel);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SportViewModel sportViewModel, Message message) {
            if (message.what == 100) {
                sportViewModel.f = true;
                sportViewModel.g();
            } else if (message.what == 101) {
                Object obj = message.obj;
                if (njy.b(obj, pjd.class)) {
                    sportViewModel.g((List) obj);
                }
            }
        }
    }

    public ArrayList<qpm> e() {
        return this.t;
    }

    public void a() {
        ArrayList<qpm> arrayList = this.t;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    static class c implements Observer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<SportViewModel> f25978b;

        c(SportViewModel sportViewModel) {
            this.f25978b = new WeakReference<>(sportViewModel);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            SportViewModel sportViewModel = this.f25978b.get();
            if (sportViewModel == null) {
                ReleaseLogUtil.e("Track_SportViewModel", "InnerObserver notify viewModel is null");
                return;
            }
            LogUtil.a("Track_SportViewModel", "InnerObserver notify label ", str, " objects ", objArr);
            if (TextUtils.isEmpty(str) || !str.equals("OPERATION_FUNCTION_ENTRANCE") || njy.e(objArr, 1)) {
                return;
            }
            Message messageObtainMessage = sportViewModel.q.obtainMessage();
            messageObtainMessage.what = 101;
            messageObtainMessage.obj = objArr[1];
            sportViewModel.q.sendMessage(messageObtainMessage);
        }
    }
}
