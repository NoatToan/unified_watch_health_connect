package com.xiaomi.fitness.sport.view.route;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwnerKt;
import com.xiaomi.fitness.sport.route.detail.model.ProgressRouteStatus;
import com.xiaomi.fitness.sport.route.detail.model.StrategyRouteListBean;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel;
import com.xiaomi.fitness.sport_export.data.StrategyRouteInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteConfirmRouteFragment$initButtonState$2$1", f = "CreateRouteConfirmRouteFragment.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteConfirmRouteFragment$initButtonState$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CreateRouteConfirmRouteFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteConfirmRouteFragment$initButtonState$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteConfirmRouteFragment$initButtonState$2$1$1", f = "CreateRouteConfirmRouteFragment.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CreateRouteConfirmRouteFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CreateRouteConfirmRouteFragment createRouteConfirmRouteFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = createRouteConfirmRouteFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CreateRouteConfirmRouteFragment createRouteConfirmRouteFragment, int i, int i2) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(createRouteConfirmRouteFragment), null, null, new CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1(i, createRouteConfirmRouteFragment, i2, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String downloadPath;
            ProgressRouteStatus second;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteViewModel createRouteViewModel = this.this$0.createRouteViewModel;
                if (createRouteViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel = null;
                }
                CreateRouteViewModel createRouteViewModel2 = this.this$0.createRouteViewModel;
                if (createRouteViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel2 = null;
                }
                Pair<Boolean, ProgressRouteStatus> value = createRouteViewModel2.getProgressLoadingFlow().getValue();
                Integer numBoxInt = (value == null || (second = value.getSecond()) == null) ? null : Boxing.boxInt(second.getStrategyId());
                Intrinsics.checkNotNull(numBoxInt);
                int iIntValue = numBoxInt.intValue();
                CreateRouteViewModel createRouteViewModel3 = this.this$0.createRouteViewModel;
                if (createRouteViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel3 = null;
                }
                List<CreateRouteViewModel.RouteData> value2 = createRouteViewModel3.getAiRouteDataFlow().getValue();
                if (value2 == null) {
                    downloadPath = "";
                } else {
                    CreateRouteViewModel createRouteViewModel4 = this.this$0.createRouteViewModel;
                    if (createRouteViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                        createRouteViewModel4 = null;
                    }
                    CreateRouteViewModel.RouteData routeData = value2.get(createRouteViewModel4.getAiRouteSelected());
                    if (routeData == null || (downloadPath = routeData.getDownloadPath()) == null) {
                        downloadPath = "";
                    }
                }
                CreateRouteViewModel createRouteViewModel5 = this.this$0.createRouteViewModel;
                if (createRouteViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel5 = null;
                }
                Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) createRouteViewModel5.getUserRouteStrategyListResultFlow().getReplayCache());
                Intrinsics.checkNotNull(objFirst);
                List<StrategyRouteInfo> strategyRouteInfoList = ((StrategyRouteListBean) objFirst).getStrategyRouteInfoList();
                Intrinsics.checkNotNull(strategyRouteInfoList);
                CreateRouteViewModel createRouteViewModel6 = this.this$0.createRouteViewModel;
                if (createRouteViewModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel6 = null;
                }
                String name = strategyRouteInfoList.get(createRouteViewModel6.getAiRouteSelected()).getName();
                CreateRouteViewModel.RouteData routeData2 = this.this$0.getRouteData();
                String strValueOf = String.valueOf((routeData2 != null ? routeData2.getLength() : 0.0d) * ((double) 1000));
                CreateRouteViewModel createRouteViewModel7 = this.this$0.createRouteViewModel;
                if (createRouteViewModel7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel7 = null;
                }
                Bitmap currentBitmap = createRouteViewModel7.getCurrentBitmap();
                Intrinsics.checkNotNull(currentBitmap);
                CreateRouteViewModel.RouteData routeData3 = this.this$0.getRouteData();
                Integer routeStyle = routeData3 != null ? routeData3.getRouteStyle() : null;
                CreateRouteViewModel.RouteData routeData4 = this.this$0.getRouteData();
                String startPoint = routeData4 != null ? routeData4.getStartPoint() : null;
                CreateRouteViewModel.RouteData routeData5 = this.this$0.getRouteData();
                String identify = routeData5 != null ? routeData5.getIdentify() : null;
                final CreateRouteConfirmRouteFragment createRouteConfirmRouteFragment = this.this$0;
                Function2 function2 = new Function2() { // from class: com.xiaomi.fitness.sport.view.route.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CreateRouteConfirmRouteFragment$initButtonState$2$1.AnonymousClass1.invokeSuspend$lambda$0(createRouteConfirmRouteFragment, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                    }
                };
                this.label = 1;
                if (RouteBaseViewModel.uploadTrackLibs$default(createRouteViewModel, iIntValue, downloadPath, name, strValueOf, currentBitmap, 0, routeStyle, startPoint, identify, function2, this, 32, null) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteConfirmRouteFragment$initButtonState$2$1(CreateRouteConfirmRouteFragment createRouteConfirmRouteFragment, Continuation<? super CreateRouteConfirmRouteFragment$initButtonState$2$1> continuation) {
        super(2, continuation);
        this.this$0 = createRouteConfirmRouteFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteConfirmRouteFragment$initButtonState$2$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
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
        return ((CreateRouteConfirmRouteFragment$initButtonState$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
