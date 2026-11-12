package hh2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lhh2/c;", "Landroid/os/Parcelable;", "", "actionText", "", "iconRes", "Landroid/app/PendingIntent;", "actionIntent", "<init>", "(Ljava/lang/String;ILandroid/app/PendingIntent;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "b", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f83756c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"hh2/c$a", "Landroid/os/Parcelable$Creator;", "Lhh2/c;", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        string.getClass();
        int i14 = parcel.readInt();
        Parcelable parcelable = parcel.readParcelable(PendingIntent.class.getClassLoader());
        parcelable.getClass();
        this(string, i14, (PendingIntent) parcelable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f83754a, cVar.f83754a) && this.f83755b == cVar.f83755b && s.g(this.f83756c, cVar.f83756c);
    }

    public final int hashCode() {
        return this.f83756c.hashCode() + q2.d(this.f83755b, this.f83754a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "NotificationAction(actionText=" + this.f83754a + ", iconRes=" + this.f83755b + ", actionIntent=" + this.f83756c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f83754a);
        parcel.writeInt(this.f83755b);
        parcel.writeParcelable(this.f83756c, i14);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhh2/c$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lhh2/c;", "CREATOR", "Landroid/os/Parcelable$Creator;", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public c(String str, int i14, PendingIntent pendingIntent) {
        str.getClass();
        pendingIntent.getClass();
        this.f83754a = str;
        this.f83755b = i14;
        this.f83756c = pendingIntent;
    }
}
