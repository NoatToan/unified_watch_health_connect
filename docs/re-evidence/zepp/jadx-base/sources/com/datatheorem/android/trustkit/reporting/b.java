package com.datatheorem.android.trustkit.reporting;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class b {
    private static final long a = 86400;
    private static final Set<List<Object>> b = new HashSet();
    public static Date c = new Date();

    public static synchronized boolean a(@NonNull PinningFailureReport pinningFailureReport) {
        boolean zContains;
        Date date = new Date();
        if ((date.getTime() / 1000) - (c.getTime() / 1000) > 86400) {
            b.clear();
            c = date;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(pinningFailureReport.getNotedHostname());
        arrayList.add(pinningFailureReport.getServerHostname());
        arrayList.add(Integer.valueOf(pinningFailureReport.a()));
        arrayList.add(pinningFailureReport.b());
        arrayList.add(pinningFailureReport.getValidationResult());
        Set<List<Object>> set = b;
        zContains = set.contains(arrayList);
        if (!zContains) {
            set.add(arrayList);
        }
        return zContains;
    }
}
