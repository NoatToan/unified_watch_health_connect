package com.huami.bluetooth.business;

import com.google.android.gms.common.Scopes;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&J#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/business/IScaleMeasureApi;", "", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", Scopes.PROFILE, "", "setChannel", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "callback", "registerMeasureListener", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "registerDeviceInfoCallback", "registerConnectCallback", "", "userId", ParamKey.memberId, "", "selectUser", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "breakMeasure", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IScaleMeasureApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/business/IScaleMeasureApi$Companion;", "", "Lcom/huami/bluetooth/business/ScaleMeasureOwner;", "scaleMeasureOwner", "Lcom/huami/bluetooth/business/IScaleMeasureApi;", "of", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        @NotNull
        public final IScaleMeasureApi of(@NotNull ScaleMeasureOwner scaleMeasureOwner) {
            return scaleMeasureOwner.getScaleMeasureApi();
        }
    }

    @Nullable
    Object breakMeasure(@NotNull Continuation<? super Boolean> continuation);

    void registerConnectCallback(@NotNull Function0<Unit> callback);

    void registerDeviceInfoCallback(@NotNull Function0<DeviceInfo> callback);

    void registerMeasureListener(@NotNull HMCallback<WeightAdvData> callback);

    @Nullable
    Object selectUser(long j, long j2, @NotNull Continuation<? super Boolean> continuation);

    void setChannel(@NotNull BaseProfile profile);
}
