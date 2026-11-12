package com.huami.watchfacesstore.usecase;

import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.repo.HistoryRecordRepo;
import com.huami.watchfacesstore.room.WatchFaceInfo;
import com.huami.watchfacesstore.ui.WatchFaceManager;
import com.huami.watchfacesstore.ui.repo.WatchFaceRepo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086Bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/watchfacesstore/usecase/DeleteHistoryRecordUseCase;", "", "", "deviceId", "", "", "ids", "", "invoke", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "a", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "watchFaceRepo", "Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;", "b", "Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;", "historyRecordRepo", "Lkotlinx/coroutines/CoroutineDispatcher;", "c", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DeleteHistoryRecordUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceRepo watchFaceRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HistoryRecordRepo historyRecordRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.usecase.DeleteHistoryRecordUseCase$invoke$2", f = "DeleteHistoryRecordUseCase.kt", i = {}, l = {28, 31}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ List<Integer> d;

        /* JADX INFO: renamed from: com.huami.watchfacesstore.usecase.DeleteHistoryRecordUseCase$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0709a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<String> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0709a(List<String> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "dialFileDirs: " + CollectionsKt___CollectionsKt.joinToString$default(this.a, ",", null, null, 0, null, null, 62, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "watchInfo delete success effect " + this.a + " row";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, List<Integer> list, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeleteHistoryRecordUseCase.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0067 A[LOOP:0: B:19:0x0061->B:21:0x0067, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:24:0x0085  */
        /* JADX WARN: Code duplicated, block: B:26:0x008a  */
        /* JADX WARN: Code duplicated, block: B:29:0x0094 A[LOOP:1: B:27:0x008e->B:29:0x0094, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList arrayList;
            Iterator it2;
            Iterator it3;
            int iDeleteLocalInfoByIds;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = false;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((WatchFaceInfo) it2.next()).getDialPath());
                }
                HMLog.info("DeleteHistoryRecordUseCase", new C0709a(arrayList));
                if (arrayList.isEmpty()) {
                    return Boxing.boxBoolean(true);
                }
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    WatchFaceManager.INSTANCE.delete((String) it3.next());
                }
                iDeleteLocalInfoByIds = DeleteHistoryRecordUseCase.this.watchFaceRepo.deleteLocalInfoByIds(this.c, this.d);
                HMLog.info("DeleteHistoryRecordUseCase", new b(iDeleteLocalInfoByIds));
                if (iDeleteLocalInfoByIds > 0) {
                    z = true;
                }
                return Boxing.boxBoolean(z);
            }
            ResultKt.throwOnFailure(obj);
            HistoryRecordRepo historyRecordRepo = DeleteHistoryRecordUseCase.this.historyRecordRepo;
            String str = this.c;
            List<Integer> list = this.d;
            this.a = 1;
            obj = historyRecordRepo.deleteHistoryRecord(str, list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                WatchFaceRepo watchFaceRepo = DeleteHistoryRecordUseCase.this.watchFaceRepo;
                String str2 = this.c;
                List<Integer> list2 = this.d;
                this.a = 2;
                obj = watchFaceRepo.queryLocalInfoByIds(str2, list2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Iterable iterable2 = (Iterable) obj;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((WatchFaceInfo) it2.next()).getDialPath());
                }
                HMLog.info("DeleteHistoryRecordUseCase", new C0709a(arrayList));
                if (arrayList.isEmpty()) {
                    return Boxing.boxBoolean(true);
                }
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    WatchFaceManager.INSTANCE.delete((String) it3.next());
                }
                iDeleteLocalInfoByIds = DeleteHistoryRecordUseCase.this.watchFaceRepo.deleteLocalInfoByIds(this.c, this.d);
                HMLog.info("DeleteHistoryRecordUseCase", new b(iDeleteLocalInfoByIds));
                if (iDeleteLocalInfoByIds > 0) {
                    z = true;
                }
            }
            return Boxing.boxBoolean(z);
        }
    }

    public DeleteHistoryRecordUseCase(@NotNull WatchFaceRepo watchFaceRepo, @NotNull HistoryRecordRepo historyRecordRepo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.watchFaceRepo = watchFaceRepo;
        this.historyRecordRepo = historyRecordRepo;
        this.defaultDispatcher = coroutineDispatcher;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull List<Integer> list, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.defaultDispatcher, new a(str, list, null), continuation);
    }

    public /* synthetic */ DeleteHistoryRecordUseCase(WatchFaceRepo watchFaceRepo, HistoryRecordRepo historyRecordRepo, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(watchFaceRepo, historyRecordRepo, (i & 4) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }
}
