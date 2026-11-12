package com.mi.health.course.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.export.data.CourseCatalogConfigData;
import com.mi.health.course.export.data.CourseListData;
import com.mi.health.course.export.data.CourseListItem;
import com.mi.health.course.export.data.CourseSeriesData;
import com.mi.health.course.vm.CourseCatalogAllVM;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.scope.AndroidScope;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bJ\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0006\u0010'\u001a\u00020\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/mi/health/course/vm/CourseCatalogAllVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "request", "Lcom/mi/health/course/api/CourseRequestV3;", "getRequest", "()Lcom/mi/health/course/api/CourseRequestV3;", "setRequest", "(Lcom/mi/health/course/api/CourseRequestV3;)V", "hasMore", "", "mNextKey", "", "stateData", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "viewStates", "Landroidx/lifecycle/MutableLiveData;", "getViewStates", "()Landroidx/lifecycle/MutableLiveData;", "getCatalogCourseList", "", "category", "filter", TSMAuthContants.PARAM_KEYWORD, "resetPage", "isSeries", "setPageState", "resp", "Lcom/mi/health/course/export/data/CourseListData;", "attach", "savedInstanceState", "Landroid/os/Bundle;", "catalogConfigData", "Lcom/mi/health/course/export/data/CourseCatalogConfigData;", "getCatalogConfigData", "setCatalogConfigData", "(Landroidx/lifecycle/MutableLiveData;)V", "getCourseCatalogConfig", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseCatalogAllVM extends AbsViewModel {
    private boolean hasMore;

    @Nullable
    private String mNextKey;
    public CourseRequestV3 request;

    @NotNull
    private final StateData<CatalogCourseFeed> stateData = new StateData<>();

    @NotNull
    private final MutableLiveData<StateData<CatalogCourseFeed>> viewStates = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<CourseCatalogConfigData> catalogConfigData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogAllVM$getCatalogCourseList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogAllVM$getCatalogCourseList$1", f = "CourseCatalogAllVM.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $category;
        final /* synthetic */ String $filter;
        final /* synthetic */ boolean $isSeries;
        final /* synthetic */ String $keyword;
        final /* synthetic */ boolean $resetPage;
        int label;
        final /* synthetic */ CourseCatalogAllVM this$0;

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogAllVM$getCatalogCourseList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogAllVM$getCatalogCourseList$1$1", f = "CourseCatalogAllVM.kt", i = {0, 1}, l = {65, 66, 81}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
        @SourceDebugExtension({"SMAP\nCourseCatalogAllVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseCatalogAllVM.kt\ncom/mi/health/course/vm/CourseCatalogAllVM$getCatalogCourseList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1863#2,2:124\n*S KotlinDebug\n*F\n+ 1 CourseCatalogAllVM.kt\ncom/mi/health/course/vm/CourseCatalogAllVM$getCatalogCourseList$1$1\n*L\n69#1:124,2\n*E\n"})
        public static final class C03011 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CatalogCourseFeed>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $category;
            final /* synthetic */ CatalogCourseFeed $data;
            final /* synthetic */ String $filter;
            final /* synthetic */ boolean $isSeries;
            final /* synthetic */ String $keyword;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseCatalogAllVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03011(boolean z, CourseCatalogAllVM courseCatalogAllVM, String str, String str2, String str3, CatalogCourseFeed catalogCourseFeed, Continuation<? super C03011> continuation) {
                super(2, continuation);
                this.$isSeries = z;
                this.this$0 = courseCatalogAllVM;
                this.$category = str;
                this.$filter = str2;
                this.$keyword = str3;
                this.$data = catalogCourseFeed;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03011 c03011 = new C03011(this.$isSeries, this.this$0, this.$category, this.$filter, this.$keyword, this.$data, continuation);
                c03011.L$0 = obj;
                return c03011;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0096  */
            /* JADX WARN: Code duplicated, block: B:33:0x009d  */
            /* JADX WARN: Code duplicated, block: B:38:0x00ad A[LOOP:0: B:36:0x00a7->B:38:0x00ad, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:39:0x00e1 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
            /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:44:0x0106  */
            /* JADX WARN: Code duplicated, block: B:48:0x011a  */
            /* JADX WARN: Code duplicated, block: B:51:0x0130 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FlowCollector flowCollector;
                Object aidongCourseList;
                Object aidongSeriesList;
                CourseListData courseListData;
                ArrayList<CourseListItem> course;
                StateData stateDataB;
                ArrayList<CourseSeriesData> album;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    if (this.$isSeries) {
                        CourseRequestV3 request = this.this$0.getRequest();
                        String str = this.$category;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = this.this$0.mNextKey;
                        String str3 = str2 != null ? str2 : "";
                        this.L$0 = flowCollector;
                        this.label = 1;
                        aidongSeriesList = request.getAidongSeriesList(str, str3, this);
                        if (aidongSeriesList == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        courseListData = (CourseListData) aidongSeriesList;
                        this.this$0.setPageState(courseListData);
                        if (this.$isSeries) {
                            course = new ArrayList<>();
                            if (courseListData != null) {
                                for (CourseSeriesData courseSeriesData : album) {
                                    course.add(new CourseListItem(courseSeriesData.getId(), null, courseSeriesData.getName(), null, courseSeriesData.getCover(), 0, 0, 0, 0, 0, courseSeriesData.getTrainedCount(), courseSeriesData.getItemsCount(), 1002, null));
                                }
                            }
                        } else if (courseListData != null) {
                            course = courseListData.getCourse();
                        } else {
                            course = null;
                        }
                        Logger.d("CourseCatalogAllVM", "list:" + course);
                        this.$data.setFeeds(course);
                        if (course != null) {
                            stateDataB = this.this$0.stateData.b(this.$data);
                        } else {
                            stateDataB = this.this$0.stateData.b(this.$data);
                        }
                        this.L$0 = null;
                        this.label = 3;
                        if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        CourseRequestV3 request2 = this.this$0.getRequest();
                        String str4 = this.$category;
                        String str5 = this.$filter;
                        String str6 = this.$keyword;
                        String str7 = this.this$0.mNextKey;
                        this.L$0 = flowCollector;
                        this.label = 2;
                        aidongCourseList = request2.getAidongCourseList(str4, str5, str6, str7, this);
                        if (aidongCourseList == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        courseListData = (CourseListData) aidongCourseList;
                        this.this$0.setPageState(courseListData);
                        if (this.$isSeries) {
                            course = new ArrayList<>();
                            if (courseListData != null) {
                                while (r0.hasNext()) {
                                    course.add(new CourseListItem(courseSeriesData.getId(), null, courseSeriesData.getName(), null, courseSeriesData.getCover(), 0, 0, 0, 0, 0, courseSeriesData.getTrainedCount(), courseSeriesData.getItemsCount(), 1002, null));
                                }
                            }
                        } else if (courseListData != null) {
                            course = courseListData.getCourse();
                        } else {
                            course = null;
                        }
                        Logger.d("CourseCatalogAllVM", "list:" + course);
                        this.$data.setFeeds(course);
                        if (course != null) {
                            stateDataB = this.this$0.stateData.b(this.$data);
                        } else {
                            stateDataB = this.this$0.stateData.b(this.$data);
                        }
                        this.L$0 = null;
                        this.label = 3;
                        if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i == 1) {
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector2;
                    aidongSeriesList = obj;
                    courseListData = (CourseListData) aidongSeriesList;
                    this.this$0.setPageState(courseListData);
                    if (this.$isSeries) {
                        course = new ArrayList<>();
                        if (courseListData != null) {
                            while (r0.hasNext()) {
                                course.add(new CourseListItem(courseSeriesData.getId(), null, courseSeriesData.getName(), null, courseSeriesData.getCover(), 0, 0, 0, 0, 0, courseSeriesData.getTrainedCount(), courseSeriesData.getItemsCount(), 1002, null));
                            }
                        }
                    } else if (courseListData != null) {
                        course = courseListData.getCourse();
                    } else {
                        course = null;
                    }
                    Logger.d("CourseCatalogAllVM", "list:" + course);
                    this.$data.setFeeds(course);
                    if (course != null) {
                        stateDataB = this.this$0.stateData.b(this.$data);
                    } else {
                        stateDataB = this.this$0.stateData.b(this.$data);
                    }
                    this.L$0 = null;
                    this.label = 3;
                    if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 2) {
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector3;
                    aidongCourseList = obj;
                    courseListData = (CourseListData) aidongCourseList;
                    this.this$0.setPageState(courseListData);
                    if (this.$isSeries) {
                        course = new ArrayList<>();
                        if (courseListData != null && (album = courseListData.getAlbum()) != null) {
                            while (r0.hasNext()) {
                                course.add(new CourseListItem(courseSeriesData.getId(), null, courseSeriesData.getName(), null, courseSeriesData.getCover(), 0, 0, 0, 0, 0, courseSeriesData.getTrainedCount(), courseSeriesData.getItemsCount(), 1002, null));
                            }
                        }
                    } else if (courseListData != null) {
                        course = courseListData.getCourse();
                    } else {
                        course = null;
                    }
                    Logger.d("CourseCatalogAllVM", "list:" + course);
                    this.$data.setFeeds(course);
                    if (course != null || course.isEmpty()) {
                        stateDataB = this.this$0.stateData.b(this.$data);
                    } else {
                        stateDataB = this.this$0.stateData.r(this.$data);
                    }
                    this.L$0 = null;
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CatalogCourseFeed>> flowCollector, Continuation<? super Unit> continuation) {
                return ((C03011) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogAllVM$getCatalogCourseList$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogAllVM$getCatalogCourseList$1$2", f = "CourseCatalogAllVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CatalogCourseFeed>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogCourseFeed $data;
            int label;
            final /* synthetic */ CourseCatalogAllVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CourseCatalogAllVM courseCatalogAllVM, CatalogCourseFeed catalogCourseFeed, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = courseCatalogAllVM;
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

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogAllVM$getCatalogCourseList$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u00022\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogAllVM$getCatalogCourseList$1$3", f = "CourseCatalogAllVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super StateData<CatalogCourseFeed>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ CatalogCourseFeed $data;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseCatalogAllVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CourseCatalogAllVM courseCatalogAllVM, CatalogCourseFeed catalogCourseFeed, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = courseCatalogAllVM;
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
                Logger.e("CourseCatalogAllVM", "getCatalogCourseList: error = " + th.getMessage());
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
        public AnonymousClass1(boolean z, CourseCatalogAllVM courseCatalogAllVM, boolean z2, String str, String str2, String str3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$resetPage = z;
            this.this$0 = courseCatalogAllVM;
            this.$isSeries = z2;
            this.$category = str;
            this.$filter = str2;
            this.$keyword = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$resetPage, this.this$0, this.$isSeries, this.$category, this.$filter, this.$keyword, continuation);
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
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.onStart(FlowKt.flow(new C03011(this.$isSeries, this.this$0, this.$category, this.$filter, this.$keyword, catalogCourseFeed, null)), new AnonymousClass2(this.this$0, catalogCourseFeed, null)), new AnonymousClass3(this.this$0, catalogCourseFeed, null));
                final CourseCatalogAllVM courseCatalogAllVM = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.health.course.vm.CourseCatalogAllVM.getCatalogCourseList.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StateData<CatalogCourseFeed>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StateData<CatalogCourseFeed> stateData, Continuation<? super Unit> continuation) {
                        courseCatalogAllVM.getViewStates().setValue(stateData);
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

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseCatalogAllVM$getCourseCatalogConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogAllVM$getCourseCatalogConfig$1", f = "CourseCatalogAllVM.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C14691(Continuation<? super C14691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseCatalogAllVM.this.new C14691(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<CourseCatalogConfigData> catalogConfigData = CourseCatalogAllVM.this.getCatalogConfigData();
                CourseRequestV3 request = CourseCatalogAllVM.this.getRequest();
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
            return ((C14691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCourseCatalogConfig$lambda$0(CourseCatalogAllVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        CatalogCourseFeed catalogCourseFeed = new CatalogCourseFeed(null, true, false, true, 5, null);
        this$0.viewStates.setValue(((it instanceof UnknownHostException) || (it instanceof SocketTimeoutException) || (it.getCause() instanceof UnknownHostException) || (it.getCause() instanceof SocketTimeoutException)) ? this$0.stateData.o(catalogCourseFeed) : this$0.stateData.e(catalogCourseFeed));
        return Unit.INSTANCE;
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

    @NotNull
    public final MutableLiveData<CourseCatalogConfigData> getCatalogConfigData() {
        return this.catalogConfigData;
    }

    public final void getCatalogCourseList(@Nullable String category, @Nullable String filter, @Nullable String keyword, boolean resetPage, boolean isSeries) {
        Logger.d("CourseCatalogAllVM", "getCatalogCourseList:category:" + category + ",filter:" + filter + ",keyword:" + keyword + ",nextKey:" + this.mNextKey + ",resetPage:" + resetPage);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(resetPage, this, isSeries, category, filter, keyword, null), 3, null);
    }

    public final void getCourseCatalogConfig() {
        ScopeExtKt.scopeNetLife$default(this, null, new C14691(null), 1, null).m503catch(new Function2() { // from class: pp4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CourseCatalogAllVM.getCourseCatalogConfig$lambda$0(this.f30602a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
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

    public final void setCatalogConfigData(@NotNull MutableLiveData<CourseCatalogConfigData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.catalogConfigData = mutableLiveData;
    }

    public final void setRequest(@NotNull CourseRequestV3 courseRequestV3) {
        Intrinsics.checkNotNullParameter(courseRequestV3, "<set-?>");
        this.request = courseRequestV3;
    }
}
