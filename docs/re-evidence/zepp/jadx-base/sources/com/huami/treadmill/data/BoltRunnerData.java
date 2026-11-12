package com.huami.treadmill.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\bA\u0010BJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003Jy\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b\u0011\u0010\"\"\u0004\b#\u0010$R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010*\u001a\u0004\b4\u0010,\"\u0004\b5\u0010.R\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010*\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\u0017\u0010\"\"\u0004\b8\u0010$R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010%\u001a\u0004\b9\u0010'\"\u0004\b:\u0010)R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010%\u001a\u0004\b;\u0010'\"\u0004\b<\u0010)R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b=\u0010'\"\u0004\b>\u0010)R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010!\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010$¨\u0006C"}, d2 = {"Lcom/huami/treadmill/data/BoltRunnerData;", "", "", "component1", "", "component2", "", "component3", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", TdmillHmFragment.ARG_IS_METRIC, "uid", "age", "weight", "height", "gender", "isPlay", "avatarUrl", "avatarPath", "name", "chinese", "copy", "toString", "hashCode", "other", "equals", "Z", "()Z", "setMetric", "(Z)V", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", LogUtil.I, "getAge", "()I", "setAge", "(I)V", "F", "getWeight", "()F", "setWeight", "(F)V", "getHeight", "setHeight", "getGender", "setGender", "setPlay", "getAvatarUrl", "setAvatarUrl", "getAvatarPath", "setAvatarPath", "getName", "setName", "getChinese", "setChinese", "<init>", "(ZLjava/lang/String;IFIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BoltRunnerData {
    private int age;

    @NotNull
    private String avatarPath;

    @NotNull
    private String avatarUrl;
    private boolean chinese;
    private int gender;
    private int height;
    private boolean isMetric;
    private boolean isPlay;

    @NotNull
    private String name;

    @Nullable
    private String uid;
    private float weight;

    public BoltRunnerData(boolean z, @Nullable String str, int i, float f, int i2, int i3, boolean z2, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z3) {
        this.isMetric = z;
        this.uid = str;
        this.age = i;
        this.weight = f;
        this.height = i2;
        this.gender = i3;
        this.isPlay = z2;
        this.avatarUrl = str2;
        this.avatarPath = str3;
        this.name = str4;
        this.chinese = z3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsMetric() {
        return this.isMetric;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getChinese() {
        return this.chinese;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsPlay() {
        return this.isPlay;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAvatarPath() {
        return this.avatarPath;
    }

    @NotNull
    public final BoltRunnerData copy(boolean isMetric, @Nullable String uid, int age, float weight, int height, int gender, boolean isPlay, @NotNull String avatarUrl, @NotNull String avatarPath, @NotNull String name, boolean chinese) {
        return new BoltRunnerData(isMetric, uid, age, weight, height, gender, isPlay, avatarUrl, avatarPath, name, chinese);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoltRunnerData)) {
            return false;
        }
        BoltRunnerData boltRunnerData = (BoltRunnerData) other;
        return this.isMetric == boltRunnerData.isMetric && Intrinsics.areEqual(this.uid, boltRunnerData.uid) && this.age == boltRunnerData.age && Intrinsics.areEqual((Object) Float.valueOf(this.weight), (Object) Float.valueOf(boltRunnerData.weight)) && this.height == boltRunnerData.height && this.gender == boltRunnerData.gender && this.isPlay == boltRunnerData.isPlay && Intrinsics.areEqual(this.avatarUrl, boltRunnerData.avatarUrl) && Intrinsics.areEqual(this.avatarPath, boltRunnerData.avatarPath) && Intrinsics.areEqual(this.name, boltRunnerData.name) && this.chinese == boltRunnerData.chinese;
    }

    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final String getAvatarPath() {
        return this.avatarPath;
    }

    @NotNull
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final boolean getChinese() {
        return this.chinese;
    }

    public final int getGender() {
        return this.gender;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    public final float getWeight() {
        return this.weight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z = this.isMetric;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.uid;
        int iHashCode = (((((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.age) * 31) + Float.floatToIntBits(this.weight)) * 31) + this.height) * 31) + this.gender) * 31;
        boolean z2 = this.isPlay;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode2 = (((((((iHashCode + r2) * 31) + this.avatarUrl.hashCode()) * 31) + this.avatarPath.hashCode()) * 31) + this.name.hashCode()) * 31;
        boolean z3 = this.chinese;
        return iHashCode2 + (z3 ? 1 : z3);
    }

    public final boolean isMetric() {
        return this.isMetric;
    }

    public final boolean isPlay() {
        return this.isPlay;
    }

    public final void setAge(int i) {
        this.age = i;
    }

    public final void setAvatarPath(@NotNull String str) {
        this.avatarPath = str;
    }

    public final void setAvatarUrl(@NotNull String str) {
        this.avatarUrl = str;
    }

    public final void setChinese(boolean z) {
        this.chinese = z;
    }

    public final void setGender(int i) {
        this.gender = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMetric(boolean z) {
        this.isMetric = z;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setPlay(boolean z) {
        this.isPlay = z;
    }

    public final void setUid(@Nullable String str) {
        this.uid = str;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    @NotNull
    public String toString() {
        return "BoltRunnerData(isMetric=" + this.isMetric + ", uid=" + ((Object) this.uid) + ", age=" + this.age + ", weight=" + this.weight + ", height=" + this.height + ", gender=" + this.gender + ", isPlay=" + this.isPlay + ", avatarUrl=" + this.avatarUrl + ", avatarPath=" + this.avatarPath + ", name=" + this.name + ", chinese=" + this.chinese + ')';
    }

    public /* synthetic */ BoltRunnerData(boolean z, String str, int i, float f, int i2, int i3, boolean z2, String str2, String str3, String str4, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, z2, (i4 & 128) != 0 ? "" : str2, str3, str4, z3);
    }
}
