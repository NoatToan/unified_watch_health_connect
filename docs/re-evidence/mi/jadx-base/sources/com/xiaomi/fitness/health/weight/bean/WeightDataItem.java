package com.xiaomi.fitness.health.weight.bean;

import com.xiaomi.fitness.baseui.widget.PercentLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b&\u0018\u00002\u00020\u0001Bm\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\"R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "", "type", "", "valueStr", "", "unitStr", "labelStr", "itemAbnormal", "", "levelItems", "", "Lcom/xiaomi/fitness/baseui/widget/PercentLevel;", "evaluateShortDesc", "evaluateDetailDesc", "currentLevelPosition", "currentLevelPositionPercent", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;IF)V", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getValueStr", "()Ljava/lang/String;", "setValueStr", "(Ljava/lang/String;)V", "getUnitStr", "setUnitStr", "getLabelStr", "setLabelStr", "getItemAbnormal", "()Z", "setItemAbnormal", "(Z)V", "jumpEnable", "getJumpEnable", "getLevelItems", "()Ljava/util/List;", "setLevelItems", "(Ljava/util/List;)V", "getEvaluateShortDesc", "setEvaluateShortDesc", "getEvaluateDetailDesc", "setEvaluateDetailDesc", "getCurrentLevelPosition", "()I", "setCurrentLevelPosition", "(I)V", "getCurrentLevelPositionPercent", "()F", "setCurrentLevelPositionPercent", "(F)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightDataItem {
    private int currentLevelPosition;
    private float currentLevelPositionPercent;

    @Nullable
    private String evaluateDetailDesc;

    @Nullable
    private String evaluateShortDesc;
    private boolean itemAbnormal;

    @Nullable
    private String labelStr;

    @Nullable
    private List<? extends PercentLevel> levelItems;

    @Nullable
    private Integer type;

    @Nullable
    private String unitStr;

    @Nullable
    private String valueStr;

    public WeightDataItem(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable List<? extends PercentLevel> list, @Nullable String str4, @Nullable String str5, int i, float f) {
        this.type = num;
        this.valueStr = str;
        this.unitStr = str2;
        this.labelStr = str3;
        this.itemAbnormal = z;
        this.levelItems = list;
        this.evaluateShortDesc = str4;
        this.evaluateDetailDesc = str5;
        this.currentLevelPosition = i;
        this.currentLevelPositionPercent = f;
    }

    public final int getCurrentLevelPosition() {
        return this.currentLevelPosition;
    }

    public final float getCurrentLevelPositionPercent() {
        return this.currentLevelPositionPercent;
    }

    @Nullable
    public final String getEvaluateDetailDesc() {
        return this.evaluateDetailDesc;
    }

    @Nullable
    public final String getEvaluateShortDesc() {
        return this.evaluateShortDesc;
    }

    public final boolean getItemAbnormal() {
        return this.itemAbnormal;
    }

    public final boolean getJumpEnable() {
        List<? extends PercentLevel> list = this.levelItems;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if ((!list.isEmpty()) && this.currentLevelPosition >= 0) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String getLabelStr() {
        return this.labelStr;
    }

    @Nullable
    public final List<PercentLevel> getLevelItems() {
        return this.levelItems;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getUnitStr() {
        return this.unitStr;
    }

    @Nullable
    public final String getValueStr() {
        return this.valueStr;
    }

    public final void setCurrentLevelPosition(int i) {
        this.currentLevelPosition = i;
    }

    public final void setCurrentLevelPositionPercent(float f) {
        this.currentLevelPositionPercent = f;
    }

    public final void setEvaluateDetailDesc(@Nullable String str) {
        this.evaluateDetailDesc = str;
    }

    public final void setEvaluateShortDesc(@Nullable String str) {
        this.evaluateShortDesc = str;
    }

    public final void setItemAbnormal(boolean z) {
        this.itemAbnormal = z;
    }

    public final void setLabelStr(@Nullable String str) {
        this.labelStr = str;
    }

    public final void setLevelItems(@Nullable List<? extends PercentLevel> list) {
        this.levelItems = list;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setUnitStr(@Nullable String str) {
        this.unitStr = str;
    }

    public final void setValueStr(@Nullable String str) {
        this.valueStr = str;
    }
}
