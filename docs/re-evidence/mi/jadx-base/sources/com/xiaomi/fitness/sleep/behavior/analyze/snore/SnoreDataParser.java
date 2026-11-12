package com.xiaomi.fitness.sleep.behavior.analyze.snore;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000bJ8\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreDataParser;", "", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "snoreAudioProfile", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreAudioProfile;", "getSnoreAudioProfile", "()Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreAudioProfile;", "readFile", "", "filePath", "getAudioDecibels", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreDecibel;", "audioFileName", "audioAttributes", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "getAudioAttributes", "()Ljava/util/List;", "constructAudioData", "", "context", "snoreList", "", "dreamTalkList", "noiseList", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnoreDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnoreDataParser.kt\ncom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreDataParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public final class SnoreDataParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "SnoreDataParser";

    @NotNull
    private final Context mContext;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreDataParser$Companion;", "", "<init>", "()V", "TAG", "", "deleteAudioResultFiles", "", "context", "Landroid/content/Context;", "audioFileName", "filePath", "needDeleteAudioResultFiles", "", "audioAttributes", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "needDeleteDreamTalkResult", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void deleteAudioResultFiles(Context context, String audioFileName, String filePath) {
            FileUtils fileUtils = FileUtils.INSTANCE;
            fileUtils.deleteFile(filePath);
            fileUtils.deleteFile(BehaviorConfiguration.INSTANCE.getAudioDecibelFilePath(context, fileUtils.getFileNameWithoutSuffix(audioFileName)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean needDeleteAudioResultFiles(AudioAttributes audioAttributes) {
            return audioAttributes.getType() == 2 || (audioAttributes.getType() == 0 && needDeleteDreamTalkResult(audioAttributes));
        }

        private final boolean needDeleteDreamTalkResult(AudioAttributes audioAttributes) {
            BehaviorConfiguration behaviorConfiguration = BehaviorConfiguration.INSTANCE;
            long snoreDetectionFirstStartTimeMills = behaviorConfiguration.getSnoreDetectionFirstStartTimeMills();
            long snoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease = behaviorConfiguration.getSnoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease();
            if (snoreDetectionFirstStartTimeMills <= 0 || snoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease <= 0) {
                return false;
            }
            long millis = TimeUnit.HOURS.toMillis(1L);
            long j = snoreDetectionFirstStartTimeMills + millis;
            long snoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease2 = behaviorConfiguration.getSnoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease() - millis;
            long beginTime = audioAttributes.getBeginTime() * ((long) 1000);
            return beginTime < j || beginTime + ((long) (audioAttributes.getDuration() * 1000)) > snoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease2;
        }
    }

    public SnoreDataParser(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
    }

    private final String readFile(String filePath) throws Throwable {
        File file = new File(filePath);
        if (file.isDirectory() || !file.exists()) {
            Logger.e(filePath + " is directory or not exits", new Object[0]);
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (IOException e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            Logger.e(TAG, "read file failed", e);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            String string = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            return string;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e2) {
                                    Logger.e(TAG, "reader close exception", e2);
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (IOException e3) {
                    Logger.e(TAG, "reader close exception", e3);
                }
            } catch (IOException e4) {
                e = e4;
            }
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void constructAudioData(@NotNull Context context, @NotNull List<AudioAttributes> snoreList, @NotNull List<AudioAttributes> dreamTalkList, @NotNull List<AudioAttributes> noiseList) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(snoreList, "snoreList");
        Intrinsics.checkNotNullParameter(dreamTalkList, "dreamTalkList");
        Intrinsics.checkNotNullParameter(noiseList, "noiseList");
        List<AudioAttributes> audioAttributes = getAudioAttributes();
        if (!audioAttributes.isEmpty()) {
            BehaviorConfiguration behaviorConfiguration = BehaviorConfiguration.INSTANCE;
            String snailTodayAudioResultPath = behaviorConfiguration.getSnailTodayAudioResultPath(context);
            String str = File.separator;
            String str2 = snailTodayAudioResultPath + str;
            String str3 = behaviorConfiguration.getSnailTodayAudioResultRelativePath() + str;
            for (AudioAttributes audioAttributes2 : audioAttributes) {
                String fileName = audioAttributes2.getFileName();
                String str4 = str2 + fileName;
                if (FileUtils.isFileExists(str4)) {
                    Companion companion = INSTANCE;
                    if (companion.needDeleteAudioResultFiles(audioAttributes2)) {
                        Intrinsics.checkNotNull(fileName);
                        companion.deleteAudioResultFiles(context, fileName, str4);
                    } else {
                        audioAttributes2.setFileRelativePath(str3 + fileName);
                        int type = audioAttributes2.getType();
                        if (type == 0) {
                            dreamTalkList.add(audioAttributes2);
                        } else if (type != 1) {
                            Logger.e(TAG, "unrecognized type: " + type);
                        } else {
                            snoreList.add(audioAttributes2);
                        }
                    }
                } else {
                    Logger.e(TAG, "file " + audioAttributes2.getFileName() + " is not existed");
                }
            }
        }
    }

    @NotNull
    public final List<AudioAttributes> getAudioAttributes() throws Throwable {
        String file = readFile(BehaviorConfiguration.INSTANCE.getAudioDescriptionFilePath(this.mContext));
        Logger.i(TAG, "getAudioAttributes: " + file);
        if (file.length() != 0) {
            return GsonExtKt.toList(new Gson(), file, AudioAttributes.class);
        }
        Logger.i(TAG, "Audios does not exist");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final List<SnoreDecibel> getAudioDecibels(@NotNull String audioFileName) throws Throwable {
        Intrinsics.checkNotNullParameter(audioFileName, "audioFileName");
        String fileNameWithoutSuffix = FileUtils.INSTANCE.getFileNameWithoutSuffix(audioFileName);
        if (TextUtils.isEmpty(fileNameWithoutSuffix)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        String file = readFile(BehaviorConfiguration.INSTANCE.getAudioDecibelFilePath(this.mContext, fileNameWithoutSuffix));
        return file.length() == 0 ? CollectionsKt__CollectionsKt.emptyList() : GsonExtKt.toList(new Gson(), file, SnoreDecibel.class);
    }

    @NotNull
    public final SnoreAudioProfile getSnoreAudioProfile() throws Throwable {
        String file = readFile(BehaviorConfiguration.INSTANCE.getAudioProfileDescriptionFilePath(this.mContext));
        if (TextUtils.isEmpty(file)) {
            return new SnoreAudioProfile();
        }
        Object objFromJson = new Gson().fromJson(file, (Class<Object>) SnoreAudioProfile.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (SnoreAudioProfile) objFromJson;
    }
}
