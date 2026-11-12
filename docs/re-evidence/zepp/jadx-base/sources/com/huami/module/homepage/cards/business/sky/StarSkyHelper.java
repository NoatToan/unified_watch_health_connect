package com.huami.module.homepage.cards.business.sky;

import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.sky.entry.SkyCardEntry;
import com.huami.sky.service.SkyPromotionService;
import com.huami.sky.service.SkyUpdateShowInfo;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004R!\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/module/homepage/cards/business/sky/StarSkyHelper;", "", "", "initSkyHelper", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "starSkyInterceptor", "requestSkyCardEntry", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/huami/sky/entry/SkyCardEntry;", "a", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getSkyCardEntry", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "skyCardEntry", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class StarSkyHelper {

    @NotNull
    public static final StarSkyHelper INSTANCE = new StarSkyHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final MutableSharedFlow<SkyCardEntry> skyCardEntry = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyHelper", f = "StarSkyHelper.kt", i = {0}, l = {57, 60}, m = "requestSkyCardEntry", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return StarSkyHelper.this.requestSkyCardEntry(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ SkyCardEntry a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SkyCardEntry skyCardEntry) {
            super(0);
            this.a = skyCardEntry;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "entry:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load sky net service error: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sky.StarSkyHelper", f = "StarSkyHelper.kt", i = {}, l = {37}, m = "starSkyInterceptor", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return StarSkyHelper.this.starSkyInterceptor(this);
        }
    }

    private StarSkyHelper() {
    }

    @NotNull
    public final MutableSharedFlow<SkyCardEntry> getSkyCardEntry() {
        return skyCardEntry;
    }

    @Nullable
    public final Object initSkyHelper(@NotNull Continuation<? super Unit> continuation) {
        Object objEmit = getSkyCardEntry().emit(null, continuation);
        return objEmit == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object requestSkyCardEntry(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        StarSkyHelper starSkyHelper;
        MutableSharedFlow<SkyCardEntry> skyCardEntry2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                if (HomeUtils.isAnonymousUser()) {
                    return Unit.INSTANCE;
                }
                ServiceManager serviceManager = ServiceManager.INSTANCE;
                SkyPromotionService skyPromotionService = serviceManager.getSkyPromotionService();
                SkyUpdateShowInfo skyUpdateShow = skyPromotionService == null ? null : skyPromotionService.getSkyUpdateShow();
                SkyCardEntry skyCardEntry3 = serviceManager.getSkyCardService().getSkyCardEntry(skyUpdateShow == null ? null : Boxing.boxLong(skyUpdateShow.getCreateTime()));
                HMLog.info("StarSkyBindingLogic", new b(skyCardEntry3));
                MutableSharedFlow<SkyCardEntry> skyCardEntry4 = getSkyCardEntry();
                aVar.a = this;
                aVar.d = 1;
                if (skyCardEntry4.emit(skyCardEntry3, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                e = e;
                starSkyHelper = this;
                HMLog.error$default("StarSkyBindingLogic", null, null, new c(e), 6, null);
                skyCardEntry2 = starSkyHelper.getSkyCardEntry();
                aVar.a = null;
                aVar.d = 2;
                if (skyCardEntry2.emit(null, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i2 == 1) {
            starSkyHelper = (StarSkyHelper) aVar.a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e2) {
                e = e2;
                HMLog.error$default("StarSkyBindingLogic", null, null, new c(e), 6, null);
                skyCardEntry2 = starSkyHelper.getSkyCardEntry();
                aVar.a = null;
                aVar.d = 2;
                if (skyCardEntry2.emit(null, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object starSkyInterceptor(@NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objFirstOrNull = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.c;
        boolean display = false;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFirstOrNull);
                MutableSharedFlow<SkyCardEntry> skyCardEntry2 = getSkyCardEntry();
                dVar.c = 1;
                objFirstOrNull = FlowKt.firstOrNull(skyCardEntry2, dVar);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirstOrNull);
            }
            SkyCardEntry skyCardEntry3 = (SkyCardEntry) objFirstOrNull;
            if (skyCardEntry3 != null) {
                display = skyCardEntry3.getDisplay();
            }
        } catch (Exception unused) {
        }
        return Boxing.boxBoolean(display);
    }
}
