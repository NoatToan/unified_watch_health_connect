package com.xiaomi.fitness.sport.view.route;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.sport.route.detail.model.ProgressRouteStatus;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import defpackage.c1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1", f = "CreateRouteConfirmRouteFragment.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $code;
    final /* synthetic */ int $strategyId;
    int label;
    final /* synthetic */ CreateRouteConfirmRouteFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1$1", f = "CreateRouteConfirmRouteFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCreateRouteConfirmRouteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteConfirmRouteFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n1872#2,3:411\n*S KotlinDebug\n*F\n+ 1 CreateRouteConfirmRouteFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1$1\n*L\n234#1:411,3\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $code;
        final /* synthetic */ int $strategyId;
        int label;
        final /* synthetic */ CreateRouteConfirmRouteFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, CreateRouteConfirmRouteFragment createRouteConfirmRouteFragment, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$code = i;
            this.this$0 = createRouteConfirmRouteFragment;
            this.$strategyId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$code, this.this$0, this.$strategyId, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:74:0x019a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String downloadPath;
            String str2;
            String downloadPath2;
            ProgressRouteStatus second;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = this.$code;
            StringBuilder sb = new StringBuilder();
            sb.append("uploadTrackLibs  code:");
            sb.append(i);
            int i2 = this.$code;
            int i3 = 0;
            CreateRouteViewModel createRouteViewModel = null;
            if (i2 == -1) {
                CreateRouteActivity createRouteActivity = this.this$0.createRouteActivity;
                if (createRouteActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                    createRouteActivity = null;
                }
                String string = this.this$0.getString(c1j.b0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                CreateRouteActivity.showHintText$default(createRouteActivity, string, 0, 2, null);
                Logger.i(CreateRouteConfirmRouteFragment.TAG, "uploadTrackLibs aiPlanning same route,route stId:" + this.$strategyId);
                if (this.$strategyId > 0) {
                    CreateRouteDetailActivity.Companion companion = CreateRouteDetailActivity.INSTANCE;
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    int i4 = this.$strategyId;
                    CreateRouteViewModel createRouteViewModel2 = this.this$0.createRouteViewModel;
                    if (createRouteViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                        createRouteViewModel2 = null;
                    }
                    List<CreateRouteViewModel.RouteData> value = createRouteViewModel2.getAiRouteDataFlow().getValue();
                    if (value == null) {
                        str = "";
                    } else {
                        CreateRouteViewModel createRouteViewModel3 = this.this$0.createRouteViewModel;
                        if (createRouteViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                        } else {
                            createRouteViewModel = createRouteViewModel3;
                        }
                        CreateRouteViewModel.RouteData routeData = value.get(createRouteViewModel.getAiRouteSelected());
                        if (routeData == null || (downloadPath = routeData.getDownloadPath()) == null) {
                            str = "";
                        } else {
                            str = downloadPath;
                        }
                    }
                    CreateRouteDetailActivity.Companion.start$default(companion, contextRequireContext, i4, str, false, 8, null);
                    FragmentActivity activity = this.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            } else if (i2 != 0) {
                TrackApiKt.getInstance(TrackApi.INSTANCE).showTrackServerErrorToast(this.$code);
            } else {
                ToastUtil.showLongToast(c1j.F3);
                CreateRouteDetailActivity.Companion companion2 = CreateRouteDetailActivity.INSTANCE;
                Context contextRequireContext2 = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                CreateRouteViewModel createRouteViewModel4 = this.this$0.createRouteViewModel;
                if (createRouteViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel4 = null;
                }
                Pair<Boolean, ProgressRouteStatus> value2 = createRouteViewModel4.getProgressLoadingFlow().getValue();
                Integer numBoxInt = (value2 == null || (second = value2.getSecond()) == null) ? null : Boxing.boxInt(second.getStrategyId());
                Intrinsics.checkNotNull(numBoxInt);
                int iIntValue = numBoxInt.intValue();
                CreateRouteViewModel createRouteViewModel5 = this.this$0.createRouteViewModel;
                if (createRouteViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel5 = null;
                }
                List<CreateRouteViewModel.RouteData> value3 = createRouteViewModel5.getAiRouteDataFlow().getValue();
                if (value3 == null) {
                    str2 = "";
                } else {
                    CreateRouteViewModel createRouteViewModel6 = this.this$0.createRouteViewModel;
                    if (createRouteViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                        createRouteViewModel6 = null;
                    }
                    CreateRouteViewModel.RouteData routeData2 = value3.get(createRouteViewModel6.getAiRouteSelected());
                    if (routeData2 == null || (downloadPath2 = routeData2.getDownloadPath()) == null) {
                        str2 = "";
                    } else {
                        str2 = downloadPath2;
                    }
                }
                CreateRouteDetailActivity.Companion.start$default(companion2, contextRequireContext2, iIntValue, str2, false, 8, null);
                CreateRouteViewModel createRouteViewModel7 = this.this$0.createRouteViewModel;
                if (createRouteViewModel7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel7 = null;
                }
                List<CreateRouteViewModel.RouteData> value4 = createRouteViewModel7.getAiRouteDataFlow().getValue();
                if (value4 != null) {
                    CreateRouteConfirmRouteFragment createRouteConfirmRouteFragment = this.this$0;
                    for (Object obj2 : value4) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        CreateRouteViewModel.RouteData routeData3 = (CreateRouteViewModel.RouteData) obj2;
                        CreateRouteViewModel createRouteViewModel8 = createRouteConfirmRouteFragment.createRouteViewModel;
                        if (createRouteViewModel8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                            createRouteViewModel8 = null;
                        }
                        if (i3 != createRouteViewModel8.getAiRouteSelected()) {
                            CreateRouteViewModel createRouteViewModel9 = createRouteConfirmRouteFragment.createRouteViewModel;
                            if (createRouteViewModel9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                                createRouteViewModel9 = null;
                            }
                            createRouteViewModel9.deleteFiles(routeData3.getDownloadPath());
                        }
                        i3 = i5;
                    }
                }
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
    public CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1(int i, CreateRouteConfirmRouteFragment createRouteConfirmRouteFragment, int i2, Continuation<? super CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1> continuation) {
        super(2, continuation);
        this.$code = i;
        this.this$0 = createRouteConfirmRouteFragment;
        this.$strategyId = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1(this.$code, this.this$0, this.$strategyId, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$code, this.this$0, this.$strategyId, null);
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
        return ((CreateRouteConfirmRouteFragment$initButtonState$2$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
