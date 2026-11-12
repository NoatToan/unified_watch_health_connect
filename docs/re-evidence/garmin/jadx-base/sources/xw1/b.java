package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lxw1/b;", "Landroid/os/Parcelable;", "", "actionId", "", "actionBodyLocalized", "", "Lxw1/j;", "options", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("actionId")
    private final Long actionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("actionBodyLocalized")
    private final String actionBodyLocalized;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("options")
    private final List<j> options;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(j.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new b(lValueOf, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Long l14, String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActionBodyLocalized() {
        return this.actionBodyLocalized;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getActionId() {
        return this.actionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.actionId, bVar.actionId) && s.g(this.actionBodyLocalized, bVar.actionBodyLocalized) && s.g(this.options, bVar.options);
    }

    public final List<j> f() {
        return this.options;
    }

    public final boolean g() {
        List<j> list = this.options;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final int hashCode() {
        Long l14 = this.actionId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.actionBodyLocalized;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<j> list = this.options;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.actionId;
        String str = this.actionBodyLocalized;
        return z.c(b71.i.j("ActionsDTO(actionId=", ", actionBodyLocalized=", str, l14, ", options="), this.options, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.actionId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.actionBodyLocalized);
        List<j> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((j) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public b(Long l14, String str, List<j> list) {
        this.actionId = l14;
        this.actionBodyLocalized = str;
        this.options = list;
    }

    public b() {
        this(null, null, null, 7, null);
    }
}
