package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealthservice.store.stat.HiHeartRateAndRestHeartRateStat;
import com.huawei.hihealthservice.store.stat.HiTrackStat;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lgj {
    private static Context d;
    private kws e;

    private lgj() {
        this.e = kws.e(d);
    }

    static class c {
        private static final lgj e = new lgj();
    }

    public static lgj b(Context context) {
        if (context != null) {
            d = context.getApplicationContext();
        }
        return c.e;
    }

    public void d() {
        int iE = kud.a().e();
        if (iE <= 0) {
            ReleaseLogUtil.e("HiH_StatDBOldData", "statDBOldData() userID <= 0");
            return;
        }
        List<Integer> listC = kyj.c().c(iE);
        if (listC == null || listC.isEmpty()) {
            ReleaseLogUtil.e("HiH_StatDBOldData", "statDBOldData() clients is empty");
            return;
        }
        a(iE, listC);
        if (lkb.e(d, iE)) {
            try {
                List<HiHealthData> listD = this.e.d(listC, 0L, System.currentTimeMillis(), 30001);
                int i = 0;
                if (listD != null && !listD.isEmpty()) {
                    ReleaseLogUtil.e("HiH_StatDBOldData", "statDBOldData sequenceMetaDatas size is = ", Integer.valueOf(listD.size()));
                    for (HiHealthData hiHealthData : listD) {
                        hiHealthData.setUserId(iE);
                        int iD = HiDateUtil.d(hiHealthData.getStartTime());
                        if (i != iD) {
                            if (!new HiTrackStat(d).e(hiHealthData)) {
                                lkb.p(d, iE);
                                return;
                            }
                            i = iD;
                        }
                    }
                    lkb.p(d, iE);
                    return;
                }
                ReleaseLogUtil.e("HiH_StatDBOldData", "statDBOldData sequenceMetaDatas is null");
                lkb.p(d, iE);
            } catch (Exception unused) {
                ReleaseLogUtil.e("HiH_StatDBOldData", "statDBOldData Exception");
                lkb.p(d, iE);
            }
        }
    }

    private void a(int i, List<Integer> list) {
        for (int iD = lkb.d(d, i); iD < 4; iD++) {
            if (iD == 1) {
                b(i, list, 2);
            } else if (iD == 2) {
                c(i, list, 3);
            } else if (iD == 3) {
                c(i, 4);
            }
        }
    }

    private void b(int i, List<Integer> list, int i2) {
        ReleaseLogUtil.d("HiH_StatDBOldData", "statDBOldData upgradeOne start...");
        new HiHeartRateAndRestHeartRateStat(d).d(i, list, 0L, System.currentTimeMillis());
        lkb.c(d, i, i2);
        ReleaseLogUtil.d("HiH_StatDBOldData", "statDBOldData upgradeOne end!");
    }

    private void c(int i, List<Integer> list, int i2) {
        ReleaseLogUtil.d("HiH_StatDBOldData", "statDBOldData upgradeTwo start...");
        liv.d().b(d);
        List<HiHealthData> listD = this.e.d(list, 0L, System.currentTimeMillis(), 30001);
        if (!HiCommonUtil.b(listD)) {
            Iterator<HiHealthData> it = listD.iterator();
            while (it.hasNext()) {
                it.next().setUserId(i);
            }
            lfz.d(d).prepareRealTimeHealthDataStat(listD);
            lfz.d(d).doRealTimeHealthDataStat();
        }
        lkb.c(d, i, i2);
        ReleaseLogUtil.d("HiH_StatDBOldData", "statDBOldData upgradeTwo end!");
    }

    private void c(int i, int i2) {
        ReleaseLogUtil.d("HiH_StatDBOldData", "statDBOldData upgradeThree start...");
        liv.d().b(d);
        lkb.c(d, i, i2);
        ReleaseLogUtil.d("HiH_StatDBOldData", "statDBOldData upgradeThree end!");
    }
}
