package com.huawei.pluginachievement.ui.report;

import android.content.res.Configuration;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import defpackage.njy;
import defpackage.oxi;
import defpackage.ozq;
import defpackage.pal;
import defpackage.paw;
import defpackage.qnh;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveHistoricalMonthReportActivity extends BaseHistoricalReportActivity {
    private int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == i4) {
            return i3;
        }
        if (i5 <= i || i5 >= i4) {
            return 13 - i2;
        }
        return 12;
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseHistoricalReportActivity
    protected ArrayList<ozq> calculateHistoricalReportDataList(long j, int i, int i2) {
        LogUtil.a("PLGACHIEVE_AchieveHistoricalMonthReportActivity", "calculateHistoricalReportDataList() startTimestamp = ", Long.valueOf(j), ",reportMaxNumber = ", Integer.valueOf(i), ", reportMinNumber = ", Integer.valueOf(i2));
        int iA = oxi.a(oxi.b(j));
        int iA2 = pal.a(j);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA3 = pal.a(jCurrentTimeMillis);
        int iA4 = oxi.a(oxi.b(jCurrentTimeMillis));
        if (iA > iA4) {
            LogUtil.j("PLGACHIEVE_AchieveHistoricalMonthReportActivity", "calculateTimeMap startYearInt < currentYearInt. return;");
            return null;
        }
        long jC = pal.c(0, jCurrentTimeMillis, 1);
        long jC2 = pal.c(0, jCurrentTimeMillis, 2);
        ArrayList<ozq> arrayList = new ArrayList<>(10);
        int i3 = (iA4 - iA) + 1;
        long j2 = j;
        int i4 = 0;
        int size = i2;
        while (i4 < i3) {
            String strB = oxi.b(j2);
            ozq ozqVar = new ozq();
            ozqVar.b(strB);
            ozqVar.a(j2);
            int i5 = iA;
            int iE = e(iA, iA2, iA3, iA4, oxi.a(strB));
            int i6 = i4;
            long jM = j2;
            ArrayList<ozq> arrayList2 = arrayList;
            int i7 = i3;
            ArrayList<ozq.a> arrayListC = c(jC, jC2, jM, iE, size);
            if (njy.b(arrayListC)) {
                Collections.sort(arrayListC);
                ozqVar.c(arrayListC);
                jM = qnh.m(jM);
                arrayList2.add(ozqVar);
                size += arrayListC.size();
            }
            j2 = jM;
            i4 = i6 + 1;
            iA = i5;
            arrayList = arrayList2;
            i3 = i7;
        }
        return arrayList;
    }

    private ArrayList<ozq.a> c(long j, long j2, long j3, int i, int i2) {
        ArrayList<ozq.a> arrayList = new ArrayList<>(10);
        for (int i3 = 0; i3 < i; i3++) {
            if (j3 < j || j3 > j2) {
                long jC = pal.c(0, j3, 2);
                ozq.a aVar = new ozq.a();
                aVar.d(j3);
                aVar.a(jC);
                aVar.d(d(j3));
                aVar.a(i2 + i3);
                arrayList.add(aVar);
                j3 = pal.c(1, j3, 1);
            }
        }
        return arrayList;
    }

    private String d(long j) {
        return paw.d(j, 0);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseHistoricalReportActivity
    protected int getLayoutId() {
        return R.layout.activity_achieve_historical_month_report;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
