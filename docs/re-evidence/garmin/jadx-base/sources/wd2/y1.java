package wd2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BaseGmsClient;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwd2/y1;", "Landroid/os/Parcelable;", "", "title", "", "smallIconId", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "channelId", "channelName", "channelDescription", "<init>", "(Ljava/lang/String;ILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y1 implements Parcelable {
    public static final Parcelable.Creator<y1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f184683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f184684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f184685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f184686f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<y1> {
        @Override // android.os.Parcelable.Creator
        public final y1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new y1(parcel.readString(), parcel.readInt(), (PendingIntent) parcel.readParcelable(y1.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final y1[] newArray(int i14) {
            return new y1[i14];
        }
    }

    public y1(String str, int i14, PendingIntent pendingIntent, String str2, String str3, String str4) {
        str.getClass();
        pendingIntent.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f184681a = str;
        this.f184682b = i14;
        this.f184683c = pendingIntent;
        this.f184684d = str2;
        this.f184685e = str3;
        this.f184686f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.f184681a.equals(y1Var.f184681a) && this.f184682b == y1Var.f184682b && this.f184683c.equals(y1Var.f184683c) && this.f184684d.equals(y1Var.f184684d) && this.f184685e.equals(y1Var.f184685e) && this.f184686f.equals(y1Var.f184686f);
    }

    public final int hashCode() {
        return this.f184686f.hashCode() + wr.g.j(wr.g.j((this.f184683c.hashCode() + q2.d(this.f184682b, this.f184681a.hashCode() * 31, 31)) * 31, 31, this.f184684d), 31, this.f184685e);
    }

    public final String toString() {
        StringBuilder sbK = androidx.core.view.j.k(this.f184682b, "ServiceNotificationContent(title=", this.f184681a, ", smallIconId=", ", pendingIntent=");
        sbK.append(this.f184683c);
        sbK.append(", channelId=");
        sbK.append(this.f184684d);
        sbK.append(", channelName=");
        return e5.h(sbK, this.f184685e, ", channelDescription=", this.f184686f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f184681a);
        parcel.writeInt(this.f184682b);
        parcel.writeParcelable(this.f184683c, i14);
        parcel.writeString(this.f184684d);
        parcel.writeString(this.f184685e);
        parcel.writeString(this.f184686f);
    }
}
