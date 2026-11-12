package rf0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import gf0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrf0/a;", "Landroid/os/Parcelable;", "", "Lgf0/f;", "resultValues", "Lgf0/h;", "symptomValues", "Lorg/joda/time/LocalDate;", "beginningDate", "endingDate", "<init>", "(Ljava/util/List;Ljava/util/List;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2865a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<? extends gf0.f> f152388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<? extends h> f152389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LocalDate f152390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LocalDate f152391d;

    /* JADX INFO: renamed from: rf0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2865a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(gf0.f.valueOf(parcel.readString()));
            }
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList2.add(h.valueOf(parcel.readString()));
            }
            return new a(arrayList, arrayList2, (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(List list, List list2, LocalDate localDate, LocalDate localDate2, int i14, j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? j0.f134944a : list2, (i14 & 4) != 0 ? null : localDate, (i14 & 8) != 0 ? null : localDate2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f152388a, aVar.f152388a) && s.g(this.f152389b, aVar.f152389b) && s.g(this.f152390c, aVar.f152390c) && s.g(this.f152391d, aVar.f152391d);
    }

    public final int hashCode() {
        int iB = u0.b(this.f152388a.hashCode() * 31, 31, this.f152389b);
        LocalDate localDate = this.f152390c;
        int iHashCode = (iB + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f152391d;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public final String toString() {
        List<? extends gf0.f> list = this.f152388a;
        List<? extends h> list2 = this.f152389b;
        LocalDate localDate = this.f152390c;
        LocalDate localDate2 = this.f152391d;
        StringBuilder sbK = f3.k("EcgFilterData(resultValues=", ", symptomValues=", ", beginningDate=", list, list2);
        sbK.append(localDate);
        sbK.append(", endingDate=");
        sbK.append(localDate2);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f152388a, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((gf0.f) itE.next()).name());
        }
        Iterator itE2 = kg.f.e(this.f152389b, parcel);
        while (itE2.hasNext()) {
            parcel.writeString(((h) itE2.next()).name());
        }
        parcel.writeSerializable(this.f152390c);
        parcel.writeSerializable(this.f152391d);
    }

    public a(List<? extends gf0.f> list, List<? extends h> list2, LocalDate localDate, LocalDate localDate2) {
        list.getClass();
        list2.getClass();
        this.f152388a = list;
        this.f152389b = list2;
        this.f152390c = localDate;
        this.f152391d = localDate2;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
