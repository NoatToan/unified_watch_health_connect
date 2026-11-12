package p3;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lp3/b2;", "Lp3/n3;", "Landroid/os/Parcelable;", "", "value", "<init>", "(J)V", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class b2 extends n3 implements Parcelable {
    public static final Parcelable.Creator<b2> CREATOR;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"p3/b2$a", "Landroid/os/Parcelable$Creator;", "Lp3/b2;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b2> {
        @Override // android.os.Parcelable.Creator
        public final b2 createFromParcel(Parcel parcel) {
            return new b2(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final b2[] newArray(int i14) {
            return new b2[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public b2(long j8) {
        super(j8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(j());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/b2$b;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
