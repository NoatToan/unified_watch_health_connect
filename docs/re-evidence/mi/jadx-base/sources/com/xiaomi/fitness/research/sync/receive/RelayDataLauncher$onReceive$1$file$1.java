package com.xiaomi.fitness.research.sync.receive;

import android.app.Application;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ByteUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.research.sync.receive.RelayDataLauncher$onReceive$1$file$1", f = "RelayDataLauncher.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
public final class RelayDataLauncher$onReceive$1$file$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ byte[] $data;
    final /* synthetic */ ResearchDataId $dataId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelayDataLauncher$onReceive$1$file$1(byte[] bArr, ResearchDataId researchDataId, Continuation<? super RelayDataLauncher$onReceive$1$file$1> continuation) {
        super(2, continuation);
        this.$data = bArr;
        this.$dataId = researchDataId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RelayDataLauncher$onReceive$1$file$1(this.$data, this.$dataId, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Application app = AppUtil.getApp();
            byte[] bArr = this.$data;
            String strByteToString = ByteUtil.byteToString(this.$dataId.toByteArray());
            this.label = 1;
            obj = RelayDataLauncherKt.writeByteArrayToDownload(app, bArr, strByteToString, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((RelayDataLauncher$onReceive$1$file$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
