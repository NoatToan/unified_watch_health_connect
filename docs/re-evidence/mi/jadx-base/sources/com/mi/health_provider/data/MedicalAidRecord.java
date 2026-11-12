package com.mi.health_provider.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\f¨\u0006%"}, d2 = {"Lcom/mi/health_provider/data/MedicalAidRecord;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "gender", "getGender", "setGender", "age", "getAge", "setAge", MedicalIdSPContract.PREF_BLOOD_TYPE, "getBlood", "setBlood", MedicalIdSPContract.PREF_ALLERGY_DRUGS, "getAllergy", "setAllergy", "disease", "getDisease", "setDisease", "medical", "getMedical", "setMedical", "writeToParcel", "", "flags", "", "describeContents", "CREATOR", "health-provider_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedicalAidRecord implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String age;

    @Nullable
    private String allergy;

    @Nullable
    private String blood;

    @Nullable
    private String disease;

    @Nullable
    private String gender;

    @Nullable
    private String medical;

    @Nullable
    private String name;

    /* JADX INFO: renamed from: com.mi.health_provider.data.MedicalAidRecord$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/mi/health_provider/data/MedicalAidRecord$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/mi/health_provider/data/MedicalAidRecord;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/mi/health_provider/data/MedicalAidRecord;", "health-provider_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<MedicalAidRecord> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public MedicalAidRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MedicalAidRecord(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public MedicalAidRecord[] newArray(int size) {
            return new MedicalAidRecord[size];
        }
    }

    public MedicalAidRecord() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MedicalAidRecord(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.name = parcel.readString();
        this.gender = parcel.readString();
        this.age = parcel.readString();
        this.blood = parcel.readString();
        this.allergy = parcel.readString();
        this.disease = parcel.readString();
        this.medical = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public final void setAge(@Nullable String str) {
        this.age = str;
    }

    public final void setAllergy(@Nullable String str) {
        this.allergy = str;
    }

    public final void setBlood(@Nullable String str) {
        this.blood = str;
    }

    public final void setDisease(@Nullable String str) {
        this.disease = str;
    }

    public final void setGender(@Nullable String str) {
        this.gender = str;
    }

    public final void setMedical(@Nullable String str) {
        this.medical = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeString(this.gender);
        parcel.writeString(this.age);
        parcel.writeString(this.blood);
        parcel.writeString(this.allergy);
        parcel.writeString(this.disease);
        parcel.writeString(this.medical);
    }
}
