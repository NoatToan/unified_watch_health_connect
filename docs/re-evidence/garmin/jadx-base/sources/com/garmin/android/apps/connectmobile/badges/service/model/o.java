package com.garmin.android.apps.connectmobile.badges.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/o;", "Landroid/os/Parcelable;", "", "expeditionDetailDesc1Hike", "expeditionDetailDesc1Climb", "expeditionDetailDesc2", "expeditionDetailDesc3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30644d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f30641a, oVar.f30641a) && p005kotlin.jvm.internal.s.g(this.f30642b, oVar.f30642b) && p005kotlin.jvm.internal.s.g(this.f30643c, oVar.f30643c) && p005kotlin.jvm.internal.s.g(this.f30644d, oVar.f30644d);
    }

    public final int hashCode() {
        String str = this.f30641a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30642b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30643c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30644d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f30641a;
        String str2 = this.f30642b;
        return e5.h(p6.b.i("ExpeditionTranslationDTO(expeditionDetailDesc1Hike=", str, ", expeditionDetailDesc1Climb=", str2, ", expeditionDetailDesc2="), this.f30643c, ", expeditionDetailDesc3=", this.f30644d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f30641a);
        parcel.writeString(this.f30642b);
        parcel.writeString(this.f30643c);
        parcel.writeString(this.f30644d);
    }

    public o(String str, String str2, String str3, String str4) {
        this.f30641a = str;
        this.f30642b = str2;
        this.f30643c = str3;
        this.f30644d = str4;
    }

    public o() {
        this(null, null, null, null, 15, null);
    }
}
