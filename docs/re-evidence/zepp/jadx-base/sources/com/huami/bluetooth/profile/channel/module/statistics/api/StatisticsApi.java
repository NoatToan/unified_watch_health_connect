package com.huami.bluetooth.profile.channel.module.statistics.api;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.Scopes;
import com.huami.bluetooth.profile.channel.module.ChannelModuleProvider;
import com.huami.bluetooth.profile.channel.module.base.request.BtCmd;
import com.huami.bluetooth.profile.channel.module.base.request.BtRequest;
import com.huami.bluetooth.profile.channel.module.base.request.BtResponse;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import com.huami.bluetooth.profile.channel.module.statistics.IStatisticsApi;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JS\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0002J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0006H\u0017J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0017R\u0019\u0010\u001c\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/statistics/api/StatisticsApi;", "Lcom/huami/bluetooth/profile/channel/module/statistics/IStatisticsApi;", "", "data", "Lcom/xiaomi/hm/health/bt/model/HMStatisticInfo;", "b", "", "startIndex", "valueLength", "returnedFlag", "getFlag", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newIndex", "", "newIndexCallback", "a", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "interceptor", "setInterceptor", "queryVersion", "flag", "getStatisticsInfo", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getProfile", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", Scopes.PROFILE, "Lcom/huami/bluetooth/profile/channel/module/statistics/api/StatisticsModule;", "Lcom/huami/bluetooth/profile/channel/module/statistics/api/StatisticsModule;", "module", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class StatisticsApi implements IStatisticsApi {

    @NotNull
    private static final String c = "StatisticsApi";
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice profile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private StatisticsModule module;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "newIndex", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.IntRef intRef) {
            super(1);
            this.a = intRef;
        }

        public final void a(int i) {
            this.a.element = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    public StatisticsApi(@NotNull HMBaseDevice hMBaseDevice) {
        this.profile = hMBaseDevice;
        StatisticsModule statisticsModule = (StatisticsModule) ChannelModuleProvider.INSTANCE.of(hMBaseDevice).get(StatisticsModule.class);
        this.module = statisticsModule;
        if (statisticsModule == null) {
            Debug.fi(c, "init failed as module is null!!");
        }
        setInterceptor(new DataTransferCallback() { // from class: com.huami.bluetooth.profile.channel.module.statistics.api.StatisticsApi.1
            @Override // com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback
            public void onReceive(@NotNull byte[] data) {
                Debug.fi(StatisticsApi.c, Intrinsics.stringPlus("onReceive data: ", GattUtils.bytesToHexString(data)));
            }

            @Override // com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback
            public void onSend(@NotNull byte[] data) {
                Debug.fi(StatisticsApi.c, Intrinsics.stringPlus("onSend data: ", GattUtils.bytesToHexString(data)));
            }
        });
    }

    private final int a(byte[] data, int startIndex, int valueLength, int returnedFlag, int getFlag, Function1<? super Integer, Unit> newIndexCallback) {
        if (returnedFlag != 0 && (returnedFlag | getFlag) == 0) {
            return 0;
        }
        int iBytesToInt = GattUtils.bytesToInt(data, startIndex, valueLength);
        newIndexCallback.invoke(Integer.valueOf(startIndex + valueLength));
        return iBytesToInt;
    }

    private final HMStatisticInfo b(byte[] data) {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 2;
        int iBytesToInt = GattUtils.bytesToInt(data, 2, 4);
        intRef.element += 4;
        a aVar = new a(intRef);
        HMStatisticInfo hMStatisticInfo = new HMStatisticInfo();
        hMStatisticInfo.setRebootCount(a(data, intRef.element, 2, iBytesToInt, 1, aVar));
        hMStatisticInfo.setLiftWristCount(a(data, intRef.element, 2, iBytesToInt, 2, aVar));
        hMStatisticInfo.setAppNotifyCount(a(data, intRef.element, 2, iBytesToInt, 4, aVar));
        hMStatisticInfo.setPhoneNotifyCount(a(data, intRef.element, 2, iBytesToInt, 8, aVar));
        hMStatisticInfo.setDisconnectCount(a(data, intRef.element, 2, iBytesToInt, 16, aVar));
        hMStatisticInfo.setKeyCount(a(data, intRef.element, 2, iBytesToInt, 32, aVar));
        hMStatisticInfo.setAlgorithmTime(a(data, intRef.element, 4, iBytesToInt, 64, aVar));
        hMStatisticInfo.setConnectionTime(a(data, intRef.element, 4, iBytesToInt, 128, aVar));
        hMStatisticInfo.setFlashTime(a(data, intRef.element, 4, iBytesToInt, 256, aVar));
        hMStatisticInfo.setLcdTime(a(data, intRef.element, 4, iBytesToInt, 512, aVar));
        hMStatisticInfo.setPpgTime(a(data, intRef.element, 4, iBytesToInt, 1024, aVar));
        hMStatisticInfo.setResumeTime(a(data, intRef.element, 4, iBytesToInt, 2048, aVar));
        hMStatisticInfo.setUpTime(a(data, intRef.element, 4, iBytesToInt, 4096, aVar));
        hMStatisticInfo.setVibrateTime(a(data, intRef.element, 4, iBytesToInt, 8192, aVar));
        return hMStatisticInfo;
    }

    @NotNull
    public final HMBaseDevice getProfile() {
        return this.profile;
    }

    @Override // com.huami.bluetooth.profile.channel.module.statistics.IStatisticsApi
    @Nullable
    public HMStatisticInfo getStatisticsInfo(int flag) {
        StatisticsModule statisticsModule = this.module;
        HMStatisticInfo hMStatisticInfoB = null;
        BtResponse btResponseSendRequest = statisticsModule == null ? null : statisticsModule.sendRequest(new BtRequest(new BtCmd(2, 0, 2, null), 3, GattUtils.intToBytes(flag)));
        if (btResponseSendRequest == null) {
            return null;
        }
        if (!btResponseSendRequest.getOpResult() || btResponseSendRequest.getData() == null) {
            Debug.fi(c, Intrinsics.stringPlus("getStatisticsInfo failed. flag: ", Integer.valueOf(flag)));
            return null;
        }
        byte[] data = btResponseSendRequest.getData();
        byte b = data[1];
        if (b == 0) {
            try {
                hMStatisticInfoB = b(data);
            } catch (Exception e2) {
                Debug.fi(c, Intrinsics.stringPlus("getStatisticsInfo failed as parse exception: ", e2));
            }
            Debug.fi(c, Intrinsics.stringPlus("getStatisticsInfo success: ", hMStatisticInfoB));
            return hMStatisticInfoB;
        }
        Debug.fi(c, "getStatisticsInfo failed. flag: " + flag + "; code: " + ((int) b));
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.statistics.IStatisticsApi
    @WorkerThread
    public int queryVersion() {
        StatisticsModule statisticsModule = this.module;
        BtResponse btResponseSendRequest = statisticsModule != null ? statisticsModule.sendRequest(new BtRequest(new BtCmd(0, 0, 2, null), 1, null, 4, null)) : null;
        if (btResponseSendRequest == null) {
            return -1;
        }
        if (!btResponseSendRequest.getOpResult() || btResponseSendRequest.getData() == null) {
            Debug.fi(c, "get version failed.");
            return -1;
        }
        byte[] data = btResponseSendRequest.getData();
        byte b = data[1];
        if (data.length < 3 || b != 0) {
            Debug.fi(c, Intrinsics.stringPlus("failed to get version, error code: ", Integer.valueOf(b)));
            return -1;
        }
        byte b2 = data[2];
        Debug.fi(c, Intrinsics.stringPlus("finish getting version: ", Byte.valueOf(b2)));
        return b2;
    }

    public final void setInterceptor(@NotNull DataTransferCallback interceptor) {
        StatisticsModule statisticsModule = this.module;
        if (statisticsModule == null) {
            return;
        }
        statisticsModule.setInterceptor(interceptor);
    }

    @Override // com.huami.bluetooth.profile.channel.module.statistics.ICompatStatisticsApi
    @WorkerThread
    @Nullable
    public HMStatisticInfo getStatisticsInfo() {
        return getStatisticsInfo(0);
    }
}
