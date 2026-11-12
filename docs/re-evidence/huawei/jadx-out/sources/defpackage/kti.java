package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.data.constant.HiErrorCode;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.util.HiDivideUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.auth.HiAuthException;
import com.huawei.hihealthservice.auth.HiAuthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class kti extends HiDataOperation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ExecutorService f39420c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39422b;
    private final ArrayList<Object> d;
    private int e;
    private HiDataInsertOption f;
    private kym g;
    private final int[] h;
    private IDataOperateListener i;
    private List<HiHealthData> j;
    private int k;
    private String l;

    @Override // com.huawei.hihealthservice.HiDataOperation
    public boolean isMonitorThread() {
        return true;
    }

    kti(Context context) {
        super(context);
        this.e = 2;
        this.h = new int[]{0};
        ArrayList<Object> arrayList = new ArrayList<>(10);
        this.d = arrayList;
        this.j = new ArrayList(10);
        arrayList.add(HiErrorCode.c(0));
    }

    public boolean e(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener, boolean z, boolean z2) throws RemoteException {
        if (hiDataInsertOption == null) {
            ReleaseLogUtil.e("HiH_HiDataInsOp", "initialize insertOption is null ");
            this.h[0] = 7;
            ktu.d(iDataOperateListener, 7, this.d);
            return false;
        }
        if (!c(hiDataInsertOption)) {
            ReleaseLogUtil.e("HiH_HiDataInsOp", "initialize processDictSportSequence is false ");
            this.h[0] = 7;
            ktu.d(iDataOperateListener, 7, this.d);
            return false;
        }
        if (!a(hiDataInsertOption)) {
            return false;
        }
        String strE = ljp.e(this.mContext);
        this.l = c(hiDataInsertOption, strE);
        this.f = hiDataInsertOption;
        this.i = iDataOperateListener;
        if (hiDataInsertOption.getAppInfo() != null) {
            this.f39421a = ktx.c().d(hiDataInsertOption.getAppInfo());
        } else {
            this.f39421a = ktx.c().e(this.l);
        }
        this.f39422b = ktx.c().a(strE);
        if ((z2 && !d()) || !b(z)) {
            return false;
        }
        this.k = kud.a().e();
        this.g = ktx.c().a(this.l, this.f39421a);
        this.e = !z ? 1 : 0;
        return true;
    }

    private boolean a(HiDataInsertOption hiDataInsertOption) {
        try {
            String packageName = hiDataInsertOption.getPackageName();
            HiAppInfo appInfo = hiDataInsertOption.getAppInfo();
            if (!StringUtils.g(packageName) && appInfo != null) {
                c(appInfo);
                if (packageName.equals(appInfo.getPackageName())) {
                    return true;
                }
                throw new lks("two packageName values are different");
            }
            return true;
        } catch (lks e) {
            ReleaseLogUtil.a("HiH_HiDataInsOp", "validInsertOption HiValidException = ", ExceptionUtils.c(e));
            this.h[0] = 3;
            this.d.add("Please check the data validity according to the requirement of HiHealth platform ! " + e.getMessage());
            ktu.d(this.i, 3, this.d);
            return false;
        }
    }

    public void c(HiAppInfo hiAppInfo) throws lks {
        if (StringUtils.g(hiAppInfo.getPackageName())) {
            throw new lks("appInfo packageName is null or empty!");
        }
        if (StringUtils.g(hiAppInfo.getAppName())) {
            throw new lks("appInfo appName is null or empty!");
        }
    }

    private boolean c(HiDataInsertOption hiDataInsertOption) {
        List<HiHealthData> datas = hiDataInsertOption.getDatas();
        if (HiCommonUtil.b(datas)) {
            return false;
        }
        for (HiHealthData hiHealthData : datas) {
            HiDivideUtil.d((List<HiHealthData>) Collections.singletonList(hiHealthData));
            if (hiHealthData.getType() == 30001) {
                try {
                    JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
                    int subType = hiHealthData.getSubType();
                    if (subType <= 0) {
                        subType = CommonUtil.c(jSONObject, BleConstants.SPORT_TYPE);
                        hiHealthData.setSubType(subType);
                    }
                    int type = hiHealthData.getType() + subType;
                    if (HiHealthDictManager.a(this.mContext).k(type)) {
                        hiHealthData.setType(type);
                    }
                    ReleaseLogUtil.d("HiH_HiDataInsOp", "sportType = ", Integer.valueOf(subType), ", after process type is ", Integer.valueOf(type));
                } catch (JSONException e) {
                    ReleaseLogUtil.e("HiH_HiDataInsOp", "processDictSportSequence JSONException!, e is ", e.getMessage());
                    return false;
                }
            }
        }
        return true;
    }

    private String c(HiDataInsertOption hiDataInsertOption, String str) {
        if (hiDataInsertOption.getAppInfo() != null) {
            return hiDataInsertOption.getAppInfo().getPackageName();
        }
        String packageName = hiDataInsertOption.getPackageName();
        if (packageName != null) {
            str = packageName;
        }
        if ("com.huawei.bone".equals(str) && !njy.e(hiDataInsertOption.getDatas())) {
            HiHealthData hiHealthData = hiDataInsertOption.getDatas().get(0);
            if (HiHealthDataType.d(hiHealthData.getType()) == HiHealthDataType.Category.SEQUENCE && hiHealthData.getType() < 30999) {
                return HuaweiHealth.c();
            }
        }
        return str;
    }

    private boolean b(boolean z) {
        try {
            this.j = lko.b(this.f, z);
            return true;
        } catch (lks e) {
            ReleaseLogUtil.a("HiH_HiDataInsOp", "validInsertOption HiValidException = ", e.getMessage());
            this.h[0] = 3;
            this.d.add("Please check the data validity according to the requirement of HiHealth platform ! " + e.getMessage());
            ktu.d(this.i, 3, this.d);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
            linkedHashMap.put("validInsertStatus", "fail " + e.getMessage());
            ljv.d(BaseApplication.getContext()).c(OperationKey.HEALTH_DATA_INSERT_VALID_FAIL_2129013.value(), linkedHashMap, false);
            return false;
        }
    }

    private boolean d() {
        int i = this.f39422b;
        if (i == -1) {
            ReleaseLogUtil.e("HiH_HiDataInsOp", "initialize appType is invalid errorCode is ", 17);
            ktu.d(this.i, 17, this.d);
            return false;
        }
        if (i == 0) {
            return true;
        }
        this.h[0] = kud.a().a(this.f39421a);
        int i2 = this.h[0];
        if (i2 != 0) {
            LogUtil.j("HiH_HiDataInsOp", "insertHiHealthData() errorCode is ", Integer.valueOf(i2));
            this.d.add(HiErrorCode.c(this.h[0]));
            ktu.d(this.i, this.h[0], this.d);
            return false;
        }
        try {
            HiAuthManager.getInstance().checkInsertAuth(this.f39421a, kud.a().e(), this.f.getDatas());
            return true;
        } catch (HiAuthException e) {
            ReleaseLogUtil.a("HiH_HiDataInsOp", "insertHiHealthData() HiAuthException e = ", LogAnonymous.b(e), " appID = ", Integer.valueOf(this.f39421a));
            this.h[0] = 8;
            this.d.add(HiErrorCode.c(this.h[0]) + e.getMessage());
            ktu.d(this.i, this.h[0], this.d);
            return false;
        }
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        IDataOperateListener iDataOperateListener;
        int i;
        int i2 = this.f39421a;
        LogUtil.d("HiH_HiDataInsOp", "execute callingAppID = ", Integer.valueOf(i2), ", ownerAppId=", Integer.valueOf(i2), ", ownerUserId=", Integer.valueOf(this.k), ", dataType=", Integer.valueOf(this.e), ", valid time = ", Long.valueOf(System.currentTimeMillis() - this.mStartTime));
        try {
            try {
                if (c()) {
                    liz.a().a(this.f.getDatas(), b());
                } else {
                    c(b());
                }
                iDataOperateListener = this.i;
                i = this.h[0];
            } catch (Exception e) {
                ReleaseLogUtil.a("HiH_HiDataInsOp", "execute Exception=", LogAnonymous.b(e));
                this.h[0] = 2;
                this.d.add(HiErrorCode.c(this.h[0]) + " insert exception");
                iDataOperateListener = this.i;
                i = this.h[0];
            }
            ktu.d(iDataOperateListener, i, this.d);
            ReleaseLogUtil.d("HiH_HiDataInsOp", "execEndTtlTm=", Long.valueOf(System.currentTimeMillis() - this.mStartTime));
        } catch (Throwable th) {
            ktu.d(this.i, this.h[0], this.d);
            throw th;
        }
    }

    private kym b() throws RemoteException {
        if (this.g == null) {
            this.g = ktx.c().c(this.l);
        }
        return this.g;
    }

    private void c(kym kymVar) {
        List<HiHealthData> datas = this.f.getDatas();
        if (datas == null || datas.size() <= 0 || datas.get(0) == null) {
            ReleaseLogUtil.e("HiH_HiDataInsOp", "hiHealthDatas is null or hiHealthDatas.size() <= ", 0, " or hiHealthDatas.get(DEFAULT_INDEX) is null");
            return;
        }
        HiHealthData hiHealthData = datas.get(0);
        int type = hiHealthData.getType();
        ReleaseLogUtil.d("HiH_HiDataInsOp", "insHiHlhDt Sz=", Integer.valueOf(datas.size()), ",app=", Integer.valueOf(this.f39421a), ",1DtTp=", Integer.valueOf(type), ",pkgNm=", this.l, ",wStatTp=", Integer.valueOf(this.f.getWriteStatType()));
        if (type != 40002) {
            lgp.f().u();
        }
        if (type == 40054) {
            lgg.b(this.f, datas, 40054);
        }
        kym kymVarD = d(kymVar, hiHealthData);
        lfz lfzVarD = lfz.d(this.mContext);
        this.h[0] = lfzVarD.bulkSaveDetailHiHealthData(datas, kymVarD, this.f.getWriteStatType());
        if (this.f39422b != -1 || datas.get(0).getType() == 2200) {
            lfzVarD.prepareRealTimeHealthDataStat(datas);
            lfzVarD.doRealTimeHealthDataStat();
        }
        if (this.h[0] != 10) {
            liz.a().a(datas, kymVar);
        }
        ktx.c().b(datas, kymVar, lgp.f(), a());
        if (!HiCommonUtil.b(this.j)) {
            this.h[0] = 27;
            this.d.add(HiJsonUtil.d(this.j));
            return;
        }
        int i = this.h[0];
        if (i != 0) {
            Object objC = HiErrorCode.c(i);
            int i2 = this.h[0];
            ReleaseLogUtil.e("HiH_HiDataInsOp", "insHiHlhDtSaveDt FailCode=", Integer.valueOf(i2), ",errorMessage = ", HiErrorCode.c(i2));
            this.d.add("bulkSaveDetailHiHealthData fail " + objC);
            return;
        }
        this.d.add(true);
    }

    private kym d(kym kymVar, HiHealthData hiHealthData) {
        kym kymVarE;
        int iC = kud.a().c();
        if (hiHealthData.getType() >= 901 && hiHealthData.getType() <= 906) {
            kymVarE = kyn.d(this.mContext).e(iC, iC, hiHealthData.getOwnerId(), hiHealthData.getDeviceUuid());
        } else {
            kymVarE = kyn.d(this.mContext).e(kymVar.b(), iC, hiHealthData.getOwnerId(), hiHealthData.getDeviceUuid());
        }
        if (kymVarE == null) {
            ReleaseLogUtil.e("HiH_HiDataInsOp", "getHiHealthContext insertContext is null");
            return kymVarE;
        }
        if (this.f39422b != -1) {
            kymVarE.b(kyj.c().c(kymVarE.i()));
            kymVarE.e(0);
            HiDeviceInfo hiDeviceInfoB = kwy.b(this.mContext).b(kymVarE.d());
            if (hiDeviceInfoB != null) {
                kymVarE.e(hiDeviceInfoB.getDeviceType());
            }
        } else {
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(Integer.valueOf(kymVarE.c()));
            kymVarE.b(arrayList);
            kymVarE.e(0);
        }
        if (HiHealthDataType.d(hiHealthData.getType()) != HiHealthDataType.Category.BUSINESS) {
            return kymVarE;
        }
        kym kymVarD = kyn.d(this.mContext).d(0, this.k, 0);
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(Integer.valueOf(kymVarD.c()));
        kymVarD.b(arrayList2);
        return kymVarD;
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public int getDataType() {
        return this.e;
    }

    private boolean c() {
        return getDataType() == 0;
    }

    private static ExecutorService a() {
        if (f39420c == null || f39420c.isShutdown()) {
            f39420c = Executors.newSingleThreadExecutor();
        }
        return f39420c;
    }
}
