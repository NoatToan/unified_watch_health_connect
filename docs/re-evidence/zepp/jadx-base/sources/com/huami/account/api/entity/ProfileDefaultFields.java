package com.huami.account.api.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\r\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001c¨\u0006'"}, d2 = {"Lcom/huami/account/api/entity/ProfileDefaultFields;", "", "", "component1", "", "component2", "component3", "", "component4", "component5", "birthday", "gender", "height", "weight", "age", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getBirthday", "()Ljava/lang/String;", "b", LogUtil.I, "getGender", "()I", "c", "getHeight", GoogleApiAvailabilityLight.a, "F", "getWeight", "()F", "e", "getAge", "<init>", "(Ljava/lang/String;IIFI)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ProfileDefaultFields {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("birthday")
    @NotNull
    private final String birthday;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("gender")
    private final int gender;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("height")
    private final int height;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("weight")
    private final float weight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("age")
    private final int age;

    public ProfileDefaultFields(@NotNull String str, int i, int i2, float f, int i3) {
        this.birthday = str;
        this.gender = i;
        this.height = i2;
        this.weight = f;
        this.age = i3;
    }

    public static /* synthetic */ ProfileDefaultFields copy$default(ProfileDefaultFields profileDefaultFields, String str, int i, int i2, float f, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = profileDefaultFields.birthday;
        }
        if ((i4 & 2) != 0) {
            i = profileDefaultFields.gender;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = profileDefaultFields.height;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            f = profileDefaultFields.weight;
        }
        float f2 = f;
        if ((i4 & 16) != 0) {
            i3 = profileDefaultFields.age;
        }
        return profileDefaultFields.copy(str, i5, i6, f2, i3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final ProfileDefaultFields copy(@NotNull String birthday, int gender, int height, float weight, int age) {
        return new ProfileDefaultFields(birthday, gender, height, weight, age);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileDefaultFields)) {
            return false;
        }
        ProfileDefaultFields profileDefaultFields = (ProfileDefaultFields) other;
        return Intrinsics.areEqual(this.birthday, profileDefaultFields.birthday) && this.gender == profileDefaultFields.gender && this.height == profileDefaultFields.height && Intrinsics.areEqual((Object) Float.valueOf(this.weight), (Object) Float.valueOf(profileDefaultFields.weight)) && this.age == profileDefaultFields.age;
    }

    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final String getBirthday() {
        return this.birthday;
    }

    public final int getGender() {
        return this.gender;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.birthday.hashCode() * 31) + this.gender) * 31) + this.height) * 31) + Float.floatToIntBits(this.weight)) * 31) + this.age;
    }

    @NotNull
    public String toString() {
        return "ProfileDefaultFields(birthday=" + this.birthday + ", gender=" + this.gender + ", height=" + this.height + ", weight=" + this.weight + ", age=" + this.age + ")";
    }
}
