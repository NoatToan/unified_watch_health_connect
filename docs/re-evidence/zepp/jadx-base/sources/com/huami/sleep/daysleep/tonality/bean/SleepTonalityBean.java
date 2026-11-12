package com.huami.sleep.daysleep.tonality.bean;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b%\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b^\u0010_R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010\"\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u00102\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\"\u00106\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\"\u0010:\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0015\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u0019R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0015\u001a\u0004\bD\u0010\u0017\"\u0004\bE\u0010\u0019R\"\u0010J\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0015\u001a\u0004\bH\u0010\u0017\"\u0004\bI\u0010\u0019R\"\u0010N\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\"\u0010R\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0015\u001a\u0004\bP\u0010\u0017\"\u0004\bQ\u0010\u0019R$\u0010Y\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010]\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010X¨\u0006`"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "", "", "", "a", "Ljava/util/List;", "getTagList", "()Ljava/util/List;", "setTagList", "(Ljava/util/List;)V", "tagList", "Lcom/huami/chart/data/ChartDataList;", "b", "Lcom/huami/chart/data/ChartDataList;", "getRelaxChartDataList", "()Lcom/huami/chart/data/ChartDataList;", "setRelaxChartDataList", "(Lcom/huami/chart/data/ChartDataList;)V", "relaxChartDataList", "", "c", LogUtil.I, "getIntoSleepSignIndex", "()I", "setIntoSleepSignIndex", "(I)V", "intoSleepSignIndex", GoogleApiAvailabilityLight.a, "getRelaxMaxScore", "setRelaxMaxScore", "relaxMaxScore", "e", "getRelaxMinScore", "setRelaxMinScore", "relaxMinScore", "", "f", "J", "getRelaxStartTimeMS", "()J", "setRelaxStartTimeMS", "(J)V", "relaxStartTimeMS", "g", "getRelaxEndTimeMS", "setRelaxEndTimeMS", "relaxEndTimeMS", "h", "getOffsetRelaxEndTimeMS", "setOffsetRelaxEndTimeMS", "offsetRelaxEndTimeMS", "i", "getIntoSleepTime", "setIntoSleepTime", "intoSleepTime", z.j, "getIntoSleepTimeCount", "setIntoSleepTimeCount", "intoSleepTimeCount", "", hl.k, "Z", "getBeMainSleep", "()Z", "setBeMainSleep", "(Z)V", "beMainSleep", "l", "getMusicListenTimeCount", "setMusicListenTimeCount", "musicListenTimeCount", "m", "getMusicPlayTimeCount", "setMusicPlayTimeCount", "musicPlayTimeCount", GoogleApiAvailabilityLight.b, "getBeToday", "setBeToday", "beToday", "o", "getAwakeTimeIndex", "setAwakeTimeIndex", "awakeTimeIndex", b.r, "Ljava/lang/String;", "getContinueListenDaysCount", "()Ljava/lang/String;", "setContinueListenDaysCount", "(Ljava/lang/String;)V", "continueListenDaysCount", DTransferConstants.SEARCH_KEY, "getDayKey", "setDayKey", "dayKey", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTonalityBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private List<String> tagList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ChartDataList relaxChartDataList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int intoSleepSignIndex = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int relaxMaxScore = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int relaxMinScore = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long relaxStartTimeMS = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long relaxEndTimeMS = -1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long offsetRelaxEndTimeMS = -1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long intoSleepTime = -1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int intoSleepTimeCount = -1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean beMainSleep = true;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int musicListenTimeCount = -1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int musicPlayTimeCount = -1;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean beToday = true;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int awakeTimeIndex;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private String continueListenDaysCount;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private String dayKey;

    public final int getAwakeTimeIndex() {
        return this.awakeTimeIndex;
    }

    public final boolean getBeMainSleep() {
        return this.beMainSleep;
    }

    public final boolean getBeToday() {
        return this.beToday;
    }

    @Nullable
    public final String getContinueListenDaysCount() {
        return this.continueListenDaysCount;
    }

    @Nullable
    public final String getDayKey() {
        return this.dayKey;
    }

    public final int getIntoSleepSignIndex() {
        return this.intoSleepSignIndex;
    }

    public final long getIntoSleepTime() {
        return this.intoSleepTime;
    }

    public final int getIntoSleepTimeCount() {
        return this.intoSleepTimeCount;
    }

    public final int getMusicListenTimeCount() {
        return this.musicListenTimeCount;
    }

    public final int getMusicPlayTimeCount() {
        return this.musicPlayTimeCount;
    }

    public final long getOffsetRelaxEndTimeMS() {
        return this.offsetRelaxEndTimeMS;
    }

    @Nullable
    public final ChartDataList getRelaxChartDataList() {
        return this.relaxChartDataList;
    }

    public final long getRelaxEndTimeMS() {
        return this.relaxEndTimeMS;
    }

    public final int getRelaxMaxScore() {
        return this.relaxMaxScore;
    }

    public final int getRelaxMinScore() {
        return this.relaxMinScore;
    }

    public final long getRelaxStartTimeMS() {
        return this.relaxStartTimeMS;
    }

    @Nullable
    public final List<String> getTagList() {
        return this.tagList;
    }

    public final void setAwakeTimeIndex(int i) {
        this.awakeTimeIndex = i;
    }

    public final void setBeMainSleep(boolean z) {
        this.beMainSleep = z;
    }

    public final void setBeToday(boolean z) {
        this.beToday = z;
    }

    public final void setContinueListenDaysCount(@Nullable String str) {
        this.continueListenDaysCount = str;
    }

    public final void setDayKey(@Nullable String str) {
        this.dayKey = str;
    }

    public final void setIntoSleepSignIndex(int i) {
        this.intoSleepSignIndex = i;
    }

    public final void setIntoSleepTime(long j) {
        this.intoSleepTime = j;
    }

    public final void setIntoSleepTimeCount(int i) {
        this.intoSleepTimeCount = i;
    }

    public final void setMusicListenTimeCount(int i) {
        this.musicListenTimeCount = i;
    }

    public final void setMusicPlayTimeCount(int i) {
        this.musicPlayTimeCount = i;
    }

    public final void setOffsetRelaxEndTimeMS(long j) {
        this.offsetRelaxEndTimeMS = j;
    }

    public final void setRelaxChartDataList(@Nullable ChartDataList chartDataList) {
        this.relaxChartDataList = chartDataList;
    }

    public final void setRelaxEndTimeMS(long j) {
        this.relaxEndTimeMS = j;
    }

    public final void setRelaxMaxScore(int i) {
        this.relaxMaxScore = i;
    }

    public final void setRelaxMinScore(int i) {
        this.relaxMinScore = i;
    }

    public final void setRelaxStartTimeMS(long j) {
        this.relaxStartTimeMS = j;
    }

    public final void setTagList(@Nullable List<String> list) {
        this.tagList = list;
    }
}
