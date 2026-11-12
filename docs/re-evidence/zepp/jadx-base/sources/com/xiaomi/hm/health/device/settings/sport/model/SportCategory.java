package com.xiaomi.hm.health.device.settings.sport.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/model/SportCategory;", "", "", "nameResId", LogUtil.I, "getNameResId", "()I", "", "sportTypes", "[Ljava/lang/Integer;", "getSportTypes", "()[Ljava/lang/Integer;", "<init>", "(Ljava/lang/String;II[Ljava/lang/Integer;)V", "WALK_RUN", "BIKE", "SWIM", "OUTDOOR", "INDOOR", "DANCE", "FIGHT", "BALL", "WATER", "SNOW", "RELAX", MeasureStateValue.OTHER, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum SportCategory {
    WALK_RUN(R.string.sport_category_walk_run, new Integer[]{1, 6, 8, 40, 7, 131}),
    BIKE(R.string.sport_category_bike, new Integer[]{9, 10, 47, 48}),
    SWIM(R.string.sport_category_swim, new Integer[]{14, 15}),
    OUTDOOR(R.string.sport_category_outdoor, new Integer[]{13, 22, 110, 70, 64, 63, 67, 69, 129}),
    INDOOR(R.string.sport_category_indoor, new Integer[]{12, 23, 54, 58, 24, 51, 130, 109, 111, 114, 52, 57, 50, 55, 56, 49, 60, 61, 59, 53}),
    DANCE(R.string.sport_category_dance, new Integer[]{73, 75, 72, 71, 74, 77, 112, 113, 76}),
    FIGHT(R.string.sport_category_fight, new Integer[]{97, 99, 103, 100, 101, 98, 102, 96, 104, 95}),
    BALL(R.string.lose_weight_sport_category_ball, new Integer[]{18, 121, 85, 88, 122, 79, 86, 82, 90, 89, 92, 17, 81, 87, 78, 91, 80, 83}),
    WATER(R.string.sport_category_water, new Integer[]{66, 65, 62, 106, 68, 124, 123}),
    SNOW(R.string.sport_category_snow, new Integer[]{11, 105, 42, 43, 46, 127, 128, 44, 45, 41, 125, 126}),
    RELAX(R.string.sport_category_relax, new Integer[]{115, 116, 117, 118, 119, 120}),
    OTHER(R.string.sport_category_other, new Integer[]{2001, 2002, 21, 93, 94, 108, 132, 133});

    private final int nameResId;

    @NotNull
    private final Integer[] sportTypes;

    SportCategory(int i, Integer[] numArr) {
        this.nameResId = i;
        this.sportTypes = numArr;
    }

    public final int getNameResId() {
        return this.nameResId;
    }

    @NotNull
    public final Integer[] getSportTypes() {
        return this.sportTypes;
    }
}
