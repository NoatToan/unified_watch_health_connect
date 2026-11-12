package com.xiaomi.fitness.blood_sugar;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.wearable.core.DeviceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001f2\u00020\u0001:\u0004\u001f !\"J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH&¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager;", "Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice;", "setGlucoseCallback", "", "callback", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$GlucoseCallback;", "getDeviceActiveTime", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$DeviceTime;", "goBloodSugarDevice", "context", "Landroid/content/Context;", "updateGlucoseUploadState", "data", "Lcom/xiaomi/fitness/blood_sugar/GlucoseValue;", "list", "", "getAllUnSyncGlucose", "getGlucoseListAllByTimePeriod", "startTime", "", "endTime", "setStepCallback", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$StepCallback;", "rebind", "mac", "", "getBloodSugarDeviceApi", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarDeviceApi;", "deviceInfo", "Lcom/xiaomi/wearable/core/DeviceInfo;", "Companion", "GlucoseCallback", "StepCallback", "DeviceTime", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BloodSugarManager extends IBloodSugarDevice {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$Companion;", "", "<init>", "()V", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$DeviceTime;", "", "activeExpireTime", "", "activeTime", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getActiveExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getActiveTime", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$DeviceTime;", "equals", "", "other", "hashCode", "", "toString", "", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceTime {

        @Nullable
        private final Long activeExpireTime;

        @Nullable
        private final Long activeTime;

        public DeviceTime(@Nullable Long l, @Nullable Long l2) {
            this.activeExpireTime = l;
            this.activeTime = l2;
        }

        public static /* synthetic */ DeviceTime copy$default(DeviceTime deviceTime, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = deviceTime.activeExpireTime;
            }
            if ((i & 2) != 0) {
                l2 = deviceTime.activeTime;
            }
            return deviceTime.copy(l, l2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getActiveExpireTime() {
            return this.activeExpireTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getActiveTime() {
            return this.activeTime;
        }

        @NotNull
        public final DeviceTime copy(@Nullable Long activeExpireTime, @Nullable Long activeTime) {
            return new DeviceTime(activeExpireTime, activeTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceTime)) {
                return false;
            }
            DeviceTime deviceTime = (DeviceTime) other;
            return Intrinsics.areEqual(this.activeExpireTime, deviceTime.activeExpireTime) && Intrinsics.areEqual(this.activeTime, deviceTime.activeTime);
        }

        @Nullable
        public final Long getActiveExpireTime() {
            return this.activeExpireTime;
        }

        @Nullable
        public final Long getActiveTime() {
            return this.activeTime;
        }

        public int hashCode() {
            Long l = this.activeExpireTime;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.activeTime;
            return iHashCode + (l2 != null ? l2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DeviceTime(activeExpireTime=" + this.activeExpireTime + ", activeTime=" + this.activeTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$GlucoseCallback;", "", "onResultGlucoseData", "", "glucoseValue", "Lcom/xiaomi/fitness/blood_sugar/GlucoseValue;", "onResultGlucoseHistoryData", "list", "", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface GlucoseCallback {
        void onResultGlucoseData(@NotNull GlucoseValue glucoseValue);

        void onResultGlucoseHistoryData(@NotNull List<GlucoseValue> list);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$StepCallback;", "", "onUpgradeForce", "", "changeLog", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "result", "onDownload", "onBind", "onPushOta", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface StepCallback {
        void onBind();

        void onDownload(boolean result);

        void onPushOta();

        void onUpgradeForce(@NotNull String changeLog, @NotNull Function1<? super Boolean, Unit> callback);
    }

    void getAllUnSyncGlucose();

    @NotNull
    BloodSugarDeviceApi getBloodSugarDeviceApi(@NotNull DeviceInfo deviceInfo);

    @NotNull
    DeviceTime getDeviceActiveTime();

    void getGlucoseListAllByTimePeriod(long startTime, long endTime);

    void goBloodSugarDevice(@NotNull Context context);

    void rebind(@NotNull String mac);

    void setGlucoseCallback(@NotNull GlucoseCallback callback);

    void setStepCallback(@NotNull StepCallback listener);

    void updateGlucoseUploadState(@NotNull GlucoseValue data);

    void updateGlucoseUploadState(@NotNull List<GlucoseValue> list);
}
