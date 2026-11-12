package com.huawei.hihealthservice.hihealthkit;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.ITrackDataForDeveloper;
import com.huawei.hihealth.CharacteristicConstant;
import com.huawei.hihealth.DataReportModel;
import com.huawei.hihealth.HealthKitDictQuery;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiHealthAggregateQuery;
import com.huawei.hihealth.HiHealthDataQuery;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.HiUserPreferenceData;
import com.huawei.hihealth.IBaseCallback;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.IHiHealthKitEx;
import com.huawei.hihealth.IReadCallback;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hihealth.IRegisterRealTimeCallback;
import com.huawei.hihealth.ISportDataCallback;
import com.huawei.hihealth.ISubScribeCallback;
import com.huawei.hihealth.IWriteCallback;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hihealth.TrendQuery;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.model.Notification;
import com.huawei.hihealth.model.SubscribeModel;
import com.huawei.hihealth.option.HiHealthCapabilityQuery;
import com.huawei.hihealthkit.context.H5ProAppInfo;
import com.huawei.hihealthkit.context.OutOfBandData;
import com.huawei.hihealthkit.context.QuickAppInfo;
import com.huawei.hihealthservice.InsertExecutor;
import com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper;
import com.huawei.hihealthservice.hihealthkit.util.HiHealthKitDataChecker;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.operation.ble.BleConstants;
import com.huawei.up.utils.Constants;
import defpackage.ktr;
import defpackage.kwi;
import defpackage.kyo;
import defpackage.kzw;
import defpackage.lbb;
import defpackage.lbe;
import defpackage.lbg;
import defpackage.lbh;
import defpackage.lbj;
import defpackage.lbm;
import defpackage.lck;
import defpackage.lcm;
import defpackage.lcn;
import defpackage.lcr;
import defpackage.lee;
import defpackage.lel;
import defpackage.len;
import defpackage.lep;
import defpackage.ler;
import defpackage.let;
import defpackage.leu;
import defpackage.lfc;
import defpackage.lfe;
import defpackage.ljp;
import defpackage.lkf;
import defpackage.lkt;
import defpackage.njy;
import health.compact.a.AuthorizationUtils;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthKitExtendBinder extends IHiHealthKitEx.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private QuickAppInfo f12415a;
    private AppStatusHelper d;
    private Handler f;
    private InsertExecutor g;
    private Context h;
    private kzw i;
    private IBaseCallback j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12414c = BaseApplication.getAppPackage();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f12413b = new byte[0];
    private static final List e = new ArrayList(0);
    private HandlerThread k = new HandlerThread("HiHealthKitBinder");
    private Bundle o = new Bundle();
    private ConcurrentHashMap<Integer, ITrackDataForDeveloper> m = new ConcurrentHashMap<>();

    /* JADX INFO: loaded from: classes10.dex */
    public interface Action {
        void operate(int i) throws RemoteException;
    }

    public HiHealthKitExtendBinder(Context context, InsertExecutor insertExecutor) {
        if (context == null || insertExecutor == null) {
            throw new lkt("HiHealthKitExtendBinder() param is null");
        }
        this.h = context;
        this.i = kzw.c();
        this.g = insertExecutor;
        insertExecutor.execute(new Runnable() { // from class: lai
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d();
            }
        });
        this.d = new AppStatusHelper(this.h);
        this.k.start();
        this.f = new Handler(this.k.getLooper()) { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 101) {
                    return;
                }
                try {
                    HiHealthKitExtendBinder.this.a(message);
                } catch (RemoteException e2) {
                    ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "handleMessage RemoteException = ", e2.getMessage());
                }
            }
        };
        lfc.b(context).c();
        ktr.b().c(context, insertExecutor);
    }

    public /* synthetic */ void d() {
        try {
            this.i.a();
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "HiHealthKitBinder() getCurrentAppId e = ", e2.getMessage());
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getGender(OutOfBandData outOfBandData, ICommonListener iCommonListener) throws RemoteException {
        a(outOfBandData, iCommonListener, "getGender");
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getBirthday(OutOfBandData outOfBandData, ICommonListener iCommonListener) throws RemoteException {
        a(outOfBandData, iCommonListener, "getBirthday");
    }

    private void a(OutOfBandData outOfBandData, final ICommonListener iCommonListener, final String str) throws RemoteException {
        a(str);
        if (iCommonListener == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", str, " callback is null");
            return;
        }
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final len lenVar = new len();
        if (a(lcn.e(this.h, outOfBandData, this.d, 101001, 1), true, new Action() { // from class: lal
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39723a.d(lenVar, strA, strC, str, iCommonListener, i);
            }
        })) {
            return;
        }
        HiHealthKitQueryHelper hiHealthKitQueryHelper = new HiHealthKitQueryHelper(this.h, strA, strC);
        if (!"getGender".equals(str) && !"getBirthday".equals(str)) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getBasicUserInfo unrecognized dataType");
        } else {
            hiHealthKitQueryHelper.a(lenVar, iCommonListener, str);
        }
    }

    public /* synthetic */ void d(len lenVar, String str, String str2, String str3, ICommonListener iCommonListener, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iCommonListener.onFailure(i, null);
    }

    private boolean a(int i, boolean z, Action action) throws RemoteException {
        if (i == 0 && (!z || !kzw.e())) {
            return false;
        }
        if (i == 0) {
            i = 1001;
        }
        action.operate(i);
        return true;
    }

    private void e(OutOfBandData outOfBandData, final ICommonListener iCommonListener, final String str) throws RemoteException {
        a(str);
        if (iCommonListener == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", str, " callback is null");
            return;
        }
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final len lenVar = new len();
        if (a(lcn.e(this.h, outOfBandData, this.d, 101002, 1), true, new Action() { // from class: kzv
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.e.e(lenVar, strA, strC, str, iCommonListener, i);
            }
        })) {
            return;
        }
        HiHealthKitQueryHelper hiHealthKitQueryHelper = new HiHealthKitQueryHelper(this.h, strA, strC);
        if ("getWeight".equals(str) || "getHeight".equals(str)) {
            hiHealthKitQueryHelper.a(lenVar, iCommonListener, str);
        } else {
            LogUtil.e("HiHlthKitExtBnd", "getBasicUserFeature unrecognized dataType");
        }
    }

    public /* synthetic */ void e(len lenVar, String str, String str2, String str3, ICommonListener iCommonListener, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iCommonListener.onFailure(i, null);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getWeight(OutOfBandData outOfBandData, ICommonListener iCommonListener) throws RemoteException {
        e(outOfBandData, iCommonListener, "getWeight");
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getHeight(OutOfBandData outOfBandData, ICommonListener iCommonListener) throws RemoteException {
        e(outOfBandData, iCommonListener, "getHeight");
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void execQuery(OutOfBandData outOfBandData, HiHealthDataQuery hiHealthDataQuery, int i, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        c(outOfBandData, hiHealthDataQuery, iDataReadResultListener, "execQuery");
    }

    private void c(OutOfBandData outOfBandData, HiHealthDataQuery hiHealthDataQuery, final IDataReadResultListener iDataReadResultListener, String str) throws RemoteException {
        a(str);
        final len lenVar = new len();
        String strA = a(outOfBandData);
        String strC = c(outOfBandData);
        if (iDataReadResultListener == null) {
            c(lenVar, strA, strC, str, 2);
            return;
        }
        if (hiHealthDataQuery == null || strA == null) {
            iDataReadResultListener.onResult(null, 2, 2);
            c(lenVar, strA, strC, str, 2);
            ReleaseLogUtil.e("HiH_HiHlthKitExtBnd", "execQuery query or package name is null");
        } else {
            if (HiHealthKitDataChecker.a(hiHealthDataQuery.getStartTime(), hiHealthDataQuery.getEndTime())) {
                iDataReadResultListener.onResult(null, 2, 2);
                c(lenVar, strA, strC, str, 2);
                return;
            }
            final int sampleType = hiHealthDataQuery.getSampleType();
            final ler lerVar = new ler(str, 0, strA, strC, String.valueOf(sampleType));
            if (a(lcn.e(this.h, outOfBandData, this.d, sampleType, 1), false, new Action() { // from class: kzt
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.f39674b.a(sampleType, iDataReadResultListener, lenVar, lerVar, i);
                }
            })) {
                return;
            }
            HiHealthKitQueryHelper hiHealthKitQueryHelper = new HiHealthKitQueryHelper(this.h, strA, strC);
            lee.e(this.h, outOfBandData, str, lkf.e(strA, false));
            boolean zB = lcn.b(outOfBandData, this.h, this.d);
            String strD = lkf.d(this.h);
            hiHealthKitQueryHelper.a(hiHealthDataQuery, iDataReadResultListener, new lbh(zB, str, let.d(strD) <= 5 ? null : strD, String.valueOf(sampleType)));
        }
    }

    public /* synthetic */ void a(int i, IDataReadResultListener iDataReadResultListener, len lenVar, ler lerVar, int i2) throws RemoteException {
        LogUtil.j("HiHlthKitExtBnd", "scope fails ", Integer.valueOf(i), lcr.b(i2));
        iDataReadResultListener.onResult(null, i2, 2);
        lenVar.d(this.h, lerVar.e(i2));
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void queryData(OutOfBandData outOfBandData, HealthKitDictQuery healthKitDictQuery, final IDataReadResultListener iDataReadResultListener) throws RemoteException {
        final len lenVar = new len();
        a("queryData");
        String strA = a(outOfBandData);
        String strC = c(outOfBandData);
        if (iDataReadResultListener == null) {
            c(lenVar, strA, strC, "queryData", 2);
            return;
        }
        if (healthKitDictQuery == null || strA == null) {
            iDataReadResultListener.onResult(null, 2, 2);
            c(lenVar, strA, strC, "queryData", 2);
            ReleaseLogUtil.e("HiH_HiHlthKitExtBnd", "queryData query or package name is null");
            return;
        }
        int sampleType = healthKitDictQuery.getSampleType();
        if (!let.c(sampleType)) {
            ReleaseLogUtil.e("HiH_HiHlthKitExtBnd", "queryData type is not support.");
            iDataReadResultListener.onResult(null, 30, 2);
            c(lenVar, strA, strC, "queryData", 30);
            return;
        }
        if (HiHealthKitDataChecker.a(healthKitDictQuery.getStartTime(), healthKitDictQuery.getEndTime()) || !HiHealthKitDataChecker.c(healthKitDictQuery)) {
            List list = null;
            iDataReadResultListener.onResult(list, 2, 2);
            c(lenVar, strA, strC, "queryData", 2);
            return;
        }
        final ler lerVar = new ler("queryData", 0, strA, strC, String.valueOf(sampleType));
        if (a(lcn.e(this.h, outOfBandData, this.d, sampleType, 1), false, new Action() { // from class: lah
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.d.d(iDataReadResultListener, lenVar, lerVar, i);
            }
        })) {
            return;
        }
        Context context = this.h;
        lbb lbbVar = new lbb(context, lkf.d(context), lenVar);
        Boolean bool = healthKitDictQuery.getBoolean("dataSourceQuery");
        boolean zBooleanValue = bool.booleanValue();
        Boolean bool2 = healthKitDictQuery.getBoolean("aggregateQuery");
        boolean zBooleanValue2 = bool2.booleanValue();
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "queryData isDatasourceQuery: ", bool, ", isAggregateQuery: ", bool2);
        if (zBooleanValue) {
            lbbVar.c(healthKitDictQuery, iDataReadResultListener, new lbh(lcn.b(outOfBandData, this.h, this.d), "queryData", String.valueOf(sampleType)));
        } else if (zBooleanValue2) {
            lbbVar.a(healthKitDictQuery, iDataReadResultListener, new lbh(lcn.b(outOfBandData, this.h, this.d), "queryData", String.valueOf(sampleType)));
        } else {
            lbbVar.b(healthKitDictQuery, iDataReadResultListener, new lbh(lcn.b(outOfBandData, this.h, this.d), "queryData", String.valueOf(sampleType)));
        }
    }

    public /* synthetic */ void d(IDataReadResultListener iDataReadResultListener, len lenVar, ler lerVar, int i) throws RemoteException {
        LogUtil.j("HiHlthKitExtBnd", lcr.b(i));
        iDataReadResultListener.onResult(null, i, 2);
        lenVar.d(this.h, lerVar.e(i));
    }

    private String a(OutOfBandData outOfBandData) {
        if (outOfBandData instanceof H5ProAppInfo) {
            return ((H5ProAppInfo) outOfBandData).getPkgName();
        }
        if (outOfBandData instanceof QuickAppInfo) {
            return ((QuickAppInfo) outOfBandData).getPackageName();
        }
        return null;
    }

    private String c(OutOfBandData outOfBandData) {
        if (outOfBandData instanceof H5ProAppInfo) {
            return ((H5ProAppInfo) outOfBandData).getAppId();
        }
        if (outOfBandData instanceof QuickAppInfo) {
            return ((QuickAppInfo) outOfBandData).getAppId();
        }
        return null;
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void execAggregateQuery(final OutOfBandData outOfBandData, HiHealthAggregateQuery hiHealthAggregateQuery, int i, final IDataReadResultListener iDataReadResultListener) throws RemoteException {
        a("execAggregateQuery");
        final len lenVar = new len();
        if (iDataReadResultListener == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "execAggregateQuery", " callback is null");
            return;
        }
        if (hiHealthAggregateQuery == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "execAggregateQuery query is null");
            iDataReadResultListener.onResult(null, 2, 2);
            return;
        }
        final String str = "execAggregateQuery";
        if (a(lcn.a(this.h, outOfBandData, hiHealthAggregateQuery.getSampleType(), 1), false, new Action() { // from class: lan
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i2) throws RemoteException {
                this.f39729a.d(lenVar, outOfBandData, str, iDataReadResultListener, i2);
            }
        })) {
            return;
        }
        QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        new HiHealthKitQueryHelper(this.h, quickAppInfo.getPackageName(), quickAppInfo.getAppId()).b(hiHealthAggregateQuery, iDataReadResultListener, new lbh(true, "execAggregateQuery", String.valueOf(hiHealthAggregateQuery.getSampleType())));
    }

    public /* synthetic */ void d(len lenVar, OutOfBandData outOfBandData, String str, IDataReadResultListener iDataReadResultListener, int i) throws RemoteException {
        c(lenVar, a(outOfBandData), c(outOfBandData), str, i);
        iDataReadResultListener.onResult(null, i, 2);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getCount(OutOfBandData outOfBandData, HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "enter getCount");
        c(outOfBandData, hiHealthDataQuery, iDataReadResultListener, "getCount");
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void saveSample(OutOfBandData outOfBandData, HiHealthKitData hiHealthKitData, final IDataOperateListener iDataOperateListener) throws RemoteException {
        a("saveSample");
        if (iDataOperateListener == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "saveSample", " callback is null");
            return;
        }
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final len lenVar = new len();
        if (e(outOfBandData, iDataOperateListener, "saveSample", lenVar)) {
            return;
        }
        int type = hiHealthKitData.getType();
        if (let.e("saveSample", type, d(outOfBandData, "saveSample", 30), iDataOperateListener)) {
            if (!HiHealthKitDataChecker.d(Arrays.asList(hiHealthKitData), HiHealthKitDataChecker.MethodType.SAVE_SAMPLES, true)) {
                iDataOperateListener.onResult(2, lcr.e(2));
                c(lenVar, strA, strC, "saveSample", 2);
                return;
            }
            if (lep.a(this.h) && type == 10062) {
                hiHealthKitData.setType(61001);
            }
            final String str = "saveSample";
            if (a(lcn.e(this.h, outOfBandData, this.d, type, 2), false, new Action() { // from class: lav
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.d.c(iDataOperateListener, lenVar, strA, strC, str, i);
                }
            })) {
                return;
            }
            lbe lbeVarC = lbe.c();
            if (lbeVarC == null) {
                ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "saveSample insertHelper is null");
                iDataOperateListener.onResult(4, null);
                d(lenVar, strA, strC, "saveSample", 4);
            } else {
                String strE = lkf.e(strA, hiHealthKitData.getBoolean("belongsToHealth"));
                final String str2 = "saveSample";
                lbeVarC.b(Arrays.asList(hiHealthKitData), new IDataOperateListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.4
                    @Override // com.huawei.hihealth.IDataOperateListener
                    public void onResult(int i, List list) throws RemoteException {
                        iDataOperateListener.onResult(i, list);
                        HiHealthKitExtendBinder.this.d(lenVar, strA, strC, str2, lck.c(i));
                    }
                }, strE);
                lee.e(this.h, outOfBandData, "saveSample", strE);
                ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "addPackageNameToSharedPreferences result: ", Boolean.valueOf(lee.c(Arrays.asList(hiHealthKitData), strE)));
            }
        }
    }

    public /* synthetic */ void c(IDataOperateListener iDataOperateListener, len lenVar, String str, String str2, String str3, int i) throws RemoteException {
        iDataOperateListener.onResult(i, e);
        c(lenVar, str, str2, str3, i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void saveSamples(OutOfBandData outOfBandData, List list, final IDataOperateListener iDataOperateListener) throws RemoteException {
        OutOfBandData outOfBandData2 = outOfBandData;
        a("saveSamples");
        if (iDataOperateListener == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "saveSamples", " callback is null");
            return;
        }
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final len lenVar = new len();
        if (e(outOfBandData2, iDataOperateListener, "saveSamples", lenVar)) {
            return;
        }
        List<Integer> listE = kzw.e((List<HiHealthKitData>) list);
        Iterator<Integer> it = listE.iterator();
        while (it.hasNext()) {
            if (!let.e("saveSamples", it.next().intValue(), d(outOfBandData2, "saveSamples", 30), iDataOperateListener)) {
                return;
            }
        }
        int i = 2;
        if (!HiHealthKitDataChecker.d(list, HiHealthKitDataChecker.MethodType.SAVE_SAMPLES, false)) {
            iDataOperateListener.onResult(2, lcr.e(2));
            c(lenVar, strA, strC, "saveSamples", 2);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add((HiHealthKitData) it2.next());
        }
        Iterator<Integer> it3 = listE.iterator();
        while (it3.hasNext()) {
            ArrayList arrayList2 = arrayList;
            if (a(lcn.e(this.h, outOfBandData2, this.d, it3.next().intValue(), i), false, new Action() { // from class: lam
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i2) throws RemoteException {
                    this.d.e(iDataOperateListener, lenVar, strA, strC, i2);
                }
            })) {
                return;
            }
            outOfBandData2 = outOfBandData;
            arrayList = arrayList2;
            i = 2;
        }
        ArrayList arrayList3 = arrayList;
        lbe lbeVarC = lbe.c();
        if (lbeVarC == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "saveSamples insertHelper is null");
            iDataOperateListener.onResult(4, null);
            d(lenVar, strA, strC, "saveSamples", 4);
            return;
        }
        String strE = lkf.e(strA, ((HiHealthKitData) arrayList3.get(0)).getBoolean("belongsToHealth"));
        if (let.d(lkf.d(this.h)) >= 4) {
            lbeVarC.b(arrayList3, iDataOperateListener, strE);
        } else {
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                lbeVarC.b(Arrays.asList((HiHealthKitData) it4.next()), iDataOperateListener, strE);
            }
        }
        lee.e(this.h, outOfBandData, "saveSamples", strE);
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "addPackageNameToSharedPreferences result: ", Boolean.valueOf(lee.c(arrayList3, strE)));
        d(lenVar, strA, strC, "saveSamples", 0);
    }

    public /* synthetic */ void e(IDataOperateListener iDataOperateListener, len lenVar, String str, String str2, int i) throws RemoteException {
        iDataOperateListener.onResult(i, e);
        c(lenVar, str, str2, "saveSamples", i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void deleteSample(OutOfBandData outOfBandData, HiHealthKitData hiHealthKitData, IDataOperateListener iDataOperateListener) throws RemoteException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiHealthKitData);
        d(outOfBandData, arrayList, iDataOperateListener, "deleteSample");
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void deleteSamples(OutOfBandData outOfBandData, List list, IDataOperateListener iDataOperateListener) throws RemoteException {
        d(outOfBandData, list, iDataOperateListener, "deleteSamples");
    }

    private void d(OutOfBandData outOfBandData, List list, final IDataOperateListener iDataOperateListener, String str) throws RemoteException {
        a(str);
        String strA = a(outOfBandData);
        String strC = c(outOfBandData);
        final len lenVar = new len();
        if (e(outOfBandData, iDataOperateListener, str, lenVar)) {
            return;
        }
        Iterator<Integer> it = kzw.e((List<HiHealthKitData>) list).iterator();
        while (it.hasNext()) {
            if (!let.e(str, it.next().intValue(), d(outOfBandData, str, 30), iDataOperateListener)) {
                return;
            }
        }
        final ler lerVar = new ler(str, 0, strA, strC);
        if (!HiHealthKitDataChecker.d(list, HiHealthKitDataChecker.MethodType.DELETE_SAMPLES, true)) {
            iDataOperateListener.onResult(2, lcr.e(2));
            lenVar.d(this.h, lerVar.e(2));
            LogUtil.j("HiHlthKitExtBnd", str, lcr.b(2));
            return;
        }
        int iD = kzw.d(list);
        if (lep.a(this.h) && iD == 10061) {
            ((HiHealthKitData) list.get(0)).setType(31001);
            iD = 31001;
        }
        lerVar.e(String.valueOf(iD));
        if (a(lcn.e(this.h, outOfBandData, this.d, iD, 2), false, new Action() { // from class: laj
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39720c.a(iDataOperateListener, lenVar, lerVar, i);
            }
        })) {
            return;
        }
        lbe lbeVarC = lbe.c();
        String strE = lkf.e(strA, ((HiHealthKitData) list.get(0)).getBoolean("belongsToHealth"));
        lbeVarC.a(lerVar, (List<HiHealthKitData>) list, iDataOperateListener);
        lee.e(this.h, outOfBandData, str, strE);
    }

    public /* synthetic */ void a(IDataOperateListener iDataOperateListener, len lenVar, ler lerVar, int i) throws RemoteException {
        LogUtil.j("HiHlthKitExtBnd", lcr.b(i));
        iDataOperateListener.onResult(i, e);
        lenVar.d(this.h, lerVar.e(i));
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void requestAuthorization(OutOfBandData outOfBandData, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
        if (!b(outOfBandData)) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "requestAuthorization invalid app type, only quick app allow called");
            return;
        }
        QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        len lenVar = new len();
        try {
            if (!kzw.b(iArr2, iArr)) {
                ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "requestAuthorization isKitValidTypes false");
                if (iBaseCallback != null) {
                    iBaseCallback.onResult(2, null);
                }
                d(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), "requestAuthorization", 2);
                return;
            }
            this.j = iBaseCallback;
            this.f12415a = quickAppInfo;
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            Bundle bundle = new Bundle();
            bundle.putIntArray("writeTypes", iArr);
            bundle.putIntArray("readTypes", iArr2);
            messageObtain.setData(bundle);
            this.f.sendMessage(messageObtain);
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "requestAuthorization RemoteException: ", e2.getMessage());
            iBaseCallback.onResult(4, null);
            d(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), "requestAuthorization", 4);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getDataAuthStatus(OutOfBandData outOfBandData, int i, IDataOperateListener iDataOperateListener) throws RemoteException {
        final String str = "getDataAuthStatus";
        a("getDataAuthStatus");
        if (iDataOperateListener == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getDataAuthStatus", " callback is null");
            return;
        }
        final len lenVar = new len();
        final QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        if (a(lcn.a(this.h, outOfBandData, 0, 0), false, new Action() { // from class: lay
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i2) throws RemoteException {
                this.f39763c.b(lenVar, quickAppInfo, str, i2);
            }
        })) {
            return;
        }
        new HiHealthKitQueryHelper(this.h, quickAppInfo.getPackageName(), quickAppInfo.getAppId()).d(i, iDataOperateListener);
        d(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), "getDataAuthStatus", 0);
    }

    public /* synthetic */ void b(len lenVar, QuickAppInfo quickAppInfo, String str, int i) throws RemoteException {
        c(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), str, i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getDataAuthStatusEx(OutOfBandData outOfBandData, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
        final String str = "getDataAuthStatusEx";
        a("getDataAuthStatusEx");
        if (iBaseCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getDataAuthStatusEx", " callback is null");
            return;
        }
        final QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        final len lenVar = new len();
        if (a(lcn.a(this.h, outOfBandData, 0, 0), false, new Action() { // from class: lak
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39722c.c(lenVar, quickAppInfo, str, i);
            }
        })) {
            return;
        }
        new HiHealthKitQueryHelper(this.h, quickAppInfo.getPackageName(), quickAppInfo.getAppId()).c(iArr, iArr2, iBaseCallback);
        d(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), "getDataAuthStatusEx", 0);
    }

    public /* synthetic */ void c(len lenVar, QuickAppInfo quickAppInfo, String str, int i) throws RemoteException {
        c(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), str, i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getHealthyLivingData(OutOfBandData outOfBandData, HiHealthCapabilityQuery hiHealthCapabilityQuery, final ICommonCallback iCommonCallback) throws RemoteException {
        a("getHealthyLivingData");
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (iCommonCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getHealthyLivingData", " callback is null");
            c(lenVar, strA, strC, "getHealthyLivingData", 2);
        } else if (hiHealthCapabilityQuery == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getHealthyLivingData query is null");
            iCommonCallback.onResult(2, "getHealthyLivingData param invalid");
            c(lenVar, strA, strC, "getHealthyLivingData", 2);
        } else {
            final String str = "getHealthyLivingData";
            if (a(lcn.e(this.h, outOfBandData, this.d, hiHealthCapabilityQuery.getType(), 1), false, new Action() { // from class: lac
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.e.d(lenVar, strA, strC, str, iCommonCallback, i);
                }
            })) {
                return;
            }
            final String str2 = "getHealthyLivingData";
            kyo.b(this.h).a(hiHealthCapabilityQuery.getStartTime(), hiHealthCapabilityQuery.getEndTime(), new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.1
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str3) throws RemoteException {
                    ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getHealthyLivingData resultCode: ", Integer.valueOf(i));
                    int iE = lck.e(i);
                    iCommonCallback.onResult(iE, str3);
                    HiHealthKitExtendBinder.this.d(lenVar, strA, strC, str2, iE);
                }
            });
        }
    }

    public /* synthetic */ void d(len lenVar, String str, String str2, String str3, ICommonCallback iCommonCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iCommonCallback.onResult(i, "getHealthyLivingData permission denied");
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void setKitVersion(String str) {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "enter setKitVersion ", str);
        let.e(lkf.d(this.h), str);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void registerPackageName(String str) {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "registerPackageName enter, packageName: ", str);
        lkf.a(this.h, str);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void startSportEnhance(OutOfBandData outOfBandData, StartSportParam startSportParam, final ICommonCallback iCommonCallback) throws RemoteException {
        a("startSportEnhance");
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (iCommonCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "startSportEnhance", " callback is null");
            c(lenVar, strA, strC, "startSportEnhance", 2);
            return;
        }
        if (let.e("startSportEnhance", startSportParam.getInt(BleConstants.SPORT_TYPE), d(outOfBandData, "startSportEnhance", 30), iCommonCallback)) {
            if (!HiHealthKitDataChecker.c(startSportParam)) {
                iCommonCallback.onResult(2, lcr.b(2));
                return;
            }
            if (lcm.e("startSportEnhance", iCommonCallback)) {
                final String str = "startSportEnhance";
                if (a(lcn.e(this.h, outOfBandData, this.d, 101003, 1), true, new Action() { // from class: laz
                    @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                    public final void operate(int i) throws RemoteException {
                        this.e.f(lenVar, strA, strC, str, iCommonCallback, i);
                    }
                })) {
                    return;
                }
                final String str2 = "startSportEnhance";
                lbg.b(this.h).c(startSportParam, new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.9
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str3) throws RemoteException {
                        ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "startSportEnhance result code ", Integer.valueOf(i));
                        if (let.e(strA, 5)) {
                            iCommonCallback.onResult(i, str3);
                        } else {
                            iCommonCallback.onResult(lck.i(i), str3);
                        }
                        HiHealthKitExtendBinder.this.d(lenVar, strA, strC, str2, i);
                    }
                });
            }
        }
    }

    public /* synthetic */ void f(len lenVar, String str, String str2, String str3, ICommonCallback iCommonCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iCommonCallback.onResult(i, "startSportEnhance permission denied");
    }

    private boolean b(final ICommonCallback iCommonCallback, final len lenVar, final String str, OutOfBandData outOfBandData) throws RemoteException {
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (iCommonCallback != null) {
            return lcm.e(str, iCommonCallback) && !a(lcn.e(this.h, outOfBandData, this.d, 101003, 1), false, new Action() { // from class: lad
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.f39705a.b(lenVar, strA, strC, str, iCommonCallback, i);
                }
            });
        }
        ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", str, " callback is null");
        c(lenVar, strA, strC, str, 2);
        return false;
    }

    public /* synthetic */ void b(len lenVar, String str, String str2, String str3, ICommonCallback iCommonCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iCommonCallback.onResult(i, lcr.b(i));
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void stopSport(OutOfBandData outOfBandData, final ICommonCallback iCommonCallback) throws RemoteException {
        a("stopSport");
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (!b(iCommonCallback, lenVar, "stopSport", outOfBandData)) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "stopSport", " API is not ready");
        } else {
            final String str = "stopSport";
            lbg.b(this.h).d(new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.6
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str2) throws RemoteException {
                    ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", str, " result code ", Integer.valueOf(i));
                    iCommonCallback.onResult(i, str2);
                    HiHealthKitExtendBinder.this.d(lenVar, strA, strC, str, i);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void sendDeviceControlinstruction(OutOfBandData outOfBandData, String str, final ICommonCallback iCommonCallback) throws RemoteException {
        a("sendDeviceControlinstruction");
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (iCommonCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "sendDeviceControlinstruction", " callback is null");
            c(lenVar, strA, strC, "sendDeviceControlinstruction", 2);
        } else {
            if (!HiHealthKitDataChecker.e(str)) {
                iCommonCallback.onResult(2, lcr.b(2));
                return;
            }
            if (lcm.e("sendDeviceControlinstruction", iCommonCallback)) {
                final String str2 = "sendDeviceControlinstruction";
                if (a(lcn.e(this.h, outOfBandData, this.d, 101204, 2), false, new Action() { // from class: lae
                    @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                    public final void operate(int i) throws RemoteException {
                        this.f39709b.g(lenVar, strA, strC, str2, iCommonCallback, i);
                    }
                })) {
                    return;
                }
                final String str3 = "sendDeviceControlinstruction";
                lbg.b(this.h).d(str, new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.10
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str4) throws RemoteException {
                        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "sendDeviceControlinstruction result code ", Integer.valueOf(i));
                        if (!let.e(strA, 9)) {
                            i = lck.b(i);
                        }
                        int i2 = i;
                        iCommonCallback.onResult(i2, str4);
                        HiHealthKitExtendBinder.this.d(lenVar, strA, strC, str3, i2);
                    }
                });
            }
        }
    }

    public /* synthetic */ void g(len lenVar, String str, String str2, String str3, ICommonCallback iCommonCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iCommonCallback.onResult(i, "sendDeviceControlinstruction permission denied");
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void pauseSport(OutOfBandData outOfBandData, final ICommonCallback iCommonCallback) throws RemoteException {
        a("pauseSport");
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (!b(iCommonCallback, lenVar, "pauseSport", outOfBandData)) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "pauseSport", " API is not ready");
        } else {
            final String str = "pauseSport";
            lbg.b(this.h).d(new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.8
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str2) throws RemoteException {
                    ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", str, " result code ", Integer.valueOf(i));
                    iCommonCallback.onResult(i, str2);
                    HiHealthKitExtendBinder.this.d(lenVar, strA, strC, str, i);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void resumeSport(OutOfBandData outOfBandData, final ICommonCallback iCommonCallback) throws RemoteException {
        a("resumeSport");
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (!b(iCommonCallback, lenVar, "resumeSport", outOfBandData)) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "resumeSport", " API is not ready");
        } else {
            final String str = "resumeSport";
            lbg.b(this.h).d(new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.7
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str2) throws RemoteException {
                    ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", str, " result code ", Integer.valueOf(i));
                    iCommonCallback.onResult(i, str2);
                    HiHealthKitExtendBinder.this.d(lenVar, strA, strC, str, i);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void startReadingHeartRate(OutOfBandData outOfBandData, final IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        a("startReadingHeartRate");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "startReadingHeartRate", " callback is null");
            return;
        }
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final String str = "startReadingHeartRate";
        if (a(lcn.e(this.h, outOfBandData, this.d, 50001, 1), true, new Action() { // from class: lar
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.e.a(lenVar, strA, strC, str, iRealTimeDataCallback, i);
            }
        })) {
            return;
        }
        LogUtil.d("HiHlthKitExtBnd", "startReadingHeartRate packageName:", strA);
        lbm.c(this.h).g(strA, e(iRealTimeDataCallback, lenVar, "startReadingHeartRate", strA, strC));
    }

    public /* synthetic */ void a(len lenVar, String str, String str2, String str3, IRealTimeDataCallback iRealTimeDataCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iRealTimeDataCallback.onResult(i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void stopReadingHeartRate(OutOfBandData outOfBandData, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        a("stopReadingHeartRate");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "stopReadingHeartRate", " callback is null");
            return;
        }
        len lenVar = new len();
        String strA = a(outOfBandData);
        String strC = c(outOfBandData);
        c("stopReadingHeartRate", strA);
        lbm.c(this.h).n(strA, e(iRealTimeDataCallback, lenVar, "stopReadingHeartRate", strA, strC));
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void startReadingAtrial(OutOfBandData outOfBandData, final IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        a("startReadingAtrial");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "startReadingAtrial", " callback is null");
            return;
        }
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        LogUtil.a("HiHlthKitExtBnd", "caller packageName", strA, " appId ", strC);
        final len lenVar = new len();
        final String str = "startReadingAtrial";
        if (a(lcn.e(this.h, outOfBandData, this.d, 101202, 1), true, new Action() { // from class: kzu
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39678c.b(lenVar, strA, strC, str, iRealTimeDataCallback, i);
            }
        })) {
            return;
        }
        lbm.c(this.h).j(strA, e(iRealTimeDataCallback, lenVar, "startReadingAtrial", strA, strC));
    }

    public /* synthetic */ void b(len lenVar, String str, String str2, String str3, IRealTimeDataCallback iRealTimeDataCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iRealTimeDataCallback.onResult(i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void stopReadingAtrial(OutOfBandData outOfBandData, final IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        a("stopReadingAtrial");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "stopReadingAtrial", " callback is null");
            return;
        }
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        LogUtil.a("HiHlthKitExtBnd", "caller packageName", strA, " appId ", strC);
        final String str = "stopReadingAtrial";
        if (a(lcn.e(this.h, outOfBandData, this.d, 101202, 1), false, new Action() { // from class: kzy
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39690b.g(lenVar, strA, strC, str, iRealTimeDataCallback, i);
            }
        })) {
            return;
        }
        lbm.c(this.h).m(strA, e(iRealTimeDataCallback, lenVar, "stopReadingAtrial", strA, strC));
    }

    public /* synthetic */ void g(len lenVar, String str, String str2, String str3, IRealTimeDataCallback iRealTimeDataCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iRealTimeDataCallback.onResult(i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void startReadingRRI(OutOfBandData outOfBandData, final IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        a("startReadingRRI");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "startReadingRRI", " callback is null");
            return;
        }
        final len lenVar = new len();
        QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final String str = "startReadingRRI";
        if (a(lcn.a(this.h, outOfBandData, 50001, 1), true, new Action() { // from class: lao
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.d.c(lenVar, strA, strC, str, iRealTimeDataCallback, i);
            }
        })) {
            return;
        }
        c("startReadingRRI", quickAppInfo);
        lbm.c(this.h).i(quickAppInfo.getPackageName(), e(iRealTimeDataCallback, lenVar, "startReadingRRI", strA, strC));
    }

    public /* synthetic */ void c(len lenVar, String str, String str2, String str3, IRealTimeDataCallback iRealTimeDataCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iRealTimeDataCallback.onResult(i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void stopReadingRRI(OutOfBandData outOfBandData, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        a("stopReadingRRI");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "stopReadingRRI", " callback is null");
            return;
        }
        QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        String strA = a(outOfBandData);
        String strC = c(outOfBandData);
        len lenVar = new len();
        c("stopReadingRRI", quickAppInfo);
        lbm.c(this.h).o(quickAppInfo.getPackageName(), e(iRealTimeDataCallback, lenVar, "stopReadingRRI", strA, strC));
    }

    private IRealTimeDataCallback e(final IRealTimeDataCallback iRealTimeDataCallback, final len lenVar, final String str, final String str2, final String str3) {
        final String strD = lkf.d(this.h);
        LogUtil.a("HiHlthKitExtBnd", " getProxyIRealTimeDataListener enginePackageName ", strD);
        return new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.12
            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onResult(int i) throws RemoteException {
                ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "IRealTimeDataCallback resultCode: ", Integer.valueOf(i));
                int iJ = lck.j(i);
                if (let.e(strD, 2)) {
                    iRealTimeDataCallback.onResult(iJ);
                } else {
                    iRealTimeDataCallback.onResult(i);
                }
                HiHealthKitExtendBinder.this.d(lenVar, str2, str3, str, iJ);
            }

            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onChange(int i, String str4) throws RemoteException {
                int iJ = lck.j(i);
                if (let.e(str2, 2) && !"startReadingAtrial".equals(str)) {
                    iRealTimeDataCallback.onChange(iJ, str4);
                } else {
                    iRealTimeDataCallback.onChange(i, str4);
                }
            }
        };
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getDeviceList(OutOfBandData outOfBandData, final IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        a("getDeviceList");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getDeviceList", " callback is null");
            return;
        }
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final String str = "getDeviceList";
        if (a(lcn.e(this.h, outOfBandData, this.d, 101201, 1), false, new Action() { // from class: lab
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39699a.e(lenVar, strA, strC, str, iRealTimeDataCallback, i);
            }
        })) {
            return;
        }
        lbm.c(this.h).a(lel.d(iRealTimeDataCallback, lenVar, this.h, new ler("getDeviceList", 0, strA, strC)));
    }

    public /* synthetic */ void e(len lenVar, String str, String str2, String str3, IRealTimeDataCallback iRealTimeDataCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iRealTimeDataCallback.onResult(i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void sendDeviceCommand(OutOfBandData outOfBandData, String str, final IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        a("sendDeviceCommand");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "sendDeviceCommand", " callback is null");
            return;
        }
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final len lenVar = new len();
        final String str2 = "sendDeviceCommand";
        if (a(lcn.e(this.h, outOfBandData, this.d, 101204, 2), false, new Action() { // from class: lat
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.e.d(lenVar, strA, strC, str2, iRealTimeDataCallback, i);
            }
        })) {
            return;
        }
        lbm.c(this.h).f(str, iRealTimeDataCallback);
        d(lenVar, strA, strC, "sendDeviceCommand", 0);
    }

    public /* synthetic */ void d(len lenVar, String str, String str2, String str3, IRealTimeDataCallback iRealTimeDataCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iRealTimeDataCallback.onResult(i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void writeToWearable(OutOfBandData outOfBandData, String str, byte[] bArr, final IWriteCallback iWriteCallback) throws RemoteException {
        a("writeToWearable");
        if (iWriteCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "writeToWearable", " callback is null");
            return;
        }
        if (str == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "writeToWearable", " info is null");
            iWriteCallback.onResult(2, "");
            return;
        }
        final len lenVar = new len();
        final QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        final String str2 = "writeToWearable";
        if (a(lcn.a(this.h, outOfBandData, 101202, 2), false, new Action() { // from class: las
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.d.a(lenVar, quickAppInfo, str2, iWriteCallback, i);
            }
        })) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(RemoteMessageConst.INPUT_TYPE);
            String strOptString2 = jSONObject.optString("inputDescription");
            String strOptString3 = jSONObject.optString("sizeAndFinish");
            if (strOptString3.isEmpty()) {
                strOptString3 = null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isWriteFile", bArr != null);
            jSONObject2.put("sizeAndFinish", strOptString3);
            lbm.c(this.h).a(strOptString, strOptString2, bArr, strOptString3, lel.c(iWriteCallback, lenVar, this.h, new ler("writeToWearable", 0, quickAppInfo.getPackageName()), jSONObject2));
        } catch (JSONException e2) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "writeToWearable", " JSONException: ", e2.getMessage());
            iWriteCallback.onResult(2, null);
            d(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), "writeToWearable", 2);
        }
    }

    public /* synthetic */ void a(len lenVar, QuickAppInfo quickAppInfo, String str, IWriteCallback iWriteCallback, int i) throws RemoteException {
        c(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), str, i);
        iWriteCallback.onResult(i, null);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void readFromWearable(OutOfBandData outOfBandData, String str, String str2, final IReadCallback iReadCallback) throws RemoteException {
        a("readFromWearable");
        if (iReadCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "readFromWearable", " callback is null");
            return;
        }
        final len lenVar = new len();
        final QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        final String str3 = "readFromWearable";
        if (a(lcn.a(this.h, outOfBandData, 101202, 1), true, new Action() { // from class: lax
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39758a.c(lenVar, quickAppInfo, str3, iReadCallback, i);
            }
        })) {
            return;
        }
        lbm.c(this.h).e(str, str2, lel.b(iReadCallback, lenVar, this.h, new ler("readFromWearable", 0, quickAppInfo.getPackageName())));
    }

    public /* synthetic */ void c(len lenVar, QuickAppInfo quickAppInfo, String str, IReadCallback iReadCallback, int i) throws RemoteException {
        c(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), str, i);
        iReadCallback.onResult(i, null, f12413b);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void pushMsgToWearable(OutOfBandData outOfBandData, String str, String str2, final ICommonCallback iCommonCallback) throws RemoteException {
        a("pushMsgToWearable");
        if (iCommonCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "pushMsgToWearable", " callback is null");
            return;
        }
        final len lenVar = new len();
        final QuickAppInfo quickAppInfo = (QuickAppInfo) outOfBandData;
        final String str3 = "pushMsgToWearable";
        if (a(lcn.a(this.h, outOfBandData, 101203, 2), false, new Action() { // from class: laq
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.f39738a.a(lenVar, quickAppInfo, str3, iCommonCallback, i);
            }
        })) {
            return;
        }
        lbm.c(this.h).a(ljp.a(quickAppInfo), str, str2, lel.d(iCommonCallback, lenVar, this.h, new ler("pushMsgToWearable", 0, quickAppInfo.getPackageName()), "com.huawei.hihealthservice.hihealthkit.constant.BusinessErrorCode.pushMessageFilterCode"));
    }

    public /* synthetic */ void a(len lenVar, QuickAppInfo quickAppInfo, String str, ICommonCallback iCommonCallback, int i) throws RemoteException {
        c(lenVar, quickAppInfo.getPackageName(), quickAppInfo.getAppId(), str, i);
        iCommonCallback.onResult(i, null);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void registerRealTimeSportCallback(OutOfBandData outOfBandData, final ISportDataCallback iSportDataCallback) throws RemoteException {
        a("registerRealTimeSportCallback");
        if (iSportDataCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "registerRealTimeSportCallback", " callback is null");
            return;
        }
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final String str = "registerRealTimeSportCallback";
        if (a(lcn.e(this.h, outOfBandData, this.d, 101003, 1), true, new Action() { // from class: laa
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.d.b(lenVar, strA, strC, str, iSportDataCallback, i);
            }
        })) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        LogUtil.a("HiHlthKitExtBnd", "registerRealTimeSportCallback callingUid = ", Integer.valueOf(callingUid));
        ITrackDataForDeveloper iTrackDataForDeveloper = this.m.get(Integer.valueOf(callingUid));
        if (iTrackDataForDeveloper != null) {
            lbg.b(this.h).d(iTrackDataForDeveloper, new ICommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.5
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str2) {
                    ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "unregister prior callback result ", Integer.valueOf(i));
                }
            });
        }
        d dVar = new d(iSportDataCallback);
        this.m.put(Integer.valueOf(callingUid), dVar);
        lbg.b(this.h).e((ITrackDataForDeveloper) dVar);
        iSportDataCallback.onResult(0);
        c("registerRealTimeSportCallback", strA);
        d(lenVar, strA, strC, "registerRealTimeSportCallback", 0);
    }

    public /* synthetic */ void b(len lenVar, String str, String str2, String str3, ISportDataCallback iSportDataCallback, int i) throws RemoteException {
        LogUtil.j("HiHlthKitExtBnd", lcr.b(i));
        c(lenVar, str, str2, str3, i);
        iSportDataCallback.onResult(i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void unregisterRealTimeSportCallback(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
        a("unregisterRealTimeSportCallback");
        if (iCommonCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "unregisterRealTimeSportCallback", " callback is null");
            return;
        }
        len lenVar = new len();
        String strA = a(outOfBandData);
        String strC = c(outOfBandData);
        LogUtil.d("HiHlthKitExtBnd", "unregisterRealTimeSportCallback", " packageName:", strA);
        int callingUid = Binder.getCallingUid();
        LogUtil.a("HiHlthKitExtBnd", "unregisterRealTimeSportCallback callingUid = ", Integer.valueOf(callingUid));
        lbg.b(this.h).d(this.m.get(Integer.valueOf(callingUid)), iCommonCallback);
        d(lenVar, strA, strC, "unregisterRealTimeSportCallback", 0);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getSwitch(OutOfBandData outOfBandData, String str, final ICommonCallback iCommonCallback) throws RemoteException {
        a("getSwitch");
        final len lenVar = new len();
        if (iCommonCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getSwitch", " callback is null");
            return;
        }
        if (str == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getSwitch", " key is null");
            iCommonCallback.onResult(2, "");
            return;
        }
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final String str2 = "getSwitch";
        if (a(lcn.a(this.h, outOfBandData, 101204, 2), false, new Action() { // from class: lag
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i) throws RemoteException {
                this.e.a(lenVar, strA, strC, str2, iCommonCallback, i);
            }
        })) {
            return;
        }
        LogUtil.d("HiHlthKitExtBnd", "getSwitch", " packageName:", strA);
        int callingUid = Binder.getCallingUid();
        LogUtil.a("HiHlthKitExtBnd", "getSwitch callingUid = ", Integer.valueOf(callingUid));
        lbg.b(this.h).d(this.m.get(Integer.valueOf(callingUid)), iCommonCallback);
        d(lenVar, strA, strC, "getSwitch", 0);
    }

    public /* synthetic */ void a(len lenVar, String str, String str2, String str3, ICommonCallback iCommonCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iCommonCallback.onResult(i, null);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void querySleepWakeTime(OutOfBandData outOfBandData, HiHealthDataQuery hiHealthDataQuery, int i, final IDataReadResultListener iDataReadResultListener) throws RemoteException {
        a("querySleepWakeTime");
        if (iDataReadResultListener == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "querySleepWakeTime", " callback is null");
            return;
        }
        if (hiHealthDataQuery == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "querySleepWakeTime", " query is null");
            iDataReadResultListener.onResult(Collections.EMPTY_LIST, 2, 2);
            return;
        }
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final String str = "querySleepWakeTime";
        if (a(lcn.e(this.h, outOfBandData, this.d, hiHealthDataQuery.getSampleType(), 1), true, new Action() { // from class: lap
            @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
            public final void operate(int i2) throws RemoteException {
                this.f39737c.e(lenVar, strA, strC, str, iDataReadResultListener, i2);
            }
        })) {
            return;
        }
        HiHealthKitQueryHelper hiHealthKitQueryHelper = new HiHealthKitQueryHelper(this.h, strA, strC);
        hiHealthDataQuery.setSampleType(22104);
        hiHealthKitQueryHelper.a(hiHealthDataQuery, iDataReadResultListener, new lbh(lcn.b(outOfBandData, this.h, this.d), "querySleepWakeTime"));
    }

    public /* synthetic */ void e(len lenVar, String str, String str2, String str3, IDataReadResultListener iDataReadResultListener, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iDataReadResultListener.onResult(null, i, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) throws RemoteException {
        boolean zC = AuthorizationUtils.c(BaseApplication.getContext());
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "handleMessage requestAuthorization isAuthPermitted = ", Boolean.valueOf(zC));
        HashMap map = new HashMap(16);
        if (zC) {
            map.put("flag", String.valueOf(message.arg1));
            this.j.onResult(0, map);
            Intent intentA = a();
            len lenVar = new len();
            try {
                Bundle data = message.getData();
                if (data == null) {
                    return;
                }
                e(intentA, data);
                this.h.startActivity(intentA);
                d(lenVar, this.f12415a.getPackageName(), this.f12415a.getAppId(), "requestAuthorization", 0);
                return;
            } catch (Exception e2) {
                ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "handleAuthMessage Exception: ", e2.getMessage());
            }
        }
        this.j.onResult(1003, map);
    }

    private Intent a() {
        Intent intent = new Intent();
        String str = f12414c;
        intent.setClassName(str, "com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAuthActivity");
        intent.setPackage(str);
        intent.setFlags(268435456);
        intent.addFlags(134217728);
        intent.addFlags(524288);
        intent.addFlags(8388608);
        return intent;
    }

    private void e(Intent intent, Bundle bundle) {
        intent.putExtra("third_party_package_name", this.f12415a.getPackageName());
        intent.putExtra("writeTypes", bundle.getIntArray("writeTypes"));
        intent.putExtra("readTypes", bundle.getIntArray("readTypes"));
        intent.putExtra(MapKeyNames.APP_INFO, c(this.f12415a));
    }

    private boolean b(HiAppInfo hiAppInfo, QuickAppInfo quickAppInfo) {
        String appName;
        return (hiAppInfo == null || (appName = hiAppInfo.getAppName()) == null || !appName.equals("QuickApp_".concat(quickAppInfo.getName()))) ? false : true;
    }

    private HiAppInfo c(QuickAppInfo quickAppInfo) {
        LogUtil.d("HiHlthKitExtBnd", "enter saveAppInfo");
        HiAppInfo hiAppInfoD = kwi.b().d(quickAppInfo.getPackageName());
        if (b(hiAppInfoD, quickAppInfo)) {
            return hiAppInfoD;
        }
        if (hiAppInfoD != null) {
            return b(quickAppInfo);
        }
        kwi.b().d(ljp.b(quickAppInfo), 0);
        return kwi.b().d(quickAppInfo.getPackageName());
    }

    private HiAppInfo b(QuickAppInfo quickAppInfo) {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "updateAppInfo ", quickAppInfo.getPackageName(), " name: ", quickAppInfo.getName());
        int iD = kwi.b().d(ljp.b(quickAppInfo));
        if (iD > 0) {
            ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "upDateAppName result = ", Integer.valueOf(iD));
            return kwi.b().d(quickAppInfo.getPackageName());
        }
        ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "upDateAppName, fail");
        return null;
    }

    private boolean b(OutOfBandData outOfBandData) {
        return outOfBandData instanceof QuickAppInfo;
    }

    private void a(String str) {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "enter ", str);
    }

    private void c(len lenVar, String str, String str2, String str3, int i) {
        ReleaseLogUtil.e("HiH_HiHlthKitExtBnd", str3, lcr.b(i));
        d(lenVar, str, str2, str3, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(len lenVar, String str, String str2, String str3, int i) {
        lenVar.d(this.h, new ler(str3, i, str, str2));
    }

    private void c(String str, QuickAppInfo quickAppInfo) {
        if (quickAppInfo != null) {
            LogUtil.d("HiHlthKitExtBnd", str, " caller:{", quickAppInfo.getPackageName(), "}");
        }
    }

    private void c(String str, String str2) {
        LogUtil.d("HiHlthKitExtBnd", str, " caller:{", str2, "}");
    }

    private boolean e(OutOfBandData outOfBandData, IDataOperateListener iDataOperateListener, String str, len lenVar) throws RemoteException {
        if (!TextUtils.isEmpty(a(outOfBandData))) {
            return false;
        }
        iDataOperateListener.onResult(2, lcr.e(2));
        d(lenVar, a(outOfBandData), c(outOfBandData), str, 2);
        ReleaseLogUtil.e("HiH_HiHlthKitExtBnd", "package name is null");
        return true;
    }

    private len d(OutOfBandData outOfBandData, String str, int i) {
        return new len(this.h, new ler(str, i, a(outOfBandData), c(outOfBandData)));
    }

    /* JADX INFO: loaded from: classes10.dex */
    class d extends ITrackDataForDeveloper.Stub {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ISportDataCallback f12445c;

        d(ISportDataCallback iSportDataCallback) {
            this.f12445c = iSportDataCallback;
        }

        @Override // com.huawei.health.ITrackDataForDeveloper
        public void onStateChanged(int i) {
            try {
                ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "onStateChanged state: ", Integer.valueOf(i));
                HiHealthKitExtendBinder.this.o.putInt("sportState", i);
                this.f12445c.onDataChanged(i, HiHealthKitExtendBinder.this.o);
            } catch (RemoteException e) {
                ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "registerRealTimeSportCallback onDataChange RemoteException: ", e.getMessage());
            }
        }

        @Override // com.huawei.health.ITrackDataForDeveloper
        public void onDataChange(Bundle bundle) {
            try {
                if (bundle == null) {
                    LogUtil.e("HiHlthKitExtBnd", "TrackData onDataChanged, get null");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                LogUtil.a("HiHlthKitExtBnd", "onDataChange data = " + jSONObject.toString());
                this.f12445c.onDataChanged(bundle.getInt("sportState"), bundle);
                HiHealthKitExtendBinder.this.o = (Bundle) bundle.clone();
            } catch (RemoteException | JSONException e) {
                ReleaseLogUtil.e("HiH_HiHlthKitExtBnd", "registerRealTimeSportCallback onDataChange RemoteException", LogAnonymous.b(e));
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public int getAbilityVersion(OutOfBandData outOfBandData) {
        LogUtil.a("HiHlthKitExtBnd", "enter ", "getAbilityVersion");
        return 1;
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public int getServiceApiLevel(OutOfBandData outOfBandData) {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "enter ", "getServiceApiLevel");
        len lenVar = new len();
        String strA = a(outOfBandData);
        String strC = c(outOfBandData);
        int iE = let.e(this.h);
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "serviceApiLevel: ", Integer.valueOf(iE));
        d(lenVar, strA, strC, "getServiceApiLevel", 0);
        return iE;
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public String getCategory(int i) {
        return HiHealthDataType.d(i).name();
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void registerDataAutoReport(OutOfBandData outOfBandData, DataReportModel dataReportModel, final IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "enter ", "registerDataAutoReport");
        final len lenVar = new len();
        a("registerDataAutoReport");
        String strA = a(outOfBandData);
        String strC = c(outOfBandData);
        if (iRegisterRealTimeCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "registerDataAutoReport", " callback is null");
            c(lenVar, strA, strC, "registerDataAutoReport", 2);
            return;
        }
        if (dataReportModel == null || strA == null) {
            iRegisterRealTimeCallback.onResult(2, lcr.b(1001));
            c(lenVar, strA, strC, "registerDataAutoReport", 2);
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "registerDataAutoReport query or package name is null");
        } else if (lcm.e("registerDataAutoReport", iRegisterRealTimeCallback)) {
            if (!HiHealthKitDataChecker.a(dataReportModel)) {
                iRegisterRealTimeCallback.onResult(2, lcr.b(2));
                return;
            }
            int dataType = dataReportModel.getDataType();
            final ler lerVar = new ler("registerDataAutoReport", 0, strA, strC, String.valueOf(dataType));
            if (CharacteristicConstant.ReportType.containsAuthIgnore(dataReportModel.getReportType()) || !a(lcn.e(this.h, outOfBandData, this.d, dataType, 1), false, new Action() { // from class: law
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.f39756a.e(iRegisterRealTimeCallback, lenVar, lerVar, i);
                }
            })) {
                lfc.b(this.h).c(dataReportModel, iRegisterRealTimeCallback, lenVar);
            }
        }
    }

    public /* synthetic */ void e(IRegisterRealTimeCallback iRegisterRealTimeCallback, len lenVar, ler lerVar, int i) throws RemoteException {
        LogUtil.j("HiHlthKitExtBnd", lcr.b(i));
        iRegisterRealTimeCallback.onResult(i, lcr.b(1001));
        lenVar.d(this.h, lerVar.e(i));
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void unregisterDataAutoReport(OutOfBandData outOfBandData, DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "enter ", "unregisterDataAutoReport");
        len lenVar = new len();
        if (iRegisterRealTimeCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "unregisterDataAutoReport", " callback is null");
        } else if (lcm.e("unregisterDataAutoReport", iRegisterRealTimeCallback)) {
            if (!HiHealthKitDataChecker.a(dataReportModel)) {
                iRegisterRealTimeCallback.onResult(2, lcr.b(2));
            } else {
                lfc.b(this.h).d(dataReportModel, iRegisterRealTimeCallback, lenVar);
            }
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getUserInfo(OutOfBandData outOfBandData, List<String> list, final ICommonCallback iCommonCallback) throws RemoteException {
        final len lenVar = new len();
        a(Constants.METHOD_GET_USER_INFO);
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (iCommonCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", Constants.METHOD_GET_USER_INFO, " callback is null");
            c(lenVar, strA, strC, Constants.METHOD_GET_USER_INFO, 2);
            return;
        }
        if (njy.e(list)) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", Constants.METHOD_GET_USER_INFO, " dataTypeList is empty");
            iCommonCallback.onResult(2, lcr.b(2));
            c(lenVar, strA, strC, Constants.METHOD_GET_USER_INFO, 2);
        } else if (lcm.e(Constants.METHOD_GET_USER_INFO, iCommonCallback)) {
            int iE = lcn.e(this.h, outOfBandData, this.d, 101001, 1);
            final String str = Constants.METHOD_GET_USER_INFO;
            if (a(iE, true, new Action() { // from class: lau
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.f39751b.e(lenVar, strA, strC, str, iCommonCallback, i);
                }
            })) {
                return;
            }
            leu.d(list, iCommonCallback, lenVar, new ler(Constants.METHOD_GET_USER_INFO, 0, strA, strC), this.h);
        }
    }

    public /* synthetic */ void e(len lenVar, String str, String str2, String str3, ICommonCallback iCommonCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iCommonCallback.onResult(i, lcr.b(i));
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void setUserPreference(OutOfBandData outOfBandData, HiUserPreferenceData hiUserPreferenceData, boolean z, final IDataOperateListener iDataOperateListener) throws RemoteException {
        final len lenVar = new len();
        a("setUserPreference");
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (iDataOperateListener == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "setUserPreference", " callback is null");
            c(lenVar, strA, strC, "setUserPreference", 2);
            return;
        }
        if (hiUserPreferenceData == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "setUserPreference", " userPreference is null");
            c(lenVar, strA, strC, "setUserPreference", 2);
            iDataOperateListener.onResult(2, null);
        } else if (lcm.e("setUserPreference", iDataOperateListener)) {
            final String str = "setUserPreference";
            if (a(lcn.e(this.h, outOfBandData, this.d, 0, 1), false, new Action() { // from class: kzx
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.f39687b.d(lenVar, strA, strC, str, iDataOperateListener, i);
                }
            })) {
                return;
            }
            boolean userPreference = HiHealthNativeApi.a(this.h).setUserPreference(new HiUserPreference(hiUserPreferenceData.getKey(), hiUserPreferenceData.getValue()), z);
            ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "setUserPreference result: ", Boolean.valueOf(userPreference));
            int i = !userPreference ? 1 : 0;
            iDataOperateListener.onResult(i, null);
            c(lenVar, strA, strC, "setUserPreference", i);
        }
    }

    public /* synthetic */ void d(len lenVar, String str, String str2, String str3, IDataOperateListener iDataOperateListener, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iDataOperateListener.onResult(i, null);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void getUserPreference(OutOfBandData outOfBandData, List<String> list, final IDataOperateListener iDataOperateListener) throws RemoteException {
        final len lenVar = new len();
        a("getUserPreference");
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (HiCommonUtil.b(list)) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "getUserPreferenceList keys = null");
            c(lenVar, strA, strC, "getUserPreference", 2);
            iDataOperateListener.onResult(2, null);
            return;
        }
        if (lcm.e("getUserPreference", iDataOperateListener)) {
            final String str = "getUserPreference";
            if (a(lcn.e(this.h, outOfBandData, this.d, 0, 1), false, new Action() { // from class: lba
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.f39770b.c(lenVar, strA, strC, str, iDataOperateListener, i);
                }
            })) {
                return;
            }
            List<HiUserPreference> userPreferenceList = HiHealthNativeApi.a(this.h).getUserPreferenceList(list);
            ArrayList arrayList = new ArrayList(10);
            for (HiUserPreference hiUserPreference : userPreferenceList) {
                HiUserPreferenceData hiUserPreferenceData = new HiUserPreferenceData();
                hiUserPreferenceData.setKey(hiUserPreference.getKey());
                hiUserPreferenceData.setValue(hiUserPreference.getValue());
                arrayList.add(hiUserPreferenceData);
            }
            iDataOperateListener.onResult(0, arrayList);
            c(lenVar, strA, strC, "getUserPreference", 0);
        }
    }

    public /* synthetic */ void c(len lenVar, String str, String str2, String str3, IDataOperateListener iDataOperateListener, int i) throws RemoteException {
        LogUtil.j("HiHlthKitExtBnd", lcr.b(i));
        c(lenVar, str, str2, str3, i);
        iDataOperateListener.onResult(i, null);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void subscribeData(OutOfBandData outOfBandData, SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "enter ", "subscribeData");
        ler lerVar = new ler("subscribeData", 0, a(outOfBandData), c(outOfBandData));
        if (lcm.e("subscribeData", iSubScribeCallback)) {
            len lenVar = new len(this.h, lerVar);
            Notification notification = new Notification(0, 4, lcr.b(4));
            if (!HiHealthKitDataChecker.e(subscribeModel)) {
                ReleaseLogUtil.e("HiH_HiHlthKitExtBnd", "subscribeData", "wrong subscribe model");
                notification.setErrorInfo(2, lcr.b(2));
                iSubScribeCallback.onResult(new ArrayList(), Arrays.asList(notification));
                lenVar.e().e(2);
                for (int i : subscribeModel.getDataTypes()) {
                    lenVar.e().e(String.valueOf(i));
                    lenVar.a();
                }
                return;
            }
            lfe.e(this.h).b(subscribeModel, iSubScribeCallback, lenVar);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void unSubscribeData(OutOfBandData outOfBandData, SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "enter ", "unSubscribeData");
        len lenVar = new len(this.h, new ler("unSubscribeData", 0, a(outOfBandData), c(outOfBandData)));
        if (lcm.e("unSubscribeData", iSubScribeCallback)) {
            Notification notification = new Notification(0, 4, lcr.b(4));
            if (!HiHealthKitDataChecker.e(subscribeModel)) {
                ReleaseLogUtil.e("HiH_HiHlthKitExtBnd", "unSubscribeData", " wrong subscribe model");
                notification.setErrorInfo(2, lcr.b(2));
                iSubScribeCallback.onResult(new ArrayList(), Arrays.asList(notification));
                lenVar.e().e(2);
                for (int i : subscribeModel.getDataTypes()) {
                    lenVar.e().e(String.valueOf(i));
                    lenVar.a();
                }
                return;
            }
            lfe.e(this.h).e(subscribeModel, iSubScribeCallback, lenVar);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void syncData(OutOfBandData outOfBandData, int[] iArr, final ICommonCallback iCommonCallback) throws RemoteException {
        final len lenVar = new len();
        a("syncData");
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (iCommonCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "syncData", " callback is null");
            c(lenVar, strA, strC, "syncData", 2);
        } else if (!HiHealthKitDataChecker.c(iArr)) {
            iCommonCallback.onResult(2, lcr.b(2));
            c(lenVar, strA, strC, "syncData", 2);
        } else if (lcm.e("syncData", iCommonCallback)) {
            final String str = "syncData";
            if (a(lcn.e(this.h, outOfBandData, this.d, 0, 2), false, new Action() { // from class: kzs
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i) throws RemoteException {
                    this.f39672c.i(lenVar, strA, strC, str, iCommonCallback, i);
                }
            })) {
                return;
            }
            lbj.a().c(iArr, iCommonCallback);
        }
    }

    public /* synthetic */ void i(len lenVar, String str, String str2, String str3, ICommonCallback iCommonCallback, int i) throws RemoteException {
        LogUtil.j("HiHlthKitExtBnd", lcr.b(i));
        c(lenVar, str, str2, str3, i);
        iCommonCallback.onResult(i, null);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void queryTrends(OutOfBandData outOfBandData, TrendQuery trendQuery, int i, final IDataReadResultListener iDataReadResultListener) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "enter ", "queryTrends");
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        final len lenVar = new len(this.h, new ler("queryTrends", 0, strA, strC));
        if (iDataReadResultListener == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "queryTrends", " callback is null");
            iDataReadResultListener.onResult(Collections.EMPTY_LIST, 2, 2);
            c(lenVar, strA, strC, "queryTrends", 2);
        } else if (!HiHealthKitDataChecker.a(trendQuery, i)) {
            iDataReadResultListener.onResult(Collections.EMPTY_LIST, 2, 2);
            c(lenVar, strA, strC, "queryTrends", 2);
        } else if (!let.c(trendQuery)) {
            iDataReadResultListener.onResult(Collections.EMPTY_LIST, 30, 2);
            c(lenVar, strA, strC, "queryTrends", 30);
        } else if (lcm.e("queryTrends", iDataReadResultListener)) {
            final String str = "queryTrends";
            if (a(lcn.e(this.h, outOfBandData, this.d, 0, 2), false, new Action() { // from class: laf
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i2) throws RemoteException {
                    this.d.d(lenVar, strA, strC, str, iDataReadResultListener, i2);
                }
            })) {
                return;
            }
            new HiHealthKitQueryHelper(this.h, strA, strC).d(trendQuery, i, iDataReadResultListener);
        }
    }

    public /* synthetic */ void d(len lenVar, String str, String str2, String str3, IDataReadResultListener iDataReadResultListener, int i) throws RemoteException {
        LogUtil.j("HiHlthKitExtBnd", lcr.b(i));
        c(lenVar, str, str2, str3, i);
        iDataReadResultListener.onResult(Collections.EMPTY_LIST, i, 2);
    }

    @Override // com.huawei.hihealth.IHiHealthKitEx
    public void connectSportDevice(OutOfBandData outOfBandData, int i, final ICommonCallback iCommonCallback) throws RemoteException {
        a("connectSportDevice");
        final len lenVar = new len();
        final String strA = a(outOfBandData);
        final String strC = c(outOfBandData);
        if (iCommonCallback == null) {
            ReleaseLogUtil.a("HiH_HiHlthKitExtBnd", "connectSportDevice", " callback is null");
            c(lenVar, strA, strC, "connectSportDevice", 2);
        } else if (let.e("connectSportDevice", i, d(outOfBandData, "connectSportDevice", 30), iCommonCallback) && lcm.e("connectSportDevice", iCommonCallback)) {
            final String str = "connectSportDevice";
            if (a(lcn.e(this.h, outOfBandData, this.d, 101003, 1), true, new Action() { // from class: kzz
                @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
                public final void operate(int i2) throws RemoteException {
                    this.f39694c.c(lenVar, strA, strC, str, iCommonCallback, i2);
                }
            })) {
                return;
            }
            final String str2 = "connectSportDevice";
            lbg.b(this.h).b(i, new IBaseCommonCallback.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.3
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i2, String str3) throws RemoteException {
                    ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", str2, " result code ", Integer.valueOf(i2));
                    iCommonCallback.onResult(i2, str3);
                    HiHealthKitExtendBinder.this.d(lenVar, strA, strC, str2, i2);
                }
            });
        }
    }

    public /* synthetic */ void c(len lenVar, String str, String str2, String str3, ICommonCallback iCommonCallback, int i) throws RemoteException {
        c(lenVar, str, str2, str3, i);
        iCommonCallback.onResult(i, "connectSportDevice permission denied");
    }

    public void onDestroy() {
        ReleaseLogUtil.d("HiH_HiHlthKitExtBnd", "onDestroy");
    }
}
