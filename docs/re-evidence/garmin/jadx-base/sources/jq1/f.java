package jq1;

import android.os.Parcel;
import android.os.Parcelable;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Ljq1/f;", "Landroid/os/Parcelable;", "", "startGMT", "endGMT", "", "steps", "primaryActivityLevel", "", "activityLevelConstant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "b", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f100004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f100005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f100006e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<f> CREATOR = new c();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                boolValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                boolValueOf = null;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new f(string, string2, numValueOf, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(int i14, String str, String str2, Integer num, String str3, Boolean bool, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f100002a = null;
        } else {
            this.f100002a = str;
        }
        if ((i14 & 2) == 0) {
            this.f100003b = null;
        } else {
            this.f100003b = str2;
        }
        if ((i14 & 4) == 0) {
            this.f100004c = null;
        } else {
            this.f100004c = num;
        }
        if ((i14 & 8) == 0) {
            this.f100005d = null;
        } else {
            this.f100005d = str3;
        }
        if ((i14 & 16) == 0) {
            this.f100006e = null;
        } else {
            this.f100006e = bool;
        }
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
        return s.g(this.f100002a, fVar.f100002a) && s.g(this.f100003b, fVar.f100003b) && s.g(this.f100004c, fVar.f100004c) && s.g(this.f100005d, fVar.f100005d) && s.g(this.f100006e, fVar.f100006e);
    }

    public final int hashCode() {
        String str = this.f100002a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f100003b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f100004c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f100005d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f100006e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("StepsDTO(startGMT=", this.f100002a, ", endGMT=", this.f100003b, ", steps=");
        p6.b.l(this.f100004c, ", primaryActivityLevel=", this.f100005d, ", activityLevelConstant=", sbI);
        return p6.b.f(sbI, this.f100006e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f100002a);
        parcel.writeString(this.f100003b);
        Integer num = this.f100004c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f100005d);
        Boolean bool = this.f100006e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }

    /* JADX INFO: renamed from: jq1.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljq1/f$b;", "", "<init>", "()V", "Li63/c;", "Ljq1/f;", "serializer", "()Li63/c;", "", "NONE", "Ljava/lang/String;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f100007a;
        }

        private Companion() {
        }
    }

    public f() {
        this((String) null, (String) null, (Integer) null, (String) null, (Boolean) null, 31, (p005kotlin.jvm.internal.j) null);
    }

    public f(String str, String str2, Integer num, String str3, Boolean bool) {
        this.f100002a = str;
        this.f100003b = str2;
        this.f100004c = num;
        this.f100005d = str3;
        this.f100006e = bool;
    }

    public /* synthetic */ f(String str, String str2, Integer num, String str3, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : bool);
    }
}
