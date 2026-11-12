package com.huami.homepage.promotion.server;

import androidx.p008lifecycle.LiveData;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.homepage.promotion.beans.PromotionVo;
import com.huami.tools.log.HMLog;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/homepage/promotion/server/PromotionDataManager;", "", "Lcom/huami/homepage/promotion/server/PromotionType;", "promotionType", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/homepage/promotion/beans/PromotionVo;", "loadData", "", "a", LogUtil.I, "MAX_COUNT", "<init>", "()V", "promotion_release"}, k = 1, mv = {1, 5, 1})
public final class PromotionDataManager {

    @NotNull
    public static final PromotionDataManager INSTANCE = new PromotionDataManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int MAX_COUNT = 20;

    private PromotionDataManager() {
    }

    @NotNull
    public final LiveData<List<PromotionVo>> loadData(@NotNull final PromotionType promotionType) {
        return new LiveData<List<? extends PromotionVo>>() { // from class: com.huami.homepage.promotion.server.PromotionDataManager.loadData.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final AtomicBoolean requested = new AtomicBoolean(false);

            /* JADX INFO: renamed from: com.huami.homepage.promotion.server.PromotionDataManager$loadData$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.homepage.promotion.server.PromotionDataManager$loadData$1$onActive$1", f = "PromotionDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ PromotionType b;
                public final /* synthetic */ AnonymousClass1 c;

                /* JADX INFO: renamed from: com.huami.homepage.promotion.server.PromotionDataManager$loadData$1$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0449a extends Lambda implements Function0<String> {
                    public final /* synthetic */ List<PromotionVo> a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0449a(List<PromotionVo> list) {
                        super(0);
                        this.a = list;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return this.a.toString();
                    }
                }

                /* JADX INFO: renamed from: com.huami.homepage.promotion.server.PromotionDataManager$loadData$1$a$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ Exception a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(Exception exc) {
                        super(0);
                        this.a = exc;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return this.a + "首页推广位数据请求失败";
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(PromotionType promotionType, AnonymousClass1 anonymousClass1, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = promotionType;
                    this.c = anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new a(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    List listEmptyList;
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    try {
                        PromotionWebLoader promotionWebLoader = PromotionWebLoader.INSTANCE;
                        listEmptyList = CollectionsKt___CollectionsKt.take(promotionWebLoader.toPromotionVoList(promotionWebLoader.request(this.b)), 20);
                        this.c.requested.set(true);
                        HMLog.info("PromotionDataManager", new C0449a(listEmptyList));
                    } catch (Exception e) {
                        HMLog.info("PromotionDataManager", new b(e));
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    postValue(listEmptyList);
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.p008lifecycle.LiveData
            public void onActive() {
                if (this.requested.get()) {
                    return;
                }
                e.f(GlobalScope.INSTANCE, null, null, new a(promotionType, this, null), 3, null);
            }
        };
    }
}
