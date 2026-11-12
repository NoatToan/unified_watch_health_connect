package com.xiaomi.hm.health.di.koin.female;

import com.huami.bluetooth.profile.channel.module.MenstruationModule;
import com.huami.femalehealth.logiclib.device.DeviceCallback;
import com.huami.femalehealth.logiclib.dto.MenstruationTotalDto;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$writeToDevice$2$1", f = "FemaleExternalDeviceDataTransfer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FemaleExternalDeviceDataTransfer$writeToDevice$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ MenstruationTotalDto b;
    public final /* synthetic */ MenstruationModule c;
    public final /* synthetic */ DeviceCallback d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationTotalRecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MenstruationTotalRecord menstruationTotalRecord) {
            super(0);
            this.a = menstruationTotalRecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeToDevice, convertTotalDtoForDevice totalRecord=" + FemaleExternalDeviceDataTransfer.INSTANCE.e(this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleExternalDeviceDataTransfer$writeToDevice$2$1(MenstruationTotalDto menstruationTotalDto, MenstruationModule menstruationModule, DeviceCallback deviceCallback, Continuation<? super FemaleExternalDeviceDataTransfer$writeToDevice$2$1> continuation) {
        super(2, continuation);
        this.b = menstruationTotalDto;
        this.c = menstruationModule;
        this.d = deviceCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FemaleExternalDeviceDataTransfer$writeToDevice$2$1(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FemaleExternalDeviceDataTransfer$writeToDevice$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MenstruationTotalRecord menstruationTotalRecordConvertTotalDtoForDevice = FemaleExternalDeviceDataTransfer.INSTANCE.convertTotalDtoForDevice(this.b);
        HMLog.info(FemaleExternalDeviceDataTransfer.TAG, new a(menstruationTotalRecordConvertTotalDtoForDevice));
        MenstruationModule menstruationModule = this.c;
        final DeviceCallback deviceCallback = this.d;
        menstruationModule.setMenstruationTotalRecord(menstruationTotalRecordConvertTotalDtoForDevice, new HMCallback<Integer>() { // from class: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$writeToDevice$2$1.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer$writeToDevice$2$1$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "writeToDevice, result=" + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                DeviceCallback deviceCallback2 = deviceCallback;
                if (deviceCallback2 != null) {
                    deviceCallback2.onFinish(result);
                }
                HMLog.info(FemaleExternalDeviceDataTransfer.TAG, new a(result));
            }
        });
        return Unit.INSTANCE;
    }
}
