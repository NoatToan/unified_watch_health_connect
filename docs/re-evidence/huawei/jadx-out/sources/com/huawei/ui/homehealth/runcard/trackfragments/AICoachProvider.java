package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.plan.aicoach.AICoachOnClickListener;
import com.huawei.health.plan.aicoach.ControlTypeEnum;
import com.huawei.health.plan.aicoach.SourceActionEnum;
import com.huawei.health.plan.aicoach.ToolType;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.profile.profile.ProfileExtendConstants;
import defpackage.fxl;
import defpackage.gfg;
import defpackage.gfk;
import defpackage.gfl;
import defpackage.gfm;
import defpackage.gfn;
import defpackage.gfo;
import defpackage.gfp;
import defpackage.gfs;
import defpackage.gfw;
import defpackage.npg;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class AICoachProvider extends BaseKnitDataProvider<HashMap<String, Object>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<SectionBean> f25852c;
    private Handler d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f25851b = new Runnable() { // from class: sxo
        @Override // java.lang.Runnable
        public final void run() {
            this.d.b();
        }
    };

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    public /* synthetic */ void b() {
        ReleaseLogUtil.e("Track_Provider_AICoachProvider", "getAICoachInfo timeout");
        WeakReference<SectionBean> weakReference = this.f25852c;
        if (weakReference == null) {
            ReleaseLogUtil.d("R_Track_Provider_AICoachProvider", "mSectionBeanReference is null");
            return;
        }
        SectionBean sectionBean = weakReference.get();
        if (sectionBean != null) {
            sectionBean.c((Object) a(new gfn(), true));
        } else {
            ReleaseLogUtil.d("R_Track_Provider_AICoachProvider", "sectionBean is null");
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void e(Context context, SectionBean sectionBean) {
        this.f25852c = new WeakReference<>(sectionBean);
        gfm gfmVarD = d();
        if (PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED) {
            gfmVarD.e(Collections.singletonList(Integer.valueOf(ToolType.TOOL_GPS.getValue())));
        }
        e(gfmVarD, false);
    }

    private gfm d() {
        gfm gfmVar = new gfm();
        gfmVar.b(String.valueOf(1));
        gfmVar.a(SourceActionEnum.RUNNING_PAGE.getValue());
        gfmVar.c(fxl.d());
        gfmVar.a(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        return gfmVar;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, HashMap<String, Object> map2) {
        map.putAll(map2);
    }

    private HashMap<String, Object> a(gfn gfnVar, boolean z) {
        LogUtil.a("Track_Provider_AICoachProvider", "isTimeOut ", Boolean.valueOf(z));
        HashMap<String, Object> map = new HashMap<>();
        map.put("LAYOUT_CONTENT", gfnVar);
        map.put("CLICK_EVENT_LISTENER", new AICoachOnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.AICoachProvider.3
            @Override // com.huawei.health.plan.aicoach.AICoachOnClickListener
            public void onClick(gfg gfgVar) {
                LogUtil.a("Track_Provider_AICoachProvider", "click button");
                AICoachProvider.this.d(gfgVar);
            }
        });
        map.put("TIME_OUT_FLAG", Boolean.valueOf(z));
        return map;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        sectionBean.c((Object) a(new gfn(), false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gfn e(LinkedHashMap<Integer, gfl> linkedHashMap) {
        gfl gflVar = linkedHashMap.get(0);
        if (gflVar == null) {
            ReleaseLogUtil.a("R_Track_Provider_AICoachProvider", "getAICoachContent response is null");
            return new gfn();
        }
        return gflVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(LinkedHashMap<Integer, gfl> linkedHashMap) {
        for (Integer num : linkedHashMap.keySet()) {
            LogUtil.a("Track_Provider_AICoachProvider", "data key is： ", num);
            gfl gflVar = linkedHashMap.get(num);
            if (gflVar == null) {
                ReleaseLogUtil.a("R_Track_Provider_AICoachProvider", "getAICoachContent response is null");
            } else {
                gfw gfwVarE = e(gflVar);
                if (gfwVarE != null) {
                    return gfwVarE.d();
                }
            }
        }
        return 0;
    }

    private gfw e(gfl gflVar) {
        gfn gfnVarE = gflVar.e();
        if (gfnVarE == null) {
            ReleaseLogUtil.a("R_Track_Provider_AICoachProvider", "getAICoachContent aiCoachContenFt is null");
            return null;
        }
        for (gfo gfoVar : gfnVarE.c()) {
            String strA = gfoVar.a();
            String strC = gfoVar.c();
            if (!TextUtils.isEmpty(strC) && ControlTypeEnum.CONTROL_RESULT.getControlType().equals(strA)) {
                return (gfw) HiJsonUtil.d(strC, gfw.class);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, gfn gfnVar) {
        LogUtil.a("Track_Provider_AICoachProvider", "handleResultCode resultCode ", Integer.valueOf(i));
        if (i == 27002) {
            e(gfnVar);
            PluginSuggestion.getInstance().sendIntelligentPlan();
        } else if (i == 27009) {
            a();
        } else {
            e(gfnVar);
        }
    }

    private void a() {
        gfm gfmVarD;
        Location location;
        gfp gfpVar;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Location[] locationArr = {null};
        npg.d().a(new ILoactionCallback() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.AICoachProvider.1
            @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
            public void dispatchLocationChanged(Location location2) {
                LogUtil.a("Track_Provider_AICoachProvider", "location ", location2);
                locationArr[0] = location2;
                countDownLatch.countDown();
            }
        }, "Track_Provider_AICoachProvider");
        try {
            try {
                countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
                LogUtil.a("Track_Provider_AICoachProvider", "unregisterLocationListener");
                npg.d().c("Track_Provider_AICoachProvider");
                gfmVarD = d();
                location = locationArr[0];
                if (location != null) {
                    gfpVar = new gfp();
                    gfpVar.a(AMapLocation.COORD_TYPE_WGS84);
                    gfpVar.c(UnitUtil.d(location.getLatitude(), 2));
                    gfpVar.a(UnitUtil.d(location.getLongitude(), 2));
                    gfmVarD.c(gfpVar);
                }
            } catch (InterruptedException e) {
                LogUtil.e("Track_Provider_AICoachProvider", "getAICoachInfoByGps error ", e);
                LogUtil.a("Track_Provider_AICoachProvider", "unregisterLocationListener");
                npg.d().c("Track_Provider_AICoachProvider");
                gfmVarD = d();
                location = locationArr[0];
                if (location != null) {
                    gfpVar = new gfp();
                }
            }
            gfmVarD.d(Collections.singletonList(Integer.valueOf(ToolType.TOOL_GPS.getValue())));
            gfmVarD.e(Collections.singletonList(Integer.valueOf(ToolType.TOOL_GPS.getValue())));
            e(gfmVarD, false);
        } catch (Throwable th) {
            LogUtil.a("Track_Provider_AICoachProvider", "unregisterLocationListener");
            npg.d().c("Track_Provider_AICoachProvider");
            gfm gfmVarD2 = d();
            Location location2 = locationArr[0];
            if (location2 != null) {
                gfp gfpVar2 = new gfp();
                gfpVar2.a(AMapLocation.COORD_TYPE_WGS84);
                gfpVar2.c(UnitUtil.d(location2.getLatitude(), 2));
                gfpVar2.a(UnitUtil.d(location2.getLongitude(), 2));
                gfmVarD2.c(gfpVar2);
            }
            gfmVarD2.d(Collections.singletonList(Integer.valueOf(ToolType.TOOL_GPS.getValue())));
            gfmVarD2.e(Collections.singletonList(Integer.valueOf(ToolType.TOOL_GPS.getValue())));
            e(gfmVarD2, false);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(gfg gfgVar) {
        if (gfgVar == null) {
            LogUtil.a("Track_Provider_AICoachProvider", "clickData is null");
            return;
        }
        gfm gfmVarD = d();
        gfmVarD.e(gfgVar);
        gfs gfsVarA = gfgVar.a();
        if (gfsVarA == null || !gfsVarA.c()) {
            e(gfmVarD, false);
            if (gfsVarA == null) {
                return;
            }
            String strE = gfsVarA.e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            LogUtil.a("Track_Provider_AICoachProvider", "handleClickEvent deepLink run");
            AppRouter.e(Uri.parse(strE)).e(268435456).b(BaseApplication.getContext());
        }
    }

    private void e(gfm gfmVar, boolean z) {
        LogUtil.a("Track_Provider_AICoachProvider", "getAICoachInfo isLoading ", Boolean.valueOf(z));
        this.d.removeCallbacks(this.f25851b);
        if (z) {
            this.d.postDelayed(this.f25851b, ProfileExtendConstants.TIME_OUT);
        }
        gfk.e().b(gfmVar, new ResultCallback<LinkedHashMap<Integer, gfl>>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.AICoachProvider.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(LinkedHashMap<Integer, gfl> linkedHashMap) {
                LogUtil.a("Track_Provider_AICoachProvider", "getAICoachInfo success");
                AICoachProvider.this.d.removeCallbacks(AICoachProvider.this.f25851b);
                AICoachProvider aICoachProvider = AICoachProvider.this;
                aICoachProvider.a(aICoachProvider.c(linkedHashMap), AICoachProvider.this.e(linkedHashMap));
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.d("R_Track_Provider_AICoachProvider", "getAICoachInfo failure ", th);
                AICoachProvider.this.d.removeCallbacks(AICoachProvider.this.f25851b);
                AICoachProvider.this.e(new gfn());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(gfn gfnVar) {
        WeakReference<SectionBean> weakReference = this.f25852c;
        if (weakReference == null) {
            ReleaseLogUtil.d("R_Track_Provider_AICoachProvider", "mSectionBeanReference is null");
            return;
        }
        SectionBean sectionBean = weakReference.get();
        if (sectionBean != null) {
            sectionBean.c((Object) a(gfnVar, false));
        } else {
            ReleaseLogUtil.d("R_Track_Provider_AICoachProvider", "sectionBean is null");
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("Track_Provider_AICoachProvider", "AICoachProvider onDestroy");
        this.d.removeCallbacks(this.f25851b);
    }
}
