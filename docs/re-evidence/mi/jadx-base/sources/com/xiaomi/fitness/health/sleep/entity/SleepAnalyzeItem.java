package com.xiaomi.fitness.health.sleep.entity;

import com.xiaomi.fitness.health.sleep.ui.SleepLevel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010#\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/entity/SleepAnalyzeItem;", "Ljava/io/Serializable;", "<init>", "()V", "titleStr", "", "getTitleStr", "()Ljava/lang/String;", "setTitleStr", "(Ljava/lang/String;)V", "levelItems", "", "Lcom/xiaomi/fitness/health/sleep/ui/SleepLevel;", "getLevelItems", "()Ljava/util/List;", "setLevelItems", "(Ljava/util/List;)V", "evaluationCoreStr", "getEvaluationCoreStr", "setEvaluationCoreStr", "analyzeDetailStr", "getAnalyzeDetailStr", "setAnalyzeDetailStr", "selectPosition", "", "getSelectPosition", "()I", "setSelectPosition", "(I)V", "selectPercent", "", "getSelectPercent", "()F", "setSelectPercent", "(F)V", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepAnalyzeItem implements Serializable {

    @Nullable
    private String analyzeDetailStr;

    @Nullable
    private String evaluationCoreStr;

    @Nullable
    private List<? extends SleepLevel> levelItems;
    private float selectPercent;
    private int selectPosition;

    @Nullable
    private String titleStr;

    @Nullable
    public final String getAnalyzeDetailStr() {
        return this.analyzeDetailStr;
    }

    @Nullable
    public final String getEvaluationCoreStr() {
        return this.evaluationCoreStr;
    }

    @Nullable
    public final List<SleepLevel> getLevelItems() {
        return this.levelItems;
    }

    public final float getSelectPercent() {
        return this.selectPercent;
    }

    public final int getSelectPosition() {
        return this.selectPosition;
    }

    @Nullable
    public final String getTitleStr() {
        return this.titleStr;
    }

    public final void setAnalyzeDetailStr(@Nullable String str) {
        this.analyzeDetailStr = str;
    }

    public final void setEvaluationCoreStr(@Nullable String str) {
        this.evaluationCoreStr = str;
    }

    public final void setLevelItems(@Nullable List<? extends SleepLevel> list) {
        this.levelItems = list;
    }

    public final void setSelectPercent(float f) {
        this.selectPercent = f;
    }

    public final void setSelectPosition(int i) {
        this.selectPosition = i;
    }

    public final void setTitleStr(@Nullable String str) {
        this.titleStr = str;
    }

    @NotNull
    public String toString() {
        return "SleepAnalyzeItem(titleStr=" + this.titleStr + ", levelItems=" + this.levelItems + ", evaluationCoreStr=" + this.evaluationCoreStr + ", selectPosition=" + this.selectPosition + ", selectPercent=" + this.selectPercent + ")";
    }
}
