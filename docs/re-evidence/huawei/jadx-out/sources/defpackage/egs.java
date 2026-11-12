package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class egs {
    public ehg e(ehg ehgVar) {
        if (a(ehgVar)) {
            return null;
        }
        d(ehgVar);
        return ehgVar;
    }

    private boolean a(ehg ehgVar) {
        if (ehgVar == null) {
            return true;
        }
        long jG = ((long) ehgVar.g()) * 1000;
        if (jG < 1590940800000L) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "need delete, dataStartTime < TIME_STAMP_MILLISECOND_MIN:", Long.valueOf(jG));
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jG > jCurrentTimeMillis) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "need delete, dataStartTime > currentTime:", Long.valueOf(jG));
            return true;
        }
        int iE = ehgVar.e();
        long jG2 = ((long) (ehgVar.g() + iE)) * 1000;
        if (jG2 > jCurrentTimeMillis + 3600000) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "need delete, dataEndTime > currentTime + ONE_HOUR_MILLISECOND:", Long.valueOf(jG2));
            return true;
        }
        if (iE > 64800) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "need delete, ElapsedTime() > ELAPSED_TIME_MAX:", Integer.valueOf(iE));
            return true;
        }
        if (ehgVar.j() < 10) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "need delete, TotalSkip() < TOTAL_SKIP_MIN:", Integer.valueOf(ehgVar.j()));
            return true;
        }
        if (iE <= 0) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "need delete, elapsedTime exception");
            return true;
        }
        if ((ehgVar.j() / iE) * 60 > 480) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "need delete,", Integer.valueOf(ehgVar.j() / iE));
            return true;
        }
        if (ehgVar.c() <= ehgVar.j() || ehgVar.c() == 65535) {
            return false;
        }
        LogUtil.a("PDROPE_HistoryDataCleaner", "need delete, MaxContinueSkip():", Integer.valueOf(ehgVar.c()), " > TotalSkip:", Integer.valueOf(ehgVar.j()));
        return true;
    }

    private void d(ehg ehgVar) {
        if (ehgVar.c() < 0 && ehgVar.c() != 65535) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "correctData, MaxContinueSkip:", Integer.valueOf(ehgVar.c()));
            ehgVar.e(65535);
        }
        if (ehgVar.e() < 0) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "correctData, ElapsedTime:", Integer.valueOf(ehgVar.e()));
            ehgVar.c(0);
        }
        if (ehgVar.i() < 0) {
            LogUtil.a("PDROPE_HistoryDataCleaner", "correctData, TotalEnergy", Integer.valueOf(ehgVar.i()));
            ehgVar.f(0);
        }
        if (ehgVar.d() >= 0 || ehgVar.d() == 65535) {
            return;
        }
        LogUtil.a("PDROPE_HistoryDataCleaner", "correctData, InterruptTimes", Integer.valueOf(ehgVar.d()));
        ehgVar.d(65535);
    }
}
