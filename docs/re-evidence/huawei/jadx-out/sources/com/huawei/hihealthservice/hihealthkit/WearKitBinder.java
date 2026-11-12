package com.huawei.hihealthservice.hihealthkit;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hihealth.WearKitPermission;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.wearkit.IBaseCallback;
import com.huawei.wearkit.IDetectCommonCallback;
import com.huawei.wearkit.IRealTimeCallback;
import com.huawei.wearkit.IWearCommonCallback;
import com.huawei.wearkit.IWearKit;
import com.huawei.wearkit.IWearReadCallback;
import com.huawei.wearkit.IWearWriteCallback;
import com.huawei.wearkit.model.HealthLogOption;
import defpackage.kwi;
import defpackage.kxp;
import defpackage.lbm;
import defpackage.lcm;
import defpackage.lcr;
import defpackage.lee;
import defpackage.len;
import defpackage.lep;
import defpackage.ler;
import defpackage.ljo;
import defpackage.ljp;
import defpackage.lsy;
import defpackage.njy;
import health.compact.a.AuthorizationUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WearKitBinder extends IWearKit.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12504c = BaseApplication.getAppPackage();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f12505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseCallback f12506b;
    private Context d;

    public WearKitBinder(Context context) {
        this.d = context;
        this.f12505a = new Handler(context.getMainLooper()) { // from class: com.huawei.hihealthservice.hihealthkit.WearKitBinder.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 101) {
                    return;
                }
                try {
                    WearKitBinder.this.d(message);
                } catch (RemoteException e) {
                    ReleaseLogUtil.a("HiH_WearKitBinder", "handleMessage RemoteException: ", e.getMessage());
                }
            }
        };
    }

    @Override // com.huawei.wearkit.IWearKit
    public void getDeviceList(int i, IRealTimeCallback iRealTimeCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "getDeviceList enter");
        len lenVar = new len();
        if (iRealTimeCallback == null) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "getDeviceList callback null");
            e(lenVar, "getDeviceList", 2);
            return;
        }
        if (lcm.e("getDeviceList", iRealTimeCallback)) {
            boolean z = true;
            if (a(i) && !b(1)) {
                z = false;
            }
            if (!lep.a(this.d, 5) && z) {
                iRealTimeCallback.onResult(1001);
                e(lenVar, "getDeviceList", 1001);
            } else {
                a(lenVar, iRealTimeCallback);
            }
        }
    }

    private void a(len lenVar, final IRealTimeCallback iRealTimeCallback) {
        lbm.c(this.d).a(new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.WearKitBinder.2
            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onResult(int i) {
                try {
                    LogUtil.a("WearKitBinder", " get wear device list errCode: ", Integer.valueOf(i));
                    iRealTimeCallback.onResult(i);
                } catch (Exception e) {
                    ReleaseLogUtil.a("HiH_WearKitBinder", " getAllDeviceList ThirdPartApp exception：", e.getMessage());
                }
            }

            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onChange(int i, String str) throws RemoteException {
                LogUtil.a("WearKitBinder", " get wear device list errCode: ", Integer.valueOf(i));
                if (i == 0) {
                    lee.b(WearKitBinder.this.d, str, iRealTimeCallback);
                } else {
                    iRealTimeCallback.onChange(i, str);
                }
            }
        });
        e(lenVar, "getDeviceList", 0);
    }

    @Override // com.huawei.wearkit.IWearKit
    public void requestAuthorization(int i, IBaseCallback iBaseCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "requestAuthorization enter");
        len lenVar = new len();
        try {
            if (iBaseCallback == null) {
                ReleaseLogUtil.e("HiH_WearKitBinder", "requestAuthorization callback == null");
                e(lenVar, "requestAuthorization", 2);
                return;
            }
            int callingUid = Binder.getCallingUid();
            String nameForUid = this.d.getPackageManager().getNameForUid(callingUid);
            e(i, callingUid, nameForUid);
            this.f12506b = iBaseCallback;
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            messageObtain.arg1 = callingUid;
            messageObtain.obj = nameForUid;
            this.f12505a.sendMessage(messageObtain);
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_WearKitBinder", "requestAuthorization Exception: ", e.getMessage());
            e(lenVar, "requestAuthorization", 4);
            if (iBaseCallback != null) {
                iBaseCallback.onResult(4, Collections.EMPTY_MAP);
            }
        }
    }

    private void e(int i, int i2, String str) {
        LogUtil.d("WearKitBinder", "checkFlagPermission ", Integer.valueOf(i), Constants.LINK, Integer.valueOf(i2), Constants.LINK, str);
        if (i2 != i) {
            kwi kwiVarB = kwi.b();
            int iB = kwiVarB.b(str);
            HiAppInfo hiAppInfoC = kwiVarB.c(iB);
            if (hiAppInfoC != null) {
                int iA = ljo.a(hiAppInfoC.getSignature());
                String strA = HsfSignValidator.a(this.d, str);
                if (iA != i2) {
                    hiAppInfoC.setSignature(ljp.d(strA, i2));
                    ReleaseLogUtil.d("HiH_WearKitBinder", "updateAppInfo result = ", Integer.valueOf(kwiVarB.d(hiAppInfoC)));
                }
            }
            if (iB != 0) {
                ReleaseLogUtil.d("HiH_WearKitBinder", "checkFlagPermission appId = ", Integer.valueOf(iB), " result = ", Integer.valueOf(kxp.b().b(iB)));
            }
        }
    }

    @Override // com.huawei.wearkit.IWearKit
    public void readFromWearable(String str, String str2, IWearReadCallback iWearReadCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "readFromWearable enter");
        len lenVar = new len();
        if (iWearReadCallback == null) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "readFromWearable callback null");
            e(lenVar, "readFromWearable", 2);
        } else if (lcm.e("readFromWearable", iWearReadCallback)) {
            if (!lep.a(this.d, 7) || b(2)) {
                e(lenVar, "readFromWearable", 1001);
                iWearReadCallback.onResult(1001, "permission denied", new byte[0]);
            } else {
                lbm.c(this.d).d(str, str2, iWearReadCallback);
                e(lenVar, "readFromWearable", 0);
            }
        }
    }

    @Override // com.huawei.wearkit.IWearKit
    public void writeToWearable(String str, String str2, byte[] bArr, String str3, IWearWriteCallback iWearWriteCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "writeToWearable enter");
        len lenVar = new len();
        if (iWearWriteCallback == null) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "writeToWearable callback null");
            e(lenVar, "writeToWearable", 2);
        } else if (lcm.e("writeToWearable", iWearWriteCallback)) {
            if (!lep.a(this.d, 8) || b(2)) {
                e(lenVar, "writeToWearable", 1001);
                iWearWriteCallback.onResult(1001, "permission denied");
            } else {
                lbm.c(this.d).a(str, str2, bArr, str3, iWearWriteCallback);
                e(lenVar, "writeToWearable", 0);
            }
        }
    }

    @Override // com.huawei.wearkit.IWearKit
    public void pushMsgToWearable(String str, String str2, IWearCommonCallback iWearCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "pushMsgToWearable enter");
        len lenVar = new len();
        if (iWearCommonCallback == null) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "pushMsgToWearable callback null");
            e(lenVar, "pushMsgToWearable", 2);
        } else if (lcm.e("pushMsgToWearable", iWearCommonCallback)) {
            if (!lep.a(this.d, 9) || b(3)) {
                iWearCommonCallback.onResult(1001, "permission denied");
                e(lenVar, "pushMsgToWearable", 1001);
            } else {
                lbm.c(this.d).e(ljp.b(this.d), str, str2, iWearCommonCallback);
                e(lenVar, "pushMsgToWearable", 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) throws RemoteException {
        String strValueOf = String.valueOf(message.obj);
        len lenVar = new len();
        if (TextUtils.isEmpty(strValueOf)) {
            this.f12506b.onResult(2, null);
            e(lenVar, "requestAuthorization", 2);
            return;
        }
        boolean zC = AuthorizationUtils.c(this.d);
        HashMap map = new HashMap(16);
        if (zC) {
            map.put("flag", String.valueOf(message.arg1));
            this.f12506b.onResult(0, map);
            Intent intent = new Intent();
            String str = f12504c;
            intent.setClassName(str, "com.huawei.ui.main.stories.me.activity.thirdparty.WearKitAuthActivity");
            intent.setPackage(str);
            intent.setFlags(268435456);
            intent.addFlags(134217728);
            intent.addFlags(524288);
            intent.addFlags(8388608);
            intent.putExtra(MapKeyNames.APP_INFO, c(strValueOf));
            intent.putExtra("logo", true);
            e(lenVar, "requestAuthorization", 0);
            this.d.startActivity(intent);
            return;
        }
        ReleaseLogUtil.e("HiH_WearKitBinder", "auth is not permitted by user");
        this.f12506b.onResult(1003, map);
        e(lenVar, "requestAuthorization", 1003);
    }

    private HiAppInfo c(String str) {
        HiAppInfo hiAppInfoD = kwi.b().d(str);
        if (hiAppInfoD != null) {
            return hiAppInfoD;
        }
        HiAppInfo hiAppInfoA = ljp.a(this.d, str);
        if (hiAppInfoA == null) {
            return null;
        }
        kwi.b().d(hiAppInfoA, 0);
        return kwi.b().d(str);
    }

    private boolean a(int i) {
        int callingUid = Binder.getCallingUid();
        LogUtil.d("WearKitBinder", "isFlagValid ", Integer.valueOf(i), Constants.LINK, Integer.valueOf(callingUid));
        return i == callingUid;
    }

    private boolean b(int i) {
        if (!lcm.c(this.d, Binder.getCallingUid())) {
            return true;
        }
        List<WearKitPermission> listC = kxp.b().c(kwi.b().b(ljp.e(this.d)));
        if (njy.e(listC)) {
            return true;
        }
        for (WearKitPermission wearKitPermission : listC) {
            if (wearKitPermission != null && wearKitPermission.getScopeId() == i) {
                LogUtil.a("WearKitBinder", "checkDenied scope = ", Integer.valueOf(i), "allow = ", Integer.valueOf(wearKitPermission.getAllow()));
                return wearKitPermission.getAllow() != 1;
            }
        }
        LogUtil.a("WearKitBinder", "checkDenied true");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final len lenVar, final String str, final int i) {
        if (lenVar == null || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "callWearKit illegal input");
        } else {
            final String strE = e();
            lsy.a(new Runnable() { // from class: lco
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39915c.c(str, i, strE, lenVar);
                }
            });
        }
    }

    public /* synthetic */ void c(String str, int i, String str2, len lenVar) {
        ler lerVar = new ler(str, i, str2);
        lerVar.d("1.0.0.0");
        lenVar.e(this.d, lerVar);
    }

    private String e() {
        LogUtil.a("WearKitBinder", "enter getCallingPackageName");
        if (this.d == null) {
            LogUtil.e("WearKitBinder", "getCallingPackageName:mContext is null");
            return "";
        }
        int callingUid = Binder.getCallingUid();
        PackageManager packageManager = this.d.getPackageManager();
        if (packageManager == null) {
            LogUtil.e("WearKitBinder", "getCallingPackageName:packageManager is null");
            return "";
        }
        return packageManager.getNameForUid(callingUid);
    }

    @Override // com.huawei.wearkit.IWearKit
    public void sendDeviceCommand(int i, String str, final IRealTimeCallback iRealTimeCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "sendDeviceCommand enter");
        len lenVar = new len();
        if (iRealTimeCallback == null) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "sendDeviceCommand callback null");
            e(lenVar, "sendDeviceCommand", 2);
        } else if (lcm.e("sendDeviceCommand", iRealTimeCallback)) {
            if (!lep.a(this.d, 6)) {
                e(lenVar, "sendDeviceCommand", 1001);
                iRealTimeCallback.onResult(1001);
            } else {
                lbm.c(this.d).f(str, new IRealTimeDataCallback() { // from class: com.huawei.hihealthservice.hihealthkit.WearKitBinder.5
                    @Override // android.os.IInterface
                    public IBinder asBinder() {
                        return null;
                    }

                    @Override // com.huawei.hihealth.IRealTimeDataCallback
                    public void onResult(int i2) {
                        LogUtil.a("WearKitBinder", "sendDeviceCommand onResult errCode ", Integer.valueOf(i2));
                        try {
                            iRealTimeCallback.onResult(i2);
                        } catch (Exception e) {
                            ReleaseLogUtil.a("HiH_WearKitBinder", " sendDeviceCommand ThirdPartApp exception", LogAnonymous.b(e));
                        }
                    }

                    @Override // com.huawei.hihealth.IRealTimeDataCallback
                    public void onChange(int i2, String str2) throws RemoteException {
                        LogUtil.a("WearKitBinder", "sendDeviceCommand onChange errCode ", Integer.valueOf(i2));
                        iRealTimeCallback.onChange(i2, str2);
                    }
                });
                e(lenVar, "sendDeviceCommand", 0);
            }
        }
    }

    @Override // com.huawei.wearkit.IWearKit
    public void isSwitchOn(int i, IDetectCommonCallback iDetectCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "isSwitchOn enter");
        len lenVar = new len();
        if (iDetectCommonCallback == null) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "isSwitchOn callback null");
            e(lenVar, "isSwitchOn", 2);
        } else if (lcm.e("isSwitchOn", iDetectCommonCallback)) {
            if (lep.a(this.d, 10)) {
                lbm.c(this.d).e(i, b(lenVar, "isSwitchOn", iDetectCommonCallback));
                return;
            }
            iDetectCommonCallback.onResult(1001, null, "permission denied");
            e(lenVar, "isSwitchOn", 1001);
            LogUtil.j("WearKitBinder", lcr.b(1001));
        }
    }

    @Override // com.huawei.wearkit.IWearKit
    public void getList(int i, IDetectCommonCallback iDetectCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "getList enter");
        len lenVar = new len();
        if (iDetectCommonCallback == null) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "getList callback null");
            e(lenVar, "getList", 2);
        } else if (lcm.e("getList", iDetectCommonCallback)) {
            if (lep.a(this.d, 11)) {
                lbm.c(this.d).b(i, b(lenVar, "getList", iDetectCommonCallback));
                return;
            }
            iDetectCommonCallback.onResult(1001, null, "permission denied");
            e(lenVar, "getList", 1001);
            LogUtil.j("WearKitBinder", lcr.b(1001));
        }
    }

    @Override // com.huawei.wearkit.IWearKit
    public void isLatestVersion(int i, IDetectCommonCallback iDetectCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "isLatestVersion enter");
        len lenVar = new len();
        if (iDetectCommonCallback == null) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "isLatestVersion callback null");
            e(lenVar, "isLatestVersion", 2);
        } else if (lcm.e("isLatestVersion", iDetectCommonCallback)) {
            if (lep.a(this.d, 12)) {
                lbm.c(this.d).a(i, b(lenVar, "isLatestVersion", iDetectCommonCallback));
                return;
            }
            iDetectCommonCallback.onResult(1001, null, "permission denied");
            e(lenVar, "isLatestVersion", 1001);
            LogUtil.j("WearKitBinder", lcr.b(1001));
        }
    }

    @Override // com.huawei.wearkit.IWearKit
    public void goIntoPage(String str, int i, IDetectCommonCallback iDetectCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "goIntoPage enter");
        len lenVar = new len();
        if (iDetectCommonCallback == null || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "goIntoPage param is null");
            e(lenVar, "goIntoPage", 2);
        } else if (lcm.e("goIntoPage", iDetectCommonCallback)) {
            if (!lep.a(this.d, 13)) {
                iDetectCommonCallback.onResult(1001, null, "permission denied");
                e(lenVar, "goIntoPage", 1001);
                LogUtil.j("WearKitBinder", lcr.b(1001));
                return;
            }
            lbm.c(this.d).e(str, i, b(lenVar, "goIntoPage", iDetectCommonCallback));
        }
    }

    @Override // com.huawei.wearkit.IWearKit
    public void captureLog(HealthLogOption healthLogOption, IWearCommonCallback iWearCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_WearKitBinder", "enter captureLog, action=", Integer.valueOf(healthLogOption.getActionType().geActionType()));
        len lenVar = new len();
        if (iWearCommonCallback == null) {
            ReleaseLogUtil.e("HiH_WearKitBinder", "captureLog callback null");
            e(lenVar, "captureLog", 2);
        } else if (lcm.e("captureLog", iWearCommonCallback)) {
            if (!lep.a(this.d, 14)) {
                ReleaseLogUtil.e("HiH_WearKitBinder", "captureLog ", "permission denied");
                iWearCommonCallback.onResult(1001, "permission denied");
                e(lenVar, "captureLog", 1001);
            } else {
                lbm.c(this.d).b(healthLogOption, iWearCommonCallback);
                e(lenVar, "captureLog", 0);
            }
        }
    }

    public void onDestroy() {
        ReleaseLogUtil.d("HiH_WearKitBinder", "onDestroy");
    }

    private IDetectCommonCallback b(final len lenVar, final String str, final IDetectCommonCallback iDetectCommonCallback) {
        return new IDetectCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.WearKitBinder.4
            @Override // com.huawei.wearkit.IDetectCommonCallback
            public void onResult(int i, List list, String str2) throws RemoteException {
                iDetectCommonCallback.onResult(i, list, str2);
                WearKitBinder.this.e(lenVar, str, i);
            }
        };
    }
}
