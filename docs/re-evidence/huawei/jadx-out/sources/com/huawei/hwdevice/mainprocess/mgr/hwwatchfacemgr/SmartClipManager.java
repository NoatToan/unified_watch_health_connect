package com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.baseapi.hiaiengine.HiAiLoadSmartPluginListener;
import com.huawei.health.baseapi.hiaiengine.HiAiSmartClipApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.constant.TransferBusinessType;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.WatchFaceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.AlbumWatchFaceManger;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.DiyThrowable;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransferProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import defpackage.ddr;
import defpackage.ecu;
import defpackage.lsy;
import defpackage.lug;
import defpackage.lvb;
import defpackage.mbz;
import defpackage.mcb;
import defpackage.mcj;
import defpackage.mcn;
import defpackage.mge;
import defpackage.mgg;
import defpackage.mhp;
import defpackage.mjf;
import defpackage.nio;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SmartClipManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SmartClipManager f17374a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f17375c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartClipCallback f17376b;
    private mcj g;
    private Context h;
    private int i;
    private SmartLoadPluginCallback k;
    private boolean l;
    private int p;
    private ClipTransferCallback q;
    private int r;
    private int s;
    private int t;
    private mbz v;
    private Timer m = null;
    private final ArrayList<String> f = new ArrayList<>(16);
    private boolean o = false;
    private volatile boolean n = false;
    private BroadcastReceiver j = new BroadcastReceiver() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("SmartClipManager", "SmartClipManager onReceive enter");
            if (context == null || intent == null) {
                LogUtil.j("SmartClipManager", "context or intent is null");
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    LogUtil.j("SmartClipManager", "deviceInfo is null");
                    return;
                }
                if (deviceInfo.getRelationship() != null && "followed_relationship".equals(deviceInfo.getRelationship())) {
                    LogUtil.a("SmartClipManager", "This device does not have the correspond capability.");
                    return;
                }
                LogUtil.a("SmartClipManager", "mConnectStateChangedReceiver() status = ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                if (deviceInfo.getDeviceConnectState() == 3) {
                    if (!SmartClipManager.this.n || SmartClipManager.this.f17376b == null) {
                        return;
                    }
                    LogUtil.a("SmartClipManager", "onConnectStateChange disconnect");
                    SmartClipManager.this.f17376b.onClipResult(-2, null);
                    SmartClipManager.this.n = false;
                    return;
                }
                LogUtil.j("SmartClipManager", "onConnectStateChange state:", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            }
        }
    };
    private IAppTransferFileResultAIDLCallback.Stub d = new IAppTransferFileResultAIDLCallback.Stub() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.4
        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) {
            if (!b(str)) {
                SmartClipManager.this.i = i;
                LogUtil.a("SmartClipManager", "onFileTransferState percentage = ", Integer.valueOf(i), "completeCount = ", Integer.valueOf(SmartClipManager.this.s), ", totalCount = ", Integer.valueOf(SmartClipManager.this.t));
                SmartClipManager.this.t();
                return;
            }
            LogUtil.j("SmartClipManager", "onFileTransferState filterResult");
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) {
            if (!b(str)) {
                SmartClipManager.this.a(i);
            } else {
                LogUtil.j("SmartClipManager", "onUpgradeFailed filterResult");
            }
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) {
            if (b(str)) {
                LogUtil.j("SmartClipManager", "onFileRespond filterResult");
                return;
            }
            if (i != 1) {
                SmartClipManager.this.a(i);
                return;
            }
            SmartClipManager.k(SmartClipManager.this);
            SmartClipManager.q(SmartClipManager.this);
            SmartClipManager.this.i = 0;
            LogUtil.a("SmartClipManager", "one file transfer successful: ", Integer.valueOf(i), "completedCount = ", Integer.valueOf(SmartClipManager.this.s), ", totalCounts = ", Integer.valueOf(SmartClipManager.this.t));
            SmartClipManager.this.t();
        }

        private boolean b(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (SmartClipManager.this.f == null || SmartClipManager.this.f.isEmpty()) {
                    LogUtil.j("SmartClipManager", "filterResult mClipResultPaths is null or is empty");
                    return true;
                }
                try {
                    String string = new JSONObject(str).getString(ContentResource.FILE_NAME);
                    Iterator it = SmartClipManager.this.f.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).endsWith(string)) {
                            LogUtil.a("SmartClipManager", "filterResult is belongs to mClipResultPath");
                            return false;
                        }
                    }
                    return true;
                } catch (JSONException unused) {
                    LogUtil.e("SmartClipManager", "filterResult JSONException");
                    return true;
                }
            }
            LogUtil.j("SmartClipManager", "filterResult des is empty");
            return true;
        }
    };

    /* JADX INFO: loaded from: classes10.dex */
    public interface ClipTransferCallback {
        void onTransferProgress(int i, int i2, int i3);

        void onTransferResult(int i, int i2);
    }

    /* JADX INFO: loaded from: classes10.dex */
    public interface SmartClipCallback {
        void onClipResult(int i, List<String> list);

        void onOneImageClipped(int i, int i2);
    }

    /* JADX INFO: loaded from: classes10.dex */
    public interface SmartLoadPluginCallback {
        void onLoadPluginProgress(int i);

        void onLoadPluginResult(int i);
    }

    static /* synthetic */ int k(SmartClipManager smartClipManager) {
        int i = smartClipManager.s;
        smartClipManager.s = i + 1;
        return i;
    }

    static /* synthetic */ int q(SmartClipManager smartClipManager) {
        int i = smartClipManager.p;
        smartClipManager.p = i + 1;
        return i;
    }

    private SmartClipManager(Context context) {
        this.h = context;
        this.v = mbz.a(context);
        lug.d(new IBaseResponseCallback() { // from class: mcc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f41396b.e(i, obj);
            }
        });
    }

    public /* synthetic */ void e(int i, Object obj) {
        if (i == -1) {
            b(false);
            this.q = null;
            this.f17376b = null;
            this.n = false;
            lvb.e().c(40);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("SmartClipManager", "TransferImagesFromDeviceFailed : ", Integer.valueOf(i));
        int i2 = this.s + 1;
        this.s = i2;
        this.r++;
        if (i == 141000 || i == 141001) {
            p();
            return;
        }
        this.i = 0;
        LogUtil.a("SmartClipManager", "completeCount = ", Integer.valueOf(i2), ", totalCount = ", Integer.valueOf(this.t));
        t();
    }

    public static SmartClipManager e(Context context) {
        SmartClipManager smartClipManager;
        synchronized (e) {
            if (f17374a == null && context != null) {
                f17374a = new SmartClipManager(context);
            }
            smartClipManager = f17374a;
        }
        return smartClipManager;
    }

    public boolean i() {
        HiAiSmartClipApi hiAiSmartClip = ddr.e().getHiAiSmartClip();
        if (hiAiSmartClip == null) {
            return false;
        }
        return hiAiSmartClip.isSupportSmartClip();
    }

    public boolean e() {
        HiAiSmartClipApi hiAiSmartClip = ddr.e().getHiAiSmartClip();
        if (hiAiSmartClip == null) {
            LogUtil.j("SmartClipManager", "hiAiSmartClip is null.");
            return false;
        }
        int smartClipAbility = hiAiSmartClip.getSmartClipAbility(this.h);
        LogUtil.a("SmartClipManager", "SmartClipAbility = ", Integer.valueOf(smartClipAbility));
        return smartClipAbility == 0;
    }

    public void h() {
        LogUtil.a("SmartClipManager", "enter saveDownloadFlag");
        if (CommonUtil.bg() && CommonUtil.at()) {
            mge.c("bumpPass");
        }
    }

    public boolean c() {
        return this.n;
    }

    public static boolean b() {
        return f17375c;
    }

    public static void b(boolean z) {
        f17375c = z;
    }

    public void e(SmartLoadPluginCallback smartLoadPluginCallback) {
        final float watchFaceWidth;
        if (!i()) {
            LogUtil.j("SmartClipManager", "CallStartLoadPlugin, but not support");
            return;
        }
        if (e()) {
            LogUtil.a("SmartClipManager", "SmartPlugin already exist, don't need download");
            if (smartLoadPluginCallback != null) {
                smartLoadPluginCallback.onLoadPluginResult(0);
                return;
            }
        }
        this.k = smartLoadPluginCallback;
        WatchFaceInfo watchFaceInfoB = this.v.b();
        if (watchFaceInfoB == null || watchFaceInfoB.getWatchFaceWidth() <= 0 || watchFaceInfoB.getWatchFaceHeight() <= 0) {
            watchFaceWidth = 1.0f;
        } else {
            LogUtil.a("SmartClipManager", "GetWatchFaceSizeFromLocal");
            watchFaceWidth = watchFaceInfoB.getWatchFaceWidth() / watchFaceInfoB.getWatchFaceHeight();
        }
        LogUtil.a("SmartClipManager", "CallLoadPlugin...");
        if (!this.o) {
            HiAiSmartClipApi hiAiSmartClip = ddr.e().getHiAiSmartClip();
            if (hiAiSmartClip != null) {
                hiAiSmartClip.init(BaseApplication.getContext());
            }
            new Handler().postDelayed(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.3
                @Override // java.lang.Runnable
                public void run() {
                    lsy.a(SmartClipManager.this.new b(watchFaceWidth));
                }
            }, 500L);
            return;
        }
        LogUtil.j("SmartClipManager", "Already in downloading process");
    }

    public void c(List<String> list, boolean z, boolean z2, SmartClipCallback smartClipCallback) {
        if (list == null) {
            ReleaseLogUtil.e("R_SmartClipManager", "CallSmartClip sourcePath is null");
            if (smartClipCallback != null) {
                smartClipCallback.onClipResult(-1, null);
                return;
            }
            return;
        }
        LogUtil.a("SmartClipManager", "CallSmartClip : anyway = ", Boolean.valueOf(z2), "Receive smart clip request, paths : ", list.toString());
        if (!i() && !z2) {
            ReleaseLogUtil.d("R_SmartClipManager", "PhoneNotSupportSmartClip");
            if (smartClipCallback != null) {
                smartClipCallback.onClipResult(-2, null);
                return;
            }
            return;
        }
        if (this.n) {
            ReleaseLogUtil.d("R_SmartClipManager", "SmartClip task already in process");
            if (smartClipCallback != null) {
                smartClipCallback.onClipResult(-1, null);
                return;
            }
            return;
        }
        if (!e()) {
            ReleaseLogUtil.d("R_SmartClipManager", "SmartClipPlugin not prepared");
        }
        ReleaseLogUtil.d("R_SmartClipManager", "ClipAnyway, begin");
        this.n = true;
        BroadcastManagerUtil.c(this.h, this.j, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
        LogUtil.a("SmartClipManager", "smartClip registerReceiver mConnectStateChangedReceiver");
        this.f17376b = smartClipCallback;
        this.l = z2;
        mcj mcjVar = new mcj();
        this.g = mcjVar;
        mcjVar.c(list);
        this.g.a(z);
        f();
    }

    public void c(ArrayList<String> arrayList, ClipTransferCallback clipTransferCallback) throws Throwable {
        ReleaseLogUtil.d("R_SmartClipManager", "Call transferClipResultToDevice");
        if (arrayList == null || arrayList.size() == 0) {
            ReleaseLogUtil.e("R_SmartClipManager", "Call transfer paths is null");
            this.n = false;
            if (clipTransferCallback != null) {
                clipTransferCallback.onTransferResult(-1, 0);
                return;
            }
            return;
        }
        if (!l()) {
            ReleaseLogUtil.d("R_SmartClipManager", "Device disconnect, can not transfer");
            this.n = false;
            u();
            LogUtil.a("SmartClipManager", "transferClipResultToDevice unregisterReceiver mConnectStateChangedReceiver");
            if (clipTransferCallback != null) {
                clipTransferCallback.onTransferResult(-1, arrayList.size());
                return;
            }
            return;
        }
        if (this.n) {
            ReleaseLogUtil.d("R_SmartClipManager", "Already in saving progress!");
            return;
        }
        this.n = true;
        this.q = clipTransferCallback;
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (String str : arrayList) {
            File file = new File(str);
            if (file.exists() && !file.isDirectory()) {
                arrayList2.add(file.getName());
                arrayList3.add(str);
            } else {
                LogUtil.a("SmartClipManager", "TransferFileNotFound : " + str);
            }
        }
        c(arrayList2, arrayList3, arrayList);
    }

    private void c(ArrayList<String> arrayList, List<String> list, ArrayList<String> arrayList2) throws Throwable {
        mcb mcbVar = new mcb();
        mcbVar.c(arrayList);
        mcbVar.b(list);
        mcbVar.e(0);
        mcbVar.d(0);
        mcbVar.c(arrayList.size());
        int iC = mbz.a(BaseApplication.getContext()).c();
        int iD = mbz.a(BaseApplication.getContext()).d();
        ReleaseLogUtil.d("R_SmartClipManager", "imageType : ", Integer.valueOf(iC), " , imageOption：", Integer.valueOf(iD));
        if (iC == 2) {
            if (iD == 2) {
                d(arrayList2);
            } else {
                a(arrayList2);
            }
        }
        this.t = arrayList.size();
        this.s = 0;
        this.p = 0;
        this.r = 0;
        this.i = 0;
        e(mcbVar, arrayList.size());
    }

    private void d(ArrayList<String> arrayList) {
        try {
            for (String str : arrayList) {
                if (str.lastIndexOf(".") != -1) {
                    String str2 = str.substring(0, str.lastIndexOf(".")) + WatchFaceConstant.BIN_SUFFIX;
                    LogUtil.d("SmartClipManager", "create16BitBinBackground, bin path:", str2);
                    mjf.a().e(str, str2);
                }
            }
        } catch (ConcurrentModificationException unused) {
            LogUtil.e("SmartClipManager", "create16BitBinBackground, ConcurrentModificationException");
        }
    }

    private void a(ArrayList<String> arrayList) throws Throwable {
        try {
            for (String str : arrayList) {
                if (str.lastIndexOf(".") != -1) {
                    String str2 = str.substring(0, str.lastIndexOf(".")) + WatchFaceConstant.BIN_SUFFIX;
                    LogUtil.d("SmartClipManager", "bin path:", str2);
                    mjf.a().b(str, str2);
                }
            }
        } catch (ConcurrentModificationException unused) {
            LogUtil.e("SmartClipManager", "ConcurrentModificationException");
        }
    }

    private boolean l() {
        DeviceInfo deviceInfoC = mgg.c("SmartClipManager");
        if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
            return true;
        }
        LogUtil.j("SmartClipManager", "device disconnected");
        return false;
    }

    private void e(mcb mcbVar, final int i) {
        ReleaseLogUtil.d("R_SmartClipManager", "Call savePhotoInfo");
        b(TransferFileReqType.DEVICE_REGISTRATION);
        this.v.c(mcbVar, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_SmartClipManager", "OnSaveResponse: code = ", Integer.valueOf(i2));
                if (i2 == 101) {
                    SmartClipManager.this.b(TransferFileReqType.DEVICE_UNREGISTRATION);
                    LogUtil.a("SmartClipManager", "TransferFileToDeviceSuccess");
                    SmartClipManager.this.t = i;
                    SmartClipManager smartClipManager = SmartClipManager.this;
                    smartClipManager.s = smartClipManager.t;
                    SmartClipManager.this.i = 0;
                    SmartClipManager.this.d(obj instanceof Integer ? ((Integer) obj).intValue() : 0);
                    TransferProgressResp transferProgressResp = new TransferProgressResp();
                    transferProgressResp.setResultCode(0);
                    AlbumWatchFaceManger.getInstance().onOneHopProgress(transferProgressResp, null);
                    return;
                }
                if (i2 != 111) {
                    SmartClipManager.this.b(TransferFileReqType.DEVICE_UNREGISTRATION);
                    LogUtil.a("SmartClipManager", "TransferFileToDeviceFailed");
                    SmartClipManager.this.p();
                    SmartClipManager.this.n = false;
                    SmartClipManager.this.u();
                    LogUtil.a("SmartClipManager", "savePhotoInfo unregisterReceiver mConnectStateChangedReceiver");
                    return;
                }
                LogUtil.a("SmartClipManager", "SaveToDevice, should transfer file...");
                SmartClipManager.this.b(TransferFileReqType.DEVICE_REGISTRATION);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(TransferFileReqType transferFileReqType) {
        mhp mhpVar = new mhp();
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(3);
        mhpVar.b(arrayList);
        mhpVar.e(transferFileReqType);
        lvb.e().b(TransferBusinessType.FIVE_FORTY, mhpVar, this.d);
    }

    private void f() {
        WatchFaceInfo watchFaceInfoB = this.v.b();
        boolean zE = mbz.a(BaseApplication.getContext()).e();
        if (watchFaceInfoB != null && watchFaceInfoB.getWatchFaceWidth() > 0 && watchFaceInfoB.getWatchFaceHeight() > 0 && zE) {
            LogUtil.a("SmartClipManager", "LocalHasDeviceInfo");
            this.g.c(watchFaceInfoB.getWatchFaceWidth(), watchFaceInfoB.getWatchFaceHeight());
            g();
        } else {
            ReleaseLogUtil.d("R_SmartClipManager", "GetDeviceInfoFromDeviceFirst");
            j();
            this.v.b(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("R_SmartClipManager", "OnResponseDevice code = ", Integer.valueOf(i));
                    if (SmartClipManager.this.m != null) {
                        SmartClipManager.this.m.cancel();
                        SmartClipManager.this.m = null;
                    }
                    if (i != 101) {
                        if (SmartClipManager.this.f17376b != null) {
                            LogUtil.a("SmartClipManager", "FailedToGetDeviceInfo,CallbackClipFailed");
                            SmartClipManager.this.f17376b.onClipResult(-1, null);
                        }
                        SmartClipManager.this.n = false;
                        SmartClipManager.this.u();
                        LogUtil.a("SmartClipManager", "getOutputSize unregisterReceiver mConnectStateChangedReceiver");
                        return;
                    }
                    LogUtil.a("SmartClipManager", "GetDeviceInfoFromDeviceSuccess");
                    WatchFaceInfo watchFaceInfoB2 = SmartClipManager.this.v.b();
                    SmartClipManager.this.g.c(watchFaceInfoB2.getWatchFaceWidth(), watchFaceInfoB2.getWatchFaceHeight());
                    SmartClipManager.this.g();
                }
            });
        }
    }

    private void j() {
        synchronized (this) {
            LogUtil.a("SmartClipManager", "getDeviceInfoTimeTask enter");
            Timer timer = this.m;
            if (timer != null) {
                timer.cancel();
                this.m = null;
            }
            Timer timer2 = new Timer("SmartClipManager");
            this.m = timer2;
            timer2.schedule(new TimerTask() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.10
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (SmartClipManager.this.f17376b != null) {
                        ReleaseLogUtil.d("R_SmartClipManager", "FailedToGetDeviceInfo timeout");
                        SmartClipManager.this.f17376b.onClipResult(-3, null);
                    }
                    SmartClipManager.this.n = false;
                    SmartClipManager.this.u();
                }
            }, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("SmartClipManager", "DidGetOutputSize : {", Integer.valueOf(this.g.e()), ", ", Integer.valueOf(this.g.b()), "}", "isPrepared = ", Boolean.valueOf(e()), ", clipAnyway = ", Boolean.valueOf(this.l));
        this.f.clear();
        HiAiSmartClipApi hiAiSmartClip = ddr.e().getHiAiSmartClip();
        if (hiAiSmartClip != null) {
            hiAiSmartClip.getSmartClipAbility(this.h);
        }
        r();
        if (hiAiSmartClip != null && hiAiSmartClip.isSupportSmartClip()) {
            this.v.a(1);
            s();
            return;
        }
        if (!this.l) {
            LogUtil.a("SmartClipManager", "CallbackFailed = ", Boolean.valueOf(this.f17376b != null));
            SmartClipCallback smartClipCallback = this.f17376b;
            if (smartClipCallback != null) {
                smartClipCallback.onClipResult(1, null);
            }
            this.n = false;
            u();
            LogUtil.a("SmartClipManager", "didGetOutputSize unregisterReceiver mConnectStateChangedReceiver");
            return;
        }
        this.v.a(1);
        q();
    }

    private void r() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str : this.g.j()) {
            jCurrentTimeMillis++;
            String str2 = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.ENGLISH).format(new Date(jCurrentTimeMillis)) + ".png";
            this.g.c().add(this.g.d() + str2);
            LogUtil.a("SmartClipManager", "preset for src:", str, "output:", str2);
        }
    }

    private void s() {
        ReleaseLogUtil.d("R_SmartClipManager", "Call runSmartClipTask");
        lsy.a(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.6
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                LogUtil.a("SmartClipManager", "smart ClipRunnable");
                float fE = (SmartClipManager.this.g.e() <= 0 || SmartClipManager.this.g.b() <= 0) ? 1.0f : SmartClipManager.this.g.e() / SmartClipManager.this.g.b();
                LogUtil.a("SmartClipManager", "Begin smart clip task...");
                HiAiSmartClipApi hiAiSmartClip = ddr.e().getHiAiSmartClip();
                hiAiSmartClip.prepare(SmartClipManager.this.h, fE);
                if (SmartClipManager.this.g.j() != null) {
                    for (int i = 0; i < SmartClipManager.this.g.j().size(); i++) {
                        SmartClipManager.this.c(SmartClipManager.this.g.j().get(i), SmartClipManager.this.g.c().get(i));
                        if (SmartClipManager.this.f17376b != null) {
                            SmartClipManager.this.f17376b.onOneImageClipped(SmartClipManager.this.g.j().size(), i);
                        }
                    }
                }
                SmartClipManager.this.n = false;
                SmartClipManager.this.o();
                hiAiSmartClip.release();
            }
        });
    }

    private void q() {
        ReleaseLogUtil.d("R_SmartClipManager", "runCommonClipTask");
        lsy.a(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.7
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                LogUtil.a("SmartClipManager", "common clip runnable");
                for (int i = 0; i < SmartClipManager.this.g.j().size(); i++) {
                    String str = SmartClipManager.this.g.j().get(i);
                    String str2 = SmartClipManager.this.g.c().get(i);
                    LogUtil.a("SmartClipManager", "common clip one image");
                    SmartClipManager.this.a(str, str2);
                    if (SmartClipManager.this.f17376b != null) {
                        SmartClipManager.this.f17376b.onOneImageClipped(SmartClipManager.this.g.j().size(), i);
                    }
                    LogUtil.a("SmartClipManager", "common clip one image done");
                }
                ReleaseLogUtil.d("R_SmartClipManager", "All common task clip done");
                SmartClipManager.this.n = false;
                SmartClipManager.this.u();
                LogUtil.a("SmartClipManager", "runCommonClipTask unregisterReceiver mConnectStateChangedReceiver");
                SmartClipManager.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        try {
            this.h.unregisterReceiver(this.j);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("SmartClipManager", "unregisterReceiver IllegalArgumentException");
        } catch (IllegalStateException unused2) {
            LogUtil.e("SmartClipManager", "unregisterReceiver IllegalStateException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2) throws Throwable {
        Bitmap bitmapE = mcn.e(str, (Uri) null);
        if (bitmapE == null) {
            ReleaseLogUtil.e("R_SmartClipManager", "prepared bitmap is null");
            return;
        }
        mcj mcjVar = new mcj();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        mcjVar.c(arrayList);
        mcjVar.c(this.g.d());
        mcjVar.c(this.g.e(), this.g.b());
        mcjVar.c().add(str2);
        ReleaseLogUtil.d("R_SmartClipManager", "Do smart clip");
        int[] iArr = {this.g.e(), this.g.b()};
        HiAiSmartClipApi hiAiSmartClip = ddr.e().getHiAiSmartClip();
        if (hiAiSmartClip != null) {
            Rect smartCropRect = hiAiSmartClip.getSmartCropRect(bitmapE, iArr);
            LogUtil.a("SmartClipManager", "getSmart box : {", Integer.valueOf(smartCropRect.left), ", ", Integer.valueOf(smartCropRect.top), ", ", Integer.valueOf(smartCropRect.right), ", ", Integer.valueOf(smartCropRect.bottom), "}");
            mcjVar.c(smartCropRect);
        }
        mcn.e(bitmapE, mcjVar);
        ReleaseLogUtil.d("R_SmartClipManager", "Clip one image done");
        if (mcjVar.c().size() > 0) {
            synchronized (e) {
                LogUtil.a("SmartClipManager", "AddClipped path to Result : ", mcjVar.c().get(0));
                d(mcjVar.c().get(0));
                this.f.add(mcjVar.c().get(0));
            }
        }
    }

    private void d(String str) {
        File file = new File(m() + str.substring(str.lastIndexOf("/") + 1));
        LogUtil.a("SmartClipManager", "transferFilePath is, ", file);
        try {
            FileUtils.e(new File(str), file);
        } catch (IOException e2) {
            ReleaseLogUtil.a("R_SmartClipManager", "copyOneHopImageToTransferDir copy file IOException:", ExceptionUtils.c(e2));
        }
    }

    private String m() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "R_SmartClipManager");
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_SmartClipManager", "getSourceFilePath currentDevice is null");
            return "";
        }
        String strE = nio.e(deviceInfo.getDeviceIdentify());
        String strReplaceAll = strE.replaceAll("[^a-zA-Z0-9]", "");
        ReleaseLogUtil.d("R_SmartClipManager", "getSourceFilePath encryptedDeviceId:", strE, ", replacedDeviceId:", strReplaceAll);
        return WatchFaceUtil.getFileDirPath(n() + strReplaceAll + File.separator);
    }

    private String n() {
        try {
            return com.huawei.haf.application.BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + "myWatchFace" + File.separator + "watchfacePhoto" + File.separator + WatchFaceProvider.BACKGROUND_LABEL + File.separator;
        } catch (IOException e2) {
            ReleaseLogUtil.a("R_SmartClipManager", "DiyWatchFaceBaseManager mWatchFaceRootDir IOException:", ExceptionUtils.c(e2));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) throws Throwable {
        Bitmap bitmapE = mcn.e(str, (Uri) null);
        if (bitmapE == null) {
            ReleaseLogUtil.e("R_SmartClipManager", "prepared bitmap is null");
            return;
        }
        mcj mcjVar = new mcj();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        mcjVar.c(arrayList);
        mcjVar.c(this.g.d());
        mcjVar.c().add(str2);
        mcjVar.c(this.g.e(), this.g.b());
        mcn.a(mcjVar, bitmapE);
        mcn.e(bitmapE, mcjVar);
        if (mcjVar.c().size() > 0) {
            synchronized (e) {
                LogUtil.a("SmartClipManager", "AddClipped path to Result : ", mcjVar.c().get(0));
                this.f.add(mcjVar.c().get(0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Object[] array = this.f.toArray();
        LogUtil.a("SmartClipManager", "before sort : ", Arrays.asList(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int i2 = 0; i2 < (array.length - i) - 1; i2++) {
                Object obj = array[i2];
                if (obj instanceof String) {
                    int i3 = i2 + 1;
                    Object obj2 = array[i3];
                    if (obj2 instanceof String) {
                        String str = (String) obj;
                        String str2 = (String) obj2;
                        String strSubstring = "";
                        if (str.length() >= str.lastIndexOf(".")) {
                            strSubstring = str.substring(str.lastIndexOf(File.separator) + 1, str.lastIndexOf("."));
                        }
                        String strSubstring2 = "";
                        if (str2.length() >= str2.lastIndexOf(".")) {
                            strSubstring2 = str2.substring(str2.lastIndexOf(File.separator) + 1, str2.lastIndexOf("."));
                        }
                        LogUtil.a("SmartClipManager", "preName : ", strSubstring, ", nextName : ", strSubstring2);
                        if (strSubstring.length() > 0 && strSubstring2.length() > 0 && strSubstring.compareTo(strSubstring2) > 0) {
                            LogUtil.a("SmartClipManager", "exchange path");
                            array[i2] = array[i3];
                            array[i3] = str;
                        }
                    }
                }
            }
        }
        Object obj3 = e;
        synchronized (obj3) {
            this.f.clear();
        }
        synchronized (obj3) {
            for (Object obj4 : array) {
                if (obj4 instanceof String) {
                    this.f.add((String) obj4);
                }
            }
        }
        LogUtil.a("SmartClipManager", "after sort : ", this.f.toString());
        SmartClipCallback smartClipCallback = this.f17376b;
        if (smartClipCallback != null) {
            smartClipCallback.onClipResult(0, new ArrayList(this.f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("SmartClipManager", "Call onTransferClipResultSuccess callback : ", Boolean.valueOf(this.q != null));
        this.s = this.t;
        this.i = 0;
        ClipTransferCallback clipTransferCallback = this.q;
        if (clipTransferCallback != null) {
            clipTransferCallback.onTransferResult(0, i);
            this.q = null;
        }
        this.n = false;
        u();
        LogUtil.a("SmartClipManager", "onTransferClipResultSuccess unregisterReceiver mConnectStateChangedReceiver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("SmartClipManager", "Call onTransferClipResultFailed callback : ", Boolean.valueOf(this.q != null));
        if (this.q != null) {
            int i = this.s;
            int i2 = this.r;
            int i3 = i - i2;
            int i4 = this.t;
            int i5 = i4 - i3;
            LogUtil.a("SmartClipManager", "mTransferCompleteCount = ", Integer.valueOf(i), ", mTransferFailedCount = ", Integer.valueOf(i2), ", mTransferTotalCount = ", Integer.valueOf(i4), "success = ", Integer.valueOf(i3), ", failedCount = ", Integer.valueOf(i5));
            this.q.onTransferResult(-1, i5);
            this.q = null;
        }
        this.n = false;
        AlbumWatchFaceManger.getInstance().onOneHopProgress(null, new DiyThrowable(-1, "oneHop transfer error"));
        u();
        LogUtil.a("SmartClipManager", "onTransferClipResultFailed unregisterReceiver mConnectStateChangedReceiver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!this.n) {
            LogUtil.j("SmartClipManager", "CallTransferProgress bu task is over");
            return;
        }
        LogUtil.a("SmartClipManager", "Call onTransferClipResultProgress, callback : ", Boolean.valueOf(this.q != null));
        if (this.q != null) {
            int iK = k();
            int i = this.s;
            int i2 = this.t;
            if (i > i2) {
                this.s = i2;
            }
            this.q.onTransferProgress(i2, this.s, iK);
        }
    }

    private int k() {
        int i = this.t;
        if (i <= 0) {
            return 0;
        }
        double d = 100.0d / ((double) i);
        int iCeil = (int) Math.ceil((((double) this.s) * d) + ((((double) this.i) * d) / 100.0d));
        if (iCeil > 100) {
            return 100;
        }
        if (iCeil < 0) {
            return 0;
        }
        LogUtil.j("SmartClipManager", "getTransferProgress default.");
        return iCeil;
    }

    public int d() {
        LogUtil.a("SmartClipManager", "getTransferSuccessCount mTransferSuccessCount : ", Integer.valueOf(this.p));
        return this.p;
    }

    public int a() {
        int i = this.t;
        int i2 = this.p;
        int i3 = i - i2;
        LogUtil.a("SmartClipManager", "getTransferFailedCount failedCount : ", Integer.valueOf(i3), ", mTransferTotalCount : ", Integer.valueOf(i), ", mTransferSuccessCount : ", Integer.valueOf(i2));
        return i3;
    }

    /* JADX INFO: loaded from: classes10.dex */
    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f17384b;

        b(float f) {
            this.f17384b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAiSmartClipApi hiAiSmartClip = ddr.e().getHiAiSmartClip();
            if (hiAiSmartClip == null) {
                LogUtil.j("SmartClipManager", "LoadPluginRunnable hiAiSmartClip is null");
                return;
            }
            LogUtil.a("SmartClipManager", "run download plugin thread");
            SmartClipManager.this.o = true;
            hiAiSmartClip.startLoadPlugin(SmartClipManager.this.h, this.f17384b, new HiAiLoadSmartPluginListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.b.4
                @Override // com.huawei.health.baseapi.hiaiengine.HiAiLoadSmartPluginListener
                public void onLoadResult(int i) {
                    LogUtil.a("R_SmartClipManager", "OnLoadPluginResult, code:", Integer.valueOf(i));
                    if (i == 0) {
                        if (SmartClipManager.this.k != null) {
                            SmartClipManager.this.k.onLoadPluginResult(0);
                        }
                    } else if (SmartClipManager.this.k != null) {
                        SmartClipManager.this.k.onLoadPluginResult(-1);
                    }
                    SmartClipManager.this.o = false;
                }

                @Override // com.huawei.health.baseapi.hiaiengine.HiAiLoadSmartPluginListener
                public void onLoadProgress(int i) {
                    LogUtil.a("SmartClipManager", "OnLoadPluginProgress : ", Integer.valueOf(i));
                    if (SmartClipManager.this.k != null) {
                        SmartClipManager.this.k.onLoadPluginProgress(i);
                    }
                }
            });
        }
    }
}
