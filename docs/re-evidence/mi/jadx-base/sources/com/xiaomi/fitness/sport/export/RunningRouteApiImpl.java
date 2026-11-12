package com.xiaomi.fitness.sport.export;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.sport.export.RunningRouteApiImpl;
import com.xiaomi.fitness.sport.route.detail.model.ClockInResult;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.sporttab.SupportCityManager;
import com.xiaomi.fitness.sport.view.route.CreateRouteActivity;
import com.xiaomi.fitness.sport.view.route.CreateRouteDetailActivity;
import com.xiaomi.fitness.sport_export.IRunningRouteApi;
import com.xiaomi.fitness.sport_export.bean.ClockData;
import com.xiaomi.fitness.sport_export.data.RouteCollectResponse;
import com.xiaomi.fitness.sport_export.data.RouteCollectResult;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J8\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010!H\u0096@¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0015H\u0016J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u001fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport/export/RunningRouteApiImpl;", "Lcom/xiaomi/fitness/sport_export/IRunningRouteApi;", "<init>", "()V", "routeRepo", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "getRouteRepo", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "setRouteRepo", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "goToRouteDetailActivity", "", "context", "Landroid/content/Context;", "routeId", "", "traceFileUrl", "", "gotoCreateRouteDetailActivity", "getRouteClockInSuccessLiveData", "Landroidx/lifecycle/LiveData;", "", "sid", "sportRecordKey", "startTime", "", "score", "getCollectList", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResponse;", "page", "limit", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSupportCity", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supportCity", "gotoCreateRunningRouteActivity", "collectRoute", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResult;", "collect", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningRouteApiImpl implements IRunningRouteApi {

    @NotNull
    public static final String TAG = "RunningRouteApiImpl";
    public RouteRepository routeRepo;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.export.RunningRouteApiImpl$getRouteClockInSuccessLiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.export.RunningRouteApiImpl$getRouteClockInSuccessLiveData$1", f = "RunningRouteApiImpl.kt", i = {0}, l = {66, 74}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $routeId;
        final /* synthetic */ int $score;
        final /* synthetic */ String $sid;
        final /* synthetic */ String $sportRecordKey;
        final /* synthetic */ long $startTime;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, long j, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$sportRecordKey = str2;
            this.$startTime = j;
            this.$score = i;
            this.$routeId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = RunningRouteApiImpl.this.new AnonymousClass1(this.$sid, this.$sportRecordKey, this.$startTime, this.$score, this.$routeId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            RouteRepository routeRepo = RunningRouteApiImpl.this.getRouteRepo();
            String str = this.$sid;
            String str2 = this.$sportRecordKey;
            long j = this.$startTime;
            ClockData clockData = new ClockData(CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(this.$score)), this.$routeId, 3);
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = routeRepo.routeClockIn(str, str2, j, "bind", clockData, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ClockInResult clockInResult = (ClockInResult) obj;
            Logger.d(RunningRouteApiImpl.TAG, "routeClockInSuccessLiveData clockInResult=" + clockInResult);
            Boolean boolBoxBoolean = Boxing.boxBoolean(clockInResult != null);
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goToRouteDetailActivity$lambda$0(Context context, int i, String str, boolean z, Exception exc) {
        Intrinsics.checkNotNullParameter(context, "$context");
        if (z) {
            AnyExtKt.main$default(null, new RunningRouteApiImpl$goToRouteDetailActivity$1$1(context, i, str, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_export.IRunningRouteApi
    @Nullable
    public Object checkSupportCity(@NotNull Continuation<? super RunningRouteSupportCityBean> continuation) {
        return getRouteRepo().getRunningRouteSupportCity(null, continuation);
    }

    @Override // com.xiaomi.fitness.sport_export.IRunningRouteApi
    @Nullable
    public Object collectRoute(int i, int i2, @NotNull Continuation<? super RouteCollectResult> continuation) {
        return getRouteRepo().collectRoute(i, i2, continuation);
    }

    @Override // com.xiaomi.fitness.sport_export.IRunningRouteApi
    @Nullable
    public Object getCollectList(int i, int i2, @NotNull Continuation<? super RouteCollectResponse> continuation) {
        return getRouteRepo().getRouteCollectList(i, i2, continuation);
    }

    @Override // com.xiaomi.fitness.sport_export.IRunningRouteApi
    @NotNull
    public LiveData<Boolean> getRouteClockInSuccessLiveData(@Nullable String sid, @NotNull String sportRecordKey, long startTime, int routeId, int score) {
        Intrinsics.checkNotNullParameter(sportRecordKey, "sportRecordKey");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(sid, sportRecordKey, startTime, score, routeId, null), 3, (Object) null);
    }

    @NotNull
    public final RouteRepository getRouteRepo() {
        RouteRepository routeRepository = this.routeRepo;
        if (routeRepository != null) {
            return routeRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("routeRepo");
        return null;
    }

    @Override // com.xiaomi.fitness.sport_export.IRunningRouteApi
    public void goToRouteDetailActivity(@NotNull final Context context, final int routeId, @Nullable final String traceFileUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        MapDynamicUtils.INSTANCE.checkSoLoaded(context instanceof FragmentActivity ? (FragmentActivity) context : null, new Function2() { // from class: n2l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RunningRouteApiImpl.goToRouteDetailActivity$lambda$0(context, routeId, traceFileUrl, ((Boolean) obj).booleanValue(), (Exception) obj2);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_export.IRunningRouteApi
    public void gotoCreateRouteDetailActivity(@NotNull Context context, int routeId) {
        Intrinsics.checkNotNullParameter(context, "context");
        CreateRouteDetailActivity.Companion.start$default(CreateRouteDetailActivity.INSTANCE, context, routeId, null, false, 12, null);
    }

    @Override // com.xiaomi.fitness.sport_export.IRunningRouteApi
    public void gotoCreateRunningRouteActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
            return;
        }
        Intent intent = new Intent(context, (Class<?>) CreateRouteActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public final void setRouteRepo(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "<set-?>");
        this.routeRepo = routeRepository;
    }

    @Override // com.xiaomi.fitness.sport_export.IRunningRouteApi
    public boolean supportCity() {
        return SupportCityManager.INSTANCE.isAIOpen();
    }
}
