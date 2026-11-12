package com.xiaomi.fitness.nfc.ui.issued;

import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.KeyCardArt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import java.util.ArrayList;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/miui/tsmclient/sesdk/KeyCardArt$Art;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.CardRenameViewModel$loadFaceList$1$list$1", f = "CardRenameViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CardRenameViewModel$loadFaceList$1$list$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<KeyCardArt.Art>>, Object> {
    final /* synthetic */ CardWrapper $cardWrapper;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRenameViewModel$loadFaceList$1$list$1(CardWrapper cardWrapper, Continuation<? super CardRenameViewModel$loadFaceList$1$list$1> continuation) {
        super(2, continuation);
        this.$cardWrapper = cardWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardRenameViewModel$loadFaceList$1$list$1(this.$cardWrapper, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object[] objArr;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        BaseResponse artList = new KeyCardArt(this.$cardWrapper.mSeCard).getArtList();
        if (artList.isSuccess() && (objArr = artList.mDatas) != null) {
            if (!(objArr.length == 0)) {
                Object obj2 = objArr[0];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.miui.tsmclient.sesdk.KeyCardArt.ArtList");
                List<KeyCardArt.Art> artInfoList = ((KeyCardArt.ArtList) obj2).getArtInfoList();
                if (artInfoList != null) {
                    List<KeyCardArt.Art> list = artInfoList;
                    if (!list.isEmpty()) {
                        arrayList.addAll(list);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<KeyCardArt.Art>> continuation) {
        return ((CardRenameViewModel$loadFaceList$1$list$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
