package com.xiaomi.hm.health.sleep.writeback;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.profile.channel.module.sleep.DataFlag;
import com.huami.bluetooth.profile.channel.module.sleep.DataType;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J6\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/sleep/writeback/SleepDataConvert;", "", "", "date", "Ljava/util/TimeZone;", "timeZone", "", "getUpdateTimestamp", "", "getBoundDeviceSyncTime", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "flag", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "type", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "renderIfSupport", "(Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "originalIndex", "transmitByZeroDawn", "Lcom/xiaomi/hm/health/sleep/writeback/SleepSummary;", "sleepSummary", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "convert", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepDataConvert {
    private static final int BASE_INDEX = 1440;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.writeback.SleepDataConvert$renderIfSupport$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean $isSupport;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z) {
            super(0);
            this.$isSupport = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "renderIfSupport = " + this.$isSupport;
        }
    }

    private final long getBoundDeviceSyncTime() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
        return HMDeviceManager.getInstance().getBoundDeviceSyncTime(device == null ? null : device.getDeviceType()).getTimeInMillis();
    }

    private final int getUpdateTimestamp(String date, TimeZone timeZone) {
        long timeInMillis;
        if (TimeExtKt.isToday$default(date, null, Locale.CHINA, 1, null)) {
            timeInMillis = getBoundDeviceSyncTime();
        } else {
            Calendar calendarCurrentDayEnd$default = TimeExtKt.currentDayEnd$default(date, null, null, timeZone, 3, null);
            timeInMillis = calendarCurrentDayEnd$default == null ? 0L : calendarCurrentDayEnd$default.getTimeInMillis();
        }
        return (int) (timeInMillis / ((long) 1000));
    }

    private final <T> T renderIfSupport(DataFlag flag, DataType type, Function0<? extends T> block) {
        boolean zIsSupport = flag.isSupport(type);
        HMLog.info("WriteSleepBack", new AnonymousClass1(zIsSupport));
        if (zIsSupport) {
            return block.invoke();
        }
        return null;
    }

    private final int transmitByZeroDawn(final int originalIndex) {
        HMLog.info("WriteSleepBack", new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.writeback.SleepDataConvert.transmitByZeroDawn.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "transmitByZeroDawn originalIndex = " + originalIndex;
            }
        });
        return originalIndex + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN;
    }

    @Nullable
    public final SleepData convert(@NotNull String date, @Nullable SleepSummary sleepSummary, @NotNull DataFlag flag) {
        Sleep slp;
        List<SleepStage> stage;
        ArrayList arrayList = null;
        if (sleepSummary == null || (slp = sleepSummary.getSlp()) == null || slp.getEd() - slp.getSt() <= 0) {
            return null;
        }
        TimeZone timeZone = SleepTimeExtKt.getTimeZone(sleepSummary.getTz());
        int updateTimestamp = getUpdateTimestamp(date, timeZone);
        long j = 1000;
        int sleepMinutes = SleepTimeExtKt.getSleepMinutes(slp.getSt() * j, timeZone);
        int sleepMinutes2 = SleepTimeExtKt.getSleepMinutes(slp.getEd() * j, timeZone);
        int duration$app_midongPlayRelease = slp.getDuration$app_midongPlayRelease();
        boolean zIsSupport = flag.isSupport(DataType.SleepScore.INSTANCE);
        HMLog.info("WriteSleepBack", new AnonymousClass1(zIsSupport));
        Integer numValueOf = zIsSupport ? Integer.valueOf(slp.getSs()) : null;
        boolean zIsSupport2 = flag.isSupport(DataType.RestingHr.INSTANCE);
        HMLog.info("WriteSleepBack", new AnonymousClass1(zIsSupport2));
        Integer numValueOf2 = zIsSupport2 ? Integer.valueOf(slp.getRhr()) : null;
        boolean zIsSupport3 = flag.isSupport(DataType.SleepStage.INSTANCE);
        HMLog.info("WriteSleepBack", new AnonymousClass1(zIsSupport3));
        if (zIsSupport3 && (stage = slp.getStage()) != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stage, 10));
            for (SleepStage sleepStage : stage) {
                arrayList.add(new com.huami.bluetooth.profile.channel.module.sleep.SleepStage(transmitByZeroDawn(sleepStage.getStart()), transmitByZeroDawn(sleepStage.getStop()), sleepStage.getMode()));
            }
        }
        return new SleepData(date, updateTimestamp, timeZone, flag, sleepMinutes, sleepMinutes2, duration$app_midongPlayRelease, numValueOf, numValueOf2, arrayList);
    }
}
