package com.xiaomi.hm.health.bt.profile.usernew;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bd\u0010eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0094\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0002HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001J\u0013\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\n\"\u0004\bA\u0010BR$\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\r\"\u0004\bF\u0010GR$\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u0010\"\u0004\bK\u0010LR$\u0010 \u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010!\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010I\u001a\u0004\bT\u0010\u0010\"\u0004\bU\u0010LR$\u0010\"\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010-\u001a\u0004\b]\u0010/\"\u0004\b^\u00101R$\u0010$\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010\u0019\"\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/usernew/UserInfoDto;", "", "", "component1", "Lcom/xiaomi/hm/health/bt/profile/usernew/Birth;", "component2", "Lcom/xiaomi/hm/health/bt/profile/usernew/Gender;", "component3", "", "component4", "()Ljava/lang/Integer;", "", "component5", "()Ljava/lang/Float;", "", "component6", "()Ljava/lang/Long;", "Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;", "component7", "component8", "Lcom/xiaomi/hm/health/bt/profile/usernew/BloodPressure;", "component9", "component10", "", "component11", "()Ljava/lang/Short;", "nickName", "birth", "gender", "height", "weight", "stepGoal", "location", "uid", "bloodPressure", "registerRegion", "idc", "copy", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/profile/usernew/Birth;Lcom/xiaomi/hm/health/bt/profile/usernew/Gender;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Long;Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;Ljava/lang/Long;Lcom/xiaomi/hm/health/bt/profile/usernew/BloodPressure;Ljava/lang/String;Ljava/lang/Short;)Lcom/xiaomi/hm/health/bt/profile/usernew/UserInfoDto;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "b", "Lcom/xiaomi/hm/health/bt/profile/usernew/Birth;", "getBirth", "()Lcom/xiaomi/hm/health/bt/profile/usernew/Birth;", "setBirth", "(Lcom/xiaomi/hm/health/bt/profile/usernew/Birth;)V", "c", "Lcom/xiaomi/hm/health/bt/profile/usernew/Gender;", "getGender", "()Lcom/xiaomi/hm/health/bt/profile/usernew/Gender;", "setGender", "(Lcom/xiaomi/hm/health/bt/profile/usernew/Gender;)V", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getHeight", "setHeight", "(Ljava/lang/Integer;)V", "e", "Ljava/lang/Float;", "getWeight", "setWeight", "(Ljava/lang/Float;)V", "f", "Ljava/lang/Long;", "getStepGoal", "setStepGoal", "(Ljava/lang/Long;)V", "g", "Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;", "getLocation", "()Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;", "setLocation", "(Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;)V", "h", "getUid", "setUid", "i", "Lcom/xiaomi/hm/health/bt/profile/usernew/BloodPressure;", "getBloodPressure", "()Lcom/xiaomi/hm/health/bt/profile/usernew/BloodPressure;", "setBloodPressure", "(Lcom/xiaomi/hm/health/bt/profile/usernew/BloodPressure;)V", z.j, "getRegisterRegion", "setRegisterRegion", hl.k, "Ljava/lang/Short;", "getIdc", "setIdc", "(Ljava/lang/Short;)V", "<init>", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/profile/usernew/Birth;Lcom/xiaomi/hm/health/bt/profile/usernew/Gender;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Long;Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;Ljava/lang/Long;Lcom/xiaomi/hm/health/bt/profile/usernew/BloodPressure;Ljava/lang/String;Ljava/lang/Short;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserInfoDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String nickName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Birth birth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Gender gender;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer height;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Float weight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Long stepGoal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private LocationExt location;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private Long uid;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private BloodPressure bloodPressure;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private String registerRegion;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private Short idc;

    public UserInfoDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public UserInfoDto(@Nullable String str, @Nullable Birth birth, @Nullable Gender gender, @Nullable Integer num, @Nullable Float f, @Nullable Long l, @Nullable LocationExt locationExt, @Nullable Long l2, @Nullable BloodPressure bloodPressure, @Nullable String str2, @Nullable Short sh) {
        this.nickName = str;
        this.birth = birth;
        this.gender = gender;
        this.height = num;
        this.weight = f;
        this.stepGoal = l;
        this.location = locationExt;
        this.uid = l2;
        this.bloodPressure = bloodPressure;
        this.registerRegion = str2;
        this.idc = sh;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRegisterRegion() {
        return this.registerRegion;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Short getIdc() {
        return this.idc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Birth getBirth() {
        return this.birth;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getStepGoal() {
        return this.stepGoal;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LocationExt getLocation() {
        return this.location;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getUid() {
        return this.uid;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BloodPressure getBloodPressure() {
        return this.bloodPressure;
    }

    @NotNull
    public final UserInfoDto copy(@Nullable String nickName, @Nullable Birth birth, @Nullable Gender gender, @Nullable Integer height, @Nullable Float weight, @Nullable Long stepGoal, @Nullable LocationExt location, @Nullable Long uid, @Nullable BloodPressure bloodPressure, @Nullable String registerRegion, @Nullable Short idc) {
        return new UserInfoDto(nickName, birth, gender, height, weight, stepGoal, location, uid, bloodPressure, registerRegion, idc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoDto)) {
            return false;
        }
        UserInfoDto userInfoDto = (UserInfoDto) other;
        return Intrinsics.areEqual(this.nickName, userInfoDto.nickName) && Intrinsics.areEqual(this.birth, userInfoDto.birth) && this.gender == userInfoDto.gender && Intrinsics.areEqual(this.height, userInfoDto.height) && Intrinsics.areEqual((Object) this.weight, (Object) userInfoDto.weight) && Intrinsics.areEqual(this.stepGoal, userInfoDto.stepGoal) && Intrinsics.areEqual(this.location, userInfoDto.location) && Intrinsics.areEqual(this.uid, userInfoDto.uid) && Intrinsics.areEqual(this.bloodPressure, userInfoDto.bloodPressure) && Intrinsics.areEqual(this.registerRegion, userInfoDto.registerRegion) && Intrinsics.areEqual(this.idc, userInfoDto.idc);
    }

    @Nullable
    public final Birth getBirth() {
        return this.birth;
    }

    @Nullable
    public final BloodPressure getBloodPressure() {
        return this.bloodPressure;
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Short getIdc() {
        return this.idc;
    }

    @Nullable
    public final LocationExt getLocation() {
        return this.location;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getRegisterRegion() {
        return this.registerRegion;
    }

    @Nullable
    public final Long getStepGoal() {
        return this.stepGoal;
    }

    @Nullable
    public final Long getUid() {
        return this.uid;
    }

    @Nullable
    public final Float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.nickName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Birth birth = this.birth;
        int iHashCode2 = (iHashCode + (birth == null ? 0 : birth.hashCode())) * 31;
        Gender gender = this.gender;
        int iHashCode3 = (iHashCode2 + (gender == null ? 0 : gender.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.weight;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Long l = this.stepGoal;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        LocationExt locationExt = this.location;
        int iHashCode7 = (iHashCode6 + (locationExt == null ? 0 : locationExt.hashCode())) * 31;
        Long l2 = this.uid;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BloodPressure bloodPressure = this.bloodPressure;
        int iHashCode9 = (iHashCode8 + (bloodPressure == null ? 0 : bloodPressure.hashCode())) * 31;
        String str2 = this.registerRegion;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Short sh = this.idc;
        return iHashCode10 + (sh != null ? sh.hashCode() : 0);
    }

    public final void setBirth(@Nullable Birth birth) {
        this.birth = birth;
    }

    public final void setBloodPressure(@Nullable BloodPressure bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public final void setGender(@Nullable Gender gender) {
        this.gender = gender;
    }

    public final void setHeight(@Nullable Integer num) {
        this.height = num;
    }

    public final void setIdc(@Nullable Short sh) {
        this.idc = sh;
    }

    public final void setLocation(@Nullable LocationExt locationExt) {
        this.location = locationExt;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setRegisterRegion(@Nullable String str) {
        this.registerRegion = str;
    }

    public final void setStepGoal(@Nullable Long l) {
        this.stepGoal = l;
    }

    public final void setUid(@Nullable Long l) {
        this.uid = l;
    }

    public final void setWeight(@Nullable Float f) {
        this.weight = f;
    }

    @NotNull
    public String toString() {
        return "UserInfoDto(nickName=" + ((Object) this.nickName) + ", birth=" + this.birth + ", gender=" + this.gender + ", height=" + this.height + ", weight=" + this.weight + ", stepGoal=" + this.stepGoal + ", location=" + this.location + ", uid=" + this.uid + ", bloodPressure=" + this.bloodPressure + ", registerRegion=" + ((Object) this.registerRegion) + ", idc=" + this.idc + ')';
    }

    public /* synthetic */ UserInfoDto(String str, Birth birth, Gender gender, Integer num, Float f, Long l, LocationExt locationExt, Long l2, BloodPressure bloodPressure, String str2, Short sh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : birth, (i & 4) != 0 ? null : gender, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : locationExt, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : bloodPressure, (i & 512) != 0 ? null : str2, (i & 1024) == 0 ? sh : null);
    }
}
