package com.xiaomi.hm.health.utils;

import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "", "size", "", "unit", "", "boldTitle", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class BaseTitleStyleKt {
    public static final void boldTitle(@NotNull BaseTitleActivity baseTitleActivity, float f, int i) {
        baseTitleActivity.getTitleTextView().setTextSize(i, f);
        TypefaceManager.get().applyTypeface(baseTitleActivity.getTitleTextView(), SportAnalytics.ParamValue.MapButtonType.KM);
    }

    public static /* synthetic */ void boldTitle$default(BaseTitleActivity baseTitleActivity, float f, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        boldTitle(baseTitleActivity, f, i);
    }
}
