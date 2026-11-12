package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfj2/b;", "Landroid/os/Parcelable;", "", "valid", "", "Lfj2/g;", "invalidFields", "<init>", "(ZLjava/util/List;)V", "a", "Z", "d", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valid")
    private final boolean valid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("invalidFields")
    private final List<g> invalidFields;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            int iA = 0;
            boolean z14 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            while (iA != i14) {
                iA = kg.f.a(g.CREATOR, parcel, arrayList, iA, 1);
            }
            return new b(z14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(boolean z14, List<g> list) {
        list.getClass();
        this.valid = z14;
        this.invalidFields = list;
    }

    public final List<g> b() {
        return this.invalidFields;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getValid() {
        return this.valid;
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
        return this.valid == bVar.valid && s.g(this.invalidFields, bVar.invalidFields);
    }

    public final int hashCode() {
        return this.invalidFields.hashCode() + (Boolean.hashCode(this.valid) * 31);
    }

    public final String toString() {
        return "AddressValidationDto(valid=" + this.valid + ", invalidFields=" + this.invalidFields + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.valid ? 1 : 0);
        Iterator itE = kg.f.e(this.invalidFields, parcel);
        while (itE.hasNext()) {
            ((g) itE.next()).writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ b(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, list);
    }
}
