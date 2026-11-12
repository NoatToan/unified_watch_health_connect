package com.xiaomi.fitness.sport.utils;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JR\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/RecursionDataModel;", "", "wearMode", "", "operationType", "tempInt", DailyRecordKey.sportType, "launchSport", "Lkotlin/Function0;", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "<init>", "(IILjava/lang/Integer;ILkotlin/jvm/functions/Function0;Landroidx/fragment/app/FragmentActivity;)V", "getWearMode", "()I", "getOperationType", "setOperationType", "(I)V", "getTempInt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSportType", "getLaunchSport", "()Lkotlin/jvm/functions/Function0;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IILjava/lang/Integer;ILkotlin/jvm/functions/Function0;Landroidx/fragment/app/FragmentActivity;)Lcom/xiaomi/fitness/sport/utils/RecursionDataModel;", "equals", "", "other", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecursionDataModel {

    @NotNull
    private final FragmentActivity fragmentActivity;

    @NotNull
    private final Function0<Unit> launchSport;
    private int operationType;
    private final int sportType;

    @Nullable
    private final Integer tempInt;
    private final int wearMode;

    public RecursionDataModel(int i, int i2, @Nullable Integer num, int i3, @NotNull Function0<Unit> launchSport, @NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(launchSport, "launchSport");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.wearMode = i;
        this.operationType = i2;
        this.tempInt = num;
        this.sportType = i3;
        this.launchSport = launchSport;
        this.fragmentActivity = fragmentActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecursionDataModel copy$default(RecursionDataModel recursionDataModel, int i, int i2, Integer num, int i3, Function0 function0, FragmentActivity fragmentActivity, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = recursionDataModel.wearMode;
        }
        if ((i4 & 2) != 0) {
            i2 = recursionDataModel.operationType;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            num = recursionDataModel.tempInt;
        }
        Integer num2 = num;
        if ((i4 & 8) != 0) {
            i3 = recursionDataModel.sportType;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            function0 = recursionDataModel.launchSport;
        }
        Function0 function1 = function0;
        if ((i4 & 32) != 0) {
            fragmentActivity = recursionDataModel.fragmentActivity;
        }
        return recursionDataModel.copy(i, i5, num2, i6, function1, fragmentActivity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWearMode() {
        return this.wearMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOperationType() {
        return this.operationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTempInt() {
        return this.tempInt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    @NotNull
    public final Function0<Unit> component5() {
        return this.launchSport;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final RecursionDataModel copy(int wearMode, int operationType, @Nullable Integer tempInt, int sportType, @NotNull Function0<Unit> launchSport, @NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(launchSport, "launchSport");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        return new RecursionDataModel(wearMode, operationType, tempInt, sportType, launchSport, fragmentActivity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecursionDataModel)) {
            return false;
        }
        RecursionDataModel recursionDataModel = (RecursionDataModel) other;
        return this.wearMode == recursionDataModel.wearMode && this.operationType == recursionDataModel.operationType && Intrinsics.areEqual(this.tempInt, recursionDataModel.tempInt) && this.sportType == recursionDataModel.sportType && Intrinsics.areEqual(this.launchSport, recursionDataModel.launchSport) && Intrinsics.areEqual(this.fragmentActivity, recursionDataModel.fragmentActivity);
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final Function0<Unit> getLaunchSport() {
        return this.launchSport;
    }

    public final int getOperationType() {
        return this.operationType;
    }

    public final int getSportType() {
        return this.sportType;
    }

    @Nullable
    public final Integer getTempInt() {
        return this.tempInt;
    }

    public final int getWearMode() {
        return this.wearMode;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.wearMode) * 31) + Integer.hashCode(this.operationType)) * 31;
        Integer num = this.tempInt;
        return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.sportType)) * 31) + this.launchSport.hashCode()) * 31) + this.fragmentActivity.hashCode();
    }

    public final void setOperationType(int i) {
        this.operationType = i;
    }

    @NotNull
    public String toString() {
        return "RecursionDataModel(wearMode=" + this.wearMode + ", operationType=" + this.operationType + ", tempInt=" + this.tempInt + ", sportType=" + this.sportType + ", launchSport=" + this.launchSport + ", fragmentActivity=" + this.fragmentActivity + ")";
    }

    public /* synthetic */ RecursionDataModel(int i, int i2, Integer num, int i3, Function0 function0, FragmentActivity fragmentActivity, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? 1 : i2, num, i3, function0, fragmentActivity);
    }
}
