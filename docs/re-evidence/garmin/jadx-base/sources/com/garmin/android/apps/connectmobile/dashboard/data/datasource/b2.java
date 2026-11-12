package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/b2;", "Landroid/os/Parcelable;", "", Action.KEY_ATTRIBUTE, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b2 implements Parcelable {
    public static final Parcelable.Creator<b2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Boolean value;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b2> {
        @Override // android.os.Parcelable.Creator
        public final b2 createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new b2(string, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final b2[] newArray(int i14) {
            return new b2[i14];
        }
    }

    public b2(String str, Boolean bool) {
        str.getClass();
        this.key = str;
        this.value = bool;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return p005kotlin.jvm.internal.s.g(this.key, b2Var.key) && p005kotlin.jvm.internal.s.g(this.value, b2Var.value);
    }

    public final int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Boolean bool = this.value;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "PreferenceDTO(key=" + this.key + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.key);
        Boolean bool = this.value;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }
}
