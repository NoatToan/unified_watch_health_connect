package sg1;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsg1/c;", "Landroid/os/Parcelable;", "", "imageUrl", "deviceName", "deviceBackupCaption", "", "deviceId", "backupId", "", "isCurrentDevice", "backupDeleteDialogMessage", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Z)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f159206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f159207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f159208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f159209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f159210h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j8 = parcel.readLong();
            long j14 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            return new c(string, string2, string3, j8, j14, z14, parcel.readString(), parcel.readInt() == 0 ? z15 : true);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, long j8, long j14, boolean z14, String str4, boolean z15, int i14, j jVar) {
        this(str, str2, str3, j8, j14, (i14 & 32) != 0 ? false : z14, str4, (i14 & 128) != 0 ? false : z15);
    }

    public static c b(c cVar, boolean z14) {
        String str = cVar.f159203a;
        String str2 = cVar.f159204b;
        String str3 = cVar.f159205c;
        long j8 = cVar.f159206d;
        long j14 = cVar.f159207e;
        boolean z15 = cVar.f159208f;
        String str4 = cVar.f159209g;
        cVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new c(str, str2, str3, j8, j14, z15, str4, z14);
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
        return s.g(this.f159203a, cVar.f159203a) && s.g(this.f159204b, cVar.f159204b) && s.g(this.f159205c, cVar.f159205c) && this.f159206d == cVar.f159206d && this.f159207e == cVar.f159207e && this.f159208f == cVar.f159208f && s.g(this.f159209g, cVar.f159209g) && this.f159210h == cVar.f159210h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159210h) + wr.g.j(q6.f.g(q6.f.e(q6.f.e(wr.g.j(wr.g.j(this.f159203a.hashCode() * 31, 31, this.f159204b), 31, this.f159205c), 31, this.f159206d), 31, this.f159207e), 31, this.f159208f), 31, this.f159209g);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("DeviceBackupUiElement(imageUrl=", this.f159203a, ", deviceName=", this.f159204b, ", deviceBackupCaption=");
        e5.s(this.f159206d, this.f159205c, ", deviceId=", sbI);
        x.j(this.f159207e, ", backupId=", ", isCurrentDevice=", sbI);
        fb1.c.w(", backupDeleteDialogMessage=", this.f159209g, ", isSelected=", sbI, this.f159208f);
        return hb.a.k(sbI, this.f159210h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f159203a);
        parcel.writeString(this.f159204b);
        parcel.writeString(this.f159205c);
        parcel.writeLong(this.f159206d);
        parcel.writeLong(this.f159207e);
        parcel.writeInt(this.f159208f ? 1 : 0);
        parcel.writeString(this.f159209g);
        parcel.writeInt(this.f159210h ? 1 : 0);
    }

    public c(String str, String str2, String str3, long j8, long j14, boolean z14, String str4, boolean z15) {
        kg.f.p(str, str2, str3, str4);
        this.f159203a = str;
        this.f159204b = str2;
        this.f159205c = str3;
        this.f159206d = j8;
        this.f159207e = j14;
        this.f159208f = z14;
        this.f159209g = str4;
        this.f159210h = z15;
    }
}
