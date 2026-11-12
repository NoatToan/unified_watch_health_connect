package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiAuthorizationOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiDataUpdateOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthUnit;
import com.huawei.hihealth.HiHealthUserPermission;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.HiSubscribeTrigger;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.IAggregateListener;
import com.huawei.hihealth.IAggregateListenerEx;
import com.huawei.hihealth.IAuthorizationListener;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealth.IDataClientListener;
import com.huawei.hihealth.IDataHiDeviceInfoListener;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.IDeleteListenerEx;
import com.huawei.hihealth.IHiHealth;
import com.huawei.hihealth.IMultiDataClientListener;
import com.huawei.hihealth.IRegisterClientListener;
import com.huawei.hihealth.ISubscribeListener;
import com.huawei.hihealth.ISupportedTypesListener;
import com.huawei.hihealth.IUnSubscribeListener;
import com.huawei.hihealth.WearKitPermission;
import com.huawei.hihealth.data.constant.HiErrorCode;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealth.util.WidgetHelperUtils;
import com.huawei.hihealthservice.InsertExecutor;
import com.huawei.hihealthservice.auth.HiAuthException;
import com.huawei.hihealthservice.auth.HiAuthManager;
import com.huawei.hihealthservice.auth.HiAuthorization;
import com.huawei.hihealthservice.auth.HiUserAuth;
import com.huawei.hihealthservice.runnable.SingleRunnable;
import com.huawei.hihealthservice.updatemanager.command.UpdateCommand;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class kto extends IHiHealth.Stub {
    private static ArrayList<Integer> d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ljh f39435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f39436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InsertExecutor f39437c;

    static {
        ArrayList<Integer> arrayList = new ArrayList<>(3);
        d = arrayList;
        arrayList.add(50001);
        d.add(101003);
        d.add(101202);
    }

    public kto(Context context, InsertExecutor insertExecutor) {
        this.f39435a = null;
        if (context == null || insertExecutor == null) {
            throw new lkt("HiHealthBinder param is null");
        }
        this.f39436b = context.getApplicationContext();
        this.f39437c = insertExecutor;
        ljh ljhVar = new ljh();
        this.f39435a = ljhVar;
        ljhVar.d(context, this.f39437c);
        CommonUtil.r(this.f39436b);
        ktr.b().c(context, insertExecutor);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void initHiHealth(final HiAppInfo hiAppInfo) throws RemoteException {
        if (e()) {
            if (hiAppInfo == null) {
                LogUtil.j("HiH_HiHealthBinder", "initHiHealth appInfo = null");
                kyf.a(this.f39436b);
                HiBroadcastUtil.e(this.f39436b, 0);
                HiBroadcastUtil.h(this.f39436b);
                liz.a().a(200, "initHiHealth", new kym(this.f39436b.getPackageName()));
                return;
            }
            ReleaseLogUtil.d("HiH_HiHealthBinder", "initHiHealth packageName:", hiAppInfo.getPackageName());
            this.f39437c.execute(new SingleRunnable() { // from class: kto.1
                @Override // com.huawei.hihealthservice.runnable.SingleRunnable
                public void doRun() {
                    String packageName = hiAppInfo.getPackageName();
                    if (!ljp.b(kto.this.f39436b, packageName)) {
                        LogUtil.e("HiH_HiHealthBinder", "initHiHealth() packageName = null packageName = ", packageName);
                    } else {
                        lgp.f().u();
                        LogUtil.a("HiH_HiHealthBinder", "initHiHealth() app = ", Integer.valueOf(kwi.b().b(packageName)));
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void unBindHiHealth() throws RemoteException {
        if (e()) {
            LogUtil.d("HiH_HiHealthBinder", "unBindHiHealth");
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void requestAuthorization(final HiAuthorizationOption hiAuthorizationOption, IAuthorizationListener iAuthorizationListener) throws Throwable {
        List list;
        int i;
        int i2;
        int i3;
        final int[] iArr = {0};
        final kym kymVarA = ktx.c().a();
        final String strE = ljp.e(this.f39436b);
        final int iE = ktx.c().e();
        LogUtil.a("HiH_HiHealthBinder", "requestAuthorization authorOption = ", hiAuthorizationOption, " packageName = ", strE, " appType = ", Integer.valueOf(iE));
        if (e(iAuthorizationListener, strE, iE)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        list = null;
                        try {
                            this.f39437c.submit(new Runnable() { // from class: kto.5
                                @Override // java.lang.Runnable
                                public void run() throws Throwable {
                                    kto.this.e(iE, strE, hiAuthorizationOption, iArr, kymVarA);
                                }
                            }).get(20000L, TimeUnit.MILLISECONDS);
                            ktu.a(iAuthorizationListener, iArr[0], (List) null);
                        } catch (InterruptedException e) {
                            e = e;
                            i2 = 2;
                            String message = e.getMessage();
                            Object[] objArr = new Object[i2];
                            objArr[0] = "requestAuthorization InterruptedException = ";
                            objArr[1] = message;
                            ReleaseLogUtil.a("HiH_HiHealthBinder", objArr);
                            i3 = 22;
                            iArr[0] = 22;
                            ktu.a(iAuthorizationListener, i3, list);
                        } catch (ExecutionException e2) {
                            e = e2;
                            ReleaseLogUtil.a("HiH_HiHealthBinder", "requestAuthorization ExecutionException = ", e.getMessage());
                            iArr[0] = 22;
                            i3 = 22;
                            ktu.a(iAuthorizationListener, i3, list);
                        } catch (TimeoutException e3) {
                            e = e3;
                            i = 2;
                            String message2 = e.getMessage();
                            Object[] objArr2 = new Object[i];
                            objArr2[0] = "requestAuthorization TimeoutException = ";
                            objArr2[1] = message2;
                            ReleaseLogUtil.a("HiH_HiHealthBinder", objArr2);
                            iArr[0] = 21;
                            ktu.a(iAuthorizationListener, 21, list);
                        }
                    } catch (InterruptedException e4) {
                        e = e4;
                        list = null;
                    } catch (TimeoutException e5) {
                        e = e5;
                        list = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    ktu.a(iAuthorizationListener, iArr[0], (List) null);
                    throw th;
                }
            } catch (ExecutionException e6) {
                e = e6;
                list = null;
            } catch (Throwable th2) {
                th = th2;
                ktu.a(iAuthorizationListener, iArr[0], (List) null);
                throw th;
            }
        } catch (InterruptedException e7) {
            e = e7;
            list = null;
            i2 = 2;
        } catch (TimeoutException e8) {
            e = e8;
            list = null;
            i = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, HiAuthorizationOption hiAuthorizationOption, int[] iArr, kym kymVar) throws Throwable {
        String accessToken;
        String appId;
        String str2;
        String accessToken2;
        boolean z;
        String strEncode;
        if (i == 1) {
            String appId2 = kyl.c().e(str).getAppId();
            accessToken2 = kyl.c().e(str).getAccessToken();
            str2 = appId2;
            z = true;
        } else {
            if (hiAuthorizationOption == null) {
                LogUtil.d("HiH_HiHealthBinder", "authorOption = null");
                accessToken = "";
                appId = "";
            } else {
                appId = hiAuthorizationOption.getAppId();
                accessToken = hiAuthorizationOption.getAccessToken();
            }
            str2 = appId;
            accessToken2 = accessToken;
            z = false;
        }
        kud.a().e(accessToken2);
        try {
            strEncode = URLEncoder.encode(accessToken2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            ReleaseLogUtil.a("HiH_HiHealthBinder", "requestAuthorization UnsupportedEncodingException e = ", e.getMessage());
            strEncode = null;
        }
        String strD = kud.a().d();
        if (HiCommonUtil.a(strD)) {
            LogUtil.j("HiH_HiHealthBinder", "requestAuthorization who is null or empty");
            iArr[0] = 24;
            return;
        }
        HiAccountInfo hiAccountInfoE = kud.a().e(strD, kymVar);
        if (c(accessToken2, hiAccountInfoE, kymVar)) {
            long expiresIn = hiAccountInfoE.getExpiresIn();
            LogUtil.d("HiH_HiHealthBinder", "requestAuthorization atValidTime = ", Long.valueOf(expiresIn));
            if (System.currentTimeMillis() <= expiresIn) {
                LogUtil.a("HiH_HiHealthBinder", "requestAuthorization accessToken is valid expire_in = ", Long.valueOf(expiresIn));
                iArr[0] = 0;
                return;
            }
        }
        HiAuthorization hiAuthorizationB = ljw.b(z, str, str2);
        HiUserAuth hiUserAuthA = ljw.a(z, str, strEncode);
        List<kum> listE = lcm.e(hiAuthorizationB);
        if (c(hiUserAuthA, listE)) {
            LogUtil.j("HiH_HiHealthBinder", "requestAuthorization userAuth = null, or permissionTables is null or empty.");
            iArr[0] = 8;
        } else {
            ktx.c().d(str2, hiAuthorizationB, str);
            kud.a().c(accessToken2, strD, hiAccountInfoE, hiUserAuthA, kymVar);
            ktx.c().a(strD, listE, hiUserAuthA, kymVar);
        }
    }

    private boolean e(IAuthorizationListener iAuthorizationListener, String str, int i) {
        if (i == -1) {
            LogUtil.j("HiH_HiHealthBinder", "requestAuthorization appType is invalid");
            ktu.a(iAuthorizationListener, 17, (List) null);
            return true;
        }
        if (i == 0) {
            LogUtil.j("HiH_HiHealthBinder", "requestAuthorization do not need requestAuth");
            ktu.a(iAuthorizationListener, 0, (List) null);
            return true;
        }
        if (a(str, i)) {
            LogUtil.a("HiH_HiHealthBinder", "requestAuthorization appType = ", Integer.valueOf(i));
            lkc.d();
        }
        return false;
    }

    private boolean c(String str, HiAccountInfo hiAccountInfo, kym kymVar) {
        return kymVar.b() == hiAccountInfo.getAppId() && str.equals(hiAccountInfo.getAccessToken());
    }

    private boolean c(HiUserAuth hiUserAuth, List<kum> list) {
        return HiCommonUtil.b(list) || hiUserAuth == null;
    }

    private boolean a(String str, int i) {
        return i == 1 && kyl.c().e(str) == null;
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchSupportedTypes(int i, ISupportedTypesListener iSupportedTypesListener) throws RemoteException {
        if (e()) {
            LogUtil.d("HiH_HiHealthBinder", "fetchSupportedTypes:", Integer.valueOf(i), " , ", iSupportedTypesListener);
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void subscribeHiHealthData(List list, ISubscribeListener iSubscribeListener) throws RemoteException {
        int iB = ktx.c().b();
        int iE = kud.a().e();
        int iE2 = ktx.c().e();
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        if (iE2 == -1) {
            LogUtil.j("HiH_HiHealthBinder", "subscribeHiHealthData appType is invalid");
            arrayList.add(17);
            ktu.c(iSubscribeListener, null, arrayList);
            return;
        }
        if (iE <= 0) {
            LogUtil.j("HiH_HiHealthBinder", "subscribeHiHealthData() who <= 0 ,app = ", Integer.valueOf(iB));
            ktu.c(iSubscribeListener, arrayList, arrayList2);
            return;
        }
        LogUtil.a("HiH_HiHealthBinder", "subscribeHiHealthData() checkAppType  ", Integer.valueOf(iE2), " appId = ", Integer.valueOf(iB));
        if (iE2 != 0) {
            if (kud.a().a(iB) != 0) {
                ktu.c(iSubscribeListener, arrayList, arrayList2);
                return;
            }
            try {
                HiAuthManager.getInstance().checkReadAuth(iB, iE, ktx.c().e((List<Integer>) list));
            } catch (HiAuthException e) {
                ReleaseLogUtil.a("HiH_HiHealthBinder", "subscribeHiHealthData() HiAuthException e = ", e.getMessage(), " appId = ", Integer.valueOf(iB), " who = ", Integer.valueOf(iE));
                ktu.c(iSubscribeListener, arrayList, arrayList2);
                return;
            }
        }
        liz.a().b(list, iSubscribeListener, arrayList, arrayList2);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public boolean addExternalSubscribeTrigger(int i, int i2, HiSubscribeTrigger hiSubscribeTrigger) throws RemoteException {
        int iE = ktx.c().e();
        LogUtil.d("HiH_HiHealthBinder", "addExternalSubscribeTrigger:", Integer.valueOf(i), " , ", Integer.valueOf(i2), " , ", hiSubscribeTrigger);
        if (iE != -1) {
            return false;
        }
        LogUtil.j("HiH_HiHealthBinder", "addExternalSubscribeTrigger appType is invalid");
        return false;
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void unSubscribeHiHealthData(List list, IUnSubscribeListener iUnSubscribeListener) throws RemoteException {
        if (ktx.c().e() == -1) {
            LogUtil.j("HiH_HiHealthBinder", "unSubscribeHiHealthData appType is invalid");
            ktu.b(iUnSubscribeListener, false);
        } else {
            liz.a().e(list, iUnSubscribeListener);
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void insertHiHealthData(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        ktr.b().b(hiDataInsertOption, iDataOperateListener, false, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void insertRealTimeHiHealthData(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        ktr.b().b(hiDataInsertOption, iDataOperateListener, true, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void readHiHealthData(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ktr.b().c(hiDataReadOption, iDataReadResultListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void aggregateHiHealthData(HiAggregateOption hiAggregateOption, IAggregateListener iAggregateListener) throws RemoteException {
        ktr.b().b(hiAggregateOption, iAggregateListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void insertFitnessData(String str) {
        WidgetHelperUtils.a().d(str);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void aggregateHiHealthDataEx(List list, IAggregateListenerEx iAggregateListenerEx) throws RemoteException {
        ktr.b().a(list, iAggregateListenerEx, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void deleteAllKitHealthData(final int i, final IDataOperateListener iDataOperateListener) throws RemoteException {
        final int[] iArr = {0};
        final ArrayList<Object> arrayList = new ArrayList<>(10);
        arrayList.add(HiErrorCode.c(0));
        if (d(i, iDataOperateListener, arrayList)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final kym kymVarA = ktx.c().a();
        if (e(iDataOperateListener, arrayList)) {
            return;
        }
        this.f39437c.execute(new SingleRunnable() { // from class: kto.3
            @Override // com.huawei.hihealthservice.runnable.SingleRunnable
            public void doRun() {
                IDataOperateListener iDataOperateListener2;
                int i2;
                try {
                    try {
                        kto.this.a(iArr, i, arrayList, kymVarA);
                        iDataOperateListener2 = iDataOperateListener;
                        i2 = iArr[0];
                    } catch (Exception e) {
                        ReleaseLogUtil.a("HiH_HiHealthBinder", "deleteAllKitHealthData() Exception:", LogAnonymous.b(e));
                        iArr[0] = 2;
                        arrayList.add(HiErrorCode.c(iArr[0]) + "delete exception");
                        iDataOperateListener2 = iDataOperateListener;
                        i2 = iArr[0];
                    }
                    ktu.d(iDataOperateListener2, i2, arrayList);
                    LogUtil.a("HiH_HiHealthBinder", "deleteAllKitHealthData() end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable th) {
                    ktu.d(iDataOperateListener, iArr[0], arrayList);
                    throw th;
                }
            }
        });
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void migrateBaseData(IDataOperateListener iDataOperateListener) throws RemoteException {
        ktr.b().d(iDataOperateListener);
    }

    private boolean d(int i, IDataOperateListener iDataOperateListener, ArrayList<Object> arrayList) {
        if (i > 0) {
            return false;
        }
        LogUtil.e("HiH_HiHealthBinder", "deleteAllKitHealthData() appId <= 0");
        ktu.d(iDataOperateListener, 7, arrayList);
        return true;
    }

    private boolean e(IDataOperateListener iDataOperateListener, ArrayList<Object> arrayList) {
        if (ktx.c().e() == 0) {
            return false;
        }
        LogUtil.a("HiH_HiHealthBinder", "deleteHiHealthData() appType is invalid");
        ktu.d(iDataOperateListener, 17, arrayList);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int[] iArr, int i, ArrayList<Object> arrayList, kym kymVar) {
        iArr[0] = lfs.d(this.f39436b).b(i);
        lfz.d(this.f39436b).doRealTimeHealthDataStat();
        ReleaseLogUtil.d("HiH_HiHealthBinder", "deleteAllKitHealthData() errorCode = ", Integer.valueOf(iArr[0]));
        arrayList.add(HiErrorCode.c(iArr[0]));
        liz.a().c(lkg.e(new int[]{10001, 10002}), ArkUIXConstants.DELETE, kymVar);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void deleteHiHealthData(HiDataDeleteOption hiDataDeleteOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        ktr.b().e(hiDataDeleteOption, iDataOperateListener, false, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void updateHiHealthData(HiDataUpdateOption hiDataUpdateOption, IDataOperateListener iDataOperateListener) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iE = ktx.c().e();
        ArrayList arrayList = new ArrayList(10);
        if (iE == -1) {
            LogUtil.a("HiH_HiHealthBinder", "updateHiHealthData() appType is invalid");
            if (iDataOperateListener != null) {
                arrayList.add(HiErrorCode.c(17));
                iDataOperateListener.onResult(17, arrayList);
                return;
            }
            return;
        }
        if (hiDataUpdateOption == null) {
            if (iDataOperateListener != null) {
                arrayList.add(HiErrorCode.c(18));
                iDataOperateListener.onResult(18, arrayList);
                return;
            }
            return;
        }
        int type = hiDataUpdateOption.getType();
        LogUtil.a("HiH_HiHealthBinder", "updateHiHealthData() type is ", Integer.valueOf(type));
        if (type == 101 && !ktx.c().j()) {
            LogUtil.a("HiH_HiHealthBinder", "updateHiHealthData() do default user login ");
            ktx.c().i(ljp.e(this.f39436b));
            if (iDataOperateListener != null) {
                arrayList.add(HiErrorCode.c(0));
                iDataOperateListener.onResult(0, arrayList);
                return;
            }
        }
        UpdateCommand updateCommandE = ljf.e(type);
        if (updateCommandE == null) {
            if (iDataOperateListener != null) {
                arrayList.add(HiErrorCode.c(18));
                iDataOperateListener.onResult(18, arrayList);
            }
            LogUtil.a("HiH_HiHealthBinder", "updateHiHealthData() end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            return;
        }
        updateCommandE.execute(hiDataUpdateOption, iDataOperateListener, this.f39436b);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public int addHiHealthDataCustomType(String str) throws RemoteException {
        LogUtil.d("HiH_HiHealthBinder", "addHiHealthDataCustomType:", str);
        return !e() ? -2 : 0;
    }

    @Override // com.huawei.hihealth.IHiHealth
    public int fetchHiHealthDataCustomType(String str) throws RemoteException {
        LogUtil.d("HiH_HiHealthBinder", "fetchHiHealthDataCustomType:", str);
        return !e() ? -2 : 0;
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void registerDataClient(final HiDeviceInfo hiDeviceInfo, final List list, final IRegisterClientListener iRegisterClientListener) throws RemoteException {
        if (ktx.c().e() == -1) {
            ReleaseLogUtil.d("HiH_HiHealthBinder", "registerDataClient() appType is invalid");
            ktu.b(iRegisterClientListener, (HiHealthClient) null);
            return;
        }
        final int iD = ktx.c().d();
        if (!lkv.a(hiDeviceInfo)) {
            LogUtil.e("HiH_HiHealthBinder", "device is invalid, deviceInfo=", hiDeviceInfo);
            ktu.b(iRegisterClientListener, (HiHealthClient) null);
        } else {
            this.f39437c.execute(new SingleRunnable() { // from class: kto.4
                @Override // com.huawei.hihealthservice.runnable.SingleRunnable
                public void doRun() {
                    LogUtil.a("HiH_HiHealthBinder", "registerDataClient() deviceInfo = ", hiDeviceInfo, ",supportedList = ", list, " appId is ", Integer.valueOf(iD));
                    HiHealthClient hiHealthClientSaveDeviceInfo = lfv.d(kto.this.f39436b).saveDeviceInfo(hiDeviceInfo, iD);
                    LogUtil.a("HiH_HiHealthBinder", "registerDataClient() client = ", hiHealthClientSaveDeviceInfo);
                    ktu.b(iRegisterClientListener, hiHealthClientSaveDeviceInfo);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void registerDataClientWithUserInfo(final HiDeviceInfo hiDeviceInfo, final HiUserInfo hiUserInfo, final List list, final IRegisterClientListener iRegisterClientListener) throws RemoteException {
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "registerDataClientWithUserInfo() appType is invalid");
            ktu.b(iRegisterClientListener, (HiHealthClient) null);
        } else if (!lkv.a(hiDeviceInfo)) {
            LogUtil.e("HiH_HiHealthBinder", "device is invalid, deviceInfo=", hiDeviceInfo);
            ktu.b(iRegisterClientListener, (HiHealthClient) null);
        } else {
            final int iD = ktx.c().d();
            this.f39437c.execute(new SingleRunnable() { // from class: kto.2
                @Override // com.huawei.hihealthservice.runnable.SingleRunnable
                public void doRun() throws Throwable {
                    LogUtil.d("HiH_HiHealthBinder", "registerDataClientWithUserInfo() deviceInfo = ", hiDeviceInfo, ", userid = ", hiUserInfo, ",supportedList = ", list);
                    HiHealthClient hiHealthClientSaveDeviceInfoWithUserInfo = lfv.d(kto.this.f39436b).saveDeviceInfoWithUserInfo(hiDeviceInfo, hiUserInfo, iD);
                    LogUtil.d("HiH_HiHealthBinder", "registerDataClientWithUserInfo() client = ", hiHealthClientSaveDeviceInfoWithUserInfo);
                    ktu.b(iRegisterClientListener, hiHealthClientSaveDeviceInfoWithUserInfo);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchBuildInDataClient(IDataClientListener iDataClientListener) throws RemoteException {
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "fetchBuildInDataClient() appType is invalid");
            ktu.b(iDataClientListener, (List) null);
        } else {
            LogUtil.a("HiH_HiHealthBinder", "fetchBuildInDataClient");
            ktu.b(iDataClientListener, lfv.d(this.f39436b).getHealthClientList(FoundationCommonUtil.getAndroidId(this.f39436b), ktx.c().d()));
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchManualDataClient(IDataClientListener iDataClientListener) throws RemoteException {
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "fetchManualDataClient() appType is invalid");
            ktu.b(iDataClientListener, (List) null);
        } else {
            LogUtil.a("HiH_HiHealthBinder", "fetchManualDataClient");
            ktu.b(iDataClientListener, lfv.d(this.f39436b).getHealthClientList("-1", ktx.c().d()));
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchPhoneDataClient(IDataClientListener iDataClientListener) throws RemoteException {
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "fetchPhoneDataClient() appType is invalid");
            ktu.b(iDataClientListener, (List) null);
        } else {
            LogUtil.a("HiH_HiHealthBinder", "fetchPhoneDataClient");
            ktu.b(iDataClientListener, lfv.d(this.f39436b).getHealthClientList(FoundationCommonUtil.getAndroidId(this.f39436b), ktx.c().d()));
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchRegisteredDataClient(int i, IDataClientListener iDataClientListener) throws RemoteException {
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "fetchRegisteredDataClient() appType is invalid");
            ktu.b(iDataClientListener, (List) null);
        } else {
            LogUtil.a("HiH_HiHealthBinder", "fetchRegisteredDataClient");
            ktu.b(iDataClientListener, lfv.d(this.f39436b).getAllHealthClientList(ktx.c().d()));
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchDataClientByUniqueID(int i, String str, IDataClientListener iDataClientListener) throws RemoteException {
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "fetchDataClientByUniqueID() appType is invalid");
            ktu.b(iDataClientListener, (List) null);
            return;
        }
        LogUtil.a("HiH_HiHealthBinder", "fetchDataClientByUniqueID");
        if (HiCommonUtil.a(str)) {
            LogUtil.j("HiH_HiHealthBinder", "fetchDataClientByUniqueID uniqueID = null");
            ktu.b(iDataClientListener, (List) null);
        } else {
            ktu.b(iDataClientListener, lfv.d(this.f39436b).getHealthClientList(str, ktx.c().d()));
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public HiHealthUnit fetchPreferUnit(int i) throws RemoteException {
        LogUtil.d("HiH_HiHealthBinder", "fetchPreferUnit:", Integer.valueOf(i));
        if (e()) {
            return new HiHealthUnit();
        }
        return null;
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void setPreferUnit(int i, HiHealthUnit hiHealthUnit) throws RemoteException {
        LogUtil.d("HiH_HiHealthBinder", "setPreferUnit:", Integer.valueOf(i), " , ", hiHealthUnit);
        e();
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchDataSourceByType(int i, HiTimeInterval hiTimeInterval, IDataClientListener iDataClientListener) throws RemoteException {
        ktr.b().b(i, hiTimeInterval, iDataClientListener);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchDataSourceByTypes(List list, HiTimeInterval hiTimeInterval, boolean z, IMultiDataClientListener iMultiDataClientListener) throws RemoteException {
        ktr.b().d(list, hiTimeInterval, z, iMultiDataClientListener);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void setUserData(final HiUserInfo hiUserInfo, final ICommonListener iCommonListener) throws RemoteException {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final ArrayList<Boolean> arrayList = new ArrayList<>(10);
        arrayList.add(false);
        if (hiUserInfo == null) {
            LogUtil.j("HiH_HiHealthBinder", "userInfo is null!");
            ktu.a(iCommonListener, 14, arrayList);
            return;
        }
        int iE = ktx.c().e();
        if (hiUserInfo.getUser() != 1073741824) {
            if (iE != -1) {
                e(hiUserInfo, iCommonListener, arrayList);
            }
        } else {
            if (hiUserInfo.getModifiedIntent() == 0) {
                LogUtil.j("HiH_HiHealthBinder", "error set ALL data to UserInfo,user:", Integer.valueOf(hiUserInfo.getUser()), " modifiedIntent", Integer.valueOf(hiUserInfo.getModifiedIntent()));
                ktu.a(iCommonListener, 14, arrayList);
                return;
            }
            if (iE == -1) {
                LogUtil.a("HiH_HiHealthBinder", "setUserData() appType is invalid");
                ktu.a(iCommonListener, 17, arrayList);
            } else {
                final kym kymVarA = ktx.c().a();
                this.f39437c.execute(new SingleRunnable() { // from class: kto.10
                    @Override // com.huawei.hihealthservice.runnable.SingleRunnable
                    public void doRun() throws Throwable {
                        LogUtil.a("HiH_HiHealthBinder", "setUserData userInfo = ", hiUserInfo, " package is ", kymVarA.j());
                        long userData = kud.a().setUserData(hiUserInfo, kymVarA);
                        if (userData > 0) {
                            LogUtil.a("HiH_HiHealthBinder", "setUserData() success , result = ", Long.valueOf(userData));
                            HiBroadcastUtil.e(kto.this.f39436b, 5);
                            liz.a().a(100, "setUserData", kymVarA);
                            arrayList.set(0, true);
                            ktu.d(iCommonListener, (int) userData, arrayList);
                            HiBroadcastUtil.b(kto.this.f39436b, 5);
                        } else {
                            LogUtil.a("HiH_HiHealthBinder", "setUserData() fail , result = ", Long.valueOf(userData));
                            ktu.a(iCommonListener, 14, arrayList);
                        }
                        LogUtil.a("HiH_HiHealthBinder", "setUserData() end! cost time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    }
                });
            }
        }
    }

    private void e(HiUserInfo hiUserInfo, ICommonListener iCommonListener, ArrayList<Boolean> arrayList) {
        LogUtil.d("HiH_HiHealthBinder", "setUserData caller:", Integer.valueOf(Binder.getCallingPid()));
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f39435a.c(uuidRandomUUID.toString(), iCommonListener);
        Intent intent = new Intent();
        intent.setClassName(this.f39436b.getPackageName(), "com.huawei.featureuserprofile.UserInfoModifyService");
        intent.setAction("modifyUserData");
        Bundle bundle = new Bundle();
        bundle.putString("uuid", uuidRandomUUID.toString());
        bundle.putParcelable("userInfo", hiUserInfo);
        intent.putExtras(bundle);
        ReleaseLogUtil.d("HiH_HiHealthBinder", "setUserData componentName ", this.f39436b.startService(intent));
        arrayList.set(0, true);
        ktu.d(iCommonListener, 0, arrayList);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchUserData(ICommonListener iCommonListener) throws RemoteException {
        ktr.b().c(iCommonListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void synCloud(HiSyncOption hiSyncOption, ICommonListener iCommonListener) throws Throwable {
        int iD = ktx.c().d(HuaweiHealth.c());
        ArrayList arrayList = new ArrayList(10);
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "synCloud() appType is invalid");
            arrayList.add(false);
            ktu.a(iCommonListener, 17, arrayList);
        } else {
            c(hiSyncOption.getStackTrace(), hiSyncOption.getSyncDataType());
            if (liq.j() && !HiCommonUtil.d) {
                b(hiSyncOption, iD);
            } else {
                e(hiSyncOption, iD);
            }
        }
    }

    private void b(final HiSyncOption hiSyncOption, final int i) {
        HandlerCenter.a().d(new Runnable() { // from class: ktq
            @Override // java.lang.Runnable
            public final void run() {
                this.f39462c.e(hiSyncOption, i);
            }
        }, liq.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(final HiSyncOption hiSyncOption, final int i) {
        final boolean zEquals = HuaweiHealth.c().equals(ljp.e(this.f39436b));
        final boolean zEquals2 = "com.huawei.bone".equals(ljp.e(this.f39436b));
        this.f39437c.execute(new SingleRunnable() { // from class: kto.8
            @Override // com.huawei.hihealthservice.runnable.SingleRunnable
            public void doRun() {
                LogUtil.a("HiH_HiHealthBinder", "synCloud");
                lgj.b(kto.this.f39436b).d();
                if (zEquals) {
                    lkb.i(kto.this.f39436b, lkb.j(kto.this.f39436b) + 1);
                } else if (zEquals2) {
                    lkb.g(kto.this.f39436b, lkb.f(kto.this.f39436b) + 1);
                } else {
                    LogUtil.d("HiH_HiHealthBinder", "appType is invalid");
                }
                lgp.f().e(hiSyncOption, i);
            }
        });
    }

    private void c(String str, int i) {
        if (CommonUtil.ap()) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("dev_manufacturer", Build.MANUFACTURER);
            linkedHashMap.put("sync_minute", String.valueOf(lsl.n(System.currentTimeMillis())));
            linkedHashMap.put(CrashHianalyticsData.STACK_TRACE, str);
            linkedHashMap.put("dataType", String.valueOf(i));
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SYNC_CLOUD_TRIGGERED_2129021.value(), linkedHashMap, false);
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void checkDataStatus(List list, ICommonListener iCommonListener) throws RemoteException {
        ArrayList arrayList = new ArrayList(10);
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "checkDataStatus() appType is invalid");
            arrayList.add(false);
            ktu.a(iCommonListener, 17, arrayList);
            return;
        }
        LogUtil.a("HiH_HiHealthBinder", "checkDataStatus");
        if (HiCommonUtil.b(list)) {
            LogUtil.j("HiH_HiHealthBinder", "checkDataStatus healthTypes is null");
            arrayList.add(false);
            ktu.a(iCommonListener, 7, arrayList);
            return;
        }
        int iC = kxi.c(this.f39436b, ktx.c().d());
        if (iC <= 0) {
            LogUtil.j("HiH_HiHealthBinder", "checkDataStatus error who is ", Integer.valueOf(iC));
            arrayList.add(false);
            ktu.a(iCommonListener, 2, arrayList);
        } else if (liq.d(this.f39436b, iC, (List<Integer>) list)) {
            arrayList.add(true);
            ktu.d(iCommonListener, 0, arrayList);
        } else {
            LogUtil.a("HiH_HiHealthBinder", "checkDataStatus() fail");
            arrayList.add(false);
            ktu.a(iCommonListener, 0, arrayList);
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void synCloudCancel() throws RemoteException {
        if (e()) {
            LogUtil.d("HiH_HiHealthBinder", "synCloudCancel");
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void hiLogin(HiAccountInfo hiAccountInfo, ICommonListener iCommonListener) throws RemoteException {
        ktr.b().a(hiAccountInfo, iCommonListener);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void hiLogout(ICommonListener iCommonListener) throws RemoteException {
        ktr.b().a(iCommonListener);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchAccountInfo(ICommonListener iCommonListener) throws RemoteException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(10);
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "fetchAccountInfo() appType is invalid");
            arrayList.add(false);
            ktu.a(iCommonListener, 17, arrayList);
            return;
        }
        HiAccountInfo hiAccountInfoFetchAccountInfo = kud.a().fetchAccountInfo(ktx.c().a());
        if (hiAccountInfoFetchAccountInfo == null) {
            LogUtil.a("HiH_HiHealthBinder", "fetchAccountInfo() fail ");
            arrayList.add(false);
            ktu.a(iCommonListener, 15, arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList(10);
            arrayList2.add(hiAccountInfoFetchAccountInfo);
            ktu.d(iCommonListener, 0, arrayList2);
        }
        LogUtil.a("HiH_HiHealthBinder", "fetchAccountInfo() end! totalTime is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void setGoalInfo(final int i, final List list, final ICommonListener iCommonListener) throws RemoteException {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final kym kymVarA = ktx.c().a();
        final ArrayList arrayList = new ArrayList(10);
        if (ktx.c().e() == -1) {
            LogUtil.a("HiH_HiHealthBinder", "setGoalInfo() appType is invalid");
            arrayList.add(false);
            ktu.a(iCommonListener, 17, arrayList);
            return;
        }
        this.f39437c.execute(new SingleRunnable() { // from class: kto.9
            @Override // com.huawei.hihealthservice.runnable.SingleRunnable
            public void doRun() {
                LogUtil.d("HiH_HiHealthBinder", "setGoalInfo goalInfos = ", list, "userId = ", Integer.valueOf(i));
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    arrayList.add(false);
                    ktu.a(iCommonListener, 7, arrayList);
                    return;
                }
                boolean zB = false;
                for (Object obj : list) {
                    if (obj instanceof HiGoalInfo) {
                        zB = kto.this.b(zB, (HiGoalInfo) obj, i, kymVarA);
                    }
                }
                LogUtil.a("HiH_HiHealthBinder", "setGoalInfo flag = ", Boolean.valueOf(zB));
                if (zB) {
                    HiBroadcastUtil.e(kto.this.f39436b, 6);
                    liz.a().a(101, "setGoalInfo", kymVarA);
                    arrayList.add(true);
                    ktu.d(iCommonListener, 0, arrayList);
                } else {
                    LogUtil.a("HiH_HiHealthBinder", "setGoalInfo() fail");
                    arrayList.add(false);
                    ktu.a(iCommonListener, 16, arrayList);
                }
                LogUtil.a("HiH_HiHealthBinder", "setGoalInfo() end! totalTime is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(boolean z, HiGoalInfo hiGoalInfo, int i, kym kymVar) {
        if (kud.a().setGoalInfo(i, kymVar.b(), hiGoalInfo)) {
            return true;
        }
        return z;
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchGoalInfo(int i, int i2, ICommonListener iCommonListener) throws RemoteException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(10);
        if (ktx.c().e() == -1) {
            ReleaseLogUtil.d("HiH_HiHealthBinder", "fetchGoalInfo() appType is invalid");
            arrayList.add(false);
            ktu.a(iCommonListener, 17, arrayList);
            return;
        }
        ReleaseLogUtil.d("HiH_HiHealthBinder", "fetchGoalInfo who = ", Integer.valueOf(i));
        List<HiGoalInfo> goalInfo = kud.a().getGoalInfo(i, i2, ktx.c().d());
        if (goalInfo == null) {
            LogUtil.a("HiH_HiHealthBinder", "fetchGoalInfo() fail");
            arrayList.add(false);
            ktu.a(iCommonListener, 16, arrayList);
        } else {
            ktu.d(iCommonListener, 0, goalInfo);
        }
        ReleaseLogUtil.d("HiH_HiHealthBinder", " fetchGoalInfo() end! totalTime is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.huawei.hihealth.IHiHealth
    public boolean setUserPreference(HiUserPreference hiUserPreference, boolean z) throws RemoteException {
        if (ktx.c().e() == -1) {
            ReleaseLogUtil.d("HiH_HiHealthBinder", "setUserPreference appTp=invalid");
            return false;
        }
        if (hiUserPreference == null) {
            ReleaseLogUtil.e("HiH_HiHealthBinder", "setUserPreference userPreference=null");
            return false;
        }
        kym kymVarA = ktx.c().a();
        int iE = kud.a().e();
        if (iE <= 0) {
            ReleaseLogUtil.e("HiH_HiHealthBinder", "setUserPreference userID<=0 appID=", Integer.valueOf(kymVarA.b()));
            return false;
        }
        hiUserPreference.setUserId(iE);
        boolean zB = kxs.c(this.f39436b).b(hiUserPreference);
        if ("custom.wear_common_setting".equals(hiUserPreference.getKey())) {
            LogUtil.a("HiH_HiHealthBinder", "wear setting is ", hiUserPreference, ", isSuccess=", Boolean.valueOf(zB));
        }
        ReleaseLogUtil.d("HiH_HiHealthBinder", "setUserPreference result=", Boolean.valueOf(zB));
        if (zB && z) {
            HiBroadcastUtil.e(this.f39436b, hiUserPreference.getKey());
            liz.a().a(102, hiUserPreference.getKey(), kymVarA);
            HiBroadcastUtil.b(this.f39436b, 7);
        }
        return zB;
    }

    @Override // com.huawei.hihealth.IHiHealth
    @Deprecated
    public HiUserPreference getUserPreference(String str) throws RemoteException {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        List<HiUserPreference> userPreferenceList = getUserPreferenceList(arrayList);
        if (HiCommonUtil.b(userPreferenceList)) {
            return new HiUserPreference();
        }
        return userPreferenceList.get(0);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public List<HiUserPreference> getUserPreferenceList(List<String> list) throws RemoteException {
        if (ktx.c().e() == -1) {
            ReleaseLogUtil.e("HiH_HiHealthBinder", "getUserPreferenceList appTp=invalid");
            return new ArrayList(0);
        }
        if (HiCommonUtil.b(list)) {
            ReleaseLogUtil.e("HiH_HiHealthBinder", "getUserPreferenceList keys=null");
            return new ArrayList(0);
        }
        int iD = ktx.c().d();
        int iE = kud.a().e();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iE <= 0) {
            ReleaseLogUtil.e("HiH_HiHealthBinder", "getUserPreferenceList who<=0 app=", Integer.valueOf(iD));
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(10);
        for (String str : list) {
            HiUserPreference hiUserPreferenceB = kxs.c(this.f39436b).b(iE, str);
            arrayList.add(hiUserPreferenceB);
            if (hiUserPreferenceB == null) {
                ReleaseLogUtil.e("HiH_HiHealthBinder", str, ":the key of hiUserPreference is null");
            }
        }
        ReleaseLogUtil.d("HiH_HiHealthBinder", " CT=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "hiUserPreferenceList size=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.hihealth.IHiHealth
    public boolean checkHiHealthLogin(String str) {
        if (!ktx.c().j()) {
            return true;
        }
        boolean zE = kxi.e(this.f39436b, str);
        LogUtil.d("HiH_HiHealthBinder", "checkHiHealthLogin isLogin = ", Boolean.valueOf(zE));
        return zE;
    }

    @Override // com.huawei.hihealth.IHiHealth
    public int getHiHealthVersionCode() {
        try {
            if (!e()) {
                return -2;
            }
            LogUtil.a("HiH_HiHealthBinder", "getHiHealthVersionCode = ", 20000001);
            return 20000001;
        } catch (RemoteException e) {
            ReleaseLogUtil.e("HiH_HiHealthBinder", "getHiHealthVersionCode : ", e.getMessage());
            return -2;
        }
    }

    public void c() {
        ReleaseLogUtil.d("HiH_HiHealthBinder", "onDestroy ");
        try {
            if (e()) {
                lfz.d(this.f39436b).onDestroy();
                if (liz.a() != null) {
                    liz.a().e();
                }
                ljh ljhVar = this.f39435a;
                if (ljhVar != null) {
                    ljhVar.a();
                }
                kud.a().b();
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.e("HiH_HiHealthBinder", "onDestroy : ", e.getMessage());
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void readDeviceInfo(IDataHiDeviceInfoListener iDataHiDeviceInfoListener) throws RemoteException {
        if (iDataHiDeviceInfoListener == null) {
            LogUtil.j("HiH_HiHealthBinder", "readDeviceInfo listener null");
            return;
        }
        LogUtil.a("HiH_HiHealthBinder", "readDeviceInfo enter");
        int iD = kxq.c().d(kwg.b().d(kwi.b().b(this.f39436b.getPackageName())), 0);
        List<Integer> listI = kwt.b().i(iD);
        if (HiCommonUtil.b(listI)) {
            LogUtil.a("HiH_HiHealthBinder", "getAllHealthClientList() deviceIDs is null who = ", Integer.valueOf(iD));
        }
        List<HiDeviceInfo> listC = kwy.b(this.f39436b).c(listI);
        if (listC == null || listC.isEmpty()) {
            LogUtil.a("HiH_HiHealthBinder", "getAllHealthClientList() deviceInfos is null devices = ", listI);
        }
        LogUtil.a("HiH_HiHealthBinder", "readDeviceInfo deviceInfos = ", listC);
        iDataHiDeviceInfoListener.onResult(listC);
    }

    public boolean e() throws RemoteException {
        return ktx.c().e() != -1;
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void queryKitAppInfo(IDataReadResultListener iDataReadResultListener) throws RemoteException {
        LogUtil.a("HiH_HiHealthBinder", "queryKitAppInfo enter");
        if (iDataReadResultListener == null) {
            return;
        }
        if (!e()) {
            LogUtil.j("HiH_HiHealthBinder", "queryKitAppInfo !checkPermission()");
            iDataReadResultListener.onResult(null, -1, -1);
            return;
        }
        List<HiHealthUserPermission> listA = kxj.a(this.f39436b).a();
        List<HiAppInfo> listC = kwi.b().c();
        if (njy.e(listA) || njy.e(listC)) {
            iDataReadResultListener.onResult(null, 0, 0);
            LogUtil.a("HiH_HiHealthBinder", "queryKitAppInfo userPermissions appInfoList null");
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        for (HiHealthUserPermission hiHealthUserPermission : listA) {
            if (hiHealthUserPermission != null && !arrayList.contains(Integer.valueOf(hiHealthUserPermission.getAppId()))) {
                arrayList.add(Integer.valueOf(hiHealthUserPermission.getAppId()));
            }
        }
        ArrayList arrayList2 = new ArrayList(10);
        for (HiAppInfo hiAppInfo : listC) {
            if (hiAppInfo != null && arrayList.contains(Integer.valueOf(hiAppInfo.getAppId()))) {
                arrayList2.add(hiAppInfo);
                arrayList.remove(Integer.valueOf(hiAppInfo.getAppId()));
            }
        }
        LogUtil.d("HiH_HiHealthBinder", "queryKitAppInfo finalAppList size = ", Integer.valueOf(arrayList2.size()));
        iDataReadResultListener.onResult(arrayList2, 0, 0);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void queryHealthKitPermission(int i, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        LogUtil.a("HiH_HiHealthBinder", "queryHealthKitPermission enter");
        if (iDataReadResultListener == null) {
            LogUtil.j("HiH_HiHealthBinder", "queryHealthKitPermission listener null");
        } else if (!e()) {
            LogUtil.j("HiH_HiHealthBinder", "queryHealthKitPermission !checkPermission()");
            iDataReadResultListener.onResult(null, -1, -1);
        } else {
            iDataReadResultListener.onResult(kxj.a(this.f39436b).b(i), 0, 0);
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void updateHealthKitPermission(int i, int i2, int i3, boolean z, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        LogUtil.a("HiH_HiHealthBinder", "updateHealthKitPermission enter");
        if (iDataReadResultListener == null) {
            LogUtil.j("HiH_HiHealthBinder", "updateHealthKitPermission listener null");
            return;
        }
        if (!e()) {
            LogUtil.j("HiH_HiHealthBinder", "updateHealthKitPermission !checkPermission()");
            iDataReadResultListener.onResult(null, -1, -1);
            return;
        }
        kxj.a(this.f39436b).e(i, i2, i3, z);
        iDataReadResultListener.onResult(null, 0, 0);
        if (z || !d.contains(Integer.valueOf(i2))) {
            return;
        }
        LogUtil.a("HiH_HiHealthBinder", "updateHealthKitPermission appId = ", Integer.valueOf(i), " scopeId = ", Integer.valueOf(i2));
        HiAppInfo hiAppInfoC = kwi.b().c(i);
        if (hiAppInfoC == null) {
            iDataReadResultListener.onResult(null, -1, -1);
            LogUtil.j("HiH_HiHealthBinder", "updateHealthKitPermission hiAppInfo null");
        } else {
            lew.a(i2, hiAppInfoC.getPackageName(), this.f39436b);
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void queryWearKitAppInfo(IDataReadResultListener iDataReadResultListener) throws RemoteException {
        LogUtil.a("HiH_HiHealthBinder", "queryKitAppInfo enter");
        if (iDataReadResultListener == null) {
            LogUtil.j("HiH_HiHealthBinder", "queryWearKitAppInfo callback null");
            return;
        }
        if (!e()) {
            LogUtil.j("HiH_HiHealthBinder", "queryKitAppInfo !checkPermission()");
            iDataReadResultListener.onResult(null, -1, -1);
            return;
        }
        List<WearKitPermission> listD = kxp.b().d();
        List<HiAppInfo> listC = kwi.b().c();
        if (njy.e(listD) || njy.e(listC)) {
            iDataReadResultListener.onResult(null, 0, 0);
            LogUtil.a("HiH_HiHealthBinder", "queryKitAppInfo userPermissions appInfoList null");
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        for (WearKitPermission wearKitPermission : listD) {
            if (wearKitPermission != null && !arrayList.contains(Integer.valueOf(wearKitPermission.getAppId()))) {
                arrayList.add(Integer.valueOf(wearKitPermission.getAppId()));
            }
        }
        ArrayList arrayList2 = new ArrayList(10);
        for (HiAppInfo hiAppInfo : listC) {
            if (hiAppInfo != null && arrayList.contains(Integer.valueOf(hiAppInfo.getAppId()))) {
                arrayList2.add(hiAppInfo);
                arrayList.remove(Integer.valueOf(hiAppInfo.getAppId()));
            }
        }
        LogUtil.d("HiH_HiHealthBinder", "queryKitAppInfo finalAppList size = ", Integer.valueOf(arrayList2.size()));
        iDataReadResultListener.onResult(arrayList2, 0, 0);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void queryWearKitPermission(int i, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        LogUtil.a("HiH_HiHealthBinder", "queryWearKitPermission enter");
        if (iDataReadResultListener == null) {
            LogUtil.j("HiH_HiHealthBinder", "queryWearKitPermission listener null");
        } else if (!e()) {
            LogUtil.j("HiH_HiHealthBinder", "queryWearKitPermission !checkPermission()");
            iDataReadResultListener.onResult(null, -1, -1);
        } else {
            iDataReadResultListener.onResult(kxp.b().c(i), 0, 0);
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void updateWearKitPermission(int i, int i2, boolean z, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        LogUtil.a("HiH_HiHealthBinder", "updateWearKitPermission enter");
        if (iDataReadResultListener == null) {
            LogUtil.j("HiH_HiHealthBinder", "updateWearKitPermission listener null");
        } else if (!e()) {
            LogUtil.j("HiH_HiHealthBinder", "updateWearKitPermission !checkPermission()");
            iDataReadResultListener.onResult(null, -1, -1);
        } else {
            kxp.b().a(i, i2, z);
            iDataReadResultListener.onResult(null, 0, 0);
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void setBinder(String str, IBinder iBinder, ICommonCallback iCommonCallback) throws RemoteException {
        LogUtil.a("HiH_HiHealthBinder", "setBinder enter");
        if (iCommonCallback == null) {
            LogUtil.j("HiH_HiHealthBinder", "setBinder listener null");
            return;
        }
        byte b2 = -1;
        if (!e()) {
            LogUtil.j("HiH_HiHealthBinder", "setBinder !checkPermission()");
            iCommonCallback.onResult(-1, "permission denied");
            return;
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1883740319) {
            if (iHashCode != -831090986) {
                if (iHashCode == -511440464 && str.equals("KitWearBinderFromPhoneService")) {
                    b2 = 2;
                }
            } else if (str.equals("TrackDeveloperService")) {
                b2 = 1;
            }
        } else if (str.equals("HealthCapabilityService")) {
            b2 = 0;
        }
        if (b2 == 0) {
            kyo.b(this.f39436b).c(iBinder);
            iCommonCallback.onResult(0, MonitorResult.SUCCESS);
        } else if (b2 == 1) {
            lbg.b(this.f39436b).e(iBinder);
            iCommonCallback.onResult(0, MonitorResult.SUCCESS);
        } else {
            if (b2 != 2) {
                return;
            }
            lbm.c(this.f39436b).b(iBinder);
            iCommonCallback.onResult(0, MonitorResult.SUCCESS);
        }
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchSportTypeList(HiDataReadOption hiDataReadOption, ICommonListener iCommonListener) throws RemoteException {
        ktr.b().e(hiDataReadOption, iCommonListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchSequenceDataBySportType(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ktr.b().a(hiDataReadOption, iDataReadResultListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchSequenceDataProBySportType(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ktr.b().b(hiDataReadProOption, iDataReadResultListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void aggregateSportStatData(HiSportStatDataAggregateOption hiSportStatDataAggregateOption, IAggregateListener iAggregateListener) throws RemoteException {
        ktr.b().b(hiSportStatDataAggregateOption, iAggregateListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void fetchDataSource(HiDataSourceFetchOption hiDataSourceFetchOption, IDataClientListener iDataClientListener) throws RemoteException {
        ktr.b().a(hiDataSourceFetchOption, iDataClientListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void readHiHealthDataPro(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ktr.b().e(hiDataReadProOption, iDataReadResultListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void readHiHealthDataEx(List list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ktr.b().d(list, iDataReadResultListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void aggregateHiHealthDataPro(HiDataAggregateProOption hiDataAggregateProOption, IAggregateListener iAggregateListener) throws RemoteException {
        ktr.b().d(hiDataAggregateProOption, iAggregateListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void aggregateHiHealthDataProEx(List list, IAggregateListenerEx iAggregateListenerEx) throws RemoteException {
        ktr.b().b((List<HiDataAggregateProOption>) list, iAggregateListenerEx, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void deleteHiHealthDataPro(HiDataDeleteProOption hiDataDeleteProOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        ktr.b().e(hiDataDeleteProOption, iDataOperateListener, false, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void deleteHiHealthDataProEx(List list, IDeleteListenerEx iDeleteListenerEx) throws RemoteException {
        ktr.b().e((List<HiDataDeleteProOption>) list, iDeleteListenerEx, false, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void setSampleConfig(List list, IDataOperateListener iDataOperateListener) throws RemoteException {
        ktr.b().e((List<HiSampleConfig>) list, iDataOperateListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void getSampleConfig(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ktr.b().e(hiSampleConfigProcessOption, iDataReadResultListener, true);
    }

    @Override // com.huawei.hihealth.IHiHealth
    public void deleteSampleConfig(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        ktr.b().c(hiSampleConfigProcessOption, iDataOperateListener, true);
    }
}
