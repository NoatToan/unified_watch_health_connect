package com.xiaomi.fit.data.common.constant;

import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J1\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/data/common/constant/FitnessDataChangedUtils;", "", "<init>", "()V", "TAG", "", "sendRecentDataChangedBroadcast", "", "changedSource", "Lcom/xiaomi/fit/data/common/constant/FitnessDataChangedSource;", "success", "", "errorCode", "", "extra", "Landroid/os/Bundle;", "syncInvalidVersion", "(Lcom/xiaomi/fit/data/common/constant/FitnessDataChangedSource;ZLjava/lang/Integer;Landroid/os/Bundle;Z)V", "getRecentDataChangedReason", "getErrorCode", "(Lcom/xiaomi/fit/data/common/constant/FitnessDataChangedSource;ZLjava/lang/Integer;Z)I", "sendHistoryDataChangedBroadcast", "dataChangedSource", "type", "Lcom/xiaomi/fit/data/common/constant/FitnessDataChangedType;", "getHistoryDataChangedAction", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDataChangedUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDataChangedUtils.kt\ncom/xiaomi/fit/data/common/constant/FitnessDataChangedUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
public final class FitnessDataChangedUtils {

    @NotNull
    public static final FitnessDataChangedUtils INSTANCE = new FitnessDataChangedUtils();

    @NotNull
    private static final String TAG = "FitnessDataChangedUtils";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FitnessDataChangedSource.values().length];
            try {
                iArr[FitnessDataChangedSource.ManualRecord.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FitnessDataChangedSource.DeviceSync.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FitnessDataChangedSource.CloudSync.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FitnessDataChangedType.values().length];
            try {
                iArr2[FitnessDataChangedType.Fitness.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FitnessDataChangedType.Sport.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private FitnessDataChangedUtils() {
    }

    private final int getErrorCode(FitnessDataChangedSource changedSource, boolean success, Integer errorCode, boolean syncInvalidVersion) {
        if (syncInvalidVersion) {
            return 7;
        }
        if (success) {
            return 0;
        }
        if (errorCode != null) {
            return errorCode.intValue();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[changedSource.ordinal()];
        if (i != 2) {
            return i != 3 ? -1 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int getErrorCode$default(FitnessDataChangedUtils fitnessDataChangedUtils, FitnessDataChangedSource fitnessDataChangedSource, boolean z, Integer num, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return fitnessDataChangedUtils.getErrorCode(fitnessDataChangedSource, z, num, z2);
    }

    private final String getHistoryDataChangedAction(FitnessDataChangedType type) {
        int i = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
        if (i == 1) {
            return FitnessDataConstants.BROADCAST_ACTION_HISTORY_FITNESS_DATA_CHANGED;
        }
        if (i == 2) {
            return FitnessDataConstants.BROADCAST_ACTION_HISTORY_SPORT_REPORT_CHANGED;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String getRecentDataChangedReason(FitnessDataChangedSource changedSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[changedSource.ordinal()];
        if (i == 1) {
            return FitnessDataConstants.REASON_MANUAL_RECORD;
        }
        if (i == 2) {
            return "device_sync";
        }
        if (i == 3) {
            return FitnessDataConstants.REASON_SERVER_SYNC;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void sendRecentDataChangedBroadcast$default(FitnessDataChangedUtils fitnessDataChangedUtils, FitnessDataChangedSource fitnessDataChangedSource, boolean z, Integer num, Bundle bundle, boolean z2, int i, Object obj) {
        Integer num2 = (i & 4) != 0 ? null : num;
        Bundle bundle2 = (i & 8) != 0 ? null : bundle;
        if ((i & 16) != 0) {
            z2 = false;
        }
        fitnessDataChangedUtils.sendRecentDataChangedBroadcast(fitnessDataChangedSource, z, num2, bundle2, z2);
    }

    public final void sendHistoryDataChangedBroadcast(@NotNull FitnessDataChangedSource dataChangedSource, @NotNull FitnessDataChangedType type) {
        Intrinsics.checkNotNullParameter(dataChangedSource, "dataChangedSource");
        Intrinsics.checkNotNullParameter(type, "type");
        FitnessLogUtils.i(TAG, "sendHistoryDataChangedBroadcast: " + (FitnessDataChangedType.Sport == type ? "sport data changed" : "fitness data changed"));
        String historyDataChangedAction = getHistoryDataChangedAction(type);
        String recentDataChangedReason = getRecentDataChangedReason(dataChangedSource);
        Intent intent = new Intent(historyDataChangedAction);
        intent.putExtra(FitnessDataConstants.EXTRA_DATA_CHANGED_REASON, recentDataChangedReason);
        intent.setPackage(ApplicationExtKt.getApplication().getPackageName());
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }

    public final void sendRecentDataChangedBroadcast(@NotNull FitnessDataChangedSource changedSource, boolean success, @Nullable Integer errorCode, @Nullable Bundle extra, boolean syncInvalidVersion) {
        Intrinsics.checkNotNullParameter(changedSource, "changedSource");
        String recentDataChangedReason = getRecentDataChangedReason(changedSource);
        int errorCode2 = getErrorCode(changedSource, success, errorCode, syncInvalidVersion);
        FitnessLogUtils.i(TAG, "sendRecentDataChangedBroadcast(" + recentDataChangedReason + "), success=" + success + ", code=" + errorCode2);
        Intent intent = new Intent("recent_data_changed_broadcast");
        intent.putExtra(FitnessDataConstants.EXTRA_DATA_CHANGED_REASON, recentDataChangedReason);
        intent.putExtra(FitnessDataConstants.EXTRA_BOOLEAN_RESULT, success);
        intent.putExtra("error_code", errorCode2);
        if (extra != null) {
            intent.putExtras(extra);
        }
        intent.setPackage(ApplicationExtKt.getApplication().getPackageName());
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }
}
