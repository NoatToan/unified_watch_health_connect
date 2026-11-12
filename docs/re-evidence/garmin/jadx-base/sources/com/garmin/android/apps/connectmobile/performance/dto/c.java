package com.garmin.android.apps.connectmobile.performance.dto;

import android.os.Parcel;
import android.os.Parcelable;
import g22.n;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/dto/c;", "Landroid/os/Parcelable;", "", "exerciseCategory", "exerciseSubCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39884b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, String str2) {
        str.getClass();
        this.f39883a = str;
        this.f39884b = str2;
    }

    public final String b() {
        String str = this.f39884b;
        if (!n.d(str)) {
            str = null;
        }
        return str == null ? this.f39883a : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f39883a.equals(cVar.f39883a) && b().equals(cVar.b());
    }

    public final int hashCode() {
        return Objects.hash(this.f39883a, b());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f39883a);
        parcel.writeString(this.f39884b);
    }
}
