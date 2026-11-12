package g2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0083\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lg2/h;", "Landroid/os/Parcelable;", "", FirebaseAnalytics.Param.INDEX, "<init>", "(I)V", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75123a;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"g2/h$a", "Landroid/os/Parcelable$Creator;", "Lg2/h;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public h(int i14) {
        this.f75123a = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f75123a == ((h) obj).f75123a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75123a);
    }

    public final String toString() {
        return ds.e0.j(new StringBuilder("DefaultLazyKey(index="), this.f75123a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f75123a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg2/h$b;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
