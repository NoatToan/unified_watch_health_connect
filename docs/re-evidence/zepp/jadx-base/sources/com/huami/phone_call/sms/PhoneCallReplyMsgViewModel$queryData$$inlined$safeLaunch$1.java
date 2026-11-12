package com.huami.phone_call.sms;

import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.bluetooth.profile.channel.module.call_reply.Version;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/phone_call/sms/ktx/ViewModelKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.phone_call.sms.PhoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1", f = "PhoneCallReplyMsgViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ PhoneCallReplyMsgViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1(Continuation continuation, PhoneCallReplyMsgViewModel phoneCallReplyMsgViewModel) {
        super(2, continuation);
        this.c = phoneCallReplyMsgViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PhoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1 phoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1 = new PhoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1(continuation, this.c);
        phoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1.b = obj;
        return phoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PhoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CallReplyApi callReplyApiA;
        Response<List<ReplyMsg>> responseQueryData;
        PhoneCallReplyMsgViewModel phoneCallReplyMsgViewModel;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.c.version != null) {
            callReplyApiA = this.c.a();
            if (callReplyApiA == null) {
                responseQueryData = null;
            } else {
                responseQueryData = callReplyApiA.queryData();
            }
            if (responseQueryData == null) {
                responseQueryData = new Failure<>("Call reply is null", 0, 2, null);
            }
            phoneCallReplyMsgViewModel = this.c;
            if (responseQueryData instanceof Success) {
                phoneCallReplyMsgViewModel.getResultLiveData().postValue(Boxing.boxBoolean(true));
                this.c.getMsgLiveData().postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) ((Success) responseQueryData).getData()));
            } else {
                phoneCallReplyMsgViewModel.getResultLiveData().postValue(Boxing.boxBoolean(false));
            }
        } else {
            CallReplyApi callReplyApiA2 = this.c.a();
            Response<Version> responseQueryVersion = callReplyApiA2 == null ? null : callReplyApiA2.queryVersion();
            if (responseQueryVersion == null) {
                responseQueryVersion = new Failure<>("Call reply is null", 0, 2, null);
            }
            if (responseQueryVersion instanceof Success) {
                this.c.version = (Version) ((Success) responseQueryVersion).getData();
                callReplyApiA = this.c.a();
                if (callReplyApiA == null) {
                    responseQueryData = null;
                } else {
                    responseQueryData = callReplyApiA.queryData();
                }
                if (responseQueryData == null) {
                    responseQueryData = new Failure<>("Call reply is null", 0, 2, null);
                }
                phoneCallReplyMsgViewModel = this.c;
                if (responseQueryData instanceof Success) {
                    phoneCallReplyMsgViewModel.getResultLiveData().postValue(Boxing.boxBoolean(true));
                    this.c.getMsgLiveData().postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) ((Success) responseQueryData).getData()));
                } else {
                    phoneCallReplyMsgViewModel.getResultLiveData().postValue(Boxing.boxBoolean(false));
                }
            } else {
                this.c.getResultLiveData().postValue(Boxing.boxBoolean(false));
            }
        }
        return Unit.INSTANCE;
    }
}
