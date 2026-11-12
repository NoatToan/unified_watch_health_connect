package com.xiaomi.hm.health.healthdata.ui.view;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/ColoredProgressBarBuilder;", "", "", "", "getColors", "()Ljava/util/List;", "colors", "", "getLevelHints", "levelHints", "getSectionValues", "sectionValues", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface ColoredProgressBarBuilder {
    @NotNull
    List<Integer> getColors();

    @NotNull
    List<String> getLevelHints();

    @NotNull
    List<String> getSectionValues();
}
