package com.xiaomi.fitness.trail.widget;

import android.util.ArrayMap;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010%\n\u0002\b\u0019\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005J\"\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00052\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\"J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005J\u0016\u0010,\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u00106\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0005J\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u00109\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u001e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\"X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\"0\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/MonthPanelStyle;", "", "<init>", "()V", "value", "", "dateNumCommonColor", "getDateNumCommonColor", "()I", "dateNumTextSize", "getDateNumTextSize", "dateNumWidth", "getDateNumWidth", "dateNumHeight", "getDateNumHeight", "decroMarginToCenter", "getDecroMarginToCenter", "decroRadius", "getDecroRadius", "selectedCircleColor", "getSelectedCircleColor", "selectedDateNumColor", "getSelectedDateNumColor", "selectedCircleRadius", "getSelectedCircleRadius", "selectedCircleWidth", "getSelectedCircleWidth", "bgCircleRadius", "getBgCircleRadius", "selectBackground", "getSelectBackground", "todayColor", "getTodayColor", "mDecorateColorMap", "", "mDateStateColorMap", "addDecorateColor", "type", "color", "getDecorateColor", "addMonthDateNumPropertyColor", "dateState", "propertyMap", "property", "getMonthDateNumPropertyColor", "setDateNumCommonColor", "setDateNumTextSize", "setDateNumWidth", "setDateNumHeight", "setSelectedCircleColor", "setSelectedDateNumColor", "setSelectedCircleRadius", "setBgCircleRadius", "setSelectedCircleWidth", "setSelectedBackground", "setTodayColor", "setDecroMarginToCenter", "setDecroRadius", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MonthPanelStyle {
    public static final int NO_COLOR = Integer.MIN_VALUE;
    private int dateNumCommonColor = -16777216;
    private int dateNumTextSize = 55;
    private int dateNumWidth = 140;
    private int dateNumHeight = 140;
    private int decroMarginToCenter = 70;
    private int decroRadius = 6;
    private int selectedCircleColor = -16776961;
    private int selectedDateNumColor = MenuBuilder.CATEGORY_MASK;
    private int selectedCircleRadius = 70;
    private int selectedCircleWidth = 3;
    private int bgCircleRadius = 44;
    private int selectBackground = -1;
    private int todayColor = Integer.MIN_VALUE;

    @NotNull
    private final Map<Integer, Integer> mDecorateColorMap = new ArrayMap();

    @NotNull
    private final Map<Integer, Map<Integer, Integer>> mDateStateColorMap = new ArrayMap();

    @NotNull
    public final MonthPanelStyle addDecorateColor(int type, int color) {
        this.mDecorateColorMap.put(Integer.valueOf(type), Integer.valueOf(color));
        return this;
    }

    @NotNull
    public final MonthPanelStyle addMonthDateNumPropertyColor(int dateState, @NotNull Map<Integer, Integer> propertyMap) {
        Intrinsics.checkNotNullParameter(propertyMap, "propertyMap");
        Map<Integer, Integer> map = this.mDateStateColorMap.get(Integer.valueOf(dateState));
        if (map == null) {
            this.mDateStateColorMap.put(Integer.valueOf(dateState), propertyMap);
        } else {
            map.putAll(propertyMap);
        }
        return this;
    }

    public final int getBgCircleRadius() {
        return this.bgCircleRadius;
    }

    public final int getDateNumCommonColor() {
        return this.dateNumCommonColor;
    }

    public final int getDateNumHeight() {
        return this.dateNumHeight;
    }

    public final int getDateNumTextSize() {
        return this.dateNumTextSize;
    }

    public final int getDateNumWidth() {
        return this.dateNumWidth;
    }

    public final int getDecorateColor(int type) {
        Integer num = this.mDecorateColorMap.get(Integer.valueOf(type));
        return num != null ? num.intValue() : MenuBuilder.CATEGORY_MASK;
    }

    public final int getDecroMarginToCenter() {
        return this.decroMarginToCenter;
    }

    public final int getDecroRadius() {
        return this.decroRadius;
    }

    public final int getMonthDateNumPropertyColor(int dateState, int property) {
        Integer num;
        Map<Integer, Integer> map = this.mDateStateColorMap.get(Integer.valueOf(dateState));
        if (map == null || (num = map.get(Integer.valueOf(property))) == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    public final int getSelectBackground() {
        return this.selectBackground;
    }

    public final int getSelectedCircleColor() {
        return this.selectedCircleColor;
    }

    public final int getSelectedCircleRadius() {
        return this.selectedCircleRadius;
    }

    public final int getSelectedCircleWidth() {
        return this.selectedCircleWidth;
    }

    public final int getSelectedDateNumColor() {
        return this.selectedDateNumColor;
    }

    public final int getTodayColor() {
        return this.todayColor;
    }

    @NotNull
    public final MonthPanelStyle setBgCircleRadius(int bgCircleRadius) {
        this.bgCircleRadius = bgCircleRadius;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setDateNumCommonColor(int dateNumCommonColor) {
        this.dateNumCommonColor = dateNumCommonColor;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setDateNumHeight(int dateNumHeight) {
        this.dateNumHeight = dateNumHeight;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setDateNumTextSize(int dateNumTextSize) {
        this.dateNumTextSize = dateNumTextSize;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setDateNumWidth(int dateNumWidth) {
        this.dateNumWidth = dateNumWidth;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setDecroMarginToCenter(int decroMarginToCenter) {
        this.decroMarginToCenter = decroMarginToCenter;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setDecroRadius(int decroRadius) {
        this.decroRadius = decroRadius;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setSelectedBackground(int selectBackground) {
        this.selectBackground = selectBackground;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setSelectedCircleColor(int selectedCircleColor) {
        this.selectedCircleColor = selectedCircleColor;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setSelectedCircleRadius(int selectedCircleRadius) {
        this.selectedCircleRadius = selectedCircleRadius;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setSelectedCircleWidth(int selectedCircleWidth) {
        this.selectedCircleWidth = selectedCircleWidth;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setSelectedDateNumColor(int selectedDateNumColor) {
        this.selectedDateNumColor = selectedDateNumColor;
        return this;
    }

    @NotNull
    public final MonthPanelStyle setTodayColor(int todayColor) {
        this.todayColor = todayColor;
        return this;
    }

    @NotNull
    public final MonthPanelStyle addMonthDateNumPropertyColor(int dateState, int property, int color) {
        Map<Integer, Integer> map = this.mDateStateColorMap.get(Integer.valueOf(dateState));
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put(Integer.valueOf(property), Integer.valueOf(color));
            this.mDateStateColorMap.put(Integer.valueOf(dateState), arrayMap);
        } else {
            map.put(Integer.valueOf(property), Integer.valueOf(color));
        }
        return this;
    }
}
