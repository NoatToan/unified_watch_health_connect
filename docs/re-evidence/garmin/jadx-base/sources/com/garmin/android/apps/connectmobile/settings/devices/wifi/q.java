package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.content.Context;
import com.garmin.proto.generated.WifiSetup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/q;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f43400a = new q();

    private q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [w13.c] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public static final ArrayList a(Context context, List list, String str) {
        ?? arrayList;
        context.getClass();
        q qVar = f43400a;
        if (list == null || list.isEmpty()) {
            if (u0.n(str, u0.S5)) {
                w13.c cVar = k.c.f43339j;
                arrayList = new ArrayList();
                for (Object obj : cVar) {
                    if (((k.c) obj) != k.c.WEP) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = k.c.f43339j;
            }
            qVar.getClass();
            return b(context, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WifiSetup.SecurityType securityType = (WifiSetup.SecurityType) it.next();
            k.f43319i.getClass();
            linkedHashSet.add(k.b.a(securityType));
        }
        w13.c cVar2 = k.c.f43339j;
        ArrayList arrayListK = n23.j.k(cVar2);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            Object next = bVar.next();
            if (linkedHashSet.contains((k.c) next)) {
                arrayListK.add(next);
            }
        }
        qVar.getClass();
        return b(context, arrayListK);
    }

    public static ArrayList b(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k.c cVar = (k.c) it.next();
            String string = context.getString(cVar.f43340a);
            string.getClass();
            arrayList.add(new p(string, cVar));
        }
        return arrayList;
    }
}
