package com.fitness.banner.export;

import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerTimeConfig;
import com.fitness.banner.export.v2.DisplayExtra;
import com.fitness.banner.export.v2.SourceItem;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/fitness/banner/export/BannerHelper;", "", "<init>", "()V", "TAG", "", "findFirstNotNullImgUrl", "Lcom/fitness/banner/export/v2/SourceItem;", "smallPic", "", "needInterceptBannerShow", "bannerItem", "Lcom/fitness/banner/export/v2/BannerItemDetail;", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerHelper {

    @NotNull
    public static final BannerHelper INSTANCE = new BannerHelper();

    @NotNull
    public static final String TAG = "BannerHelper";

    private BannerHelper() {
    }

    @Nullable
    public final String findFirstNotNullImgUrl(@Nullable SourceItem sourceItem, boolean z) {
        String padIconLarge;
        if (sourceItem == null) {
            return null;
        }
        int screenState = UIUtils.INSTANCE.getScreenState();
        Logger.d(TAG, "findFirstNotNullImgUrl uiState=" + screenState + " halfPic=" + z);
        if (z) {
            if (screenState != 0) {
                if (screenState != 1 && screenState != 2) {
                    return sourceItem.getIconDefaultUrl();
                }
            }
            padIconLarge = sourceItem.getPadIconSmall();
            if (padIconLarge == null) {
                return sourceItem.getIconDefaultUrl();
            }
        } else {
            if (screenState != 0) {
                if (screenState != 1 && screenState != 2) {
                    return sourceItem.getIconLarge();
                }
            }
            padIconLarge = sourceItem.getPadIconLarge();
            if (padIconLarge == null) {
                return sourceItem.getIconLarge();
            }
        }
        return padIconLarge;
    }

    public final boolean needInterceptBannerShow(@NotNull BannerItemDetail bannerItem) {
        Long closeTimeInSecond;
        Long clickTimeInSecond;
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        int bannerId = bannerItem.getBannerId();
        DisplayExtra displayExtra = bannerItem.getDisplayExtra();
        if (displayExtra != null && displayExtra.getDestroyEnable()) {
            List<Integer> destroyTypeList = displayExtra != null ? displayExtra.getDestroyTypeList() : null;
            List<Integer> list = destroyTypeList;
            if (list != null && !list.isEmpty()) {
                BannerTimeConfig bannerTimeConfig = BannerExtKt.getINSTANCE(IBanner.INSTANCE).getBannerTimeConfig(bannerId);
                Long startTime = bannerItem.getStartTime();
                long jLongValue = startTime != null ? startTime.longValue() : 0L;
                Long endTime = bannerItem.getEndTime();
                long jLongValue2 = endTime != null ? endTime.longValue() : 0L;
                Logger.i(TAG, "checkInterceptBannerShow " + bannerTimeConfig + ";start:" + jLongValue + ";end:" + jLongValue2 + ";destroyTypeList " + destroyTypeList);
                if (destroyTypeList.contains(1)) {
                    long jLongValue3 = (bannerTimeConfig == null || (clickTimeInSecond = bannerTimeConfig.getClickTimeInSecond()) == null) ? 0L : clickTimeInSecond.longValue();
                    if (jLongValue3 > 0 && jLongValue <= jLongValue3 && jLongValue3 <= jLongValue2) {
                        return true;
                    }
                }
                if (destroyTypeList.contains(2)) {
                    long jLongValue4 = (bannerTimeConfig == null || (closeTimeInSecond = bannerTimeConfig.getCloseTimeInSecond()) == null) ? 0L : closeTimeInSecond.longValue();
                    if (jLongValue4 > 0 && jLongValue <= jLongValue4 && jLongValue4 <= jLongValue2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
