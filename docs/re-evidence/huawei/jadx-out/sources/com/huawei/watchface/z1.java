package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.DownloadQueryBean;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceDownloadQueryFreeResp;
import com.huawei.watchface.mvp.model.datatype.WatchFaceDownloadQueryResp;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.thread.HitopReqDownloadQueryThread;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.huawei.wisecloud.drmclient.exception.HwDrmException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class z1 {
    public static z1 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OperateWatchFaceCallback f30685a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f30687c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HwWatchFaceManager f30686b = HwWatchFaceManager.getInstance(Environment.getApplicationContext());

    /* JADX INFO: loaded from: classes45.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadQueryBean f30688a;

        /* JADX INFO: renamed from: com.huawei.watchface.z1$a$a, reason: collision with other inner class name */
        public class RunnableC0299a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InstallWatchFaceBean f30690a;

            public RunnableC0299a(InstallWatchFaceBean installWatchFaceBean) {
                this.f30690a = installWatchFaceBean;
            }

            @Override // java.lang.Runnable
            public void run() {
                HwLog.i("HwDownloadUrlManager", "downloadInstallWatchFace -- start install WatchFace");
                z1.this.f30686b.installWatchFace(this.f30690a);
            }
        }

        public a(DownloadQueryBean downloadQueryBean) {
            this.f30688a = downloadQueryBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            InstallWatchFaceBean installWatchFaceBean = new InstallWatchFaceBean();
            installWatchFaceBean.setInstallationType(2);
            int iA = z1.this.a(this.f30688a, installWatchFaceBean);
            if (iA == 1) {
                k2.a().a(this.f30688a.getHitopId(), this.f30688a.getVersion(), 0, installWatchFaceBean.isVipFreeWatchFace());
                BackgroundTaskUtils.postInMainThread(new RunnableC0299a(installWatchFaceBean));
            } else {
                HwLog.e("HwDownloadUrlManager", "downloadInstallWatchFace -- return a non-zero value, resultCode==" + iA);
                z1.this.a(installWatchFaceBean, iA);
            }
        }
    }

    public static void b() {
        synchronized (z1.class) {
            if (d != null) {
                HwLog.i("HwDownloadUrlManager", "destroyInstance() enter.");
                d = null;
            }
        }
    }

    public static z1 c() {
        if (d == null) {
            synchronized (z1.class) {
                if (d == null) {
                    d = new z1();
                }
            }
        }
        return d;
    }

    public void a() {
        b();
    }

    public void a(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.f30685a = operateWatchFaceCallback;
    }

    public String a(DownloadQueryBean downloadQueryBean) {
        HwLog.i("HwDownloadUrlManager", "downloadInstallWatchFace enter");
        if (downloadQueryBean == null) {
            return "1";
        }
        BackgroundTaskUtils.submit(new a(downloadQueryBean));
        return "0";
    }

    public HashMap b(String str, String str2) {
        String str3 = str + "_" + str2;
        HwLog.i("HwDownloadUrlManager", "getInstllDownUrlHashcode -- hitopIdKey :" + str3);
        return (HashMap) this.f30687c.get(str3);
    }

    public final void a(InstallWatchFaceBean installWatchFaceBean, int i) {
        HwWatchFaceManager hwWatchFaceManager = this.f30686b;
        if (hwWatchFaceManager == null) {
            return;
        }
        f analyticsDownloadEvent = hwWatchFaceManager.getAnalyticsDownloadEvent(installWatchFaceBean);
        analyticsDownloadEvent.f(installWatchFaceBean.getMsg());
        analyticsDownloadEvent.a(String.valueOf(i));
        analyticsDownloadEvent.j();
    }

    public int a(DownloadQueryBean downloadQueryBean, InstallWatchFaceBean installWatchFaceBean) {
        int iA;
        String productId = downloadQueryBean.getProductId();
        String hitopId = downloadQueryBean.getHitopId();
        String dialType = downloadQueryBean.getDialType();
        String version = downloadQueryBean.getVersion();
        boolean zIsVipFreeWatchFace = downloadQueryBean.isVipFreeWatchFace();
        int type = downloadQueryBean.getType();
        if ("1".equals(dialType)) {
            iA = a(productId, hitopId, type, installWatchFaceBean);
        } else if ("2".equals(dialType)) {
            iA = a(productId, hitopId, version, type, installWatchFaceBean, zIsVipFreeWatchFace);
        } else {
            HwLog.e("HwDownloadUrlManager", "requestPaidAndFreeResourceInfo -- dialType==" + dialType);
            iA = 0;
        }
        a(iA, hitopId);
        String fileUrl = installWatchFaceBean.getFileUrl();
        String hashCode = installWatchFaceBean.getHashCode();
        installWatchFaceBean.setResourceType(dialType);
        installWatchFaceBean.setWatchFaceHiTopId(hitopId);
        installWatchFaceBean.setVersion(version);
        installWatchFaceBean.setFileSize(downloadQueryBean.getFileSize());
        installWatchFaceBean.setWatchScreen(downloadQueryBean.getScreen());
        installWatchFaceBean.setProductId(productId);
        installWatchFaceBean.setUpdate(downloadQueryBean.isUpdate());
        installWatchFaceBean.setZip(downloadQueryBean.isZip());
        installWatchFaceBean.setOneClick(downloadQueryBean.isOneClick());
        installWatchFaceBean.setTitle(downloadQueryBean.getTitle());
        installWatchFaceBean.setCnTitle(downloadQueryBean.getCnTitle());
        if (iA == 1) {
            a(hitopId, version, fileUrl, hashCode);
        }
        return iA;
    }

    public final int a(String str, String str2, String str3, int i, InstallWatchFaceBean installWatchFaceBean, boolean z) {
        HwLog.i("HwDownloadUrlManager", "requestPaidUrlInfo enter");
        if (!CommonUtils.C()) {
            HwLog.e("HwDownloadUrlManager", "requestPaidUrlInfo -- productId is empty or net is error");
            return -5;
        }
        if (installWatchFaceBean == null) {
            HwLog.e("HwDownloadUrlManager", "requestPaidUrlInfo -- installBean is null");
            return -4;
        }
        HitopReqDownloadQueryThread hitopReqDownloadQueryThread = new HitopReqDownloadQueryThread(str, str2, i);
        WatchFaceDownloadQueryResp watchFaceDownloadQueryRespB = hitopReqDownloadQueryThread.b(hitopReqDownloadQueryThread.e());
        Integer numA = a(watchFaceDownloadQueryRespB);
        if (numA != null) {
            return numA.intValue();
        }
        try {
            k0.c(Environment.getApplicationContext(), watchFaceDownloadQueryRespB.getLicenseResp());
            installWatchFaceBean.setFileUrl(watchFaceDownloadQueryRespB.getDownUrl());
            installWatchFaceBean.setHashCode(watchFaceDownloadQueryRespB.getHashCode());
            if (!z || !CommonUtils.A()) {
                return 1;
            }
            a(str2, str3, installWatchFaceBean, watchFaceDownloadQueryRespB);
            return 1;
        } catch (HwDrmException e) {
            HwLog.e("HwDownloadUrlManager", "requestPaidUrlInfo -- HwDrmException：" + HwLog.printException((Exception) e));
            installWatchFaceBean.setMsg(e.getMessage());
            return -6;
        }
    }

    public final void a(String str, String str2, InstallWatchFaceBean installWatchFaceBean, WatchFaceDownloadQueryResp watchFaceDownloadQueryResp) {
        String isOrdered = watchFaceDownloadQueryResp.getIsOrdered();
        if (!TextUtils.isEmpty(isOrdered) && isOrdered.equals(l0.NOT_ORDERED.getValue())) {
            WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
            watchResourcesInfo.setWatchInfoId(str);
            watchResourcesInfo.setWatchInfoVersion(str2);
            watchResourcesInfo.setVipFreeWatchFace(true);
            this.f30686b.addVipFreeWatchFace(str, watchResourcesInfo);
        }
        l0 l0Var = l0.NOT_ORDERED;
        installWatchFaceBean.setVipFreeWatchFace(isOrdered.equals(l0Var.getValue()));
        HwLog.i("HwDownloadUrlManager", "requestPaidUrlInfo -- is paid vip free: " + installWatchFaceBean.isVipFreeWatchFace());
        if (TextUtils.isEmpty(isOrdered) || !isOrdered.equals(l0Var.getValue())) {
            return;
        }
        g5.c().b(str, str2);
    }

    public final Integer a(WatchFaceDownloadQueryResp watchFaceDownloadQueryResp) {
        if (watchFaceDownloadQueryResp == null) {
            HwLog.e("HwDownloadUrlManager", "requestPaidUrlInfo -- watchFaceDownloadQueryResp is null");
            return -3;
        }
        Integer resultcode = watchFaceDownloadQueryResp.getResultcode();
        int iIntValue = resultcode.intValue();
        HwLog.e("HwDownloadUrlManager", "requestPaidUrlInfo -- watchFaceDownloadQueryResp resultCode==" + iIntValue);
        if (WatchFaceHttpUtil.a(iIntValue)) {
            return resultcode;
        }
        if (iIntValue != 0) {
            HwLog.e("HwDownloadUrlManager", "requestPaidUrlInfo -- watchFaceDownloadQueryResp is not success, ret==" + iIntValue);
            return -1;
        }
        if (!TextUtils.isEmpty(watchFaceDownloadQueryResp.getDownUrl())) {
            return null;
        }
        HwLog.e("HwDownloadUrlManager", "requestPaidUrlInfo -- downUrl is empty");
        return -2;
    }

    public final int a(String str, String str2, int i, InstallWatchFaceBean installWatchFaceBean) {
        HwLog.i("HwDownloadUrlManager", "requestFreeUrlInfo enter");
        if (!CommonUtils.C()) {
            HwLog.e("HwDownloadUrlManager", "requestFreeUrlInfo -- productId is empty or net is error");
            return -5;
        }
        if (installWatchFaceBean == null) {
            HwLog.e("HwDownloadUrlManager", "requestFreeUrlInfo -- installBean is null");
            return -4;
        }
        s1 s1Var = new s1(str, str2, i);
        WatchFaceDownloadQueryFreeResp watchFaceDownloadQueryFreeRespB = s1Var.b(s1Var.e());
        Integer numA = a(watchFaceDownloadQueryFreeRespB);
        if (numA != null) {
            return numA.intValue();
        }
        try {
            k0.c(Environment.getApplicationContext(), watchFaceDownloadQueryFreeRespB.getLicenseResp());
            installWatchFaceBean.setFileUrl(watchFaceDownloadQueryFreeRespB.getDownUrl());
            installWatchFaceBean.setHashCode(watchFaceDownloadQueryFreeRespB.getHashCode());
            return 1;
        } catch (HwDrmException e) {
            HwLog.e("HwDownloadUrlManager", "requestFreeUrlInfo -- HwDrmException：" + HwLog.printException((Exception) e));
            installWatchFaceBean.setMsg(e.getMessage());
            return -6;
        }
    }

    public final Integer a(WatchFaceDownloadQueryFreeResp watchFaceDownloadQueryFreeResp) {
        if (watchFaceDownloadQueryFreeResp == null) {
            HwLog.e("HwDownloadUrlManager", "requestFreeUrlInfo -- watchFaceDownloadQueryResp is null");
            return -3;
        }
        Integer resultcode = watchFaceDownloadQueryFreeResp.getResultcode();
        int iIntValue = resultcode.intValue();
        if (WatchFaceHttpUtil.a(iIntValue)) {
            return resultcode;
        }
        if (iIntValue != 0) {
            HwLog.e("HwDownloadUrlManager", "requestFreeUrlInfo -- WatchFaceDownloadQueryFreeResp is not success, ret==" + iIntValue);
            return -1;
        }
        if (!TextUtils.isEmpty(watchFaceDownloadQueryFreeResp.getDownUrl())) {
            return null;
        }
        HwLog.e("HwDownloadUrlManager", "requestFreeUrlInfo -- WatchFaceDownloadQueryFreeResp downUrl is empty");
        return -2;
    }

    public final void a(String str, String str2, String str3, String str4) {
        String str5 = str + "_" + str2;
        HwLog.i("HwDownloadUrlManager", "putDownUrlHashcodeToMap -- hitopIdKey :" + str5);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(WatchFaceConstant.HASHCODE, str4);
        linkedHashMap.put(RecommendConstants.DOWNLOAD_URL, str3);
        this.f30687c.put(str5, linkedHashMap);
    }

    public void a(String str, String str2) {
        HwWatchFaceManager hwWatchFaceManager;
        HwLog.i("HwDownloadUrlManager", "--enter clearCacheWatchFaceInfo--");
        if (this.f30687c.containsKey(str + "_" + str2) || (hwWatchFaceManager = this.f30686b) == null || hwWatchFaceManager.isVipFreeWatchFaceContain(str)) {
            String str3 = str + "_" + str2;
            HwLog.i("HwDownloadUrlManager", "enter clearCacheWatchFaceInfo mDownUrlHashCodeMap--:" + str3);
            this.f30687c.remove(str3);
        }
    }

    public final void a(int i, String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30685a;
        if (operateWatchFaceCallback == null) {
            return;
        }
        operateWatchFaceCallback.transmitDownloadUrl(i, str);
    }
}
