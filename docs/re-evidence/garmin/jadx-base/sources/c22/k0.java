package c22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/k0;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f23112a = new k0();

    private k0() {
    }

    public static final ArrayList a(List list, List list2) {
        k0 k0Var;
        if (list == null || list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            k0Var = f23112a;
            if (!zHasNext) {
                break;
            }
            com.garmin.android.apps.connectmobile.devices.model.i iVar = (com.garmin.android.apps.connectmobile.devices.model.i) it.next();
            if (iVar != null) {
                k0Var.getClass();
                int iB = b(iVar, list);
                if (iB == -1) {
                    iVar.f34186f = "NEW";
                    arrayList.add(iVar);
                } else if (!iVar.equals(list.get(iB))) {
                    iVar.f34186f = "CHANGED";
                    arrayList.add(iVar);
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            com.garmin.android.apps.connectmobile.devices.model.i iVar2 = (com.garmin.android.apps.connectmobile.devices.model.i) it3.next();
            if (iVar2 != null) {
                k0Var.getClass();
                if (b(iVar2, list2) == -1) {
                    iVar2.f34186f = "DELETED";
                    arrayList.add(iVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static int b(com.garmin.android.apps.connectmobile.devices.model.i iVar, List list) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            com.garmin.android.apps.connectmobile.devices.model.i iVar2 = (com.garmin.android.apps.connectmobile.devices.model.i) list.get(i14);
            if (iVar2 != null && iVar2.f34185e == iVar.f34185e) {
                return i14;
            }
        }
        return -1;
    }

    public static final ArrayList c(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i14 = 0; i14 < length; i14++) {
            com.garmin.android.apps.connectmobile.devices.model.i iVar = new com.garmin.android.apps.connectmobile.devices.model.i();
            try {
                iVar.k(jSONArray.optJSONObject(i14));
                arrayList.add(iVar);
            } catch (JSONException e4) {
                String message = e4.getMessage();
                com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "DeviceAlarmUtils", message);
            }
        }
        return arrayList;
    }

    public static final JSONArray d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.devices.model.i iVar = (com.garmin.android.apps.connectmobile.devices.model.i) it.next();
            if (iVar != null) {
                jSONArray.put(iVar.D());
            }
        }
        return jSONArray;
    }
}
