package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new zao();

    @SafeParcelable.VersionField(id = 1)
    private final int a;
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> b;

    @Nullable
    @SafeParcelable.Field(getter = "getSerializedDictionary", id = 2)
    private final ArrayList<zam> c;

    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    private final String d;

    @SafeParcelable.Constructor
    public zaj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zam> arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.a = i;
        this.c = null;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zam zamVar = arrayList.get(i2);
            String str2 = zamVar.b;
            HashMap map2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.checkNotNull(zamVar.c)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zal zalVar = zamVar.c.get(i3);
                map2.put(zalVar.b, zalVar.c);
            }
            map.put(str2, map2);
        }
        this.b = map;
        this.d = (String) Preconditions.checkNotNull(str);
        zaa();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new zam(str, this.b.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final void zaa() {
        Iterator<String> it2 = this.b.keySet().iterator();
        while (it2.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.b.get(it2.next());
            Iterator<String> it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                map.get(it3.next()).zaa(this);
            }
        }
    }

    public final void zab() {
        for (String str : this.b.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.b.get(str);
            HashMap map2 = new HashMap();
            for (String str2 : map.keySet()) {
                map2.put(str2, map.get(str2).zaa());
            }
            this.b.put(str, map2);
        }
    }

    public final String zac() {
        return this.d;
    }

    public final void zaa(Class<? extends FastJsonResponse> cls, Map<String, FastJsonResponse.Field<?, ?>> map) {
        this.b.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    @Nullable
    public final Map<String, FastJsonResponse.Field<?, ?>> zaa(String str) {
        return this.b.get(str);
    }

    public final boolean zaa(Class<? extends FastJsonResponse> cls) {
        return this.b.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public zaj(Class<? extends FastJsonResponse> cls) {
        this.a = 1;
        this.c = null;
        this.b = new HashMap<>();
        this.d = (String) Preconditions.checkNotNull(cls.getCanonicalName());
    }
}
