package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.data.constant.HiErrorCode;
import com.huawei.hihealthservice.HiDataOperation;
import com.huawei.hihealthservice.dbmanager.SampleConfigManager;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kua extends HiDataOperation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IDataOperateListener f39486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kym f39487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiSampleConfigProcessOption f39488c;
    private final ArrayList<Object> e;

    @Override // com.huawei.hihealthservice.HiDataOperation
    public boolean isMonitorThread() {
        return true;
    }

    kua(Context context) {
        super(context);
        this.e = new ArrayList<>(10);
    }

    public boolean e(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataOperateListener iDataOperateListener, boolean z) throws RemoteException {
        if (iDataOperateListener == null) {
            return false;
        }
        if (hiSampleConfigProcessOption == null) {
            ReleaseLogUtil.e("HiH_HiSampleConfigDeleteOperation", "sampleConfigDeleteOption is null!");
            this.e.add(HiErrorCode.c(7));
            ktu.d(iDataOperateListener, 7, this.e);
            return false;
        }
        this.f39488c = hiSampleConfigProcessOption;
        this.f39486a = iDataOperateListener;
        this.f39487b = ktx.c().a();
        int iE = kud.a().e();
        if (iE <= 0) {
            ReleaseLogUtil.e("HiH_HiSampleConfigDeleteOperation", "setSampleConfig userID <= 0 appID = ", Integer.valueOf(this.f39487b.b()));
            this.e.add(HiErrorCode.c(7));
            ktu.d(iDataOperateListener, 7, this.e);
            return false;
        }
        this.f39487b.g(iE);
        if (z && ktx.c().e() == -1) {
            ReleaseLogUtil.e("HiH_HiSampleConfigDeleteOperation", "initialize appType is invalid errorCode is ", 17);
            this.e.add(HiErrorCode.c(17));
            ktu.d(this.f39486a, 17, this.e);
            return false;
        }
        try {
            lko.c(this.f39488c);
            return true;
        } catch (lks e) {
            ReleaseLogUtil.a("HiH_HiSampleConfigDeleteOperation", "validSampleConfigDeleteOption exception = ", e.getMessage());
            this.e.add(e.getMessage());
            ktu.d(this.f39486a, 3, this.e);
            return false;
        }
    }

    @Override // com.huawei.hihealthservice.HiDataOperation
    public void execute(ktj ktjVar) throws Throwable {
        boolean zB;
        int i;
        Exception e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                ReleaseLogUtil.d("HiH_HiSampleConfigDeleteOperation", "HiSampleConfigDeleteOperation begin, option is ", this.f39488c);
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    int iB = this.f39487b.b();
                    if ((this.f39488c.getProcessType() == 1 || this.f39488c.getProcessType() == 3) && this.f39488c.getPackageName() != null) {
                        iB = ktx.c().b(this.f39488c.getPackageName());
                    }
                    List<Integer> listC = c(this.f39488c.getProcessType(), this.f39487b.i(), iB, this.f39488c.getDeviceUniqueId());
                    Iterator<HiSampleConfigKey> it = this.f39488c.getSampleConfigKeyList().iterator();
                    int iD = 0;
                    while (it.hasNext()) {
                        try {
                            List<HiSampleConfig> listB = SampleConfigManager.e().b(listC, it.next());
                            if (!HiCommonUtil.b(listB)) {
                                iD = d(listB, listC);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            ReleaseLogUtil.a("HiH_HiSampleConfigDeleteOperation", "execute exception = ", LogAnonymous.b(e));
                            if (zB) {
                                ljq.c(BaseApplication.b(), 0);
                            }
                            this.e.add(HiErrorCode.c(5));
                            ktu.d(this.f39486a, 5, this.e);
                        }
                    }
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    ReleaseLogUtil.d("HiH_HiSampleConfigDeleteOperation", "HiSampleConfigDeleteOperation end");
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    this.e.add(HiErrorCode.c(iD));
                    ktu.d(this.f39486a, iD, this.e);
                } catch (Exception e3) {
                    e = e3;
                } catch (Throwable th) {
                    th = th;
                    i = 0;
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    this.e.add(HiErrorCode.c(i));
                    ktu.d(this.f39486a, i, this.e);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
            zB = false;
        } catch (Throwable th3) {
            th = th3;
            zB = false;
            i = 0;
        }
        ReleaseLogUtil.d("HiH_HiSampleConfigDeleteOperation", "execute end time = ", Long.valueOf(jCurrentTimeMillis), ", totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private int d(List<HiSampleConfig> list, List<Integer> list2) {
        boolean zC;
        int i = 0;
        for (HiSampleConfig hiSampleConfig : list) {
            HiSampleConfigKey hiSampleConfigKeyD = new HiSampleConfigKey.Builder().e(hiSampleConfig.getType()).a(hiSampleConfig.getConfigId()).d(hiSampleConfig.getScopeApp()).c(hiSampleConfig.getScopeDeviceType()).d();
            int syncStatus = hiSampleConfig.getSyncStatus();
            if (syncStatus == 0) {
                zC = SampleConfigManager.e().c(list2, hiSampleConfigKeyD, syncStatus);
            } else {
                zC = SampleConfigManager.e().c(hiSampleConfig.getId(), hiSampleConfig.getModifiedTime(), 2);
            }
            if (!zC) {
                ReleaseLogUtil.e("HiH_HiSampleConfigDeleteOperation", "deleteHealthPointDatasByTypes() change <= 0");
                i = 9;
            }
        }
        return i;
    }

    private List<Integer> c(int i, int i2, int i3, String str) {
        ArrayList arrayList = new ArrayList(10);
        kyj kyjVarC = kyj.c();
        if (i == 0) {
            return kyjVarC.c(i2);
        }
        if (i != 1) {
            return i != 2 ? arrayList : kyjVarC.a(i2, str);
        }
        return kyjVarC.e(i3, i2);
    }
}
