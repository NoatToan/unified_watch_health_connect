package com.huami.sky.lib.repo;

import com.huami.sky.lib.entity.HeartRate;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class DeviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2 implements FlowCollector<HeartRate> {
    public final /* synthetic */ List a;
    public final /* synthetic */ DeviceDataRepositoryImpl b;

    /* JADX INFO: renamed from: com.huami.sky.lib.repo.DeviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.lib.repo.DeviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2", f = "DeviceDataRepositoryImpl.kt", i = {0}, l = {138}, m = "emit", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return DeviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2.this.emit(null, this);
        }
    }

    public DeviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2(List list, DeviceDataRepositoryImpl deviceDataRepositoryImpl) {
        this.a = list;
        this.b = deviceDataRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(HeartRate heartRate, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        DeviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2 deviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.b = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.a;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.a.add(heartRate);
            if (((HeartRate) CollectionsKt.last(this.a)).getTime() - ((HeartRate) CollectionsKt.first(this.a)).getTime() >= 30000) {
                HMLog.info("DeviceDataRepositoryImpl", new DeviceDataRepositoryImpl.c(this.a));
                DeviceDataRepositoryImpl deviceDataRepositoryImpl = this.b;
                List<HeartRate> list = this.a;
                anonymousClass2.d = this;
                anonymousClass2.b = 1;
                if (deviceDataRepositoryImpl.uploadDeviceData(null, null, null, list, anonymousClass2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2 = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        deviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2 = (DeviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2) anonymousClass2.d;
        ResultKt.throwOnFailure(obj);
        deviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2.a.clear();
        return Unit.INSTANCE;
    }
}
