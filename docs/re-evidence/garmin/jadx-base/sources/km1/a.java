package km1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkm1/a;", "Landroid/os/Parcelable;", "", "endGMT", "startGMT", "", "value", "<init>", "(JJLjava/lang/Integer;)V", "a", "J", "b", "()J", "setEndGMT", "(J)V", "d", "setStartGMT", "c", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "setValue", "(Ljava/lang/Integer;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2033a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endGMT")
    private long endGMT;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startGMT")
    private long startGMT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private Integer value;

    /* JADX INFO: renamed from: km1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2033a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(long j8, long j14, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? 0L : j14, (i14 & 4) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEndGMT() {
        return this.endGMT;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartGMT() {
        return this.startGMT;
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
        return this.endGMT == aVar.endGMT && this.startGMT == aVar.startGMT && p005kotlin.jvm.internal.s.g(this.value, aVar.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iE = q6.f.e(Long.hashCode(this.endGMT) * 31, 31, this.startGMT);
        Integer num = this.value;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        long j8 = this.endGMT;
        long j14 = this.startGMT;
        Integer num = this.value;
        StringBuilder sbK = ds.e0.k(j8, "BreathingVariationEventDTO(endGMT=", ", startGMT=");
        sbK.append(j14);
        sbK.append(", value=");
        sbK.append(num);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.endGMT);
        parcel.writeLong(this.startGMT);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public a(long j8, long j14, Integer num) {
        this.endGMT = j8;
        this.startGMT = j14;
        this.value = num;
    }

    public a() {
        this(0L, 0L, null, 7, null);
    }
}
