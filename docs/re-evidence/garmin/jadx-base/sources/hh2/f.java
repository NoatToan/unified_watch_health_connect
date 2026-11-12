package hh2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000b"}, d2 = {"Lhh2/f;", "Landroid/os/Parcelable;", "", "serviceType", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83774a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Parcel parcel) {
        this(parcel.readInt());
        parcel.getClass();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f83774a == ((f) obj).f83774a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83774a);
    }

    public final String toString() {
        return e0.j(new StringBuilder("ServiceConfiguration(serviceType="), this.f83774a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f83774a);
    }

    /* JADX INFO: renamed from: hh2.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhh2/f$a;", "Landroid/os/Parcelable$Creator;", "Lhh2/f;", "<init>", "()V", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion implements Parcelable.Creator<f> {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }

        private Companion() {
        }
    }

    public f(int i14) {
        this.f83774a = i14;
    }

    public /* synthetic */ f(int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 16 : i14);
    }

    public f() {
        this(0, 1, null);
    }
}
