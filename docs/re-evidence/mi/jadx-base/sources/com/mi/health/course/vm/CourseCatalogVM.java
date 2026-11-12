package com.mi.health.course.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.data.CatalogGroup;
import com.mi.health.course.data.CourseCatalogResp;
import com.mi.health.course.export.data.CourseCatalogConfigData;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001b\u001a\u00020\u000bJ\u001a\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0012\u0010!\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\"H\u0002J4\u0010#\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010$\u001a\u00020\u000bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010%\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0006\u0010-\u001a\u00020\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/mi/health/course/vm/CourseCatalogVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "request", "Lcom/mi/health/course/api/CourseRequestV3;", "getRequest", "()Lcom/mi/health/course/api/CourseRequestV3;", "setRequest", "(Lcom/mi/health/course/api/CourseRequestV3;)V", "hasMore", "", "nextKey", "", "stateData", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogFeed;", "viewStates", "Landroidx/lifecycle/MutableLiveData;", "getViewStates", "()Landroidx/lifecycle/MutableLiveData;", "reqFirstTotalPage", "", "scene", "type", "", "tags", "reqCatalog", "categoryTags", "", "Lcom/mi/health/course/data/CatalogGroup;", "resp", "Lcom/mi/health/course/data/CourseCatalogResp;", "setPageState", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "reqList", "resetPage", "attach", "savedInstanceState", "Landroid/os/Bundle;", "catalogConfigData", "Lcom/mi/health/course/export/data/CourseCatalogConfigData;", "getCatalogConfigData", "setCatalogConfigData", "(Landroidx/lifecycle/MutableLiveData;)V", "getCourseCatalogConfig", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseCatalogVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseCatalogVM.kt\ncom/mi/health/course/vm/CourseCatalogVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1557#2:125\n1628#2,3:126\n1863#2:129\n774#2:130\n865#2,2:131\n1864#2:133\n774#2:134\n865#2,2:135\n*S KotlinDebug\n*F\n+ 1 CourseCatalogVM.kt\ncom/mi/health/course/vm/CourseCatalogVM\n*L\n75#1:125\n75#1:126,3\n76#1:129\n76#1:130\n76#1:131,2\n76#1:133\n77#1:134\n77#1:135,2\n*E\n"})
public final class CourseCatalogVM extends AbsViewModel {
    private boolean hasMore;

    @Nullable
    private String nextKey;
    public CourseRequestV3 request;

    @NotNull
    private final StateData<CatalogFeed> stateData = new StateData<>();

