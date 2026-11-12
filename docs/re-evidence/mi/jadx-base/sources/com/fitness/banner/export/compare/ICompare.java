package com.fitness.banner.export.compare;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH&J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H¦@¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/fitness/banner/export/compare/ICompare;", "", "showAppV4Enable", "", "updateShowAppV4Enable", "", "enable", "getLayerName", "", "setLayerName", "layerName", "getGroupId", "setGroupId", "groupIds", "", "getTestResult", "Lcom/fitness/banner/export/compare/ABTestResponseResult;", "testType", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "(ILcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ICompare {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fitness/banner/export/compare/ICompare$Companion;", "", "<init>", "()V", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getTestResult$default(ICompare iCompare, int i, WearableDeviceModel wearableDeviceModel, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTestResult");
            }
            if ((i2 & 2) != 0) {
                wearableDeviceModel = null;
            }
            return iCompare.getTestResult(i, wearableDeviceModel, continuation);
        }
    }

    @NotNull
    String getGroupId();

    @NotNull
    String getLayerName();

    @Nullable
    Object getTestResult(int i, @Nullable WearableDeviceModel wearableDeviceModel, @NotNull Continuation<? super ABTestResponseResult> continuation);

    void setGroupId(@NotNull List<String> groupIds);

    void setLayerName(@NotNull String layerName);

    boolean showAppV4Enable();

    void updateShowAppV4Enable(boolean enable);
}
