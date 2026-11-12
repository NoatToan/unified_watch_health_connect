package com.xiaomi.hm.health.discovery.jsbridge.function.sky;

import android.app.Activity;
import android.content.Context;
import com.google.gson.JsonObject;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.sky.entry.SkySurveyState;
import com.huami.sky.service.PlayState;
import com.huami.sky.service.SkyService;
import com.huami.sky.service.SkySurveyService;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.utils.HMActivityManager;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/sky/SkySurveyHandler;", "", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "", "handler", "Lkotlinx/coroutines/CoroutineScope;", "scope", PointCategory.INIT, "release", "Lcom/huami/sky/service/SkySurveyService;", "a", "Lcom/huami/sky/service/SkySurveyService;", "skySurveyService", "Lkotlinx/coroutines/Job;", "b", "Lkotlinx/coroutines/Job;", "skySurveyJob", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SkySurveyHandler {

    @NotNull
    public static final SkySurveyHandler INSTANCE = new SkySurveyHandler();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static SkySurveyService skySurveyService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static Job skySurveyJob;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/entry/SkySurveyState;", "skySurveyState", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.discovery.jsbridge.function.sky.SkySurveyHandler$init$1$1", f = "SkySurveyHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<SkySurveyState, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ SkyService c;
        public final /* synthetic */ SkySurveyService d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.discovery.jsbridge.function.sky.SkySurveyHandler$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0953a extends Lambda implements Function0<String> {
            public final /* synthetic */ SkySurveyState a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0953a(SkySurveyState skySurveyState) {
                super(0);
                this.a = skySurveyState;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "skySurveyState:" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Activity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Activity activity) {
                super(0);
                this.a = activity;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                Activity activity = this.a;
                return "topActivity:" + (activity == null ? null : activity.getClass().getSimpleName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SkyService skyService, SkySurveyService skySurveyService, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = skyService;
            this.d = skySurveyService;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SkySurveyState skySurveyState, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(skySurveyState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, continuation);
            aVar.b = obj;
            return aVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Context context;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SkySurveyState skySurveyState = (SkySurveyState) this.b;
            HMLog.info("StarSkyBindingLogic", new C0953a(skySurveyState));
            if (this.c.getPlayState() != PlayState.PLAYING && (skySurveyState instanceof SkySurveyState.ExitPlayerPage)) {
                Activity currentActivity = HMActivityManager.INSTANCE.getCurrentActivity();
                HMLog.info("StarSkyBindingLogic", new b(currentActivity));
                SkySurveyService skySurveyService = this.d;
                if (currentActivity == null) {
                    context = currentActivity;
                    context = (Context) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
                }
                context = currentActivity;
                skySurveyService.launchSurveyPage(context);
            }
            return Unit.INSTANCE;
        }
    }

    private SkySurveyHandler() {
    }

    @JvmStatic
    public static final void handler(@NotNull JsCallBackFunction function) {
        SkySurveyService skySurveyService2 = skySurveyService;
        if (skySurveyService2 != null) {
            skySurveyService2.notifyState(SkySurveyState.ExitSurveyPage.INSTANCE);
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("status", "success");
        function.onCallBack(jsonObject.toString());
    }

    public final void init(@NotNull CoroutineScope scope) {
        skySurveyService = (SkySurveyService) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(SkySurveyService.class), null, null);
        SkyService skyService = (SkyService) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SkyService.class), null, null);
        SkySurveyService skySurveyService2 = skySurveyService;
        skySurveyJob = skySurveyService2 != null ? FlowKt.launchIn(FlowKt.onEach(skySurveyService2.listenSkySurveyState(), new a(skyService, skySurveyService2, null)), scope) : null;
    }

    public final void release() {
        SkySurveyService skySurveyService2 = skySurveyService;
        if (skySurveyService2 != null) {
            skySurveyService2.notifyState(SkySurveyState.NoneState.INSTANCE);
        }
        Job job = skySurveyJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        skySurveyJob = null;
    }
}
