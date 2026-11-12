package com.huami.phone_call.sms;

import com.huami.phone_call.sms.data.SmsReplySetting;
import java.util.ArrayList;
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
@DebugMetadata(c = "com.huami.phone_call.sms.SmsReplySettingViewModel$refresh$$inlined$safeLaunch$1", f = "SmsReplySettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SmsReplySettingViewModel$refresh$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ SmsReplySettingViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsReplySettingViewModel$refresh$$inlined$safeLaunch$1(Continuation continuation, SmsReplySettingViewModel smsReplySettingViewModel) {
        super(2, continuation);
        this.c = smsReplySettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SmsReplySettingViewModel$refresh$$inlined$safeLaunch$1 smsReplySettingViewModel$refresh$$inlined$safeLaunch$1 = new SmsReplySettingViewModel$refresh$$inlined$safeLaunch$1(continuation, this.c);
        smsReplySettingViewModel$refresh$$inlined$safeLaunch$1.b = obj;
        return smsReplySettingViewModel$refresh$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SmsReplySettingViewModel$refresh$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SmsReplySetting smsReplySetting = new SmsReplySetting(this.c.com.xiaomi.market.sdk.Constants.JSON_FEATURE java.lang.String.isFeatureEnable(), this.c.getDeviceConnected(), this.c.getPhoneAlertEnable(), this.c.com.xiaomi.market.sdk.Constants.JSON_FEATURE java.lang.String.isEnable());
        this.c.getSettingLiveData().postValue(smsReplySetting);
        ArrayList arrayList = new ArrayList();
        if (this.c.b(smsReplySetting) && !this.c.a("android.permission.SEND_SMS")) {
            arrayList.add(this.c.getSendSmsPermission());
        }
        this.c.getPermissionLiveData().postValue(arrayList);
        return Unit.INSTANCE;
    }
}
