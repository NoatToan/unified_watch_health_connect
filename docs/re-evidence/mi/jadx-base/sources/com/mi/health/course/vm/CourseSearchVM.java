package com.mi.health.course.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.export.data.CourseListData;
import com.mi.health.course.export.data.CourseListItem;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/mi/health/course/vm/CourseSearchVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "request", "Lcom/mi/health/course/api/CourseRequestV3;", "getRequest", "()Lcom/mi/health/course/api/CourseRequestV3;", "setRequest", "(Lcom/mi/health/course/api/CourseRequestV3;)V", "hasMore", "", "mNextKey", "", "stateData", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "viewStates", "Landroidx/lifecycle/MutableLiveData;", "getViewStates", "()Landroidx/lifecycle/MutableLiveData;", "getCatalogCourseList", "", TSMAuthContants.PARAM_KEYWORD, "resetPage", "setPageState", "resp", "Lcom/mi/health/course/export/data/CourseListData;", "attach", "savedInstanceState", "Landroid/os/Bundle;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseSearchVM extends AbsViewModel {
    private boolean hasMore;

    @Nullable
    private String mNextKey;
    public CourseRequestV3 request;

    @NotNull
    private final StateData<CatalogCourseFeed> stateData = new StateData<>();

    @NotNull
    private final MutableLiveData<StateData<CatalogCourseFeed>> viewStates = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseSearchVM$getCatalogCourseList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseSearchVM$getCatalogCourseList$1", f = "CourseSearchVM.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $keyword;
        final /* synthetic */ boolean $resetPage;
        int label;
        final /* synthetic */ CourseSearchVM this$0;

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseSearchVM$getCatalogCourseList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseSearchVM$getCatalogCourseList$1$1", f = "CourseSearchVM.kt", i = {0}, l = {55, 59}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        public static final class C03061 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CatalogCourseFeed>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogCourseFeed $data;
            final /* synthetic */ String $keyword;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseSearchVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03061(CourseSearchVM courseSearchVM, String str, CatalogCourseFeed catalogCourseFeed, Continuation<? super C03061> continuation) {
                super(2, continuation);
                this.this$0 = courseSearchVM;
                this.$keyword = str;
                this.$data = catalogCourseFeed;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03061 c03061 = new C03061(this.this$0, this.$keyword, this.$data, continuation);
                c03061.L$0 = obj;
                return c03061;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FlowCollector flowCollector;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        flowCollector = (FlowCollector) this.L$0;
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
                flowCollector = (FlowCollector) this.L$0;
                CourseRequestV3 request = this.this$0.getRequest();
                String str = this.$keyword;
                String str2 = this.this$0.mNextKey;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = request.getAidongCourseList("", "", str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CourseListData courseListData = (CourseListData) obj;
                this.this$0.setPageState(courseListData);
                ArrayList<CourseListItem> course = courseListData != null ? courseListData.getCourse() : null;
                this.$data.setFeeds(course);
                StateData stateDataB = (course == null || course.isEmpty()) ? this.this$0.stateData.b(this.$data) : this.this$0.stateData.r(this.$data);
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CatalogCourseFeed>> flowCollector, Continuation<? super Unit> continuation) {
                return ((C03061) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseSearchVM$getCatalogCourseList$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseSearchVM$getCatalogCourseList$1$2", f = "CourseSearchVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CatalogCourseFeed>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogCourseFeed $data;
            int label;
            final /* synthetic */ CourseSearchVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CourseSearchVM courseSearchVM, CatalogCourseFeed catalogCourseFeed, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = courseSearchVM;
                this.$data = catalogCourseFeed;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$data, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getViewStates().setValue(this.this$0.stateData.m(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CatalogCourseFeed>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseSearchVM$getCatalogCourseList$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u00022\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseSearchVM$getCatalogCourseList$1$3", f = "CourseSearchVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super StateData<CatalogCourseFeed>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogCourseFeed $data;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseSearchVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CourseSearchVM courseSearchVM, CatalogCourseFeed catalogCourseFeed, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = courseSearchVM;
                this.$data = catalogCourseFeed;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                Logger.e("CourseSearchVM", "getCatalogCourseList: error = " + th.getMessage());
                this.this$0.getViewStates().setValue(((th instanceof UnknownHostException) || (th instanceof SocketTimeoutException)) ? this.this$0.stateData.o(this.$data) : this.this$0.stateData.e(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super StateData<CatalogCourseFeed>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$data, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, CourseSearchVM courseSearchVM, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$resetPage = z;
            this.this$0 = courseSearchVM;
            this.$keyword = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$resetPage, this.this$0, this.$keyword, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$resetPage) {
                    this.this$0.mNextKey = null;
                    this.this$0.hasMore = false;
                }
                CatalogCourseFeed catalogCourseFeed = new CatalogCourseFeed(null, this.$resetPage, false, false, 13, null);
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.onStart(FlowKt.flow(new C03061(this.this$0, this.$keyword, catalogCourseFeed, null)), new AnonymousClass2(this.this$0, catalogCourseFeed, null)), new AnonymousClass3(this.this$0, catalogCourseFeed, null));
                final CourseSearchVM courseSearchVM = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.health.course.vm.CourseSearchVM.getCatalogCourseList.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StateData<CatalogCourseFeed>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StateData<CatalogCourseFeed> stateData, Continuation<? super Unit> continuation) {
                        courseSearchVM.getViewStates().setValue(stateData);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowM2416catch.collect(flowCollector, this) == coroutine_suspended) {
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

    public static /* synthetic */ void getCatalogCourseList$default(CourseSearchVM courseSearchVM, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        courseSearchVM.getCatalogCourseList(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPageState(CourseListData resp) {
        String nextKey = resp != null ? resp.getNextKey() : null;
        this.mNextKey = nextKey;
        this.hasMore = !(nextKey == null || nextKey.length() == 0);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void getCatalogCourseList(@Nullable String keyword, boolean resetPage) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(resetPage, this, keyword, null), 3, null);
    }

    @NotNull
    public final CourseRequestV3 getRequest() {
        CourseRequestV3 courseRequestV3 = this.request;
        if (courseRequestV3 != null) {
            return courseRequestV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    @NotNull
    public final MutableLiveData<StateData<CatalogCourseFeed>> getViewStates() {
        return this.viewStates;
    }

    /* JADX INFO: renamed from: hasMore, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final void setRequest(@NotNull CourseRequestV3 courseRequestV3) {
        Intrinsics.checkNotNullParameter(courseRequestV3, "<set-?>");
        this.request = courseRequestV3;
    }
}
