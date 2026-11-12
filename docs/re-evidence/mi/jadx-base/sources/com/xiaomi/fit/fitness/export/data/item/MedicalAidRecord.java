package com.xiaomi.fit.fitness.export.data.item;

import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\r¨\u0006'"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/MedicalAidRecord;", "", "name", "", "gender", "age", MedicalIdSPContract.PREF_BLOOD_TYPE, MedicalIdSPContract.PREF_ALLERGY_DRUGS, "disease", "medical", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getGender", "setGender", "getAge", "setAge", "getBlood", "setBlood", "getAllergy", "getDisease", "getMedical", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MedicalAidRecord {

    @Nullable
    private String age;

    @Nullable
    private final String allergy;

    @Nullable
    private String blood;

    @Nullable
    private final String disease;

    @Nullable
    private String gender;

    @Nullable
    private final String medical;

    @Nullable
    private String name;

    public MedicalAidRecord() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ MedicalAidRecord copy$default(MedicalAidRecord medicalAidRecord, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = medicalAidRecord.name;
        }
        if ((i & 2) != 0) {
            str2 = medicalAidRecord.gender;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = medicalAidRecord.age;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = medicalAidRecord.blood;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = medicalAidRecord.allergy;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = medicalAidRecord.disease;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = medicalAidRecord.medical;
        }
        return medicalAidRecord.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBlood() {
        return this.blood;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAllergy() {
        return this.allergy;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisease() {
        return this.disease;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMedical() {
        return this.medical;
    }

    @NotNull
    public final MedicalAidRecord copy(@Nullable String name, @Nullable String gender, @Nullable String age, @Nullable String blood, @Nullable String allergy, @Nullable String disease, @Nullable String medical) {
        return new MedicalAidRecord(name, gender, age, blood, allergy, disease, medical);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedicalAidRecord)) {
            return false;
        }
        MedicalAidRecord medicalAidRecord = (MedicalAidRecord) other;
        return Intrinsics.areEqual(this.name, medicalAidRecord.name) && Intrinsics.areEqual(this.gender, medicalAidRecord.gender) && Intrinsics.areEqual(this.age, medicalAidRecord.age) && Intrinsics.areEqual(this.blood, medicalAidRecord.blood) && Intrinsics.areEqual(this.allergy, medicalAidRecord.allergy) && Intrinsics.areEqual(this.disease, medicalAidRecord.disease) && Intrinsics.areEqual(this.medical, medicalAidRecord.medical);
    }

    @Nullable
    public final String getAge() {
        return this.age;
    }

    @Nullable
    public final String getAllergy() {
        return this.allergy;
    }

    @Nullable
    public final String getBlood() {
        return this.blood;
    }

    @Nullable
    public final String getDisease() {
        return this.disease;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getMedical() {
        return this.medical;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gender;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.age;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.blood;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.allergy;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.disease;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.medical;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAge(@Nullable String str) {
        this.age = str;
    }

    public final void setBlood(@Nullable String str) {
        this.blood = str;
    }

    public final void setGender(@Nullable String str) {
        this.gender = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "MedicalAidRecord(name=" + this.name + ", gender=" + this.gender + ", age=" + this.age + ", blood=" + this.blood + ", allergy=" + this.allergy + ", disease=" + this.disease + ", medical=" + this.medical + ")";
    }

    public MedicalAidRecord(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.name = str;
        this.gender = str2;
        this.age = str3;
        this.blood = str4;
        this.allergy = str5;
        this.disease = str6;
        this.medical = str7;
    }

    public /* synthetic */ MedicalAidRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
