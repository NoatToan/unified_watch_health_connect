package com.xiaomi.hm.health.device.feature.sync.strategy;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.core.sync.api.dto.ProgressDto;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.devicex.DeviceXBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B¥\u0001\u00128\u0010\u0012\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012b\u0010\u001a\u001a^\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001b\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rRH\u0010\u0012\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013Rr\u0010\u001a\u001a^\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/strategy/MockProgress;", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/MockProgressApi;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "item", "", "sendStatus", "", "lastSyncTime", "", "isDoNotNeedSync", "mockSync", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "workStatus", "dispatcherStatus", "Lkotlin/jvm/functions/Function2;", "Lkotlin/Function4;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "total", "current", "dispatchProgress", "Lkotlin/jvm/functions/Function4;", "times", LogUtil.I, "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MockProgress implements MockProgressApi {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String MOCK_DEVICE_NAME = "FKDevice";

    @Deprecated
    @NotNull
    public static final String TAG = "SyncCenter";

    @Deprecated
    public static final int TIME_LIMIT = 1000;

    @Deprecated
    public static final int TIME_LIMIT_ONE_MINUTE = 60000;

    @Nullable
    private final Function4<HMDeviceType, Integer, Integer, HMBaseDevice, Unit> dispatchProgress;

    @Nullable
    private final Function2<HMBaseDevice, WorkStatusDto, Unit> dispatcherStatus;
    private int times;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/strategy/MockProgress$Companion;", "", "", "MOCK_DEVICE_NAME", "Ljava/lang/String;", "TAG", "", "TIME_LIMIT", LogUtil.I, "TIME_LIMIT_ONE_MINUTE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.strategy.MockProgress$mockSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.strategy.MockProgress", f = "MockProgress.kt", i = {0, 0}, l = {101}, m = "mockSync", n = {"this", "device"}, s = {"L$0", "L$1"})
    public static final class C16051 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C16051(Continuation<? super C16051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MockProgress.this.mockSync(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MockProgress(@Nullable Function2<? super HMBaseDevice, ? super WorkStatusDto, Unit> function2, @Nullable Function4<? super HMDeviceType, ? super Integer, ? super Integer, ? super HMBaseDevice, Unit> function4) {
        this.dispatcherStatus = function2;
        this.dispatchProgress = function4;
    }

    private final void sendStatus(HMBaseDevice device, WorkStatusDto item) {
        Function2<HMBaseDevice, WorkStatusDto, Unit> function2 = this.dispatcherStatus;
        if (function2 != null) {
            function2.invoke(device, item);
        }
        ProgressDto progress = item.getProgress();
        int progress2 = progress == null ? 0 : progress.getProgress();
        Function4<HMDeviceType, Integer, Integer, HMBaseDevice, Unit> function4 = this.dispatchProgress;
        if (function4 == null) {
            return;
        }
        function4.invoke(device.getDeviceType(), 100, Integer.valueOf(progress2), device);
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.strategy.MockProgressApi
    public boolean isDoNotNeedSync(final long lastSyncTime) {
        HMLog.info("SyncCenter", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.MockProgress.isDoNotNeedSync.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "lastSyncTime: " + lastSyncTime + " , current: " + System.currentTimeMillis();
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.times;
        if (i != 0 && i % 3 == 0) {
            HMLog.info("SyncCenter", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.MockProgress.isDoNotNeedSync.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "force sync when time is up: " + MockProgress.this.times;
                }
            });
            this.times++;
            return false;
        }
        this.times = i + 1;
        if (lastSyncTime >= jCurrentTimeMillis) {
            return false;
        }
        return lastSyncTime + ((long) (DeviceXBuilder.INSTANCE.getFlavor().findFlavor().getId() == 2 ? 1000 : 60000)) >= jCurrentTimeMillis;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:24:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.xiaomi.hm.health.device.feature.sync.strategy.MockProgressApi
    @org.jetbrains.annotations.Nullable
    public java.lang.Object mockSync(@org.jetbrains.annotations.NotNull com.xiaomi.hm.health.bt.device.HMBaseDevice r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.feature.sync.strategy.MockProgress.mockSync(com.xiaomi.hm.health.bt.device.HMBaseDevice, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
