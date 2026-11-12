package com.huami.feedback.domain;

import com.huami.feedback.repo.DeviceRepository;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.util.AnalyticsKt;
import com.huami.feedback.util.ErrorConstKt;
import com.huami.feedback.util.Utils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.util.net.NetworkUtilApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\u0002R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/feedback/domain/CheckSyncLogConnectEnvUseCase;", "", "", "a", "Lcom/huami/util/net/NetworkUtilApi;", "info", "", "b", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "Lcom/huami/feedback/domain/SyncLogConnectEnvStatus;", "invoke", "Lcom/huami/feedback/repo/DeviceRepository;", "Lcom/huami/feedback/repo/DeviceRepository;", "deviceRepository", "<init>", "(Lcom/huami/feedback/repo/DeviceRepository;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class CheckSyncLogConnectEnvUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceRepository deviceRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("当前网络为：", this.a);
        }
    }

    public CheckSyncLogConnectEnvUseCase(@NotNull DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    private final boolean a() {
        NetworkUtilApi networkUtilApiNetworkInfo = NetUtil.INSTANCE.networkInfo();
        b(networkUtilApiNetworkInfo);
        return networkUtilApiNetworkInfo.isNetworkConnect();
    }

    private final void b(NetworkUtilApi info) {
        String strName;
        if (info.isNetworkConnect()) {
            strName = info.isWifiConnected() ? "wifi" : info.getWanType().name();
        } else {
            strName = "网络未连接";
        }
        HMLog.info("feedback", new a(strName));
    }

    @NotNull
    public final SyncLogConnectEnvStatus invoke(@Nullable DeviceType deviceType) {
        if (!a()) {
            AnalyticsKt.doAnalytics$default("Feedback_SubmitStatus", "OffLine", null, 4, null);
            return SyncLogConnectEnvStatus.NoNetwork;
        }
        if (deviceType == null) {
            return SyncLogConnectEnvStatus.Successful;
        }
        if (!Utils.isBluetoothEnable()) {
            return SyncLogConnectEnvStatus.BluetoothOff;
        }
        if (this.deviceRepository.isConnected(deviceType)) {
            return SyncLogConnectEnvStatus.Successful;
        }
        AnalyticsKt.feedbackFailAnalytics(ErrorConstKt.DEVICE_CONNECTING_FAILED, "设备连接失败");
        return SyncLogConnectEnvStatus.Disconnected;
    }
}
