package com.huawei.pluginachievement.ui.report;

import android.content.res.Configuration;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import defpackage.njy;
import defpackage.oxi;
import defpackage.ozq;
import defpackage.pal;
import defpackage.pap;
import defpackage.paw;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveHistoricalWeekReportActivity extends BaseHistoricalReportActivity {
    private int c(int i, int i2, int i3, int i4) {
        if (i3 < i) {
            return 0;
        }
        return i3 == i ? (i4 - i2) + 1 : (((i3 - i) - 1) * 12) + (13 - i2) + i4;
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseHistoricalReportActivity
    protected ArrayList<ozq> calculateHistoricalReportDataList(long j, int i, int i2) {
        long j2;
        LogUtil.a("PLGACHIEVE_AchieveHistoricalWeekReportActivity", "calculateHistoricalReportDataList() startTime = ", Long.valueOf(j), ",reportMaxNumber = ", Integer.valueOf(i), ", reportMinNumber = ", Integer.valueOf(i2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iC = c(oxi.a(oxi.b(j)), pal.a(j), oxi.a(oxi.b(jCurrentTimeMillis)), pal.a(jCurrentTimeMillis));
        ArrayList<ozq> arrayList = new ArrayList<>(10);
        long j3 = j;
        for (int i3 = 0; i3 < iC; i3++) {
            ozq ozqVar = new ozq();
            ozqVar.b(a(j3));
            ozqVar.a(j3);
            long jC = pal.c(1, j3, 1);
            long j4 = jC - j3;
            if (j4 % 604800000 == 0) {
                j2 = j4 / 604800000;
            } else {
                j2 = (j4 / 604800000) + 1;
            }
            ArrayList<ozq.a> arrayListB = b(pal.a(j3), (int) j2, pal.d(1, 0, j3, Utils.o()), j);
            if (njy.b(arrayListB)) {
                Collections.sort(arrayListB);
                ozqVar.c(arrayListB);
                arrayList.add(ozqVar);
                arrayListB.size();
                j3 = jC;
            }
        }
        return arrayList;
    }

    private ArrayList<ozq.a> b(int i, int i2, long j, long j2) {
        if (j < j2) {
            j = j2;
        }
        ArrayList<ozq.a> arrayList = new ArrayList<>(10);
        for (int i3 = 0; i3 < i2; i3++) {
            if (d(j)) {
                LogUtil.j("PLGACHIEVE_AchieveHistoricalWeekReportActivity", "isInArrayRange");
            } else {
                long jD = pal.d(2, 0, j, Utils.o());
                if (pal.a(j) != i) {
                    j = pal.d(1, -1, j, Utils.o());
                } else {
                    ozq.a aVar = new ozq.a();
                    aVar.d(j);
                    aVar.a(jD);
                    aVar.d(c(j));
                    arrayList.add(aVar);
                    j = pal.d(1, -1, j, Utils.o());
                    if (pap.c(j, System.currentTimeMillis()) && System.currentTimeMillis() >= c(j, jD) && i3 == i2 - 1 && pal.a(j) == i) {
                        ozq.a aVar2 = new ozq.a();
                        aVar2.d(j);
                        aVar2.a(c(j, jD));
                        aVar2.d(c(j));
                        arrayList.add(aVar2);
                    }
                }
            }
        }
        return arrayList;
    }

    private long c(long j, long j2) {
        return j > j2 ? pal.d(2, 0, j, Utils.o()) : j2;
    }

    private String a(long j) {
        return paw.d(j, 0);
    }

    private boolean d(long j) {
        return j >= pal.d(1, 0, System.currentTimeMillis(), Utils.o()) && j <= pal.d(2, 0, System.currentTimeMillis(), Utils.o());
    }

    private String c(long j) {
        String str;
        if (!LanguageUtil.bs(BaseApplication.b())) {
            str = " - ";
        } else {
            str = " ~ ";
        }
        return paw.d(pal.d(1, 0, j, Utils.o()), 1) + str + paw.d(pal.d(2, 0, j, Utils.o()), 1);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseHistoricalReportActivity
    protected int getLayoutId() {
        return R.layout.activity_achieve_historical_week_report;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
