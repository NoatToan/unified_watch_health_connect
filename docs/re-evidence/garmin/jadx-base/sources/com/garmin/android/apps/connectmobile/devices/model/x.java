package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p13.g0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/x;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "", "", "Lcom/garmin/android/apps/connectmobile/devices/model/a0;", "supportedWatchFacesItems", "<init>", "(Ljava/util/Map;)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends s1 implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, ? extends List<a0>> f34327a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    String string = parcel.readString();
                    int i16 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i16);
                    int iA = 0;
                    while (iA != i16) {
                        iA = kg.f.a(a0.CREATOR, parcel, arrayList, iA, 1);
                    }
                    linkedHashMap2.put(string, arrayList);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new x(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public /* synthetic */ x(Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : map);
    }

    public final JSONObject C() throws JSONException {
        LinkedHashMap linkedHashMap;
        Set<Map.Entry<String, ? extends List<a0>>> setEntrySet;
        Map<String, ? extends List<a0>> map = this.f34327a;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            linkedHashMap = null;
        } else {
            g0 g0Var = new g0(setEntrySet);
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : g0Var.f134939a) {
                Object key = entry.getKey();
                Iterable<a0> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
                for (a0 a0Var : iterable) {
                    a0Var.getClass();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(a0.f34088f, a0Var.f34093a);
                    jSONObject.put(a0.f34089g, a0Var.f34094b);
                    jSONObject.put(a0.f34090h, a0Var.f34095c);
                    jSONObject.put(a0.f34091i, a0Var.f34096d);
                    jSONObject.put(a0.f34092j, a0Var.f34097e);
                    arrayList.add(jSONObject);
                }
                o13.p pVar = new o13.p(key, arrayList);
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            itKeys.getClass();
            c53.j jVarB = c53.q.b(itKeys);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : (c53.a) jVarB) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    a0 a0Var = new a0(null, null, null, null, null, 31, null);
                    a0Var.k(jSONArray.getJSONObject(i14));
                    arrayList.add(a0Var);
                }
                o13.p pVar = new o13.p(str, arrayList);
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
            this.f34327a = linkedHashMap;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Map<String, ? extends List<a0>> map = this.f34327a;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, ? extends List<a0>> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            Iterator itE = kg.f.e(entry.getValue(), parcel);
            while (itE.hasNext()) {
                ((a0) itE.next()).writeToParcel(parcel, i14);
            }
        }
    }

    public x(Map<String, ? extends List<a0>> map) {
        this.f34327a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
