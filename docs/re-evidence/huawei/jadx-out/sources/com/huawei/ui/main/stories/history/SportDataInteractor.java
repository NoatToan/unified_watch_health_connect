package com.huawei.ui.main.stories.history;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.basefitnessadvice.model.FitnessTrackRecord;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportDataStaticsInfo;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.healthcloud.plugintrack.ui.view.DetailItemContainer;
import com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.AllSportRankListAdapter;
import com.huawei.ui.main.stories.history.adapter.AllSportStatSumAdapter;
import com.huawei.ui.main.stories.history.adapter.DivingDataAdapter;
import com.huawei.ui.main.stories.history.model.SportRecordDataAdapter;
import com.huawei.ui.main.stories.history.model.SportRecordStatData;
import defpackage.iwn;
import defpackage.jqq;
import defpackage.jry;
import defpackage.lmf;
import defpackage.njy;
import defpackage.nkb;
import defpackage.nlw;
import defpackage.ntx;
import defpackage.nub;
import defpackage.qqn;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.vpq;
import defpackage.vrf;
import defpackage.vrg;
import defpackage.vro;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SportDataInteractor implements SportRecordDataAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AllSportRankListAdapter f28247a;
    private HealthTextView ac;
    private HealthTextView ad;
    private Resources ag;
    private DetailItemContainer ai;
    private jry aj;
    private int ak;
    private List<HwSportDataStaticsInfo> am;
    private e an;
    private HealthRecycleView ao;
    private int aq;
    private LinearLayout ar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f28248b;
    private AllSportStatSumAdapter d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private View h;
    private HealthTextView i;
    private View j;
    private DetailItemContainer k;
    private HealthTextView n;
    private WeakReference<Context> o;
    private DivingDataAdapter p;
    private int r;
    private HealthRecycleView z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28249c = 3;
    private int as = qqn.d(R.color.textColorPrimary);
    private boolean w = true;
    private List<HiHealthData> q = new ArrayList();
    private List<HiHealthData> s = new ArrayList();
    private List<HiHealthData> af = new ArrayList();
    private List<SportDetailItem> y = new ArrayList(10);
    private List<SportDetailItem> ah = new ArrayList(10);
    private Handler ab = new c();
    private int ae = 0;
    private int x = 0;
    private final Object t = new Object();
    private List<vrf> ap = new ArrayList(this.f28249c);
    private List<vpq> aa = new ArrayList();
    private int l = 0;
    private int m = 0;
    private double u = -1.0d;
    private double v = -1.0d;
    private SportRecordStatData al = new SportRecordStatData(BaseApplication.b());

    public SportDataInteractor(Context context) {
        this.o = new WeakReference<>(context);
    }

    public void b(int i) {
        this.ak = i;
        jry jryVarA = jry.a(a());
        this.aj = jryVarA;
        if (jryVarA.b(this.ak) == null || this.aj.b(this.ak).getSportDataStatics() == null) {
            LogUtil.e("Track_SportDataInteractor", "can not find sport type in json");
        } else {
            LogUtil.a("Track_SportDataInteractor", "mSportType:", Integer.valueOf(i));
            this.am = this.aj.b(this.ak).getSportDataStatics();
        }
    }

    public void c(Activity activity) {
        if (activity == null) {
            return;
        }
        int i = this.ak;
        if (i == 0) {
            this.an = new e(this, 2);
            LogUtil.a("Track_SportDataInteractor", "all sport type, query two times");
        } else if (i == 287) {
            this.an = new e(this, 2);
            LogUtil.a("Track_SportDataInteractor", "diving type");
        } else {
            this.an = new e(this, 1);
            LogUtil.a("Track_SportDataInteractor", "single sport type, query one time");
        }
        e(activity);
        this.l = 0;
        this.m = 0;
        if (this.ak == 0) {
            b(activity);
            e(AnalyticsValue.SPORT_RECORD_CHANGE_ALL_SPORT_CARD_2040190.value());
        }
    }

    private void b(final Activity activity) {
        this.d = new AllSportStatSumAdapter(a(), this.ap);
        this.f28247a = new AllSportRankListAdapter(a(), this.aa);
        LinearLayout linearLayout = (LinearLayout) qsp.a(activity, R.id.all_sport_data);
        this.ar = linearLayout;
        this.ao = (HealthRecycleView) linearLayout.findViewById(R.id.all_sport_sum);
        this.z = (HealthRecycleView) this.ar.findViewById(R.id.all_sport_rank_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(a());
        linearLayoutManager.setOrientation(0);
        this.ao.setHasFixedSize(true);
        this.ao.setNestedScrollingEnabled(false);
        this.ao.setAdapter(this.d);
        this.ao.setLayoutManager(linearLayoutManager);
        this.ac = (HealthTextView) this.ar.findViewById(R.id.all_sport_data_subheader);
        this.ad = (HealthTextView) this.ar.findViewById(R.id.all_sport_time_period);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(a());
        linearLayoutManager2.setOrientation(1);
        this.z.setHasFixedSize(true);
        this.z.setNestedScrollingEnabled(false);
        this.z.setAdapter(this.f28247a);
        this.z.setLayoutManager(linearLayoutManager2);
        this.d.c(new AllSportStatSumAdapter.OnItemClickListener() { // from class: com.huawei.ui.main.stories.history.SportDataInteractor.5
            @Override // com.huawei.ui.main.stories.history.adapter.AllSportStatSumAdapter.OnItemClickListener
            public void onItemClick(String str, int i) {
                Activity activity2 = activity;
                if (activity2 instanceof SportDataActivity) {
                    ((SportDataActivity) activity2).a(i);
                }
                SportDataInteractor.this.l = i;
                SportDataInteractor.this.e(AnalyticsValue.SPORT_RECORD_CHANGE_ALL_SPORT_CARD_2040190.value());
                SportDataInteractor.this.a(str);
                SportDataInteractor.this.g();
                SportDataInteractor.this.d.e(SportDataInteractor.this.l);
                SportDataInteractor.this.f28247a.d(SportDataInteractor.this.l);
            }
        });
    }

    public int e() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (str.equals("Track_Duration_Sum")) {
            this.ac.setText(this.ag.getString(R.string.IDS_hwh_sport_duration_percentage));
            return;
        }
        if (str.equals("Track_Count_Sum")) {
            this.ac.setText(this.ag.getString(R.string.IDS_hwh_sport_exercise_times_percentage));
        } else if (str.equals("Track_Calorie_Sum")) {
            this.ac.setText(this.ag.getString(R.string.IDS_hwh_sport_calories_percentage));
        } else {
            LogUtil.a("Track_SportDataInteractor", "invalid type");
        }
    }

    public void b(String str) {
        HealthTextView healthTextView = this.ad;
        if (healthTextView == null) {
            LogUtil.j("Track_SportDataInteractor", "mRankPeriod is null, sportType:", Integer.valueOf(this.ak));
        } else {
            healthTextView.setText(str);
        }
    }

    private void d() {
        LogUtil.a("Track_SportDataInteractor", "clear all sport data");
        this.ap.clear();
        this.aa.clear();
        this.ah.clear();
        this.ai.removeAllViews();
    }

    private void e(Activity activity) {
        Resources resources = a().getResources();
        this.ag = resources;
        this.r = resources.getDimensionPixelSize(R.dimen.hw_show_public_margin_76dp);
        Object systemService = a().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (systemService instanceof WindowManager) {
            this.aq = ((WindowManager) systemService).getDefaultDisplay().getWidth() - (qrs.d(a(), 16.0f) * 2);
        }
        this.h = qsp.a(activity, R.id.sport_data_data);
        this.j = qsp.a(activity, R.id.share_track_detail_show_distance);
        this.e = (HealthTextView) qsp.a(activity, R.id.sport_data_distance);
        this.f28248b = (HealthTextView) qsp.a(activity, R.id.sport_data_total);
        this.f = (HealthTextView) qsp.a(activity, R.id.sport_data_distance_unit);
        this.g = (HealthTextView) qsp.a(activity, R.id.share_sport_data_distance);
        this.i = (HealthTextView) qsp.a(activity, R.id.tv_sport_title);
        this.n = (HealthTextView) qsp.a(activity, R.id.share_sport_data_distance_unit);
        this.ai = (DetailItemContainer) qsp.a(activity, R.id.share_sport_data_container);
        if (this.ak != 0) {
            a(activity);
            f();
            LinearLayout linearLayout = (LinearLayout) qsp.a(activity, R.id.track_data_diving_card);
            linearLayout.setVisibility(8);
            HealthCardView healthCardView = (HealthCardView) qsp.a(activity, R.id.track_data_card);
            if (this.ak == 287) {
                e(linearLayout);
                healthCardView.setCardBackgroundColor(a().getColor(R.color.colorCardPanelBg));
            } else {
                healthCardView.setCardBackgroundColor(a().getColor(R.color.common_transparent));
            }
        }
    }

    private void e(LinearLayout linearLayout) {
        linearLayout.setVisibility(0);
        HealthRecycleView healthRecycleView = (HealthRecycleView) linearLayout.findViewById(R.id.diving_data_card);
        this.p = new DivingDataAdapter(a(), this.m);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(a());
        linearLayoutManager.setOrientation(0);
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.setAdapter(this.p);
        healthRecycleView.setLayoutManager(linearLayoutManager);
        this.p.c(new DivingDataAdapter.OnItemClickListener() { // from class: com.huawei.ui.main.stories.history.SportDataInteractor.2
            @Override // com.huawei.ui.main.stories.history.adapter.DivingDataAdapter.OnItemClickListener
            public void onItemClick(int i) {
                SportDataInteractor.this.m = i;
                SportDataInteractor.this.p.e(SportDataInteractor.this.m, SportDataInteractor.this.s, SportDataInteractor.this.af);
                SportDataInteractor.this.f();
            }
        });
    }

    private void a(Activity activity) {
        this.k = (DetailItemContainer) qsp.a(activity, R.id.sport_data_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.y.clear();
        this.ah.clear();
        l();
        this.k.removeAllViews();
        this.ai.removeAllViews();
        this.k.b(2);
        for (int i = 0; i < this.y.size(); i++) {
            SportDetailItem sportDetailItem = this.y.get(i);
            if (sportDetailItem == null) {
                LogUtil.j("Track_SportDataInteractor", "child is null");
                return;
            }
            ViewParent parent = sportDetailItem.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.k.addView(sportDetailItem);
            if ((i & 1) == 0 && i != this.y.size() - 1) {
                this.k.addView(j());
            }
        }
        i();
        this.k.requestLayout();
    }

    private void i() {
        this.ai.b(2);
        for (int i = 0; i < this.ah.size(); i++) {
            SportDetailItem sportDetailItem = this.ah.get(i);
            ViewParent parent = sportDetailItem.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.ai.addView(sportDetailItem);
            if ((i & 1) == 0 && i != this.y.size() - 1) {
                this.ai.addView(j());
            }
        }
    }

    private SportDetailItem d(SportDetailItem.a aVar) {
        if (aVar == null) {
            LogUtil.j("Track_SportDataInteractor", "setItemView data is null");
            return null;
        }
        SportDetailItem sportDetailItem = new SportDetailItem(a());
        sportDetailItem.a(a());
        sportDetailItem.setGroupSize(this.aq / 2, this.r);
        sportDetailItem.setItemView(aVar);
        sportDetailItem.setTextColor(this.as);
        sportDetailItem.e();
        sportDetailItem.setGravity(17);
        return sportDetailItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        int i = this.ak;
        if (i == 0) {
            this.j.setVisibility(0);
            this.ai.setVisibility(0);
            i();
            this.ao.setVisibility(0);
            this.d.e(this.l);
            this.f28247a.d(this.l);
            if (this.ap.isEmpty() || this.ap.get(0).a() == 0.0d) {
                this.ac.setVisibility(8);
                this.ad.setVisibility(8);
                this.z.setVisibility(8);
                return;
            } else {
                a(this.d.d(this.l));
                this.ac.setVisibility(0);
                this.ad.setVisibility(0);
                this.z.setVisibility(0);
                return;
            }
        }
        if (i == 287) {
            this.p.e(this.m, this.s, this.af);
        }
        f();
    }

    private void l() {
        if (njy.e(this.q) || c() == null || "--".equals(c().j())) {
            this.w = true;
        } else {
            this.w = false;
            n();
            o();
        }
        LogUtil.a("Track_SportDataInteractor", "mIsHideData ", Boolean.valueOf(this.w));
        if (this.w) {
            this.h.setVisibility(8);
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            this.ai.setVisibility(8);
            return;
        }
        this.h.setVisibility(0);
        this.j.setVisibility(0);
        this.k.setVisibility(0);
        this.ai.setVisibility(0);
    }

    private SportDetailItem.a c() {
        HwSportDataStaticsInfo hwSportDataStaticsInfo;
        if (njy.e(this.am)) {
            LogUtil.e("Track_SportDataInteractor", "mSportDataStatics is null");
            return null;
        }
        if (this.ak == 287 && this.am.size() > 1) {
            hwSportDataStaticsInfo = this.am.get(1);
        } else {
            hwSportDataStaticsInfo = this.am.get(0);
        }
        if (hwSportDataStaticsInfo == null) {
            return null;
        }
        Map<String, Double> mapE = e(hwSportDataStaticsInfo.getItemDataTypeStringMap());
        for (Map.Entry<String, Double> entry : mapE.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null || entry.getValue().doubleValue() < 0.0d) {
                return null;
            }
        }
        int iE = nlw.e(this.ak);
        if (iE == 286) {
            c(mapE, HeartRateThresholdConfig.HEART_RATE_LIMIT, 0);
        } else if (iE == 217) {
            for (int i : nub.f43727a) {
                c(mapE, i, 0);
            }
        }
        return vro.e(mapE, hwSportDataStaticsInfo.getStaticsType(), this.ak);
    }

    private void c(Map<String, Double> map, int i, int i2) {
        HwSportTypeInfo hwSportTypeInfoB = this.aj.b(i);
        if (hwSportTypeInfoB == null) {
            LogUtil.j("Track_SportDataInteractor", "addExtraStat sportTypeInfoById is null.");
            return;
        }
        List<HwSportDataStaticsInfo> sportDataStatics = hwSportTypeInfoB.getSportDataStatics();
        if (njy.e(sportDataStatics, i2)) {
            LogUtil.j("Track_SportDataInteractor", "addExtraStat extraSportDataStatic is out of bounds.");
            return;
        }
        HwSportDataStaticsInfo hwSportDataStaticsInfo = sportDataStatics.get(i2);
        if (hwSportDataStaticsInfo == null) {
            return;
        }
        if (i == 220) {
            i = 30001;
        }
        for (Map.Entry<String, Double> entry : c(i, hwSportDataStaticsInfo.getItemDataTypeStringMap()).entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                String key = entry.getKey();
                if (map.containsKey(key)) {
                    map.put(key, Double.valueOf(map.get(key).doubleValue() + entry.getValue().doubleValue()));
                }
            }
        }
    }

    private SportDetailItem.a e(HwSportDataStaticsInfo hwSportDataStaticsInfo, int i) {
        Map<String, Double> mapE = e(hwSportDataStaticsInfo.getItemDataTypeStringMap());
        int iE = nlw.e(this.ak);
        if (iE == 286) {
            c(mapE, HeartRateThresholdConfig.HEART_RATE_LIMIT, i);
        } else if (iE == 217) {
            boolean zEquals = "AVERAGE_SPEED".equals(hwSportDataStaticsInfo.getStaticsType());
            for (int i2 : nub.f43727a) {
                if (!zEquals || i2 != 233) {
                    c(mapE, i2, i);
                }
            }
        }
        return vro.e(mapE, hwSportDataStaticsInfo.getStaticsType(), this.ak);
    }

    private void o() {
        if (njy.e(this.am)) {
            LogUtil.e("Track_SportDataInteractor", "mSportDataStatics is wrong");
            return;
        }
        for (int i = this.ak == 287 ? 2 : 1; i < this.am.size(); i++) {
            HwSportDataStaticsInfo hwSportDataStaticsInfo = this.am.get(i);
            if (hwSportDataStaticsInfo != null) {
                SportDetailItem.a aVarE = e(hwSportDataStaticsInfo, i);
                SportDetailItem sportDetailItemD = d(aVarE);
                SportDetailItem sportDetailItemD2 = d(aVarE);
                if (sportDetailItemD != null || sportDetailItemD2 != null) {
                    this.y.add(sportDetailItemD);
                    this.ah.add(sportDetailItemD2);
                }
            }
        }
    }

    private Map<String, Double> e(Map<String, String> map) {
        double dA;
        HashMap map2 = new HashMap();
        if (map == null) {
            LogUtil.e("Track_SportDataInteractor", "itemDataTypeStringMap is null");
            return map2;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                if (this.ak == 287) {
                    dA = b(entry);
                } else {
                    dA = a(entry);
                }
                if ("TOTAL_MAX_DISTANCE".equals(entry.getKey())) {
                    map2.put(entry.getKey(), Double.valueOf(this.m == 0 ? this.u : this.v));
                } else {
                    map2.put(entry.getKey(), Double.valueOf(dA));
                }
            }
        }
        return map2;
    }

    private double a(Map.Entry<String, String> entry) {
        double d = 0.0d;
        for (HiHealthData hiHealthData : this.q) {
            if (hiHealthData != null && hiHealthData.getInt("hihealth_type") != 289 && hiHealthData.getInt("hihealth_type") != 288) {
                d += hiHealthData.getDouble(entry.getValue());
                if (nlw.e(this.ak) != 286 && nlw.e(this.ak) != 217) {
                    break;
                }
            }
        }
        return d;
    }

    private double b(Map.Entry<String, String> entry) {
        List<HiHealthData> list;
        if (this.m == 0) {
            list = this.s;
        } else {
            list = this.af;
        }
        double d = 0.0d;
        if (njy.e(list)) {
            LogUtil.j("Track_SportDataInteractor", "divingDataList is empty in collectDivingData");
            return 0.0d;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                d += hiHealthData.getDouble(entry.getValue());
            }
        }
        return d;
    }

    private Map<String, Double> c(int i, Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            LogUtil.e("Track_SportDataInteractor", "getItemDataMapByType itemDataTypeStringMap is null");
            return map2;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                map2.put(entry.getKey(), Double.valueOf(b(i, entry)));
            }
        }
        return map2;
    }

    private double b(int i, Map.Entry<String, String> entry) {
        double d = 0.0d;
        for (HiHealthData hiHealthData : this.q) {
            if (hiHealthData != null && hiHealthData.getInt("hihealth_type") == i) {
                d += hiHealthData.getDouble(entry.getValue());
            }
        }
        return d;
    }

    private void n() {
        SportDetailItem.a aVarC = c();
        if (aVarC == null) {
            LogUtil.e("Track_SportDataInteractor", "itemData is null");
            return;
        }
        this.e.setText(aVarC.j());
        this.g.setText(aVarC.j());
        this.f28248b.setText(aVarC.c());
        this.i.setText(aVarC.c());
        this.f.setText(aVarC.h());
        this.n.setText(aVarC.h());
    }

    private View j() {
        View view = new View(a());
        view.setBackgroundColor(this.as);
        view.setAlpha(0.3f);
        view.setLayoutParams(new ViewGroup.LayoutParams(this.ag.getDimensionPixelSize(R.dimen.sport_data_cut_line_height), this.ag.getDimensionPixelSize(R.dimen.hw_show_public_size_32)));
        int dimensionPixelSize = this.ag.getDimensionPixelSize(R.dimen.hw_map_target_type_text_top);
        LinearLayout linearLayout = new LinearLayout(a());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.ag.getDimensionPixelSize(R.dimen.hw_show_public_margin_70dp));
        linearLayout.setGravity(17);
        layoutParams.setMargins(0, dimensionPixelSize, 0, dimensionPixelSize);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("dataType", Integer.valueOf(this.l));
        lmf.d().c(BaseApplication.b(), str, map, 0);
    }

    @Override // com.huawei.ui.main.stories.history.model.SportRecordDataAdapter
    public void updateUi(List<HiHealthData> list) {
        this.q = list;
        m();
    }

    static class c extends Handler {
        WeakReference<SportDataInteractor> d;

        private c(SportDataInteractor sportDataInteractor) {
            this.d = new WeakReference<>(sportDataInteractor);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            SportDataInteractor sportDataInteractor = this.d.get();
            if (sportDataInteractor == null) {
                return;
            }
            int i = message.what;
            if (i == 101) {
                sportDataInteractor.m();
            } else {
                if (i != 102) {
                    return;
                }
                sportDataInteractor.i(message.obj);
            }
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f28251a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<Object> f28252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f28253c;
        WeakReference<SportDataInteractor> d;
        int e;
        private int f;

        e(SportDataInteractor sportDataInteractor, int i) {
            synchronized (f28251a) {
                this.f = i;
            }
            this.f28253c = new int[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                this.f28253c[i2] = -1;
            }
            this.f28252b = new ArrayList(this.f);
            WeakReference<SportDataInteractor> weakReference = new WeakReference<>(sportDataInteractor);
            this.d = weakReference;
            SportDataInteractor sportDataInteractor2 = weakReference.get();
            if (sportDataInteractor2 != null) {
                synchronized (sportDataInteractor2.t) {
                    this.e = sportDataInteractor2.ae;
                }
            }
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            SportDataInteractor sportDataInteractor = this.d.get();
            if (sportDataInteractor == null) {
                return;
            }
            synchronized (f28251a) {
                this.f--;
                this.f28252b.add(obj);
                if (this.f == 0) {
                    Message messageObtainMessage = sportDataInteractor.ab.obtainMessage();
                    messageObtainMessage.what = 102;
                    messageObtainMessage.obj = this.f28252b;
                    synchronized (sportDataInteractor.t) {
                        if (c(sportDataInteractor.x)) {
                            sportDataInteractor.x = this.e;
                            sportDataInteractor.ab.sendMessage(messageObtainMessage);
                        }
                    }
                }
            }
        }

        private boolean c(int i) {
            if (Math.abs(this.e - i) > 100000 || this.e <= i) {
                return Math.abs(this.e - i) > 100000 && this.e < i;
            }
            return true;
        }
    }

    public void a(long j, long j2, int i) {
        LogUtil.a("Track_SportDataInteractor", "mRequestDataList , startTime is ", Long.valueOf(j), " ,endTime is ", Long.valueOf(j2), " ,timeUnit is ", Integer.valueOf(i));
        synchronized (this.t) {
            int i2 = this.ae + 1;
            this.ae = i2;
            if (i2 > 1000000) {
                this.ae = 0;
            }
            int i3 = this.ak;
            if (i3 == 0 || i3 == 287) {
                this.an = new e(this, 2);
            } else {
                this.an = new e(this, 1);
            }
        }
        b(j, j2, i);
    }

    private void b(long j, long j2, int i) {
        LogUtil.a("Track_SportDataInteractor", "getData mSportType:", Integer.valueOf(this.ak));
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("Track_SportDataInteractor", "getData recordApi is null.");
            return;
        }
        ntx ntxVarA = new ntx.d().b(j).d(j2).d(i).a();
        int i2 = this.ak;
        if (i2 == 10001) {
            recordApi.acquireSummaryFitnessRecord(ntxVarA, this.an);
            LogUtil.d("Track_SportDataInteractor", "acquire data form fitness ");
            return;
        }
        if (i2 == 0) {
            recordApi.acquireSummaryFitnessRecord(ntxVarA, this.an);
            iwn.a(a()).e(j, j2 - 1000, i, 0, this.an);
        } else {
            if (i2 == 287) {
                long j3 = j2 - 1000;
                nkb.d().b(j, j3, i, (IBaseResponseCallback) this.an, true);
                nkb.d().a(j, j3, i, this.ak, this.an);
                return;
            }
            this.al.d(j, j2 - 1000, i2, i, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Object obj) {
        LogUtil.a("Track_SportDataInteractor", "refresh data");
        this.q = null;
        if (this.ak == 287) {
            h();
            try {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
            } catch (ClassCastException unused) {
                LogUtil.e("Track_SportDataInteractor", "refreshData diving");
            }
        }
        int i = this.ak;
        if (i == 10001) {
            c(obj);
        } else if (i == 0) {
            b(obj);
        } else {
            g(obj);
        }
        LogUtil.a("Track_SportDataInteractor", "update ui");
        this.ab.sendEmptyMessage(101);
    }

    private void h() {
        this.s = null;
        this.af = null;
        this.u = -1.0d;
        this.v = -1.0d;
    }

    private void e(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = str.split("#")[0];
                        if (!TextUtils.isEmpty(str2)) {
                            if (str2.equals(String.valueOf(ComponentInfo.PluginPay_A_N))) {
                                this.v = Math.max(this.v, ((Double) entry.getValue()).doubleValue());
                            } else {
                                this.u = Math.max(this.u, ((Double) entry.getValue()).doubleValue());
                            }
                        }
                    }
                }
                return;
            }
        }
        LogUtil.j("Track_SportDataInteractor", "object is not map or is empty in handleDivingDepthData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        final String strD = this.d.d(this.l);
        for (vpq vpqVar : this.aa) {
            double dC = 100.0d;
            if (Math.abs(this.ap.get(this.l).a()) >= 1.0E-10d) {
                dC = 100.0d * (vpqVar.c(strD) / this.ap.get(this.l).a());
            }
            vpqVar.b(dC);
        }
        Collections.sort(this.aa, new Comparator<vpq>() { // from class: com.huawei.ui.main.stories.history.SportDataInteractor.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(vpq vpqVar2, vpq vpqVar3) {
                return (int) (vpqVar3.c(strD) - vpqVar2.c(strD));
            }
        });
    }

    private void b(int i, double d, double d2, double d3) {
        if (d2 == 0.0d) {
            LogUtil.a("Track_SportDataInteractor", "sportType = ", Integer.valueOf(i));
            return;
        }
        int iB = vrg.b(i);
        for (vpq vpqVar : this.aa) {
            if (vpqVar.b() == iB) {
                vpqVar.a(vpqVar.c() + d);
                vpqVar.e(vpqVar.e() + d2);
                vpqVar.c(vpqVar.d() + d3);
                return;
            }
        }
        this.aa.add(new vpq(iB, d, d2, d3));
    }

    private void f(Object obj) {
        LogUtil.a("Track_SportDataInteractor", "handleRankList");
        if (!(obj instanceof HiHealthData)) {
            this.ab.sendEmptyMessage(101);
            LogUtil.e("Track_SportDataInteractor", "handleRankList wrong data");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) obj;
        int i = hiHealthData.getInt("hihealth_type");
        if (i != 30001) {
            if (jqq.c(i)) {
                LogUtil.j("Track_SportDataInteractor", "Old Sport Type with invalid data");
                return;
            }
            b(i, hiHealthData.getDouble("stat4"), hiHealthData.getDouble("stat5") - hiHealthData.getDouble("stat6"), hiHealthData.getDouble("stat3"));
            return;
        }
        try {
            String[] strArrB = iwn.a(a()).b();
            char c2 = 0;
            int i2 = 0;
            while (i2 < 8) {
                int i3 = Integer.parseInt(strArrB[i2].substring(6, 9));
                Object[] objArr = new Object[2];
                objArr[c2] = "handleRankList sportType = ";
                objArr[1] = Integer.valueOf(i3);
                LogUtil.a("Track_SportDataInteractor", objArr);
                if (i3 != 287) {
                    b(i3, hiHealthData.getDouble("Track_" + strArrB[i2].substring(6, 9) + 4), hiHealthData.getDouble("Track_" + strArrB[i2].substring(6, 9) + 5) - hiHealthData.getDouble("Track_" + strArrB[i2].substring(6, 9) + 6), hiHealthData.getDouble("Track_" + strArrB[i2].substring(6, 9) + 3));
                }
                i2++;
                c2 = 0;
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("Track_SportDataInteractor", "handleTrackRankList NumberFormatException.");
        }
    }

    private List<Double> a(Object obj) {
        Iterator it = ((List) obj).iterator();
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (it.hasNext()) {
            Object next = it.next();
            if (njy.b(next, HiHealthData.class)) {
                List<HiHealthData> list = (List) next;
                LogUtil.a("Track_SportDataInteractor", "collectTrackSum dataList.size:", Integer.valueOf(list.size()));
                double d4 = 0.0d;
                double d5 = 0.0d;
                for (HiHealthData hiHealthData : list) {
                    Iterator it2 = it;
                    if (hiHealthData.getInt("hihealth_type") == 289 || hiHealthData.getInt("hihealth_type") == 288) {
                        d5 += hiHealthData.getDouble("stat5");
                        d4 += hiHealthData.getDouble("stat4");
                        LogUtil.a("Track_SportDataInteractor", "collectTrackSum divingDuration:", Double.valueOf(d4));
                    }
                    d += hiHealthData.getDouble("Track_Duration_Sum") + hiHealthData.getDouble("Track_5124");
                    d2 += (hiHealthData.getDouble("Track_Count_Sum") + hiHealthData.getDouble("Track_5125")) - hiHealthData.getDouble("Track_Abnormal_Count_Sum");
                    d3 += hiHealthData.getDouble("Track_Calorie_Sum") + hiHealthData.getDouble("Track_5123");
                    LogUtil.a("Track_SportDataInteractor", "collectTrackSum trackDuration:", Double.valueOf(d));
                    it = it2;
                }
                d -= d4;
                d2 -= d5;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Math.max(d, 0.0d)));
        arrayList.add(Double.valueOf(Math.max(d2, 0.0d)));
        arrayList.add(Double.valueOf(d3));
        return arrayList;
    }

    private List<Double> d(Object obj) {
        double dAcquireSumExerciseTime = 0.0d;
        double dAcquireSumExerciseTimes = 0.0d;
        double dAcquireSumCalorie = 0.0d;
        for (Object obj2 : (List) obj) {
            if (njy.b(obj2, FitnessTrackRecord.class)) {
                List<FitnessTrackRecord> list = (List) obj2;
                LogUtil.a("Track_SportDataInteractor", "fitnessTrackRecords size:", Integer.valueOf(list.size()));
                for (FitnessTrackRecord fitnessTrackRecord : list) {
                    dAcquireSumExerciseTime += fitnessTrackRecord.acquireSumExerciseTime();
                    dAcquireSumExerciseTimes += (double) fitnessTrackRecord.acquireSumExerciseTimes();
                    dAcquireSumCalorie += (double) fitnessTrackRecord.acquireSumCalorie();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(dAcquireSumExerciseTime));
        arrayList.add(Double.valueOf(dAcquireSumExerciseTimes));
        arrayList.add(Double.valueOf(dAcquireSumCalorie));
        return arrayList;
    }

    private void b(List<Double> list, List<Double> list2) {
        if (njy.e(list, 2) || njy.e(list2, 2)) {
            LogUtil.a("Track_SportDataInteractor", "trackSum or fitnessSum CALORIES_INDEX is out of bounds");
            return;
        }
        String string = this.ag.getString(R.string.IDS_hwh_input_history_data_duration);
        double dDoubleValue = list.get(0).doubleValue();
        vrf vrfVar = new vrf(string, list2.get(0).doubleValue() + dDoubleValue, this.l == 0, R.color.track_duration_color);
        vrf vrfVar2 = new vrf(this.ag.getString(R.string.IDS_hwh_motiontrack_sport_data_times), list.get(1).doubleValue() + list2.get(1).doubleValue(), this.l == 1, R.color.track_times_color);
        vrf vrfVar3 = new vrf(this.ag.getString(R.string.IDS_track_total_calories), list.get(2).doubleValue() + list2.get(2).doubleValue(), this.l == 2, R.color.track_calories_color);
        this.ap.add(vrfVar);
        this.ap.add(vrfVar2);
        this.ap.add(vrfVar3);
    }

    private void b(Object obj, List<Double> list) {
        for (Object obj2 : (List) obj) {
            if (obj2 != null) {
                if (njy.b(obj2, FitnessTrackRecord.class)) {
                    b(10001, list.get(0).doubleValue(), list.get(1).doubleValue(), list.get(2).doubleValue());
                } else if (njy.b(obj2, HiHealthData.class)) {
                    for (HiHealthData hiHealthData : (List) obj2) {
                        if (hiHealthData.getInt("hihealth_type") != 289 && hiHealthData.getInt("hihealth_type") != 288) {
                            f(hiHealthData);
                        }
                    }
                }
            }
        }
    }

    private void b() {
        if (njy.e(this.ap, 2)) {
            LogUtil.a("Track_SportDataInteractor", "mSumData CALORIES_INDEX is out of bounds");
            return;
        }
        this.i.setText(this.ap.get(0).e());
        this.g.setText(this.d.b(this.ap.get(0).a()));
        this.n.setText(this.d.d(this.ap.get(0).a()));
        SportDetailItem.a aVar = new SportDetailItem.a(null, "", this.ap.get(1).e(), UnitUtil.e(this.ap.get(1).a(), 1, 0), this.ag.getQuantityString(R.plurals.IDS_details_sleep_latency_times, 0, ""), "");
        SportDetailItem.a aVar2 = new SportDetailItem.a(null, "CALORIES", this.ap.get(2).e(), this.d.a(this.ap.get(2).a()), this.d.c(this.ap.get(2).a()), qre.f(R.string.IDS_track_total_calories_kcal));
        this.ah.add(d(aVar));
        this.ah.add(d(aVar2));
    }

    private void b(Object obj) {
        LogUtil.a("Track_SportDataInteractor", "handleAllSportData");
        d();
        List list = (List) obj;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext() && it.next() == null) {
            i++;
        }
        if (i == list.size()) {
            return;
        }
        List<Double> listA = a(obj);
        List<Double> listD = d(obj);
        b(listA, listD);
        b(obj, listD);
        g();
        b();
    }

    private void g(Object obj) {
        if (!njy.b(obj, Object.class)) {
            this.ab.sendEmptyMessage(101);
            LogUtil.e("Track_SportDataInteractor", "wrong data ");
            return;
        }
        List<Object> list = (List) obj;
        if (this.ak == 287) {
            e(list);
        }
        for (Object obj2 : list) {
            if (njy.b(obj2, HiHealthData.class)) {
                List<HiHealthData> list2 = (List) obj2;
                if (list2.size() > 0) {
                    this.q = list2;
                } else {
                    LogUtil.j("Track_SportDataInteractor", "data size =", Integer.valueOf(list2.size()));
                }
            } else {
                LogUtil.j("Track_SportDataInteractor", "class type is wrong");
            }
        }
    }

    private void e(List<Object> list) {
        for (Object obj : list) {
            if (njy.b(obj, HiHealthData.class)) {
                List list2 = (List) obj;
                if (!njy.e(list2)) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        a((HiHealthData) it.next());
                    }
                }
            }
        }
    }

    private void a(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("Track_SportDataInteractor", "hiHealthData is null in handleSingleData");
            return;
        }
        if (hiHealthData.getInt("hihealth_type") == 287) {
            if (this.s == null) {
                this.s = new ArrayList(10);
            }
            this.s.add(hiHealthData);
        } else {
            if (hiHealthData.getInt("hihealth_type") != 291) {
                LogUtil.j("Track_SportDataInteractor", "not free or scuba diving");
                return;
            }
            if (this.af == null) {
                this.af = new ArrayList(10);
            }
            this.af.add(hiHealthData);
        }
    }

    private void c(Object obj) {
        if (obj == null || !njy.b(obj, Object.class)) {
            LogUtil.j("Track_SportDataInteractor", "objData error");
            return;
        }
        List list = (List) obj;
        if (!njy.b(list.get(0), FitnessTrackRecord.class)) {
            LogUtil.j("Track_SportDataInteractor", "class type is wrong");
            return;
        }
        List list2 = (List) list.get(0);
        if (list2.size() == 0) {
            LogUtil.a("Track_SportDataInteractor", "fitnessTrackRecords.size() == 0");
            return;
        }
        LogUtil.a("Track_SportDataInteractor", "fitnessTrackRecords:", Integer.valueOf(list2.size()));
        FitnessTrackRecord fitnessTrackRecord = (FitnessTrackRecord) list2.get(0);
        if (fitnessTrackRecord.acquireSumExerciseTime() <= 0) {
            LogUtil.e("Track_SportDataInteractor", "fitnessTrackRecord <= 0");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.putFloat("Track_Fitness_Duration_Sum", fitnessTrackRecord.acquireSumExerciseTime());
        hiHealthData.putInt("Track_Fitness_Count_Sum", fitnessTrackRecord.acquireSumExerciseTimes());
        hiHealthData.putFloat("Track_Fitness_Calorie_Sum", fitnessTrackRecord.acquireSumCalorie());
        List<HiHealthData> list3 = this.q;
        if (list3 != null) {
            list3.clear();
        } else {
            this.q = new ArrayList();
        }
        this.q.add(hiHealthData);
    }

    private Context a() {
        WeakReference<Context> weakReference = this.o;
        if (weakReference == null) {
            return BaseApplication.b();
        }
        return weakReference.get();
    }
}
