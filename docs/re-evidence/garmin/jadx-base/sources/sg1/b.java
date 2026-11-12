package sg1;

import android.os.Parcel;
import android.os.Parcelable;
import ds.e0;
import i3.e5;
import j20.x;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsg1/b;", "Landroid/os/Parcelable;", "", "backupId", "backupDeviceId", "", "backupDeviceName", "targetDeviceId", "backupScreenTitle", "backupScreenCaption", "deviceName", "deviceLastSynced", "restoreDialogText", "confirmationPopupText", "imageUrl", "backupDeleteDialogMessage", "<init>", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f159191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f159192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f159194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f159195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f159196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f159197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f159198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f159199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f159200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f159201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f159202l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(long j8, long j14, String str, long j15, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        hb.a.p(str, str2, str3, str4, str5);
        kg.f.p(str6, str7, str8, str9);
        this.f159191a = j8;
        this.f159192b = j14;
        this.f159193c = str;
        this.f159194d = j15;
        this.f159195e = str2;
        this.f159196f = str3;
        this.f159197g = str4;
        this.f159198h = str5;
        this.f159199i = str6;
        this.f159200j = str7;
        this.f159201k = str8;
        this.f159202l = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f159191a == bVar.f159191a && this.f159192b == bVar.f159192b && this.f159193c.equals(bVar.f159193c) && this.f159194d == bVar.f159194d && this.f159195e.equals(bVar.f159195e) && this.f159196f.equals(bVar.f159196f) && this.f159197g.equals(bVar.f159197g) && this.f159198h.equals(bVar.f159198h) && this.f159199i.equals(bVar.f159199i) && this.f159200j.equals(bVar.f159200j) && this.f159201k.equals(bVar.f159201k) && this.f159202l.equals(bVar.f159202l);
    }

    public final int hashCode() {
        return this.f159202l.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(q6.f.e(wr.g.j(q6.f.e(Long.hashCode(this.f159191a) * 31, 31, this.f159192b), 31, this.f159193c), 31, this.f159194d), 31, this.f159195e), 31, this.f159196f), 31, this.f159197g), 31, this.f159198h), 31, this.f159199i), 31, this.f159200j), 31, this.f159201k);
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f159191a, "DeviceBackupSingleItemUiState(backupId=", ", backupDeviceId=");
        p6.b.k(this.f159192b, ", backupDeviceName=", this.f159193c, sbK);
        x.j(this.f159194d, ", targetDeviceId=", ", backupScreenTitle=", sbK);
        sn.a.t(sbK, this.f159195e, ", backupScreenCaption=", this.f159196f, ", deviceName=");
        sn.a.t(sbK, this.f159197g, ", deviceLastSynced=", this.f159198h, ", restoreDialogText=");
        sn.a.t(sbK, this.f159199i, ", confirmationPopupText=", this.f159200j, ", imageUrl=");
        return e5.h(sbK, this.f159201k, ", backupDeleteDialogMessage=", this.f159202l, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f159191a);
        parcel.writeLong(this.f159192b);
        parcel.writeString(this.f159193c);
        parcel.writeLong(this.f159194d);
        parcel.writeString(this.f159195e);
        parcel.writeString(this.f159196f);
        parcel.writeString(this.f159197g);
        parcel.writeString(this.f159198h);
        parcel.writeString(this.f159199i);
        parcel.writeString(this.f159200j);
        parcel.writeString(this.f159201k);
        parcel.writeString(this.f159202l);
    }
}
