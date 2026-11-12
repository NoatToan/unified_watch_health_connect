package com.huami.feedback.log.utils;

import com.huami.feedback.log.utils.LogFileUtilsKt;
import com.huami.feedback.sync.api.DeviceLogSyncError;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000\u001a\u0010\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010\u001a\n\u0010\u0014\u001a\u00020\u0010*\u00020\u000e¨\u0006\u0015"}, d2 = {"", "logRootFileDir", "regex", "", "Ljava/io/File;", "findFileByPatten", "(Ljava/lang/String;Ljava/lang/String;)[Ljava/io/File;", "sourceName", "", "deleteDeviceLogByDeviceSource", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "error", "Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "convertError", "Lcom/huami/feedback/sync/api/device/DeviceType;", "feedbackDeviceType", "", "hmDeviceType", "", "isSameDevice", "asHmDeviceType", "feedback-sync-device-log-impl_release"}, k = 2, mv = {1, 5, 1})
public final class LogFileUtilsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceType.values().length];
            iArr[DeviceType.BAND.ordinal()] = 1;
            iArr[DeviceType.WATCH.ordinal()] = 2;
            iArr[DeviceType.EAR_BUD.ordinal()] = 3;
            iArr[DeviceType.HEAD_SET.ordinal()] = 4;
            iArr[DeviceType.HEARING_AID.ordinal()] = 5;
            iArr[DeviceType.SCALE.ordinal()] = 6;
            iArr[DeviceType.TREADMILL.ordinal()] = 7;
            iArr[DeviceType.SMART_WATCH.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceError a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceError hMDeviceError) {
            super(0);
            this.a = hMDeviceError;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            HMDeviceError hMDeviceError = this.a;
            return Intrinsics.stringPlus("Ble sync log error : ", hMDeviceError == null ? null : Integer.valueOf(hMDeviceError.getError()));
        }
    }

    public static final int asHmDeviceType(@NotNull DeviceType deviceType) {
        switch (WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()]) {
            case 1:
                return HMDeviceType.MILI.getValue();
            case 2:
                return HMDeviceType.MILI.getValue();
            case 3:
                return HMDeviceType.EARBUD.getValue();
            case 4:
                return HMDeviceType.HEADSET.getValue();
            case 5:
                return HMDeviceType.HEARING_AID.getValue();
            case 6:
                return HMDeviceType.WEIGHT.getValue();
            case 7:
                return HMDeviceType.TREADMILL.getValue();
            case 8:
                return HMDeviceType.WATCH.getValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Pattern pattern, File file) {
        return pattern.matcher(file.getName()).matches();
    }

    @NotNull
    public static final DeviceLogSyncError convertError(@Nullable HMDeviceError hMDeviceError) {
        HMLog.warn$default("feedback", null, new a(hMDeviceError), 2, null);
        Integer numValueOf = hMDeviceError != null ? Integer.valueOf(hMDeviceError.getError()) : null;
        if (numValueOf == null || numValueOf.intValue() == 0) {
            return DeviceLogSyncError.SYNC_SUCCESS;
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return DeviceLogSyncError.SYNC_SUCCESS;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            return DeviceLogSyncError.NO_CONNECTION;
        }
        if (numValueOf != null && numValueOf.intValue() == 6) {
            return DeviceLogSyncError.ERROR_MUSIC_ALIVE;
        }
        if (numValueOf != null && numValueOf.intValue() == 7) {
            return DeviceLogSyncError.ERROR_SPEECH_ALIVE;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return DeviceLogSyncError.ERROR_DATA_PACKAGE;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return DeviceLogSyncError.UNKNOWN_COMMAND;
        }
        if (numValueOf != null && numValueOf.intValue() == 8) {
            return DeviceLogSyncError.VERIFY_FAILED;
        }
        return (numValueOf != null && numValueOf.intValue() == 5) ? DeviceLogSyncError.BUSY : DeviceLogSyncError.UNKNOWN;
    }

    public static final void deleteDeviceLogByDeviceSource(@NotNull String str, @NotNull String str2) {
        File[] fileArrFindFileByPatten = findFileByPatten(str, ".*" + str2 + ".*");
        if (fileArrFindFileByPatten == null) {
            return;
        }
        for (File file : fileArrFindFileByPatten) {
            if (file != null) {
                file.delete();
            }
        }
    }

    @Nullable
    public static final File[] findFileByPatten(@NotNull String str, @NotNull String str2) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            final Pattern patternCompile = Pattern.compile(str2);
            objM3845constructorimpl = Result.m3845constructorimpl(new File(str).listFiles(new FileFilter() { // from class: sr4
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return LogFileUtilsKt.b(patternCompile, file);
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (File[]) objM3845constructorimpl;
    }

    public static final boolean isSameDevice(@NotNull DeviceType deviceType, int i) {
        if (i == HMDeviceType.MILI.getValue()) {
            if (deviceType == DeviceType.BAND || deviceType == DeviceType.WATCH) {
                return true;
            }
        } else if (i == HMDeviceType.EARBUD.getValue()) {
            if (deviceType == DeviceType.EAR_BUD) {
                return true;
            }
        } else if (i == HMDeviceType.HEADSET.getValue() && deviceType == DeviceType.HEAD_SET) {
            return true;
        }
        return false;
    }
}
