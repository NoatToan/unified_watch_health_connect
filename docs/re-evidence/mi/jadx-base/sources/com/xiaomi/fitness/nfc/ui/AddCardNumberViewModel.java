package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.service.mi.BankCard;
import com.service.mi.entity.BaseResponse;
import com.service.mi.wallet.entity.resp.PreDigitizeResp;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.s3q;
import defpackage.vqg;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016Jf\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u0016J,\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\f2\u001c\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u0012¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/AddCardNumberViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "master", "bankCard", "Lcom/service/mi/BankCard;", "cardNumber", "", "ownerName", "year", "month", "securityCode", "callBack", "Lkotlin/Function2;", "", "Lcom/service/mi/wallet/entity/resp/PreDigitizeResp;", "fail", "Lkotlin/Function1;", "createCard", "cardNum", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddCardNumberViewModel extends AbsViewModel {

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.AddCardNumberViewModel$master$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.AddCardNumberViewModel$master$1", f = "AddCardNumberViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BankCard $bankCard;
        final /* synthetic */ Function2<Boolean, PreDigitizeResp, Unit> $callBack;
        final /* synthetic */ String $cardNumber;
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ String $month;
        final /* synthetic */ String $ownerName;
        final /* synthetic */ String $securityCode;
        final /* synthetic */ String $year;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.AddCardNumberViewModel$master$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.AddCardNumberViewModel$master$1$1", f = "AddCardNumberViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ BankCard $bankCard;
            final /* synthetic */ Function2<Boolean, PreDigitizeResp, Unit> $callBack;
            final /* synthetic */ String $cardNumber;
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ String $month;
            final /* synthetic */ String $ownerName;
            final /* synthetic */ String $securityCode;
            final /* synthetic */ String $year;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.AddCardNumberViewModel$master$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.AddCardNumberViewModel$master$1$1$1", f = "AddCardNumberViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C06531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ BankCard $bankCard;
                final /* synthetic */ Function2<Boolean, PreDigitizeResp, Unit> $callBack;
                final /* synthetic */ Function1<String, Unit> $fail;
                final /* synthetic */ BaseResponse $response;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C06531(BaseResponse baseResponse, Function2<? super Boolean, ? super PreDigitizeResp, Unit> function2, BankCard bankCard, Function1<? super String, Unit> function1, Continuation<? super C06531> continuation) {
                    super(2, continuation);
                    this.$response = baseResponse;
                    this.$callBack = function2;
                    this.$bankCard = bankCard;
                    this.$fail = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06531(this.$response, this.$callBack, this.$bankCard, this.$fail, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.$response.isStatusOK()) {
                        Function2<Boolean, PreDigitizeResp, Unit> function2 = this.$callBack;
                        Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                        Object data = this.$response.getData();
                        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.service.mi.wallet.entity.resp.PreDigitizeResp");
                        function2.invoke(boolBoxBoolean, (PreDigitizeResp) data);
                    } else {
                        String visaErrorMsg = this.$bankCard.getCardType() == 2 ? NfcUtils.getVisaErrorMsg("enrollPan", this.$response.getResultCode(), this.$response.getSpErrors()) : NfcUtils.getMasterErrorMsg(this.$response.getResultCode(), this.$response.getSpErrors());
                        vqg.b("bankCard.prepare:" + visaErrorMsg);
                        this.$fail.invoke2(visaErrorMsg);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C06531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06521(String str, String str2, String str3, String str4, String str5, BankCard bankCard, Function2<? super Boolean, ? super PreDigitizeResp, Unit> function2, Function1<? super String, Unit> function1, Continuation<? super C06521> continuation) {
                super(2, continuation);
                this.$ownerName = str;
                this.$cardNumber = str2;
                this.$year = str3;
                this.$month = str4;
                this.$securityCode = str5;
                this.$bankCard = bankCard;
                this.$callBack = function2;
                this.$fail = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06521(this.$ownerName, this.$cardNumber, this.$year, this.$month, this.$securityCode, this.$bankCard, this.$callBack, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HashMap map = new HashMap();
                map.put("account_holder_name", this.$ownerName);
                map.put("account_number", this.$cardNumber);
                map.put("expiry_year", this.$year);
                map.put("expiry_month", this.$month);
                map.put("cvv2", this.$securityCode);
                vqg.a("master prepare map:" + new Gson().toJson(map) + "createCard type" + this.$bankCard.getCardType());
                BaseResponse baseResponsePrepare = this.$bankCard.prepare(map);
                vqg.d("master prepare code:" + baseResponsePrepare.getResultCode() + "  msg:" + baseResponsePrepare.getMsg());
                AnyExtKt.main$default(null, new C06531(baseResponsePrepare, this.$callBack, this.$bankCard, this.$fail, null), 1, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, String str2, String str3, String str4, String str5, BankCard bankCard, Function2<? super Boolean, ? super PreDigitizeResp, Unit> function2, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ownerName = str;
            this.$cardNumber = str2;
            this.$year = str3;
            this.$month = str4;
            this.$securityCode = str5;
            this.$bankCard = bankCard;
            this.$callBack = function2;
            this.$fail = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ownerName, this.$cardNumber, this.$year, this.$month, this.$securityCode, this.$bankCard, this.$callBack, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06521 c06521 = new C06521(this.$ownerName, this.$cardNumber, this.$year, this.$month, this.$securityCode, this.$bankCard, this.$callBack, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06521, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void createCard(@NotNull String cardNum, @NotNull Function2<? super BankCard, ? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(cardNum, "cardNum");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        try {
            callBack.invoke(s3q.f0().O(cardNum), null);
        } catch (Exception e) {
            callBack.invoke(null, e.getMessage());
        }
    }

    public final void master(@NotNull BankCard bankCard, @NotNull String cardNumber, @NotNull String ownerName, @NotNull String year, @NotNull String month, @NotNull String securityCode, @NotNull Function2<? super Boolean, ? super PreDigitizeResp, Unit> callBack, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(bankCard, "bankCard");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(ownerName, cardNumber, year, month, securityCode, bankCard, callBack, fail, null), 3, null);
    }
}
