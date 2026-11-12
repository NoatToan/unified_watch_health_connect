package com.huawei.openalliance.ad;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f20254a = {1, 3, 2, 4};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f20255b = {0, 3, 2, 4};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f20256c = {3, 2, 4};

    private static List<sf> b(Context context, ContentRecord contentRecord, StackTraceElement[] stackTraceElementArr, View view, int[] iArr) {
        sf sdVar;
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            if (i == 0) {
                sdVar = new sd(context, contentRecord, stackTraceElementArr, view);
            } else if (i == 1) {
                sdVar = new sj(context, contentRecord, stackTraceElementArr, view);
            } else if (i == 2) {
                sdVar = new sc(context, contentRecord, view);
            } else if (i == 3) {
                sdVar = new si(context, contentRecord, view);
            } else if (i != 4) {
                hw.c("SafeDetectorFactory", "create safe detector, fall to default");
                sdVar = null;
            } else {
                sdVar = new sh(context, contentRecord, view);
            }
            if (sdVar != null) {
                arrayList.add(sdVar);
            }
        }
        return arrayList;
    }

    public static sf a(Context context, ContentRecord contentRecord, StackTraceElement[] stackTraceElementArr, View view, int[] iArr) {
        if (context == null || contentRecord == null) {
            return new se();
        }
        List<sf> listB = b(context, contentRecord, stackTraceElementArr, view, iArr);
        if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
            return new se();
        }
        sf sfVar = null;
        for (sf sfVar2 : listB) {
            if (sfVar != null) {
                sfVar.a(sfVar2);
            }
            sfVar = sfVar2;
        }
        return listB.get(0);
    }
}
