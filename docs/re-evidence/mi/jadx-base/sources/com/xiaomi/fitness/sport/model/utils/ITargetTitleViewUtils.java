package com.xiaomi.fitness.sport.model.utils;

import android.content.Context;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/model/utils/ITargetTitleViewUtils;", "Ljava/io/Serializable;", "getSportType", "", "needShowTargetView", "", "buildProgressPercentage", "sportInfo", "Lcom/xiaomi/fitness/sport/model/utils/SportInfo;", "buildProgressValue", "buildProgressDetail", "context", "Landroid/content/Context;", "buildMajorData", "buildUnit", "processSportListData", "", "list", "", "Lcom/xiaomi/fitness/sport/bean/SportingItemData;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ITargetTitleViewUtils extends Serializable {
    @NotNull
    String buildMajorData(@NotNull SportInfo sportInfo);

    @NotNull
    String buildProgressDetail(@NotNull Context context, @NotNull SportInfo sportInfo);

    @NotNull
    String buildProgressPercentage(@NotNull SportInfo sportInfo);

    @NotNull
    String buildProgressValue(@NotNull SportInfo sportInfo);

    @NotNull
    String buildUnit(@NotNull Context context, @NotNull SportInfo sportInfo);

    @NotNull
    String getSportType();

    boolean needShowTargetView();

    void processSportListData(@NotNull Context context, @NotNull SportInfo sportInfo, @NotNull List<SportingItemData> list);
}
