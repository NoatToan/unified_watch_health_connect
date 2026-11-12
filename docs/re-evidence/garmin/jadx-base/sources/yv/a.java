package yv;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lyv/a;", "Landroid/os/Parcelable;", "", "isLoading", "isError", "isSoftwareUpToDate", "", "deviceId", "", "productNumber", "deviceName", "currentVersion", "latestVersion", "releaseNotes", "updateUrl", "hideUpToDate", "<init>", "(ZZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3739a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f199801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f199803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f199804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f199805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f199806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f199807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f199808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f199809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f199810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f199811k;

    /* JADX INFO: renamed from: yv.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3739a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z14 = false;
            boolean z15 = true;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            long j8 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z17 = true;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                z17 = false;
            }
            return new a(z16, z14, z15, j8, string, string2, string3, string4, string5, string6, z17);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(boolean z14, boolean z15, boolean z16, long j8, String str, String str2, String str3, String str4, String str5, String str6, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? -1L : j8, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? "" : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : str5, (i14 & 512) == 0 ? str6 : null, (i14 & 1024) != 0 ? false : z17);
    }

    public static a b(a aVar, boolean z14, boolean z15, boolean z16, String str, String str2, String str3, int i14) {
        boolean z17 = (i14 & 2) != 0 ? aVar.f199802b : z15;
        boolean z18 = (i14 & 4) != 0 ? aVar.f199803c : z16;
        long j8 = aVar.f199804d;
        String str4 = aVar.f199805e;
        String str5 = aVar.f199806f;
        String str6 = aVar.f199807g;
        String str7 = (i14 & 128) != 0 ? aVar.f199808h : str;
        String str8 = (i14 & 256) != 0 ? aVar.f199809i : str2;
        String str9 = (i14 & 512) != 0 ? aVar.f199810j : str3;
        boolean z19 = aVar.f199811k;
        aVar.getClass();
        str6.getClass();
        return new a(z14, z17, z18, j8, str4, str5, str6, str7, str8, str9, z19);
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
        return this.f199801a == aVar.f199801a && this.f199802b == aVar.f199802b && this.f199803c == aVar.f199803c && this.f199804d == aVar.f199804d && s.g(this.f199805e, aVar.f199805e) && s.g(this.f199806f, aVar.f199806f) && s.g(this.f199807g, aVar.f199807g) && s.g(this.f199808h, aVar.f199808h) && s.g(this.f199809i, aVar.f199809i) && s.g(this.f199810j, aVar.f199810j) && this.f199811k == aVar.f199811k;
    }

    public final int hashCode() {
        int iE = q6.f.e(q6.f.g(q6.f.g(Boolean.hashCode(this.f199801a) * 31, 31, this.f199802b), 31, this.f199803c), 31, this.f199804d);
        String str = this.f199805e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f199806f;
        int iJ = wr.g.j((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f199807g);
        String str3 = this.f199808h;
        int iHashCode2 = (iJ + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f199809i;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f199810j;
        return Boolean.hashCode(this.f199811k) + ((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("SensorFirmwareUpdateUiState(isLoading=", ", isError=", ", isSoftwareUpToDate=", this.f199801a, this.f199802b);
        sbM.append(this.f199803c);
        sbM.append(", deviceId=");
        sbM.append(this.f199804d);
        sn.a.t(sbM, ", productNumber=", this.f199805e, ", deviceName=", this.f199806f);
        sn.a.t(sbM, ", currentVersion=", this.f199807g, ", latestVersion=", this.f199808h);
        sn.a.t(sbM, ", releaseNotes=", this.f199809i, ", updateUrl=", this.f199810j);
        return com.airbnb.lottie.animation.keyframe.a.i(sbM, ", hideUpToDate=", this.f199811k, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f199801a ? 1 : 0);
        parcel.writeInt(this.f199802b ? 1 : 0);
        parcel.writeInt(this.f199803c ? 1 : 0);
        parcel.writeLong(this.f199804d);
        parcel.writeString(this.f199805e);
        parcel.writeString(this.f199806f);
        parcel.writeString(this.f199807g);
        parcel.writeString(this.f199808h);
        parcel.writeString(this.f199809i);
        parcel.writeString(this.f199810j);
        parcel.writeInt(this.f199811k ? 1 : 0);
    }

    public a(boolean z14, boolean z15, boolean z16, long j8, String str, String str2, String str3, String str4, String str5, String str6, boolean z17) {
        str3.getClass();
        this.f199801a = z14;
        this.f199802b = z15;
        this.f199803c = z16;
        this.f199804d = j8;
        this.f199805e = str;
        this.f199806f = str2;
        this.f199807g = str3;
        this.f199808h = str4;
        this.f199809i = str5;
        this.f199810j = str6;
        this.f199811k = z17;
    }

    public a() {
        this(false, false, false, 0L, null, null, null, null, null, null, false, 2047, null);
    }
}
