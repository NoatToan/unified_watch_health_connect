package defpackage;

import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41349a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mbs f41350c;

    private mbs() {
    }

    public static mbs b() {
        mbs mbsVar;
        synchronized (f41349a) {
            if (f41350c == null) {
                f41350c = new mbs();
            }
            mbsVar = f41350c;
        }
        return mbsVar;
    }

    public void c(int i) {
        ReleaseLogUtil.d("DEVMGR_RriHeartRateSendCommandUtil", "pushPressAutoMonitor openOrClose:", Integer.valueOf(i));
        if (i != 1 && i != 2) {
            LogUtil.j("RriHeartRateSendCommandUtil", "openOrClose is ", Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(0);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(i));
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            ReleaseLogUtil.d("DEVMGR_RriHeartRateSendCommandUtil", "pushPressAutoMonitor healthDataMgrApi is null.");
            xjt.an("pushPressAutoMonitor healthDataMgrApi is null.");
        } else {
            a(sb, healthDataMgrApi);
        }
    }

    private void a(final StringBuilder sb, HealthDataMgrApi healthDataMgrApi) {
        healthDataMgrApi.getUserPressureAdjustDatas(new IBaseResponseCallback() { // from class: mbs.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_RriHeartRateSendCommandUtil", "getUserAdjustData errorCode:", Integer.valueOf(i));
                if (i == 0 && obj != null) {
                    HiStressMetaData hiStressMetaDataA = mbs.a(obj instanceof String ? (String) obj : "");
                    if (hiStressMetaDataA != null) {
                        StringBuilder sbE = mbs.this.e(hiStressMetaDataA);
                        List<Float> listFetchStressFeature = hiStressMetaDataA.fetchStressFeature();
                        StringBuilder sb2 = new StringBuilder(0);
                        sb2.append(eeq.d(3));
                        sb2.append(eeq.d(48));
                        if (listFetchStressFeature != null && listFetchStressFeature.size() == 12) {
                            for (int i2 = 0; i2 < listFetchStressFeature.size(); i2++) {
                                sb2.append(eeq.e(listFetchStressFeature.get(i2).floatValue()));
                            }
                            StringBuilder sbC = mbs.this.c(hiStressMetaDataA);
                            StringBuilder sb3 = new StringBuilder(0);
                            sb3.append(sb.toString());
                            sb3.append(sbE.toString());
                            sb3.append(sb2.toString());
                            sb3.append(sbC.toString());
                            LogUtil.a("RriHeartRateSendCommandUtil", "5.32.9 send cmd1 : ", sb3.toString());
                            mhs.a().sendSetSwitchSettingCmd(eeq.c(sb3.toString()), "", 32, 9);
                            return;
                        }
                    } else {
                        ReleaseLogUtil.e("DEVMGR_RriHeartRateSendCommandUtil", "getUserAdjustData data is null");
                        return;
                    }
                } else {
                    ReleaseLogUtil.e("DEVMGR_RriHeartRateSendCommandUtil", "getUserAdjustData error or objectData is null");
                }
                mbs.this.e(sb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(StringBuilder sb) {
        LogUtil.a("RriHeartRateSendCommandUtil", "5.32.9 send cmd2 : ", sb.toString());
        mhs.a().sendSetSwitchSettingCmd(eeq.c(sb.toString()), "", 32, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StringBuilder e(HiStressMetaData hiStressMetaData) {
        int iFetchStressScore = hiStressMetaData.fetchStressScore();
        StringBuilder sb = new StringBuilder(0);
        sb.append(eeq.d(2));
        sb.append(eeq.d(1));
        sb.append(eeq.d(iFetchStressScore));
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StringBuilder c(HiStressMetaData hiStressMetaData) {
        StringBuilder sb = new StringBuilder(0);
        sb.append(eeq.d(4));
        sb.append(eeq.d(4));
        sb.append(eeq.c(hiStressMetaData.fetchStressStartTime() / 1000));
        return sb;
    }

    public void b(HiStressMetaData hiStressMetaData) {
        if (hiStressMetaData == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(0);
        int iFetchStressScore = hiStressMetaData.fetchStressScore();
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(iFetchStressScore));
        long jFetchStressStartTime = hiStressMetaData.fetchStressStartTime();
        sb.append(eeq.d(2));
        sb.append(eeq.d(4));
        sb.append(eeq.c(jFetchStressStartTime / 1000));
        long jFetchStressEndTime = hiStressMetaData.fetchStressEndTime();
        sb.append(eeq.d(3));
        sb.append(eeq.d(4));
        sb.append(eeq.c(jFetchStressEndTime / 1000));
        int iFetchStressGrade = hiStressMetaData.fetchStressGrade();
        sb.append(eeq.d(4));
        sb.append(eeq.d(1));
        sb.append(eeq.d(iFetchStressGrade));
        List<Float> listFetchStressFeature = hiStressMetaData.fetchStressFeature();
        if (listFetchStressFeature != null && listFetchStressFeature.size() == 12) {
            sb.append(eeq.d(5));
            sb.append(eeq.d(48));
            for (int i = 0; i < listFetchStressFeature.size(); i++) {
                sb.append(eeq.e(listFetchStressFeature.get(i).floatValue()));
            }
        }
        LogUtil.a("RriHeartRateSendCommandUtil", "5.32.10 send cmd: ", sb.toString());
        mhs.a().sendSetSwitchSettingCmd(eeq.c(sb.toString()), "", 32, 10);
    }

    public static HiStressMetaData a(String str) {
        return ftp.e(str);
    }
}
