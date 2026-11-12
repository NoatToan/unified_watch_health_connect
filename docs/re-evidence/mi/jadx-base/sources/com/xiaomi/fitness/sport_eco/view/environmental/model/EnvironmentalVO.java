package com.xiaomi.fitness.sport_eco.view.environmental.model;

import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010)\u001a\u0004\u0018\u00010\u0018J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0005R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0005R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\u0005R\u001c\u0010 \u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001e\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\u0005R\u001e\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\u0005¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EnvironmentalVO;", "", SportDataTypeKt.DIMEN_TOTAL, "", "<init>", "(Ljava/lang/Integer;)V", "getTotal", "()Ljava/lang/Integer;", "setTotal", "Ljava/lang/Integer;", "percent", "", "getPercent", "()Ljava/lang/Float;", "setPercent", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "currentLevel", "getCurrentLevel", "setCurrentLevel", "nextLevel", "getNextLevel", "setNextLevel", "currentLevelDes", "", "getCurrentLevelDes", "()Ljava/lang/String;", "setCurrentLevelDes", "(Ljava/lang/String;)V", "currentLevelDesResId", "getCurrentLevelDesResId", "setCurrentLevelDesResId", "nextLevelDes", "getNextLevelDes", "setNextLevelDes", "curDrawableId", "getCurDrawableId", "setCurDrawableId", "nextDrawableId", "getNextDrawableId", "setNextDrawableId", "getTotalValue", "component1", "copy", "(Ljava/lang/Integer;)Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EnvironmentalVO;", "equals", "", "other", "hashCode", "toString", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnvironmentalVO {
    public static final int LEVEL_0 = 0;
    public static final int LEVEL_1 = 1;
    public static final int LEVEL_10 = 10;
    public static final int LEVEL_2 = 2;
    public static final int LEVEL_3 = 3;
    public static final int LEVEL_4 = 4;
    public static final int LEVEL_5 = 5;
    public static final int LEVEL_6 = 6;
    public static final int LEVEL_7 = 7;
    public static final int LEVEL_8 = 8;
    public static final int LEVEL_9 = 9;

    @Nullable
    private Integer curDrawableId;

    @Nullable
    private Integer currentLevel;

    @Nullable
    private String currentLevelDes;

    @Nullable
    private Integer currentLevelDesResId;

    @Nullable
    private Integer nextDrawableId;

    @Nullable
    private Integer nextLevel;

    @Nullable
    private String nextLevelDes;

    @Nullable
    private Float percent;

    @Nullable
    private Integer total;

    /* JADX WARN: Multi-variable type inference failed */
    public EnvironmentalVO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EnvironmentalVO copy$default(EnvironmentalVO environmentalVO, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = environmentalVO.total;
        }
        return environmentalVO.copy(num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTotal() {
        return this.total;
    }

    @NotNull
    public final EnvironmentalVO copy(@Nullable Integer total) {
        return new EnvironmentalVO(total);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EnvironmentalVO) && Intrinsics.areEqual(this.total, ((EnvironmentalVO) other).total);
    }

    @Nullable
    public final Integer getCurDrawableId() {
        return this.curDrawableId;
    }

    @Nullable
    public final Integer getCurrentLevel() {
        return this.currentLevel;
    }

    @Nullable
    public final String getCurrentLevelDes() {
        return this.currentLevelDes;
    }

    @Nullable
    public final Integer getCurrentLevelDesResId() {
        return this.currentLevelDesResId;
    }

    @Nullable
    public final Integer getNextDrawableId() {
        return this.nextDrawableId;
    }

    @Nullable
    public final Integer getNextLevel() {
        return this.nextLevel;
    }

    @Nullable
    public final String getNextLevelDes() {
        return this.nextLevelDes;
    }

    @Nullable
    public final Float getPercent() {
        return this.percent;
    }

    @Nullable
    public final Integer getTotal() {
        return this.total;
    }

    @Nullable
    public final String getTotalValue() {
        Double dValueOf = null;
        if (this.total != null) {
            Integer num = this.total;
            Intrinsics.checkNotNull(num);
            if (num.intValue() > 999) {
                Integer num2 = this.total;
                Intrinsics.checkNotNull(num2);
                dValueOf = Double.valueOf(new BigDecimal(num2.intValue()).divide(new BigDecimal(1000), 2, RoundingMode.HALF_UP).doubleValue());
            } else {
                Integer num3 = this.total;
                if (num3 != null) {
                    dValueOf = Double.valueOf(num3.intValue());
                }
            }
        }
        Intrinsics.checkNotNull(dValueOf);
        if (dValueOf.doubleValue() > 999000.0d) {
            return "999.9K";
        }
        return dValueOf + "K";
    }

    public int hashCode() {
        Integer num = this.total;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setCurDrawableId(@Nullable Integer num) {
        this.curDrawableId = num;
    }

    public final void setCurrentLevel(@Nullable Integer num) {
        this.currentLevel = num;
    }

    public final void setCurrentLevelDes(@Nullable String str) {
        this.currentLevelDes = str;
    }

    public final void setCurrentLevelDesResId(@Nullable Integer num) {
        this.currentLevelDesResId = num;
    }

    public final void setNextDrawableId(@Nullable Integer num) {
        this.nextDrawableId = num;
    }

    public final void setNextLevel(@Nullable Integer num) {
        this.nextLevel = num;
    }

    public final void setNextLevelDes(@Nullable String str) {
        this.nextLevelDes = str;
    }

    public final void setPercent(@Nullable Float f) {
        this.percent = f;
    }

    public final void setTotal(@Nullable Integer num) {
        this.total = num;
    }

    @NotNull
    public String toString() {
        return "EnvironmentalVO(total=" + this.total + ")";
    }

    public EnvironmentalVO(@Nullable Integer num) {
        this.total = num;
    }

    public /* synthetic */ EnvironmentalVO(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
