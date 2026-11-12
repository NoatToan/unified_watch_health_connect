package com.xiaomi.fitness.detail.model;

import com.xiaomi.fit.data.common.data.sport.GroupSportRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/detail/model/GroupInfoViewModel;", "", "infoName", "", "time", "", "thirdColumnValue", "calories", "<init>", "(Ljava/lang/String;III)V", "getInfoName", "()Ljava/lang/String;", "setInfoName", "(Ljava/lang/String;)V", "getTime", "()I", "setTime", "(I)V", "getThirdColumnValue", "setThirdColumnValue", "getCalories", "setCalories", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupInfoViewModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int calories;

    @NotNull
    private String infoName;
    private int thirdColumnValue;
    private int time;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/detail/model/GroupInfoViewModel$Companion;", "", "<init>", "()V", "createGroupInfoSportModel", "Lcom/xiaomi/fitness/detail/model/GroupInfoViewModel;", "infoName", "", DailyRecordKey.sportType, "", "sportInfo", "Lcom/xiaomi/fit/data/common/data/sport/GroupSportRecord;", "createGroupInfoRestModel", "restInfo", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GroupInfoViewModel createGroupInfoRestModel(@NotNull String infoName, int sportType, @NotNull GroupSportRecord restInfo) {
            Intrinsics.checkNotNullParameter(infoName, "infoName");
            Intrinsics.checkNotNullParameter(restInfo, "restInfo");
            Integer avgHr = restInfo.getAvgHr();
            int iIntValue = avgHr != null ? avgHr.intValue() : 0;
            if (sportType == 13 || sportType == 14) {
                iIntValue = -1;
            }
            int i = iIntValue;
            int duration = restInfo.getDuration();
            Integer calories = restInfo.getCalories();
            return new GroupInfoViewModel(infoName, duration, i, calories != null ? calories.intValue() : 0, null);
        }

        @NotNull
        public final GroupInfoViewModel createGroupInfoSportModel(@NotNull String infoName, int sportType, @NotNull GroupSportRecord sportInfo) {
            Intrinsics.checkNotNullParameter(infoName, "infoName");
            Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
            Integer avgHr = sportInfo.getAvgHr();
            int iIntValue = avgHr != null ? avgHr.intValue() : 0;
            if (sportType == 13 || sportType == 14) {
                Integer count = sportInfo.getCount();
                iIntValue = count != null ? count.intValue() : 0;
            }
            int i = iIntValue;
            int duration = sportInfo.getDuration();
            Integer calories = sportInfo.getCalories();
            return new GroupInfoViewModel(infoName, duration, i, calories != null ? calories.intValue() : 0, null);
        }
    }

    public /* synthetic */ GroupInfoViewModel(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3);
    }

    public final int getCalories() {
        return this.calories;
    }

    @NotNull
    public final String getInfoName() {
        return this.infoName;
    }

    public final int getThirdColumnValue() {
        return this.thirdColumnValue;
    }

    public final int getTime() {
        return this.time;
    }

    public final void setCalories(int i) {
        this.calories = i;
    }

    public final void setInfoName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.infoName = str;
    }

    public final void setThirdColumnValue(int i) {
        this.thirdColumnValue = i;
    }

    public final void setTime(int i) {
        this.time = i;
    }

    private GroupInfoViewModel(String str, int i, int i2, int i3) {
        this.infoName = str;
        this.time = i;
        this.thirdColumnValue = i2;
        this.calories = i3;
    }
}
