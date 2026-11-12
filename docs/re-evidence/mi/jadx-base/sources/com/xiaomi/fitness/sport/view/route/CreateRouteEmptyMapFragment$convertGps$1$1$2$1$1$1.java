package com.xiaomi.fitness.sport.view.route;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.sport.route.detail.model.EmptyMapData;
import defpackage.c1j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$convertGps$1$1$2$1$1$1", f = "CreateRouteEmptyMapFragment.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteEmptyMapFragment$convertGps$1$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $code;
    final /* synthetic */ EmptyMapData $data;
    final /* synthetic */ String $filePath;
    final /* synthetic */ int $strategyId;
    int label;
    final /* synthetic */ CreateRouteEmptyMapFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$convertGps$1$1$2$1$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$convertGps$1$1$2$1$1$1$1", f = "CreateRouteEmptyMapFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $code;
        final /* synthetic */ EmptyMapData $data;
        final /* synthetic */ String $filePath;
        final /* synthetic */ int $strategyId;
        int label;
        final /* synthetic */ CreateRouteEmptyMapFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, int i, EmptyMapData emptyMapData, String str, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = createRouteEmptyMapFragment;
            this.$code = i;
            this.$data = emptyMapData;
            this.$filePath = str;
            this.$strategyId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$code, this.$data, this.$filePath, this.$strategyId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateRouteActivity createRouteActivity = this.this$0.createRouteActivity;
            if (createRouteActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity = null;
            }
            createRouteActivity.hideLoading();
            int i = this.$code;
            if (i == -1) {
                ToastUtil.INSTANCE.showToast(c1j.b0);
                Logger.i(this.this$0.getTAG(), "uploadTrackLibs routeDetail same route,route stId:" + this.$strategyId);
                if (this.$strategyId > 0) {
                    CreateRouteDetailActivity.Companion companion = CreateRouteDetailActivity.INSTANCE;
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    CreateRouteDetailActivity.Companion.start$default(companion, contextRequireContext, this.$strategyId, this.$filePath, false, 8, null);
                    FragmentActivity activity = this.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            } else if (i != 0) {
                TrackApiKt.getInstance(TrackApi.INSTANCE).showTrackServerErrorToast(this.$code);
            } else {
                ToastUtil.showLongToast(this.this$0.getString(c1j.F3));
                CreateRouteDetailActivity.Companion companion2 = CreateRouteDetailActivity.INSTANCE;
                Context contextRequireContext2 = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                CreateRouteDetailActivity.Companion.start$default(companion2, contextRequireContext2, this.$data.getStrategyId(), this.$filePath, false, 8, null);
                FragmentActivity activity2 = this.this$0.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteEmptyMapFragment$convertGps$1$1$2$1$1$1(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, int i, EmptyMapData emptyMapData, String str, int i2, Continuation<? super CreateRouteEmptyMapFragment$convertGps$1$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = createRouteEmptyMapFragment;
        this.$code = i;
        this.$data = emptyMapData;
        this.$filePath = str;
        this.$strategyId = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteEmptyMapFragment$convertGps$1$1$2$1$1$1(this.this$0, this.$code, this.$data, this.$filePath, this.$strategyId, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$code, this.$data, this.$filePath, this.$strategyId, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateRouteEmptyMapFragment$convertGps$1$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
