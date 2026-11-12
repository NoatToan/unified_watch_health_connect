package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/g;", "Landroid/os/Parcelable;", "", "userId", "", "fullName", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "simplePublicSocialProfile", "listSizeProfileImageUrl", "level", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/l;Ljava/lang/String;Ljava/lang/Long;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46856f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f46857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f46859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f46861e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Long lValueOf;
            l lVar;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                lVar = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                lVar = null;
            }
            String string = parcel.readString();
            l lVarCreateFromParcel = parcel.readInt() == 0 ? lVar : l.CREATOR.createFromParcel(parcel);
            Long lValueOf2 = lVar;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new g(lValueOf, string, lVarCreateFromParcel, string2, lValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(Long l14, String str, l lVar, String str2, Long l15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, str, (i14 & 4) != 0 ? null : lVar, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : l15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f46857a, gVar.f46857a) && s.g(this.f46858b, gVar.f46858b) && s.g(this.f46859c, gVar.f46859c) && s.g(this.f46860d, gVar.f46860d) && s.g(this.f46861e, gVar.f46861e);
    }

    public final int hashCode() {
        Long l14 = this.f46857a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f46858b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        l lVar = this.f46859c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str2 = this.f46860d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l15 = this.f46861e;
        return iHashCode4 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("ManagedAccountUser(userId=", ", fullName=", this.f46858b, this.f46857a, ", simplePublicSocialProfile=");
        sbJ.append(this.f46859c);
        sbJ.append(", listSizeProfileImageUrl=");
        sbJ.append(this.f46860d);
        sbJ.append(", level=");
        return p6.b.g(sbJ, this.f46861e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f46857a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f46858b);
        l lVar = this.f46859c;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f46860d);
        Long l15 = this.f46861e;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
    }

    public g(Long l14, String str, l lVar, String str2, Long l15) {
        this.f46857a = l14;
        this.f46858b = str;
        this.f46859c = lVar;
        this.f46860d = str2;
        this.f46861e = l15;
    }
}
