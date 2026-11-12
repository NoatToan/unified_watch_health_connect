package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\n\u001ak\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\r*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u0002H\r*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u0001H\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\u0011\u001aI\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\u0012\u001ax\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00150\u0014\"\b\b\u0000\u0010\u0002*\u0002H\r\"\b\b\u0001\u0010\r*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172.\u0010\u0018\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001ae\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\r0\u0001\"\b\b\u0000\u0010\r*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u0002H\r*\b\u0012\u0004\u0012\u0002H\u00020\u00012.\u0010\u0018\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"separatorPage", "Landroidx/paging/TransformablePage;", "T", "", "separator", "originalPageOffsets", "", "hintOriginalPageOffset", "", "hintOriginalIndex", "(Ljava/lang/Object;[III)Landroidx/paging/TransformablePage;", "addSeparatorPage", "", "R", "", "adjacentPageBefore", "adjacentPageAfter", "(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V", "(Ljava/util/List;Ljava/lang/Object;[III)V", "insertEventSeparators", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PageEvent;", "terminalSeparatorType", "Landroidx/paging/TerminalSeparatorType;", "generator", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/TerminalSeparatorType;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "insertInternalSeparators", "(Landroidx/paging/TransformablePage;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class SeparatorsKt {

    /* JADX INFO: renamed from: androidx.paging.SeparatorsKt$insertInternalSeparators$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u0002H\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00042.\u0010\u0005\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0007H\u0080@"}, d2 = {"insertInternalSeparators", "", "R", "T", "Landroidx/paging/TransformablePage;", "generator", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "continuation"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.SeparatorsKt", f = "Separators.kt", i = {0, 0, 0, 0, 0}, l = {82}, m = "insertInternalSeparators", n = {"$this$insertInternalSeparators", "generator", "outputList", "outputIndices", "item"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SeparatorsKt.insertInternalSeparators(null, null, this);
        }
    }

    public static final <T> void addSeparatorPage(@NotNull List<TransformablePage<T>> addSeparatorPage, @Nullable T t, @NotNull int[] originalPageOffsets, int i, int i2) {
        Intrinsics.checkNotNullParameter(addSeparatorPage, "$this$addSeparatorPage");
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        if (t == null) {
            return;
        }
        addSeparatorPage.add(separatorPage(t, originalPageOffsets, i, i2));
    }

    @NotNull
    public static final <T extends R, R> Flow<PageEvent<R>> insertEventSeparators(@NotNull final Flow<? extends PageEvent<T>> insertEventSeparators, @NotNull TerminalSeparatorType terminalSeparatorType, @NotNull Function3<? super T, ? super T, ? super Continuation<? super R>, ? extends Object> generator) {
        Intrinsics.checkNotNullParameter(insertEventSeparators, "$this$insertEventSeparators");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(generator, "generator");
        final SeparatorState separatorState = new SeparatorState(terminalSeparatorType, new SeparatorsKt$insertEventSeparators$separatorState$1(generator, null));
        return new Flow<PageEvent<R>>() { // from class: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1

            /* JADX INFO: Add missing generic type declarations: [T] */
            /* JADX INFO: renamed from: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 4, 2})
            public static final class AnonymousClass2<T> implements FlowCollector<PageEvent<T>> {
                final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                final /* synthetic */ SeparatorsKt$insertEventSeparators$$inlined$map$1 this$0;

                /* JADX INFO: renamed from: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\n"}, d2 = {"emit", "", "T", "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1"}, k = 3, mv = {1, 4, 2})
                @DebugMetadata(c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", f = "Separators.kt", i = {}, l = {135, 135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SeparatorsKt$insertEventSeparators$$inlined$map$1 separatorsKt$insertEventSeparators$$inlined$map$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = separatorsKt$insertEventSeparators$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            FlowCollector flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector2;
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector3 = this.$this_unsafeFlow$inlined;
                    SeparatorState separatorState = separatorState;
                    anonymousClass1.L$0 = flowCollector3;
                    anonymousClass1.label = 1;
                    Object objOnEvent = separatorState.onEvent((PageEvent) obj, anonymousClass1);
                    if (objOnEvent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = objOnEvent;
                    flowCollector = flowCollector3;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = insertEventSeparators.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ce -> B:29:0x00d7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final <R, T extends R> java.lang.Object insertInternalSeparators(@org.jetbrains.annotations.NotNull androidx.paging.TransformablePage<T> r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.paging.TransformablePage<R>> r13) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.insertInternalSeparators(androidx.paging.TransformablePage, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final <T> TransformablePage<T> separatorPage(@NotNull T separator, @NotNull int[] originalPageOffsets, int i, int i2) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        return new TransformablePage<>(originalPageOffsets, CollectionsKt__CollectionsJVMKt.listOf(separator), i, CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(i2)));
    }

    public static final <R, T extends R> void addSeparatorPage(@NotNull List<TransformablePage<R>> addSeparatorPage, @Nullable R r2, @Nullable TransformablePage<T> transformablePage, @Nullable TransformablePage<T> transformablePage2, int i, int i2) {
        Intrinsics.checkNotNullParameter(addSeparatorPage, "$this$addSeparatorPage");
        int[] originalPageOffsets = transformablePage != null ? transformablePage.getOriginalPageOffsets() : null;
        int[] originalPageOffsets2 = transformablePage2 != null ? transformablePage2.getOriginalPageOffsets() : null;
        if (originalPageOffsets != null && originalPageOffsets2 != null) {
            originalPageOffsets = CollectionsKt___CollectionsKt.toIntArray(CollectionsKt___CollectionsKt.sorted(ArraysKt___ArraysKt.distinct(ArraysKt___ArraysJvmKt.plus(originalPageOffsets, originalPageOffsets2))));
        } else if (originalPageOffsets == null && originalPageOffsets2 != null) {
            originalPageOffsets = originalPageOffsets2;
        } else if (originalPageOffsets == null || originalPageOffsets2 != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        addSeparatorPage(addSeparatorPage, r2, originalPageOffsets, i, i2);
    }
}
