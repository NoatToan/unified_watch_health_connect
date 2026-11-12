package dh0;

import android.os.Parcel;
import android.os.Parcelable;
import lc.u0;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012¨\u0006\u0016"}, d2 = {"Ldh0/c;", "Landroid/os/Parcelable;", "", "invalidReason", "", "chronologicalAge", "", "fitnessAge", "achievableFitnessAge", "previousFitnessAge", "Ldh0/b;", "components", "lastUpdated", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ldh0/b;Ljava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ldh0/b;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f59558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f59559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f59560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f59561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f59562g;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<c> CREATOR = new C1274c();

    /* JADX INFO: renamed from: dh0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1274c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(int i14, String str, Integer num, Double d14, Double d15, Double d16, b bVar, String str2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f59556a = null;
        } else {
            this.f59556a = str;
        }
        if ((i14 & 2) == 0) {
            this.f59557b = null;
        } else {
            this.f59557b = num;
        }
        if ((i14 & 4) == 0) {
            this.f59558c = null;
        } else {
            this.f59558c = d14;
        }
        if ((i14 & 8) == 0) {
            this.f59559d = null;
        } else {
            this.f59559d = d15;
        }
        if ((i14 & 16) == 0) {
            this.f59560e = null;
        } else {
            this.f59560e = d16;
        }
        if ((i14 & 32) == 0) {
            this.f59561f = null;
        } else {
            this.f59561f = bVar;
        }
        if ((i14 & 64) == 0) {
            this.f59562g = null;
        } else {
            this.f59562g = str2;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f59556a, cVar.f59556a) && s.g(this.f59557b, cVar.f59557b) && s.g(this.f59558c, cVar.f59558c) && s.g(this.f59559d, cVar.f59559d) && s.g(this.f59560e, cVar.f59560e) && s.g(this.f59561f, cVar.f59561f) && s.g(this.f59562g, cVar.f59562g);
    }

    public final int hashCode() {
        String str = this.f59556a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f59557b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f59558c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f59559d;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f59560e;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        b bVar = this.f59561f;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f59562g;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = u0.n("FitnessAgeDetailsDto(invalidReason=", this.f59557b, this.f59556a, ", chronologicalAge=", ", fitnessAge=");
        b71.i.p(this.f59558c, this.f59559d, ", achievableFitnessAge=", ", previousFitnessAge=", sbN);
        sbN.append(this.f59560e);
        sbN.append(", components=");
        sbN.append(this.f59561f);
        sbN.append(", lastUpdated=");
        return am.j.o(this.f59562g, ")", sbN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f59556a);
        Integer num = this.f59557b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.f59558c;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f59559d;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f59560e;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        b bVar = this.f59561f;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f59562g);
    }

    /* JADX INFO: renamed from: dh0.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldh0/c$b;", "", "<init>", "()V", "Li63/c;", "Ldh0/c;", "serializer", "()Li63/c;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f59563a;
        }

        private Companion() {
        }
    }

    public c() {
        this((String) null, (Integer) null, (Double) null, (Double) null, (Double) null, (b) null, (String) null, 127, (p005kotlin.jvm.internal.j) null);
    }

    public c(String str, Integer num, Double d14, Double d15, Double d16, b bVar, String str2) {
        this.f59556a = str;
        this.f59557b = num;
        this.f59558c = d14;
        this.f59559d = d15;
        this.f59560e = d16;
        this.f59561f = bVar;
        this.f59562g = str2;
    }

    public /* synthetic */ c(String str, Integer num, Double d14, Double d15, Double d16, b bVar, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : bVar, (i14 & 64) != 0 ? null : str2);
    }
}
