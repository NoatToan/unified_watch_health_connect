package vg1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B½\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvg1/t;", "Landroid/os/Parcelable;", "Lvg1/z;", "", "activitiesAndAppsSettingsClassName", "", "hasMusicSetting", "hasLteSettings", "textResponseSettingsClassName", "appearanceSettingsClassName", "soundAndAlertsSettingsClassName", "activityOptionsSettingsClassName", "activityTrackingSettingsClassName", "userSettingsClassName", "generalSettingsClassName", "findMyDeviceSettingsClassName", "watchFaceSettingClassName", "heartRateZoneSettingClassName", "deviceSettingsActivityTrackerClassName", "deviceSettingsDisplayOptionsClassName", "deviceRunOptionSettingClassName", "phoneNotificationSettingClassName", "hasBikeAlarm", "hasManagePeopleSettings", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements Parcelable, z {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f178171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f178172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f178173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f178174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f178175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f178176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f178177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f178178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f178179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f178180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f178181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f178182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f178183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f178184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f178185r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f178186t;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            boolean z14;
            parcel.getClass();
            String string = parcel.readString();
            boolean z15 = false;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z15 = true;
                z14 = true;
            } else {
                z14 = true;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z17 = z14;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            boolean z18 = z17;
            String string14 = parcel.readString();
            boolean z19 = false;
            String string15 = parcel.readString();
            if (parcel.readInt() == 0) {
                z18 = false;
            }
            if (parcel.readInt() != 0) {
                z19 = z18;
            }
            return new t(string, z16, z15, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, z18, z19);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public t(String str, boolean z14, boolean z15, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z16, boolean z17) {
        this.f178168a = str;
        this.f178169b = z14;
        this.f178170c = z15;
        this.f178171d = str2;
        this.f178172e = str3;
        this.f178173f = str4;
        this.f178174g = str5;
        this.f178175h = str6;
        this.f178176i = str7;
        this.f178177j = str8;
        this.f178178k = str9;
        this.f178179l = str10;
        this.f178180m = str11;
        this.f178181n = str12;
        this.f178182o = str13;
        this.f178183p = str14;
        this.f178184q = str15;
        this.f178185r = z16;
        this.f178186t = z17;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getF178171d() {
        return this.f178171d;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getF178176i() {
        return this.f178176i;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getF178172e() {
        return this.f178172e;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getF178183p() {
        return this.f178183p;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: M, reason: from getter */
    public final boolean getF178170c() {
        return this.f178170c;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getF178173f() {
        return this.f178173f;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF178168a() {
        return this.f178168a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f178168a, tVar.f178168a) && this.f178169b == tVar.f178169b && this.f178170c == tVar.f178170c && p005kotlin.jvm.internal.s.g(this.f178171d, tVar.f178171d) && p005kotlin.jvm.internal.s.g(this.f178172e, tVar.f178172e) && p005kotlin.jvm.internal.s.g(this.f178173f, tVar.f178173f) && p005kotlin.jvm.internal.s.g(this.f178174g, tVar.f178174g) && p005kotlin.jvm.internal.s.g(this.f178175h, tVar.f178175h) && p005kotlin.jvm.internal.s.g(this.f178176i, tVar.f178176i) && p005kotlin.jvm.internal.s.g(this.f178177j, tVar.f178177j) && p005kotlin.jvm.internal.s.g(this.f178178k, tVar.f178178k) && p005kotlin.jvm.internal.s.g(this.f178179l, tVar.f178179l) && p005kotlin.jvm.internal.s.g(this.f178180m, tVar.f178180m) && p005kotlin.jvm.internal.s.g(this.f178181n, tVar.f178181n) && p005kotlin.jvm.internal.s.g(this.f178182o, tVar.f178182o) && p005kotlin.jvm.internal.s.g(this.f178183p, tVar.f178183p) && p005kotlin.jvm.internal.s.g(this.f178184q, tVar.f178184q) && this.f178185r == tVar.f178185r && this.f178186t == tVar.f178186t;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF178180m() {
        return this.f178180m;
    }

    public final int hashCode() {
        String str = this.f178168a;
        int iG = q6.f.g(q6.f.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f178169b), 31, this.f178170c);
        String str2 = this.f178171d;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f178172e;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f178173f;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f178174g;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f178175h;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f178176i;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f178177j;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f178178k;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f178179l;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f178180m;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f178181n;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f178182o;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f178183p;
        int iHashCode13 = (iHashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f178184q;
        return Boolean.hashCode(this.f178186t) + q6.f.g((iHashCode13 + (str15 != null ? str15.hashCode() : 0)) * 31, 31, this.f178185r);
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF178185r() {
        return this.f178185r;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF178182o() {
        return this.f178182o;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getF178181n() {
        return this.f178181n;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getF178186t() {
        return this.f178186t;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getF178184q() {
        return this.f178184q;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getF178175h() {
        return this.f178175h;
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getF178174g() {
        return this.f178174g;
    }

    public final String toString() {
        StringBuilder sbD = zl.a.d("DeviceSettings(activitiesAndAppsSettingsClassName=", this.f178168a, ", hasMusicSetting=", this.f178169b, ", hasLteSettings=");
        fb1.c.w(", textResponseSettingsClassName=", this.f178171d, ", appearanceSettingsClassName=", sbD, this.f178170c);
        sn.a.t(sbD, this.f178172e, ", soundAndAlertsSettingsClassName=", this.f178173f, ", activityOptionsSettingsClassName=");
        sn.a.t(sbD, this.f178174g, ", activityTrackingSettingsClassName=", this.f178175h, ", userSettingsClassName=");
        sn.a.t(sbD, this.f178176i, ", generalSettingsClassName=", this.f178177j, ", findMyDeviceSettingsClassName=");
        sn.a.t(sbD, this.f178178k, ", watchFaceSettingClassName=", this.f178179l, ", heartRateZoneSettingClassName=");
        sn.a.t(sbD, this.f178180m, ", deviceSettingsActivityTrackerClassName=", this.f178181n, ", deviceSettingsDisplayOptionsClassName=");
        sn.a.t(sbD, this.f178182o, ", deviceRunOptionSettingClassName=", this.f178183p, ", phoneNotificationSettingClassName=");
        v.h.C(this.f178184q, ", hasBikeAlarm=", ", hasManagePeopleSettings=", sbD, this.f178185r);
        return hb.a.k(sbD, this.f178186t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f178168a);
        parcel.writeInt(this.f178169b ? 1 : 0);
        parcel.writeInt(this.f178170c ? 1 : 0);
        parcel.writeString(this.f178171d);
        parcel.writeString(this.f178172e);
        parcel.writeString(this.f178173f);
        parcel.writeString(this.f178174g);
        parcel.writeString(this.f178175h);
        parcel.writeString(this.f178176i);
        parcel.writeString(this.f178177j);
        parcel.writeString(this.f178178k);
        parcel.writeString(this.f178179l);
        parcel.writeString(this.f178180m);
        parcel.writeString(this.f178181n);
        parcel.writeString(this.f178182o);
        parcel.writeString(this.f178183p);
        parcel.writeString(this.f178184q);
        parcel.writeInt(this.f178185r ? 1 : 0);
        parcel.writeInt(this.f178186t ? 1 : 0);
    }

    @Override // vg1.z
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getF178177j() {
        return this.f178177j;
    }
}
