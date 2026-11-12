package com.xiaomi.fitness.sleep.behavior.analyze.snore;

import android.app.Application;
import android.content.Context;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.sleep.behavior.AudioFileCacheConfig;
import com.xiaomi.fitness.sleep.behavior.analyze.IReportGenerator;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.SleepSnoreReportGenerator;
import com.xiaomi.fitness.sleep.disklrucache.AudioDiskLruCacheHelper;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016JB\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\tH\u0002J \u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0003¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SleepSnoreReportGenerator;", "Lcom/xiaomi/fitness/sleep/behavior/analyze/IReportGenerator;", "<init>", "()V", "generateReport", "", "report", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "saveReport", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SleepSnoreReport;", "context", "Landroid/content/Context;", "snoreAudioProfile", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreAudioProfile;", "snoreList", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "noiseList", "dreamTalkList", "makeAudioFileCache", "doMakeAudioFileCache", "audioList", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSnoreReportGenerator implements IReportGenerator {

    @NotNull
    private static final String TAG = "SleepSnoreReportGenerator";

    private final void doMakeAudioFileCache(Context context, List<AudioAttributes> audioList) throws Throwable {
        List<AudioAttributes> list = audioList;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<AudioAttributes> it = audioList.iterator();
        while (it.hasNext()) {
            String filePath = it.next().getFilePath(context);
            String audioCacheDirAbsolutePath = AudioFileCacheConfig.INSTANCE.getAudioCacheDirAbsolutePath(context);
            if (filePath != null) {
                AudioDiskLruCacheHelper.INSTANCE.putCachedFile(audioCacheDirAbsolutePath, filePath);
                FileUtils.INSTANCE.deleteFile(filePath);
            }
        }
    }

    private final void makeAudioFileCache(final Context context, final SleepSnoreReport report) {
        ExecutorHelper.runInBackground(new Runnable() { // from class: hzm
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                SleepSnoreReportGenerator.makeAudioFileCache$lambda$0(report, this, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeAudioFileCache$lambda$0(SleepSnoreReport report, SleepSnoreReportGenerator this$0, Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(report, "$report");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.doMakeAudioFileCache(context, report.getSnoreList());
        this$0.doMakeAudioFileCache(context, report.getDreamTalkList());
        this$0.doMakeAudioFileCache(context, report.getNoiseList());
    }

    private final SleepSnoreReport saveReport(Context context, SnoreAudioProfile snoreAudioProfile, List<AudioAttributes> snoreList, List<AudioAttributes> noiseList, List<AudioAttributes> dreamTalkList) {
        Logger.i(TAG, "snore report empty: " + SnailSleepSnoreReportHelper.INSTANCE.isEmpty(snoreList, dreamTalkList, noiseList));
        SleepSnoreReport sleepSnoreReport = new SleepSnoreReport();
        sleepSnoreReport.setBackgroundVolume(snoreAudioProfile.getBackgroundVolume());
        sleepSnoreReport.setSnoreFrequency(snoreAudioProfile.getSnoreFrequency());
        sleepSnoreReport.setSnoreMaxVolume(snoreAudioProfile.getSnoreMaxVolume());
        sleepSnoreReport.setSnoreNumber(snoreAudioProfile.getSnoreNumber());
        sleepSnoreReport.setSnorePureTotalTime(snoreAudioProfile.getSnorePureTotalTime());
        sleepSnoreReport.setNoiseList(noiseList);
        sleepSnoreReport.setDreamTalkList(dreamTalkList);
        sleepSnoreReport.setSnoreList(snoreList);
        sleepSnoreReport.setTimestamp(TimeUtils.getBeginOfToday());
        makeAudioFileCache(context, sleepSnoreReport);
        return sleepSnoreReport;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.IReportGenerator
    public void generateReport(@Nullable SleepReport report) {
        Application application = ApplicationExtKt.getApplication();
        SnoreDataParser snoreDataParser = new SnoreDataParser(application);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        snoreDataParser.constructAudioData(application, arrayList, arrayList3, arrayList2);
        if (report != null) {
            report.setSnoreList(arrayList);
        }
        if (report != null) {
            report.setNoiseList(arrayList2);
        }
        if (report != null) {
            report.setDreamTalkList(arrayList3);
        }
        SleepSnoreReport sleepSnoreReportSaveReport = saveReport(application, snoreDataParser.getSnoreAudioProfile(), arrayList, arrayList2, arrayList3);
        if (report != null) {
            report.setSnorePureTotalTime(sleepSnoreReportSaveReport.getSnorePureTotalTime());
        }
    }
}
