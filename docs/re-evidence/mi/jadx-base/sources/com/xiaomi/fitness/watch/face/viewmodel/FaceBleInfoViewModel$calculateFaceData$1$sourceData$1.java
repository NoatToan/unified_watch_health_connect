package com.xiaomi.fitness.watch.face.viewmodel;

import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import defpackage.im9;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$calculateFaceData$1$sourceData$1", f = "FaceBleInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FaceBleInfoViewModel$calculateFaceData$1$sourceData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
    final /* synthetic */ FaceData $faceData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceBleInfoViewModel$calculateFaceData$1$sourceData$1(FaceData faceData, Continuation<? super FaceBleInfoViewModel$calculateFaceData$1$sourceData$1> continuation) {
        super(2, continuation);
        this.$faceData = faceData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceBleInfoViewModel$calculateFaceData$1$sourceData$1(this.$faceData, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        byte[] bArrC = im9.C(FaceManager.INSTANCE.getBleZip(this.$faceData.getFile_hash()));
        return bArrC == null ? new byte[0] : bArrC;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
        return ((FaceBleInfoViewModel$calculateFaceData$1$sourceData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
