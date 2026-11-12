package com.huawei.healthcloud.plugintrack.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteLocationHelper;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.adapter.RouteCityExpandableListAdapter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseGroupDataAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.model.ICityLatLonCallBack;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.gch;
import defpackage.gcv;
import defpackage.gcx;
import defpackage.gdc;
import defpackage.jdn;
import defpackage.jpl;
import defpackage.lsg;
import defpackage.njy;
import defpackage.npg;
import defpackage.npn;
import defpackage.qol;
import defpackage.qon;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class RunningCitysActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<jpl> f10852a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExpandableListView f10853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f10854c;
    private HotPathCityInfo d;
    private HotPathCityInfo e;
    private HealthSubHeader f;
    private RouteCityExpandableListAdapter g;
    private HealthSubHeader h;
    private HealthButton i;
    private RunningRouteLocationHelper j;
    private CustomTitleBar o;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        clearBackgroundDrawable();
        setContentView(R.layout.activity_running_citys);
        h();
        e();
        a();
    }

    private void h() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.title_bar);
        this.o = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_track_runing_route_location));
        this.o.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: jjt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        finish();
    }

    private void e() {
        this.f10853b = (ExpandableListView) findViewById(R.id.expandable_country_list);
        RouteCityExpandableListAdapter routeCityExpandableListAdapter = new RouteCityExpandableListAdapter();
        this.g = routeCityExpandableListAdapter;
        this.f10853b.setAdapter(routeCityExpandableListAdapter);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.running_citys_head, (ViewGroup) null);
        a(viewInflate);
        this.f10853b.addHeaderView(viewInflate);
        this.f10853b.setSelector(new ColorDrawable(0));
        this.g.setOnItemClickListener(new BaseGroupDataAdapter.OnItemClickListener() { // from class: jjy
            @Override // com.huawei.ui.commonui.adapter.BaseGroupDataAdapter.OnItemClickListener
            public final void onItemClickListener(int i, int i2) {
                this.d.e(i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i, int i2) {
        if (qrs.c(1200)) {
            LogUtil.a("Track_RunningCitysActivity", "isClickFast");
        } else {
            if (njy.e(this.f10852a, i) || this.f10852a.get(i) == null) {
                return;
            }
            d(this.f10852a.get(i).a(i2));
        }
    }

    private void a() {
        this.j = new RunningRouteLocationHelper();
        HotPathCityInfo hotPathCityInfoA = jdn.a();
        this.e = hotPathCityInfoA;
        if (hotPathCityInfoA != null && !TextUtils.isEmpty(hotPathCityInfoA.getCityName())) {
            this.o.setTitleText(getString(R.string.IDS_track_runing_route_current_selected_city, new Object[]{this.e.getCityName()}));
        }
        b();
        jdn.d(false);
        d();
    }

    private void d() {
        gch.b().getAllCityInfoList(new gcv(), new UiCallback<gcx>() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningCitysActivity.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.a("Track_RunningCitysActivity", "getCityInfoList onFailure errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gcx gcxVar) {
                if (gcxVar == null) {
                    LogUtil.a("Track_RunningCitysActivity", "getCityInfoList data == null");
                    return;
                }
                Map<String, List<HotPathCityInfo>> mapD = gcxVar.d();
                if (CollectionUtils.c(mapD)) {
                    LogUtil.a("Track_RunningCitysActivity", "getCityInfoList map is empty");
                } else {
                    RunningCitysActivity.this.e(mapD);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Map<String, List<HotPathCityInfo>> map) {
        this.f10852a.clear();
        jpl jplVar = null;
        for (Map.Entry<String, List<HotPathCityInfo>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<HotPathCityInfo> value = entry.getValue();
            if (!njy.e(value)) {
                jpl jplVar2 = new jpl(key, value.get(0).getCountryName());
                value.sort(new Comparator() { // from class: jjp
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Collator.getInstance().compare(((HotPathCityInfo) obj).getCityName(), ((HotPathCityInfo) obj2).getCityName());
                    }
                });
                jplVar2.setChildList(value);
                HotPathCityInfo hotPathCityInfo = this.e;
                if (hotPathCityInfo == null || !key.equals(hotPathCityInfo.getCountryId())) {
                    this.f10852a.add(jplVar2);
                } else {
                    jplVar = jplVar2;
                }
            }
        }
        this.f10852a.sort(new Comparator() { // from class: jjq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Collator.getInstance().compare(((jpl) obj).c(), ((jpl) obj2).c());
            }
        });
        if (jplVar != null) {
            this.f10852a.add(0, jplVar);
        }
        LogUtil.a("Track_RunningCitysActivity", "initListData mAllCountryData size ", Integer.valueOf(this.f10852a.size()));
        this.g.refresh(this.f10852a);
        if (njy.e(this.f10852a)) {
            return;
        }
        this.f10853b.expandGroup(0);
    }

    private boolean i() {
        boolean zC = c();
        if (zC && npn.c(BaseApplication.getContext()) && CommonUtil.ab(BaseApplication.getContext())) {
            return true;
        }
        new Handler(Looper.myLooper()).postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningCitysActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (RunningCitysActivity.this.isFinishing() && RunningCitysActivity.this.isDestroyed()) {
                    return;
                }
                RunningCitysActivity.this.f10854c.setText(RunningCitysActivity.this.getString(R.string.IDS_track_runing_route_failed_obtain_location));
            }
        }, 300L);
        if (!zC) {
            RunningRouteUtils.a(1, "Unauthorized");
            return false;
        }
        RunningRouteUtils.a(1, "PositioningFailed");
        return false;
    }

    private boolean c() {
        return lsg.d(BaseApplication.getContext(), new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
    }

    private void b() {
        this.d = null;
        this.f10854c.setText(getString(R.string.IDS_track_runing_route_locating));
        if (i()) {
            npg.d().a(new b(this), "Track_RunningCitysActivity");
            this.j.getLocation(null, new ICityLatLonCallBack() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningCitysActivity.4
                @Override // com.huawei.ui.commonui.model.ICityLatLonCallBack
                public void onPointBack(qon qonVar) {
                    qol qolVarA;
                    RunningCitysActivity.this.d = new HotPathCityInfo();
                    if (qonVar != null) {
                        RunningCitysActivity.this.d.setCityName(qonVar.c());
                        qolVarA = qonVar.a();
                    } else {
                        qolVarA = null;
                    }
                    RunningCitysActivity.this.d.setCityId("INVALIDE_CITY_ID");
                    if (qolVarA != null) {
                        RunningCitysActivity.this.d.setCityCenter(new GpsPoint(qolVarA.e, qolVarA.f46564b));
                    }
                    if (TextUtils.isEmpty(RunningCitysActivity.this.d.getCityName())) {
                        return;
                    }
                    qsp.b(RunningCitysActivity.this.f10854c, RunningCitysActivity.this.d.getCityName());
                }
            }, new UiCallback<gdc>() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningCitysActivity.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    if (RunningCitysActivity.this.d == null) {
                        RunningCitysActivity.this.f10854c.setText(RunningCitysActivity.this.getString(R.string.IDS_track_runing_route_failed_obtain_location));
                    }
                    if (RunningCitysActivity.this.j.isLocationFailed(i)) {
                        RunningRouteUtils.a(1, "PositioningFailed");
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gdc gdcVar) {
                    RunningRouteUtils.a(1, (String) null);
                    RunningRouteUtils.b(gdcVar.c());
                    HotPathCityInfo hotPathCityInfoA = gdcVar.a();
                    if (hotPathCityInfoA != null) {
                        RunningCitysActivity.this.d = hotPathCityInfoA;
                        RunningCitysActivity.this.f10854c.setText(hotPathCityInfoA.getCityName());
                    }
                }
            });
        }
    }

    private void d(HotPathCityInfo hotPathCityInfo) {
        Intent intent = new Intent();
        if (hotPathCityInfo != null) {
            boolean z = jdn.a() == null || !TextUtils.equals(jdn.a().getCityId(), hotPathCityInfo.getCityId());
            ReleaseLogUtil.d("Track_RunningCitysActivity", "isCityChange, ", Boolean.valueOf(z));
            jdn.c(hotPathCityInfo);
            intent.putExtra("IS_CITY_CHANGE", z);
        }
        intent.putExtra("IS_SHOW_PATH_DETAIL", false);
        setResult(-1, intent);
        finish();
    }

    private void a(View view) {
        this.f = (HealthSubHeader) view.findViewById(R.id.subHeaderCurrentLocation);
        this.h = (HealthSubHeader) view.findViewById(R.id.subHeaderTopCitys);
        this.f.setSubHeaderBackgroundColor(getResources().getColor(R.color.transparent));
        this.h.setSubHeaderBackgroundColor(getResources().getColor(R.color.transparent));
        this.f.setHeadTitleText(getString(R.string.IDS_track_runing_route_your_location));
        this.h.setHeadTitleText(getString(R.string.IDS_track_runing_route_top_cities));
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.text1);
        this.f10854c = healthTextView;
        healthTextView.setText(getString(R.string.IDS_track_runing_route_location));
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.btn);
        this.i = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: jjs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.b(view2);
            }
        });
        this.f10854c.setOnClickListener(new View.OnClickListener() { // from class: jjr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.e(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        HotPathCityInfo hotPathCityInfo = this.d;
        if (hotPathCityInfo == null || hotPathCityInfo.getCityName() == null) {
            LogUtil.j("Track_RunningCitysActivity", "mCurrentLocationCityInfo is null");
        } else {
            d(this.d);
        }
    }

    public static void a(Activity activity, HotPathCityInfo hotPathCityInfo, int i) {
        jdn.c(hotPathCityInfo);
        activity.startActivityForResult(new Intent(activity, (Class<?>) RunningCitysActivity.class), i);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("Track_RunningCitysActivity", "onDestroy");
        npg.d().c("Track_RunningCitysActivity");
    }

    static class b implements ILoactionCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<RunningCitysActivity> f10857c;

        public b(RunningCitysActivity runningCitysActivity) {
            this.f10857c = new WeakReference<>(runningCitysActivity);
        }

        @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
        public void dispatchLocationChanged(Location location) {
            LogUtil.a("Track_RunningCitysActivity", "onLocationChange with ", location);
            if (this.f10857c.get() != null) {
                npg.d().c("Track_RunningCitysActivity");
                ReleaseLogUtil.d("Track_RunningCitysActivity", "removeLocationUpdates");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
