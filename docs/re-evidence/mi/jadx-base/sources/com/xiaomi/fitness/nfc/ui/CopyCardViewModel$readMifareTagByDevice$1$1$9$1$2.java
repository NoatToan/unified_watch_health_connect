package com.xiaomi.fitness.nfc.ui;

import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.SeCard;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import defpackage.vqg;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<BaseResponse> $baseResponse;
    final /* synthetic */ Function2<String, String, Unit> $fail;
    final /* synthetic */ SeCard $supperCard;
    final /* synthetic */ Function1<CardWrapper, Unit> $supperDoorCardSuccess;
    int label;

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2$1", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SeCard $supperCard;
        final /* synthetic */ Function1<CardWrapper, Unit> $supperDoorCardSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SeCard seCard, Function1<? super CardWrapper, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$supperCard = seCard;
            this.$supperDoorCardSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$supperCard, this.$supperDoorCardSuccess, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CardWrapper cardWrapper = CardWrapper.parse(this.$supperCard);
            zl3.g().l(cardWrapper);
            Function1<CardWrapper, Unit> function1 = this.$supperDoorCardSuccess;
            Intrinsics.checkNotNull(cardWrapper);
            function1.invoke2(cardWrapper);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2$2", f = "CopyCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<BaseResponse> $baseResponse;
        final /* synthetic */ Function2<String, String, Unit> $fail;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super String, ? super String, Unit> function2, Ref.ObjectRef<BaseResponse> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$fail = function2;
            this.$baseResponse = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$fail, this.$baseResponse, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function2<String, String, Unit> function2 = this.$fail;
            String mMsg = this.$baseResponse.element.mMsg;
            Intrinsics.checkNotNullExpressionValue(mMsg, "mMsg");
            function2.invoke(mMsg, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2(Ref.ObjectRef<BaseResponse> objectRef, SeCard seCard, Function1<? super CardWrapper, Unit> function1, Function2<? super String, ? super String, Unit> function2, Continuation<? super CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2> continuation) {
        super(2, continuation);
        this.$baseResponse = objectRef;
        this.$supperCard = seCard;
        this.$supperDoorCardSuccess = function1;
        this.$fail = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2(this.$baseResponse, this.$supperCard, this.$supperDoorCardSuccess, this.$fail, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BaseResponse baseResponse = this.$baseResponse.element;
        vqg.d("mifareClassicOperation.probeData code:" + baseResponse.mResultCode + " msg:" + baseResponse.mMsg + " isMain=" + AppUtil.INSTANCE.isMainThread());
        if (this.$baseResponse.element.isSuccess()) {
            AnyExtKt.main$default(null, new AnonymousClass1(this.$supperCard, this.$supperDoorCardSuccess, null), 1, null);
        } else {
            AnyExtKt.main$default(null, new AnonymousClass2(this.$fail, this.$baseResponse, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyCardViewModel$readMifareTagByDevice$1$1$9$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
