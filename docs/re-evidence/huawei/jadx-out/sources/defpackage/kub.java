package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.data.constant.HiErrorCode;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.dbmanager.SampleConfigManager;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kub extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<HiSampleConfig> f39489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IDataOperateListener f39490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<Object> f39491c;
    private List<HiSampleConfig> d;
    private int e;

    @Override // com.huawei.hihealthservice.HiDataOperation
    public boolean isMonitorThread() {
        return true;
    }

    kub(Context context) {
        super(context);
        this.f39491c = new ArrayList<>(10);
        this.f39489a = new ArrayList(10);
    }

    public boolean a(List<HiSampleConfig> list, IDataOperateListener iDataOperateListener, boolean z) throws RemoteException {
        if (iDataOperateListener == null) {
            return false;
        }
        ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "sampleConfig initialize start");
        if (HiCommonUtil.b(list)) {
            ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "initialize sampleConfigs is null ");
            this.f39491c.add(HiErrorCode.c(7));
            ktu.d(iDataOperateListener, 7, this.f39491c);
            return false;
        }
        this.d = list;
        this.f39490b = iDataOperateListener;
        int iE = kud.a().e();
        this.e = iE;
        if (iE <= 0) {
            ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "setSampleConfig userID <= 0");
            this.f39491c.add(HiErrorCode.c(15));
            ktu.d(this.f39490b, 12, this.f39491c);
            return false;
        }
        if (z && ktx.c().e() == -1) {
            ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "initialize appType is invalid errorCode is ", 17);
            this.f39491c.add(HiErrorCode.c(17));
            ktu.d(this.f39490b, 17, this.f39491c);
            return false;
        }
        try {
            this.f39489a = lko.e(this.d);
            return true;
        } catch (lks e) {
            ReleaseLogUtil.a("HiH_HiSampCfgSetOp", "validSampleConfigs exception = ", e.getMessage());
            this.f39491c.add(e.getMessage());
            ktu.d(this.f39490b, 3, this.f39491c);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) throws Throwable {
        char c2;
        ?? r7;
        ?? r5 = 4;
        int i = 4;
        try {
            try {
                try {
                    ArrayList arrayList = new ArrayList(10);
                    String strE = ljp.e(this.mContext);
                    int iC = kud.a().c();
                    ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "sampleConfig execute start");
                    int i2 = 0;
                    for (HiSampleConfig hiSampleConfig : this.d) {
                        if (hiSampleConfig == null) {
                            ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "sampleConfig is null");
                        } else {
                            kym kymVarB = b(strE, iC, hiSampleConfig);
                            if (kymVarB == null) {
                                ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "healthContext is null");
                            } else {
                                HiSampleConfig hiSampleConfigC = hiSampleConfig.toBuilder().d(kymVarB.c()).b(0).c();
                                SampleConfigManager.InsertOrUpdateResult insertOrUpdateResultD = SampleConfigManager.e().d(this.e, hiSampleConfigC);
                                ReleaseLogUtil.d("HiH_HiSampCfgSetOp", "setSampleConfig result = ", insertOrUpdateResultD, ", configId is ", hiSampleConfigC.getConfigId());
                                if (insertOrUpdateResultD == SampleConfigManager.InsertOrUpdateResult.SUCCESS_NO_CHANGE) {
                                    i2++;
                                } else if (insertOrUpdateResultD == SampleConfigManager.InsertOrUpdateResult.SUCCESS_UPDATED) {
                                    i2++;
                                    liz.a().a(103, hiSampleConfigC.getConfigId(), kymVarB);
                                    kymVarB.c(1);
                                    kwt.b().c(kymVarB);
                                } else {
                                    arrayList.add(hiSampleConfigC.getConfigId());
                                }
                            }
                        }
                    }
                    if (!HiCommonUtil.b(this.f39489a)) {
                        c2 = 27;
                        r7 = 27;
                        try {
                            this.f39491c.add(HiJsonUtil.d(this.f39489a));
                            i = 27;
                        } catch (Exception e) {
                            e = e;
                            ReleaseLogUtil.a("HiH_HiSampCfgSetOp", "execute exception = ", LogAnonymous.b(e));
                            this.f39491c.add(HiErrorCode.c(4));
                            r7 = c2;
                        }
                        ktu.d(this.f39490b, i, this.f39491c);
                        ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "sampleConfig execute end");
                    }
                    if (i2 != this.d.size()) {
                        try {
                            ArrayList<Object> arrayList2 = this.f39491c;
                            arrayList2.add(HiJsonUtil.d(arrayList));
                            r7 = arrayList2;
                        } catch (Exception e2) {
                            e = e2;
                            c2 = 4;
                            ReleaseLogUtil.a("HiH_HiSampCfgSetOp", "execute exception = ", LogAnonymous.b(e));
                            this.f39491c.add(HiErrorCode.c(4));
                            r7 = c2;
                        }
                    } else {
                        this.f39491c.add(true);
                        i = 0;
                    }
                    ktu.d(this.f39490b, i, this.f39491c);
                    ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "sampleConfig execute end");
                } catch (Throwable th) {
                    th = th;
                    ktu.d(this.f39490b, (int) r5, this.f39491c);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                c2 = 0;
            } catch (Throwable th2) {
                th = th2;
                r5 = 0;
                ktu.d(this.f39490b, (int) r5, this.f39491c);
                throw th;
            }
            ReleaseLogUtil.a("HiH_HiSampCfgSetOp", "execute exception = ", LogAnonymous.b(e));
            this.f39491c.add(HiErrorCode.c(4));
            r7 = c2;
            ktu.d(this.f39490b, i, this.f39491c);
            ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "sampleConfig execute end");
        } catch (Throwable th3) {
            th = th3;
            r5 = r7;
        }
    }

    private kym b(String str, int i, HiSampleConfig hiSampleConfig) throws RemoteException {
        String packageName = hiSampleConfig.getPackageName();
        if (packageName != null && packageName.matches("[a-zA-Z0-9._]+")) {
            str = packageName;
        }
        kym kymVarE = kyn.d(this.mContext).e(ktx.c().e(str), i, 0, hiSampleConfig.getDeviceUniqueId());
        if (kymVarE != null) {
            return kymVarE;
        }
        ReleaseLogUtil.e("HiH_HiSampCfgSetOp", "getHiHealthContext healthContext is null");
        return null;
    }
}
