package com.xiaomi.fit.fitness.export.utils;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.SnoreDreamTalkAudio;
import com.xiaomi.fit.fitness.export.sleepsnore.SleepSnoreAudioAutoDeleteSP;
import com.xiaomi.fit.fitness.export.utils.SleepAudioFileUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u0005J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\u0016\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tJ\u001e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\tJ\u0016\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010'H\u0002J\u0018\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fit/fitness/export/utils/SleepAudioFileUtils;", "", "<init>", "()V", "TAG", "", "SNAIL_COLLECTOR_AUDIO_DIR_NAME", "AUDIO_COLLECTOR_DIR", "VIDEO_FILE_MAX_BYTE_SIZE", "", "TYPE_DREAM_TALK", "TYPE_SNORE", "TYPE_NOISE", "getTheSleepAudioFile", "Ljava/io/File;", "audio", "Lcom/xiaomi/fit/fitness/export/data/item/SnoreDreamTalkAudio;", "getTheSnoreAudioList", "", "segReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "getSleepAudioFilePath", "wakeupTime", "", "tzIn15Min", "getSleepAudioFileName", "parseSleepAudioFileName", "fileName", "getAudioRootPath", "getTheAudioFilePath", "getAudioFileName", "audioStartTime", "audioDuration", "type", "checkSwitchAndDeleteAudioIfOver", "", "deleteAudioFileIfOver", "maxSize", "getAllAudioFileTimeDir", "", "deleteAudioFileOverSizeOneDir", "audioFileDir", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepAudioFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAudioFileUtils.kt\ncom/xiaomi/fit/fitness/export/utils/SleepAudioFileUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 CharSequence.kt\nandroidx/core/text/CharSequenceKt\n*L\n1#1,214:1\n216#2,2:215\n216#2,2:224\n13402#3:217\n13402#3:218\n13403#3:220\n13403#3:221\n13402#3,2:222\n28#4:219\n*S KotlinDebug\n*F\n+ 1 SleepAudioFileUtils.kt\ncom/xiaomi/fit/fitness/export/utils/SleepAudioFileUtils\n*L\n144#1:215,2\n196#1:224,2\n169#1:217\n170#1:218\n170#1:220\n169#1:221\n185#1:222,2\n172#1:219\n*E\n"})
public final class SleepAudioFileUtils {

    @NotNull
    private static final String AUDIO_COLLECTOR_DIR = "Audio";

    @NotNull
    public static final SleepAudioFileUtils INSTANCE = new SleepAudioFileUtils();

    @NotNull
    private static final String SNAIL_COLLECTOR_AUDIO_DIR_NAME = "SnailCollector";

    @NotNull
    private static final String TAG = "SleepAudioFileUtils";
    public static final int TYPE_DREAM_TALK = 0;
    public static final int TYPE_NOISE = 2;
    public static final int TYPE_SNORE = 1;
    private static final int VIDEO_FILE_MAX_BYTE_SIZE = 104857600;

