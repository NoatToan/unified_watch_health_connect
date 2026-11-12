package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.dbmanager.SampleConfigManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ktz extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kym f39484a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IDataReadResultListener f39485c;
    private HiSampleConfigProcessOption d;

    ktz(Context context) {
        super(context);
    }

    public boolean c(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        if (iDataReadResultListener == null) {
            return false;
        }
        if (hiSampleConfigProcessOption == null) {
            ReleaseLogUtil.e("HiH_HiSampCfgGetOp", "sampleConfigGetOption is null!");
            ktu.b(iDataReadResultListener, null, 7, 2);
            return false;
        }
        this.d = hiSampleConfigProcessOption;
        this.f39485c = iDataReadResultListener;
        this.f39484a = ktx.c().a();
        int iE = kud.a().e();
        if (iE <= 0) {
            ReleaseLogUtil.e("HiH_HiSampCfgGetOp", "setSampleConfig userID <= 0 appID = ", Integer.valueOf(this.f39484a.b()));
            ktu.b(iDataReadResultListener, null, 15, 2);
            return false;
        }
        this.f39484a.g(iE);
        if (z && ktx.c().e() == -1) {
            ReleaseLogUtil.e("HiH_HiSampCfgGetOp", "initialize appType is invalid errorCode is ", 17);
            ktu.b(iDataReadResultListener, null, 17, 2);
            return false;
        }
        try {
            lko.e(this.d);
            return true;
        } catch (lks e) {
            ReleaseLogUtil.a("HiH_HiSampCfgGetOp", "validSampleConfigGetOption exception = ", e.getMessage());
            ktu.b(iDataReadResultListener, null, 3, 2);
            return false;
        }
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        try {
            try {
                int iB = this.f39484a.b();
                if ((this.d.getProcessType() == 1 || this.d.getProcessType() == 3) && this.d.getPackageName() != null) {
                    iB = ktx.c().b(this.d.getPackageName());
                }
                List<Integer> listA = a(this.d.getProcessType(), this.f39484a.i(), iB, this.d.getDeviceUniqueId());
                for (HiSampleConfigKey hiSampleConfigKey : this.d.getSampleConfigKeyList()) {
                    List<HiSampleConfig> listB = SampleConfigManager.e().b(listA, hiSampleConfigKey);
                    if (!HiCommonUtil.b(listB)) {
                        LogUtil.a("HiH_HiSampCfgGetOp", "getSampleConfig key:", hiSampleConfigKey, ", size:", Integer.valueOf(listB.size()));
                        arrayList.addAll(listB);
                    }
                }
            } catch (Exception e) {
                ReleaseLogUtil.a("HiH_HiSampCfgGetOp", "execute exception = ", LogAnonymous.b(e));
                i = 5;
            }
            ktu.b(this.f39485c, arrayList, i, 2);
            ReleaseLogUtil.d("HiH_HiSampCfgGetOp", "exec eTm=", Long.valueOf(jCurrentTimeMillis), ",ttlTm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            ktu.b(this.f39485c, arrayList, 0, 2);
            throw th;
        }
    }

    private List<Integer> a(int i, int i2, int i3, String str) {
        kym kymVarE;
        ArrayList arrayList = new ArrayList(10);
        if (i == 0) {
            return kyj.c().c(i2);
        }
        if (i == 1) {
            return kyj.c().e(i3, i2);
        }
        if (i == 2) {
            return kyj.c().a(i2, str);
        }
        if (i != 3 || (kymVarE = kyn.d(this.mContext).e(i3, i2, str)) == null) {
            return arrayList;
        }
        int iC = kymVarE.c();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(Integer.valueOf(iC));
        return arrayList2;
    }
}
