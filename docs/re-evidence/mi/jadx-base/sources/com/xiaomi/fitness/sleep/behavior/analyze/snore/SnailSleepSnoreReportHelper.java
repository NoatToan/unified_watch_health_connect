package com.xiaomi.fitness.sleep.behavior.analyze.snore;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sleep.behavior.AudioFileCacheConfig;
import com.xiaomi.fitness.sleep.disklrucache.AudioDiskLruCacheHelper;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnailSleepSnoreReportHelper;", "", "<init>", "()V", "isEmpty", "", "snoreList", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "dreamTalkList", "noiseList", "removeNotExitsItem", "ctx", "Landroid/content/Context;", "audioList", "", "parseAudioResultDir", "", "context", "report", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SleepSnoreReport;", "getAudioResultDir", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnailSleepSnoreReportHelper {

    @NotNull
    public static final SnailSleepSnoreReportHelper INSTANCE = new SnailSleepSnoreReportHelper();

    private SnailSleepSnoreReportHelper() {
    }

    private final String getAudioResultDir(Context context, List<AudioAttributes> audioList) {
        List<AudioAttributes> list = audioList;
        if (list != null && !list.isEmpty()) {
            Iterator<AudioAttributes> it = audioList.iterator();
            while (it.hasNext()) {
                String filePath = it.next().getFilePath(context);
                if (filePath != null) {
                    String parentDirFormPath = FileUtils.getParentDirFormPath(filePath);
                    if (!TextUtils.isEmpty(parentDirFormPath)) {
                        return parentDirFormPath;
                    }
                }
            }
        }
        return null;
    }

    public final boolean isEmpty(@Nullable List<AudioAttributes> snoreList, @Nullable List<AudioAttributes> dreamTalkList, @Nullable List<AudioAttributes> noiseList) {
        List<AudioAttributes> list;
        List<AudioAttributes> list2;
        List<AudioAttributes> list3 = snoreList;
        return (list3 == null || list3.isEmpty()) && ((list = dreamTalkList) == null || list.isEmpty()) && ((list2 = noiseList) == null || list2.isEmpty());
    }

    @Nullable
    public final String parseAudioResultDir(@NotNull Context context, @Nullable SleepSnoreReport report) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (report == null) {
            return null;
        }
        String mAudioResultDir = report.getMAudioResultDir();
        if (!TextUtils.isEmpty(mAudioResultDir)) {
            return mAudioResultDir;
        }
        String audioResultDir = getAudioResultDir(context, report.getSnoreList());
        if (TextUtils.isEmpty(audioResultDir)) {
            audioResultDir = getAudioResultDir(context, report.getDreamTalkList());
        }
        if (TextUtils.isEmpty(audioResultDir)) {
            audioResultDir = getAudioResultDir(context, report.getNoiseList());
        }
        report.setAudioResultDir(audioResultDir);
        return audioResultDir;
    }

    @NotNull
    public final List<AudioAttributes> removeNotExitsItem(@NotNull Context ctx, @Nullable List<AudioAttributes> audioList) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        List<AudioAttributes> list = audioList;
        if (list == null || list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ListIterator<AudioAttributes> listIterator = audioList.listIterator();
        String audioCacheDirAbsolutePath = AudioFileCacheConfig.INSTANCE.getAudioCacheDirAbsolutePath(ctx);
        while (listIterator.hasNext()) {
            String filePath = listIterator.next().getFilePath(ctx);
            AudioDiskLruCacheHelper audioDiskLruCacheHelper = AudioDiskLruCacheHelper.INSTANCE;
            Intrinsics.checkNotNull(filePath);
            if (!audioDiskLruCacheHelper.isCachedFileExits(audioCacheDirAbsolutePath, filePath)) {
                listIterator.remove();
            }
        }
        return audioList;
    }
}
