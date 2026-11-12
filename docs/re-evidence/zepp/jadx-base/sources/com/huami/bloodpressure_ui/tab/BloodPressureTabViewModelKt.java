package com.huami.bloodpressure_ui.tab;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lcom/huami/bloodpressure_ui/tab/TimeMode;", "getTimeModeByOrdinal", "(Ljava/lang/Integer;)Lcom/huami/bloodpressure_ui/tab/TimeMode;", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureTabViewModelKt {
    @NotNull
    public static final TimeMode getTimeModeByOrdinal(@Nullable Integer num) {
        TimeMode timeMode = null;
        if (num != null) {
            int iIntValue = num.intValue();
            for (TimeMode timeMode2 : TimeMode.values()) {
                if (timeMode2.ordinal() == iIntValue) {
                    timeMode = timeMode2;
                    break;
                }
            }
            if (timeMode == null) {
                timeMode = TimeMode.DAY;
            }
        }
        return timeMode == null ? TimeMode.DAY : timeMode;
    }
}
