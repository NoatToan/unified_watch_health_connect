package com.xiaomi.hm.health.play.repo;

import com.xiaomi.hm.health.play.PlayTabType;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.play.bean.SortTool;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H&J\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H&¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/play/repo/IToolRepo;", "", "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", "", "Lcom/xiaomi/hm/health/play/PlayTool;", "getSupportAndSortTools", "getTabAllTools", "tools", "getSupportTools", "getSortTools", "Lcom/xiaomi/hm/health/play/bean/SortTool;", "getSaveTools", "", "saveToolsToLocal", "saveToolsToCloud", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IToolRepo {
    @NotNull
    List<SortTool> getSaveTools(@NotNull PlayTabType tabType);

    @NotNull
    List<PlayTool> getSortTools(@NotNull PlayTabType tabType, @NotNull List<PlayTool> tools);

    @NotNull
    List<PlayTool> getSupportAndSortTools(@NotNull PlayTabType tabType);

    @NotNull
    List<PlayTool> getSupportTools(@NotNull List<PlayTool> tools);

    @NotNull
    List<PlayTool> getTabAllTools(@NotNull PlayTabType tabType);

    void saveToolsToCloud(@NotNull PlayTabType tabType, @NotNull List<SortTool> tools);

    void saveToolsToLocal(@NotNull PlayTabType tabType, @NotNull List<SortTool> tools);
}
