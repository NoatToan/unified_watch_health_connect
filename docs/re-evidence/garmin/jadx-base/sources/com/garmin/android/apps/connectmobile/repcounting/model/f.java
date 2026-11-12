package com.garmin.android.apps.connectmobile.repcounting.model;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/f;", "Landroid/os/Parcelable;", "", "", "categoryTranslations", "exerciseTranslations", "muscleTranslations", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f41126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f41127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f41128c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            int i16 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            int i18 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i18);
            for (int i19 = 0; i19 != i18; i19++) {
                linkedHashMap3.put(parcel.readString(), parcel.readString());
            }
            return new f(linkedHashMap, linkedHashMap2, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.f41126a = map;
        this.f41127b = map2;
        this.f41128c = map3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f41126a.equals(fVar.f41126a) && this.f41127b.equals(fVar.f41127b) && this.f41128c.equals(fVar.f41128c);
    }

    public final int hashCode() {
        return this.f41128c.hashCode() + j.b(this.f41127b, this.f41126a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ExerciseTranslations(categoryTranslations=");
        sb3.append(this.f41126a);
        sb3.append(", exerciseTranslations=");
        sb3.append(this.f41127b);
        sb3.append(", muscleTranslations=");
        return j.s(sb3, this.f41128c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itU = j.u(this.f41126a, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Iterator itU2 = j.u(this.f41127b, parcel);
        while (itU2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itU2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
        Iterator itU3 = j.u(this.f41128c, parcel);
        while (itU3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) itU3.next();
            parcel.writeString((String) entry3.getKey());
            parcel.writeString((String) entry3.getValue());
        }
    }
}
