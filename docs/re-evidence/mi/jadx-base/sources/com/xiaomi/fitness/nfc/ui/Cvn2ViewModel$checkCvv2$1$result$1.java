package com.xiaomi.fitness.nfc.ui;

import java.util.HashMap;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.Cvn2ViewModel$checkCvv2$1$result$1", f = "Cvn2ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Cvn2ViewModel$checkCvv2$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cardNumber;
    final /* synthetic */ String $month;
    final /* synthetic */ String $ownerName;
    final /* synthetic */ String $securityCode;
    final /* synthetic */ String $year;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cvn2ViewModel$checkCvv2$1$result$1(String str, String str2, String str3, String str4, String str5, Continuation<? super Cvn2ViewModel$checkCvv2$1$result$1> continuation) {
        super(2, continuation);
        this.$ownerName = str;
        this.$cardNumber = str2;
        this.$year = str3;
        this.$month = str4;
        this.$securityCode = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Cvn2ViewModel$checkCvv2$1$result$1(this.$ownerName, this.$cardNumber, this.$year, this.$month, this.$securityCode, continuation);
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
        map.put("security_code", this.$securityCode);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Cvn2ViewModel$checkCvv2$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
