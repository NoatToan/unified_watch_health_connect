package com.xiaomi.hm.health.bodyfat.slimming.repo;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.bodyfat.slimming.constants.LoseWeightPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\u0010\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010)¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "component7", "weight", "height", "encryptImpedance", "age", "gender", LoseWeightPropertyKey.IDENTITY, LoseWeightPropertyKey.LOSE_WEIGHT, "copy", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "F", "getWeight", "()F", "b", "getHeight", "c", LogUtil.I, "getEncryptImpedance", "()I", GoogleApiAvailabilityLight.a, "getAge", "e", "getGender", "f", "getIdentity", "g", "getLoseWeight", "<init>", "(FFIIIII)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoseWeightWeightInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoseWeightWeightInfo> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float weight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int encryptImpedance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int age;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int gender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int identity;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int loseWeight;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<LoseWeightWeightInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoseWeightWeightInfo createFromParcel(@NotNull Parcel parcel) {
            return new LoseWeightWeightInfo(parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoseWeightWeightInfo[] newArray(int i) {
            return new LoseWeightWeightInfo[i];
        }
    }

    public LoseWeightWeightInfo(float f, float f2, int i, int i2, int i3, int i4, int i5) {
        this.weight = f;
        this.height = f2;
        this.encryptImpedance = i;
        this.age = i2;
        this.gender = i3;
        this.identity = i4;
        this.loseWeight = i5;
    }

    public static /* synthetic */ LoseWeightWeightInfo copy$default(LoseWeightWeightInfo loseWeightWeightInfo, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f = loseWeightWeightInfo.weight;
        }
        if ((i6 & 2) != 0) {
            f2 = loseWeightWeightInfo.height;
        }
        float f3 = f2;
        if ((i6 & 4) != 0) {
            i = loseWeightWeightInfo.encryptImpedance;
        }
        int i7 = i;
        if ((i6 & 8) != 0) {
            i2 = loseWeightWeightInfo.age;
        }
        int i8 = i2;
        if ((i6 & 16) != 0) {
            i3 = loseWeightWeightInfo.gender;
        }
        int i9 = i3;
        if ((i6 & 32) != 0) {
            i4 = loseWeightWeightInfo.identity;
        }
        int i10 = i4;
        if ((i6 & 64) != 0) {
            i5 = loseWeightWeightInfo.loseWeight;
        }
        return loseWeightWeightInfo.copy(f, f3, i7, i8, i9, i10, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEncryptImpedance() {
        return this.encryptImpedance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIdentity() {
        return this.identity;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLoseWeight() {
        return this.loseWeight;
    }

    @NotNull
    public final LoseWeightWeightInfo copy(float weight, float height, int encryptImpedance, int age, int gender, int identity, int loseWeight) {
        return new LoseWeightWeightInfo(weight, height, encryptImpedance, age, gender, identity, loseWeight);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoseWeightWeightInfo)) {
            return false;
        }
        LoseWeightWeightInfo loseWeightWeightInfo = (LoseWeightWeightInfo) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.weight), (Object) Float.valueOf(loseWeightWeightInfo.weight)) && Intrinsics.areEqual((Object) Float.valueOf(this.height), (Object) Float.valueOf(loseWeightWeightInfo.height)) && this.encryptImpedance == loseWeightWeightInfo.encryptImpedance && this.age == loseWeightWeightInfo.age && this.gender == loseWeightWeightInfo.gender && this.identity == loseWeightWeightInfo.identity && this.loseWeight == loseWeightWeightInfo.loseWeight;
    }

    public final int getAge() {
        return this.age;
    }

    public final int getEncryptImpedance() {
        return this.encryptImpedance;
    }

    public final int getGender() {
        return this.gender;
    }

    public final float getHeight() {
        return this.height;
    }

    public final int getIdentity() {
        return this.identity;
    }

    public final int getLoseWeight() {
        return this.loseWeight;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((((((Float.floatToIntBits(this.weight) * 31) + Float.floatToIntBits(this.height)) * 31) + this.encryptImpedance) * 31) + this.age) * 31) + this.gender) * 31) + this.identity) * 31) + this.loseWeight;
    }

    @NotNull
    public String toString() {
        return "LoseWeightWeightInfo(weight=" + this.weight + ", height=" + this.height + ", encryptImpedance=" + this.encryptImpedance + ", age=" + this.age + ", gender=" + this.gender + ", identity=" + this.identity + ", loseWeight=" + this.loseWeight + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeFloat(this.weight);
        parcel.writeFloat(this.height);
        parcel.writeInt(this.encryptImpedance);
        parcel.writeInt(this.age);
        parcel.writeInt(this.gender);
        parcel.writeInt(this.identity);
        parcel.writeInt(this.loseWeight);
    }
}
