package km;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkm/a;", "Landroid/os/Parcelable;", "", "yAxisLabelColor", "", "Lkm/c;", "dataSetCustomizations", "<init>", "(ILjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2028a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f105277b;

    /* JADX INFO: renamed from: km.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2028a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            int iA = 0;
            while (iA != i15) {
                iA = f.a(c.CREATOR, parcel, arrayList, iA, 1);
            }
            return new a(i14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(int i14, List<c> list) {
        list.getClass();
        this.f105276a = i14;
        this.f105277b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f105276a);
        Iterator itE = f.e(this.f105277b, parcel);
        while (itE.hasNext()) {
            ((c) itE.next()).writeToParcel(parcel, i14);
        }
    }
}
