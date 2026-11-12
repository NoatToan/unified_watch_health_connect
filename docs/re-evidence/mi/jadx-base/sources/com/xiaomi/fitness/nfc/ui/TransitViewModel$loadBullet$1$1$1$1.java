package com.xiaomi.fitness.nfc.ui;

import com.miui.tsmclient.entity.BulletinResponseInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBullet$1$1$1$1", f = "TransitViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTransitViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitViewModel.kt\ncom/xiaomi/fitness/nfc/ui/TransitViewModel$loadBullet$1$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1872#2,3:221\n*S KotlinDebug\n*F\n+ 1 TransitViewModel.kt\ncom/xiaomi/fitness/nfc/ui/TransitViewModel$loadBullet$1$1$1$1\n*L\n118#1:221,3\n*E\n"})
public final class TransitViewModel$loadBullet$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<BulletinResponseInfo.BulletinInfo> $list;
    final /* synthetic */ Function1<String, Unit> $success;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransitViewModel$loadBullet$1$1$1$1(List<BulletinResponseInfo.BulletinInfo> list, Function1<? super String, Unit> function1, Continuation<? super TransitViewModel$loadBullet$1$1$1$1> continuation) {
        super(2, continuation);
        this.$list = list;
        this.$success = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransitViewModel$loadBullet$1$1$1$1(this.$list, this.$success, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        StringBuilder sb = new StringBuilder();
        List<BulletinResponseInfo.BulletinInfo> list = this.$list;
        Intrinsics.checkNotNull(list);
        List<BulletinResponseInfo.BulletinInfo> list2 = this.$list;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            sb.append(((BulletinResponseInfo.BulletinInfo) obj2).getContent());
            if (i > 0 && i < list2.size() - 1) {
                sb.append(" > ");
            }
            i = i2;
        }
        Function1<String, Unit> function1 = this.$success;
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        function1.invoke2(string);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransitViewModel$loadBullet$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
