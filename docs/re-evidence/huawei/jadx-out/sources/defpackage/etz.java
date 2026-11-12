package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.controlcenter.featureability.sdk.IAuthCallback;
import com.huawei.controlcenter.featureability.sdk.IConnectCallback;
import com.huawei.controlcenter.featureability.sdk.model.ExtraParams;
import com.huawei.harmonyos.interwork.base.ability.IAbilityStartCallback;
import com.huawei.harmonyos.interwork.base.ability.IInitCallBack;
import com.huawei.harmonyos.interwork.base.bundle.AbilityInfo;
import com.huawei.harmonyos.interwork.base.bundle.ElementName;
import com.huawei.harmonyos.interwork.base.content.Intent;
import com.huawei.health.faservice.HopDeviceUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.onehop.fasdk.job.ResultCallback;
import com.huawei.onehop.fasdk.model.DeviceConnectState;
import com.huawei.watchface.videoedit.gles.Constant;
import health.compact.a.SystemProperties;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes27.dex */
public class etz {
    private etz() {
    }

    public static etz d() {
        return d.f33488a;
    }

    public boolean a(Context context) {
        ReleaseLogUtil.d("BaseModule_HopManager", "isHopEnabled start executor");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalThreadStateException("time consuming, not support executor in main thread");
        }
        final boolean[] zArr = {false};
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        ohd.b(context, context.getPackageName(), new ResultCallback() { // from class: euc
            @Override // com.huawei.onehop.fasdk.job.ResultCallback
            public final void onResult(String str, int i) {
                etz.c(countDownLatch, str, i);
            }
        }, new IAuthCallback.Stub() { // from class: etz.3
            @Override // com.huawei.controlcenter.featureability.sdk.IAuthCallback
            public void onAuthResult(boolean z) throws RemoteException {
                ReleaseLogUtil.d("BaseModule_HopManager", "onAuthResult = ", Boolean.valueOf(z));
                zArr[0] = z;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            ReleaseLogUtil.e("BaseModule_HopManager", "isHopEnabled InterruptedException: ", e.getMessage());
        }
        ReleaseLogUtil.d("BaseModule_HopManager", "isHopEnabled result: ", Boolean.valueOf(zArr[0]));
        return zArr[0];
    }

    static /* synthetic */ void c(CountDownLatch countDownLatch, String str, int i) {
        ReleaseLogUtil.d("BaseModule_HopManager", "reqType:" + str + " ,resultCode:" + i);
        countDownLatch.countDown();
    }

    public int d(String str, IBinder iBinder, ExtraParams extraParams, IConnectCallback iConnectCallback) {
        int iD = ohd.d(str, iBinder, extraParams, iConnectCallback);
        ReleaseLogUtil.d("BaseModule_HopManager", "register executor result = ", Integer.valueOf(iD));
        return iD;
    }

    public boolean c(int i) {
        boolean zC = ohd.c(i);
        ReleaseLogUtil.d("BaseModule_HopManager", "unregister FA,the result is: ", Boolean.valueOf(zC));
        return zC;
    }

    public String d(efc efcVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("harmonyVersion", "2.0.0");
        map.put("system", map2);
        map.put("groupType", "1");
        if (efcVar != null) {
            map.put("faFilter", efcVar.toString());
        }
        map.put("curComType", 4);
        HashMap map3 = new HashMap();
        map3.put("commonFilter", map);
        HashMap map4 = new HashMap();
        map4.put(Constant.FILTER, map3);
        map4.put("isTurnOffRecommend", true);
        map4.put("remoteAuthenticationDescription", null);
        map4.put("remoteAuthenticationPicture", null);
        return HiJsonUtil.d(map4);
    }

    public ExtraParams a(String[] strArr, String str, String str2, String str3) {
        ExtraParams extraParams = new ExtraParams();
        extraParams.setDevType(strArr);
        extraParams.setTargetPkgName(str);
        extraParams.setDescription(str2);
        extraParams.setJsonParams(str3);
        return extraParams;
    }

    public ExtraParams a(String str, String str2) {
        return a(new String[]{"09C"}, "com.huawei.ohos.healthtv.hmservice", str, str2);
    }

    public boolean b(int i, ExtraParams extraParams) {
        ReleaseLogUtil.d("BaseModule_HopManager", "start show DeviceList,the params is: ", extraParams);
        return ohd.e(i, extraParams);
    }

    public void b(String str, IInitCallBack iInitCallBack) {
        LogUtil.a("BaseModule_HopManager", "initDistributedEnvironment");
        try {
            dag.c(str, iInitCallBack);
        } catch (daf e) {
            ReleaseLogUtil.e("BaseModule_HopManager", "initDistributedEnvironment RemoteException: ", e.getMessage());
        } catch (IllegalArgumentException e2) {
            e = e2;
            ReleaseLogUtil.e("BaseModule_HopManager", "initDistributedEnvironment Exception: ", e.getMessage());
        } catch (IllegalStateException e3) {
            e = e3;
            ReleaseLogUtil.e("BaseModule_HopManager", "initDistributedEnvironment Exception: ", e.getMessage());
        } catch (SecurityException e4) {
            e = e4;
            ReleaseLogUtil.e("BaseModule_HopManager", "initDistributedEnvironment Exception: ", e.getMessage());
        }
    }

    public int a(Context context, String str, Intent intent) {
        LogUtil.a("BaseModule_HopManager", "startRemoteAbility");
        try {
            intent.setElement(new ElementName(str, "com.huawei.ohos.healthtv.hmservice", "com.huawei.ohos.healthtv.ability.HopControllerAbility"));
            final int[] iArr = {-1};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            dae.a(context, intent, new IAbilityStartCallback() { // from class: eub
                @Override // com.huawei.harmonyos.interwork.base.ability.IAbilityStartCallback
                public final void onStartResult(int i) {
                    etz.a(iArr, countDownLatch, i);
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                ReleaseLogUtil.e("BaseModule_HopManager", "isHopEnabled InterruptedException: ", e.getMessage());
            }
            LogUtil.a("BaseModule_HopManager", "startAbility result: ", Integer.valueOf(iArr[0]));
            return iArr[0];
        } catch (IllegalArgumentException | IllegalStateException e2) {
            ReleaseLogUtil.e("BaseModule_HopManager", "startRemoteAbility Exception: ", e2.getMessage());
            return -1030;
        }
    }

    static /* synthetic */ void a(int[] iArr, CountDownLatch countDownLatch, int i) {
        LogUtil.a("BaseModule_HopManager", "startAbility value: ", Integer.valueOf(i));
        iArr[0] = i;
        countDownLatch.countDown();
    }

    public void d(String str, IInitCallBack iInitCallBack) {
        try {
            LogUtil.a("BaseModule_HopManager", "start to unInitDistributedEnvironment,the deviceId is: ", str);
            dag.b(str, iInitCallBack);
        } catch (daf e) {
            ReleaseLogUtil.e("BaseModule_HopManager", "unInitDistributedEnvironment RemoteException: ", e.getMessage());
        } catch (IllegalArgumentException e2) {
            e = e2;
            ReleaseLogUtil.e("BaseModule_HopManager", "unInitDistributedEnvironment Exception: ", e.getMessage());
        } catch (IllegalStateException e3) {
            e = e3;
            ReleaseLogUtil.e("BaseModule_HopManager", "unInitDistributedEnvironment Exception: ", e.getMessage());
        } catch (SecurityException e4) {
            e = e4;
            ReleaseLogUtil.e("BaseModule_HopManager", "unInitDistributedEnvironment Exception: ", e.getMessage());
        }
    }

    public boolean d(int i, String str, DeviceConnectState deviceConnectState) {
        ReleaseLogUtil.d("BaseModule_HopManager", "updateConnectStatus, the deviceId is: ", str, "the connectState is: ", Integer.valueOf(deviceConnectState.getState()));
        return ohd.c(i, str, deviceConnectState);
    }

    public boolean c(String str) {
        ReleaseLogUtil.d("BaseModule_HopManager", "device = ", str);
        ElementName elementName = new ElementName();
        elementName.setBundleName(BaseApplication.APP_PACKAGE_HEALTH_TV);
        elementName.setAbilityName("com.huawei.homevision.healthtv.ui.sport.FreeSportActivity");
        elementName.setDeviceId(str);
        Intent intent = new Intent();
        intent.setAction("com.huawei.activity.action.LauncherActivity");
        intent.setElement(elementName);
        List<AbilityInfo> listD = dae.d(intent);
        if (njy.e(listD)) {
            ReleaseLogUtil.d("BaseModule_HopManager", "abilityInfoList empty");
            return false;
        }
        ReleaseLogUtil.d("BaseModule_HopManager", "abilityInfoList size ", Integer.valueOf(listD.size()));
        for (AbilityInfo abilityInfo : listD) {
            if (abilityInfo != null && BaseApplication.APP_PACKAGE_HEALTH_TV.equals(abilityInfo.getBundleName())) {
                return true;
            }
        }
        ReleaseLogUtil.d("BaseModule_HopManager", "device ", str, " has no ability");
        return false;
    }

    public boolean d(Context context) {
        boolean z;
        int iC = SystemProperties.c("hw_mc.controlcenter.displaymode", 0);
        LogUtil.a("BaseModule_HopManager", "displayModeValue: ", Integer.valueOf(iC));
        try {
            context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.controlcenter", "com.huawei.controlcenter.fatransfer.service.FeatureAbilityRegisterService"), 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("BaseModule_HopManager", "can not find getServiceInfo.");
            z = false;
        }
        return (iC & 128) == 0 && z;
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final etz f33488a = new etz();
    }

    public void a() {
        try {
            Class.forName("com.huawei.hwdevicemanager.IInitCallback");
            HopDeviceUtil.b().e();
        } catch (ClassNotFoundException e) {
            LogUtil.e("BaseModule_HopManager", "releaseDeviceManager ", e.getMessage());
        }
    }

    public void b(UiCallback<List<?>> uiCallback) {
        try {
            Class.forName("com.huawei.hwdevicemanager.IInitCallback");
            HopDeviceUtil.b().c(uiCallback);
        } catch (ClassNotFoundException e) {
            uiCallback.onFailure(2, "the system is not support.");
            LogUtil.e("BaseModule_HopManager", "getAvailableFaDevice ", e.getMessage());
        }
    }
}
