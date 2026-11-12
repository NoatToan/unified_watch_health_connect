package com.xiaomi.hm.health.sleep.koin.impl;

import com.huami.device.feature.health.HealthDetect;
import com.huami.sleep.koin.IDeviceManager;
import com.huami.snore.core.ext.KoinExtKt;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.datautil.HMBraceletDateDataUtil;
import com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0004H\u0016J#\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000eJ#\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/sleep/koin/impl/DeviceManager;", "Lcom/huami/sleep/koin/IDeviceManager;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "getSleepDeviceDesc", "userId", "", "isEarbud", "date", "getDeviceDesc", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastSyncTime", "getMainDeviceDesc", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMutiSource", "supportHrSleep", "sleepHrEnabled", "sleepRemEnabled", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceManager implements IDeviceManager {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.koin.impl.DeviceManager$getMainDeviceDesc$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.sleep.koin.impl.DeviceManager", f = "DeviceManager.kt", i = {0, 0}, l = {49}, m = "getMainDeviceDesc", n = {"this", "date"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceManager.this.getMainDeviceDesc(null, null, this);
        }
    }

    private final String getSleepDeviceDesc(HMDeviceSource source) {
        return HMDeviceUtils.getDeviceDescription(KoinExtKt.getAppContext(), source, (String) null);
    }

    @Override // com.huami.sleep.koin.IDeviceManager
    @Nullable
    public Object getDeviceDesc(@NotNull String str, boolean z, @NotNull String str2, @NotNull Continuation<? super String> continuation) {
        String sleepDeviceDesc;
        if (z) {
            EarbudDateData specifyDayData = HmEarbudDateDataUtil.INSTANCE.getSpecifyDayData(str2);
            sleepDeviceDesc = getSleepDeviceDesc((specifyDayData == null || specifyDayData.getSource() == null) ? HMDeviceSource.EARBUD_CHOPIN : HMDeviceSource.fromValue(specifyDayData.getSource().intValue()));
        } else {
            DateData specifyDayData2 = HMBraceletDateDataUtil.getSpecifyDayData(str2);
            sleepDeviceDesc = getSleepDeviceDesc((specifyDayData2 == null || specifyDayData2.getSource() == null) ? HMDeviceSource.MILI : HMDeviceSource.fromValue(specifyDayData2.getSource().intValue()));
        }
        return sleepDeviceDesc == null ? "" : sleepDeviceDesc;
    }

    @Override // com.huami.sleep.koin.IDeviceManager
    @NotNull
    public String getLastSyncTime() {
        return TimeUtils.formatTime(BraceletApp.getContext(), HMDeviceManager.getInstance().getBoundDeviceSyncTime(HMDeviceType.MILI).getTimeInMillis());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sleep.koin.IDeviceManager
    @Nullable
    public Object getMainDeviceDesc(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super String> continuation) {
        AnonymousClass1 anonymousClass1;
        DeviceManager deviceManager;
        String sleepDeviceDesc;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objIsEarbud = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsEarbud);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str2;
            anonymousClass1.label = 1;
            objIsEarbud = isEarbud(str, str2, anonymousClass1);
            if (objIsEarbud == coroutine_suspended) {
                return coroutine_suspended;
            }
            deviceManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) anonymousClass1.L$1;
            deviceManager = (DeviceManager) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objIsEarbud);
        }
        if (((Boolean) objIsEarbud).booleanValue()) {
            EarbudDateData specifyDayData = HmEarbudDateDataUtil.INSTANCE.getSpecifyDayData(str2);
            sleepDeviceDesc = deviceManager.getSleepDeviceDesc((specifyDayData == null || specifyDayData.getSource() == null) ? HMDeviceSource.EARBUD_CHOPIN : HMDeviceSource.fromValue(specifyDayData.getSource().intValue()));
        } else {
            DateData specifyDayData2 = HMBraceletDateDataUtil.getSpecifyDayData(str2);
            sleepDeviceDesc = deviceManager.getSleepDeviceDesc((specifyDayData2 == null || specifyDayData2.getSource() == null) ? HMDeviceSource.MILI : HMDeviceSource.fromValue(specifyDayData2.getSource().intValue()));
        }
        return sleepDeviceDesc == null ? "" : sleepDeviceDesc;
    }

    @Override // com.huami.sleep.koin.IDeviceManager
    @Nullable
    public Object isEarbud(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(HmEarbudDateDataUtil.INSTANCE.getSelectData(str2, true).getIsEarbud());
    }

    @Override // com.huami.sleep.koin.IDeviceManager
    @Nullable
    public Object isMutiSource(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(HmEarbudDateDataUtil.INSTANCE.getSelectData(str2, true).getIsMutiSource());
    }

    @Override // com.huami.sleep.koin.IDeviceManager
    public boolean sleepHrEnabled() {
        return HealthDetect.INSTANCE.getHealthConfig().isDeviceAlldayHrMeasure();
    }

    @Override // com.huami.sleep.koin.IDeviceManager
    public boolean sleepRemEnabled() {
        return HealthDetect.INSTANCE.getUserConfig().getHrSleepEnable();
    }

    @Override // com.huami.sleep.koin.IDeviceManager
    public boolean supportHrSleep() {
        return HMDeviceManager.supportHrSleep();
    }
}
