package com.garmin.android.apps.connectmobile.userprofile.model;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/ProfileInfoJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileInfoJsonAdapter implements JsonDeserializer<Map<Integer, ? extends l>> {
    public static LinkedHashMap a(JsonElement jsonElement) {
        JsonObject asJsonObject;
        Set<Map.Entry<String, JsonElement>> setEntrySet;
        l lVar;
        if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null || (setEntrySet = asJsonObject.entrySet()) == null) {
            return null;
        }
        Set<Map.Entry<String, JsonElement>> set = setEntrySet;
        int iA = t0.a(y.r(set, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            key.getClass();
            int i14 = Integer.parseInt((String) key);
            try {
                lVar = (l) GsonUtil.f47253b.fromJson(((JsonElement) entry.getValue()).toString(), l.class);
            } catch (Exception e4) {
                String strH = f3.h(e4, "Exception caught: exception=[", "]");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "ProfileInfoJsonAdapter", strH);
                lVar = null;
            }
            o13.p pVar = new o13.p(Integer.valueOf(i14), lVar);
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        return linkedHashMap;
    }

    @Override // com.google.gson.JsonDeserializer
    public final /* bridge */ /* synthetic */ Map<Integer, ? extends l> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return a(jsonElement);
    }
}
