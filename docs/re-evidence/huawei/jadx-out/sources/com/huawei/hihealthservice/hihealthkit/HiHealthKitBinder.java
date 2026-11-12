package com.huawei.hihealthservice.hihealthkit;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.ITrackDataForDeveloper;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.CharacteristicConstant;
import com.huawei.hihealth.DataReportModel;
import com.huawei.hihealth.HealthKitDictQuery;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiHealthDataQuery;
import com.huawei.hihealth.HiHealthDataQueryOption;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.HiUserPreferenceData;
import com.huawei.hihealth.IBaseCallback;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.IHiHealthKit;
import com.huawei.hihealth.IReadCallback;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hihealth.IRegisterRealTimeCallback;
import com.huawei.hihealth.ISportDataCallback;
import com.huawei.hihealth.ISubScribeCallback;
import com.huawei.hihealth.IWriteCallback;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hihealth.TrendQuery;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.Goal;
import com.huawei.hihealth.model.GoalInfo;
import com.huawei.hihealth.model.Notification;
import com.huawei.hihealth.model.SubscribeModel;
import com.huawei.hihealth.model.Subscriber;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.option.HiHealthCapabilityQuery;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hihealthservice.InsertExecutor;
import com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder;
import com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper;
import com.huawei.hihealthservice.hihealthkit.util.HiHealthKitDataChecker;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import defpackage.buh;
import defpackage.ktr;
import defpackage.kwi;
import defpackage.kxj;
import defpackage.kym;
import defpackage.kyo;
import defpackage.kzm;
import defpackage.kzw;
import defpackage.lbb;
import defpackage.lbe;
import defpackage.lbg;
import defpackage.lbh;
import defpackage.lbi;
import defpackage.lbj;
import defpackage.lbm;
import defpackage.lck;
import defpackage.lcm;
import defpackage.lcn;
import defpackage.lcr;
import defpackage.ldd;
import defpackage.led;
import defpackage.lee;
import defpackage.lek;
import defpackage.lel;
import defpackage.len;
import defpackage.leo;
import defpackage.lep;
import defpackage.ler;
import defpackage.let;
import defpackage.leu;
import defpackage.lev;
import defpackage.lew;
import defpackage.lfc;
import defpackage.lfe;
import defpackage.lfg;
import defpackage.liz;
import defpackage.ljo;
import defpackage.ljp;
import defpackage.ljv;
import defpackage.lkf;
import defpackage.lkg;
import defpackage.lkt;
import defpackage.njy;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthKitBinder extends IHiHealthKit.Stub {
    private Context f;
    private AppStatusHelper g;
    private IBaseCallback h;
    private Handler i;
    private kzw k;
    private InsertExecutor l;
    private HealthOpenSDK m;
    private Set<String> r;
    private static final String d = BaseApplication.getAppPackage();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f12364a = new ArrayList(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f12365b = new byte[0];
    private static final Object e = new Object();
    private boolean j = false;
    private volatile IBinder n = null;
    private Bundle s = new Bundle();
    private Map<String, Long> o = new ConcurrentHashMap();
    private int p = -1;
    private ConcurrentHashMap<Integer, ITrackDataForDeveloper> t = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBinder.DeathRecipient f12366c = new IBinder.DeathRecipient() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.4
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "binderDied");
            lbg.b(HiHealthKitBinder.this.f).d(new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.4.4
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str) {
                    ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "auto stop sport result code = ", Integer.valueOf(i));
                    if (i == 0) {
                        HiHealthKitBinder.this.n = null;
                    }
                }
            });
        }
    };

    /* JADX INFO: loaded from: classes10.dex */
    public interface Action {
        void operate() throws RemoteException;
    }

    public HiHealthKitBinder(Context context, InsertExecutor insertExecutor) {
        if (context == null || insertExecutor == null) {
            throw new lkt("HiHealthKitBinder() param is null");
        }
        this.f = context;
        this.l = insertExecutor;
        this.k = kzw.c();
        this.r = lcn.d();
        this.i = new Handler(this.f.getMainLooper()) { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.11
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                int i = message.what;
                if (i == 101) {
                    try {
                        HiHealthKitBinder.this.b(message);
                        return;
                    } catch (RemoteException e2) {
                        ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "handleMessage RemoteException = ", e2.getMessage());
                        return;
                    }
                }
                if (i == 102) {
                    HiHealthKitBinder.this.c();
                    buh.d("isAppInstalled", "true");
                } else {
                    ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "invalid msg: ", Integer.valueOf(message.what));
                }
            }
        };
        ktr.b().c(context, insertExecutor);
        this.l.execute(new Runnable() { // from class: kyp
            @Override // java.lang.Runnable
            public final void run() {
                this.f39638b.a();
            }
        });
        if ("true".equals(buh.e("isAppInstalled"))) {
            LogUtil.a("HiHlthKitBnd", "direct init");
            c();
        } else {
            this.i.sendEmptyMessageDelayed(102, 10000L);
        }
        lfc.b(this.f).c();
    }

    public /* synthetic */ void a() {
        try {
            this.k.a();
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "HiHealthKitBinder() getCurrentAppId e = ", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("HiHlthKitBnd", "start init sdk, init result before ", Boolean.valueOf(this.j));
        if (this.j) {
            return;
        }
        try {
            HealthOpenSDK healthOpenSDK = new HealthOpenSDK();
            this.m = healthOpenSDK;
            healthOpenSDK.initSDK(this.f, new d(), "Health Kit");
        } catch (Exception unused) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "init openSDK error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) throws RemoteException {
        boolean zC = AuthorizationUtils.c(BaseApplication.getContext());
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "handleAuthMessage requestAuthorization isAuthPermitted = ", Boolean.valueOf(zC));
        HashMap map = new HashMap(16);
        IBaseCallback iBaseCallback = this.h;
        if (iBaseCallback == null) {
            return;
        }
        if (!zC) {
            iBaseCallback.onResult(1003, map);
            return;
        }
        map.put("flag", String.valueOf(message.arg1));
        Intent intent = new Intent();
        String str = d;
        intent.setClassName(str, "com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAuthActivity");
        intent.setPackage(str);
        intent.setFlags(268435456);
        intent.addFlags(134217728);
        intent.addFlags(524288);
        intent.addFlags(8388608);
        len lenVar = new len();
        String str2 = (String) message.obj;
        try {
            Bundle data = message.getData();
            int[] intArray = data.getIntArray("writeTypes");
            int[] intArray2 = data.getIntArray("readTypes");
            intent.putExtra("third_party_package_name", str2);
            intent.putExtra("writeTypes", intArray);
            intent.putExtra("readTypes", intArray2);
            intent.putExtra("uidTypes", message.arg1);
            intent.putExtra(MapKeyNames.APP_INFO, e(str2));
            this.f.startActivity(intent);
            this.h.onResult(0, map);
            c("requestAuthorization", 0, lenVar, str2);
        } catch (Exception unused) {
            ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "handleAuthMessage Exception");
            this.h.onResult(4, map);
            c("requestAuthorization", 4, lenVar, str2);
        } finally {
            this.h = null;
        }
    }

    private HiAppInfo e(String str) {
        HiAppInfo hiAppInfoD = kwi.b().d(str);
        if (hiAppInfoD != null) {
            return hiAppInfoD;
        }
        HiAppInfo hiAppInfoA = ljp.a(this.f, str);
        if (hiAppInfoA == null) {
            return null;
        }
        kwi.b().d(hiAppInfoA, 0);
        return kwi.b().d(str);
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void setBinder(IBinder iBinder) {
        synchronized (e) {
            if (iBinder != null) {
                if (this.n == null) {
                    this.p = Binder.getCallingUid();
                    this.n = iBinder;
                    try {
                        this.n.linkToDeath(this.f12366c, 0);
                    } catch (RemoteException e2) {
                        ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "setBinder RemoteException: ", e2.getMessage());
                    }
                }
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getGender(int i, ICommonListener iCommonListener) throws RemoteException {
        b(iCommonListener, "getGender", 101001);
    }

    private void b(final ICommonListener iCommonListener, String str, int i) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", str);
        len lenVar = new len();
        if (a(iCommonListener, str, lenVar) || !lcm.e(str, iCommonListener) || c(str, i, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzj
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i2) throws RemoteException {
                iCommonListener.onSuccess(i2, null);
            }
        })) {
            return;
        }
        LogUtil.a("HiHlthKitBnd", str, " appId = ", Integer.valueOf(this.k.g()));
        Context context = this.f;
        new HiHealthKitQueryHelper(context, lkf.d(context)).a(lenVar, iCommonListener, str);
    }

    private boolean c(String str, int i, String str2, len lenVar, HiHealthKitExtendBinder.Action action) throws RemoteException {
        int iE = ldd.b(this.f).e(i, lkf.d(this.f), !this.r.contains(str));
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "cpHmsAuthResult:", Integer.valueOf(iE));
        if (iE == 8) {
            if (this.g == null) {
                this.g = new AppStatusHelper(this.f);
            }
            iE = this.g.a(HiScopeUtil.b(BaseApplication.getContext(), lkf.d(this.f)), this.r.contains(str) ? 2 : 1, i);
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "beta scope auth result: ", Integer.valueOf(iE));
        }
        if (iE == 0 && lek.a(str, i)) {
            return false;
        }
        ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", str, " permission deny, appId = ", Integer.valueOf(this.k.a()), ", type =", Integer.valueOf(i));
        action.operate(iE != 0 ? iE : 1001);
        c(str, iE, str2, lenVar);
        return true;
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getBirthday(int i, ICommonListener iCommonListener) throws RemoteException {
        b(iCommonListener, "getBirthday", 101001);
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getHeight(int i, ICommonListener iCommonListener) throws RemoteException {
        b(iCommonListener, "getHeight", 101002);
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getWeight(int i, ICommonListener iCommonListener) throws RemoteException {
        b(iCommonListener, "getWeight", 101002);
    }

    private void a(HiHealthDataQuery hiHealthDataQuery, final IDataReadResultListener iDataReadResultListener) {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter querySleepWakeTime, type = ", 22104);
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(hiHealthDataQuery.getStartTime());
        hiDataReadOption.setEndTime(hiHealthDataQuery.getEndTime());
        hiDataReadOption.setType(new int[]{22104});
        HiHealthManager.d(this.f).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.14
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "querySleepWakeTime resultCode: ", Integer.valueOf(i));
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray != null) {
                    try {
                        if (sparseArray.size() > 0) {
                            iDataReadResultListener.onResult(HiHealthKitBinder.this.a((List<HiHealthData>) sparseArray.get(22104)), 0, 2);
                            return;
                        }
                    } catch (RemoteException e2) {
                        ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "querySleepWakeTime RemoteException: ", e2.getMessage());
                        return;
                    }
                }
                iDataReadResultListener.onResult(null, lck.c(i), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthKitData> a(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(list)) {
            int i = 0;
            long startTime = list.get(0).getStartTime();
            long endTime = list.get(0).getEndTime();
            while (i < list.size()) {
                HiHealthData hiHealthData = list.get(i);
                long startTime2 = hiHealthData.getStartTime();
                long endTime2 = hiHealthData.getEndTime();
                if (startTime - endTime2 > 60000) {
                    HiHealthKitData hiHealthKitData = new HiHealthKitData();
                    hiHealthKitData.setStartTime(startTime);
                    hiHealthKitData.setEndTime(endTime);
                    arrayList.add(hiHealthKitData);
                    endTime = endTime2;
                }
                if (i == list.size() - 1) {
                    HiHealthKitData hiHealthKitData2 = new HiHealthKitData();
                    hiHealthKitData2.setStartTime(startTime2);
                    hiHealthKitData2.setEndTime(endTime);
                    arrayList.add(hiHealthKitData2);
                }
                i++;
                startTime = startTime2;
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void querySleepWakeTime(int i, HiHealthDataQuery hiHealthDataQuery, int i2, final IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "querySleepWakeTime");
        len lenVar = new len();
        if (a(iDataReadResultListener, "querySleepWakeTime", lenVar) || b(hiHealthDataQuery, iDataReadResultListener, "querySleepWakeTime", lenVar) || !lcm.e("querySleepWakeTime", iDataReadResultListener) || c("querySleepWakeTime", hiHealthDataQuery.getSampleType(), null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kyw
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i3) throws RemoteException {
                this.f39645a.d(iDataReadResultListener, i3);
            }
        })) {
            return;
        }
        a(hiHealthDataQuery, e(iDataReadResultListener, "querySleepWakeTime", lenVar));
    }

    public /* synthetic */ void d(IDataReadResultListener iDataReadResultListener, int i) throws RemoteException {
        if (!lep.b(this.f)) {
            i = 0;
        }
        iDataReadResultListener.onResult(null, i, 2);
    }

    private boolean b(HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener, String str, len lenVar) throws RemoteException {
        if (hiHealthDataQuery != null) {
            return false;
        }
        ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "query is null");
        iDataReadResultListener.onResult(null, 2, 2);
        e(str, 2, lenVar);
        return true;
    }

    private IDataReadResultListener e(final IDataReadResultListener iDataReadResultListener, final String str, final len lenVar) {
        final String strD = lkf.d(this.f);
        return new IDataReadResultListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.15
            @Override // com.huawei.hihealth.IDataReadResultListener
            public void onResult(List list, int i, int i2) throws RemoteException {
                if (i2 == 2) {
                    HiHealthKitBinder.this.c(str, i, lenVar, strD);
                }
                iDataReadResultListener.onResult(list, i, i2);
            }
        };
    }

    private boolean d(HiHealthDataQueryOption hiHealthDataQueryOption) {
        boolean z = true;
        if (hiHealthDataQueryOption == null) {
            return true;
        }
        if (hiHealthDataQueryOption.getLimit() < 0 || hiHealthDataQueryOption.getOffset() < 0 || (hiHealthDataQueryOption.getOrder() != 0 && hiHealthDataQueryOption.getOrder() != 1)) {
            z = false;
        }
        if (!z) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "checkHiHealthDataQuery invalid");
        }
        return z;
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void queryData(HealthKitDictQuery healthKitDictQuery, final IDataReadResultListener iDataReadResultListener) throws RemoteException {
        len lenVar = new len();
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "queryData");
        if (a(iDataReadResultListener, "queryData", lenVar) || b(healthKitDictQuery, iDataReadResultListener, "queryData", lenVar)) {
            return;
        }
        int sampleType = healthKitDictQuery.getSampleType();
        if (!let.c(sampleType)) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "queryData type is not support.");
            iDataReadResultListener.onResult(null, 30, 2);
            e("queryData", 30, lenVar);
            return;
        }
        if (lcm.e("queryData", iDataReadResultListener)) {
            if (HiHealthKitDataChecker.a(healthKitDictQuery.getStartTime(), healthKitDictQuery.getEndTime()) || !HiHealthKitDataChecker.c(healthKitDictQuery)) {
                ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", lcr.b(2));
                iDataReadResultListener.onResult(null, 2, 2);
                e("queryData", 2, lenVar);
                return;
            }
            if (c("queryData", lek.e(sampleType), String.valueOf(sampleType), lenVar, new HiHealthKitExtendBinder.Action() { // from class: kze
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.d.e(iDataReadResultListener, i);
                }
            })) {
                return;
            }
            Context context = this.f;
            lbb lbbVar = new lbb(context, lkf.d(context), lenVar);
            Boolean bool = healthKitDictQuery.getBoolean("dataSourceQuery");
            boolean zBooleanValue = bool.booleanValue();
            Boolean bool2 = healthKitDictQuery.getBoolean("aggregateQuery");
            boolean zBooleanValue2 = bool2.booleanValue();
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "queryData isDatasourceQuery: ", bool, ", isAggregateQuery: ", bool2);
            if (zBooleanValue) {
                lbbVar.c(healthKitDictQuery, iDataReadResultListener, b("queryData", sampleType));
            } else if (zBooleanValue2) {
                lbbVar.a(healthKitDictQuery, iDataReadResultListener, b("queryData", sampleType));
            } else {
                lbbVar.b(healthKitDictQuery, iDataReadResultListener, b("queryData", sampleType));
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void execQuery(int i, HiHealthDataQuery hiHealthDataQuery, int i2, final IDataReadResultListener iDataReadResultListener) throws RemoteException {
        len lenVar = new len();
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "execQuery");
        if (a(iDataReadResultListener, "execQuery", lenVar) || b(hiHealthDataQuery, iDataReadResultListener, "execQuery", lenVar)) {
            return;
        }
        int sampleType = hiHealthDataQuery.getSampleType();
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "execQuery dataType: ", Integer.valueOf(sampleType));
        if (lek.c() && sampleType == 40002) {
            lfg.b(hiHealthDataQuery, iDataReadResultListener, this.m);
            return;
        }
        if (lcm.e("execQuery", iDataReadResultListener)) {
            if (!d(hiHealthDataQuery.getHiHealthDataQueryOption()) || c(hiHealthDataQuery, sampleType) || HiHealthKitDataChecker.a(hiHealthDataQuery.getStartTime(), hiHealthDataQuery.getEndTime())) {
                lenVar.d(this.f, new ler("execQuery", 0, lkf.d(this.f), null, String.valueOf(sampleType)).e(2));
                iDataReadResultListener.onResult(null, 2, 2);
            } else {
                if (c("execQuery", lek.e(sampleType), String.valueOf(sampleType), lenVar, new HiHealthKitExtendBinder.Action() { // from class: kyz
                    @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                    public final void operate(int i3) throws RemoteException {
                        this.d.c(iDataReadResultListener, i3);
                    }
                })) {
                    return;
                }
                c(hiHealthDataQuery, iDataReadResultListener, b("execQuery", sampleType));
            }
        }
    }

    private boolean c(HiHealthDataQuery hiHealthDataQuery, int i) {
        if (let.d(lkf.d(this.f)) > 2) {
            return false;
        }
        if (i != 10001 && i != 10006 && i != 10002) {
            return false;
        }
        boolean z = hiHealthDataQuery.getEndTime() - hiHealthDataQuery.getStartTime() > 2592000000L;
        if (z) {
            ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "Kit SDK Version <= 2, dataType is one of [10001,10006,10002], The interval cannot exceed 30 days.");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void e(IDataReadResultListener iDataReadResultListener, int i) throws RemoteException {
        if (lep.b(this.f)) {
            iDataReadResultListener.onResult(null, i, 2);
        } else if (let.e(lkf.d(this.f), 2)) {
            iDataReadResultListener.onResult(null, i, 2);
        } else {
            iDataReadResultListener.onResult(null, 0, 2);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getCount(int i, HiHealthDataQuery hiHealthDataQuery, final IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "getCount");
        len lenVar = new len();
        if (a(iDataReadResultListener, "getCount", lenVar) || b(hiHealthDataQuery, iDataReadResultListener, "getCount", lenVar) || !lcm.e("getCount", iDataReadResultListener)) {
            return;
        }
        int sampleType = hiHealthDataQuery.getSampleType();
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "getCount dataType = ", Integer.valueOf(sampleType));
        if (c("getCount", lek.e(sampleType), String.valueOf(sampleType), lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzh
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i2) throws RemoteException {
                this.f39660b.a(iDataReadResultListener, i2);
            }
        })) {
            return;
        }
        c(hiHealthDataQuery, iDataReadResultListener, b("getCount", sampleType));
    }

    public /* synthetic */ void a(IDataReadResultListener iDataReadResultListener, int i) throws RemoteException {
        if (let.e(lkf.d(this.f), 2)) {
            iDataReadResultListener.onResult(null, i, 2);
        } else {
            iDataReadResultListener.onResult(null, 1, 2);
        }
    }

    private void c(HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener, lbh lbhVar) throws RemoteException {
        new HiHealthKitQueryHelper(this.f, lbhVar.d()).a(hiHealthDataQuery, iDataReadResultListener, lbhVar);
    }

    private lbh b(String str, int i) {
        int iE = ldd.b(this.f).e(101201, lkf.d(this.f), true);
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "getQueryParameterChannel auth result: ", Integer.valueOf(iE));
        if (iE == 8) {
            if (this.g == null) {
                this.g = new AppStatusHelper(this.f);
            }
            iE = this.g.a(HiScopeUtil.b(BaseApplication.getContext(), lkf.d(this.f)), this.r.contains(str) ? 2 : 1, 101201);
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "getQueryParameterChannel beta scope auth result: ", Integer.valueOf(iE));
        }
        return new lbh(iE == 0, str, lkf.d(this.f), Integer.toString(i));
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void deleteSample(int i, HiHealthKitData hiHealthKitData, IDataOperateListener iDataOperateListener) throws RemoteException {
        LogUtil.a("HiHlthKitBnd", "deleteSample , type: ", Integer.valueOf(hiHealthKitData.getType()), ", startTime: ", Long.valueOf(hiHealthKitData.getStartTime()), ", endTime", Long.valueOf(hiHealthKitData.getEndTime()));
        e(Arrays.asList(hiHealthKitData), iDataOperateListener, "deleteSample");
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void deleteSamples(int i, List list, IDataOperateListener iDataOperateListener) throws RemoteException {
        e(list, iDataOperateListener, "deleteSamples");
    }

    private void e(List list, final IDataOperateListener iDataOperateListener, String str) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", str);
        len lenVar = new len();
        if (a(iDataOperateListener, str, lenVar)) {
            return;
        }
        Iterator<Integer> it = kzw.e((List<HiHealthKitData>) list).iterator();
        while (it.hasNext()) {
            if (!let.e(str, it.next().intValue(), e(str, 30), iDataOperateListener)) {
                return;
            }
        }
        if (lcm.e(str, iDataOperateListener)) {
            LogUtil.a("HiHlthKitBnd", str, " appId:", Integer.valueOf(kwi.b().b(lkf.d(this.f))), " userId:", Integer.valueOf(this.k.i()));
            if (!HiHealthKitDataChecker.d(list, HiHealthKitDataChecker.MethodType.DELETE_SAMPLES, true)) {
                iDataOperateListener.onResult(2, lcr.e(2));
                e(str, 2, lenVar);
                LogUtil.j("R_HiH_HiHlthKitBnd", str, lcr.b(2));
                return;
            }
            int iD = kzw.d(list);
            if (c(str, iD, String.valueOf(iD), lenVar, new HiHealthKitExtendBinder.Action() { // from class: kyv
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    iDataOperateListener.onResult(i, HiHealthKitBinder.f12364a);
                }
            })) {
                return;
            }
            HiDataDeleteOption hiDataDeleteOptionE = e((List<HiHealthKitData>) list);
            if (1 == c((List<HiHealthKitData>) list)) {
                ktr.b().e(HiDataDeleteProOption.builder().c(hiDataDeleteOptionE).b((Integer) 0).d(0).a((Integer) 1).c(), e(str, new int[]{iD}, iDataOperateListener, new ArrayList(), lenVar), true, false);
            } else {
                ktr ktrVarB = ktr.b();
                if (iD == 30029) {
                    iD = 30001;
                }
                ktrVarB.e(hiDataDeleteOptionE, e(str, new int[]{iD}, iDataOperateListener, new ArrayList(), lenVar), true, false);
            }
        }
    }

    private static int c(List<HiHealthKitData> list) {
        if (njy.e(list)) {
            return 0;
        }
        return String.valueOf(1).equals(list.get(0).getString("deleteInterval")) ? 1 : 0;
    }

    private <T> boolean a(T t, String str, len lenVar) {
        if (t != null) {
            return false;
        }
        e(str, 2, lenVar);
        ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", str, " listener is null");
        return true;
    }

    private len e(String str, int i) {
        return new len(this.f, new ler(str, i, lkf.d(this.f)));
    }

    private HiDataDeleteOption e(List<HiHealthKitData> list) {
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        int type = list.get(0).getType();
        LogUtil.a("HiHlthKitBnd", "deleteSamplesImpl type = ", Integer.valueOf(type));
        hiDataDeleteOption.setTypes(leo.d(type));
        for (HiHealthKitData hiHealthKitData : list) {
            hiDataDeleteOption.addTimeInterval(new HiTimeInterval(hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime()));
        }
        return hiDataDeleteOption;
    }

    private IDataOperateListener e(final String str, final int[] iArr, final IDataOperateListener iDataOperateListener, final List<String> list, final len lenVar) {
        return new IDataOperateListener() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.13
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.huawei.hihealth.IDataOperateListener
            public void onResult(int i, List list2) {
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "HiHealthApiManager deleteHiHealthData errorCode = ", Integer.valueOf(i));
                int iC = lck.c(i);
                ler lerVar = new ler(str, iC, lkf.d(HiHealthKitBinder.this.f), null, String.valueOf(iArr[0]));
                try {
                    kym kymVarH = HiHealthKitBinder.this.k.h();
                    if (!CommonUtil.ca()) {
                        liz.a().c(lkg.e(iArr), ArkUIXConstants.DELETE, kymVarH);
                    }
                    list.add(lcr.b(iC));
                    iDataOperateListener.onResult(iC, list);
                    lenVar.d(HiHealthKitBinder.this.f, lerVar);
                } catch (RemoteException e2) {
                    ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "deleteHiHealthData onResult RemoteException = ", e2.getMessage());
                    try {
                        list.add(lcr.b(4));
                        iDataOperateListener.onResult(4, list);
                    } catch (RemoteException e3) {
                        ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "deleteHiHealthData onResult RemoteException2 = ", e3.getMessage());
                    }
                    lenVar.d(HiHealthKitBinder.this.f, lerVar.e(4));
                }
            }
        };
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void saveSample(int i, HiHealthKitData hiHealthKitData, IDataOperateListener iDataOperateListener) throws RemoteException {
        c(Arrays.asList(hiHealthKitData), iDataOperateListener, "saveSample");
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void saveSamples(int i, List<HiHealthKitData> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        c(list, iDataOperateListener, "saveSamples");
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public String getCategory(int i) {
        return HiHealthDataType.d(i).name();
    }

    private void c(List<HiHealthKitData> list, final IDataOperateListener iDataOperateListener, String str) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", str);
        final len lenVar = new len();
        if (a(iDataOperateListener, str, lenVar)) {
            return;
        }
        List<Integer> listE = kzw.e(list);
        Iterator<Integer> it = listE.iterator();
        while (it.hasNext()) {
            if (!let.e(str, it.next().intValue(), e(str, 30), iDataOperateListener)) {
                return;
            }
        }
        if (lcm.e(str, iDataOperateListener)) {
            if (!HiHealthKitDataChecker.d(list, HiHealthKitDataChecker.MethodType.SAVE_SAMPLES, false)) {
                e(str, 2, lenVar);
                iDataOperateListener.onResult(2, lcr.e(2));
                LogUtil.j("R_HiH_HiHlthKitBnd", str, lcr.b(2));
                return;
            }
            String strD = lkf.d(this.f);
            final ArrayList arrayList = new ArrayList(listE.size());
            Iterator<Integer> it2 = listE.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                if (c(str, iIntValue, String.valueOf(iIntValue), lenVar, new HiHealthKitExtendBinder.Action() { // from class: kza
                    @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                    public final void operate(int i) throws RemoteException {
                        this.e.a(iDataOperateListener, i);
                    }
                })) {
                    return;
                } else {
                    arrayList.add(new ler(str, 0, strD, null, String.valueOf(iIntValue)));
                }
            }
            lbe lbeVarC = lbe.c();
            if (lbeVarC == null) {
                ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "HiHealthKitInsertHelper is null");
                iDataOperateListener.onResult(4, null);
                d(lenVar, arrayList, 4);
            } else {
                lbeVarC.b(list, new IDataOperateListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.12
                    @Override // com.huawei.hihealth.IDataOperateListener
                    public void onResult(int i, List list2) throws RemoteException {
                        int iC = lck.c(i);
                        iDataOperateListener.onResult(iC, list2);
                        HiHealthKitBinder.this.d(lenVar, arrayList, iC);
                    }
                }, lkf.e(strD, false));
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "addPackageNameToSharedPreferences result: ", Boolean.valueOf(lee.c(list, strD)));
            }
        }
    }

    public /* synthetic */ void a(IDataOperateListener iDataOperateListener, int i) throws RemoteException {
        iDataOperateListener.onResult(b(i), null);
    }

    private int b(int i) {
        if (let.e(lkf.d(this.f), 2)) {
            return i;
        }
        return 0;
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void requestAuthorization(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "requestAuthorization");
        len lenVar = new len();
        if (a(iBaseCallback, "requestAuthorization", lenVar)) {
            return;
        }
        if (!kzw.b(iArr2, iArr)) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "requestAuthorization", " isKitValidTypes false");
            iBaseCallback.onResult(7, null);
            e("requestAuthorization", 7, lenVar);
            return;
        }
        if (b(iArr, iArr2, iBaseCallback, "requestAuthorization", lenVar) || a(iBaseCallback, "requestAuthorization", lenVar)) {
            return;
        }
        try {
            int callingUid = Binder.getCallingUid();
            LogUtil.a("HiHlthKitBnd", "startActivity before: ", Long.valueOf(System.currentTimeMillis()));
            c(i, callingUid);
            this.h = iBaseCallback;
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            messageObtain.arg1 = callingUid;
            messageObtain.obj = lkf.d(this.f);
            lev levVarE = lev.e(this.f);
            Bundle bundle = new Bundle();
            bundle.putIntArray("writeTypes", levVarE.b(iArr, false));
            bundle.putIntArray("readTypes", levVarE.b(iArr2, true));
            messageObtain.setData(bundle);
            this.i.sendMessage(messageObtain);
        } catch (Exception e2) {
            ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "requestAuthorization Exception: ", e2.getMessage());
            iBaseCallback.onResult(4, null);
            e("requestAuthorization", 4, lenVar);
        }
    }

    private boolean b(int[] iArr, int[] iArr2, IBaseCallback iBaseCallback, String str, len lenVar) throws RemoteException {
        lev levVarE = lev.e(this.f);
        int[] iArrB = levVarE.b(iArr, false);
        int[] iArrB2 = levVarE.b(iArr2, true);
        if (iArrB.length != 0 || iArrB2.length != 0) {
            return false;
        }
        ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", str, " scope deny ");
        iBaseCallback.onResult(1002, null);
        e(str, 1002, lenVar);
        return true;
    }

    private void c(int i, int i2) {
        String string;
        LogUtil.a("HiHlthKitBnd", "checkFlagPermission ", Integer.valueOf(i), Constants.LINK, Integer.valueOf(i2), Constants.LINK, lkf.d(this.f));
        kwi kwiVarB = kwi.b();
        int iB = kwiVarB.b(lkf.d(this.f));
        if (i2 != i) {
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "deleteHealthUserPermissionData appId = ", Integer.valueOf(iB), " result = ", Integer.valueOf(kxj.a(this.f).a(iB)));
        }
        HiAppInfo hiAppInfoC = kwiVarB.c(iB);
        if (hiAppInfoC == null) {
            return;
        }
        int iA = ljo.a(hiAppInfoC.getSignature());
        PackageManager packageManager = this.f.getPackageManager();
        try {
            string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(lkf.d(this.f), 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "checkFlagPermission NameNotFoundException");
            string = "";
        }
        Context context = this.f;
        String strA = HsfSignValidator.a(context, lkf.d(context));
        if (iA == i2 && string.equals(hiAppInfoC.getAppName())) {
            return;
        }
        hiAppInfoC.setSignature(ljp.d(strA, i2));
        Context context2 = this.f;
        HiAppInfo hiAppInfoD = ljp.d(context2, lkf.d(context2));
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "getAppInfo packageName = ", lkf.d(this.f));
        if (hiAppInfoD != null) {
            hiAppInfoC.setAppName(hiAppInfoD.getAppName());
            hiAppInfoC.setVersion(hiAppInfoD.getVersion());
            hiAppInfoC.setPackageName(hiAppInfoD.getPackageName());
            hiAppInfoC.setCloudCode(hiAppInfoD.getCloudCode());
        }
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "updateAppInfo result = ", Integer.valueOf(kwiVarB.d(hiAppInfoC)));
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getDataAuthStatus(int i, int i2, IDataOperateListener iDataOperateListener) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "getDataAuthStatus");
        len lenVar = new len();
        if (!a(iDataOperateListener, "getDataAuthStatus", lenVar) && lcm.e("getDataAuthStatus", iDataOperateListener)) {
            c(i, Binder.getCallingUid());
            int iB = kwi.b().b(lkf.d(this.f));
            LogUtil.a("HiHlthKitBnd", "getDataAuthStatus", " appId:", Integer.valueOf(iB));
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(kxj.a(this.f).c(iB, i2).getAllowWrite()));
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "getDataAuthStatus: ", HiJsonUtil.d(arrayList));
            iDataOperateListener.onResult(0, arrayList);
            e("getDataAuthStatus", 0, lenVar);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getDataAuthStatusEx(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "getDataAuthStatusEx");
        len lenVar = new len();
        if (!a(iBaseCallback, "getDataAuthStatusEx", lenVar) && lcm.e("getDataAuthStatusEx", iBaseCallback)) {
            c(i, Binder.getCallingUid());
            Context context = this.f;
            new HiHealthKitQueryHelper(context, lkf.d(context)).c(iArr, iArr2, iBaseCallback);
            e("getDataAuthStatusEx", 0, lenVar);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void startReadingHeartRate(int i, final IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        final String str = "startReadingHeartRate";
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "startReadingHeartRate");
        len lenVar = new len();
        if (a(iRealTimeDataCallback, "startReadingHeartRate", lenVar) || !lcm.e("startReadingHeartRate", iRealTimeDataCallback) || c("startReadingHeartRate", 50001, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzf
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i2) throws RemoteException {
                this.f39657b.a(iRealTimeDataCallback, i2);
            }
        })) {
            return;
        }
        final String strD = lkf.d(this.f);
        LogUtil.d("HiHlthKitBnd", "startReadingHeartRate", " packageName:", strD);
        lbm.c(this.f).g(strD, b(iRealTimeDataCallback, "startReadingHeartRate", new Action() { // from class: kzl
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.Action
            public final void operate() throws RemoteException {
                this.f39664c.c(strD, str);
            }
        }, lenVar));
        lew.e(strD, 50001, "ReadingHeartRate", iRealTimeDataCallback, null);
    }

    public /* synthetic */ void a(IRealTimeDataCallback iRealTimeDataCallback, int i) throws RemoteException {
        iRealTimeDataCallback.onResult(b(i));
    }

    public /* synthetic */ void c(String str, String str2) throws RemoteException {
        lbm.c(this.f).n(str, new c(str2));
    }

    private IRealTimeDataCallback b(final IRealTimeDataCallback iRealTimeDataCallback, final String str, final Action action, final len lenVar) {
        final String strD = lkf.d(this.f);
        return new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.19
            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onResult(int i) throws RemoteException {
                IBinder iBinderAsBinder = iRealTimeDataCallback.asBinder();
                if (iBinderAsBinder != null && !iBinderAsBinder.pingBinder() && action != null) {
                    ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "getProxyIRealTimeDataListener onResult pingBinder ", Boolean.valueOf(iBinderAsBinder.pingBinder()));
                    action.operate();
                    return;
                }
                int iJ = lck.j(i);
                if (let.e(strD, 2)) {
                    iRealTimeDataCallback.onResult(iJ);
                } else {
                    iRealTimeDataCallback.onResult(i);
                }
                HiHealthKitBinder.this.c(str, iJ, lenVar, strD);
            }

            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onChange(int i, String str2) throws RemoteException {
                IBinder iBinderAsBinder = iRealTimeDataCallback.asBinder();
                if (iBinderAsBinder != null && !iBinderAsBinder.pingBinder()) {
                    ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "getProxyIRealTimeDataListener onChange pingBinder ", Boolean.valueOf(iBinderAsBinder.pingBinder()));
                    action.operate();
                } else if (let.e(strD, 2) && !"startReadingAtrial".equals(str)) {
                    iRealTimeDataCallback.onChange(lck.j(i), str2);
                } else {
                    iRealTimeDataCallback.onChange(i, str2);
                }
            }
        };
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void stopReadingHeartRate(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "stopReadingHeartRate");
        len lenVar = new len();
        if (!a(iRealTimeDataCallback, "stopReadingHeartRate", lenVar) && lcm.e("stopReadingHeartRate", iRealTimeDataCallback)) {
            LogUtil.d("HiHlthKitBnd", "stopReadingHeartRate", " packageName:", lkf.d(this.f));
            lbm.c(this.f).n(lkf.d(this.f), b(iRealTimeDataCallback, "stopReadingHeartRate", (Action) null, lenVar));
            lew.e(lkf.d(this.f), "ReadingHeartRate");
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void startReadingRRI(int i, final IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        final String str = "startReadingRRI";
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "startReadingRRI");
        len lenVar = new len();
        if (a(iRealTimeDataCallback, "startReadingRRI", lenVar) || !lcm.e("startReadingRRI", iRealTimeDataCallback) || c("startReadingRRI", 50001, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kyy
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i2) throws RemoteException {
                this.e.d(iRealTimeDataCallback, i2);
            }
        })) {
            return;
        }
        final String strD = lkf.d(this.f);
        LogUtil.d("HiHlthKitBnd", "startReadingRRI", " packageName:", strD);
        lbm.c(this.f).i(strD, b(iRealTimeDataCallback, "startReadingRRI", new Action() { // from class: kzb
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.Action
            public final void operate() throws RemoteException {
                this.e.a(strD, str);
            }
        }, lenVar));
        lew.e(strD, 50001, "ReadingRri", iRealTimeDataCallback, null);
    }

    public /* synthetic */ void d(IRealTimeDataCallback iRealTimeDataCallback, int i) throws RemoteException {
        iRealTimeDataCallback.onResult(b(i));
    }

    public /* synthetic */ void a(String str, String str2) throws RemoteException {
        lbm.c(this.f).o(str, new c(str2));
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void stopReadingRRI(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "stopReadingRRI");
        len lenVar = new len();
        if (!a(iRealTimeDataCallback, "stopReadingRRI", lenVar) && lcm.e("stopReadingRRI", iRealTimeDataCallback)) {
            LogUtil.d("HiHlthKitBnd", "stopReadingRRI", " packageName:", lkf.d(this.f));
            lbm.c(this.f).o(lkf.d(this.f), b(iRealTimeDataCallback, "stopReadingRRI", (Action) null, lenVar));
            lew.e(lkf.d(this.f), "ReadingRri");
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getDeviceList(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "getDeviceList");
        len lenVar = new len();
        if (!a(iRealTimeDataCallback, "getDeviceList", lenVar) && lcm.e("getDeviceList", iRealTimeDataCallback)) {
            if (!lep.a(this.f, 22)) {
                Objects.requireNonNull(iRealTimeDataCallback);
                if (c("getDeviceList", 101201, null, lenVar, new kzm(iRealTimeDataCallback))) {
                    return;
                }
            }
            lbm lbmVarC = lbm.c(this.f);
            Context context = this.f;
            lbmVarC.a(lel.d(iRealTimeDataCallback, lenVar, context, new ler("getDeviceList", 0, lkf.d(context))));
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void sendDeviceCommand(int i, String str, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "sendDeviceCommand");
        len lenVar = new len();
        if (!a(iRealTimeDataCallback, "sendDeviceCommand", lenVar) && lcm.e("sendDeviceCommand", iRealTimeDataCallback)) {
            if (!lep.a(this.f, 23)) {
                Objects.requireNonNull(iRealTimeDataCallback);
                if (c("sendDeviceCommand", 101204, null, lenVar, new kzm(iRealTimeDataCallback))) {
                    return;
                }
            }
            lbm lbmVarC = lbm.c(this.f);
            Context context = this.f;
            lbmVarC.f(str, lel.d(iRealTimeDataCallback, lenVar, context, new ler("sendDeviceCommand", 0, lkf.d(context))));
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getSwitch(int i, String str, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "getSwitch");
        len lenVar = new len();
        if (!a(iCommonCallback, "getSwitch", lenVar) && lcm.e("getSwitch", iCommonCallback)) {
            if (lep.a(this.f, 15) || !c("getSwitch", 101204, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzq
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i2) throws RemoteException {
                    this.e.a(iCommonCallback, i2);
                }
            })) {
                lbm lbmVarC = lbm.c(this.f);
                Context context = this.f;
                lbmVarC.a(str, lel.d(iCommonCallback, lenVar, context, new ler("getSwitch", 0, lkf.d(context)), "com.huawei.hihealthservice.hihealthkit.constant.BusinessErrorCode.wearApiFilterCode"));
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void startReadingAtrial(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        final String str = "startReadingAtrial";
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "startReadingAtrial");
        len lenVar = new len();
        if (!a(iRealTimeDataCallback, "startReadingAtrial", lenVar) && lcm.e("startReadingAtrial", iRealTimeDataCallback)) {
            if (!lep.a(this.f, 16)) {
                Objects.requireNonNull(iRealTimeDataCallback);
                if (c("startReadingAtrial", 101202, null, lenVar, new kzm(iRealTimeDataCallback))) {
                    return;
                }
            }
            final String strD = lkf.d(this.f);
            LogUtil.d("HiHlthKitBnd", "startReadingAtrial", " packageName:", strD);
            lbm.c(this.f).j(strD, b(iRealTimeDataCallback, "startReadingAtrial", new Action() { // from class: kys
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.Action
                public final void operate() throws RemoteException {
                    this.f39640a.e(strD, str);
                }
            }, lenVar));
            e("startReadingAtrial", 0, lenVar);
            lew.e(lkf.d(this.f), 101202, "ReadingAtrial", iRealTimeDataCallback, null);
        }
    }

    public /* synthetic */ void e(String str, String str2) throws RemoteException {
        lbm.c(this.f).m(str, new c(str2));
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void stopReadingAtrial(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "stopReadingAtrial");
        len lenVar = new len();
        if (!a(iRealTimeDataCallback, "stopReadingAtrial", lenVar) && lcm.e("stopReadingAtrial", iRealTimeDataCallback)) {
            if (!lep.a(this.f, 17)) {
                Objects.requireNonNull(iRealTimeDataCallback);
                if (c("stopReadingAtrial", 101202, null, lenVar, new kzm(iRealTimeDataCallback))) {
                    return;
                }
            }
            lbm.c(this.f).m(lkf.d(this.f), b(iRealTimeDataCallback, "stopReadingAtrial", (Action) null, lenVar));
            lew.e(lkf.d(this.f), "ReadingAtrial");
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void pushMsgToWearable(String str, String str2, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "pushMsgToWearable");
        len lenVar = new len();
        if (!a(iCommonCallback, "pushMsgToWearable", lenVar) && lcm.e("pushMsgToWearable", iCommonCallback)) {
            if (lep.a(this.f, 9) || !c("pushMsgToWearable", 101203, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzg
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.f39658b.e(iCommonCallback, i);
                }
            })) {
                lbm lbmVarC = lbm.c(this.f);
                com.huawei.health.HiAppInfo hiAppInfoB = ljp.b(this.f);
                Context context = this.f;
                lbmVarC.a(hiAppInfoB, str, str2, lel.d(iCommonCallback, lenVar, context, new ler("pushMsgToWearable", 0, lkf.d(context)), "com.huawei.hihealthservice.hihealthkit.constant.BusinessErrorCode.pushMessageFilterCode"));
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void writeToWearable(String str, String str2, byte[] bArr, String str3, final IWriteCallback iWriteCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "writeToWearable");
        len lenVar = new len();
        if (!a(iWriteCallback, "writeToWearable", lenVar) && lcm.e("writeToWearable", iWriteCallback)) {
            if (lep.a(this.f, 8) || !c("writeToWearable", 101202, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzr
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    iWriteCallback.onResult(i, null);
                }
            })) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isWriteFile", bArr != null);
                    jSONObject.put("sizeAndFinish", str3);
                    lbm.c(this.f).a(str, str2, bArr, str3, lel.c(iWriteCallback, lenVar, this.f, new ler("writeToWearable", 0, lkf.d(this.f)), jSONObject));
                } catch (JSONException e2) {
                    ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "writeToWearable JSONException: ", e2.getMessage());
                }
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void readFromWearable(String str, String str2, final IReadCallback iReadCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "readFromWearable");
        len lenVar = new len();
        if (!a(iReadCallback, "readFromWearable", lenVar) && lcm.e("readFromWearable", iReadCallback)) {
            if (lep.a(this.f, 7) || !c("readFromWearable", 101202, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzo
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    iReadCallback.onResult(i, null, HiHealthKitBinder.f12365b);
                }
            })) {
                lbm lbmVarC = lbm.c(this.f);
                Context context = this.f;
                lbmVarC.e(str, str2, lel.b(iReadCallback, lenVar, context, new ler("readFromWearable", 0, lkf.d(context))));
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void registerRealTimeSportCallback(final ISportDataCallback iSportDataCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "registerSportData");
        len lenVar = new len();
        if (!a(iSportDataCallback, "registerSportData", lenVar) && lcm.e("registerSportData", iSportDataCallback)) {
            Objects.requireNonNull(iSportDataCallback);
            if (c("registerSportData", 101003, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kyr
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    iSportDataCallback.onResult(i);
                }
            })) {
                return;
            }
            ITrackDataForDeveloper iTrackDataForDeveloper = this.t.get(Integer.valueOf(Binder.getCallingUid()));
            if (iTrackDataForDeveloper != null) {
                lbg.b(this.f).d(iTrackDataForDeveloper, new ICommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.17
                    @Override // com.huawei.hihealth.ICommonCallback
                    public void onResult(int i, String str) {
                        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "unregister prior callback result ", Integer.valueOf(i));
                    }
                });
            }
            ITrackDataForDeveloper iTrackDataForDeveloperE = e(iSportDataCallback);
            this.t.put(Integer.valueOf(Binder.getCallingUid()), iTrackDataForDeveloperE);
            lbg.b(this.f).e(iTrackDataForDeveloperE);
            iSportDataCallback.onResult(0);
            e("registerSportData", 0, lenVar);
            lew.e(lkf.d(this.f), 101003, "RealingTimeSport", null, iTrackDataForDeveloperE);
        }
    }

    private ITrackDataForDeveloper e(final ISportDataCallback iSportDataCallback) {
        return new ITrackDataForDeveloper.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.18
            @Override // com.huawei.health.ITrackDataForDeveloper
            public void onStateChanged(int i) {
                try {
                    ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "onStateChanged state: ", Integer.valueOf(i));
                    if (HiHealthKitBinder.this.s != null) {
                        HiHealthKitBinder.this.s.putInt("sportState", i);
                    }
                    iSportDataCallback.onDataChanged(i, HiHealthKitBinder.this.s);
                } catch (RemoteException e2) {
                    ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "registerRealTimeSportCallback onDataChange RemoteException: ", e2.getMessage());
                }
            }

            @Override // com.huawei.health.ITrackDataForDeveloper
            public void onDataChange(Bundle bundle) {
                if (bundle == null) {
                    LogUtil.j("HiHlthKitBnd", "TrackData onDataChanged, get null");
                    return;
                }
                try {
                    LogUtil.a("HiHlthKitBnd", "onDataChange : duration = ", bundle.get("duration"), " calorie = ", bundle.get("calorie"), " distance = ", bundle.get("distance"), " speed = ", bundle.get("speed"));
                    iSportDataCallback.onDataChanged(bundle.getInt("sportState"), bundle);
                    HiHealthKitBinder.this.s = (Bundle) bundle.clone();
                } catch (RemoteException e2) {
                    LogUtil.e("HiHlthKitBnd", "registerRealTimeSportCallback onDataChange RemoteException: ", e2.getMessage());
                }
            }
        };
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void unregisterRealTimeSportCallback(final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "unRegisterSportData");
        final len lenVar = new len();
        if (!a(iCommonCallback, "unRegisterSportData", lenVar) && lcm.e("unRegisterSportData", iCommonCallback)) {
            final String strD = lkf.d(this.f);
            final int callingUid = Binder.getCallingUid();
            final String str = "unRegisterSportData";
            lbg.b(this.f).d(this.t.get(Integer.valueOf(callingUid)), new ICommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.5
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str2) throws RemoteException {
                    iCommonCallback.onResult(i, str2);
                    HiHealthKitBinder.this.c(str, i, lenVar, strD);
                    if (i == 0) {
                        HiHealthKitBinder.this.t.remove(Integer.valueOf(callingUid));
                    }
                }
            });
            lew.e(strD, "RealingTimeSport");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void j(ICommonCallback iCommonCallback, int i) throws RemoteException {
        iCommonCallback.onResult(i, lcr.b(1001));
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void startSport(final int i, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "startSport");
        final len lenVar = new len();
        if (!e("startSport", lenVar, iCommonCallback, String.valueOf(i))) {
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "startSport", " API is not ready");
            return;
        }
        final String strD = lkf.d(this.f);
        final String str = "startSport";
        lbg.b(this.f).a(i, new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.3
            @Override // com.huawei.health.IBaseCommonCallback
            public void onResponse(int i2, String str2) throws RemoteException {
                int iG;
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", str, " result code ", Integer.valueOf(i2));
                if (!let.e(strD, 5)) {
                    iG = lck.i(i2);
                } else {
                    iG = !let.e(strD, 9) ? lck.g(i2) : i2;
                }
                iCommonCallback.onResult(iG, str2);
                lenVar.d(HiHealthKitBinder.this.f, new ler(str, i2, strD, null, String.valueOf(i)));
            }
        });
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void startSportEnhance(StartSportParam startSportParam, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter enhance ", "startSportEnhance", ", param: ", HiJsonUtil.d(startSportParam));
        final len lenVar = new len();
        if (!HiHealthKitDataChecker.c(startSportParam)) {
            iCommonCallback.onResult(2, lcr.b(2));
            return;
        }
        final int i = startSportParam.getInt(BleConstants.SPORT_TYPE);
        if (!e("startSportEnhance", lenVar, iCommonCallback, String.valueOf(i))) {
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "startSportEnhance", " API is not ready");
            return;
        }
        final String strD = lkf.d(this.f);
        final String str = "startSportEnhance";
        lbg.b(this.f).c(startSportParam, new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.2
            @Override // com.huawei.health.IBaseCommonCallback
            public void onResponse(int i2, String str2) throws RemoteException {
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "startSportEnhance result code ", Integer.valueOf(i2));
                if (let.e(strD, 5)) {
                    iCommonCallback.onResult(i2, str2);
                } else {
                    iCommonCallback.onResult(lck.i(i2), str2);
                }
                lenVar.d(HiHealthKitBinder.this.f, new ler(str, i2, strD, null, String.valueOf(i)));
            }
        });
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void stopSport(final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "stopSport");
        final len lenVar = new len();
        if (!e("stopSport", lenVar, iCommonCallback, (String) null)) {
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "stopSport", " API is not ready");
            return;
        }
        final String strD = lkf.d(this.f);
        final String str = "stopSport";
        lbg.b(this.f).d(new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.1
            @Override // com.huawei.health.IBaseCommonCallback
            public void onResponse(int i, String str2) throws RemoteException {
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", str, " result code ", Integer.valueOf(i));
                iCommonCallback.onResult(i, str2);
                HiHealthKitBinder.this.c(str, i, lenVar, strD);
                if (i == 0) {
                    HiHealthKitBinder.this.n = null;
                    HiHealthKitBinder.this.p = -1;
                }
            }
        });
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void sendDeviceControlinstruction(String str, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "sendDeviceControlinstruction");
        final len lenVar = new len();
        if (a(iCommonCallback, "sendDeviceControlinstruction", lenVar)) {
            return;
        }
        if (!HiHealthKitDataChecker.e(str)) {
            iCommonCallback.onResult(2, lcr.b(2));
        } else if (lcm.e("sendDeviceControlinstruction", iCommonCallback) && !c("sendDeviceControlinstruction", 101204, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzk
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.e.j(iCommonCallback, i);
            }
        })) {
            final String strD = lkf.d(this.f);
            final String str2 = "sendDeviceControlinstruction";
            lbg.b(this.f).d(str, new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.7
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str3) throws RemoteException {
                    ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "sendDeviceControlinstruction result code ", Integer.valueOf(i));
                    if (!let.e(strD, 9)) {
                        i = lck.b(i);
                    }
                    iCommonCallback.onResult(i, str3);
                    lenVar.d(HiHealthKitBinder.this.f, new ler(str2, i, strD));
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void pauseSport(final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "pauseSport");
        final len lenVar = new len();
        if (!e("pauseSport", lenVar, iCommonCallback, (String) null)) {
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "pauseSport", " API is not ready");
            return;
        }
        final String strD = lkf.d(this.f);
        final String str = "pauseSport";
        lbg.b(this.f).c(new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.8
            @Override // com.huawei.health.IBaseCommonCallback
            public void onResponse(int i, String str2) throws RemoteException {
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", str, " result code ", Integer.valueOf(i));
                iCommonCallback.onResult(i, str2);
                HiHealthKitBinder.this.c(str, i, lenVar, strD);
            }
        });
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void resumeSport(final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "resumeSport");
        final len lenVar = new len();
        if (!e("resumeSport", lenVar, iCommonCallback, (String) null)) {
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "resumeSport", " API is not ready");
            return;
        }
        final String strD = lkf.d(this.f);
        final String str = "resumeSport";
        lbg.b(this.f).b(new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.9
            @Override // com.huawei.health.IBaseCommonCallback
            public void onResponse(int i, String str2) throws RemoteException {
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", str, " result code ", Integer.valueOf(i));
                iCommonCallback.onResult(i, str2);
                HiHealthKitBinder.this.c(str, i, lenVar, strD);
            }
        });
    }

    private boolean e(String str, len lenVar, final ICommonCallback iCommonCallback, String str2) throws RemoteException {
        LogUtil.a("HiHlthKitBnd", "enter ", str);
        if (a(iCommonCallback, str, lenVar)) {
            return false;
        }
        if (!TextUtils.isEmpty(str2) && !let.e(str, Integer.valueOf(str2).intValue(), e(str, 30), iCommonCallback)) {
            return false;
        }
        if (str.equals("startSport") || this.n == null || Binder.getCallingUid() == this.p) {
            return lcm.e(str, iCommonCallback) && !c(str, 101003, str2, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzp
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.d.b(iCommonCallback, i);
                }
            });
        }
        ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "startSport's uid is not equals ", str, "'s uid");
        e(str, 4, lenVar);
        iCommonCallback.onResult(4, "unable to " + str + " started by other apps");
        return false;
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void setUserPreference(HiUserPreferenceData hiUserPreferenceData, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "setUserPreference");
        len lenVar = new len();
        if (a(iDataOperateListener, "setUserPreference", lenVar)) {
            return;
        }
        if (hiUserPreferenceData == null) {
            ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "userPreference is null");
            e("setUserPreference", 2, lenVar);
            iDataOperateListener.onResult(2, null);
        } else if (lcm.e("setUserPreference", iDataOperateListener)) {
            if (!lep.a(this.f, 18)) {
                e("setUserPreference", 1001, lenVar);
                iDataOperateListener.onResult(1001, null);
                return;
            }
            boolean userPreference = HiHealthNativeApi.a(this.f).setUserPreference(new HiUserPreference(hiUserPreferenceData.getKey(), hiUserPreferenceData.getValue()), z);
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "setUserPreference isSuccess = ", Boolean.valueOf(userPreference));
            int i = !userPreference ? 1 : 0;
            iDataOperateListener.onResult(i, null);
            e("setUserPreference", i, lenVar);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getUserPreference(List<String> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "getUserPreference");
        len lenVar = new len();
        if (HiCommonUtil.b(list)) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "getUserPreferenceList keys = null");
            e("getUserPreference", 2, lenVar);
            iDataOperateListener.onResult(2, null);
            return;
        }
        if (lcm.e("getUserPreference", iDataOperateListener)) {
            if (!lep.a(this.f, 19)) {
                e("getUserPreference", 1001, lenVar);
                iDataOperateListener.onResult(1001, null);
                return;
            }
            List<HiUserPreference> userPreferenceList = HiHealthNativeApi.a(this.f).getUserPreferenceList(list);
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "hiUserPreferenceList size = ", Integer.valueOf(userPreferenceList.size()));
            ArrayList arrayList = new ArrayList(10);
            for (HiUserPreference hiUserPreference : userPreferenceList) {
                if (hiUserPreference == null) {
                    ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "hiUserPreference == null");
                } else {
                    HiUserPreferenceData hiUserPreferenceData = new HiUserPreferenceData();
                    hiUserPreferenceData.setKey(hiUserPreference.getKey());
                    hiUserPreferenceData.setValue(hiUserPreference.getValue());
                    arrayList.add(hiUserPreferenceData);
                }
            }
            iDataOperateListener.onResult(0, arrayList);
            e("getUserPreference", 0, lenVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, int i, len lenVar) {
        c(str, i, lenVar, lkf.d(this.f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i, len lenVar, String str2) {
        lenVar.d(this.f, new ler(str, i, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(len lenVar, List<ler> list, int i) {
        Iterator<ler> it = list.iterator();
        while (it.hasNext()) {
            lenVar.d(this.f, it.next().e(i));
        }
    }

    private void c(String str, int i, String str2, len lenVar) {
        ler lerVar = new ler(str, 0, lkf.d(this.f), null, str2);
        Context context = this.f;
        if (i == 0) {
            i = 25;
        }
        lenVar.d(context, lerVar.e(i));
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void setKitVersion(String str) {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter setKitVersion ", str);
        let.e(lkf.d(this.f), str);
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void registerPackageName(String str) {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "registerPackageName enter, packageName: ", str);
        lkf.a(this.f, str);
        lev.e(this.f).a();
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public int getServiceApiLevel() {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "getServiceApiLevel");
        len lenVar = new len();
        int iE = let.e(this.f);
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "serviceApiLevel: ", Integer.valueOf(iE));
        e("getServiceApiLevel", 0, lenVar);
        return iE;
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getHealthyLivingData(int i, HiHealthCapabilityQuery hiHealthCapabilityQuery, final ICommonCallback iCommonCallback) throws RemoteException {
        final String str = "getHealthyLivingData";
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "getHealthyLivingData");
        final len lenVar = new len();
        if (a(iCommonCallback, "getHealthyLivingData", lenVar)) {
            return;
        }
        if (hiHealthCapabilityQuery == null) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "query is null");
            iCommonCallback.onResult(2, lcr.b(2));
            e("getHealthyLivingData", 2, lenVar);
        } else if (lcm.e("getHealthyLivingData", iCommonCallback) && !c("getHealthyLivingData", lek.e(hiHealthCapabilityQuery.getType()), null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzn
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i2) throws RemoteException {
                this.e.d(iCommonCallback, i2);
            }
        })) {
            kyo.b(this.f).a(hiHealthCapabilityQuery.getStartTime(), hiHealthCapabilityQuery.getEndTime(), new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.10
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i2, String str2) throws RemoteException {
                    ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "getHealthyLivingData resultCode: ", Integer.valueOf(i2));
                    int iE = lck.e(i2);
                    iCommonCallback.onResult(iE, str2);
                    HiHealthKitBinder.this.e(str, iE, lenVar);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public String preRequestAuth(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "preRequestAuth");
        len lenVar = new len();
        if (a(iBaseCallback, "preRequestAuth", lenVar) || a(iBaseCallback, "preRequestAuth", lenVar)) {
            return "";
        }
        if (!kzw.b(iArr2, iArr)) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "preRequestAuth", " isKitValidTypes false");
            iBaseCallback.onResult(7, Collections.EMPTY_MAP);
            e("preRequestAuth", 7, lenVar);
            return "";
        }
        if (b(iArr, iArr2, iBaseCallback, "preRequestAuth", lenVar) || !lcm.e("preRequestAuth", iBaseCallback)) {
            return "";
        }
        c(i, Binder.getCallingUid());
        try {
            lev levVarE = lev.e(this.f);
            JSONObject jSONObjectE = led.e(lkf.d(this.f), Binder.getCallingUid(), levVarE.b(iArr, false), levVarE.b(iArr2, true));
            HashMap map = new HashMap(16);
            map.put("flag", String.valueOf(Binder.getCallingUid()));
            iBaseCallback.onResult(0, map);
            e("preRequestAuth", 0, lenVar);
            return jSONObjectE.toString();
        } catch (JSONException e2) {
            ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "preRequestAuth", " JSONException: ", e2.getMessage());
            iBaseCallback.onResult(4, Collections.EMPTY_MAP);
            e("preRequestAuth", 4, lenVar);
            return "";
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void registerDataAutoReport(DataReportModel dataReportModel, final IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "registerDataAutoReport");
        len lenVar = new len();
        if (!a(iRegisterRealTimeCallback, "registerDataAutoReport", lenVar) && lcm.e("registerDataAutoReport", iRegisterRealTimeCallback)) {
            if (!HiHealthKitDataChecker.a(dataReportModel)) {
                iRegisterRealTimeCallback.onResult(2, lcr.b(2));
            } else if (CharacteristicConstant.ReportType.containsAuthIgnore(dataReportModel.getReportType()) || !c("registerDataAutoReport", dataReportModel.getDataType(), String.valueOf(dataReportModel.getDataType()), lenVar, new HiHealthKitExtendBinder.Action() { // from class: kyt
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    iRegisterRealTimeCallback.onResult(i, lcr.b(1001));
                }
            })) {
                lfc.b(this.f).c(dataReportModel, iRegisterRealTimeCallback, lenVar);
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void unregisterDataAutoReport(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "unregisterDataAutoReport");
        len lenVar = new len();
        if (!a(iRegisterRealTimeCallback, "unregisterDataAutoReport", lenVar) && lcm.e("unregisterDataAutoReport", iRegisterRealTimeCallback)) {
            if (!HiHealthKitDataChecker.a(dataReportModel)) {
                iRegisterRealTimeCallback.onResult(2, lcr.b(2));
            } else {
                lfc.b(this.f).d(dataReportModel, iRegisterRealTimeCallback, lenVar);
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void bindDevice(String str, String str2, String str3, int i, ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "bindDevice");
        len lenVar = new len();
        if (a(iCommonCallback, "bindDevice", lenVar)) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "productId or uniqueId is null");
            iCommonCallback.onResult(2, lcr.b(2));
            e("bindDevice", 2, lenVar);
        } else if (lcm.e("bindDevice", iCommonCallback)) {
            if (!lek.a()) {
                ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "bindDevice permission deny");
                iCommonCallback.onResult(1001, lcr.b(1001));
                e("bindDevice", 1001, lenVar);
            } else {
                lbm lbmVarC = lbm.c(this.f);
                Context context = this.f;
                lbmVarC.a(str, str2, str3, i, lel.d(iCommonCallback, lenVar, context, new ler("bindDevice", 0, lkf.d(context)), "com.huawei.hihealthservice.hihealthkit.constant.BusinessErrorCode.wearApiFilterCode"));
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void getUserInfo(List<String> list, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", com.huawei.up.utils.Constants.METHOD_GET_USER_INFO);
        len lenVar = new len();
        if (a(iCommonCallback, com.huawei.up.utils.Constants.METHOD_GET_USER_INFO, lenVar)) {
            return;
        }
        if (njy.e(list)) {
            ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "getUserInfo dataTypeList is empty");
            iCommonCallback.onResult(2, lcr.b(2));
            e(com.huawei.up.utils.Constants.METHOD_GET_USER_INFO, 2, lenVar);
        } else if (lcm.e(com.huawei.up.utils.Constants.METHOD_GET_USER_INFO, iCommonCallback) && !c(com.huawei.up.utils.Constants.METHOD_GET_USER_INFO, 101001, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzc
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39653a.c(iCommonCallback, i);
            }
        })) {
            leu.d(list, iCommonCallback, lenVar, new ler(com.huawei.up.utils.Constants.METHOD_GET_USER_INFO, 0, lkf.d(this.f)), this.f);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void subscribeData(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "subscribeData");
        len lenVar = new len(this.f, new ler("subscribeData", 0, lkf.d(this.f)));
        if (!a(iSubScribeCallback, "subscribeData", lenVar) && lcm.e("subscribeData", iSubScribeCallback)) {
            Notification notification = new Notification(0, 4, lcr.b(4));
            if (!HiHealthKitDataChecker.e(subscribeModel)) {
                ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "subscribeData wrong subscribe model");
                notification.setErrorInfo(2, lcr.b(2));
                iSubScribeCallback.onResult(new ArrayList(), Arrays.asList(notification));
                lenVar.e().e(2);
                for (int i : subscribeModel.getDataTypes()) {
                    lenVar.e().e(String.valueOf(i));
                    lenVar.a();
                }
                return;
            }
            lfe.e(this.f).b(subscribeModel, iSubScribeCallback, lenVar);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void unSubscribeData(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "unSubscribeData");
        len lenVar = new len(this.f, new ler("unSubscribeData", 0, lkf.d(this.f)));
        if (lcm.e("unSubscribeData", iSubScribeCallback)) {
            Notification notification = new Notification(0, 4, lcr.b(4));
            if (!HiHealthKitDataChecker.e(subscribeModel)) {
                ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "unSubscribeData wrong subscribe model");
                notification.setErrorInfo(2, lcr.b(2));
                iSubScribeCallback.onResult(new ArrayList(), Arrays.asList(notification));
                lenVar.e().e(2);
                for (int i : subscribeModel.getDataTypes()) {
                    lenVar.e().e(String.valueOf(i));
                    lenVar.a();
                }
                return;
            }
            lfe.e(this.f).e(subscribeModel, iSubScribeCallback, lenVar);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void subscribeDataEx(Subscriber subscriber, EventTypeInfo eventTypeInfo, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "subscribeDataEx");
        len lenVar = new len(this.f, new ler("subscribeDataEx", 0, lkf.d(this.f)));
        if (a(iCommonCallback, "subscribeDataEx", lenVar)) {
            return;
        }
        if (!let.d(eventTypeInfo)) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "subscribeDataEx dataType is not support.");
            iCommonCallback.onResult(30, lcr.b(30));
            e("subscribeDataEx", 30, lenVar);
            return;
        }
        if (lcm.e("subscribeDataEx", iCommonCallback)) {
            int iC = HiHealthKitDataChecker.c(subscriber);
            if (iC != 0) {
                ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "subscribeDataEx subscriber is invalid. ");
                iCommonCallback.onResult(iC, lcr.b(iC));
                e("subscribeDataEx", iC, lenVar);
            } else {
                if (!HiHealthKitDataChecker.b(eventTypeInfo, true)) {
                    iCommonCallback.onResult(2, lcr.b(2));
                    e("subscribeDataEx", 2, lenVar);
                    return;
                }
                if (eventTypeInfo instanceof GoalInfo) {
                    for (Goal goal : ((GoalInfo) eventTypeInfo).getGoals()) {
                        if (!lep.a(this.f, 20) && c("subscribeDataEx", goal.getDataType(), null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzd
                            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                            public final void operate(int i) throws RemoteException {
                                this.f39655c.i(iCommonCallback, i);
                            }
                        })) {
                            return;
                        }
                    }
                }
                eventTypeInfo.setSubscriptionMode(2);
                lbi.a(this.f).a(subscriber, eventTypeInfo, iCommonCallback, lenVar);
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void unSubscribeDataEx(Subscriber subscriber, EventTypeInfo eventTypeInfo, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "unSubscribeDataEx");
        len lenVar = new len(this.f, new ler("unSubscribeDataEx", 0, lkf.d(this.f)));
        if (a(iCommonCallback, "unSubscribeDataEx", lenVar)) {
            return;
        }
        if (!let.d(eventTypeInfo)) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "unSubscribeDataEx dataType is not support.");
            iCommonCallback.onResult(30, lcr.b(30));
            e("unSubscribeDataEx", 30, lenVar);
            return;
        }
        if (lcm.e("unSubscribeDataEx", iCommonCallback)) {
            int iC = HiHealthKitDataChecker.c(subscriber);
            if (iC != 0) {
                ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "unSubscribeDataEx subscriber is invalid. ");
                iCommonCallback.onResult(iC, lcr.b(iC));
                e("unSubscribeDataEx", iC, lenVar);
            } else {
                if (!HiHealthKitDataChecker.b(eventTypeInfo, false)) {
                    iCommonCallback.onResult(2, lcr.b(2));
                    e("unSubscribeDataEx", 2, lenVar);
                    return;
                }
                if (eventTypeInfo instanceof GoalInfo) {
                    for (Goal goal : ((GoalInfo) eventTypeInfo).getGoals()) {
                        if (!lep.a(this.f, 21) && c("unSubscribeDataEx", goal.getDataType(), null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kzi
                            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                            public final void operate(int i) throws RemoteException {
                                this.f39662c.f(iCommonCallback, i);
                            }
                        })) {
                            return;
                        }
                    }
                }
                eventTypeInfo.setSubscriptionMode(2);
                lbi.a(this.f).a(eventTypeInfo, subscriber, iCommonCallback, lenVar);
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void syncData(int[] iArr, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter syncData");
        len lenVar = new len();
        if (a(iCommonCallback, "syncData", lenVar)) {
            return;
        }
        if (!HiHealthKitDataChecker.c(iArr)) {
            iCommonCallback.onResult(2, lcr.b(2));
            e("syncData", 2, lenVar);
        } else if (lcm.e("syncData", iCommonCallback) && !c("syncData", 0, null, lenVar, new HiHealthKitExtendBinder.Action() { // from class: kyu
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39642a.h(iCommonCallback, i);
            }
        })) {
            lbj.a().c(iArr, iCommonCallback);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void connectSportDevice(final int i, final ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "connectSportDevice");
        final len lenVar = new len();
        if (!e("connectSportDevice", lenVar, iCommonCallback, String.valueOf(i))) {
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "connectSportDevice", " API is not ready");
            return;
        }
        final String strD = lkf.d(this.f);
        final String str = "connectSportDevice";
        lbg.b(this.f).b(i, new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder.6
            @Override // com.huawei.health.IBaseCommonCallback
            public void onResponse(int i2, String str2) throws RemoteException {
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", str, " result code ", Integer.valueOf(i2));
                iCommonCallback.onResult(i2, str2);
                lenVar.d(HiHealthKitBinder.this.f, new ler(str, i2, strD, null, String.valueOf(i)));
            }
        });
    }

    @Override // com.huawei.hihealth.IHiHealthKit
    public void queryTrends(TrendQuery trendQuery, int i, final IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "enter ", "queryTrends");
        String strD = lkf.d(this.f);
        len lenVar = new len(this.f, new ler("queryTrends", 0, strD));
        if (a(iDataReadResultListener, "queryTrends", lenVar)) {
            iDataReadResultListener.onResult(Collections.EMPTY_LIST, 2, 2);
            return;
        }
        if (!HiHealthKitDataChecker.a(trendQuery, i)) {
            iDataReadResultListener.onResult(Collections.EMPTY_LIST, 2, 2);
            e("queryTrends", 2, lenVar);
            return;
        }
        if (!let.c(trendQuery)) {
            iDataReadResultListener.onResult(Collections.EMPTY_LIST, 30, 2);
            e("queryTrends", 30, lenVar);
        } else if (lcm.e("queryTrends", iDataReadResultListener)) {
            if (c("queryTrends", lek.e(0), String.valueOf(0), lenVar, new HiHealthKitExtendBinder.Action() { // from class: kyx
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i2) throws RemoteException {
                    this.d.b(iDataReadResultListener, i2);
                }
            })) {
                return;
            }
            new HiHealthKitQueryHelper(this.f, strD).d(trendQuery, i, iDataReadResultListener);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKit.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (Exception e2) {
            String strB = LogAnonymous.b(e2);
            ReleaseLogUtil.a("R_HiH_HiHlthKitBnd", "HiHealthKitBinder onTransact Exception: ", strB);
            String string = Arrays.toString(e2.getStackTrace());
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(6);
            linkedHashMap.put("keyWords", "KitBinderTransactException");
            linkedHashMap.put("messages", strB + string);
            ljv.d(this.f).c(OperationKey.HEALTH_APP_PROBABILITY_PROBLEM_85070032.value(), linkedHashMap, true);
            return false;
        }
    }

    private boolean a(IBaseCallback iBaseCallback, String str, len lenVar) throws RemoteException {
        String strD = lkf.d(this.f);
        Long l = this.o.get(strD);
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (jCurrentTimeMillis < 2000) {
                ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "checkRequestTime diffTime less than defaultTime: ", Long.valueOf(jCurrentTimeMillis));
                iBaseCallback.onResult(4, Collections.EMPTY_MAP);
                e(str, 4, lenVar);
                return true;
            }
        }
        this.o.put(strD, Long.valueOf(System.currentTimeMillis()));
        return false;
    }

    public void onDestroy() {
        ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "onDestroy");
        HealthOpenSDK healthOpenSDK = this.m;
        if (healthOpenSDK != null) {
            healthOpenSDK.destorySDK();
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class c extends IRealTimeDataCallback.Stub {
        private String e;

        @Override // com.huawei.hihealth.IRealTimeDataCallback
        public void onChange(int i, String str) {
        }

        c(String str) {
            this.e = str;
        }

        @Override // com.huawei.hihealth.IRealTimeDataCallback
        public void onResult(int i) throws RemoteException {
            LogUtil.a("HiHlthKitBnd", "auto stop ", this.e, " result code = ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    class d implements IExecuteResult {
        private d() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            HiHealthKitBinder.this.j = true;
            ReleaseLogUtil.d("R_HiH_HiHlthKitBnd", "healthOpenSDKCallback initSDK success");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "healthOpenSDKCallback : initSDK Failed");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            ReleaseLogUtil.e("R_HiH_HiHlthKitBnd", "healthOpenSDKCallback : onServiceException");
        }
    }
}
