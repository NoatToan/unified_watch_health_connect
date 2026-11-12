package com.huami.phone_call.sms;

import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyContent;
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
@DebugMetadata(c = "com.huami.phone_call.sms.PhoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1", f = "PhoneCallReplyMsgViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ PhoneCallReplyMsgViewModel c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1(Continuation continuation, PhoneCallReplyMsgViewModel phoneCallReplyMsgViewModel, String str, String str2, String str3) {
        super(2, continuation);
        this.c = phoneCallReplyMsgViewModel;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PhoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1 phoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1 = new PhoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e, this.f);
        phoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1.b = obj;
        return phoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PhoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Response<Boolean> responseSendReplyContent = callReplyApiA == null ? null : callReplyApiA.sendReplyContent(new ReplyContent(this.d, this.e, this.f, false, 8, null));
        if (responseSendReplyContent == null) {
            responseSendReplyContent = new Failure<>("send reply fail", 0, 2, null);
        }
        PhoneCallReplyMsgViewModel.e(this.c, responseSendReplyContent, null, 2, null);
        return Unit.INSTANCE;
    }
}
