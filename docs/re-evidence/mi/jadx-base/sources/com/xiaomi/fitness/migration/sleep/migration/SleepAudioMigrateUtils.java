package com.xiaomi.fitness.migration.sleep.migration;

import android.media.MediaPlayer;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.SnoreDreamTalkAudio;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.utils.SleepAudioFileUtils;
import com.xiaomi.fit.fitness.persist.process.SleepSnoreDecibelUtils;
import com.xiaomi.fit.fitness.persist.process.SnoreConfiguration;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.devicesettings.utils.MusicUtilsKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.sleep.migration.SleepAudioMigrateUtils;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.AudioAttributes;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 >2\u00020\u0001:\u0002>?B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\"H\u0002J \u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010$2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J.\u0010)\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010*\u001a\u00020(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0$H\u0002J(\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u000202H\u0002J\u0012\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020\"H\u0002J\u001c\u00105\u001a\u00020\u001b2\f\u00106\u001a\b\u0012\u0004\u0012\u00020/0$2\u0006\u00107\u001a\u00020(J\u0006\u00108\u001a\u00020\"J\u0018\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020 H\u0002J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020/H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/migration/sleep/migration/SleepAudioMigrateUtils;", "", "<init>", "()V", "TAG", "", "snoreDecibelInstance", "Lcom/xiaomi/fit/fitness/persist/process/SleepSnoreDecibelUtils;", "getSnoreDecibelInstance", "()Lcom/xiaomi/fit/fitness/persist/process/SleepSnoreDecibelUtils;", "snoreDecibelInstance$delegate", "Lkotlin/Lazy;", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dataGetter$delegate", "dataRecorder", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getDataRecorder", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "dataRecorder$delegate", "phoneSid", "getPhoneSid", "()Ljava/lang/String;", "phoneSid$delegate", "migrateOldHealthSleepData", "", "moveTheAudioFileFromTmpDir", "dateTime", "", "tzInSec", "", "tmpFileDir", "Ljava/io/File;", "getAllPossibleAudioFile", "", "dateTimeInSec", "parentFileDir", "getTheSleepSegmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "processAudioAndDecibelFile", "sleepReport", "audioFileList", "moveToTmpAudioPath", "srcFile", "audioAttr", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "genSleepAudioAttr", "fileInfo", "Lcom/xiaomi/fitness/migration/sleep/migration/SleepAudioMigrateUtils$AudioFileInfo;", "parseSleepAudioFileName", "file", "migrateSleepAudioFile", "audioList", "segReport", "getOldAudioDirFile", "getNewAudioFilePath", "wakeupTime", "tzIn15Min", "getNewAudioFileName", "audio", "Companion", "AudioFileInfo", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepAudioMigrateUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAudioMigrateUtils.kt\ncom/xiaomi/fitness/migration/sleep/migration/SleepAudioMigrateUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1863#2,2:322\n1863#2,2:324\n*S KotlinDebug\n*F\n+ 1 SleepAudioMigrateUtils.kt\ncom/xiaomi/fitness/migration/sleep/migration/SleepAudioMigrateUtils\n*L\n113#1:322,2\n183#1:324,2\n*E\n"})
public final class SleepAudioMigrateUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SleepAudioMigrateUtils instance = new SleepAudioMigrateUtils();

    @NotNull
    private static final String OLD_HEALTH_AUDIO_DATE_PATTERN = "yyyyMMddHHmmss";

    @NotNull
    private static final String OLD_HEALTH_AUDIO_SUFFIX = MusicUtilsKt.sExtensionWav;

    @NotNull
    private static final String OLD_HEALTH_AUDIO_SNORE_PREFIX = "snore";

    @NotNull
    private static final String OLD_HEALTH_AUDIO_DT_PREFIX = DeviceTagInterface.CUSTOM_TAG_DISPLAY_TYPE;

    @NotNull
    private final String TAG = "SleepAudioMigrateUtils";

    /* JADX INFO: renamed from: snoreDecibelInstance$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy snoreDecibelInstance = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: phm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepAudioMigrateUtils.snoreDecibelInstance_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: dataGetter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataGetter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qhm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepAudioMigrateUtils.dataGetter_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: dataRecorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataRecorder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rhm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepAudioMigrateUtils.dataRecorder_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: phoneSid$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy phoneSid = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: shm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepAudioMigrateUtils.phoneSid_delegate$lambda$3();
        }
    });

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/migration/sleep/migration/SleepAudioMigrateUtils$AudioFileInfo;", "", "filePath", "", "preFix", "middleName", "suffix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getPreFix", "getMiddleName", "getSuffix", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AudioFileInfo {

        @NotNull
        private final String filePath;

        @NotNull
        private final String middleName;

        @NotNull
        private final String preFix;

        @NotNull
        private final String suffix;

        public AudioFileInfo(@NotNull String filePath, @NotNull String preFix, @NotNull String middleName, @NotNull String suffix) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(preFix, "preFix");
            Intrinsics.checkNotNullParameter(middleName, "middleName");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.filePath = filePath;
            this.preFix = preFix;
            this.middleName = middleName;
            this.suffix = suffix;
        }

        public static /* synthetic */ AudioFileInfo copy$default(AudioFileInfo audioFileInfo, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = audioFileInfo.filePath;
            }
            if ((i & 2) != 0) {
                str2 = audioFileInfo.preFix;
            }
            if ((i & 4) != 0) {
                str3 = audioFileInfo.middleName;
            }
            if ((i & 8) != 0) {
                str4 = audioFileInfo.suffix;
            }
            return audioFileInfo.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPreFix() {
            return this.preFix;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMiddleName() {
            return this.middleName;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSuffix() {
            return this.suffix;
        }

        @NotNull
        public final AudioFileInfo copy(@NotNull String filePath, @NotNull String preFix, @NotNull String middleName, @NotNull String suffix) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(preFix, "preFix");
            Intrinsics.checkNotNullParameter(middleName, "middleName");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            return new AudioFileInfo(filePath, preFix, middleName, suffix);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioFileInfo)) {
                return false;
            }
            AudioFileInfo audioFileInfo = (AudioFileInfo) other;
            return Intrinsics.areEqual(this.filePath, audioFileInfo.filePath) && Intrinsics.areEqual(this.preFix, audioFileInfo.preFix) && Intrinsics.areEqual(this.middleName, audioFileInfo.middleName) && Intrinsics.areEqual(this.suffix, audioFileInfo.suffix);
        }

        @NotNull
        public final String getFilePath() {
            return this.filePath;
        }

        @NotNull
        public final String getMiddleName() {
            return this.middleName;
        }

        @NotNull
        public final String getPreFix() {
            return this.preFix;
        }

        @NotNull
        public final String getSuffix() {
            return this.suffix;
        }

        public int hashCode() {
            return (((((this.filePath.hashCode() * 31) + this.preFix.hashCode()) * 31) + this.middleName.hashCode()) * 31) + this.suffix.hashCode();
        }

        @NotNull
        public String toString() {
            return "AudioFileInfo(filePath=" + this.filePath + ", preFix=" + this.preFix + ", middleName=" + this.middleName + ", suffix=" + this.suffix + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/migration/sleep/migration/SleepAudioMigrateUtils$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/migration/sleep/migration/SleepAudioMigrateUtils;", "getInstance", "()Lcom/xiaomi/fitness/migration/sleep/migration/SleepAudioMigrateUtils;", "OLD_HEALTH_AUDIO_DATE_PATTERN", "", "getOLD_HEALTH_AUDIO_DATE_PATTERN", "()Ljava/lang/String;", "OLD_HEALTH_AUDIO_SUFFIX", "getOLD_HEALTH_AUDIO_SUFFIX", "OLD_HEALTH_AUDIO_SNORE_PREFIX", "getOLD_HEALTH_AUDIO_SNORE_PREFIX", "OLD_HEALTH_AUDIO_DT_PREFIX", "getOLD_HEALTH_AUDIO_DT_PREFIX", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepAudioMigrateUtils getInstance() {
            return SleepAudioMigrateUtils.instance;
        }

        @NotNull
        public final String getOLD_HEALTH_AUDIO_DATE_PATTERN() {
            return SleepAudioMigrateUtils.OLD_HEALTH_AUDIO_DATE_PATTERN;
        }

        @NotNull
        public final String getOLD_HEALTH_AUDIO_DT_PREFIX() {
            return SleepAudioMigrateUtils.OLD_HEALTH_AUDIO_DT_PREFIX;
        }

        @NotNull
        public final String getOLD_HEALTH_AUDIO_SNORE_PREFIX() {
            return SleepAudioMigrateUtils.OLD_HEALTH_AUDIO_SNORE_PREFIX;
        }

        @NotNull
        public final String getOLD_HEALTH_AUDIO_SUFFIX() {
            return SleepAudioMigrateUtils.OLD_HEALTH_AUDIO_SUFFIX;
        }
    }

    private SleepAudioMigrateUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter dataGetter_delegate$lambda$1() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder dataRecorder_delegate$lambda$2() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    private final AudioAttributes genSleepAudioAttr(AudioFileInfo fileInfo) throws IOException {
        int i;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(fileInfo.getFilePath());
        mediaPlayer.prepare();
        int duration = mediaPlayer.getDuration();
        mediaPlayer.release();
        if (duration <= 0) {
            FitnessLogUtils.i(this.TAG, "not valid audio(" + fileInfo.getFilePath() + ")-" + duration);
            return null;
        }
        Long lConvertDateStrToTimeInMilli = FitnessDateUtils.INSTANCE.convertDateStrToTimeInMilli(fileInfo.getMiddleName(), OLD_HEALTH_AUDIO_DATE_PATTERN);
        if (lConvertDateStrToTimeInMilli == null) {
            FitnessLogUtils.i(this.TAG, "illegal audio time str(" + lConvertDateStrToTimeInMilli + ")");
            return null;
        }
        AudioAttributes audioAttributes = new AudioAttributes();
        audioAttributes.setBeginTime((lConvertDateStrToTimeInMilli.longValue() - ((long) duration)) / ((long) 1000));
        if (audioAttributes.getBeginTime() <= 0) {
            FitnessLogUtils.i(this.TAG, "not valid audio time" + lConvertDateStrToTimeInMilli + "-" + duration);
            return null;
        }
        audioAttributes.setDuration(duration / 1000);
        String preFix = fileInfo.getPreFix();
        if (Intrinsics.areEqual(preFix, OLD_HEALTH_AUDIO_SNORE_PREFIX)) {
            i = 1;
        } else {
            if (!Intrinsics.areEqual(preFix, OLD_HEALTH_AUDIO_DT_PREFIX)) {
                return null;
            }
            i = 0;
        }
        audioAttributes.setType(i);
        return audioAttributes;
    }

    private final List<File> getAllPossibleAudioFile(long dateTimeInSec, File parentFileDir) {
        ArrayList arrayList = new ArrayList();
        File file = new File(parentFileDir, String.valueOf(dateTimeInSec));
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles(...)");
            arrayList.addAll(ArraysKt___ArraysKt.toList(fileArrListFiles));
        }
        File file2 = new File(parentFileDir, String.valueOf(dateTimeInSec - FitnessDateUtils.INSTANCE.getSECONDS_ONE_DAY()));
        FitnessLogUtils.d(this.TAG, "preDayFile(" + file2.getPath() + ")");
        if (file2.exists()) {
            File[] fileArrListFiles2 = file2.listFiles();
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "listFiles(...)");
            arrayList.addAll(ArraysKt___ArraysKt.toList(fileArrListFiles2));
        }
        return arrayList;
    }

    private final FitnessDataGetter getDataGetter() {
        return (FitnessDataGetter) this.dataGetter.getValue();
    }

    private final FitnessDataRecorder getDataRecorder() {
        return (FitnessDataRecorder) this.dataRecorder.getValue();
    }

    private final String getNewAudioFileName(AudioAttributes audio) {
        return SleepAudioFileUtils.INSTANCE.getAudioFileName(audio.getBeginTime(), audio.getDuration(), audio.getType());
    }

    private final File getNewAudioFilePath(long wakeupTime, int tzIn15Min) {
        return SleepAudioFileUtils.INSTANCE.getTheAudioFilePath(wakeupTime, tzIn15Min);
    }

    private final String getPhoneSid() {
        return (String) this.phoneSid.getValue();
    }

    private final SleepSnoreDecibelUtils getSnoreDecibelInstance() {
        return (SleepSnoreDecibelUtils) this.snoreDecibelInstance.getValue();
    }

    private final List<SleepSegmentReport> getTheSleepSegmentReport(long dateTimeInSec, int tzInSec) {
        List<SleepSegmentReport> list = (List) getDataGetter().getTheDailyItems(getPhoneSid(), dateTimeInSec, dateTimeInSec + FitnessDateUtils.INSTANCE.getSECONDS_ONE_DAY(), tzInSec, "sleep").get("sleep");
        List<SleepSegmentReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
        return list;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 java.util.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>, still in use, count: 1, list:
          (r0v3 java.util.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>) from 0x0022: INVOKE (r6v0 java.util.Iterator<T>) = (r0v3 java.util.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>) INTERFACE call: java.lang.Iterable.iterator():java.util.Iterator A[MD:():java.util.Iterator<T> (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.simplifyMoveInsns(CodeShrinkVisitor.java:288)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.processForceInlineInsns(RegionMakerVisitor.java:43)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:29)
        */
    private final void moveTheAudioFileFromTmpDir(long r8, int r10, java.io.File r11) {
        /*
            r7 = this;
            java.util.List r11 = r7.getAllPossibleAudioFile(r8, r11)
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L3b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            goto L3b
        L10:
            java.util.List r0 = r7.getTheSleepSegmentReport(r8, r10)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L3b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20
            goto L3b
        L20:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r6 = r0.iterator()
        L26:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r6.next()
            r4 = r0
            com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport r4 = (com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport) r4
            r0 = r7
            r1 = r8
            r3 = r10
            r5 = r11
            r0.processAudioAndDecibelFile(r1, r3, r4, r5)
            goto L26
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.migration.sleep.migration.SleepAudioMigrateUtils.moveTheAudioFileFromTmpDir(long, int, java.io.File):void");
    }

    private final void moveToTmpAudioPath(File srcFile, AudioAttributes audioAttr, int tzInSec, File tmpFileDir) {
        File file = new File(tmpFileDir, String.valueOf(FitnessDateUtils.changeZeroOfTheDay(audioAttr.getBeginTime(), tzInSec)));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, getNewAudioFileName(audioAttr));
        FitnessLogUtils.i(this.TAG, "(" + srcFile.getPath() + ") tmp move to (" + file2.getPath() + ")");
        srcFile.renameTo(file2);
    }

    private final AudioFileInfo parseSleepAudioFileName(File file) {
        String name = file.getName();
        Intrinsics.checkNotNull(name);
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) name, new String[]{"."}, false, 0, 6, (Object) null);
        List list = listSplit$default;
        if (list == null || list.isEmpty() || listSplit$default.size() != 2) {
            FitnessLogUtils.i(this.TAG, "not valid sleep audio file(" + name + ")");
            return null;
        }
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(0), new String[]{RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR}, false, 0, 6, (Object) null);
        List list2 = listSplit$default2;
        if (list2 != null && !list2.isEmpty() && listSplit$default2.size() == 2) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            return new AudioFileInfo(absolutePath, (String) listSplit$default2.get(0), (String) listSplit$default2.get(1), (String) listSplit$default.get(1));
        }
        FitnessLogUtils.i(this.TAG, "not valid sleep audio file(" + name + ")");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String phoneSid_delegate$lambda$3() {
        return MigrationManager.INSTANCE.getInstance().requestPhoneSid();
    }

    private final void processAudioAndDecibelFile(long dateTimeInSec, int tzInSec, SleepSegmentReport sleepReport, List<? extends File> audioFileList) {
        ArrayList<File> arrayList = new ArrayList();
        int i = 0;
        int duration = 0;
        for (File file : audioFileList) {
            SleepAudioFileUtils sleepAudioFileUtils = SleepAudioFileUtils.INSTANCE;
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            SnoreDreamTalkAudio sleepAudioFileName = sleepAudioFileUtils.parseSleepAudioFileName(name);
            if (sleepAudioFileName != null && sleepAudioFileName.getBeginTime() > sleepReport.getBedTime() && sleepAudioFileName.getBeginTime() < sleepReport.getWakeupTime()) {
                if (sleepAudioFileName.getType() == 0) {
                    i++;
                    arrayList.add(file);
                } else if (sleepAudioFileName.getType() == 1) {
                    duration += sleepAudioFileName.getDuration();
                    arrayList.add(file);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            sleepReport.setDreamTalkCount(Integer.valueOf(i));
            sleepReport.setSnoreDuration(Integer.valueOf(duration));
            File newAudioFilePath = getNewAudioFilePath(sleepReport.getWakeupTime(), sleepReport.getTzIn15Min());
            if (!newAudioFilePath.exists()) {
                boolean zMkdirs = newAudioFilePath.mkdirs();
                FitnessLogUtils.i(this.TAG, "not exists, and mkdirs(" + newAudioFilePath.getPath() + ")-" + zMkdirs);
            }
            for (File file2 : arrayList) {
                File file3 = new File(newAudioFilePath, file2.getName());
                FitnessLogUtils.i(this.TAG, "(" + file2.getPath() + ") final move to (" + file3.getPath() + ")");
                file2.renameTo(file3);
            }
            getSnoreDecibelInstance().convertAndUploadDecibelData(getPhoneSid(), dateTimeInSec * ((long) 1000), sleepReport);
            FitnessDataRecorder dataRecorder = getDataRecorder();
            String phoneSid = getPhoneSid();
            Integer zoneOffsetInSec = sleepReport.getZoneOffsetInSec();
            if (zoneOffsetInSec != null) {
                tzInSec = zoneOffsetInSec.intValue();
            }
            dataRecorder.recordSleepSegment(phoneSid, tzInSec, sleepReport);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSnoreDecibelUtils snoreDecibelInstance_delegate$lambda$0() {
        return SleepSnoreDecibelUtils.INSTANCE.getInstance();
    }

    @NotNull
    public final File getOldAudioDirFile() {
        return new File(SnoreConfiguration.getAudioRootPath(ApplicationExtKt.getApplication()), SnoreConfiguration.INSTANCE.getAudioCacheRelativePath());
    }

    public final void migrateOldHealthSleepData() {
        File oldAudioDirFile = getOldAudioDirFile();
        if (!oldAudioDirFile.exists()) {
            FitnessLogUtils.i(this.TAG, "migrateOldHealthSleepData: " + oldAudioDirFile + " no exist");
            return;
        }
        MigrationManager.Companion companion = MigrationManager.INSTANCE;
        int curTimeZoneOffsetInSecond = companion.getInstance().getCurTimeZoneOffsetInSecond();
        File file = new File(oldAudioDirFile, "fitness/" + companion.getInstance().getCurTimeZoneOffset15Min());
        File[] fileArrListFiles = oldAudioDirFile.listFiles();
        FitnessLogUtils.i(this.TAG, "migrateOldHealthSleepData: old file size(" + fileArrListFiles.length + ")");
        Iterator it = ArrayIteratorKt.iterator(fileArrListFiles);
        while (it.hasNext()) {
            File file2 = (File) it.next();
            try {
                if (!file2.isDirectory()) {
                    Intrinsics.checkNotNull(file2);
                    AudioFileInfo sleepAudioFileName = parseSleepAudioFileName(file2);
                    if (sleepAudioFileName != null) {
                        if (OLD_HEALTH_AUDIO_SUFFIX.contentEquals(sleepAudioFileName.getSuffix())) {
                            AudioAttributes audioAttributesGenSleepAudioAttr = genSleepAudioAttr(sleepAudioFileName);
                            if (audioAttributesGenSleepAudioAttr != null) {
                                moveToTmpAudioPath(file2, audioAttributesGenSleepAudioAttr, curTimeZoneOffsetInSecond, file);
                            }
                        } else {
                            FitnessLogUtils.i(this.TAG, "not valid sleep audio file(" + file2.getName() + ")");
                        }
                    }
                }
            } catch (Exception e) {
                FitnessLogUtils.INSTANCE.w(this.TAG, "migrateOldHealthSleepData", e);
            }
        }
        if (!file.exists()) {
            FitnessLogUtils.i(this.TAG, "migrateOldHealthSleepData: " + file + " no exist");
            return;
        }
        File[] fileArrListFiles2 = file.listFiles();
        FitnessLogUtils.i(this.TAG, "migrateOldHealthSleepData: start with sleepReport(" + fileArrListFiles2.length + ")");
        Iterator it2 = ArrayIteratorKt.iterator(fileArrListFiles2);
        long j = 0L;
        while (it2.hasNext()) {
            File file3 = (File) it2.next();
            if (file3.isDirectory()) {
                String name = file3.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                long j2 = Long.parseLong(name);
                moveTheAudioFileFromTmpDir(j2, curTimeZoneOffsetInSecond, file);
                if (j2 > j) {
                    j = j2;
                }
            }
        }
        if (j > 0) {
            FitnessLogUtils.i(this.TAG, "move the last day audio file(" + j + ")");
            moveTheAudioFileFromTmpDir(j + FitnessDateUtils.INSTANCE.getSECONDS_ONE_DAY(), curTimeZoneOffsetInSecond, file);
        }
    }

    public final void migrateSleepAudioFile(@NotNull List<AudioAttributes> audioList, @NotNull SleepSegmentReport segReport) {
        Intrinsics.checkNotNullParameter(audioList, "audioList");
        Intrinsics.checkNotNullParameter(segReport, "segReport");
        if (audioList.isEmpty() || segReport.getWakeupTime() <= 0) {
            FitnessLogUtils.i(this.TAG, "no need to move, " + segReport.getWakeupTime());
            return;
        }
        File oldAudioDirFile = getOldAudioDirFile();
        if (!oldAudioDirFile.exists()) {
            FitnessLogUtils.i(this.TAG, "no exist, " + segReport.getWakeupTime());
            return;
        }
        FitnessLogUtils.i(this.TAG, "migrateSleepAudioFile: size(" + audioList.size() + ")");
        File newAudioFilePath = getNewAudioFilePath(segReport.getWakeupTime(), segReport.getTzIn15Min());
        for (AudioAttributes audioAttributes : audioList) {
            if (audioAttributes.getFileName() == null) {
                FitnessLogUtils.i(this.TAG, "fileName is null(" + audioAttributes + ")");
            } else {
                String fileName = audioAttributes.getFileName();
                Intrinsics.checkNotNull(fileName);
                File file = new File(oldAudioDirFile, fileName);
                if (file.exists()) {
                    if (!newAudioFilePath.exists()) {
                        boolean zMkdirs = newAudioFilePath.mkdirs();
                        FitnessLogUtils.i(this.TAG, "not exist, and mkdirs(" + newAudioFilePath + ")-" + zMkdirs);
                    }
                    File file2 = new File(newAudioFilePath, getNewAudioFileName(audioAttributes));
                    FitnessLogUtils.i(this.TAG, "(" + file.getPath() + ") move to (" + file2.getPath() + ")");
                    file.renameTo(file2);
                    file.deleteOnExit();
                } else {
                    FitnessLogUtils.i(this.TAG, "(" + oldAudioDirFile.getPath() + ", " + audioAttributes.getFileName() + ") not exist");
                }
            }
        }
    }
}
