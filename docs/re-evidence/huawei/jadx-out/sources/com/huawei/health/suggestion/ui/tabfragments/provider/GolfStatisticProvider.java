package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSessionManager;
import com.huawei.health.suggestion.ui.tabfragments.provider.GolfStatisticProvider;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.dex;
import defpackage.fst;
import defpackage.gzx;
import defpackage.ibp;
import defpackage.ibq;
import defpackage.ibt;
import defpackage.lls;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqt;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class GolfStatisticProvider extends FitnessAchieveProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f10069a;
    private Context d;
    private SectionBean g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f10070b = new a(this);
    private e j = new e(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseKnitDataProvider.c f10071c = null;
    private final Observer e = new Observer() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.GolfStatisticProvider.2
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            ReleaseLogUtil.d("Track_Provider_Track_GolfStatisticProvider", "login status changed label = ", str, ", args = ", objArr);
            if (str != null && "com.huawei.plugin.account.login".equals(str)) {
                GolfStatisticProvider.this.f10069a = true;
            }
        }
    };

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 263;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (ibp) obj);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Track_GolfStatisticProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return "";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider
    public String getEntranceTitle() {
        return BaseApplication.getContext().getString(R.string.sug_my_yoga_class);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        getBeans(sectionBean);
        this.g = sectionBean;
        LogUtil.a("Track_Provider_Track_GolfStatisticProvider", "requestTrackStatData");
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(0L);
        hiSportStatDataAggregateOption.setEndTime(System.currentTimeMillis());
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setGroupUnitType(7);
        hiSportStatDataAggregateOption.setReadType(0);
        int[] iArr = {42405, 5, DicDataTypeUtil.DataType.SUM_GOLF_SWING_COUNT.value()};
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"Track_2205", "Track_2865", "Track_286_swing_count"});
        hiSportStatDataAggregateOption.setType(iArr);
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{286, 30001});
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateSportStatData(hiSportStatDataAggregateOption, this.f10070b);
        ObserverManagerUtil.d(this.e, "com.huawei.plugin.account.login");
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider
    public void parseParams(Context context, HashMap<String, Object> map, ibp ibpVar) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        this.d = context;
        LogUtil.a("Track_Provider_Track_GolfStatisticProvider", "parseParams");
        a(this.d, map, ibpVar);
    }

    private void a(Context context, HashMap<String, Object> map, ibp ibpVar) {
        if (map == null || ibpVar == null) {
            LogUtil.j("Track_Provider_Track_GolfStatisticProvider", "setData viewMap or data is null");
            return;
        }
        map.put("SECTION_STYLE", BaseSection.GOLF_STYLE);
        map.put("RIGHT_TOP_BUTTON", context.getResources().getString(R.string.IDS_golf_course_map));
        map.put("BACKGROUNDCOLOR", Integer.valueOf(context.getColor(R.color.colorCardPanelBg)));
        map.put("RIGHT_TOP_BUTTON_ICON", Integer.valueOf(R.drawable.ic_mapinformation));
        map.put("LEFT_TOP_VALUE", Long.valueOf(ibpVar.c().a()));
        map.put("LEFT_BOTTOM_TEXT", context.getResources().getString(R.string.IDS_golf_total_times));
        String quantityString = context.getResources().getQuantityString(R.plurals.IDS_golf_total_swing, ibpVar.c().c(), Integer.valueOf(ibpVar.c().c()));
        if (LanguageUtil.f(this.d)) {
            map.put("RIGHT_COMBINE_TEXT", gzx.c(context, String.valueOf(ibpVar.c().c()), quantityString, R.style.sug_card_bg, R.style.sug_card_normal));
        } else {
            map.put("RIGHT_COMBINE_TEXT", quantityString);
        }
        if (this.g != null) {
            for (ibq ibqVar : ibpVar.b()) {
                ibqVar.d(this.g.o());
                ibqVar.b(context, getEntranceTitle());
            }
        }
        map.put("SECTION16_9CARD_01_BANNER_DATA", c(ibpVar));
        a(context, map);
    }

    private List<fst> c(ibp ibpVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<ibq> arrayListB = ibpVar.b();
        if (njy.e(arrayListB)) {
            LogUtil.e("Track_Provider_Track_GolfStatisticProvider", "createBannerItems failed cause bannerBeanList is empty");
            return arrayList;
        }
        for (ibq ibqVar : arrayListB) {
            arrayList.add(new fst(ibqVar.f(), ibqVar.c(), ibqVar.b(), ibqVar.i(), ibqVar.j(), ibqVar.h()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.tabfragments.provider.GolfStatisticProvider$4, reason: invalid class name */
    public class AnonymousClass4 extends BaseKnitDataProvider.c {
        final /* synthetic */ Context e;

        public static /* synthetic */ void d(int i, Object obj) {
        }

        AnonymousClass4(Context context) {
            this.e = context;
        }

        @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
            super.onClick(str);
            if (qrs.c(500)) {
                LogUtil.a("Track_Provider_Track_GolfStatisticProvider", "onClick isFastClick");
                return;
            }
            if (LoginInit.getInstance(this.e).isBrowseMode()) {
                LoginInit.getInstance(this.e).browsingToLogin(new IBaseResponseCallback() { // from class: iby
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        GolfStatisticProvider.AnonymousClass4.d(i, obj);
                    }
                }, "");
                return;
            }
            if ("ACCUMULATED_DURATION_CLICK_VIEW".equals(str)) {
                LogUtil.a("Track_Provider_Track_GolfStatisticProvider", "jump to SportHistoryActivity");
                FitnessSessionManager.SessionActivityAction sessionActivityActionD = FitnessSessionManager.b().d();
                if (sessionActivityActionD == null) {
                    LogUtil.j("Track_Provider_Track_GolfStatisticProvider", "FitnessSessionManager getSessionForActivityAction null");
                    return;
                }
                sessionActivityActionD.startSportHistoryActivity(this.e, 286, 286);
                HashMap map = new HashMap();
                map.put("click", 1);
                map.put(BleConstants.SPORT_TYPE, 286);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.GOLF_COURSE_MAP_CLICK_EVENT.value(), map, 0);
                return;
            }
            if ("ITEM_BUTTON_TEXT".equals(str)) {
                LogUtil.a("Track_Provider_Track_GolfStatisticProvider", "jump to H5 course map");
                GolfStatisticProvider.this.d(this.e);
            }
        }
    }

    private void a(Context context, HashMap<String, Object> map) {
        if (this.f10071c == null) {
            this.f10071c = new AnonymousClass4(context);
        }
        map.put("CLICK_EVENT_LISTENER", this.f10071c);
    }

    private void a(Context context) {
        if (context == null) {
            LogUtil.j("Track_Provider_Track_GolfStatisticProvider", "jumpToGolfCourseMap(): context is null");
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule(RemoteMessageConst.NOTIFICATION, ddv.b().getCommonJsModule(RemoteMessageConst.NOTIFICATION));
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement"));
        builder.setImmerse();
        builder.showStatusBar();
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.golf", builder);
    }

    private void b(ibp ibpVar) {
        BigDecimal bigDecimal = new BigDecimal(0);
        BigDecimal bigDecimal2 = new BigDecimal(0);
        for (HiHealthData hiHealthData : ibpVar.a()) {
            if (hiHealthData != null) {
                int i = hiHealthData.getInt("hihealth_type");
                if (i == 286) {
                    Object obj = hiHealthData.get("Track_2865");
                    if (obj instanceof Double) {
                        bigDecimal = bigDecimal.add(BigDecimal.valueOf(((Double) obj).doubleValue()));
                    }
                    Object obj2 = hiHealthData.get("Track_286_swing_count");
                    if (obj2 instanceof Double) {
                        bigDecimal2 = bigDecimal2.add(BigDecimal.valueOf(((Double) obj2).doubleValue()));
                    }
                } else if (i == 30001) {
                    Object obj3 = hiHealthData.get("Track_2205");
                    if (obj3 instanceof Double) {
                        bigDecimal = bigDecimal.add(BigDecimal.valueOf(((Double) obj3).doubleValue()));
                    }
                }
            }
        }
        ibt ibtVar = new ibt();
        ibtVar.e(bigDecimal2.intValue());
        ibtVar.e(bigDecimal.longValue());
        ibpVar.b(ibtVar);
    }

    static class e implements IBaseResponseCallback {
        WeakReference<GolfStatisticProvider> d;

        e(GolfStatisticProvider golfStatisticProvider) {
            this.d = new WeakReference<>(golfStatisticProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            List list;
            GolfStatisticProvider golfStatisticProvider = this.d.get();
            if (golfStatisticProvider == null) {
                return;
            }
            LogUtil.a("Track_Provider_Track_GolfStatisticProvider", "onResponse ", obj);
            if (njy.b(obj, HiHealthData.class)) {
                list = (List) obj;
                LogUtil.a("Track_Provider_Track_GolfStatisticProvider", list);
            } else {
                LogUtil.j("Track_Provider_Track_GolfStatisticProvider", "class type is wrong");
                list = null;
            }
            golfStatisticProvider.a((List<HiHealthData>) list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list) {
        if (this.mAchieveBean == null) {
            LogUtil.e("Track_Provider_Track_GolfStatisticProvider", "updateGolfNumber failed, cause no mAchieveBean");
            return;
        }
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() && list != null) {
            this.mAchieveBean.a(list);
        } else {
            this.mAchieveBean.a(Collections.singletonList(new HiHealthData()));
        }
        b(this.mAchieveBean);
        if (this.g != null) {
            if (b() || this.f10069a) {
                LogUtil.e("Track_Provider_Track_GolfStatisticProvider", "GolfStatisticProvider mNeedRefresh = ", Boolean.valueOf(this.f10069a));
                this.g.c(this.mAchieveBean);
                this.f10069a = false;
            }
        }
    }

    private boolean b() {
        ibp ibpVar = (ibp) lls.b(dex.b(String.valueOf(getType())), new TypeToken<ibp>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.GolfStatisticProvider.3
        });
        if (this.mAchieveBean != null && this.mAchieveBean.equals(ibpVar)) {
            LogUtil.j("Track_Provider_Track_GolfStatisticProvider", "same data");
            return false;
        }
        LogUtil.a("Track_Provider_Track_GolfStatisticProvider", "refresh cache is ", qqt.e(this.mAchieveBean));
        dex.a(String.valueOf(getType()), qqt.e(this.mAchieveBean));
        return true;
    }

    static class a implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<GolfStatisticProvider> f10074b;

        a(GolfStatisticProvider golfStatisticProvider) {
            this.f10074b = new WeakReference<>(golfStatisticProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            GolfStatisticProvider golfStatisticProvider = this.f10074b.get();
            if (golfStatisticProvider == null) {
                LogUtil.j("Track_Provider_Track_GolfStatisticProvider", "onResult: GolfStatisticProvider is null");
                return;
            }
            LogUtil.a("Track_Provider_Track_GolfStatisticProvider", "onResult: errorCode " + i + " data: " + list);
            e eVar = golfStatisticProvider.j;
            if (eVar == null) {
                LogUtil.j("Track_Provider_Track_GolfStatisticProvider", "requestTrackStatData callback is null");
            } else if (list == null || list.size() == 0) {
                LogUtil.j("Track_Provider_Track_GolfStatisticProvider", "datas is null");
                eVar.a(0, null);
            } else {
                eVar.a(i, list);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("Track_Provider_Track_GolfStatisticProvider", "onResultIntent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        a(context);
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.GOLF_COURSE_MAP_CLICK_EVENT.value(), map, 0);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        ObserverManagerUtil.a(this.e, "com.huawei.plugin.account.login");
    }
}
