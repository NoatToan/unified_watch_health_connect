package com.xiaomi.fitness.health.sleep.rhythm.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmProjectUserInfo;", "", "user_name", "", "phone_num", "extra_info", "keys", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/ProjectKey;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getUser_name", "()Ljava/lang/String;", "getPhone_num", "getExtra_info", "getKeys", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepRhythmProjectUserInfo {

    @SerializedName("extra_info")
    @Nullable
    private final String extra_info;

    @SerializedName("keys")
    @Nullable
    private final List<ProjectKey> keys;

    @SerializedName("phone_num")
    @NotNull
    private final String phone_num;

    @SerializedName("user_name")
    @NotNull
    private final String user_name;

    public SleepRhythmProjectUserInfo(@NotNull String user_name, @NotNull String phone_num, @Nullable String str, @Nullable List<ProjectKey> list) {
        Intrinsics.checkNotNullParameter(user_name, "user_name");
        Intrinsics.checkNotNullParameter(phone_num, "phone_num");
        this.user_name = user_name;
        this.phone_num = phone_num;
        this.extra_info = str;
        this.keys = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepRhythmProjectUserInfo copy$default(SleepRhythmProjectUserInfo sleepRhythmProjectUserInfo, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepRhythmProjectUserInfo.user_name;
        }
        if ((i & 2) != 0) {
            str2 = sleepRhythmProjectUserInfo.phone_num;
        }
        if ((i & 4) != 0) {
            str3 = sleepRhythmProjectUserInfo.extra_info;
        }
        if ((i & 8) != 0) {
            list = sleepRhythmProjectUserInfo.keys;
        }
        return sleepRhythmProjectUserInfo.copy(str, str2, str3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUser_name() {
        return this.user_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone_num() {
        return this.phone_num;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExtra_info() {
        return this.extra_info;
    }

    @Nullable
    public final List<ProjectKey> component4() {
        return this.keys;
    }

    @NotNull
    public final SleepRhythmProjectUserInfo copy(@NotNull String user_name, @NotNull String phone_num, @Nullable String extra_info, @Nullable List<ProjectKey> keys) {
        Intrinsics.checkNotNullParameter(user_name, "user_name");
        Intrinsics.checkNotNullParameter(phone_num, "phone_num");
        return new SleepRhythmProjectUserInfo(user_name, phone_num, extra_info, keys);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRhythmProjectUserInfo)) {
            return false;
        }
        SleepRhythmProjectUserInfo sleepRhythmProjectUserInfo = (SleepRhythmProjectUserInfo) other;
        return Intrinsics.areEqual(this.user_name, sleepRhythmProjectUserInfo.user_name) && Intrinsics.areEqual(this.phone_num, sleepRhythmProjectUserInfo.phone_num) && Intrinsics.areEqual(this.extra_info, sleepRhythmProjectUserInfo.extra_info) && Intrinsics.areEqual(this.keys, sleepRhythmProjectUserInfo.keys);
    }

    @Nullable
    public final String getExtra_info() {
        return this.extra_info;
    }

    @Nullable
    public final List<ProjectKey> getKeys() {
        return this.keys;
    }

    @NotNull
    public final String getPhone_num() {
        return this.phone_num;
    }

    @NotNull
    public final String getUser_name() {
        return this.user_name;
    }

    public int hashCode() {
        int iHashCode = ((this.user_name.hashCode() * 31) + this.phone_num.hashCode()) * 31;
        String str = this.extra_info;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ProjectKey> list = this.keys;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SleepRhythmProjectUserInfo(user_name=" + this.user_name + ", phone_num=" + this.phone_num + ", extra_info=" + this.extra_info + ", keys=" + this.keys + ")";
    }
}
