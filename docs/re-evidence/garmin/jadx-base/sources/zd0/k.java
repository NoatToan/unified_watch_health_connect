package zd0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lzd0/k;", "", "Ll80/b;", "gdiDelegate", "Lzd0/i;", "getDeviceConnectionStateUseCase", "<init>", "(Ll80/b;Lzd0/i;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.b f204040a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzd0/k$a;", "Landroid/os/Parcelable;", "", "unitID", "", "name", "imageUrl", "", "connected", "<init>", "(JLjava/lang/String;Ljava/lang/String;Z)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C3807a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f204041e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f204042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f204043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f204044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f204045d;

        /* JADX INFO: renamed from: zd0.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3807a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public a(long j8, String str, String str2, boolean z14) {
            str.getClass();
            this.f204042a = j8;
            this.f204043b = str;
            this.f204044c = str2;
            this.f204045d = z14;
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
            return this.f204042a == aVar.f204042a && this.f204043b.equals(aVar.f204043b) && p005kotlin.jvm.internal.s.g(this.f204044c, aVar.f204044c) && this.f204045d == aVar.f204045d;
        }

        public final int hashCode() {
            int iJ = wr.g.j(Long.hashCode(this.f204042a) * 31, 31, this.f204043b);
            String str = this.f204044c;
            return Boolean.hashCode(this.f204045d) + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f204042a, "DeviceItem(unitID=", ", name=", this.f204043b);
            com.airbnb.lottie.animation.keyframe.a.t(", imageUrl=", this.f204044c, ", connected=", sbK, this.f204045d);
            sbK.append(")");
            return sbK.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeLong(this.f204042a);
            parcel.writeString(this.f204043b);
            parcel.writeString(this.f204044c);
            parcel.writeInt(this.f204045d ? 1 : 0);
        }
    }

    public k(l80.b bVar, i iVar) {
        bVar.getClass();
        iVar.getClass();
        this.f204040a = bVar;
    }
}
