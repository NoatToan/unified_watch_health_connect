package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.health.sport.utils.RunPopularRoutesUtil;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.model.ICityLatLonCallBack;
import defpackage.buh;
import defpackage.fpy;
import defpackage.gcg;
import defpackage.gch;
import defpackage.gdc;
import defpackage.gdj;
import defpackage.gdk;
import defpackage.gdr;
import defpackage.gdw;
import defpackage.lsg;
import defpackage.njy;
import defpackage.qol;
import defpackage.qon;
import defpackage.qqt;
import defpackage.qrs;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class PopularRoutesProvider extends FitnessEntranceProvider {
    private static final String[] e = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10092a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HotPathCityInfo f10093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10094c;
    private HotPathCityInfo d;
    private SectionBean g;
    private gdk i;

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 258;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 4;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return !Utils.o() && LoginInit.getInstance(context).getIsLogined() && this.f10092a;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("PopularRoutesProvider", "loadData enter");
        this.f10094c = context;
        this.g = sectionBean;
        b();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        fpy fpyVar;
        LogUtil.a("PopularRoutesProvider", "parseParams enter");
        if (obj == null || (fpyVar = (fpy) obj) == null) {
            return;
        }
        a(fpyVar, map);
        b(fpyVar, map);
    }

    private void d() {
        qol userLocation;
        gdk.d dVar = new gdk.d();
        HotPathCityInfo hotPathCityInfo = this.f10093b;
        if (hotPathCityInfo != null) {
            dVar.b(hotPathCityInfo.getCityId());
        }
        if ((this.f10094c instanceof Activity) && (userLocation = gcg.a().getUserLocation((Activity) this.f10094c)) != null) {
            LogUtil.a("PopularRoutesProvider", "get location success");
            dVar.d(userLocation.e);
            dVar.c(userLocation.f46564b);
        }
        dVar.f(1);
        dVar.i(0);
        dVar.a(0);
        dVar.c(1);
        dVar.d(5);
        this.i = dVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f10093b == null) {
            LogUtil.a("PopularRoutesProvider", "mCityInfo is null");
            c();
        } else {
            d();
            gch.b().getHotPaths(this.i, new UiCallback<gdj>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.PopularRoutesProvider.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gdj gdjVar) {
                    LogUtil.a("PopularRoutesProvider", "loadData onSuccess");
                    List<gdr> listC = gdjVar.c();
                    if (!njy.e(listC)) {
                        PopularRoutesProvider.this.e(listC);
                    } else {
                        PopularRoutesProvider.this.c();
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("PopularRoutesProvider", "loadData onFailure");
                    PopularRoutesProvider.this.c();
                }
            });
        }
    }

    private void b() {
        if (!lsg.d(this.f10094c, e)) {
            String strE = buh.e("RUNNING_PATH_CITY_INFO");
            if (!TextUtils.isEmpty(strE)) {
                this.f10093b = (HotPathCityInfo) qqt.e(strE, HotPathCityInfo.class);
            }
            e();
            return;
        }
        a();
    }

    private void a() {
        gcg.a().getLocation(this.f10094c, new ICityLatLonCallBack() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.PopularRoutesProvider.2
            @Override // com.huawei.ui.commonui.model.ICityLatLonCallBack
            public void onPointBack(qon qonVar) {
                if (qonVar == null || qonVar.a() == null) {
                    PopularRoutesProvider.this.c();
                    return;
                }
                qol qolVarA = qonVar.a();
                GpsPoint gpsPoint = new GpsPoint(qolVarA.e, qolVarA.f46564b);
                PopularRoutesProvider.this.d = new HotPathCityInfo();
                PopularRoutesProvider.this.d.setCityName(qonVar.c());
                PopularRoutesProvider.this.d.setCityId("INVALIDE_CITY_ID");
                PopularRoutesProvider.this.d.setCityCenter(gpsPoint);
            }
        }, new UiCallback<gdc>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.PopularRoutesProvider.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("PopularRoutesProvider", "getLocalCity onFailure");
                PopularRoutesProvider.this.c();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gdc gdcVar) {
                LogUtil.a("PopularRoutesProvider", "getLocation onSuccess");
                HotPathCityInfo hotPathCityInfoA = gdcVar.a();
                if (hotPathCityInfoA != null) {
                    PopularRoutesProvider.this.f10093b = hotPathCityInfoA;
                } else if (PopularRoutesProvider.this.d != null) {
                    PopularRoutesProvider popularRoutesProvider = PopularRoutesProvider.this;
                    popularRoutesProvider.f10093b = popularRoutesProvider.d;
                }
                buh.d("RUNNING_PATH_CITY_INFO", qqt.b(PopularRoutesProvider.this.f10093b));
                PopularRoutesProvider.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<gdr> list) {
        LogUtil.a("PopularRoutesProvider", "detailData enter");
        fpy fpyVar = new fpy();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (gdr gdrVar : list) {
            arrayList.add(gdrVar.j());
            arrayList2.add(gdrVar.h());
            arrayList3.add(Double.valueOf(gdrVar.n()));
            arrayList4.add(Long.valueOf(gdrVar.b()));
            a(gdrVar.i(), arrayList5);
        }
        fpyVar.d(arrayList);
        fpyVar.e(arrayList2);
        fpyVar.b(arrayList3);
        fpyVar.c(arrayList4);
        fpyVar.a(arrayList5);
        this.f10092a = true;
        this.g.c(fpyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f10092a = false;
        this.g.c((Object) null);
    }

    private void a(gdw gdwVar, List<String> list) {
        if (gdwVar != null) {
            list.add(gdwVar.c());
        } else {
            LogUtil.a("PopularRoutesProvider", "pathImageInfo is null");
        }
    }

    private void a(fpy fpyVar, Map<String, Object> map) {
        map.put("IMAGE", fpyVar.b());
        map.put("NAME", fpyVar.c());
        map.put("TOTAL_DISTANCE", fpyVar.d());
        map.put("PARTICIPATE_USER_NUM", fpyVar.a());
        map.put("TITLE", this.f10094c.getString(R.string.IDS_hw_show_popular_routes_string));
        map.put("SUBTITLE", this.f10094c.getString(R.string.IDS_user_profile_more));
    }

    private void b(final fpy fpyVar, HashMap map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.PopularRoutesProvider.1
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if (qrs.r()) {
                    return;
                }
                PopularRoutesProvider.this.c(str);
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (qrs.r()) {
                    return;
                }
                PopularRoutesProvider.this.c(fpyVar, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if ("ALL_CLICK_EVENT".equals(str)) {
            RunPopularRoutesUtil.e(this.f10094c, 2, new RunPopularRoutesUtil.DialogCallBack() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.PopularRoutesProvider.4
                @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
                public void goNext() {
                    LogUtil.a("PopularRoutesProvider", "Start jump To RunningRouteListActivity");
                    RunPopularRoutesUtil.b(PopularRoutesProvider.this.f10094c, PopularRoutesProvider.this.getCourseCategory(), PopularRoutesProvider.this.f10093b);
                }

                @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
                public void notGoNext() {
                    LogUtil.a("PopularRoutesProvider", "Cancle start jump To RunningRouteListActivity");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final fpy fpyVar, final int i) {
        RunPopularRoutesUtil.e(this.f10094c, 2, new RunPopularRoutesUtil.DialogCallBack() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.PopularRoutesProvider.10
            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void goNext() {
                if (njy.c(fpyVar.e(), i)) {
                    LogUtil.a("PopularRoutesProvider", "Start jump To Item");
                    String str = fpyVar.e().get(i);
                    ComponentName componentName = new ComponentName(PopularRoutesProvider.this.f10094c.getPackageName(), "com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity");
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    intent.putExtra("PATH_ID", str);
                    intent.putExtra("RUNNING_PATH_CITY_INFO", PopularRoutesProvider.this.f10093b);
                    intent.putExtra("ENTRANCE_ACTIVITY", 3);
                    PopularRoutesProvider.this.f10094c.startActivity(intent);
                }
            }

            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void notGoNext() {
                LogUtil.a("PopularRoutesProvider", "Cancle jump To Item");
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "PopularRoutesProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return "";
    }
}
