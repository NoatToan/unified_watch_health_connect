package com.garmin.android.apps.connectmobile.performance.dto;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/dto/e;", "Landroid/os/Parcelable;", "", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/a;", "categories", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("categories")
    private final Map<String, com.garmin.android.apps.connectmobile.performance.dto.a> categories;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readString(), com.garmin.android.apps.connectmobile.performance.dto.a.CREATOR.createFromParcel(parcel));
            }
            return new e(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(Map<String, com.garmin.android.apps.connectmobile.performance.dto.a> map) {
        map.getClass();
        this.categories = map;
    }

    public final Map<String, com.garmin.android.apps.connectmobile.performance.dto.a> b() {
        return this.categories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && s.g(this.categories, ((e) obj).categories);
    }

    public final int hashCode() {
        return this.categories.hashCode();
    }

    public final String toString() {
        return "ExercisesDto(categories=" + this.categories + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itU = j.u(this.categories, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString((String) entry.getKey());
            ((com.garmin.android.apps.connectmobile.performance.dto.a) entry.getValue()).writeToParcel(parcel, i14);
        }
    }
}
