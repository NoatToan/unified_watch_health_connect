package com.xiaomi.fitness.nfc.schema;

import com.service.mi.BankCard;
import com.service.mi.entity.BaseResponse;
import com.service.mi.wallet.entity.resp.CardListResp;
import defpackage.rvf;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/service/mi/BankCard;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.schema.NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1", f = "NFCPushSchemaHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nNFCPushSchemaHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NFCPushSchemaHandler.kt\ncom/xiaomi/fitness/nfc/schema/NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1863#2,2:105\n*S KotlinDebug\n*F\n+ 1 NFCPushSchemaHandler.kt\ncom/xiaomi/fitness/nfc/schema/NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1\n*L\n90#1:105,2\n*E\n"})
public final class NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BankCard>, Object> {
    final /* synthetic */ String $cardID;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1(String str, Continuation<? super NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1> continuation) {
        super(2, continuation);
        this.$cardID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1(this.$cardID, continuation);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.service.mi.BankCard] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BaseResponse baseResponseF = new rvf().f();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (baseResponseF.isStatusOK()) {
            Object data = baseResponseF.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.service.mi.wallet.entity.resp.CardListResp");
            List<BankCard> cardList = ((CardListResp) data).getCardList();
            Intrinsics.checkNotNull(cardList);
            String str = this.$cardID;
            Iterator<T> it = cardList.iterator();
            while (it.hasNext()) {
                ?? r2 = (BankCard) it.next();
                if (Intrinsics.areEqual(r2.getTokenUniqueReference(), str)) {
                    objectRef.element = r2;
                }
            }
        }
        return objectRef.element;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BankCard> continuation) {
        return ((NFCPushSchemaHandler$loadMasterCardList$1$bankCard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
