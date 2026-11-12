package androidx.paging;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/paging/FlattenedPageController;", "T", "", "()V", "list", "Landroidx/paging/FlattenedPageEventStorage;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "snapshots", "", "Landroidx/paging/TemporaryDownstream;", "createTemporaryDownstream", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "record", "", "event", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 4, 2})
final class FlattenedPageController<T> {
    private final FlattenedPageEventStorage<T> list = new FlattenedPageEventStorage<>();
    private List<TemporaryDownstream<T>> snapshots = CollectionsKt__CollectionsKt.emptyList();
    private final Mutex lock = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: androidx.paging.FlattenedPageController$createTemporaryDownstream$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0086@"}, d2 = {"createTemporaryDownstream", "", "T", "continuation", "Lkotlin/coroutines/Continuation;", "Landroidx/paging/TemporaryDownstream;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0, 1, 1, 1}, l = {310, SportReportBaseParser.ReportType.avgDescentRate}, m = "createTemporaryDownstream", n = {"this", "$this$withLock$iv", "$this$withLock$iv", "snap", "index$iv"}, s = {"L$0", "L$1", "L$0", "L$2", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return FlattenedPageController.this.createTemporaryDownstream(this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.FlattenedPageController$record$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@"}, d2 = {"record", "", "T", "event", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {297, 174}, m = "record", n = {"this", "event", "$this$withLock$iv", "event", "$this$withLock$iv", "destination$iv$iv", "element$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$5"})
    public static final class C12411 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C12411(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlattenedPageController.this.record(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:25:0x0082, B:27:0x0088, B:29:0x0090, B:30:0x0093, B:24:0x006c), top: B:38:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0090 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:25:0x0082, B:27:0x0088, B:29:0x0090, B:30:0x0093, B:24:0x006c), top: B:38:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6 A[LOOP:0: B:25:0x0082->B:33:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object createTemporaryDownstream(@NotNull Continuation<? super TemporaryDownstream<T>> continuation) {
        AnonymousClass1 anonymousClass1;
        FlattenedPageController<T> flattenedPageController;
        Mutex mutex;
        TemporaryDownstream temporaryDownstream;
        TemporaryDownstream temporaryDownstream2;
        int i;
        Iterator<T> it;
        int i2;
        IndexedValue<? extends PageEvent<T>> indexedValue;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass1.label;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    Mutex mutex2 = (Mutex) anonymousClass1.L$1;
                    flattenedPageController = (FlattenedPageController) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex2;
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = anonymousClass1.I$0;
                    it = (Iterator) anonymousClass1.L$3;
                    temporaryDownstream = (TemporaryDownstream) anonymousClass1.L$2;
                    temporaryDownstream2 = (TemporaryDownstream) anonymousClass1.L$1;
                    mutex = (Mutex) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i = i5;
                }
                while (it.hasNext()) {
                    T next = it.next();
                    i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    indexedValue = new IndexedValue<>(Boxing.boxInt(i).intValue() - Integer.MIN_VALUE, (PageEvent) next);
                    anonymousClass1.L$0 = mutex;
                    anonymousClass1.L$1 = temporaryDownstream2;
                    anonymousClass1.L$2 = temporaryDownstream;
                    anonymousClass1.L$3 = it;
                    anonymousClass1.I$0 = i2;
                    anonymousClass1.label = 2;
                    if (temporaryDownstream.send(indexedValue, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = i2;
                }
                mutex.unlock(null);
                return temporaryDownstream2;
            }
            ResultKt.throwOnFailure(obj);
            Mutex mutex3 = this.lock;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = mutex3;
            anonymousClass1.label = 1;
            if (mutex3.lock(null, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            flattenedPageController = this;
            mutex = mutex3;
            temporaryDownstream = new TemporaryDownstream();
            temporaryDownstream2 = temporaryDownstream;
            i = 0;
            it = flattenedPageController.list.getAsEvents().iterator();
            while (it.hasNext()) {
                T next2 = it.next();
                i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                indexedValue = new IndexedValue<>(Boxing.boxInt(i).intValue() - Integer.MIN_VALUE, (PageEvent) next2);
                anonymousClass1.L$0 = mutex;
                anonymousClass1.L$1 = temporaryDownstream2;
                anonymousClass1.L$2 = temporaryDownstream;
                anonymousClass1.L$3 = it;
                anonymousClass1.I$0 = i2;
                anonymousClass1.label = 2;
                if (temporaryDownstream.send(indexedValue, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i2;
            }
            mutex.unlock(null);
            return temporaryDownstream2;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0099 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:13:0x003f, B:30:0x00b5, B:25:0x0093, B:27:0x0099, B:33:0x00c9, B:32:0x00c5, B:24:0x0077), top: B:38:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:13:0x003f, B:30:0x00b5, B:25:0x0093, B:27:0x0099, B:33:0x00c9, B:32:0x00c5, B:24:0x0077), top: B:38:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b2 -> B:30:0x00b5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object record(@org.jetbrains.annotations.NotNull kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.record(kotlin.collections.IndexedValue, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