    private SleepAudioFileUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deleteAudioFileIfOver$lambda$2(Long l, Long l2) {
        long jLongValue = l2.longValue();
        Intrinsics.checkNotNull(l);
        return (int) (jLongValue - l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deleteAudioFileIfOver$lambda$3(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c A[PHI: r2
      0x006c: PHI (r2v5 int) = (r2v2 int), (r2v3 int) binds: [B:17:0x006a, B:20:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean deleteAudioFileOverSizeOneDir(File audioFileDir, int maxSize) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        File[] fileArrListFiles = audioFileDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                SleepAudioFileUtils sleepAudioFileUtils = INSTANCE;
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                SnoreDreamTalkAudio sleepAudioFileName = sleepAudioFileUtils.parseSleepAudioFileName(name);
                if (sleepAudioFileName != null) {
                    linkedHashMap.put(Long.valueOf(sleepAudioFileName.getBeginTime()), file);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        final Function2 function2 = new Function2() { // from class: lhm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepAudioFileUtils.deleteAudioFileOverSizeOneDir$lambda$9((Long) obj, (Long) obj2));
            }
        };
        SortedMap sortedMap = MapsKt__MapsJVMKt.toSortedMap(linkedHashMap, new Comparator() { // from class: mhm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepAudioFileUtils.deleteAudioFileOverSizeOneDir$lambda$10(function2, obj, obj2);
            }
        });
        linkedHashMap.clear();
        Iterator it = sortedMap.entrySet().iterator();
        boolean z2 = false;
        int normalFileByteSize = 0;
        while (it.hasNext()) {
            File file2 = (File) ((Map.Entry) it.next()).getValue();
            if (normalFileByteSize >= maxSize) {
                z = true;
            } else {
                FileUtils fileUtils = FileUtils.INSTANCE;
                Intrinsics.checkNotNull(file2);
                normalFileByteSize += fileUtils.getNormalFileByteSize(file2);
                FitnessLogUtils.d(TAG, "getNormalFileByteSize(" + file2.getPath() + ", " + normalFileByteSize + ")");
                if (normalFileByteSize > maxSize) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                FitnessLogUtils.i(TAG, "deleteAudioFileOverSizeOneDir:dataSize(" + normalFileByteSize + "), delete (" + file2 + ")");
                file2.delete();
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deleteAudioFileOverSizeOneDir$lambda$10(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deleteAudioFileOverSizeOneDir$lambda$9(Long l, Long l2) {
        long jLongValue = l2.longValue();
        Intrinsics.checkNotNull(l);
        return (int) (jLongValue - l.longValue());
    }

    private final Map<Long, File> getAllAudioFileTimeDir() {
        File[] fileArrListFiles;
        File file = new File(getAudioRootPath());
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (File file2 : fileArrListFiles) {
            File[] fileArrListFiles2 = file2.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file3 : fileArrListFiles2) {
                    FitnessLogUtils.d(TAG, "getAllAudioFileTimeDir(" + file3.getPath() + ")");
                    String name = file3.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (TextUtils.isDigitsOnly(name)) {
                        String name2 = file3.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        linkedHashMap.put(Long.valueOf(Long.parseLong(name2)), file3);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private final String getAudioRootPath() {
        String filesPath = FileUtils.getFilesPath(ApplicationExtKt.getApplication());
        String str = File.separator;
        return filesPath + str + "SnailCollector" + str + AUDIO_COLLECTOR_DIR;
    }

    private final String getSleepAudioFileName(SnoreDreamTalkAudio audio) {
        return getAudioFileName(audio.getBeginTime(), audio.getDuration(), audio.getType());
    }

    private final File getSleepAudioFilePath(long wakeupTime, int tzIn15Min) {
        return getTheAudioFilePath(wakeupTime, tzIn15Min);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getTheSnoreAudioList$lambda$0(SnoreDreamTalkAudio snoreDreamTalkAudio, SnoreDreamTalkAudio snoreDreamTalkAudio2) {
        return (int) (snoreDreamTalkAudio2.getBeginTime() - snoreDreamTalkAudio.getBeginTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getTheSnoreAudioList$lambda$1(SnoreDreamTalkAudio snoreDreamTalkAudio, SnoreDreamTalkAudio snoreDreamTalkAudio2) {
        return (int) (snoreDreamTalkAudio2.getBeginTime() - snoreDreamTalkAudio.getBeginTime());
    }

    public final boolean checkSwitchAndDeleteAudioIfOver() {
        if (SleepSnoreAudioAutoDeleteSP.INSTANCE.getAUTO_CLEAN_AUDIO_FILE()) {
            return deleteAudioFileIfOver(VIDEO_FILE_MAX_BYTE_SIZE);
        }
        FitnessLogUtils.i(TAG, "checkSwitchAndDeleteAudioIfOver：switch is off");
        return false;
    }

    public final boolean deleteAudioFileIfOver(int maxSize) {
        Map<Long, File> allAudioFileTimeDir = getAllAudioFileTimeDir();
        FitnessLogUtils.i(TAG, "deleteAudioFileIfOver: maxSize(" + maxSize + "), file size(" + (allAudioFileTimeDir != null ? Integer.valueOf(allAudioFileTimeDir.size()) : null) + ")");
        boolean zDeleteAudioFileOverSizeOneDir = false;
        if (allAudioFileTimeDir != null && !allAudioFileTimeDir.isEmpty()) {
            final Function2 function2 = new Function2() { // from class: jhm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(SleepAudioFileUtils.deleteAudioFileIfOver$lambda$2((Long) obj, (Long) obj2));
                }
            };
            SortedMap sortedMap = MapsKt__MapsJVMKt.toSortedMap(allAudioFileTimeDir, new Comparator() { // from class: khm
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SleepAudioFileUtils.deleteAudioFileIfOver$lambda$3(function2, obj, obj2);
                }
            });
            allAudioFileTimeDir.clear();
            int i = 0;
            for (Map.Entry entry : sortedMap.entrySet()) {
                File file = (File) entry.getValue();
                if (i >= maxSize) {
                    FitnessLogUtils.i(TAG, "deleteAudioFileOverSize：delete " + file + ")");
                    Intrinsics.checkNotNull(file);
                    FilesKt__UtilsKt.deleteRecursively(file);
                    zDeleteAudioFileOverSizeOneDir = true;
                } else {
                    FileUtils fileUtils = FileUtils.INSTANCE;
                    Object value = entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                    int filesByteSize = fileUtils.getFilesByteSize((File) value) + i;
                    if (filesByteSize > maxSize) {
                        SleepAudioFileUtils sleepAudioFileUtils = INSTANCE;
                        Intrinsics.checkNotNull(file);
                        zDeleteAudioFileOverSizeOneDir |= sleepAudioFileUtils.deleteAudioFileOverSizeOneDir(file, maxSize - i);
                    }
                    i = filesByteSize;
                }
            }
            FitnessLogUtils.i(TAG, "deleteAudioFileOverSize, hasDeleteFile(" + zDeleteAudioFileOverSizeOneDir + ")");
        }
        return zDeleteAudioFileOverSizeOneDir;
    }

    @NotNull
    public final String getAudioFileName(long audioStartTime, int audioDuration, int type) {
        return audioStartTime + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + audioDuration + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + type + ".wav";
    }

    @NotNull
    public final File getTheAudioFilePath(long wakeupTime, int tzIn15Min) {
        String audioRootPath = getAudioRootPath();
        String str = tzIn15Min < 0 ? "n" : FitnessFilePathUtils.TimeZoneConstant.POSITIVE;
        return new File(audioRootPath, (str + Math.abs(tzIn15Min)) + File.separator + wakeupTime);
    }

    @Nullable
    public final File getTheSleepAudioFile(@NotNull SnoreDreamTalkAudio audio) {
        Intrinsics.checkNotNullParameter(audio, "audio");
        if (audio.getWakeupTime() == null || audio.getTzIn15Min() == null) {
            FitnessLogUtils.i(TAG, "invalid param");
            return null;
        }
        Long wakeupTime = audio.getWakeupTime();
        Intrinsics.checkNotNull(wakeupTime);
        long jLongValue = wakeupTime.longValue();
        Integer tzIn15Min = audio.getTzIn15Min();
        Intrinsics.checkNotNull(tzIn15Min);
        return new File(getSleepAudioFilePath(jLongValue, tzIn15Min.intValue()), getSleepAudioFileName(audio));
    }

    public final void getTheSnoreAudioList(@NotNull SleepSegmentReport segReport) {
        Intrinsics.checkNotNullParameter(segReport, "segReport");
        File sleepAudioFilePath = getSleepAudioFilePath(segReport.getProtoTime() <= 0 ? segReport.getWakeupTime() : segReport.getProtoTime(), segReport.getTzIn15Min());
        if (sleepAudioFilePath.exists()) {
            File[] fileArrListFiles = sleepAudioFilePath.listFiles();
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles(...)");
            if (fileArrListFiles.length != 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ArrayIteratorKt.iterator(sleepAudioFilePath.listFiles());
                while (it.hasNext()) {
                    String name = ((File) it.next()).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    SnoreDreamTalkAudio sleepAudioFileName = parseSleepAudioFileName(name);
                    if (sleepAudioFileName != null) {
                        sleepAudioFileName.setWakeupTime(Long.valueOf(segReport.getWakeupTime()));
                        sleepAudioFileName.setTzIn15Min(Integer.valueOf(segReport.getTzIn15Min()));
                        int type = sleepAudioFileName.getType();
                        if (type == 0) {
                            arrayList2.add(sleepAudioFileName);
                        } else if (type == 1) {
                            arrayList.add(sleepAudioFileName);
                        }
                    }
                }
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: nhm
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return SleepAudioFileUtils.getTheSnoreAudioList$lambda$0((SnoreDreamTalkAudio) obj, (SnoreDreamTalkAudio) obj2);
                    }
                });
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, new Comparator() { // from class: ohm
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return SleepAudioFileUtils.getTheSnoreAudioList$lambda$1((SnoreDreamTalkAudio) obj, (SnoreDreamTalkAudio) obj2);
                    }
                });
                segReport.setSnoreAudioList(arrayList);
                segReport.setDreamTalkAudioList(arrayList2);
                return;
            }
        }
        FitnessLogUtils.i(TAG, "no audio file: " + segReport.getWakeupTime());
    }

    @Nullable
    public final SnoreDreamTalkAudio parseSleepAudioFileName(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) fileName, new String[]{"."}, false, 0, 6, (Object) null);
        if (listSplit$default.isEmpty() || listSplit$default.size() < 2) {
            FitnessLogUtils.i(TAG, "not invalid audio file: " + fileName);
            return null;
        }
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(0), new String[]{RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR}, false, 0, 6, (Object) null);
        if (!listSplit$default2.isEmpty() && listSplit$default2.size() >= 3) {
            return new SnoreDreamTalkAudio(Long.parseLong((String) listSplit$default2.get(0)), Integer.parseInt((String) listSplit$default2.get(1)), Integer.parseInt((String) listSplit$default2.get(2)));
        }
        FitnessLogUtils.i(TAG, "not invalid audio file: " + fileName);
        return null;
    }
}
