package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sportservice.SportComponent;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.hwhealthalgormodel.HotRouteCalculate;
import com.huawei.healthcloud.plugintrack.manager.inteface.LoadHotTrackCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class iwr implements SportComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedHashMap<String, String> f38144a = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gdm f38145b;
    private iys d;

    public void c(String str, final LoadHotTrackCallBack loadHotTrackCallBack) {
        LogUtil.d("Track_HotTrackDataManager", "hotPathId is ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Track_HotTrackDataManager", "hotPathId is null, return");
        } else {
            gch.b().getHotPathDetail(str, new UiCallback<gdm>() { // from class: iwr.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("Track_HotTrackDataManager", "can't get hotPathDetail & errorCode = ", Integer.valueOf(i), " errorInfo = ", str2);
                    LoadHotTrackCallBack loadHotTrackCallBack2 = loadHotTrackCallBack;
                    if (loadHotTrackCallBack2 != null) {
                        loadHotTrackCallBack2.onFailure();
                    } else {
                        LogUtil.e("Track_HotTrackDataManager", "callback is null");
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gdm gdmVar) {
                    if (gdmVar == null) {
                        LogUtil.e("Track_HotTrackDataManager", "hotPath detail is null, return");
                        return;
                    }
                    LoadHotTrackCallBack loadHotTrackCallBack2 = loadHotTrackCallBack;
                    if (loadHotTrackCallBack2 == null) {
                        LogUtil.e("Track_HotTrackDataManager", "callback is null");
                    } else {
                        loadHotTrackCallBack2.onSuccess(gdmVar);
                        iwr.this.c(gdmVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final gdm gdmVar) {
        d(gdmVar);
        ThreadPoolManager.c().execute(new Runnable() { // from class: iwq
            @Override // java.lang.Runnable
            public final void run() {
                jaf.b(BaseApplication.getContext(), gdmVar, "hotPathDetailInfo.txt");
            }
        });
    }

    public void d(gdm gdmVar) {
        LogUtil.d("Track_HotTrackDataManager", "reHotPathInfoDetailInfo");
        if (gdmVar == null) {
            LogUtil.e("Track_HotTrackDataManager", "HotPathDetailInfo is null, return");
            return;
        }
        this.f38145b = gdmVar;
        if (gdmVar.g() == 1) {
            this.d = new iyl();
            ReleaseLogUtil.d("Track_HotTrackDataManager", "reHotPathInfoDetailInfo with route darw");
        } else {
            this.d = new HotRouteCalculate();
        }
        this.d.e(gdmVar);
    }

    public long a(MotionPath motionPath, MotionPathSimplify motionPathSimplify, boolean z) {
        boolean zD;
        if (this.f38145b == null) {
            ReleaseLogUtil.a("Track_HotTrackDataManager", "mHotPathDetailInfo is null, return");
            return -1L;
        }
        if (motionPathSimplify == null || motionPath == null) {
            ReleaseLogUtil.a("Track_HotTrackDataManager", "motionPathSimplify or motionPath is null, return");
            return -1L;
        }
        if (this.d == null) {
            ReleaseLogUtil.a("Track_HotTrackDataManager", "mRouteCalculate is null, return");
            return -1L;
        }
        this.f38144a.put("isNormalTrack", z ? "true" : "false");
        this.f38144a.put("userTotalDistance", String.valueOf(motionPathSimplify.requestTotalDistance()));
        motionPathSimplify.addExtendDataMap("hotPathId", this.f38145b.o());
        motionPathSimplify.addExtendDataMap("hotPathName", this.f38145b.l());
        if (z) {
            zD = this.d.d(motionPath.requestLbsDataMap(), motionPathSimplify.requestTotalDistance());
            LogUtil.a("Track_HotTrackDataManager", "user has finished the hot track ", Boolean.valueOf(zD));
        } else {
            ReleaseLogUtil.d("Track_HotTrackDataManager", "not normal track & not finished");
            zD = false;
        }
        this.f38144a.put("isMatch", zD ? "true" : "false");
        this.f38144a.putAll(this.d.b());
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HEALTH_HOT_TRACK_DATA.value(), this.f38144a);
        motionPathSimplify.addExtendDataMap("finishState", zD ? "1" : "0");
        if (zD) {
            return this.f38145b.f() + 1;
        }
        return this.f38145b.f();
    }

    public void e(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            return;
        }
        String strD = qqw.d((Map) motionPathSimplify.requestExtendDataMap(), "cpPunchState", "");
        LogUtil.a("Track_HotTrackDataManager", "stateStr is ", strD);
        if (TextUtils.isEmpty(strD) || strD.length() < 2) {
            return;
        }
        String[] strArrSplit = strD.substring(1, strD.length() - 1).split(",");
        if (strArrSplit.length == 0) {
            return;
        }
        int[] iArr = new int[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            iArr[i] = CommonUtil.n(BaseApplication.getContext(), strArrSplit[i]);
        }
        iys iysVar = this.d;
        if (iysVar != null) {
            iysVar.e(iArr);
        }
    }

    public boolean a() {
        iys iysVar = this.d;
        if (iysVar == null) {
            return false;
        }
        Object objA = iysVar.a();
        if (objA instanceof iyl.c) {
            return !((iyl.c) objA).c();
        }
        return false;
    }

    public void c(Location location) {
        iys iysVar = this.d;
        if (iysVar != null) {
            iysVar.a(location);
        }
    }

    public void d(MotionPathSimplify motionPathSimplify) {
        iys iysVar = this.d;
        if (iysVar != null) {
            Object objA = iysVar.a();
            if (objA instanceof iyl.c) {
                motionPathSimplify.addExtendDataMap("cpPunchState", Arrays.toString(((iyl.c) objA).d()).replaceAll(" ", ""));
                motionPathSimplify.addExtendDataMap("routeType", "2");
            }
        }
    }

    public int[] c() {
        iys iysVar = this.d;
        if (iysVar == null) {
            return null;
        }
        Object objA = iysVar.a();
        if (objA instanceof iyl.c) {
            return ((iyl.c) objA).d();
        }
        return null;
    }

    public void a(Bundle bundle) {
        iys iysVar;
        iyl.c cVar;
        int[] iArrD;
        if (bundle == null || (iysVar = this.d) == null) {
            return;
        }
        Object objA = iysVar.a();
        if (!(objA instanceof iyl.c) || (iArrD = (cVar = (iyl.c) objA).d()) == null) {
            return;
        }
        bundle.putFloat("progreeRate", cVar.e());
        bundle.putString("extroInfo", a(cVar.b(), iArrD.length));
        bundle.putInt("extroLocationState", cVar.a());
    }

    private String a(int i, int i2) {
        return qre.a(R.string.IDS_hw_show_route_draw_punch, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0));
    }

    public String e() {
        iyl.c cVar;
        int[] iArrD;
        iys iysVar = this.d;
        if (iysVar != null) {
            Object objA = iysVar.a();
            if (!(objA instanceof iyl.c) || (iArrD = (cVar = (iyl.c) objA).d()) == null) {
                return "";
            }
            return cVar.b() + "/" + iArrD.length;
        }
        return "";
    }

    @Override // com.huawei.health.sportservice.SportComponent
    public void destroy() {
        iys iysVar = this.d;
        if (iysVar != null) {
            iysVar.e();
        }
        this.f38145b = null;
        this.f38144a.clear();
    }
}
