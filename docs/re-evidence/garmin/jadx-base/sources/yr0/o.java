package yr0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.u1;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0017"}, d2 = {"Lyr0/o;", "Landroid/os/Parcelable;", "", "tripId", "userId", "", "startDate", "endDate", "", "Lyr0/j;", "flights", "Lyr0/f;", "dailyStatusDTO", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lyr0/f;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lyr0/f;Lm63/u1;)V", "Companion", "a", "b", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class o implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f199036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f199037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f199039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j> f199040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f199041f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<o> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f199035g = {null, null, null, null, o13.m.a(o13.n.PUBLICATION, new ya0.j(22)), null};

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(o.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new o(lValueOf, lValueOf2, string, string2, arrayList, parcel.readInt() != 0 ? f.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(int i14, Long l14, Long l15, String str, String str2, List list, f fVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f199036a = null;
        } else {
            this.f199036a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f199037b = null;
        } else {
            this.f199037b = l15;
        }
        if ((i14 & 4) == 0) {
            this.f199038c = null;
        } else {
            this.f199038c = str;
        }
        if ((i14 & 8) == 0) {
            this.f199039d = null;
        } else {
            this.f199039d = str2;
        }
        if ((i14 & 16) == 0) {
            this.f199040e = null;
        } else {
            this.f199040e = list;
        }
        if ((i14 & 32) == 0) {
            this.f199041f = null;
        } else {
            this.f199041f = fVar;
        }
    }

    public static o b(o oVar, f fVar) {
        Long l14 = oVar.f199036a;
        Long l15 = oVar.f199037b;
        String str = oVar.f199038c;
        String str2 = oVar.f199039d;
        List<j> list = oVar.f199040e;
        oVar.getClass();
        return new o(l14, l15, str, str2, list, fVar);
    }

    public final LocalDate d() {
        return g22.k.w(this.f199038c, "yyyy-MM-dd");
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
        return p005kotlin.jvm.internal.s.g(this.f199036a, oVar.f199036a) && p005kotlin.jvm.internal.s.g(this.f199037b, oVar.f199037b) && p005kotlin.jvm.internal.s.g(this.f199038c, oVar.f199038c) && p005kotlin.jvm.internal.s.g(this.f199039d, oVar.f199039d) && p005kotlin.jvm.internal.s.g(this.f199040e, oVar.f199040e) && p005kotlin.jvm.internal.s.g(this.f199041f, oVar.f199041f);
    }

    public final int hashCode() {
        Long l14 = this.f199036a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f199037b;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.f199038c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f199039d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<j> list = this.f199040e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        f fVar = this.f199041f;
        return iHashCode5 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = f3.j(this.f199036a, this.f199037b, "JetLagTripDTO(tripId=", ", userId=", ", startDate=");
        sn.a.t(sbJ, this.f199038c, ", endDate=", this.f199039d, ", flights=");
        sbJ.append(this.f199040e);
        sbJ.append(", dailyStatusDTO=");
        sbJ.append(this.f199041f);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f199036a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f199037b;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.f199038c);
        parcel.writeString(this.f199039d);
        List<j> list = this.f199040e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        f fVar = this.f199041f;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: yr0.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyr0/o$b;", "", "<init>", "()V", "Li63/c;", "Lyr0/o;", "serializer", "()Li63/c;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<o> serializer() {
            return a.f199042a;
        }

        private Companion() {
        }
    }

    public o() {
        this((Long) null, (Long) null, (String) null, (String) null, (List) null, (f) null, 63, (p005kotlin.jvm.internal.j) null);
    }

    public o(Long l14, Long l15, String str, String str2, List<j> list, f fVar) {
        this.f199036a = l14;
        this.f199037b = l15;
        this.f199038c = str;
        this.f199039d = str2;
        this.f199040e = list;
        this.f199041f = fVar;
    }

    public /* synthetic */ o(Long l14, Long l15, String str, String str2, List list, f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : list, (i14 & 32) != 0 ? null : fVar);
    }
}
