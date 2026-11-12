package com.xiaomi.fitness.repo.sleep.utils;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.SnoreDreamTalkAudio;
import com.xiaomi.fit.fitness.export.utils.SleepAudioFileUtils;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.repo.sleep.SleepBiz;
import com.xiaomi.fitness.repo.sleep.utils.SleepAggregateUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/utils/SleepAggregateUtils;", "", "<init>", "()V", "TAG", "", "wearableDeviceManager", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "getWearableDeviceManager", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "wearableDeviceManager$delegate", "Lkotlin/Lazy;", "phoneSid", "localPhoneSid", "sleepBiz", "Lcom/xiaomi/fitness/repo/sleep/SleepBiz;", "aggregateDaySleep", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "segList", "chooseSleepByPriority", "curSleep", "nextSleep", "getSleepSnoreDreamTalkAudio", "", "sleepReport", "swapSleepAudioList", "getSleepPriority", "", "segReport", "PRIORITY_OTHERS", "PRIORITY_PHONE", "PRIORITY_BAND", "PRIORITY_WATCH", "PRIORITY_PILLOW", "PRIORITY_MANUAL", "sid", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepAggregateUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAggregateUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAggregateUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n1863#2,2:198\n*S KotlinDebug\n*F\n+ 1 SleepAggregateUtils.kt\ncom/xiaomi/fitness/repo/sleep/utils/SleepAggregateUtils\n*L\n30#1:198,2\n*E\n"})
public final class SleepAggregateUtils {
    private static final int PRIORITY_BAND = 2;
    private static final int PRIORITY_MANUAL = 5;
    private static final int PRIORITY_OTHERS = 0;
    private static final int PRIORITY_PHONE = 1;
    private static final int PRIORITY_PILLOW = 4;
    private static final int PRIORITY_WATCH = 3;

    @NotNull
    private static final String TAG = "SleepAggregateUtils";

    @NotNull
    private static String localPhoneSid;

    @NotNull
    private static String phoneSid;

    @NotNull
    private static final SleepBiz sleepBiz;

    @NotNull
    public static final SleepAggregateUtils INSTANCE = new SleepAggregateUtils();

