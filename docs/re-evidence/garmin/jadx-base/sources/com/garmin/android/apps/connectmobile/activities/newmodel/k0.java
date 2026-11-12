package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/k0;", "Landroid/os/Parcelable;", "", Action.KEY_ATTRIBUTE, "", ModelSourceWrapper.POSITION, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ModelSourceWrapper.POSITION)
    private final Integer position;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k0> {
        @Override // android.os.Parcelable.Creator
        public final k0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k0(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final k0[] newArray(int i14) {
            return new k0[i14];
        }
    }

    public /* synthetic */ k0(String str, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return p005kotlin.jvm.internal.s.g(this.key, k0Var.key) && p005kotlin.jvm.internal.s.g(this.position, k0Var.position);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.position;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TankSensorsMetaData(key=" + this.key + ", position=" + this.position + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.key);
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public k0(String str, Integer num) {
        this.key = str;
        this.position = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