    @NotNull
    private final MutableLiveData<StateData<CatalogFeed>> viewStates = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<CourseCatalogConfigData> catalogConfigData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogVM$getCourseCatalogConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$getCourseCatalogConfig$1", f = "CourseCatalogVM.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseCatalogVM.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<CourseCatalogConfigData> catalogConfigData = CourseCatalogVM.this.getCatalogConfigData();
                CourseRequestV3 request = CourseCatalogVM.this.getRequest();
                this.L$0 = catalogConfigData;
                this.label = 1;
                Object courseCatalogConfig = request.getCourseCatalogConfig(this);
                if (courseCatalogConfig == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = catalogConfigData;
                obj = courseCatalogConfig;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogVM$reqFirstTotalPage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$reqFirstTotalPage$1", f = "CourseCatalogVM.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $reqCatalog;
        final /* synthetic */ String $scene;
        final /* synthetic */ String $tags;
        final /* synthetic */ int[] $type;
        int label;
        final /* synthetic */ CourseCatalogVM this$0;

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogVM$reqFirstTotalPage$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogFeed;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$reqFirstTotalPage$1$1", f = "CourseCatalogVM.kt", i = {0, 0, 1, 1}, l = {55, 56, 61}, m = "invokeSuspend", n = {"$this$flow", "courseListJob", "$this$flow", "catalogResp"}, s = {"L$0", "L$1", "L$0", "L$1"})
        public static final class C03021 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CatalogFeed>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogFeed $data;
            final /* synthetic */ boolean $reqCatalog;
            final /* synthetic */ String $scene;
            final /* synthetic */ String $tags;
            final /* synthetic */ int[] $type;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ CourseCatalogVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03021(boolean z, CourseCatalogVM courseCatalogVM, CatalogFeed catalogFeed, String str, int[] iArr, String str2, Continuation<? super C03021> continuation) {
                super(2, continuation);
                this.$reqCatalog = z;
                this.this$0 = courseCatalogVM;
                this.$data = catalogFeed;
                this.$scene = str;
                this.$type = iArr;
                this.$tags = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03021 c03021 = new C03021(this.$reqCatalog, this.this$0, this.$data, this.$scene, this.$type, this.$tags, continuation);
                c03021.L$0 = obj;
                return c03021;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x00a4 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
            /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
            /* JADX WARN: Code duplicated, block: B:40:0x00f8 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Deferred deferredAsync$default;
                FlowCollector flowCollector;
                CourseCatalogResp courseCatalogResp;
                Object objAwait;
                Deferred deferred;
                Object objAwait2;
                CourseModel.CourseListData courseListData;
                List<CourseModel.CourseData> list;
                List<CourseModel.CourseData> feeds;
                StateData stateDataB;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        deferred = (Deferred) this.L$1;
                        FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        flowCollector = flowCollector2;
                        objAwait = obj;
                    } else if (i == 2) {
                        courseCatalogResp = (CourseCatalogResp) this.L$1;
                        FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        flowCollector = flowCollector3;
                        objAwait2 = obj;
                        courseListData = (CourseModel.CourseListData) objAwait2;
                        CatalogFeed catalogFeed = this.$data;
                        if (courseListData != null) {
                            list = courseListData.courseList;
                        } else {
                            list = null;
                        }
                        catalogFeed.setFeeds(list);
                        this.$data.setCatalogGroup(this.this$0.categoryTags(courseCatalogResp));
                        this.this$0.setPageState(courseListData);
                        feeds = this.$data.getFeeds();
                        if (feeds != null || feeds.isEmpty()) {
                            stateDataB = this.this$0.stateData.b(this.$data);
                        } else {
                            stateDataB = this.this$0.stateData.r(this.$data);
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                Deferred deferredAsync$default2 = this.$reqCatalog ? BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this.this$0), null, null, new CourseCatalogVM$reqFirstTotalPage$1$1$catalogJob$1(this.this$0, null), 3, null) : null;
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this.this$0), null, null, new CourseCatalogVM$reqFirstTotalPage$1$1$courseListJob$1(this.this$0, this.$scene, this.$type, this.$tags, null), 3, null);
                if (deferredAsync$default2 != null) {
                    this.L$0 = flowCollector4;
                    this.L$1 = deferredAsync$default;
                    this.label = 1;
                    objAwait = deferredAsync$default2.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowCollector = flowCollector4;
                    deferred = deferredAsync$default;
                } else {
                    flowCollector = flowCollector4;
                    courseCatalogResp = null;
                }
                this.L$0 = flowCollector;
                this.L$1 = courseCatalogResp;
                this.label = 2;
                objAwait2 = deferredAsync$default.await(this);
                if (objAwait2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                courseListData = (CourseModel.CourseListData) objAwait2;
                CatalogFeed catalogFeed2 = this.$data;
                if (courseListData != null) {
                    list = courseListData.courseList;
                } else {
                    list = null;
                }
                catalogFeed2.setFeeds(list);
                this.$data.setCatalogGroup(this.this$0.categoryTags(courseCatalogResp));
                this.this$0.setPageState(courseListData);
                feeds = this.$data.getFeeds();
                if (feeds != null) {
                    stateDataB = this.this$0.stateData.b(this.$data);
                } else {
                    stateDataB = this.this$0.stateData.b(this.$data);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
                deferredAsync$default = deferred;
                courseCatalogResp = (CourseCatalogResp) objAwait;
                this.L$0 = flowCollector;
                this.L$1 = courseCatalogResp;
                this.label = 2;
                objAwait2 = deferredAsync$default.await(this);
                if (objAwait2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                courseListData = (CourseModel.CourseListData) objAwait2;
                CatalogFeed catalogFeed3 = this.$data;
                if (courseListData != null) {
                    list = courseListData.courseList;
                } else {
                    list = null;
                }
                catalogFeed3.setFeeds(list);
                this.$data.setCatalogGroup(this.this$0.categoryTags(courseCatalogResp));
                this.this$0.setPageState(courseListData);
                feeds = this.$data.getFeeds();
                if (feeds != null) {
                    stateDataB = this.this$0.stateData.b(this.$data);
                } else {
                    stateDataB = this.this$0.stateData.b(this.$data);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CatalogFeed>> flowCollector, Continuation<? super Unit> continuation) {
                return ((C03021) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogVM$reqFirstTotalPage$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogFeed;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$reqFirstTotalPage$1$2", f = "CourseCatalogVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CatalogFeed>>, Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CatalogFeed>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogVM$reqFirstTotalPage$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u00022\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogFeed;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$reqFirstTotalPage$1$3", f = "CourseCatalogVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super StateData<CatalogFeed>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogFeed $data;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseCatalogVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CourseCatalogVM courseCatalogVM, CatalogFeed catalogFeed, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = courseCatalogVM;
                this.$data = catalogFeed;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                Logger.e("CourseCatalogVM", "reqFirstPage: error = " + th.getMessage());
                this.this$0.getViewStates().setValue(((th instanceof UnknownHostException) || (th instanceof SocketTimeoutException)) ? this.this$0.stateData.o(this.$data) : this.this$0.stateData.e(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super StateData<CatalogFeed>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$data, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14701(boolean z, CourseCatalogVM courseCatalogVM, String str, int[] iArr, String str2, Continuation<? super C14701> continuation) {
            super(2, continuation);
            this.$reqCatalog = z;
            this.this$0 = courseCatalogVM;
            this.$scene = str;
            this.$type = iArr;
            this.$tags = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14701(this.$reqCatalog, this.this$0, this.$scene, this.$type, this.$tags, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CatalogFeed catalogFeed = new CatalogFeed(null, null, true, true, 3, null);
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.onStart(FlowKt.flow(new C03021(this.$reqCatalog, this.this$0, catalogFeed, this.$scene, this.$type, this.$tags, null)), new AnonymousClass2(null)), new AnonymousClass3(this.this$0, catalogFeed, null));
                final CourseCatalogVM courseCatalogVM = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.health.course.vm.CourseCatalogVM.reqFirstTotalPage.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StateData<CatalogFeed>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StateData<CatalogFeed> stateData, Continuation<? super Unit> continuation) {
                        courseCatalogVM.getViewStates().setValue(stateData);
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
            return ((C14701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogVM$reqList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$reqList$1", f = "CourseCatalogVM.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $resetPage;
        final /* synthetic */ String $scene;
        final /* synthetic */ String $tags;
        final /* synthetic */ int[] $type;
        int label;
        final /* synthetic */ CourseCatalogVM this$0;

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogVM$reqList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogFeed;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$reqList$1$1", f = "CourseCatalogVM.kt", i = {0}, l = {95, 99}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        public static final class C03031 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CatalogFeed>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogFeed $data;
            final /* synthetic */ String $scene;
            final /* synthetic */ String $tags;
            final /* synthetic */ int[] $type;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseCatalogVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03031(CourseCatalogVM courseCatalogVM, String str, int[] iArr, String str2, CatalogFeed catalogFeed, Continuation<? super C03031> continuation) {
                super(2, continuation);
                this.this$0 = courseCatalogVM;
                this.$scene = str;
                this.$type = iArr;
                this.$tags = str2;
                this.$data = catalogFeed;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03031 c03031 = new C03031(this.this$0, this.$scene, this.$type, this.$tags, this.$data, continuation);
                c03031.L$0 = obj;
                return c03031;
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
                String str = this.$scene;
                int[] iArr = this.$type;
                String str2 = this.$tags;
                String str3 = this.this$0.nextKey;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = request.getCourseList(str, iArr, str2, str3, 20, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CourseModel.CourseListData courseListData = (CourseModel.CourseListData) obj;
                this.this$0.setPageState(courseListData);
                List<CourseModel.CourseData> list = courseListData != null ? courseListData.courseList : null;
                this.$data.setFeeds(list);
                StateData stateDataB = (list == null || list.isEmpty()) ? this.this$0.stateData.b(this.$data) : this.this$0.stateData.r(this.$data);
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CatalogFeed>> flowCollector, Continuation<? super Unit> continuation) {
                return ((C03031) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogVM$reqList$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogFeed;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$reqList$1$2", f = "CourseCatalogVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CatalogFeed>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogFeed $data;
            int label;
            final /* synthetic */ CourseCatalogVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CourseCatalogVM courseCatalogVM, CatalogFeed catalogFeed, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = courseCatalogVM;
                this.$data = catalogFeed;
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
            public final Object invoke(FlowCollector<? super StateData<CatalogFeed>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogVM$reqList$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u00022\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogFeed;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$reqList$1$3", f = "CourseCatalogVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super StateData<CatalogFeed>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogFeed $data;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseCatalogVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CourseCatalogVM courseCatalogVM, CatalogFeed catalogFeed, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = courseCatalogVM;
                this.$data = catalogFeed;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                Logger.e("CourseCatalogVM", "reqList: error = " + th.getMessage());
                this.this$0.getViewStates().setValue(((th instanceof UnknownHostException) || (th instanceof SocketTimeoutException)) ? this.this$0.stateData.o(this.$data) : this.this$0.stateData.e(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super StateData<CatalogFeed>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$data, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14711(boolean z, CourseCatalogVM courseCatalogVM, String str, int[] iArr, String str2, Continuation<? super C14711> continuation) {
            super(2, continuation);
            this.$resetPage = z;
            this.this$0 = courseCatalogVM;
            this.$scene = str;
            this.$type = iArr;
            this.$tags = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14711(this.$resetPage, this.this$0, this.$scene, this.$type, this.$tags, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$resetPage) {
                    this.this$0.nextKey = null;
                    this.this$0.hasMore = false;
                }
                CatalogFeed catalogFeed = new CatalogFeed(null, null, this.$resetPage, false, 11, null);
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.onStart(FlowKt.flow(new C03031(this.this$0, this.$scene, this.$type, this.$tags, catalogFeed, null)), new AnonymousClass2(this.this$0, catalogFeed, null)), new AnonymousClass3(this.this$0, catalogFeed, null));
                final CourseCatalogVM courseCatalogVM = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.health.course.vm.CourseCatalogVM.reqList.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StateData<CatalogFeed>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StateData<CatalogFeed> stateData, Continuation<? super Unit> continuation) {
                        courseCatalogVM.getViewStates().setValue(stateData);
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
            return ((C14711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CatalogGroup> categoryTags(CourseCatalogResp resp) {
        List<CourseCatalogResp.Catalog> list;
        List<CourseCatalogResp.Catalog> list2;
        if (resp == null || (list = resp.types) == null || list.isEmpty() || (list2 = resp.tags) == null || list2.isEmpty()) {
            return null;
        }
        List<CourseCatalogResp.Catalog> types = resp.types;
        Intrinsics.checkNotNullExpressionValue(types, "types");
        List<CourseCatalogResp.Catalog> list3 = types;
        ArrayList<CatalogGroup> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (CourseCatalogResp.Catalog catalog : list3) {
            arrayList.add(new CatalogGroup(catalog.type, catalog.name, null, 4, null));
        }
        for (CatalogGroup catalogGroup : arrayList) {
            List<CourseCatalogResp.Catalog> tags = resp.tags;
            Intrinsics.checkNotNullExpressionValue(tags, "tags");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : tags) {
                if (((CourseCatalogResp.Catalog) obj).type == catalogGroup.getType()) {
                    arrayList2.add(obj);
                }
            }
            catalogGroup.setTags(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            List<CourseCatalogResp.Catalog> tags2 = ((CatalogGroup) obj2).getTags();
            if (!(tags2 == null || tags2.isEmpty())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public static /* synthetic */ void reqFirstTotalPage$default(CourseCatalogVM courseCatalogVM, String str, int[] iArr, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            iArr = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        courseCatalogVM.reqFirstTotalPage(str, iArr, str2, z);
    }

    public static /* synthetic */ void reqList$default(CourseCatalogVM courseCatalogVM, String str, int[] iArr, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            iArr = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        courseCatalogVM.reqList(str, iArr, str2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPageState(CourseModel.CourseListData resp) {
        String str = resp != null ? resp.nextKey : null;
        this.nextKey = str;
        this.hasMore = !(str == null || str.length() == 0);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<CourseCatalogConfigData> getCatalogConfigData() {
        return this.catalogConfigData;
    }

    public final void getCourseCatalogConfig() {
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(null), 1, null);
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
    public final MutableLiveData<StateData<CatalogFeed>> getViewStates() {
        return this.viewStates;
    }

    /* JADX INFO: renamed from: hasMore, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final void reqFirstTotalPage(@Nullable String scene, @Nullable int[] type, @Nullable String tags, boolean reqCatalog) {
        Logger.d("CourseCatalogVM", "reqFirstTotalPage: scene = " + scene + ", type = " + type + ", tags = " + tags);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14701(reqCatalog, this, scene, type, tags, null), 3, null);
    }

    public final void reqList(@Nullable String scene, @Nullable int[] type, @Nullable String tags, boolean resetPage) {
        Logger.d("CourseCatalogVM", "reqList: scene = " + scene + ", type = " + type + ", tags = " + tags + ", reset = " + resetPage);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14711(resetPage, this, scene, type, tags, null), 3, null);
    }

    public final void setCatalogConfigData(@NotNull MutableLiveData<CourseCatalogConfigData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.catalogConfigData = mutableLiveData;
    }

    public final void setRequest(@NotNull CourseRequestV3 courseRequestV3) {
        Intrinsics.checkNotNullParameter(courseRequestV3, "<set-?>");
        this.request = courseRequestV3;
    }
}
