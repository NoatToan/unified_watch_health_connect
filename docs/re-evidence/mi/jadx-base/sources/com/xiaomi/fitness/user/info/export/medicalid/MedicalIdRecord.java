package com.xiaomi.fitness.user.info.export.medicalid;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdAddEmergencyContactActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010<\u001a\u00020\u0003H\u0016J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0013\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010?\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0005R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0005R\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\u0005R\u001c\u0010!\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u001c\u0010$\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\rR\u001c\u0010'\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\u001c\u0010*\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR\u001a\u0010-\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\u0005R\u001c\u00100\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\rR\u001c\u00103\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\u0005¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "", "id", "", "<init>", "(I)V", "getId", "()I", "avatarFilePath", "", "getAvatarFilePath", "()Ljava/lang/String;", "setAvatarFilePath", "(Ljava/lang/String;)V", "name", "getName", "setName", "birthday", "", "getBirthday", "()Ljava/lang/Long;", "setBirthday", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "gender", "getGender", "setGender", "bloodType", "getBloodType", "setBloodType", "donorType", "getDonorType", "setDonorType", "allergyDrugs", "getAllergyDrugs", "setAllergyDrugs", MedicalIdSPContract.PREF_CHRONIC, "getChronic", "setChronic", MedicalIdSPContract.PREF_TREATMENT, "getTreatment", "setTreatment", "remark", "getRemark", "setRemark", "lockShowStatus", "getLockShowStatus", "setLockShowStatus", MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NAME, "getContactName", "setContactName", MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NUMBER, "getContactNumber", "setContactNumber", MedicalIdAddEmergencyContactActivity.KEY_CONTACT_RELATION_TYPE_ID, "getContactRelationType", "setContactRelationType", "equals", "", "other", "hashCode", "component1", "copy", "toString", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MedicalIdRecord {

    @Nullable
    private String allergyDrugs;

    @Nullable
    private String avatarFilePath;

    @Nullable
    private Long birthday;
    private int bloodType;

    @Nullable
    private String chronic;

    @Nullable
    private String contactName;

    @Nullable
    private String contactNumber;
    private int contactRelationType;
    private int donorType;
    private int gender;
    private final int id;
    private int lockShowStatus;

    @Nullable
    private String name;

    @Nullable
    private String remark;

    @Nullable
    private String treatment;

    public MedicalIdRecord() {
        this(0, 1, null);
    }

    public static /* synthetic */ MedicalIdRecord copy$default(MedicalIdRecord medicalIdRecord, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = medicalIdRecord.id;
        }
        return medicalIdRecord.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final MedicalIdRecord copy(int id) {
        return new MedicalIdRecord(id);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !Intrinsics.areEqual(MedicalIdRecord.class, other.getClass())) {
            Logger.d("MEDEQUAL class different", new Object[0]);
            return false;
        }
        MedicalIdRecord medicalIdRecord = (MedicalIdRecord) other;
        return Intrinsics.areEqual(this.avatarFilePath, medicalIdRecord.avatarFilePath) && this.gender == medicalIdRecord.gender && this.bloodType == medicalIdRecord.bloodType && this.donorType == medicalIdRecord.donorType && Intrinsics.areEqual(this.avatarFilePath, medicalIdRecord.avatarFilePath) && Intrinsics.areEqual(this.name, medicalIdRecord.name) && Intrinsics.areEqual(this.allergyDrugs, medicalIdRecord.allergyDrugs) && Intrinsics.areEqual(this.chronic, medicalIdRecord.chronic) && Intrinsics.areEqual(this.treatment, medicalIdRecord.treatment) && this.lockShowStatus == medicalIdRecord.lockShowStatus && Intrinsics.areEqual(this.contactNumber, medicalIdRecord.contactNumber) && Intrinsics.areEqual(this.contactName, medicalIdRecord.contactName) && this.contactRelationType == medicalIdRecord.contactRelationType;
    }

    @Nullable
    public final String getAllergyDrugs() {
        return this.allergyDrugs;
    }

    @Nullable
    public final String getAvatarFilePath() {
        return this.avatarFilePath;
    }

    @Nullable
    public final Long getBirthday() {
        return this.birthday;
    }

    public final int getBloodType() {
        return this.bloodType;
    }

    @Nullable
    public final String getChronic() {
        return this.chronic;
    }

    @Nullable
    public final String getContactName() {
        return this.contactName;
    }

    @Nullable
    public final String getContactNumber() {
        return this.contactNumber;
    }

    public final int getContactRelationType() {
        return this.contactRelationType;
    }

    public final int getDonorType() {
        return this.donorType;
    }

    public final int getGender() {
        return this.gender;
    }

    public final int getId() {
        return this.id;
    }

    public final int getLockShowStatus() {
        return this.lockShowStatus;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getTreatment() {
        return this.treatment;
    }

    public int hashCode() {
        int i = this.id * 31;
        String str = this.avatarFilePath;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.birthday;
        int iHashCode3 = (((((((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31) + this.gender) * 31) + this.bloodType) * 31) + this.donorType) * 31;
        String str3 = this.allergyDrugs;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.chronic;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.treatment;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.remark;
        int iHashCode7 = (((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.lockShowStatus) * 31;
        String str7 = this.contactName;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.contactNumber;
        return ((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.contactRelationType;
    }

    public final void setAllergyDrugs(@Nullable String str) {
        this.allergyDrugs = str;
    }

    public final void setAvatarFilePath(@Nullable String str) {
        this.avatarFilePath = str;
    }

    public final void setBirthday(@Nullable Long l) {
        this.birthday = l;
    }

    public final void setBloodType(int i) {
        this.bloodType = i;
    }

    public final void setChronic(@Nullable String str) {
        this.chronic = str;
    }

    public final void setContactName(@Nullable String str) {
        this.contactName = str;
    }

    public final void setContactNumber(@Nullable String str) {
        this.contactNumber = str;
    }

    public final void setContactRelationType(int i) {
        this.contactRelationType = i;
    }

    public final void setDonorType(int i) {
        this.donorType = i;
    }

    public final void setGender(int i) {
        this.gender = i;
    }

    public final void setLockShowStatus(int i) {
        this.lockShowStatus = i;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setTreatment(@Nullable String str) {
        this.treatment = str;
    }

    @NotNull
    public String toString() {
        return "MedicalIdRecord(id=" + this.id + ")";
    }

    public MedicalIdRecord(int i) {
        this.id = i;
        this.lockShowStatus = -1;
    }

    public /* synthetic */ MedicalIdRecord(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
