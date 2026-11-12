package com.fitness.banner.compare;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.fitness.banner.export.compare.ABTestResponseResult;
import com.fitness.banner.export.compare.BannerRequest;
import com.fitness.banner.export.compare.ICompare;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0016\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016H\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096@¢\u0006\u0002\u0010\u001dR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/fitness/banner/compare/CompareImpl;", "Lcom/fitness/banner/export/compare/ICompare;", "<init>", "()V", "bannerRequest", "Lcom/fitness/banner/export/compare/BannerRequest;", "getBannerRequest", "()Lcom/fitness/banner/export/compare/BannerRequest;", "setBannerRequest", "(Lcom/fitness/banner/export/compare/BannerRequest;)V", "showAppV4Enable", "", "updateShowAppV4Enable", "", "enable", "getLayerName", "", "setLayerName", "layerName", "getGroupId", "setGroupId", "groupIds", "", "getTestResult", "Lcom/fitness/banner/export/compare/ABTestResponseResult;", "testType", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "(ILcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompareImpl implements ICompare {
    public BannerRequest bannerRequest;

    @NotNull
    public final BannerRequest getBannerRequest() {
        BannerRequest bannerRequest = this.bannerRequest;
        if (bannerRequest != null) {
            return bannerRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bannerRequest");
        return null;
    }

    @Override // com.fitness.banner.export.compare.ICompare
    @NotNull
    public String getGroupId() {
        return ComparePreference.INSTANCE.getAB_TEST_GROUP_IDS();
    }

    @Override // com.fitness.banner.export.compare.ICompare
    @NotNull
    public String getLayerName() {
        return ComparePreference.INSTANCE.getAB_TEST_LAYER_NAME();
    }

    @Override // com.fitness.banner.export.compare.ICompare
    @Nullable
    public Object getTestResult(int i, @Nullable WearableDeviceModel wearableDeviceModel, @NotNull Continuation<? super ABTestResponseResult> continuation) {
        return getBannerRequest().getABTestResult(i, AppUtil.getVersionName(), wearableDeviceModel, continuation);
    }

    public final void setBannerRequest(@NotNull BannerRequest bannerRequest) {
        Intrinsics.checkNotNullParameter(bannerRequest, "<set-?>");
        this.bannerRequest = bannerRequest;
    }

    @Override // com.fitness.banner.export.compare.ICompare
    public void setGroupId(@NotNull List<String> groupIds) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        ComparePreference comparePreference = ComparePreference.INSTANCE;
        Set mutableSet = CollectionsKt___CollectionsKt.toMutableSet(StringsKt__StringsKt.split$default((CharSequence) comparePreference.getAB_TEST_GROUP_IDS(), new String[]{","}, false, 0, 6, (Object) null));
        mutableSet.addAll(groupIds);
        comparePreference.setAB_TEST_GROUP_IDS(CollectionsKt___CollectionsKt.joinToString$default(mutableSet, ",", null, null, 0, null, null, 62, null));
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).setCommonProperty();
    }

    @Override // com.fitness.banner.export.compare.ICompare
    public void setLayerName(@NotNull String layerName) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        ComparePreference.INSTANCE.setAB_TEST_LAYER_NAME(layerName);
    }

    @Override // com.fitness.banner.export.compare.ICompare
    public boolean showAppV4Enable() {
        return ComparePreference.INSTANCE.getShowAppV4Enable();
    }

    @Override // com.fitness.banner.export.compare.ICompare
    public void updateShowAppV4Enable(boolean enable) {
        ComparePreference.INSTANCE.updateShowAppV4Enable(enable);
    }
}
