package com.xiaomi.hm.health.sleep.manger;

import android.content.Context;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.sleep.manger.SleepPromotionDataManager$loadData$1$onActive$1", f = "SleepPromotionDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SleepPromotionDataManager$loadData$1$onActive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ PromotionType $promotionType;
    public int label;
    public final /* synthetic */ SleepPromotionDataManager.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepPromotionDataManager$loadData$1$onActive$1(Context context, PromotionType promotionType, SleepPromotionDataManager.AnonymousClass1 anonymousClass1, Continuation<? super SleepPromotionDataManager$loadData$1$onActive$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$promotionType = promotionType;
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SleepPromotionDataManager$loadData$1$onActive$1(this.$context, this.$promotionType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SleepPromotionDataManager$loadData$1$onActive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List listEmptyList;
        a.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            PromotionWebLoader promotionWebLoader = PromotionWebLoader.INSTANCE;
            listEmptyList = CollectionsKt___CollectionsKt.take(promotionWebLoader.toPromotionVoList(promotionWebLoader.request(this.$context, this.$promotionType)), 3);
            this.this$0.requested.set(true);
        } catch (Exception e) {
            HMLog.warn("PromotionDataManager", e, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.manger.SleepPromotionDataManager$loadData$1$onActive$1$data$1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "首页推广位数据请求失败";
                }
            });
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        this.this$0.postValue(listEmptyList);
        return Unit.INSTANCE;
    }
}
