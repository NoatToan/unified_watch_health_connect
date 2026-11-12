package pn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import pn2.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpn2/p;", "Lpn2/d;", "T", "Landroid/os/Parcelable;", "Lrn2/s;", "header", "payload", "<init>", "(Lrn2/s;Lpn2/d;)V", "a", "Lrn2/s;", "b", "()Lrn2/s;", "Lpn2/d;", "d", "()Lpn2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p<T extends d> implements Parcelable {
    public static final Parcelable.Creator<p<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("header")
    private final rn2.s header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final T payload;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p<?>> {
        @Override // android.os.Parcelable.Creator
        public final p<?> createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new p<>(rn2.s.CREATOR.createFromParcel(parcel), (d) parcel.readParcelable(p.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final p<?>[] newArray(int i14) {
            return new p[i14];
        }
    }

    public p(rn2.s sVar, T t7) {
        sVar.getClass();
        this.header = sVar;
        this.payload = t7;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rn2.s getHeader() {
        return this.header;
    }

    public final T d() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.header, pVar.header) && p005kotlin.jvm.internal.s.g(this.payload, pVar.payload);
    }

    public final int hashCode() {
        int iHashCode = this.header.hashCode() * 31;
        T t7 = this.payload;
        return iHashCode + (t7 == null ? 0 : t7.hashCode());
    }

    public final String toString() {
        return "FNResponseDto(header=" + this.header + ", payload=" + this.payload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.header.writeToParcel(parcel, i14);
        parcel.writeParcelable(this.payload, i14);
    }
}
