package is2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pl2.c;
import sl2.f;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lis2/a;", "Landroid/os/Parcelable;", "Lsl2/f;", "nfcChipType", "", "Lpl2/c;", "nfcCapabilities", "<init>", "(Lsl2/f;Ljava/util/Set;)V", "a", "Lsl2/f;", "d", "()Lsl2/f;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1817a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Expose
    private final f nfcChipType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Expose
    private final Set<c> nfcCapabilities;

    /* JADX INFO: renamed from: is2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1817a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            f fVarValueOf = f.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashSet.add(c.valueOf(parcel.readString()));
            }
            return new a(fVarValueOf, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f fVar, Set<? extends c> set) {
        fVar.getClass();
        set.getClass();
        this.nfcChipType = fVar;
        this.nfcCapabilities = set;
    }

    public final Set<c> b() {
        return this.nfcCapabilities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getNfcChipType() {
        return this.nfcChipType;
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
        return this.nfcChipType == aVar.nfcChipType && s.g(this.nfcCapabilities, aVar.nfcCapabilities);
    }

    public final int hashCode() {
        return this.nfcCapabilities.hashCode() + (this.nfcChipType.hashCode() * 31);
    }

    public final String toString() {
        String strName = this.nfcChipType.name();
        StringBuilder sb3 = new StringBuilder();
        for (c cVar : this.nfcCapabilities) {
            sb3.append(StringUtils.SPACE);
            sb3.append(cVar.name());
        }
        return e0.g("DeviceNFCInfo(nfcChipType=", strName, ", nfcCapabilities=", sb3.toString(), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.nfcChipType.name());
        Set<c> set = this.nfcCapabilities;
        parcel.writeInt(set.size());
        Iterator<c> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
    }
}
