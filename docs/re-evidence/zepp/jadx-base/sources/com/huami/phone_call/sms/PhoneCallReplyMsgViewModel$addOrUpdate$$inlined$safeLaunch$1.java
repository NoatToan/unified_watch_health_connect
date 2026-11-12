package com.huami.phone_call.sms;

import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.phone_call.sms.PhoneCallReplyMsgViewModel.b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/phone_call/sms/ktx/ViewModelKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.phone_call.sms.PhoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1", f = "PhoneCallReplyMsgViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ PhoneCallReplyMsgViewModel c;
    public final /* synthetic */ ReplyMsg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1(Continuation continuation, PhoneCallReplyMsgViewModel phoneCallReplyMsgViewModel, ReplyMsg replyMsg) {
        super(2, continuation);
        this.c = phoneCallReplyMsgViewModel;
        this.d = replyMsg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PhoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1 phoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1 = new PhoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1(continuation, this.c, this.d);
        phoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1.b = obj;
        return phoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PhoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CallReplyApi callReplyApiA = this.c.a();
        Response<Boolean> responseUpdate = callReplyApiA == null ? null : callReplyApiA.update(this.d);
        if (responseUpdate == null) {
            responseUpdate = new Failure<>("Call reply is null", 0, 2, null);
        }
        PhoneCallReplyMsgViewModel phoneCallReplyMsgViewModel = this.c;
        phoneCallReplyMsgViewModel.b(responseUpdate, phoneCallReplyMsgViewModel.new b(this.d));
        return Unit.INSTANCE;
    }
}
