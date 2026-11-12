package androidx.paging;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\u00020\u0002B^\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012L\u0010\u0006\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001a\u00104\u001a\b\u0012\u0004\u0012\u00028\u0000052\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000105J%\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000082\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000108H\u0086@ø\u0001\u0000¢\u0006\u0002\u00109J%\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010;H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010<J%\u0010=\u001a\b\u0012\u0004\u0012\u00028\u0000082\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010>H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010?J&\u0010@\u001a\b\u0012\u0004\u0012\u0002H\u00030#\"\b\b\u0002\u0010\u0003*\u00020\u00022\f\u0010A\u001a\b\u0012\u0004\u0012\u0002H\u00030#H\u0002J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000;*\b\u0012\u0004\u0012\u00028\u00010;J\"\u0010C\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00030;2\u0006\u0010\u0004\u001a\u00020\u0005J\"\u0010D\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00030;2\u0006\u0010\u0004\u001a\u00020\u0005R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\\\u0010\u0006\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010#0\"¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u001a\u0010/\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0011\"\u0004\b1\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Landroidx/paging/SeparatorState;", "R", "", "T", "terminalSeparatorType", "Landroidx/paging/TerminalSeparatorType;", "generator", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "before", "after", "Lkotlin/coroutines/Continuation;", "(Landroidx/paging/TerminalSeparatorType;Lkotlin/jvm/functions/Function3;)V", "endTerminalSeparatorDeferred", "", "getEndTerminalSeparatorDeferred", "()Z", "setEndTerminalSeparatorDeferred", "(Z)V", "footerAdded", "getFooterAdded", "setFooterAdded", "getGenerator", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "headerAdded", "getHeaderAdded", "setHeaderAdded", "loadStates", "Landroidx/paging/MutableLoadStateCollection;", "getLoadStates", "()Landroidx/paging/MutableLoadStateCollection;", "pageStash", "", "Landroidx/paging/TransformablePage;", "getPageStash", "()Ljava/util/List;", "placeholdersAfter", "", "getPlaceholdersAfter", "()I", "setPlaceholdersAfter", "(I)V", "placeholdersBefore", "getPlaceholdersBefore", "setPlaceholdersBefore", "startTerminalSeparatorDeferred", "getStartTerminalSeparatorDeferred", "setStartTerminalSeparatorDeferred", "getTerminalSeparatorType", "()Landroidx/paging/TerminalSeparatorType;", "onDrop", "Landroidx/paging/PageEvent$Drop;", "event", "onEvent", "Landroidx/paging/PageEvent;", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onInsert", "Landroidx/paging/PageEvent$Insert;", "(Landroidx/paging/PageEvent$Insert;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoadStateUpdate", "Landroidx/paging/PageEvent$LoadStateUpdate;", "(Landroidx/paging/PageEvent$LoadStateUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformablePageToStash", "originalPage", "asRType", "terminatesEnd", "terminatesStart", "paging-common"}, k = 1, mv = {1, 4, 2})
final class SeparatorState<R, T extends R> {
    private boolean endTerminalSeparatorDeferred;
    private boolean footerAdded;

    @NotNull
    private final Function3<T, T, Continuation<? super R>, Object> generator;
    private boolean headerAdded;

    @NotNull
    private final MutableLoadStateCollection loadStates;

    @NotNull
    private final List<TransformablePage<T>> pageStash;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private boolean startTerminalSeparatorDeferred;

