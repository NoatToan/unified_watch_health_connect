package com.huawei.ads.adsrec;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.aym;
import defpackage.ayt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final SparseArray<String> f4774c = new SparseArray<>();
    private Context d;
    private aym e;

    public ayt c(String str, String str2) {
        String strValueOf;
        int iG = this.e.g(str2);
        HiAdLog.i("REC_STR_SEL", "pkg: %s slotId: %s, selected strategy: %d", str, str2, Integer.valueOf(iG));
        String str3 = f4774c.get(iG);
        String[] strArr = null;
        if (str3 == null) {
            HiAdLog.w("REC_STR_SEL", "strategy %d not found", Integer.valueOf(iG));
            return null;
        }
        ayt aytVar = new ayt();
        aytVar.b(str3);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strValueOf2 = String.valueOf(jCurrentTimeMillis);
        int iC = this.e.c(str2);
        long j = jCurrentTimeMillis - (((long) this.e.j(str2)) * 60000);
        switch (iG) {
            case 0:
            case 2:
                strValueOf = String.valueOf(0);
                strArr = new String[]{str, str2, strValueOf2, strValueOf2, strValueOf, String.valueOf(iC), String.valueOf(j)};
                break;
            case 1:
            case 3:
                strValueOf = String.valueOf(1);
                strArr = new String[]{str, str2, strValueOf2, strValueOf2, strValueOf, String.valueOf(iC), String.valueOf(j)};
                break;
            case 4:
            case 5:
            case 6:
                strArr = new String[]{str, str2, strValueOf2, strValueOf2, String.valueOf(iC), String.valueOf(j)};
                break;
        }
        Arrays.toString(strArr);
        aytVar.b(strArr);
        return aytVar;
    }

    public u0(Context context) {
        SparseArray<String> sparseArray = f4774c;
        String str = d1.d;
        sparseArray.put(0, str);
        sparseArray.put(1, str);
        String str2 = d1.e;
        sparseArray.put(2, str2);
        sparseArray.put(3, str2);
        sparseArray.put(4, d1.f);
        sparseArray.put(5, d1.g);
        sparseArray.put(6, d1.h);
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.e = aym.b(applicationContext);
    }
}