    /* JADX INFO: renamed from: wearableDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy wearableDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kfm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepAggregateUtils.wearableDeviceManager_delegate$lambda$0();
        }
    });

    static {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        phoneSid = DeviceManagerExtKt.getInstance(companion).getCurrentPhoneSid();
        localPhoneSid = DeviceManagerExtKt.getInstance(companion).getLocalPhoneSid();
        sleepBiz = new SleepBiz();
    }

    private SleepAggregateUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int aggregateDaySleep$lambda$2(SleepSegmentReport sleepSegmentReport, SleepSegmentReport sleepSegmentReport2) {
        return (int) (sleepSegmentReport2.getWakeupTime() - sleepSegmentReport.getWakeupTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int aggregateDaySleep$lambda$3(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final SleepSegmentReport chooseSleepByPriority(SleepSegmentReport curSleep, SleepSegmentReport nextSleep) {
        int sleepPriority = getSleepPriority(curSleep);
        int sleepPriority2 = getSleepPriority(nextSleep);
        if (sleepPriority != sleepPriority2) {
            return sleepPriority > sleepPriority2 ? curSleep : nextSleep;
        }
        boolean zHasStageData = curSleep.hasStageData();
        boolean zHasStageData2 = nextSleep.hasStageData();
        if (zHasStageData && !zHasStageData2) {
            return curSleep;
        }
        if (zHasStageData2 && !zHasStageData) {
            return nextSleep;
        }
        if (curSleep.getSleepDuration() == nextSleep.getSleepDuration()) {
            return curSleep.getWakeupTime() >= nextSleep.getWakeupTime() ? curSleep : nextSleep;
        }
        return curSleep.getSleepDuration() > nextSleep.getSleepDuration() ? curSleep : nextSleep;
    }

    private final int getSleepPriority(SleepSegmentReport segReport) {
        return getSleepPriority(segReport.getSid());
    }

    private final void getSleepSnoreDreamTalkAudio(SleepSegmentReport sleepReport) {
        if (sleepReport.getSid() == null) {
            return;
        }
        if (TextUtils.equals(sleepReport.getSid(), phoneSid) || TextUtils.equals(sleepReport.getSid(), localPhoneSid)) {
            SleepAudioFileUtils.INSTANCE.getTheSnoreAudioList(sleepReport);
            sleepBiz.getSleepSnoreDecibelInfo(sleepReport);
        }
    }

    private final WearableDeviceManager getWearableDeviceManager() {
        return (WearableDeviceManager) wearableDeviceManager.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    private final void swapSleepAudioList(SleepSegmentReport curSleep, SleepSegmentReport nextSleep) {
        List<SnoreDreamTalkAudio> snoreAudioList = curSleep.getSnoreAudioList();
        if (snoreAudioList == null || snoreAudioList.isEmpty()) {
            curSleep.setSnoreAudioList(nextSleep.getSnoreAudioList());
        } else {
            nextSleep.setSnoreAudioList(curSleep.getSnoreAudioList());
        }
        List<SnoreDreamTalkAudio> dreamTalkAudioList = curSleep.getDreamTalkAudioList();
        if (dreamTalkAudioList == null || dreamTalkAudioList.isEmpty()) {
            curSleep.setDreamTalkAudioList(nextSleep.getDreamTalkAudioList());
        } else {
            nextSleep.setDreamTalkAudioList(curSleep.getDreamTalkAudioList());
        }
        if (curSleep.getSnoreDuration() != null) {
            Integer snoreDuration = curSleep.getSnoreDuration();
            Intrinsics.checkNotNull(snoreDuration);
            if (snoreDuration.intValue() > 0) {
                nextSleep.setSnoreDuration(curSleep.getSnoreDuration());
                nextSleep.setDreamTalkCount(curSleep.getDreamTalkCount());
            } else {
                curSleep.setSnoreDuration(nextSleep.getSnoreDuration());
                curSleep.setDreamTalkCount(nextSleep.getDreamTalkCount());
            }
        } else {
            curSleep.setSnoreDuration(nextSleep.getSnoreDuration());
            curSleep.setDreamTalkCount(nextSleep.getDreamTalkCount());
        }
        if (curSleep.getSnoreRecordInfo() != null) {
            nextSleep.setSnoreRecordInfo(curSleep.getSnoreRecordInfo());
        } else {
            curSleep.setSnoreRecordInfo(nextSleep.getSnoreRecordInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceManager wearableDeviceManager_delegate$lambda$0() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
    }

    @NotNull
    public final List<SleepSegmentReport> aggregateDaySleep(@NotNull List<SleepSegmentReport> segList) {
        Intrinsics.checkNotNullParameter(segList, "segList");
        if (segList.isEmpty()) {
            return segList;
        }
        phoneSid = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid();
        Iterator<T> it = segList.iterator();
        while (it.hasNext()) {
            INSTANCE.getSleepSnoreDreamTalkAudio((SleepSegmentReport) it.next());
        }
        if (segList.size() < 2) {
            return segList;
        }
        final Function2 function2 = new Function2() { // from class: ifm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepAggregateUtils.aggregateDaySleep$lambda$2((SleepSegmentReport) obj, (SleepSegmentReport) obj2));
            }
        };
        Collections.sort(segList, new Comparator() { // from class: jfm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepAggregateUtils.aggregateDaySleep$lambda$3(function2, obj, obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int size = segList.size();
        int i = 0;
        SleepSegmentReport sleepSegmentReport = segList.get(0);
        while (i < size) {
            i++;
            if (i < size) {
                SleepSegmentReport sleepSegmentReportChooseSleepByPriority = segList.get(i);
                if (sleepSegmentReport.getBedTime() < sleepSegmentReportChooseSleepByPriority.getWakeupTime()) {
                    swapSleepAudioList(sleepSegmentReport, sleepSegmentReportChooseSleepByPriority);
                    sleepSegmentReportChooseSleepByPriority = chooseSleepByPriority(sleepSegmentReport, sleepSegmentReportChooseSleepByPriority);
                } else {
                    arrayList.add(sleepSegmentReport);
                }
                sleepSegmentReport = sleepSegmentReportChooseSleepByPriority;
            } else {
                arrayList.add(sleepSegmentReport);
            }
        }
        return arrayList;
    }

    private final int getSleepPriority(String sid) {
        if (sid == null) {
            return 0;
        }
        if (TextUtils.equals(sid, "xiaomiwear_app_manually")) {
            return 5;
        }
        DeviceInfo<? extends Device> deviceInfoInAll = getWearableDeviceManager().getDeviceInfoInAll(sid);
        if (deviceInfoInAll == null) {
            return 0;
        }
        if (deviceInfoInAll.isPhone()) {
            return 1;
        }
        if (deviceInfoInAll.isBandType()) {
            return 2;
        }
        if (deviceInfoInAll.isWatch()) {
            return 3;
        }
        FitnessLogUtils.i(TAG, "unknown device: sid = " + sid);
        return 0;
    }
}
