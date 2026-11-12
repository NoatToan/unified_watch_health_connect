package com.xiaomi.fitness.interfaces;

import android.graphics.Rect;
import com.xiaomi.fitness.trail.widget.MonthPanelStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/interfaces/ISetter;", "", "setMonthPanelStyle", "", "style", "Lcom/xiaomi/fitness/trail/widget/MonthPanelStyle;", "setMainArea", "area", "Landroid/graphics/Rect;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISetter {
    void setMainArea(@Nullable Rect area);

    void setMonthPanelStyle(@Nullable MonthPanelStyle style);
}
