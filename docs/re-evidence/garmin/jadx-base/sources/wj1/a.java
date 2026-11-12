package wj1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import l20.c;
import l20.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import tj1.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwj1/a;", "Landroid/os/Parcelable;", "Ltj1/e;", "eccContacts", "<init>", "(Ltj1/e;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3454a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f185782b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f185783a;

    /* JADX INFO: renamed from: wj1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3454a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(e eVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : eVar);
    }

    public final ArrayList b() {
        r userContactsDTO;
        List<l20.a> listF;
        e eVar = this.f185783a;
        Iterable iterableT = (eVar == null || (userContactsDTO = eVar.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) ? j0.f134944a : ge1.b.t(listF);
        iterableT.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableT) {
            List<c> listZ = ((l20.a) obj).z();
            if (listZ != null && (!listZ.isEmpty())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && s.g(this.f185783a, ((a) obj).f185783a);
    }

    public final int hashCode() {
        e eVar = this.f185783a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "EmergencyCallingData(eccContacts=" + this.f185783a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        e eVar = this.f185783a;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
    }

    public a(e eVar) {
        this.f185783a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
