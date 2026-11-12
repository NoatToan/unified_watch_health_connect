package com.xiaomi.fitness.sleep.behavior.analyze.snore;

import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u00103\u001a\u00020\u0005J\u000e\u00104\u001a\u0002052\u0006\u0010\u0019\u001a\u00020\u0005J\u0018\u00109\u001a\u00020\u00052\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002J\b\u0010?\u001a\u00020(H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u00106\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b6\u00108R\u0013\u0010;\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SleepSnoreReport;", "", "<init>", "()V", "id", "", "getId", "()I", "setId", "(I)V", "backgroundVolume", "", "getBackgroundVolume", "()D", "setBackgroundVolume", "(D)V", "snoreFrequency", "getSnoreFrequency", "setSnoreFrequency", "snoreMaxVolume", "getSnoreMaxVolume", "setSnoreMaxVolume", "snoreNumber", "getSnoreNumber", "setSnoreNumber", "snorePureTotalTime", "snoreList", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "getSnoreList", "()Ljava/util/List;", "setSnoreList", "(Ljava/util/List;)V", "dreamTalkList", "getDreamTalkList", "setDreamTalkList", "noiseList", "getNoiseList", "setNoiseList", "audioResultDir", "", "getAudioResultDir", "()Ljava/lang/String;", "setAudioResultDir", "(Ljava/lang/String;)V", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "getSnorePureTotalTime", "setSnorePureTotalTime", "", "isEmpty", "", "()Z", "getAudioDuration", "list", "snoreDataFile", "Ljava/io/File;", "getSnoreDataFile", "()Ljava/io/File;", "toString", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSnoreReport {

    /* JADX INFO: renamed from: audioResultDir, reason: from kotlin metadata and from toString */
    @Nullable
    private String mAudioResultDir;
    private double backgroundVolume;

    @Nullable
    private List<AudioAttributes> dreamTalkList;
    private int id;

    @Nullable
    private List<AudioAttributes> noiseList;
    private int snoreFrequency;

    @Nullable
    private List<AudioAttributes> snoreList;
    private double snoreMaxVolume;
    private int snoreNumber;
    private int snorePureTotalTime;
    private long timestamp;

    private final int getAudioDuration(List<AudioAttributes> list) {
        List<AudioAttributes> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return 0;
        }
        Iterator<AudioAttributes> it = list.iterator();
        long duration = 0;
        while (it.hasNext()) {
            duration += (long) it.next().getDuration();
        }
        return (int) duration;
    }

    @Nullable
    /* JADX INFO: renamed from: getAudioResultDir, reason: from getter */
    public final String getMAudioResultDir() {
        return this.mAudioResultDir;
    }

    public final double getBackgroundVolume() {
        return this.backgroundVolume;
    }

    @Nullable
    public final List<AudioAttributes> getDreamTalkList() {
        return this.dreamTalkList;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final List<AudioAttributes> getNoiseList() {
        return this.noiseList;
    }

    @Nullable
    public final File getSnoreDataFile() {
        String str = this.mAudioResultDir;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str, "snore_info.dat");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final int getSnoreFrequency() {
        return this.snoreFrequency;
    }

    @Nullable
    public final List<AudioAttributes> getSnoreList() {
        return this.snoreList;
    }

    public final double getSnoreMaxVolume() {
        return this.snoreMaxVolume;
    }

    public final int getSnoreNumber() {
        return this.snoreNumber;
    }

    public final int getSnorePureTotalTime() {
        int i = this.snorePureTotalTime;
        return i > 0 ? i : getAudioDuration(this.snoreList);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean isEmpty() {
        return SnailSleepSnoreReportHelper.INSTANCE.isEmpty(this.snoreList, this.dreamTalkList, this.noiseList);
    }

    public final void setAudioResultDir(@Nullable String str) {
        this.mAudioResultDir = str;
    }

    public final void setBackgroundVolume(double d) {
        this.backgroundVolume = d;
    }

    public final void setDreamTalkList(@Nullable List<AudioAttributes> list) {
        this.dreamTalkList = list;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setNoiseList(@Nullable List<AudioAttributes> list) {
        this.noiseList = list;
    }

    public final void setSnoreFrequency(int i) {
        this.snoreFrequency = i;
    }

    public final void setSnoreList(@Nullable List<AudioAttributes> list) {
        this.snoreList = list;
    }

    public final void setSnoreMaxVolume(double d) {
        this.snoreMaxVolume = d;
    }

    public final void setSnoreNumber(int i) {
        this.snoreNumber = i;
    }

    public final void setSnorePureTotalTime(int snorePureTotalTime) {
        this.snorePureTotalTime = snorePureTotalTime;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @NotNull
    public String toString() {
        return "SnailSleepSnoreReport{id=" + this.id + ", backgroundVolume=" + this.backgroundVolume + ", snoreFrequency=" + this.snoreFrequency + ", snoreMaxVolume=" + this.snoreMaxVolume + ", snoreNumber=" + this.snoreNumber + ", snorePureTotalTime=" + this.snorePureTotalTime + ", snoreList=" + this.snoreList + ", dreamTalkList=" + this.dreamTalkList + ", noiseList=" + this.noiseList + ", mAudioResultDir='" + this.mAudioResultDir + "'}";
    }
}