    @NotNull
    private final TerminalSeparatorType terminalSeparatorType;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TerminalSeparatorType.values().length];
            $EnumSwitchMapping$0 = iArr;
            TerminalSeparatorType terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
            iArr[terminalSeparatorType.ordinal()] = 1;
            TerminalSeparatorType terminalSeparatorType2 = TerminalSeparatorType.SOURCE_COMPLETE;
            iArr[terminalSeparatorType2.ordinal()] = 2;
            int[] iArr2 = new int[TerminalSeparatorType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[terminalSeparatorType.ordinal()] = 1;
            iArr2[terminalSeparatorType2.ordinal()] = 2;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.SeparatorState$onEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0007H\u0086@"}, d2 = {"onEvent", "", "R", "T", "event", "Landroidx/paging/PageEvent;", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 1}, l = {213, 215}, m = "onEvent", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class C12731 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12731(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SeparatorState.this.onEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.SeparatorState$onInsert$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0007H\u0086@"}, d2 = {"onInsert", "", "R", "T", "event", "Landroidx/paging/PageEvent$Insert;", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9}, l = {303, 366, 378, 384, 396, 405, 427, 436, 449, 460}, m = "onInsert", n = {"this", "event", "this", "event", "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "lastStash", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", "page", "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", "page", "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "lastNonEmptyPage", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "pageBefore"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C12741 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C12741(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SeparatorState.this.onInsert(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeparatorState(@NotNull TerminalSeparatorType terminalSeparatorType, @NotNull Function3<? super T, ? super T, ? super Continuation<? super R>, ? extends Object> generator) {
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(generator, "generator");
        this.terminalSeparatorType = terminalSeparatorType;
        this.generator = generator;
        this.pageStash = new ArrayList();
        this.loadStates = new MutableLoadStateCollection();
    }

    private final <T> TransformablePage<T> transformablePageToStash(TransformablePage<T> originalPage) {
        Integer num;
        Integer num2;
        int[] originalPageOffsets = originalPage.getOriginalPageOffsets();
        List listListOf = CollectionsKt__CollectionsKt.listOf(CollectionsKt___CollectionsKt.first((List) originalPage.getData()), CollectionsKt___CollectionsKt.last((List) originalPage.getData()));
        int hintOriginalPageOffset = originalPage.getHintOriginalPageOffset();
        Integer[] numArr = new Integer[2];
        List<Integer> hintOriginalIndices = originalPage.getHintOriginalIndices();
        numArr[0] = Integer.valueOf((hintOriginalIndices == null || (num2 = (Integer) CollectionsKt___CollectionsKt.first((List) hintOriginalIndices)) == null) ? 0 : num2.intValue());
        List<Integer> hintOriginalIndices2 = originalPage.getHintOriginalIndices();
        numArr[1] = Integer.valueOf((hintOriginalIndices2 == null || (num = (Integer) CollectionsKt___CollectionsKt.last((List) hintOriginalIndices2)) == null) ? CollectionsKt__CollectionsKt.getLastIndex(originalPage.getData()) : num.intValue());
        return new TransformablePage<>(originalPageOffsets, listListOf, hintOriginalPageOffset, CollectionsKt__CollectionsKt.listOf((Object[]) numArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final PageEvent.Insert<R> asRType(@NotNull PageEvent.Insert<T> asRType) {
        Intrinsics.checkNotNullParameter(asRType, "$this$asRType");
        return asRType;
    }

    public final boolean getEndTerminalSeparatorDeferred() {
        return this.endTerminalSeparatorDeferred;
    }

    public final boolean getFooterAdded() {
        return this.footerAdded;
    }

    @NotNull
    public final Function3<T, T, Continuation<? super R>, Object> getGenerator() {
        return this.generator;
    }

    public final boolean getHeaderAdded() {
        return this.headerAdded;
    }

    @NotNull
    public final MutableLoadStateCollection getLoadStates() {
        return this.loadStates;
    }

    @NotNull
    public final List<TransformablePage<T>> getPageStash() {
        return this.pageStash;
    }

    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    public final boolean getStartTerminalSeparatorDeferred() {
        return this.startTerminalSeparatorDeferred;
    }

    @NotNull
    public final TerminalSeparatorType getTerminalSeparatorType() {
        return this.terminalSeparatorType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final PageEvent.Drop<R> onDrop(@NotNull PageEvent.Drop<T> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.loadStates.set(event.getLoadType(), false, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
        LoadType loadType = event.getLoadType();
        LoadType loadType2 = LoadType.PREPEND;
        if (loadType == loadType2) {
            this.placeholdersBefore = event.getPlaceholdersRemaining();
            this.headerAdded = false;
        } else if (event.getLoadType() == LoadType.APPEND) {
            this.placeholdersAfter = event.getPlaceholdersRemaining();
            this.footerAdded = false;
        }
        if (this.pageStash.isEmpty()) {
            if (event.getLoadType() == loadType2) {
                this.startTerminalSeparatorDeferred = false;
            } else {
                this.endTerminalSeparatorDeferred = false;
            }
        }
        final IntRange intRange = new IntRange(event.getMinPageOffset(), event.getMaxPageOffset());
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.pageStash, (Function1) new Function1<TransformablePage<T>, Boolean>() { // from class: androidx.paging.SeparatorState.onDrop.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean invoke2(Object obj) {
                return Boolean.valueOf(invoke((TransformablePage) obj));
            }

            public final boolean invoke(@NotNull TransformablePage<T> stash) {
                Intrinsics.checkNotNullParameter(stash, "stash");
                for (int i : stash.getOriginalPageOffsets()) {
                    if (intRange.contains(i)) {
                        return true;
                    }
                }
                return false;
            }
        });
        return event;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.paging.SeparatorState, androidx.paging.SeparatorState<R, T extends R>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.paging.SeparatorState] */
    @Nullable
    public final Object onEvent(@NotNull PageEvent<T> pageEvent, @NotNull Continuation<? super PageEvent<R>> continuation) {
        C12731 c12731;
        ?? r6;
        Object objOnDrop;
        ?? r7;
        ?? r8;
        if (continuation instanceof C12731) {
            c12731 = (C12731) continuation;
            int i = c12731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12731.label = i - Integer.MIN_VALUE;
            } else {
                c12731 = new C12731(continuation);
            }
        } else {
            c12731 = new C12731(continuation);
        }
        Object objOnLoadStateUpdate = c12731.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOnLoadStateUpdate);
            if (pageEvent instanceof PageEvent.Insert) {
                c12731.L$0 = this;
                c12731.label = 1;
                objOnLoadStateUpdate = onInsert((PageEvent.Insert) pageEvent, c12731);
                if (objOnLoadStateUpdate == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r8 = this;
                objOnDrop = (PageEvent) objOnLoadStateUpdate;
                r7 = r8;
            } else if (pageEvent instanceof PageEvent.Drop) {
                objOnDrop = onDrop((PageEvent.Drop) pageEvent);
                r7 = this;
            } else {
                if (!(pageEvent instanceof PageEvent.LoadStateUpdate)) {
                    throw new NoWhenBranchMatchedException();
                }
                c12731.L$0 = this;
                c12731.label = 2;
                objOnLoadStateUpdate = onLoadStateUpdate((PageEvent.LoadStateUpdate) pageEvent, c12731);
                if (objOnLoadStateUpdate == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r6 = this;
                objOnDrop = (PageEvent) objOnLoadStateUpdate;
                r7 = r6;
            }
        } else if (i2 == 1) {
            SeparatorState separatorState = (SeparatorState) c12731.L$0;
            ResultKt.throwOnFailure(objOnLoadStateUpdate);
            r8 = separatorState;
            objOnDrop = (PageEvent) objOnLoadStateUpdate;
            r7 = r8;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SeparatorState separatorState2 = (SeparatorState) c12731.L$0;
            ResultKt.throwOnFailure(objOnLoadStateUpdate);
            r6 = separatorState2;
            objOnDrop = (PageEvent) objOnLoadStateUpdate;
            r7 = r6;
        }
        if (r7.endTerminalSeparatorDeferred && !r7.pageStash.isEmpty()) {
            throw new IllegalStateException("deferred endTerm, page stash should be empty".toString());
        }
        if (!r7.startTerminalSeparatorDeferred || r7.pageStash.isEmpty()) {
            return objOnDrop;
        }
        throw new IllegalStateException("deferred startTerm, page stash should be empty".toString());
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0442  */
    /* JADX WARN: Code duplicated, block: B:138:0x0476 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0477  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x0477 -> B:140:0x047e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x0691 -> B:17:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x0780 -> B:229:0x0781). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object onInsert(@org.jetbrains.annotations.NotNull androidx.paging.PageEvent.Insert<T> r30, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.paging.PageEvent.Insert<R>> r31) {
        /*
            Method dump skipped, instruction units count: 2180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onInsert(androidx.paging.PageEvent$Insert, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object onLoadStateUpdate(@NotNull PageEvent.LoadStateUpdate<T> loadStateUpdate, @NotNull Continuation<? super PageEvent<R>> continuation) {
        if (Intrinsics.areEqual(this.loadStates.get(loadStateUpdate.getLoadType(), loadStateUpdate.getFromMediator()), loadStateUpdate.getLoadState())) {
            return loadStateUpdate;
        }
        this.loadStates.set(loadStateUpdate.getLoadType(), loadStateUpdate.getFromMediator(), loadStateUpdate.getLoadState());
        if (loadStateUpdate.getLoadType() != LoadType.REFRESH && loadStateUpdate.getFromMediator() && loadStateUpdate.getLoadState().getEndOfPaginationReached()) {
            return onInsert(loadStateUpdate.getLoadType() == LoadType.PREPEND ? PageEvent.Insert.INSTANCE.Prepend(CollectionsKt__CollectionsKt.emptyList(), this.placeholdersBefore, this.loadStates.snapshot()) : PageEvent.Insert.INSTANCE.Append(CollectionsKt__CollectionsKt.emptyList(), this.placeholdersAfter, this.loadStates.snapshot()), continuation);
        }
        return loadStateUpdate;
    }

    public final void setEndTerminalSeparatorDeferred(boolean z) {
        this.endTerminalSeparatorDeferred = z;
    }

    public final void setFooterAdded(boolean z) {
        this.footerAdded = z;
    }

    public final void setHeaderAdded(boolean z) {
        this.headerAdded = z;
    }

    public final void setPlaceholdersAfter(int i) {
        this.placeholdersAfter = i;
    }

    public final void setPlaceholdersBefore(int i) {
        this.placeholdersBefore = i;
    }

    public final void setStartTerminalSeparatorDeferred(boolean z) {
        this.startTerminalSeparatorDeferred = z;
    }

    public final <T> boolean terminatesEnd(@NotNull PageEvent.Insert<T> terminatesEnd, @NotNull TerminalSeparatorType terminalSeparatorType) {
        LoadStates mediator;
        LoadState append;
        Intrinsics.checkNotNullParameter(terminatesEnd, "$this$terminatesEnd");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        if (terminatesEnd.getLoadType() == LoadType.PREPEND) {
            return this.endTerminalSeparatorDeferred;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[terminalSeparatorType.ordinal()];
        if (i == 1) {
            return terminatesEnd.getCombinedLoadStates().getSource().getAppend().getEndOfPaginationReached() && ((mediator = terminatesEnd.getCombinedLoadStates().getMediator()) == null || (append = mediator.getAppend()) == null || append.getEndOfPaginationReached());
        }
        if (i == 2) {
            return terminatesEnd.getCombinedLoadStates().getSource().getAppend().getEndOfPaginationReached();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final <T> boolean terminatesStart(@NotNull PageEvent.Insert<T> terminatesStart, @NotNull TerminalSeparatorType terminalSeparatorType) {
        LoadStates mediator;
        LoadState prepend;
        Intrinsics.checkNotNullParameter(terminatesStart, "$this$terminatesStart");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        if (terminatesStart.getLoadType() == LoadType.APPEND) {
            return this.startTerminalSeparatorDeferred;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType.ordinal()];
        if (i == 1) {
            return terminatesStart.getCombinedLoadStates().getSource().getPrepend().getEndOfPaginationReached() && ((mediator = terminatesStart.getCombinedLoadStates().getMediator()) == null || (prepend = mediator.getPrepend()) == null || prepend.getEndOfPaginationReached());
        }
        if (i == 2) {
            return terminatesStart.getCombinedLoadStates().getSource().getPrepend().getEndOfPaginationReached();
        }
        throw new NoWhenBranchMatchedException();
    }
}
