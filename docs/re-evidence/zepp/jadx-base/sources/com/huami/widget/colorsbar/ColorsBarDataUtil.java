package com.huami.widget.colorsbar;

import androidx.core.internal.view.SupportMenu;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/widget/colorsbar/ColorsBarDataUtil;", "", "Lcom/huami/widget/colorsbar/ColorsBarData;", "getDefaultData", "<init>", "()V", "colorsbar_release"}, k = 1, mv = {1, 4, 0})
public final class ColorsBarDataUtil {
    public static final ColorsBarDataUtil INSTANCE = new ColorsBarDataUtil();

    private ColorsBarDataUtil() {
    }

    @NotNull
    public final ColorsBarData getDefaultData() {
        return new ColorsBarData(CollectionsKt__CollectionsKt.mutableListOf(1, 40, 60, 80, 100), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-16776961, -7829368, Integer.valueOf(SupportMenu.CATEGORY_MASK), -16711936}), 88);
    }
}
