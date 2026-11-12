package pn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import pn2.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lpn2/m;", "Lpn2/d;", "E", "T", "Landroid/os/Parcelable;", "header", "payload", "<init>", "(Lpn2/d;Lpn2/d;)V", "a", "Lpn2/d;", "b", "()Lpn2/d;", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m<E extends d, T extends d> implements Parcelable {
    public static final Parcelable.Creator<m<?, ?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("header")
    private final E header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final T payload;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m<?, ?>> {
        @Override // android.os.Parcelable.Creator
        public final m<?, ?> createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m<>((d) parcel.readParcelable(m.class.getClassLoader()), (d) parcel.readParcelable(m.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final m<?, ?>[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(E e4, T t7) {
        e4.getClass();
        t7.getClass();
        this.header = e4;
        this.payload = t7;
    }

    public final E b() {
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
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.header, mVar.header) && p005kotlin.jvm.internal.s.g(this.payload, mVar.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + (this.header.hashCode() * 31);
    }

    public final String toString() {
        return "FNRequestDto(header=" + this.header + ", payload=" + this.payload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.header, i14);
        parcel.writeParcelable(this.payload, i14);
    }
}
