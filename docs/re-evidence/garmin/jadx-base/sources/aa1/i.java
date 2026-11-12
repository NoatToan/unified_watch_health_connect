package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laa1/i;", "Landroid/os/Parcelable;", "Li53/c;", "Laa1/g;", "personalRecordsTypes", "", "hiddenPersonalRecordsLabel", "<init>", "(Li53/c;Ljava/lang/String;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<g> f2299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2300b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(g.CREATOR, parcel, arrayList, iA, 1);
            }
            return new i(i53.a.j(arrayList), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(i53.c<g> cVar, String str) {
        cVar.getClass();
        this.f2299a = cVar;
        this.f2300b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f2299a, iVar.f2299a) && s.g(this.f2300b, iVar.f2300b);
    }

    public final int hashCode() {
        int iHashCode = this.f2299a.hashCode() * 31;
        String str = this.f2300b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PersonalRecordsTypesPageState(personalRecordsTypes=" + this.f2299a + ", hiddenPersonalRecordsLabel=" + this.f2300b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itG = x.g(this.f2299a, parcel);
        while (itG.hasNext()) {
            ((g) itG.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f2300b);
    }

    public /* synthetic */ i(i53.c cVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, (i14 & 2) != 0 ? null : str);
    }
}
