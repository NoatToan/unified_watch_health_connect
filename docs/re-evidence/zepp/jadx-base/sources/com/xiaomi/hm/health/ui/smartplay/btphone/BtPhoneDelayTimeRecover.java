package com.xiaomi.hm.health.ui.smartplay.btphone;

import com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhonePropertyData;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingRepo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneDelayTimeRecover;", "Lcom/huami/bluetooth/profile/channel/module/syncable/DeviceDataRecover;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "recover", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingRepo;", "a", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingRepo;", "btPhoneNetRepo", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneDelayTimeRecover implements DeviceDataRecover {

    @NotNull
    private static final String b = "BtPhoneDelayTimeRecover";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BtPhoneSettingRepo btPhoneNetRepo = new BtPhoneSettingRepo();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDelayTimeRecover$recover$1", f = "BtPhoneDelayTimeRecover.kt", i = {0, 1, 1, 2, 2}, l = {27, 31, 36}, m = "invokeSuspend", n = {"btConfig", "btConfig", "resetBtPhone", "resetBtPhone", "delayTime"}, s = {"L$0", "L$0", "Z$0", "Z$0", "I$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public boolean b;
        public int c;
        public int d;
        public final /* synthetic */ HMMiLiProDevice f;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDelayTimeRecover$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1031a extends Lambda implements Function0<String> {
            public final /* synthetic */ BtPhonePropertyData a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1031a(BtPhonePropertyData btPhonePropertyData, boolean z) {
                super(0);
                this.a = btPhonePropertyData;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "reset bt phone " + (this.a.getEnable() ? "enable" : WatchFaceApi.CUSTOMIZABLE_DISABLE) + " result: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "reset show contact result: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i, boolean z) {
                super(0);
                this.a = i;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "reset bt phone delay time: " + this.a + " result: " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMMiLiProDevice hMMiLiProDevice, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f = hMMiLiProDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BtPhoneDelayTimeRecover.this.new a(this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00a9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BtPhonePropertyData btPhonePropertyData;
            boolean zBooleanValue;
            boolean z;
            BtPhonePropertyData btPhonePropertyData2;
            int iNeedDelayTime;
            Object btPhoneDelay;
            int i;
            boolean z2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.d;
            if (i2 != 0) {
                if (i2 == 1) {
                    btPhonePropertyData = (BtPhonePropertyData) this.a;
                    ResultKt.throwOnFailure(obj);
                } else if (i2 == 2) {
                    z = this.b;
                    btPhonePropertyData2 = (BtPhonePropertyData) this.a;
                    ResultKt.throwOnFailure(obj);
                    HMLog.info(BtPhoneDelayTimeRecover.b, new b(((Boolean) obj).booleanValue()));
                    zBooleanValue = z;
                    btPhonePropertyData = btPhonePropertyData2;
                    iNeedDelayTime = btPhonePropertyData.needDelayTime();
                    BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
                    HMMiLiProDevice hMMiLiProDevice = this.f;
                    this.a = null;
                    this.b = zBooleanValue;
                    this.c = iNeedDelayTime;
                    this.d = 3;
                    btPhoneDelay = btPhoneDevice.setBtPhoneDelay(hMMiLiProDevice, iNeedDelayTime, this);
                    if (btPhoneDelay == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = iNeedDelayTime;
                    z2 = zBooleanValue;
                    obj = btPhoneDelay;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.c;
                    z2 = this.b;
                    ResultKt.throwOnFailure(obj);
                }
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                HMLog.info(BtPhoneDelayTimeRecover.b, new c(i, zBooleanValue2));
                return Boxing.boxBoolean(!z2 && zBooleanValue2);
            }
            ResultKt.throwOnFailure(obj);
            BtPhonePropertyData btPhoneSetting = BtPhoneDelayTimeRecover.this.btPhoneNetRepo.getBtPhoneSetting();
            BtPhoneDevice btPhoneDevice2 = BtPhoneDevice.INSTANCE;
            HMMiLiProDevice hMMiLiProDevice2 = this.f;
            boolean enable = btPhoneSetting.getEnable();
            this.a = btPhoneSetting;
            this.d = 1;
            Object objEnableBtPhone = btPhoneDevice2.enableBtPhone(hMMiLiProDevice2, enable, this);
            if (objEnableBtPhone == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhonePropertyData = btPhoneSetting;
            obj = objEnableBtPhone;
            zBooleanValue = ((Boolean) obj).booleanValue();
            HMLog.info(BtPhoneDelayTimeRecover.b, new C1031a(btPhonePropertyData, zBooleanValue));
            if (btPhonePropertyData.getEnable()) {
                BtPhoneDevice btPhoneDevice3 = BtPhoneDevice.INSTANCE;
                HMMiLiProDevice hMMiLiProDevice3 = this.f;
                this.a = btPhonePropertyData;
                this.b = zBooleanValue;
                this.d = 2;
                Object objShowContact = btPhoneDevice3.showContact(hMMiLiProDevice3, true, this);
                if (objShowContact == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BtPhonePropertyData btPhonePropertyData3 = btPhonePropertyData;
                z = zBooleanValue;
                obj = objShowContact;
                btPhonePropertyData2 = btPhonePropertyData3;
                HMLog.info(BtPhoneDelayTimeRecover.b, new b(((Boolean) obj).booleanValue()));
                zBooleanValue = z;
                btPhonePropertyData = btPhonePropertyData2;
            }
            iNeedDelayTime = btPhonePropertyData.needDelayTime();
            BtPhoneDevice btPhoneDevice4 = BtPhoneDevice.INSTANCE;
            HMMiLiProDevice hMMiLiProDevice4 = this.f;
            this.a = null;
            this.b = zBooleanValue;
            this.c = iNeedDelayTime;
            this.d = 3;
            btPhoneDelay = btPhoneDevice4.setBtPhoneDelay(hMMiLiProDevice4, iNeedDelayTime, this);
            if (btPhoneDelay == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = iNeedDelayTime;
            z2 = zBooleanValue;
            obj = btPhoneDelay;
            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
            HMLog.info(BtPhoneDelayTimeRecover.b, new c(i, zBooleanValue3));
            return Boxing.boxBoolean(!z2 && zBooleanValue3);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover
    public boolean recover(@NotNull HMMiLiProDevice device) {
        return ((Boolean) d.b(null, new a(device, null), 1, null)).booleanValue();
    }
}
