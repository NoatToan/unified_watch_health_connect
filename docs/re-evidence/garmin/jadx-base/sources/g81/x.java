package g81;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg81/x;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "contributorDate", "", "headerText", "Li53/c;", "Lg81/l;", "contributors", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/String;Li53/c;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f76417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<l> f76419c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            parcel.getClass();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(l.CREATOR, parcel, arrayList, iA, 1);
            }
            return new x(localDate, string, i53.a.j(arrayList));
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public x(LocalDate localDate, String str, i53.c<l> cVar) {
        localDate.getClass();
        str.getClass();
        cVar.getClass();
        this.f76417a = localDate;
        this.f76418b = str;
        this.f76419c = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f76417a.equals(xVar.f76417a) && this.f76418b.equals(xVar.f76418b) && this.f76419c.equals(xVar.f76419c);
    }

    public final int hashCode() {
        return this.f76419c.hashCode() + wr.g.j(this.f76417a.hashCode() * 31, 31, this.f76418b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EnduranceScoreTopContributorGroupState(contributorDate=");
        sb3.append(this.f76417a);
        sb3.append(", headerText=");
        sb3.append(this.f76418b);
        sb3.append(", contributors=");
        return l2.e(sb3, this.f76419c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.f76417a);
        parcel.writeString(this.f76418b);
        Iterator itG = j20.x.g(this.f76419c, parcel);
        while (itG.hasNext()) {
            ((l) itG.next()).writeToParcel(parcel, i14);
        }
    }
}
