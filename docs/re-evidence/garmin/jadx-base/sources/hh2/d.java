package hh2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bB+\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lhh2/d;", "Landroid/os/Parcelable;", "", "name", "description", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "b", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83759c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"hh2/d$a", "Landroid/os/Parcelable$Creator;", "Lhh2/d;", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        string3.getClass();
        this(string, string2, string3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f83757a, dVar.f83757a) && s.g(this.f83758b, dVar.f83758b) && s.g(this.f83759c, dVar.f83759c);
    }

    public final int hashCode() {
        String str = this.f83757a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f83758b;
        return this.f83759c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NotificationChannelConfiguration(name=");
        sb3.append((Object) this.f83757a);
        sb3.append(", description=");
        sb3.append((Object) this.f83758b);
        sb3.append(", channelId=");
        return a0.m(sb3, this.f83759c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f83757a);
        parcel.writeString(this.f83758b);
        parcel.writeString(this.f83759c);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhh2/d$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lhh2/d;", "CREATOR", "Landroid/os/Parcelable$Creator;", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public d(String str) {
        this(str, null, null, 6, null);
    }

    public d(String str, String str2) {
        this(str, str2, null, 4, null);
    }

    public d(String str, String str2, String str3) {
        str3.getClass();
        this.f83757a = str;
        this.f83758b = str2;
        this.f83759c = str3;
    }

    public /* synthetic */ d(String str, String str2, String str3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? "ForegroundServiceChannel" : str3);
    }

    public d() {
        this(null, null, null, 7, null);
    }
}
