package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/t;", "Landroid/os/Parcelable;", "", "arms", "biceps", "triceps", "total_body", "lower_body", "chest", "back", "shoulders", "abs", "quads", "hamstrings", "glutes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ARMS")
    private String arms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BICEPS")
    private String biceps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TRICEPS")
    private String triceps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TOTAL_BODY")
    private String total_body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("LOWER_BODY")
    private String lower_body;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CHEST")
    private String chest;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BACK")
    private String back;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("SHOULDERS")
    private String shoulders;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ABS")
    private String abs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("QUADS")
    private String quads;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("HAMSTRINGS")
    private String hamstrings;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("GLUTES")
    private String glutes;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ t(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? null : str9, (i14 & 512) != 0 ? null : str10, (i14 & 1024) != 0 ? null : str11, (i14 & 2048) != 0 ? null : str12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String b(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -342029840:
                if (str.equals("TRICEPS")) {
                    return this.triceps;
                }
                return null;
            case -191275555:
                if (str.equals("TOTAL_BODY")) {
                    return this.total_body;
                }
                return null;
            case 64594:
                if (str.equals("ABS")) {
                    return this.abs;
                }
                return null;
            case 2017687:
                if (str.equals("ARMS")) {
                    return this.arms;
                }
                return null;
            case 2030823:
                if (str.equals("BACK")) {
                    return this.back;
                }
                return null;
            case 64089825:
                if (str.equals("CHEST")) {
                    return this.chest;
                }
                return null;
            case 77402092:
                if (str.equals("QUADS")) {
                    return this.quads;
                }
                return null;
            case 837534387:
                if (str.equals("SHOULDERS")) {
                    return this.shoulders;
                }
                return null;
            case 1399106926:
                if (str.equals("HAMSTRINGS")) {
                    return this.hamstrings;
                }
                return null;
            case 1741118528:
                if (str.equals("LOWER_BODY")) {
                    return this.lower_body;
                }
                return null;
            case 1959005868:
                if (str.equals("BICEPS")) {
                    return this.biceps;
                }
                return null;
            case 2105472498:
                if (str.equals("GLUTES")) {
                    return this.glutes;
                }
                return null;
            default:
                return null;
        }
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
        return p005kotlin.jvm.internal.s.g(this.arms, tVar.arms) && p005kotlin.jvm.internal.s.g(this.biceps, tVar.biceps) && p005kotlin.jvm.internal.s.g(this.triceps, tVar.triceps) && p005kotlin.jvm.internal.s.g(this.total_body, tVar.total_body) && p005kotlin.jvm.internal.s.g(this.lower_body, tVar.lower_body) && p005kotlin.jvm.internal.s.g(this.chest, tVar.chest) && p005kotlin.jvm.internal.s.g(this.back, tVar.back) && p005kotlin.jvm.internal.s.g(this.shoulders, tVar.shoulders) && p005kotlin.jvm.internal.s.g(this.abs, tVar.abs) && p005kotlin.jvm.internal.s.g(this.quads, tVar.quads) && p005kotlin.jvm.internal.s.g(this.hamstrings, tVar.hamstrings) && p005kotlin.jvm.internal.s.g(this.glutes, tVar.glutes);
    }

    public final int hashCode() {
        String str = this.arms;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.biceps;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.triceps;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.total_body;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lower_body;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.chest;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.back;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shoulders;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.abs;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.quads;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.hamstrings;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.glutes;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        String str = this.arms;
        String str2 = this.biceps;
        String str3 = this.triceps;
        String str4 = this.total_body;
        String str5 = this.lower_body;
        String str6 = this.chest;
        String str7 = this.back;
        String str8 = this.shoulders;
        String str9 = this.abs;
        String str10 = this.quads;
        String str11 = this.hamstrings;
        String str12 = this.glutes;
        StringBuilder sbI = p6.b.i("MuscleGroupsDTO(arms=", str, ", biceps=", str2, ", triceps=");
        sn.a.t(sbI, str3, ", total_body=", str4, ", lower_body=");
        sn.a.t(sbI, str5, ", chest=", str6, ", back=");
        sn.a.t(sbI, str7, ", shoulders=", str8, ", abs=");
        sn.a.t(sbI, str9, ", quads=", str10, ", hamstrings=");
        return e5.h(sbI, str11, ", glutes=", str12, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.arms);
        parcel.writeString(this.biceps);
        parcel.writeString(this.triceps);
        parcel.writeString(this.total_body);
        parcel.writeString(this.lower_body);
        parcel.writeString(this.chest);
        parcel.writeString(this.back);
        parcel.writeString(this.shoulders);
        parcel.writeString(this.abs);
        parcel.writeString(this.quads);
        parcel.writeString(this.hamstrings);
        parcel.writeString(this.glutes);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/t$a;", "", "<init>", "()V", "", "ARMS", "Ljava/lang/String;", "BICEPS", "TRICEPS", "TOTAL_BODY", "LOWER_BODY", "CHEST", "BACK", "SHOULDERS", "ABS", "QUADS", "HAMSTRINGS", "GLUTES", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public t(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.arms = str;
        this.biceps = str2;
        this.triceps = str3;
        this.total_body = str4;
        this.lower_body = str5;
        this.chest = str6;
        this.back = str7;
        this.shoulders = str8;
        this.abs = str9;
        this.quads = str10;
        this.hamstrings = str11;
        this.glutes = str12;
    }

    public t() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
