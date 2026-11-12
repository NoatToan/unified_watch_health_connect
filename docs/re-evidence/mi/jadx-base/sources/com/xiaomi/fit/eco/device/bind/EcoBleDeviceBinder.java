package com.xiaomi.fit.eco.device.bind;

import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.api.p;
import com.xiaomi.fit.eco.device.EcoDeviceFactory;
import com.xiaomi.fit.eco.device.utils.EcoBleUtil;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import defpackage.sh7;
import defpackage.u7r;
import defpackage.uxo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0094@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/eco/device/bind/EcoBleDeviceBinder;", "Lcom/xiaomi/fit/eco/device/bind/EcoBaseDeviceBinder;", "", "removePair", "()V", "Lsh7;", "callback", "bind", "(Lsh7;)V", "", "code", "unbind", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "deviceInfo", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoBleDeviceBinder extends EcoBaseDeviceBinder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoBleDeviceBinder(@NotNull EcoDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        EcoDeviceFactory ecoDeviceFactory = EcoDeviceFactory.INSTANCE;
        String mac = getMDeviceInfo().getMac();
        Intrinsics.checkNotNull(mac);
        setMEcoApiCall(ecoDeviceFactory.getEcoApiCall(mac, getMDeviceInfo().getDid(), getMDeviceInfo(), getMDeviceInfo().isOwner(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePair() {
        getMEcoApiCall().b(null);
    }

    @Override // com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder, com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder
    public void bind(@Nullable sh7 callback) {
        EcoBleUtil.INSTANCE.discovery();
        super.bind(callback);
    }

    @Override // com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder
    @Nullable
    public Object unbind(final int i, @NotNull Continuation<? super Integer> continuation) {
        if (i == -1 || i == 0) {
            if (isDeviceConnect()) {
                u7r u7rVar = new u7r();
                u7rVar.e = 2;
                u7rVar.f = 0;
                uxo uxoVar = new uxo();
                uxoVar.u(1);
                u7rVar.E(uxoVar);
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
                getMEcoApiCall().a(u7rVar, false, new p.a() { // from class: com.xiaomi.fit.eco.device.bind.EcoBleDeviceBinder$unbind$2$1
                    @Override // com.xiaomi.eco.api.p.a
                    public final void onCallback(EcoApiResult ecoApiResult) {
                        this.this$0.removePair();
                        Continuation<Integer> continuation2 = safeContinuation;
                        Result.Companion companion = Result.Companion;
                        continuation2.resumeWith(Result.m886constructorimpl(Integer.valueOf(i)));
                    }
                });
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
            removePair();
        }
        return Boxing.boxInt(i);
    }
}
