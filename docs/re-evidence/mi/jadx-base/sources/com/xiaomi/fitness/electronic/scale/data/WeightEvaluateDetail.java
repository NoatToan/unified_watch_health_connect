package com.xiaomi.fitness.electronic.scale.data;

import com.xiaomi.fitness.baseui.widget.LevelBarView;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B?\b\u0016\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/WeightEvaluateDetail;", "", "levelItems", "", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "evaluateShortDesc", "", "evaluateDetailDesc", "currentLevelPosition", "", "abnormal", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)V", "getLevelItems", "()Ljava/util/List;", "setLevelItems", "(Ljava/util/List;)V", "getEvaluateDetailDesc", "()Ljava/lang/String;", "setEvaluateDetailDesc", "(Ljava/lang/String;)V", "getEvaluateShortDesc", "setEvaluateShortDesc", "getCurrentLevelPosition", "()I", "setCurrentLevelPosition", "(I)V", "getAbnormal", "()Ljava/lang/Boolean;", "setAbnormal", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightEvaluateDetail {

    @Nullable
    private Boolean abnormal;
    private int currentLevelPosition;

    @Nullable
    private String evaluateDetailDesc;

    @Nullable
    private String evaluateShortDesc;

    @Nullable
    private List<? extends LevelBarView.LevelItem> levelItems;

    public WeightEvaluateDetail(@Nullable List<? extends LevelBarView.LevelItem> list, @Nullable String str, @Nullable String str2, int i, @Nullable Boolean bool) {
        this.levelItems = list;
        this.evaluateShortDesc = str;
        this.evaluateDetailDesc = str2;
        this.currentLevelPosition = i;
        this.abnormal = bool;
    }

    @Nullable
    public final Boolean getAbnormal() {
        return this.abnormal;
    }

    public final int getCurrentLevelPosition() {
        return this.currentLevelPosition;
    }

    @Nullable
    public final String getEvaluateDetailDesc() {
        return this.evaluateDetailDesc;
    }

    @Nullable
    public final String getEvaluateShortDesc() {
        return this.evaluateShortDesc;
    }

    @Nullable
    public final List<LevelBarView.LevelItem> getLevelItems() {
        return this.levelItems;
    }

    public final void setAbnormal(@Nullable Boolean bool) {
        this.abnormal = bool;
    }

    public final void setCurrentLevelPosition(int i) {
        this.currentLevelPosition = i;
    }

    public final void setEvaluateDetailDesc(@Nullable String str) {
        this.evaluateDetailDesc = str;
    }

    public final void setEvaluateShortDesc(@Nullable String str) {
        this.evaluateShortDesc = str;
    }

    public final void setLevelItems(@Nullable List<? extends LevelBarView.LevelItem> list) {
        this.levelItems = list;
    }
}
