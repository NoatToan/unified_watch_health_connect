package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/i;", "Landroid/os/Parcelable;", "", "buildMuscle", "fatLoss", "abs", "buildStrength", "cardio", "muscleEndurance", "strength", "flexibility", "mobility", "balance", "breathing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BUILD_MUSCLE")
    private String buildMuscle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FAT_LOSS")
    private String fatLoss;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ABS")
    private String abs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BUILD_STRENGTH")
    private String buildStrength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CARDIO")
    private String cardio;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MUSCLE_ENDURANCE")
    private String muscleEndurance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("STRENGTH")
    private String strength;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FLEXIBILITY")
    private String flexibility;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MOBILITY")
    private String mobility;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BALANCE")
    private String balance;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BREATHING")
    private String breathing;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((String) ((o13.p) t7).f128595b, (String) ((o13.p) t14).f128595b);
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? null : str9, (i14 & 512) != 0 ? null : str10, (i14 & 1024) != 0 ? null : str11);
    }

    public final List<o13.p<String, String>> b() {
        String str;
        List<String> listK = p13.x.k("BUILD_MUSCLE", "FAT_LOSS", "ABS", "BUILD_STRENGTH", "CARDIO", "MUSCLE_ENDURANCE", "STRENGTH", "FLEXIBILITY", "MOBILITY", "BALANCE", "BREATHING");
        ArrayList arrayList = new ArrayList();
        for (String str2 : listK) {
            switch (str2) {
                case "STRENGTH":
                    str = this.strength;
                    break;
                case "MUSCLE_ENDURANCE":
                    str = this.muscleEndurance;
                    break;
                case "BUILD_MUSCLE":
                    str = this.buildMuscle;
                    break;
                case "ABS":
                    str = this.abs;
                    break;
                case "MOBILITY":
                    str = this.mobility;
                    break;
                case "BALANCE":
                    str = this.balance;
                    break;
                case "BREATHING":
                    str = this.breathing;
                    break;
                case "BUILD_STRENGTH":
                    str = this.buildStrength;
                    break;
                case "FAT_LOSS":
                    str = this.fatLoss;
                    break;
                case "FLEXIBILITY":
                    str = this.flexibility;
                    break;
                case "CARDIO":
                    str = this.cardio;
                    break;
                default:
                    str = null;
                    break;
            }
            o13.p pVar = str != null ? new o13.p(str2, str) : null;
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return p13.h0.N0(arrayList, new c());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.buildMuscle, iVar.buildMuscle) && p005kotlin.jvm.internal.s.g(this.fatLoss, iVar.fatLoss) && p005kotlin.jvm.internal.s.g(this.abs, iVar.abs) && p005kotlin.jvm.internal.s.g(this.buildStrength, iVar.buildStrength) && p005kotlin.jvm.internal.s.g(this.cardio, iVar.cardio) && p005kotlin.jvm.internal.s.g(this.muscleEndurance, iVar.muscleEndurance) && p005kotlin.jvm.internal.s.g(this.strength, iVar.strength) && p005kotlin.jvm.internal.s.g(this.flexibility, iVar.flexibility) && p005kotlin.jvm.internal.s.g(this.mobility, iVar.mobility) && p005kotlin.jvm.internal.s.g(this.balance, iVar.balance) && p005kotlin.jvm.internal.s.g(this.breathing, iVar.breathing);
    }

    public final int hashCode() {
        String str = this.buildMuscle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fatLoss;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.abs;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buildStrength;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardio;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.muscleEndurance;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.strength;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.flexibility;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.mobility;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.balance;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.breathing;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        String str = this.buildMuscle;
        String str2 = this.fatLoss;
        String str3 = this.abs;
        String str4 = this.buildStrength;
        String str5 = this.cardio;
        String str6 = this.muscleEndurance;
        String str7 = this.strength;
        String str8 = this.flexibility;
        String str9 = this.mobility;
        String str10 = this.balance;
        String str11 = this.breathing;
        StringBuilder sbI = p6.b.i("GoalsDTO(buildMuscle=", str, ", fatLoss=", str2, ", abs=");
        sn.a.t(sbI, str3, ", buildStrength=", str4, ", cardio=");
        sn.a.t(sbI, str5, ", muscleEndurance=", str6, ", strength=");
        sn.a.t(sbI, str7, ", flexibility=", str8, ", mobility=");
        sn.a.t(sbI, str9, ", balance=", str10, ", breathing=");
        return am.j.o(str11, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.buildMuscle);
        parcel.writeString(this.fatLoss);
        parcel.writeString(this.abs);
        parcel.writeString(this.buildStrength);
        parcel.writeString(this.cardio);
        parcel.writeString(this.muscleEndurance);
        parcel.writeString(this.strength);
        parcel.writeString(this.flexibility);
        parcel.writeString(this.mobility);
        parcel.writeString(this.balance);
        parcel.writeString(this.breathing);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/i$a;", "", "<init>", "()V", "", "BUILD_MUSCLE", "Ljava/lang/String;", "FAT_LOSS", "ABS", "BUILD_STRENGTH", "CARDIO", "MUSCLE_ENDURANCE", "STRENGTH", "FLEXIBILITY", "MOBILITY", "BALANCE", "BREATHING", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.buildMuscle = str;
        this.fatLoss = str2;
        this.abs = str3;
        this.buildStrength = str4;
        this.cardio = str5;
        this.muscleEndurance = str6;
        this.strength = str7;
        this.flexibility = str8;
        this.mobility = str9;
        this.balance = str10;
        this.breathing = str11;
    }

    public i() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
