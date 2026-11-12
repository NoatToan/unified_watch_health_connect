package com.xiaomi.fitness.running.group.api;

import android.content.Intent;
import android.net.Uri;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.running.group.export.RunningGroupApi;
import com.xiaomi.fitness.running.group.export.data.RunningGroupEntranceResult;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/running/group/api/RunningGroupApiImpl;", "Lcom/xiaomi/fitness/running/group/export/RunningGroupApi;", "<init>", "()V", "request", "Lcom/xiaomi/fitness/running/group/api/RunningGroupRequest;", "getRequest", "()Lcom/xiaomi/fitness/running/group/api/RunningGroupRequest;", "setRequest", "(Lcom/xiaomi/fitness/running/group/api/RunningGroupRequest;)V", "getRunningGroupEntrance", "", TSMAuthContants.PARAM_CITYCODE, "", "callback", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceResult;", "getRunningGroupDetailIntent", "Landroid/content/Intent;", "srcIntent", "Companion", "running-group_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningGroupApiImpl implements RunningGroupApi {

    @NotNull
    public static final String PARAM_ID = "id";

    @NotNull
    public static final String TAG = "RunningGroupApiImpl";
    public RunningGroupRequest request;

    /* JADX INFO: renamed from: com.xiaomi.fitness.running.group.api.RunningGroupApiImpl$getRunningGroupEntrance$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.running.group.api.RunningGroupApiImpl$getRunningGroupEntrance$1", f = "RunningGroupApiImpl.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<RunningGroupEntranceResult, Unit> $callback;
        final /* synthetic */ String $cityCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, Function1<? super RunningGroupEntranceResult, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cityCode = str;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningGroupApiImpl.this.new AnonymousClass1(this.$cityCode, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RunningGroupEntranceResult runningGroupEntranceResult;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RunningGroupRequest request = RunningGroupApiImpl.this.getRequest();
                    String str = this.$cityCode;
                    this.label = 1;
                    obj = request.getTeamEntrance(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                runningGroupEntranceResult = (RunningGroupEntranceResult) obj;
            } catch (Exception e) {
                Logger.e(RunningGroupApiImpl.TAG, "getRunningGroupEntrance fail: " + e);
                e.printStackTrace();
                runningGroupEntranceResult = null;
            }
            this.$callback.invoke(runningGroupEntranceResult);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public final RunningGroupRequest getRequest() {
        RunningGroupRequest runningGroupRequest = this.request;
        if (runningGroupRequest != null) {
            return runningGroupRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    @Override // com.xiaomi.fitness.running.group.export.RunningGroupApi
    @Nullable
    public Intent getRunningGroupDetailIntent(@Nullable Intent srcIntent) {
        Uri data;
        Intent intent = new Intent();
        String queryParameter = (srcIntent == null || (data = srcIntent.getData()) == null) ? null : data.getQueryParameter("id");
        try {
            intent.putExtra("rn_route", true);
            intent.putExtra(FaceDetailFragment.PAGE_NAME, "https://m.xiaomi.com/miwear/sport/RunGroupDetail?id=" + queryParameter + "&source=share");
            if (queryParameter != null) {
                intent.putExtra("id", Long.parseLong(queryParameter));
            }
        } catch (Exception unused) {
        }
        intent.setFlags(268468224);
        return intent;
    }

    @Override // com.xiaomi.fitness.running.group.export.RunningGroupApi
    public void getRunningGroupEntrance(@NotNull String cityCode, @NotNull Function1<? super RunningGroupEntranceResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1(cityCode, callback, null), 1, null);
    }

    public final void setRequest(@NotNull RunningGroupRequest runningGroupRequest) {
        Intrinsics.checkNotNullParameter(runningGroupRequest, "<set-?>");
        this.request = runningGroupRequest;
    }
}
