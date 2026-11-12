package com.huami.sky.ui.service;

import android.content.Context;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sky.entry.SkySurveyEntry;
import com.huami.sky.entry.SkySurveyState;
import com.huami.sky.service.SkyCardService;
import com.huami.sky.service.SkyNavigation;
import com.huami.sky.service.SkySurveyService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/sky/ui/service/SkySurveyServiceImpl;", "Lcom/huami/sky/service/SkySurveyService;", "", "a", "", "b", "Lcom/huami/sky/entry/SkySurveyState;", "state", "", "notifyState", "Lkotlinx/coroutines/flow/Flow;", "listenSkySurveyState", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "launchSurveyPage", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "skySurveyState", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkySurveyServiceImpl implements SkySurveyService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kv = KvKit.getKvPersistence$default("SkySurveyService", false, 2, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<SkySurveyState> skySurveyState = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "最近一次请求问卷调查时间：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.service.SkySurveyServiceImpl$launchSurveyPage$1", f = "SkySurveyServiceImpl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SkySurveyEntry a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SkySurveyEntry skySurveyEntry) {
                super(0);
                this.a = skySurveyEntry;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "surveyEntry:" + this.a;
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.service.SkySurveyServiceImpl$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.service.SkySurveyServiceImpl$launchSurveyPage$1$3", f = "SkySurveyServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0571b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ SkySurveyEntry c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0571b(Context context, SkySurveyEntry skySurveyEntry, Continuation<? super C0571b> continuation) {
                super(2, continuation);
                this.b = context;
                this.c = skySurveyEntry;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0571b(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0571b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SkyNavigation skyNavigation = (SkyNavigation) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(SkyNavigation.class), null, null);
                if (skyNavigation != null) {
                    skyNavigation.launchSurveyPage(this.b, this.c.getSurveyUrl());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkySurveyServiceImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SkySurveyEntry skyQuestionnaireUrl = ((SkyCardService) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SkyCardService.class), null, null)).getSkyQuestionnaireUrl();
                HMLog.info("StarSkyBindingLogic", new a(skyQuestionnaireUrl));
                String strA = SkySurveyServiceImpl.this.a();
                if (strA != null) {
                    Boxing.boxBoolean(SkySurveyServiceImpl.this.kv.setValue(strA, Boxing.boxLong(System.currentTimeMillis())));
                }
                if (skyQuestionnaireUrl != null) {
                    if (!(skyQuestionnaireUrl.getSurveyUrl().length() == 0)) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C0571b c0571b = new C0571b(this.c, skyQuestionnaireUrl, null);
                        this.a = 1;
                        if (BuildersKt.withContext(main, c0571b, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.service.SkySurveyServiceImpl$notifyState$1", f = "SkySurveyServiceImpl.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SkySurveyState c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SkySurveyState skySurveyState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = skySurveyState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkySurveyServiceImpl.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = SkySurveyServiceImpl.this.skySurveyState;
                SkySurveyState skySurveyState = this.c;
                this.a = 1;
                if (mutableSharedFlow.emit(skySurveyState, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        String strUserId = AccountServiceExtKt.userId((AccountService) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null));
        if (strUserId == null) {
            return null;
        }
        if (strUserId.length() > 0) {
            return strUserId;
        }
        return null;
    }

    private final boolean b() {
        String strA = a();
        if (strA == null) {
            return true;
        }
        long jLongValue = ((Number) this.kv.getValue(strA, 0L)).longValue();
        HMLog.info("StarSkyBindingLogic", new a(jLongValue));
        return TimeExtKt.isToday(jLongValue);
    }

    @Override // com.huami.sky.service.SkySurveyService
    public void launchSurveyPage(@NotNull Context context) {
        if (b()) {
            return;
        }
        e.f(this.scope, null, null, new b(context, null), 3, null);
    }

    @Override // com.huami.sky.service.SkySurveyService
    @NotNull
    public Flow<SkySurveyState> listenSkySurveyState() {
        return this.skySurveyState;
    }

    @Override // com.huami.sky.service.SkySurveyService
    public void notifyState(@NotNull SkySurveyState state) {
        e.f(this.scope, null, null, new c(state, null), 3, null);
    }
}
