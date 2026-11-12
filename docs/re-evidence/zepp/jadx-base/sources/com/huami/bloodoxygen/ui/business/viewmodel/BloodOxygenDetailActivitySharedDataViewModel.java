package com.huami.bloodoxygen.ui.business.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.usecase.clickspo2.GetLatestClickSpo2FlowUseCase;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR%\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0013R#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodoxygen/ui/business/viewmodel/BloodOxygenDetailActivitySharedDataViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LiveData;", "", "getTimestampToPagePositionLiveData", "timestamp", "", "updateTimestampToPagePosition", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLatestClickSpo2FlowUseCase;", "a", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLatestClickSpo2FlowUseCase;", "getLatestClickSpo2FlowUseCase", "Lkotlinx/coroutines/flow/Flow;", "b", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/flow/Flow;", "getLatestDataTimestampFlow", "Lkotlinx/coroutines/Job;", "c", "()Lkotlinx/coroutines/Job;", "job", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "()Landroidx/lifecycle/MutableLiveData;", "timestampToPagePositionLiveData", "<init>", "(Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLatestClickSpo2FlowUseCase;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenDetailActivitySharedDataViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetLatestClickSpo2FlowUseCase getLatestClickSpo2FlowUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy getLatestDataTimestampFlow = LazyKt__LazyJVMKt.lazy(new Function0<Flow<? extends Long>>() { // from class: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$getLatestDataTimestampFlow$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Flow<Long> invoke() {
            final Flow<ClickMeasuredSpo2> flowExecute = this.a.getLatestClickSpo2FlowUseCase.execute();
            return FlowKt.distinctUntilChanged(new Flow<Long>() { // from class: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$getLatestDataTimestampFlow$2$invoke$$inlined$map$1

                /* JADX INFO: renamed from: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$getLatestDataTimestampFlow$2$invoke$$inlined$map$1$2, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                public static final class AnonymousClass2 implements FlowCollector<ClickMeasuredSpo2> {
                    public final /* synthetic */ FlowCollector a;
                    public final /* synthetic */ BloodOxygenDetailActivitySharedDataViewModel$getLatestDataTimestampFlow$2$invoke$$inlined$map$1 b;

                    /* JADX INFO: renamed from: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$getLatestDataTimestampFlow$2$invoke$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$getLatestDataTimestampFlow$2$invoke$$inlined$map$1$2", f = "BloodOxygenDetailActivitySharedDataViewModel.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object a;
                        public int b;
                        public Object c;
                        public Object d;
                        public Object e;
                        public Object f;
                        public Object g;
                        public Object h;
                        public Object i;
                        public Object j;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.a = obj;
                            this.b |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, BloodOxygenDetailActivitySharedDataViewModel$getLatestDataTimestampFlow$2$invoke$$inlined$map$1 bloodOxygenDetailActivitySharedDataViewModel$getLatestDataTimestampFlow$2$invoke$$inlined$map$1) {
                        this.a = flowCollector;
                        this.b = bloodOxygenDetailActivitySharedDataViewModel$getLatestDataTimestampFlow$2$invoke$$inlined$map$1;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(ClickMeasuredSpo2 clickMeasuredSpo2, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.b;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.b = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj = anonymousClass1.a;
                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.b;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = this.a;
                            ClickMeasuredSpo2 clickMeasuredSpo3 = clickMeasuredSpo2;
                            Long lBoxLong = (clickMeasuredSpo3 == null ? null : Boxing.boxLong(clickMeasuredSpo3.getTimestamp())) != null ? Boxing.boxLong(BloodOxygenUtils.INSTANCE.getZeroTimeInMillis(clickMeasuredSpo3.getTimestamp())) : null;
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(lBoxLong, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super Long> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowExecute.collect(new AnonymousClass2(flowCollector, this), continuation);
                    return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy job = LazyKt__LazyJVMKt.lazy(new Function0<Job>() { // from class: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$job$2

        /* JADX INFO: renamed from: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$job$2$1, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$job$2$1", f = "BloodOxygenDetailActivitySharedDataViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ BloodOxygenDetailActivitySharedDataViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BloodOxygenDetailActivitySharedDataViewModel bloodOxygenDetailActivitySharedDataViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.b = bloodOxygenDetailActivitySharedDataViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowA = this.b.a();
                    final BloodOxygenDetailActivitySharedDataViewModel bloodOxygenDetailActivitySharedDataViewModel = this.b;
                    FlowCollector<Long> flowCollector = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR (r3v0 'flowCollector' kotlinx.coroutines.flow.FlowCollector<java.lang.Long>) = 
                          (r1v1 'bloodOxygenDetailActivitySharedDataViewModel' com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel A[DONT_INLINE])
                         A[DECLARE_VAR, MD:(com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel):void (m)] (LINE:5) call: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$job$2$1$invokeSuspend$$inlined$collect$1.<init>(com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel):void type: CONSTRUCTOR in method: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$job$2.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes5.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$job$2$1$invokeSuspend$$inlined$collect$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 21 more
                        */
                    /*
                        this = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r4.a
                        r2 = 1
                        if (r1 == 0) goto L17
                        if (r1 != r2) goto Lf
                        kotlin.ResultKt.throwOnFailure(r5)
                        goto L30
                    Lf:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L17:
                        kotlin.ResultKt.throwOnFailure(r5)
                        com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel r5 = r4.b
                        kotlinx.coroutines.flow.Flow r5 = com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel.access$getGetLatestDataTimestampFlow(r5)
                        com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel r1 = r4.b
                        com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$job$2$1$invokeSuspend$$inlined$collect$1 r3 = new com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$job$2$1$invokeSuspend$$inlined$collect$1
                        r3.<init>(r1)
                        r4.a = r2
                        java.lang.Object r5 = r5.collect(r3, r4)
                        if (r5 != r0) goto L30
                        return r0
                    L30:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel$job$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Job invoke() {
                return e.f(ViewModelKt.getViewModelScope(this.a), null, null, new AnonymousClass1(this.a, null), 3, null);
            }
        });

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Lazy timestampToPagePositionLiveData = LazyKt__LazyJVMKt.lazy(new a());

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<MutableLiveData<Long>> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MutableLiveData<Long> invoke() {
                MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(System.currentTimeMillis()));
                BloodOxygenDetailActivitySharedDataViewModel.this.b().start();
                return mutableLiveData;
            }
        }

        public BloodOxygenDetailActivitySharedDataViewModel(@NotNull GetLatestClickSpo2FlowUseCase getLatestClickSpo2FlowUseCase) {
            this.getLatestClickSpo2FlowUseCase = getLatestClickSpo2FlowUseCase;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Flow<Long> a() {
            return (Flow) this.getLatestDataTimestampFlow.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Job b() {
            return (Job) this.job.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final MutableLiveData<Long> c() {
            return (MutableLiveData) this.timestampToPagePositionLiveData.getValue();
        }

        @NotNull
        public final LiveData<Long> getTimestampToPagePositionLiveData() {
            return c();
        }

        public final void updateTimestampToPagePosition(long timestamp) {
            Job.DefaultImpls.cancel$default(b(), (CancellationException) null, 1, (Object) null);
            c().postValue(Long.valueOf(timestamp));
        }
    }
