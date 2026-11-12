package com.xiaomi.fitness.account.user;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@TypeConverters({StringListCoverter.class})
@Entity(tableName = UserConstant.TAB_USER_PROFILE)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\bU\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\b\u0010]\u001a\u00020\u0003H\u0016J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\t\u0010c\u001a\u00020\bHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010e\u001a\u00020\fHÆ\u0003J\t\u0010f\u001a\u00020\fHÆ\u0003J\t\u0010g\u001a\u00020\fHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010j\u001a\u00020\fHÆ\u0003J\t\u0010k\u001a\u00020\fHÆ\u0003J\t\u0010l\u001a\u00020\fHÆ\u0003J\u0011\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\t\u0010n\u001a\u00020\fHÆ\u0003J\t\u0010o\u001a\u00020\bHÆ\u0003J\t\u0010p\u001a\u00020\u001bHÆ\u0003J\t\u0010q\u001a\u00020\bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 HÆ\u0003J\u0083\u0002\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 HÆ\u0001J\u0013\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020\fHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00106\"\u0004\b:\u00108R\u001e\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00106\"\u0004\b<\u00108R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u001e\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00106\"\u0004\bD\u00108R\u001e\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00106\"\u0004\bF\u00108R\u001e\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00106\"\u0004\bH\u00108R&\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010\u0018\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00106\"\u0004\bN\u00108R\u001e\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010.\"\u0004\bP\u00100R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010\u001c\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010.\"\u0004\bV\u00100R \u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010J\"\u0004\b\\\u0010L¨\u0006y"}, d2 = {"Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "", "name", "", "icon", "sex", MedicalIdSPContract.PREF_BIRTHDAY, "height", "", "weight", "region", "vo2Max", "", "maxHrm", "minHrm", "recordMaxHrm", "Lcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;", "source", "dailyCalGoal", "dailyStepGoal", "dailySleepGoal", "regularGoalList", "", "Lcom/xiaomi/fitness/account/user/DallyGoalItem;", "specialMark", "initialWeight", "initialTimestamp", "", "maximalMet", "wear_medal", "Lcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;", "dids", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;IIILcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;Ljava/lang/String;IIILjava/util/List;IFJFLcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getSex", "setSex", "getBirth", "setBirth", "getHeight", "()F", "setHeight", "(F)V", "getWeight", "setWeight", "getRegion", "setRegion", "getVo2Max", "()I", "setVo2Max", "(I)V", "getMaxHrm", "setMaxHrm", "getMinHrm", "setMinHrm", "getRecordMaxHrm", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;", "setRecordMaxHrm", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;)V", "getSource", "setSource", "getDailyCalGoal", "setDailyCalGoal", "getDailyStepGoal", "setDailyStepGoal", "getDailySleepGoal", "setDailySleepGoal", "getRegularGoalList", "()Ljava/util/List;", "setRegularGoalList", "(Ljava/util/List;)V", "getSpecialMark", "setSpecialMark", "getInitialWeight", "setInitialWeight", "getInitialTimestamp", "()J", "setInitialTimestamp", "(J)V", "getMaximalMet", "setMaximalMet", "getWear_medal", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;", "setWear_medal", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;)V", "getDids", "setDids", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserInfoProfile {

    @Nullable
    private String birth;

    @SerializedName("daily_cal_goal")
    @ColumnInfo(name = "daily_cal_goal")
    private int dailyCalGoal;

    @SerializedName("daily_sleep_goal")
    @ColumnInfo(name = "daily_sleep_goal")
    private int dailySleepGoal;

    @SerializedName("daily_step_goal")
    @ColumnInfo(name = "daily_step_goal")
    private int dailyStepGoal;

    @Nullable
    private List<String> dids;
    private float height;

    @Nullable
    private String icon;

    @ColumnInfo(name = "initial_timestamp")
    private long initialTimestamp;

    @ColumnInfo(name = "initial_weight")
    private float initialWeight;

    @SerializedName("max_hrm")
    @ColumnInfo(name = "max_hrm")
    private int maxHrm;

    @ColumnInfo(name = "maximal_met")
    private float maximalMet;

    @SerializedName("min_hrm")
    @ColumnInfo(name = "min_hrm")
    private int minHrm;

    @PrimaryKey
    @NotNull
    private String name;

    @SerializedName("record_max_hrm")
    @ColumnInfo(name = "record_max_hrm")
    @Nullable
    private UserProfile.RecordMaxHrm recordMaxHrm;

    @Nullable
    private String region;

    @SerializedName("regular_goal_list")
    @ColumnInfo(name = "regular_goal_list")
    @Nullable
    private List<DallyGoalItem> regularGoalList;

    @Nullable
    private String sex;

    @Nullable
    private String source;

    @ColumnInfo(name = "special_mark")
    private int specialMark;

    @SerializedName(FitnessPersistKey.Vo2Max)
    @ColumnInfo(name = FitnessPersistKey.Vo2Max)
    private int vo2Max;

    @SerializedName("wear_medal")
    @ColumnInfo(name = "wear_medal")
    @Nullable
    private UserProfile.UserWearMedal wear_medal;
    private float weight;

    public UserInfoProfile() {
        this(null, null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, null, 0, 0, 0, null, 0, 0.0f, 0L, 0.0f, null, null, 4194303, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMinHrm() {
        return this.minHrm;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final UserProfile.RecordMaxHrm getRecordMaxHrm() {
        return this.recordMaxHrm;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getDailyCalGoal() {
        return this.dailyCalGoal;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getDailyStepGoal() {
        return this.dailyStepGoal;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getDailySleepGoal() {
        return this.dailySleepGoal;
    }

    @Nullable
    public final List<DallyGoalItem> component16() {
        return this.regularGoalList;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getSpecialMark() {
        return this.specialMark;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final float getInitialWeight() {
        return this.initialWeight;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getInitialTimestamp() {
        return this.initialTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final float getMaximalMet() {
        return this.maximalMet;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final UserProfile.UserWearMedal getWear_medal() {
        return this.wear_medal;
    }

    @Nullable
    public final List<String> component22() {
        return this.dids;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBirth() {
        return this.birth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getVo2Max() {
        return this.vo2Max;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMaxHrm() {
        return this.maxHrm;
    }

    @NotNull
    public final UserInfoProfile copy(@NotNull String name, @Nullable String icon, @Nullable String sex, @Nullable String birth, float height, float weight, @Nullable String region, int vo2Max, int maxHrm, int minHrm, @Nullable UserProfile.RecordMaxHrm recordMaxHrm, @Nullable String source, int dailyCalGoal, int dailyStepGoal, int dailySleepGoal, @Nullable List<DallyGoalItem> regularGoalList, int specialMark, float initialWeight, long initialTimestamp, float maximalMet, @Nullable UserProfile.UserWearMedal wear_medal, @Nullable List<String> dids) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new UserInfoProfile(name, icon, sex, birth, height, weight, region, vo2Max, maxHrm, minHrm, recordMaxHrm, source, dailyCalGoal, dailyStepGoal, dailySleepGoal, regularGoalList, specialMark, initialWeight, initialTimestamp, maximalMet, wear_medal, dids);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoProfile)) {
            return false;
        }
        UserInfoProfile userInfoProfile = (UserInfoProfile) other;
        return Intrinsics.areEqual(this.name, userInfoProfile.name) && Intrinsics.areEqual(this.icon, userInfoProfile.icon) && Intrinsics.areEqual(this.sex, userInfoProfile.sex) && Intrinsics.areEqual(this.birth, userInfoProfile.birth) && Float.compare(this.height, userInfoProfile.height) == 0 && Float.compare(this.weight, userInfoProfile.weight) == 0 && Intrinsics.areEqual(this.region, userInfoProfile.region) && this.vo2Max == userInfoProfile.vo2Max && this.maxHrm == userInfoProfile.maxHrm && this.minHrm == userInfoProfile.minHrm && Intrinsics.areEqual(this.recordMaxHrm, userInfoProfile.recordMaxHrm) && Intrinsics.areEqual(this.source, userInfoProfile.source) && this.dailyCalGoal == userInfoProfile.dailyCalGoal && this.dailyStepGoal == userInfoProfile.dailyStepGoal && this.dailySleepGoal == userInfoProfile.dailySleepGoal && Intrinsics.areEqual(this.regularGoalList, userInfoProfile.regularGoalList) && this.specialMark == userInfoProfile.specialMark && Float.compare(this.initialWeight, userInfoProfile.initialWeight) == 0 && this.initialTimestamp == userInfoProfile.initialTimestamp && Float.compare(this.maximalMet, userInfoProfile.maximalMet) == 0 && Intrinsics.areEqual(this.wear_medal, userInfoProfile.wear_medal) && Intrinsics.areEqual(this.dids, userInfoProfile.dids);
    }

    @Nullable
    public final String getBirth() {
        return this.birth;
    }

    public final int getDailyCalGoal() {
        return this.dailyCalGoal;
    }

    public final int getDailySleepGoal() {
        return this.dailySleepGoal;
    }

    public final int getDailyStepGoal() {
        return this.dailyStepGoal;
    }

    @Nullable
    public final List<String> getDids() {
        return this.dids;
    }

    public final float getHeight() {
        return this.height;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final long getInitialTimestamp() {
        return this.initialTimestamp;
    }

    public final float getInitialWeight() {
        return this.initialWeight;
    }

    public final int getMaxHrm() {
        return this.maxHrm;
    }

    public final float getMaximalMet() {
        return this.maximalMet;
    }

    public final int getMinHrm() {
        return this.minHrm;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final UserProfile.RecordMaxHrm getRecordMaxHrm() {
        return this.recordMaxHrm;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final List<DallyGoalItem> getRegularGoalList() {
        return this.regularGoalList;
    }

    @Nullable
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final int getSpecialMark() {
        return this.specialMark;
    }

    public final int getVo2Max() {
        return this.vo2Max;
    }

    @Nullable
    public final UserProfile.UserWearMedal getWear_medal() {
        return this.wear_medal;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sex;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birth;
        int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.weight)) * 31;
        String str4 = this.region;
        int iHashCode5 = (((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.vo2Max)) * 31) + Integer.hashCode(this.maxHrm)) * 31) + Integer.hashCode(this.minHrm)) * 31;
        UserProfile.RecordMaxHrm recordMaxHrm = this.recordMaxHrm;
        int iHashCode6 = (iHashCode5 + (recordMaxHrm == null ? 0 : recordMaxHrm.hashCode())) * 31;
        String str5 = this.source;
        int iHashCode7 = (((((((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.dailyCalGoal)) * 31) + Integer.hashCode(this.dailyStepGoal)) * 31) + Integer.hashCode(this.dailySleepGoal)) * 31;
        List<DallyGoalItem> list = this.regularGoalList;
        int iHashCode8 = (((((((((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.specialMark)) * 31) + Float.hashCode(this.initialWeight)) * 31) + Long.hashCode(this.initialTimestamp)) * 31) + Float.hashCode(this.maximalMet)) * 31;
        UserProfile.UserWearMedal userWearMedal = this.wear_medal;
        int iHashCode9 = (iHashCode8 + (userWearMedal == null ? 0 : userWearMedal.hashCode())) * 31;
        List<String> list2 = this.dids;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setBirth(@Nullable String str) {
        this.birth = str;
    }

    public final void setDailyCalGoal(int i) {
        this.dailyCalGoal = i;
    }

    public final void setDailySleepGoal(int i) {
        this.dailySleepGoal = i;
    }

    public final void setDailyStepGoal(int i) {
        this.dailyStepGoal = i;
    }

    public final void setDids(@Nullable List<String> list) {
        this.dids = list;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setInitialTimestamp(long j) {
        this.initialTimestamp = j;
    }

    public final void setInitialWeight(float f) {
        this.initialWeight = f;
    }

    public final void setMaxHrm(int i) {
        this.maxHrm = i;
    }

    public final void setMaximalMet(float f) {
        this.maximalMet = f;
    }

    public final void setMinHrm(int i) {
        this.minHrm = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setRecordMaxHrm(@Nullable UserProfile.RecordMaxHrm recordMaxHrm) {
        this.recordMaxHrm = recordMaxHrm;
    }

    public final void setRegion(@Nullable String str) {
        this.region = str;
    }

    public final void setRegularGoalList(@Nullable List<DallyGoalItem> list) {
        this.regularGoalList = list;
    }

    public final void setSex(@Nullable String str) {
        this.sex = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setSpecialMark(int i) {
        this.specialMark = i;
    }

    public final void setVo2Max(int i) {
        this.vo2Max = i;
    }

    public final void setWear_medal(@Nullable UserProfile.UserWearMedal userWearMedal) {
        this.wear_medal = userWearMedal;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    @NotNull
    public String toString() {
        return "UserInfoProfile(icon=" + this.icon + ", sex=" + this.sex + ", birth=" + this.birth + ", height=" + this.height + ", weight=" + this.weight + ", region=" + this.region + ", vo2Max=" + this.vo2Max + ", maxHrm=" + this.maxHrm + ", minHrm=" + this.minHrm + ", recordMaxHrm=" + this.recordMaxHrm + ", source=" + this.source + ", dailyCalGoal=" + this.dailyCalGoal + ", dailyStepGoal=" + this.dailyStepGoal + ", dailySleepGoal=" + this.dailySleepGoal + ", regularGoalList=" + this.regularGoalList + ", specialMark=" + this.specialMark + ", initialWeight=" + this.initialWeight + ", initialTimestamp=" + this.initialTimestamp + ", maximalMet=" + this.maximalMet + ", dids=" + this.dids + ")";
    }

    public UserInfoProfile(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, float f, float f2, @Nullable String str4, int i, int i2, int i3, @Nullable UserProfile.RecordMaxHrm recordMaxHrm, @Nullable String str5, int i4, int i5, int i6, @Nullable List<DallyGoalItem> list, int i7, float f3, long j, float f4, @Nullable UserProfile.UserWearMedal userWearMedal, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.icon = str;
        this.sex = str2;
        this.birth = str3;
        this.height = f;
        this.weight = f2;
        this.region = str4;
        this.vo2Max = i;
        this.maxHrm = i2;
        this.minHrm = i3;
        this.recordMaxHrm = recordMaxHrm;
        this.source = str5;
        this.dailyCalGoal = i4;
        this.dailyStepGoal = i5;
        this.dailySleepGoal = i6;
        this.regularGoalList = list;
        this.specialMark = i7;
        this.initialWeight = f3;
        this.initialTimestamp = j;
        this.maximalMet = f4;
        this.wear_medal = userWearMedal;
        this.dids = list2;
    }

    public /* synthetic */ UserInfoProfile(String str, String str2, String str3, String str4, float f, float f2, String str5, int i, int i2, int i3, UserProfile.RecordMaxHrm recordMaxHrm, String str6, int i4, int i5, int i6, List list, int i7, float f3, long j, float f4, UserProfile.UserWearMedal userWearMedal, List list2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? 0.0f : f, (i8 & 32) != 0 ? 0.0f : f2, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? 0 : i, (i8 & 256) != 0 ? 0 : i2, (i8 & 512) != 0 ? 0 : i3, (i8 & 1024) != 0 ? null : recordMaxHrm, (i8 & 2048) != 0 ? null : str6, (i8 & 4096) != 0 ? 0 : i4, (i8 & 8192) != 0 ? 0 : i5, (i8 & 16384) != 0 ? 0 : i6, (i8 & 32768) != 0 ? null : list, (i8 & 65536) != 0 ? 0 : i7, (i8 & 131072) != 0 ? 0.0f : f3, (i8 & 262144) != 0 ? 0L : j, (i8 & 524288) != 0 ? 0.0f : f4, (i8 & EventRecurrence.TH) != 0 ? null : userWearMedal, (i8 & 2097152) != 0 ? null : list2);
    }
}
