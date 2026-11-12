package com.garmin.android.apps.connectmobile.connectiq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class j {
    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o10.b bVar = (o10.b) it.next();
            if (!bVar.f().startsWith("c0ffee15-600d")) {
                arrayList.add(new q10.c(bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String(), bVar.getInternalVersion()));
            }
        }
        return arrayList;
    }
}
