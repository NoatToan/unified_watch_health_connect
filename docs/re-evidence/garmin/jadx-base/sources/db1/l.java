package db1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Ldb1/l;", "Landroid/os/Parcelable;", "", "Ldb1/k;", "notes", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setNotes", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notes")
    private List<k> notes;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new l(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new ArrayList() : list);
    }

    public final List<k> b() {
        return this.notes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && p005kotlin.jvm.internal.s.g(this.notes, ((l) obj).notes);
    }

    public final int hashCode() {
        List<k> list = this.notes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return tn.k.h("PregnancyNoteListDTO(notes=", ")", this.notes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<k> list = this.notes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            k kVar = (k) itO.next();
            if (kVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                kVar.writeToParcel(parcel, i14);
            }
        }
    }

    public l(List<k> list) {
        this.notes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
