package com.huawei.watchface;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.secure.android.common.anonymization.Anonymizer;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.datatype.SpCacheWaitTryoutBean;
import com.huawei.watchface.mvp.model.datatype.SystemParamsSupportTryOutBean;
import com.huawei.watchface.mvp.model.datatype.TryoutBean;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.datatype.querysubinfodetail.QuerySubInfoDetailResp;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.mvp.ui.service.TryOutWatchFaceService;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class j2 {
    public static final String r = "j2";
    public static j2 s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OperateWatchFaceCallback f30241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f30243c;
    public String d;
    public String e;
    public ConcurrentHashMap f;
    public ConcurrentHashMap g;
    public String h;
    public String i;
    public String j;
    public String k;
    public c l = new c();
    public boolean m = false;
    public String n = null;
    public int o = 0;
    public d p = new d();
    public IBaseResponseCallback q = new a();

    public class a implements IBaseResponseCallback {
        public a() {
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            j2.this.b(i, obj);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TryoutBean f30245a;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f30247a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f30248b;

            public a(String str, String str2) {
                this.f30247a = str;
                this.f30248b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                HwLog.i(j2.r, "installTryoutWatchFace -- start install WatchFace");
                b bVar = b.this;
                HwWatchFaceManager.getInstance(Environment.getApplicationContext()).installWatchFace(j2.this.a(bVar.f30245a, this.f30247a, this.f30248b));
                j2.this.k = null;
            }
        }

        public b(TryoutBean tryoutBean) {
            this.f30245a = tryoutBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            o4 o4VarE = j2.e(this.f30245a);
            if (o4VarE == null) {
                HwLog.e(j2.r, "installTryoutWatchFace -- requestTryOutInfo error.TryOutWatchFaceInfo is null");
                j2 j2Var = j2.this;
                j2Var.k = null;
                j2Var.d(this.f30245a.getTryOutHiTopId(), this.f30245a.getVersion());
                OperateWatchFaceCallback operateWatchFaceCallback = j2.this.f30241a;
                if (operateWatchFaceCallback != null) {
                    operateWatchFaceCallback.transmitDownloadWatchFaceResult(this.f30245a.getTryOutHiTopId(), this.f30245a.getVersion(), 0);
                    return;
                }
                return;
            }
            if (j2.this.m(this.f30245a.getTryOutHiTopId(), this.f30245a.getVersion())) {
                String strA = o4VarE.a();
                String strB = o4VarE.b();
                j2.this.a(this.f30245a.getTryOutHiTopId(), this.f30245a.getVersion(), strA, strB);
                k2.a().a(this.f30245a.getTryOutHiTopId(), this.f30245a.getVersion(), 1, false);
                BackgroundTaskUtils.postInMainThread(new a(strA, strB));
                return;
            }
            HwLog.e(j2.r, "installTryoutWatchFace -- requestTryOutInfo not match list tryoutBean is remove ");
            j2.this.d(this.f30245a.getTryOutHiTopId(), this.f30245a.getVersion());
            OperateWatchFaceCallback operateWatchFaceCallback2 = j2.this.f30241a;
            if (operateWatchFaceCallback2 != null) {
                operateWatchFaceCallback2.transmitDownloadWatchFaceResult(this.f30245a.getTryOutHiTopId(), this.f30245a.getVersion(), 0);
            }
        }
    }

    public class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TryoutBean f30250a;

        public c() {
        }

        public void a(TryoutBean tryoutBean) {
            this.f30250a = tryoutBean;
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onError(int i) {
            BackgroundTaskUtils.removeTaskFromMainWorker(j2.this.p);
            this.f30250a = null;
            j2 j2Var = j2.this;
            j2Var.i = null;
            j2Var.k = null;
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            BackgroundTaskUtils.removeTaskFromMainWorker(j2.this.p);
            j2 j2Var = j2.this;
            j2Var.k = null;
            j2Var.a(i, obj, this.f30250a);
            this.f30250a = null;
            j2.this.i = null;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwLog.i(j2.r, "FinishTryOutWatchFaceProtectRunnable -- run()");
            j2.this.l.onResponse(-1, null);
        }
    }

    public j2() {
        this.f30243c = new CopyOnWriteArrayList();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        String str = r;
        HwLog.i(str, "HwWatchFaceTryOutManager()");
        String strA = f5.a("sp_key_wait_try_out_info");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        HwLog.i(str, "HwWatchFaceTryOutManager -- init cache");
        SpCacheWaitTryoutBean spCacheWaitTryoutBean = (SpCacheWaitTryoutBean) GsonHelper.fromJson(strA, SpCacheWaitTryoutBean.class);
        if (spCacheWaitTryoutBean == null) {
            HwLog.i(str, "HwWatchFaceTryOutManager -- spCacheWaitTryoutBean is null");
            return;
        }
        this.f30243c = spCacheWaitTryoutBean.getWaitTryOutWatchFaceIdList();
        this.f = spCacheWaitTryoutBean.getWaitTryOutBeanMap();
        this.g = spCacheWaitTryoutBean.getTryoutWfDownUrlMap();
    }

    public static void f() {
        synchronized (j2.class) {
            if (s != null) {
                HwLog.i(r, "destroyInstance() enter.");
                s = null;
            }
        }
    }

    public static j2 g() {
        if (s == null) {
            synchronized (j2.class) {
                if (s == null) {
                    s = new j2();
                }
            }
        }
        return s;
    }

    public void a(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.f30241a = operateWatchFaceCallback;
    }

    public void b(TryoutBean tryoutBean) {
        if (tryoutBean == null) {
            HwLog.e(r, "cancelTryOutWatchFace -- tryoutBean is null");
            return;
        }
        this.m = true;
        this.n = tryoutBean.getTryOutHiTopId();
        a(tryoutBean, "2", false, false);
    }

    public void c(TryoutBean tryoutBean) {
        a(tryoutBean);
        String tryOutHiTopId = tryoutBean.getTryOutHiTopId();
        if (!TextUtils.isEmpty(this.k) && this.k.equals(tryOutHiTopId)) {
            HwLog.i(r, "installTryoutWatchFace -- click same watch face try out.Method return");
            return;
        }
        this.k = tryOutHiTopId;
        this.i = null;
        if (TextUtils.isEmpty(this.d)) {
            a(tryoutBean.getTryOutHiTopId(), tryoutBean.getVersion(), tryoutBean);
            o(tryoutBean.getTryOutHiTopId(), tryoutBean.getVersion());
            BackgroundTaskUtils.submit(new b(tryoutBean));
            return;
        }
        HwLog.i(r, "installTryoutWatchFace -- mTryOutWatchFaceId not empty.Cancel the try out first");
        String str = this.d.split("_")[0];
        String str2 = this.d.split("_")[1];
        this.l.a(tryoutBean);
        this.i = str;
        BackgroundTaskUtils.removeTaskFromMainWorker(this.p);
        BackgroundTaskUtils.postDelayedInMainThread(this.p, 4000L);
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyTryoutWatchFaceFinish(str, str2, this.l);
    }

    public final void d(String str, String str2) {
        HwLog.i(r, "clearWaitTryOutWatchFaceId");
        String str3 = str + "_" + str2;
        this.f30243c.remove(str3);
        this.f.remove(str3);
        this.g.remove(str3);
        r();
    }

    public void e() {
        this.l = null;
        this.q = null;
        this.f30241a = null;
        f();
    }

    public final String h(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        return "huaweihealth://huaweihealth.app/openwith?type=aar&isNeedLogin=true&address=" + str + "&operateType=" + str2;
    }

    public final TryoutBean i(String str, String str2) {
        String str3 = str + "_" + str2;
        HwLog.i(r, "getWaitTryOutBean -- hitopIdKey :" + str3);
        return (TryoutBean) this.f.get(str3);
    }

    public void j(String str, String str2) {
        String str3 = r;
        HwLog.i(str3, "goToH5Detail() -- enter.");
        String strH = h(str, str2);
        if (TextUtils.isEmpty(strH)) {
            HwLog.w(str3, "goToH5Detail() deepLinkUrl is null");
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(strH));
            intent.setPackage(Environment.b());
            intent.addFlags(268435456);
            Environment.getApplicationContext().startActivity(intent);
        } catch (ActivityNotFoundException | IllegalArgumentException e) {
            HwLog.i(r, "goToH5Detail() ActivityNotFoundException e :" + HwLog.printException((Exception) e));
        }
    }

    public final void k(String str, String str2) {
        if (TextUtils.isEmpty(this.d)) {
            HwLog.i(r, "dealDeviceReportResult -- CALLBACK_WATCH_FACE_FINISH_TRY_OUT.  mTryOutWatchFaceId is null");
            return;
        }
        if (!l(str, str2)) {
            HwLog.e(r, "dealDeviceReportResult -- CALLBACK_WATCH_FACE_FINISH_TRY_OUT. not try out id.  hitopId:" + str + "   mTryOutWatchFaceId:" + this.d);
            return;
        }
        if (TextUtils.equals(this.i, str)) {
            this.i = null;
            HwLog.i(r, "dealDeviceReportResult -- CALLBACK_WATCH_FACE_FINISH_TRY_OUT. isCancelingPrevHiTopId = true. Not deal");
            return;
        }
        if (TextUtils.equals(this.j, str)) {
            HwLog.i(r, "dealDeviceReportResult -- CALLBACK_WATCH_FACE_FINISH_TRY_OUT. isProactiveCancelHiTopId = true. Not deal");
            return;
        }
        String str3 = r;
        FlavorConfig.safeHwLog(str3, "handleFinishTryOut mGoToH5DetailUrl:" + this.h);
        if (!TextUtils.isEmpty(this.h) && !this.h.contains(str)) {
            HwLog.i(str3, "dealDeviceReportResult -- mGoToH5DetailUrl is not contains hiTopId");
            return;
        }
        HwLog.i(str3, "dealDeviceReportResult -- CALLBACK_WATCH_FACE_FINISH_TRY_OUT enter.");
        TryoutBean tryoutBean = new TryoutBean();
        tryoutBean.setTryOutHiTopId(str);
        tryoutBean.setVersion(str2);
        tryoutBean.setDetailUrl(this.h);
        if (l()) {
            a(tryoutBean, "3", true, false);
        } else {
            a(tryoutBean, "3", true);
        }
    }

    public boolean l(String str, String str2) {
        boolean z = false;
        try {
            if (TextUtils.isEmpty(this.d)) {
                HwLog.i(r, "isTryOutWatchFaceId -- false.mTryOutWatchFaceId is null");
                return false;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (this.d.contains(str) && this.d.contains(str2)) {
                    z = true;
                }
                HwLog.i(r, "isTryOutWatchFaceId -- " + z);
                return z;
            }
            HwLog.i(r, "isTryOutWatchFaceId -- false.hitopId or version is null");
            return false;
        } catch (Exception e) {
            HwLog.i(r, "isTryOutWatchFaceId Exception:" + HwLog.printException(e));
            return false;
        }
    }

    public boolean m(String str, String str2) {
        if (ArrayUtils.isEmpty(this.f30243c)) {
            HwLog.i(r, "isWaitTryOutWatchFaceId -- false.mWaitTryOutWatchFaceIdList is null");
            return false;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HwLog.i(r, "isWaitTryOutWatchFaceId -- false.hitopId or version is null");
            return false;
        }
        boolean zContains = this.f30243c.contains(str + "_" + str2);
        String str3 = r;
        StringBuilder sb = new StringBuilder("isWaitTryOutWatchFaceId -- ");
        sb.append(zContains);
        HwLog.i(str3, sb.toString());
        return zContains;
    }

    public void o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = str + "_" + str2;
        if (!this.f30243c.contains(str3)) {
            this.f30243c.add(str3);
            r();
        }
        HwLog.i(r, "setWaitTryOutWatchFaceId -- mWaitTryOutWatchFaceIdList size:" + this.f30243c.size());
    }

    public void p() {
        HwLog.i(r, "resetTryOutWatchFaceId enter");
        this.d = null;
    }

    public void q() {
        if (TextUtils.isEmpty(this.d)) {
            HwLog.i(r, "setIsCancelingPrevHiTopId mTryOutWatchFaceId is null");
            return;
        }
        String[] strArrSplit = this.d.split("_");
        if (strArrSplit == null || strArrSplit.length < 2) {
            HwLog.i(r, "setIsProactiveCancelHiTopId mTryOutWatchFaceId splits is null");
            return;
        }
        this.j = strArrSplit[0];
        HwLog.i(r, "setIsCancelingPrevHiTopId isProactiveCancelHiTopId:" + this.j);
    }

    public final void r() {
        synchronized (this) {
            HwLog.i(r, "updateWaitTryOutInfoCache enter");
            f5.a("sp_key_wait_try_out_info", GsonHelper.toJson(new SpCacheWaitTryoutBean(this.f30243c, this.f, this.g)));
        }
    }

    public final void a(String str, String str2, String str3) {
        if (this.f30241a == null) {
            return;
        }
        HwLog.i(r, "transmitTryOutOver -- enter");
        this.f30241a.transmitTryOutOver(str, str2, str3);
    }

    public void n(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.d = str + "_" + str2;
        String str3 = r;
        StringBuilder sb = new StringBuilder("setTryOutWatchFaceId -- mTryOutWatchFaceId:");
        sb.append(this.d);
        HwLog.i(str3, sb.toString());
    }

    public String i() {
        try {
            if (!TextUtils.isEmpty(this.d)) {
                String[] strArrSplit = this.d.split("_");
                if (strArrSplit != null && strArrSplit.length >= 2) {
                    String strC = e4.c(h(), "themename");
                    if (TextUtils.isEmpty(strC)) {
                        HwLog.i(r, "getTrailRemainTime startTrailTime is null");
                        return "";
                    }
                    String[] strArrSplit2 = strC.split("_");
                    if (strArrSplit2 != null && strArrSplit2.length >= 2) {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit2[0];
                        String str3 = r;
                        HwLog.i(str3, "getTrailRemainTime mTryOutHiTopId：" + str + ",startTrailHiTopId:" + str2);
                        if (!TextUtils.equals(str, str2)) {
                            HwLog.i(str3, "getTrailRemainTime mTryOutHiTopId is not equals  startTrailHiTopId");
                            return "";
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - Long.valueOf(strArrSplit2[1]).longValue();
                        if (jCurrentTimeMillis > 300000) {
                            HwLog.i(str3, "getTrailRemainTime time is > 5 min");
                            return "";
                        }
                        String str4 = str + "_" + (300000 - jCurrentTimeMillis);
                        HwLog.i(str3, "getTrailRemainTime：" + str4);
                        return str4;
                    }
                    HwLog.i(r, "getTrailRemainTime startTrailTimes splits is null");
                    return "";
                }
                HwLog.i(r, "getTrailRemainTime mTryOutWatchFaceId splits is null");
                return "";
            }
            HwLog.i(r, "getTrailRemainTime mTryOutWatchFaceId is null");
            return "";
        } catch (Exception e) {
            HwLog.i(r, "getTrailRemainTime Exception:" + HwLog.printException(e));
            return "";
        }
    }

    public static o4 e(TryoutBean tryoutBean) {
        if (!CommonUtils.C()) {
            HwLog.e(r, "requestTryOutInfo -- productId is empty or net is error");
            return null;
        }
        g1 g1Var = new g1(tryoutBean.getProductId(), tryoutBean.getVersionCode(), tryoutBean.getTryOutHiTopId(), 1);
        int i = 3;
        o4 o4VarB = null;
        while (i > 0) {
            i--;
            o4VarB = g1Var.b(g1Var.c(""));
            if (o4VarB != null && o4VarB.c() == 0) {
                break;
            }
        }
        if (o4VarB == null || !TextUtils.isEmpty(o4VarB.a())) {
            return o4VarB;
        }
        HwLog.e(r, "requestTryOutInfo -- downUrl is empty");
        return null;
    }

    public final InstallWatchFaceBean a(TryoutBean tryoutBean, String str, String str2) {
        InstallWatchFaceBean installWatchFaceBean = new InstallWatchFaceBean();
        installWatchFaceBean.setWatchFaceHiTopId(tryoutBean.getTryOutHiTopId());
        installWatchFaceBean.setVersion(tryoutBean.getVersion());
        installWatchFaceBean.setFileUrl(str);
        installWatchFaceBean.setFileSize(tryoutBean.getFileSize());
        installWatchFaceBean.setHashCode(tryoutBean.getHashCode());
        installWatchFaceBean.setWatchScreen(tryoutBean.getWatchScreen());
        installWatchFaceBean.setHashCode(str2);
        installWatchFaceBean.setZip(tryoutBean.isZip());
        installWatchFaceBean.setTitle(tryoutBean.getTitle());
        installWatchFaceBean.setCnTitle(tryoutBean.getCnTitle());
        installWatchFaceBean.setProductId(tryoutBean.getProductId());
        installWatchFaceBean.setInstallationType(1);
        installWatchFaceBean.setResourceType("2");
        return installWatchFaceBean;
    }

    public void b(String str, String str2) {
        if (m(str, str2)) {
            HwLog.i(r, "clearWaitTryOutIdFromCancelInstall -- hitopId : " + str);
            d(str, str2);
        }
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(TryoutBean tryoutBean) {
        HwLog.i(r, "startTryOutService -- enter");
        try {
            SafeIntent safeIntent = new SafeIntent(new Intent(Environment.getApplicationContext(), (Class<?>) TryOutWatchFaceService.class));
            safeIntent.setAction("0");
            safeIntent.putExtra("key_try_out_bean", tryoutBean);
            Environment.getApplicationContext().startForegroundService(safeIntent);
        } catch (RuntimeException e) {
            HwLog.e(r, "startTryOut -- RuntimeException e:" + HwLog.printException((Exception) e));
        }
    }

    public void d() {
        String str = r;
        HwLog.i(str, "dealWatchInfoListReset: enter");
        if (TextUtils.isEmpty(this.d)) {
            WatchResourcesInfo tryOutWatchFaceInfo = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getTryOutWatchFaceInfo();
            if (tryOutWatchFaceInfo == null) {
                HwLog.i(str, "dealWatchInfoListReset -- mTryOutWatchFaceId is null and tryOutWatchFace is null");
                return;
            } else {
                HwLog.i(str, "dealWatchInfoListReset -- mTryOutWatchFaceId is null and tryOutWatchFace is not null");
                n(tryOutWatchFaceInfo.getWatchInfoId(), tryOutWatchFaceInfo.getWatchInfoVersion());
                return;
            }
        }
        String strJ = j();
        if (!TextUtils.isEmpty(strJ) && this.d.contains(strJ)) {
            HwLog.i(str, "dealWatchInfoListReset -- is try out id");
            return;
        }
        String str2 = this.d.split("_")[0];
        String str3 = this.d.split("_")[1];
        if (TextUtils.equals(this.j, str2)) {
            HwLog.i(str, "dealWatchInfoListReset -- isProactiveCancelHiTopId");
            return;
        }
        TryoutBean tryoutBean = new TryoutBean();
        tryoutBean.setTryOutHiTopId(str2);
        tryoutBean.setVersion(str3);
        tryoutBean.setDetailUrl(this.h);
        if (l()) {
            a(tryoutBean, "3", true, false);
        } else {
            a(tryoutBean, "3", true);
        }
    }

    public String g(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return str + "&operateType=" + str2;
        }
        return "";
    }

    public void o() {
        this.k = null;
        this.i = null;
        this.j = null;
    }

    public void b() {
        HwLog.i(r, "clearTryOutWatchFaceId enter");
        this.d = null;
        this.h = null;
        this.e = null;
    }

    public final String h() {
        String str;
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 1) {
            str = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceName() + (HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSportAPModel() ? "AP" : "GT");
            this.f30242b = str;
        } else {
            str = this.f30242b;
            HwLog.i(r, "getStartTrailTimeKey lastConnectDeviceName");
        }
        return "key_start_trail_time" + Anonymizer.maskCommonString(str, 2, 5);
    }

    public boolean m() {
        boolean z;
        String strB = NewSystemParamManager.b(SystemParamNames.SYSTEM_PARAM_SUPPORT_TRYOUT_WATCH_FACE);
        String str = r;
        HwLog.i(str, "isSystemParamsSupportTryOut -- supportTryOutJson:" + strB);
        if (TextUtils.isEmpty(strB)) {
            HwLog.i(str, "isSystemParamsSupportTryOut -- supportTryOutJson is empty.Return true");
            return true;
        }
        SystemParamsSupportTryOutBean systemParamsSupportTryOutBean = (SystemParamsSupportTryOutBean) GsonHelper.fromJson(strB, SystemParamsSupportTryOutBean.class);
        if (systemParamsSupportTryOutBean == null) {
            HwLog.i(str, "isSystemParamsSupportTryOut --json parse error.supportTryOutBean is null.Return true");
            return true;
        }
        if (Environment.sIsAarInTheme) {
            String supportTryoutThemeAppCode = systemParamsSupportTryOutBean.getSupportTryoutThemeAppCode();
            if (TextUtils.isEmpty(supportTryoutThemeAppCode)) {
                HwLog.i(str, "isSystemParamsSupportTryOut -- Is aar in theme.supportTryoutThemeAppCode is empty.Return true");
                return true;
            }
            int iA = r2.a(supportTryoutThemeAppCode, 0);
            int versionCode = CommonUtils.getVersionCode();
            z = versionCode >= iA;
            HwLog.i(str, "isSystemParamsSupportTryOut -- Is aar in theme.supportCode:" + iA + "  appCode:" + versionCode + "  isSupport:" + z);
            return z;
        }
        String supportTryoutHealthAppCode = systemParamsSupportTryOutBean.getSupportTryoutHealthAppCode();
        if (TextUtils.isEmpty(supportTryoutHealthAppCode)) {
            HwLog.i(str, "isSystemParamsSupportTryOut -- supportTryoutHealthAppCode is empty.Return true");
            return true;
        }
        int iA2 = r2.a(supportTryoutHealthAppCode, 0);
        int versionCode2 = CommonUtils.getVersionCode();
        z = versionCode2 >= iA2;
        HwLog.i(str, "isSystemParamsSupportTryOut -- supportCode:" + iA2 + "  appCode:" + versionCode2 + "  isSupport:" + z);
        return z;
    }

    public String j() {
        return HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getTryOutWatchFacePackageName();
    }

    public final void b(int i, Object obj) {
        String str = r;
        HwLog.i(str, "dealSendToDeviceTryOutPaidResult enter");
        String strA = a(obj);
        String strB = b(obj);
        if (this.f30241a == null) {
            HwLog.e(str, "dealSendToDeviceTryOutPaidResult -- mOperateCallback is null");
        } else {
            a(i, obj, strA, strB);
        }
    }

    public final boolean l() {
        try {
            String strA = f5.a();
            if (TextUtils.isEmpty(strA)) {
                HwLog.i(r, "isMyWatchApply myWatchApplyStr is empty");
                return false;
            }
            String str = r;
            HwLog.i(str, "isMyWatchApply myWatchApplyStr is:" + strA);
            if (System.currentTimeMillis() - Long.valueOf(strA).longValue() < 300000) {
                HwLog.i(str, "isMyWatchApply is true");
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            HwLog.e(r, "isMyWatchApply NumberFormatException " + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.e(r, "isMyWatchApply Exception " + HwLog.printException(e2));
        }
    }

    public final void a(TryoutBean tryoutBean) {
        if (ArrayUtils.isEmpty(this.f30243c)) {
            HwLog.i(r, "cancelAnotherWatchFaceInstall -- mWaitTryOutWatchFaceIdList is empty");
            return;
        }
        HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.getInstance(Environment.getApplicationContext());
        for (String str : this.f30243c) {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                if (TextUtils.equals(tryoutBean.getTryOutHiTopId(), str2) && TextUtils.equals(tryoutBean.getVersion(), str3)) {
                    HwLog.i(r, "cancelAnotherWatchFaceInstall -- waitTryOutHiTopId equals current hitopId.Not cancel");
                } else {
                    HwLog.i(r, "cancelAnotherWatchFaceInstall -- cancel install waitTryOutHiTopId:" + str2 + "  waitTryOutVersion:" + str3);
                    hwWatchFaceManager.cancelInstallWatchFace(str2, str3);
                }
            }
        }
    }

    public HashMap f(String str, String str2) {
        String str3 = str + "_" + str2;
        HwLog.i(r, "getTryOutDownUrl -- hitopIdKey :" + str3);
        return (HashMap) this.g.get(str3);
    }

    public final String b(Object obj) {
        if (obj instanceof String) {
            String[] strArrSplit = ((String) obj).split("_");
            if (strArrSplit.length >= 2) {
                return strArrSplit[1];
            }
            return "";
        }
        return "";
    }

    public void e(String str, String str2) {
        String str3 = r;
        HwLog.i(str3, "dealTryoutWatchPaidSuccess -- enter.hitopId:" + str);
        if (m(str, str2)) {
            HwLog.i(str3, "dealTryoutWatchPaidSuccess -- isWaitTryOutWatchFaceId , clearWaitTryOutWatchFaceId");
            d(str, str2);
        }
        if (!l(str, str2)) {
            HwLog.i(str3, "dealTryoutWatchPaidSuccess -- not try out watch face");
            return;
        }
        b();
        a();
        a("1", str, "1");
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyTryOutWatchFacePaid(str, str2, this.q);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void n() {
        HwLog.i(r, "dealTryoutWatchPayVipSuccess enter");
        e5.c().b(new e5.c() { // from class: com.huawei.watchface.j2$$ExternalSyntheticLambda1
            @Override // com.huawei.watchface.e5.c
            public final void onMembershipInfoUpdated(QuerySubInfoDetailResp querySubInfoDetailResp) {
                this.f$0.a(querySubInfoDetailResp);
            }
        });
    }

    public void c(String str, String str2) {
        String str3 = str + "_" + str2;
        if (!this.f30243c.contains(str3)) {
            HwLog.i(r, "clearWaitTryOutIdFromNormalDownload -- hitop id not wait try out id. hitopIdValue:" + str3);
            return;
        }
        d(str, str2);
    }

    public final void k() {
        HwLog.i(r, "dealDeviceReportResult -- CALLBACK_WATCH_FACE_START_TRY_OUT.");
        m4.a(false);
    }

    public void a(TryoutBean tryoutBean, String str, boolean z) {
        a(tryoutBean, str, z, true);
    }

    public void a(TryoutBean tryoutBean, String str, boolean z, boolean z2) {
        if (tryoutBean == null) {
            HwLog.e(r, "cancelTryOutWatchFace -- tryoutBean is null");
            return;
        }
        if (!l(tryoutBean.getTryOutHiTopId(), tryoutBean.getVersion())) {
            HwLog.w(r, "cancelTryOutWatchFace -- not is try out hitopId");
            return;
        }
        HwLog.i(r, "cancelTryOutWatchFace -- isFromDevice:" + z + "  pullType:" + str);
        if (!z) {
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyTryoutWatchFaceFinish(tryoutBean.getTryOutHiTopId(), tryoutBean.getVersion(), this.l);
        }
        b();
        a();
        a("1", tryoutBean.getTryOutHiTopId(), str);
        if (z2) {
            j(tryoutBean.getDetailUrl(), str);
        }
    }

    public void a(String str, String str2) {
        if (!l(str, str2)) {
            HwLog.w(r, "cancelTryOutWatchFaceByH5 -- not is try out hitopId");
            return;
        }
        HwLog.i(r, "cancelTryOutWatchFaceByH5 -- enter");
        this.i = str;
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyTryoutWatchFaceFinish(str, str2, this.l);
    }

    public final /* synthetic */ void a(QuerySubInfoDetailResp querySubInfoDetailResp) {
        if (!e5.c().g()) {
            String str = r;
            HwLog.i(str, "dealTryoutWatchPayVipSuccess isVipMembership false");
            int i = this.o;
            if (i < 3) {
                this.o = i + 1;
                HwLog.i(str, "dealTryoutWatchPayVipSuccess retrying retryCount: " + this.o);
                BackgroundTaskUtils.a(new Runnable() { // from class: com.huawei.watchface.j2$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.n();
                    }
                }, 1000);
                return;
            }
            HwLog.i(str, "retryCount is MAX_RETRIES.");
            k2.a().a(e5.c().g(), (IBaseResponseCallback) null);
            return;
        }
        this.o = 0;
        k2.a().a(e5.c().g(), (IBaseResponseCallback) null);
        if (TextUtils.isEmpty(this.d)) {
            HwLog.i(r, "dealTryoutWatchPayVipSuccess mTryOutWatchFaceId is null");
            return;
        }
        if (!TextUtils.equals(this.e, String.valueOf(2)) && !TextUtils.equals(this.e, String.valueOf(4))) {
            HwLog.i(r, "dealTryoutWatchPayVipSuccess mTryOutWatchFaceId is not vip free");
            return;
        }
        String[] strArrSplit = this.d.split("_");
        if (strArrSplit != null && strArrSplit.length >= 2) {
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            TryoutBean tryoutBean = new TryoutBean();
            tryoutBean.setTryOutHiTopId(str2);
            tryoutBean.setVersion(str3);
            a(tryoutBean, "4", false, false);
            return;
        }
        HwLog.i(r, "dealTryoutWatchPayVipSuccess mTryOutWatchFaceId splits is null");
    }

    public void a() {
        HwLog.i(r, "cancelTryoutService");
        Environment.getApplicationContext().stopService(new Intent(Environment.getApplicationContext(), (Class<?>) TryOutWatchFaceService.class));
        n4.b().a(100);
    }

    public final void a(String str, String str2, TryoutBean tryoutBean) {
        String str3 = str + "_" + str2;
        HwLog.i(r, "putWaitTryOutBeanToMap -- hitopIdKey :" + str3);
        this.f.put(str3, tryoutBean);
        r();
    }

    public final void a(String str, String str2, String str3, String str4) {
        String str5 = str + "_" + str2;
        HwLog.i(r, "putTryOutDownUrlToMap -- hitopIdKey :" + str5);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(WatchFaceConstant.HASHCODE, str4);
        linkedHashMap.put(RecommendConstants.DOWNLOAD_URL, str3);
        this.g.put(str5, linkedHashMap);
        r();
    }

    public void a(String str, String str2, int i) {
        if (m(str, str2)) {
            String str3 = r;
            HwLog.i(str3, "dealSendToDeviceStartTryOutResult -- enter.errorCode:" + i);
            if (105 == i) {
                return;
            }
            if (i != 103) {
                if (i != 104) {
                    return;
                }
                HwLog.i(str3, "dealSendToDeviceStartTryOutResult -- CALLBACK_TYPE_OPERATE_FAILED");
                return;
            }
            n(str, str2);
            final TryoutBean tryoutBeanI = i(str, str2);
            if (tryoutBeanI == null) {
                HwLog.w(str3, "dealSendToDeviceStartTryOutResult -- waitTryOutBean == null");
                return;
            }
            this.e = tryoutBeanI.getResourceType();
            this.h = tryoutBeanI.getDetailUrl();
            HwLog.i(str3, "dealSendToDeviceStartTryOutResult -- CALLBACK_TYPE_OPERATE_SUCCESS");
            if (TextUtils.equals(tryoutBeanI.getTryOutHiTopId(), str) && TextUtils.equals(tryoutBeanI.getVersion(), str2)) {
                a();
                BackgroundTaskUtils.postDelayedInMainThread(new Runnable() { // from class: com.huawei.watchface.j2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(tryoutBeanI);
                    }
                }, 200L);
                e4.f(h(), str + "_" + System.currentTimeMillis());
            }
            d(str, str2);
            k2.a().b(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void a(int i, Object obj, TryoutBean tryoutBean) {
        String str;
        if (obj instanceof String) {
            String[] strArrSplit = ((String) obj).split("_");
            if (strArrSplit.length >= 2) {
                str = strArrSplit[0];
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        if (i == 103) {
            String str2 = r;
            HwLog.i(str2, "dealSendToDeviceFinishTryOutResult success objectData: " + obj);
            b();
            a();
            a("1", str, "1");
            if (tryoutBean != null) {
                HwLog.i(str2, "dealSendToDeviceFinishTryOutResult CALLBACK_TYPE_OPERATE_SUCCESS.installTryoutWatchFace");
                c(tryoutBean);
                return;
            }
            return;
        }
        String str3 = r;
        HwLog.i(str3, "dealSendToDeviceFinishTryOutResult failed objectData: " + obj + "   errorCode:" + i);
        a("0", str, "1");
        if (tryoutBean != null) {
            HwLog.i(str3, "dealSendToDeviceFinishTryOutResult failed.Install next try out watch face.");
            if (!TextUtils.isEmpty(this.d)) {
                b();
                a();
            }
            c(tryoutBean);
        }
    }

    public final String a(Object obj) {
        if (obj instanceof String) {
            String[] strArrSplit = ((String) obj).split("_");
            if (strArrSplit.length >= 2) {
                return strArrSplit[0];
            }
            return "";
        }
        return "";
    }

    public final void a(int i, Object obj, String str, String str2) {
        if (i == 103) {
            HwLog.i(r, "dealSendToDeviceTryOutPaidResult CALLBACK_TYPE_OPERATE_SUCCESS objectData: " + obj);
            this.f30241a.transmitSetDefaultWatchFaceResult(str, str2, 1);
            k2.a().b(str, str2);
            return;
        }
        if (i == 105) {
            HwLog.i(r, "dealSendToDeviceTryOutPaidResult CALLBACK_TYPE_OPERATE_RECEIVE objectData: " + obj);
            this.f30241a.transmitSetDefaultWatchFaceResult(str, str2, 2);
            return;
        }
        HwLog.i(r, "dealSendToDeviceTryOutPaidResult errorCode：" + i + " objectData: " + obj);
        this.f30241a.transmitSetDefaultWatchFaceResult(str, str2, 2);
    }

    public void a(int i, Object obj) {
        String str = r;
        HwLog.i(str, "dealDeviceReportResult -- enter. errorCode = " + i);
        if (!(obj instanceof WatchResourcesInfo)) {
            HwLog.w(str, "dealDeviceReportResult -- objectData not instanceof WatchResourcesInfo");
            return;
        }
        WatchResourcesInfo watchResourcesInfo = (WatchResourcesInfo) obj;
        final String watchInfoId = watchResourcesInfo.getWatchInfoId();
        String watchInfoVersion = watchResourcesInfo.getWatchInfoVersion();
        if (i == 106) {
            BackgroundTaskUtils.a(new Runnable() { // from class: com.huawei.watchface.j2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(watchInfoId);
                }
            }, 100);
        } else if (i == 109) {
            k();
        } else {
            if (i != 110) {
                return;
            }
            k(watchInfoId, watchInfoVersion);
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(String str) {
        if (TextUtils.isEmpty(this.d)) {
            HwLog.i(r, "dealDeviceReportResult -- CALLBACK_CURRENT_CHANGE. mTryOutWatchFaceId is null");
            return;
        }
        String str2 = r;
        HwLog.i(str2, "dealDeviceReportResult -- CALLBACK_CURRENT_CHANGE. hitopId:" + str + "   mTryOutWatchFaceId:" + this.d);
        try {
            String[] strArrSplit = this.d.split("_");
            if (strArrSplit.length < 1) {
                HwLog.e(str2, "Invalid mTryOutWatchFaceId format");
                return;
            }
            String str3 = strArrSplit[0];
            if (TextUtils.isEmpty(str3)) {
                HwLog.i(str2, "dealDeviceReportResult -- CALLBACK_CURRENT_CHANGE. currentTryOutHiTopId is null");
            } else {
                if (TextUtils.equals(str3, str)) {
                    HwLog.i(str2, "dealDeviceReportResult -- CALLBACK_CURRENT_CHANGE. mTryOutWatchFaceId is current hitopId");
                    return;
                }
                b();
                a();
                a("1", str3, "2");
            }
        } catch (Exception e) {
            HwLog.e(r, "handleCurrentChange splitting mTryOutWatchFaceId Exception: " + HwLog.printException(e));
        }
    }

    public void a(boolean z) {
        if (!z) {
            HwLog.i(r, "dealDeviceChange -- isDeviceChange == false");
        } else {
            b();
            a();
        }
    }
}
