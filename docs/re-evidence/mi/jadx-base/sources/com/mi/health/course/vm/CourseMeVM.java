package com.mi.health.course.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.vm.CourseMeVM;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0018\u001a\u00020\u000bJ\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0014\u0010$\u001a\u00020\u00162\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&J(\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,2\b\b\u0002\u0010-\u001a\u00020*H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014¨\u0006."}, d2 = {"Lcom/mi/health/course/vm/CourseMeVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "request", "Lcom/mi/health/course/api/CourseRequest;", "getRequest", "()Lcom/mi/health/course/api/CourseRequest;", "setRequest", "(Lcom/mi/health/course/api/CourseRequest;)V", "hasMore", "", "nextKey", "", "stateData", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CourseMeData;", "viewStates", "Landroidx/lifecycle/MutableLiveData;", "getViewStates", "()Landroidx/lifecycle/MutableLiveData;", "reqList", "", "tag", "resetPage", "setPageState", "resp", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourseList;", "attach", "savedInstanceState", "Landroid/os/Bundle;", "deleteData", "deleteState", "getDeleteState", "deleteState$delegate", "Lkotlin/Lazy;", "delete", "selectIds", "", "", "genIdsStr", "loopNum", "", "list", "", "idsNum", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseMeVM extends AbsViewModel {

    @Nullable
    private String nextKey;
    public CourseRequest request;
    private boolean hasMore = true;

    @NotNull
    private final StateData<CourseMeData> stateData = new StateData<>();

    @NotNull
    private final MutableLiveData<StateData<CourseMeData>> viewStates = new MutableLiveData<>();

    @NotNull
    private final StateData<Boolean> deleteData = new StateData<>();

    /* JADX INFO: renamed from: deleteState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteState = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bv4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseMeVM.deleteState_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseMeVM$delete$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseMeVM$delete$1", f = "CourseMeVM.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Long> $list;
        final /* synthetic */ int $size;
        int label;
        final /* synthetic */ CourseMeVM this$0;

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseMeVM$delete$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseMeVM$delete$1$1", f = "CourseMeVM.kt", i = {0, 0, 0, 1}, l = {91, 92, 93}, m = "invokeSuspend", n = {"$this$flow", "loop", "i", "$this$flow"}, s = {"L$0", "I$0", "I$1", "L$0"})
        public static final class C03041 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<Long> $list;
            final /* synthetic */ int $size;
            int I$0;
            int I$1;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseMeVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03041(int i, CourseMeVM courseMeVM, List<Long> list, Continuation<? super C03041> continuation) {
                super(2, continuation);
                this.$size = i;
                this.this$0 = courseMeVM;
                this.$list = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03041 c03041 = new C03041(this.$size, this.this$0, this.$list, continuation);
                c03041.L$0 = obj;
                return c03041;
            }

            /* JADX WARN: Code duplicated, block: B:14:0x0044  */
            /* JADX WARN: Code duplicated, block: B:16:0x0064 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0062 -> B:17:0x0065). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r14.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L33
                    if (r1 == r4) goto L26
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    kotlin.ResultKt.throwOnFailure(r15)
                    goto L96
                L16:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1e:
                    java.lang.Object r1 = r14.L$0
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                    kotlin.ResultKt.throwOnFailure(r15)
                    goto L86
                L26:
                    int r1 = r14.I$1
                    int r5 = r14.I$0
                    java.lang.Object r6 = r14.L$0
                    kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                    kotlin.ResultKt.throwOnFailure(r15)
                    r15 = r6
                    goto L65
                L33:
                    kotlin.ResultKt.throwOnFailure(r15)
                    java.lang.Object r15 = r14.L$0
                    kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
                    int r1 = r14.$size
                    int r1 = r1 / 5
                    r5 = 0
                    r13 = r5
                    r5 = r1
                    r1 = r13
                L42:
                    if (r1 >= r5) goto L67
                    com.mi.health.course.vm.CourseMeVM r6 = r14.this$0
                    com.mi.health.course.api.CourseRequest r12 = r6.getRequest()
                    com.mi.health.course.vm.CourseMeVM r6 = r14.this$0
                    java.util.List<java.lang.Long> r8 = r14.$list
                    r10 = 4
                    r11 = 0
                    r9 = 0
                    r7 = r1
                    java.lang.String r6 = com.mi.health.course.vm.CourseMeVM.genIdsStr$default(r6, r7, r8, r9, r10, r11)
                    r14.L$0 = r15
                    r14.I$0 = r5
                    r14.I$1 = r1
                    r14.label = r4
                    java.lang.Object r6 = r12.removeCourse(r6, r14)
                    if (r6 != r0) goto L65
                    return r0
                L65:
                    int r1 = r1 + r4
                    goto L42
                L67:
                    com.mi.health.course.vm.CourseMeVM r1 = r14.this$0
                    com.mi.health.course.api.CourseRequest r1 = r1.getRequest()
                    com.mi.health.course.vm.CourseMeVM r6 = r14.this$0
                    java.util.List<java.lang.Long> r7 = r14.$list
                    int r8 = r14.$size
                    int r9 = r5 * 5
                    int r8 = r8 - r9
                    java.lang.String r5 = com.mi.health.course.vm.CourseMeVM.access$genIdsStr(r6, r5, r7, r8)
                    r14.L$0 = r15
                    r14.label = r3
                    java.lang.Object r1 = r1.removeCourse(r5, r14)
                    if (r1 != r0) goto L85
                    return r0
                L85:
                    r1 = r15
                L86:
                    java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
                    r3 = 0
                    r14.L$0 = r3
                    r14.label = r2
                    java.lang.Object r15 = r1.emit(r15, r14)
                    if (r15 != r0) goto L96
                    return r0
                L96:
                    kotlin.Unit r15 = kotlin.Unit.INSTANCE
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mi.health.course.vm.CourseMeVM.AnonymousClass1.C03041.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
                return ((C03041) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseMeVM$delete$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseMeVM$delete$1$2", f = "CourseMeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CourseMeVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CourseMeVM courseMeVM, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = courseMeVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getDeleteState().setValue(this.this$0.deleteData.l());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseMeVM$delete$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseMeVM$delete$1$3", f = "CourseMeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseMeVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CourseMeVM courseMeVM, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = courseMeVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Logger.e("CourseMeVM", "delete: " + ((Throwable) this.L$0).getMessage());
                this.this$0.getDeleteState().setValue(this.this$0.deleteData.c());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, CourseMeVM courseMeVM, List<Long> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$size = i;
            this.this$0 = courseMeVM;
            this.$list = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$size, this.this$0, this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.onStart(FlowKt.flow(new C03041(this.$size, this.this$0, this.$list, null)), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, null));
                final CourseMeVM courseMeVM = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.health.course.vm.CourseMeVM.delete.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        courseMeVM.getDeleteState().setValue(courseMeVM.deleteData.r(Boxing.boxBoolean(true)));
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

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseMeVM$reqList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseMeVM$reqList$1", f = "CourseMeVM.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $resetPage;
        final /* synthetic */ String $tag;
        int label;
        final /* synthetic */ CourseMeVM this$0;

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseMeVM$reqList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CourseMeData;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseMeVM$reqList$1$1", f = "CourseMeVM.kt", i = {0}, l = {53, 57}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        public static final class C03051 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CourseMeData>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CourseMeData $data;
            final /* synthetic */ String $tag;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseMeVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03051(CourseMeVM courseMeVM, String str, CourseMeData courseMeData, Continuation<? super C03051> continuation) {
                super(2, continuation);
                this.this$0 = courseMeVM;
                this.$tag = str;
                this.$data = courseMeData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03051 c03051 = new C03051(this.this$0, this.$tag, this.$data, continuation);
                c03051.L$0 = obj;
                return c03051;
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
                CourseRequest request = this.this$0.getRequest();
                String str = this.$tag;
                String str2 = this.this$0.nextKey;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = request.getPracticedCourseList(0, str, str2, 20, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CourseModel.PracticedCourseList practicedCourseList = (CourseModel.PracticedCourseList) obj;
                this.this$0.setPageState(practicedCourseList);
                List<CourseModel.PracticedCourse> list = practicedCourseList != null ? practicedCourseList.data : null;
                this.$data.setFeeds(list);
                List<CourseModel.PracticedCourse> list2 = list;
                StateData stateDataB = (list2 == null || list2.isEmpty()) ? this.this$0.stateData.b(this.$data) : this.this$0.stateData.r(this.$data);
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CourseMeData>> flowCollector, Continuation<? super Unit> continuation) {
                return ((C03051) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseMeVM$reqList$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CourseMeData;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseMeVM$reqList$1$2", f = "CourseMeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CourseMeData>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CourseMeData $data;
            int label;
            final /* synthetic */ CourseMeVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CourseMeVM courseMeVM, CourseMeData courseMeData, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = courseMeVM;
                this.$data = courseMeData;
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
                Logger.d("CourseMeAcL", "reqList22: ");
                this.this$0.getViewStates().setValue(this.this$0.stateData.m(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CourseMeData>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.health.course.vm.CourseMeVM$reqList$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u00022\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CourseMeData;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.vm.CourseMeVM$reqList$1$3", f = "CourseMeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super StateData<CourseMeData>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ CourseMeData $data;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CourseMeVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CourseMeVM courseMeVM, CourseMeData courseMeData, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = courseMeVM;
                this.$data = courseMeData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                Logger.e("CourseMeVM", "reqList: error = " + th.getMessage());
                this.this$0.getViewStates().setValue(((th instanceof UnknownHostException) || (th instanceof SocketTimeoutException)) ? this.this$0.stateData.o(this.$data) : this.this$0.stateData.e(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super StateData<CourseMeData>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$data, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14721(boolean z, CourseMeVM courseMeVM, String str, Continuation<? super C14721> continuation) {
            super(2, continuation);
            this.$resetPage = z;
            this.this$0 = courseMeVM;
            this.$tag = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14721(this.$resetPage, this.this$0, this.$tag, continuation);
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
                CourseMeData courseMeData = new CourseMeData(null, this.$resetPage, 1, null);
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.onStart(FlowKt.flow(new C03051(this.this$0, this.$tag, courseMeData, null)), new AnonymousClass2(this.this$0, courseMeData, null)), new AnonymousClass3(this.this$0, courseMeData, null));
                final CourseMeVM courseMeVM = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.mi.health.course.vm.CourseMeVM.reqList.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StateData<CourseMeData>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StateData<CourseMeData> stateData, Continuation<? super Unit> continuation) {
                        courseMeVM.getViewStates().setValue(stateData);
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
            return ((C14721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData deleteState_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String genIdsStr(int loopNum, List<Long> list, int idsNum) {
        int i = loopNum * 5;
        StringBuilder sb = new StringBuilder();
        int i2 = idsNum + i;
        while (i < i2) {
            sb.append(list.get(i) + ",");
            i++;
        }
        String string = StringsKt__StringsKt.removeSuffix(sb, ",").toString();
        Logger.d("CourseMeVM", "delete: " + string);
        return string;
    }

    public static /* synthetic */ String genIdsStr$default(CourseMeVM courseMeVM, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 5;
        }
        return courseMeVM.genIdsStr(i, list, i2);
    }

    public static /* synthetic */ void reqList$default(CourseMeVM courseMeVM, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        courseMeVM.reqList(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPageState(CourseModel.PracticedCourseList resp) {
        String str = resp != null ? resp.nextKey : null;
        this.nextKey = str;
        this.hasMore = !(str == null || str.length() == 0);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void delete(@NotNull Set<Long> selectIds) {
        Intrinsics.checkNotNullParameter(selectIds, "selectIds");
        Logger.d("CourseMeVM", "delete: ids = " + selectIds);
        List list = CollectionsKt___CollectionsKt.toList(selectIds);
        int size = list.size();
        if (size == 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(size, this, list, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<StateData<Boolean>> getDeleteState() {
        return (MutableLiveData) this.deleteState.getValue();
    }

    @NotNull
    public final CourseRequest getRequest() {
        CourseRequest courseRequest = this.request;
        if (courseRequest != null) {
            return courseRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    @NotNull
    public final MutableLiveData<StateData<CourseMeData>> getViewStates() {
        return this.viewStates;
    }

    /* JADX INFO: renamed from: hasMore, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final void reqList(@Nullable String tag, boolean resetPage) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C14721(resetPage, this, tag, null), 3, null);
    }

    public final void setRequest(@NotNull CourseRequest courseRequest) {
        Intrinsics.checkNotNullParameter(courseRequest, "<set-?>");
        this.request = courseRequest;
    }
}
