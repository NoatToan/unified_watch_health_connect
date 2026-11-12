package com.huami.devicerecorder.repository;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicerecorder.IRecorderDevice;
import com.huami.devicerecorder.model.IRecorderDB;
import com.huami.devicerecorder.model.RecordFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0002J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ!\u0010\u0012\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/huami/devicerecorder/repository/RecordRepo;", "Lcom/huami/devicerecorder/repository/IRecordRepo;", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/devicerecorder/model/RecordFile;", "getRecordFiles", "fetchNewDataNextTime", "recordFile", "", "deleteLocalRecordFile", "(Lcom/huami/devicerecorder/model/RecordFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "recordFiles", "deleteLocalRecordFiles", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addLocalRecordFile", "addLocalRecordFiles", "Lcom/huami/devicerecorder/repository/LocalRecordRepo;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicerecorder/repository/LocalRecordRepo;", "localRepo", "Lcom/huami/devicerecorder/repository/DeviceRecordRepo;", "b", "()Lcom/huami/devicerecorder/repository/DeviceRecordRepo;", "remoteRepo", "", "Ljava/util/List;", "cachedRemoteData", GoogleApiAvailabilityLight.a, "Z", "hasCached", "Lcom/huami/devicerecorder/model/IRecorderDB;", "dao", "Lcom/huami/devicerecorder/IRecorderDevice;", "device", "<init>", "(Lcom/huami/devicerecorder/model/IRecorderDB;Lcom/huami/devicerecorder/IRecorderDevice;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class RecordRepo implements IRecordRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy localRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy remoteRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<RecordFile> cachedRemoteData = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean hasCached;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.devicerecorder.repository.RecordRepo", f = "RecordRepo.kt", i = {0, 1}, l = {16, 21}, m = "getRecordFiles", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return RecordRepo.this.getRecordFiles(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicerecorder/repository/LocalRecordRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LocalRecordRepo> {
        public final /* synthetic */ IRecorderDB a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IRecorderDB iRecorderDB) {
            super(0);
            this.a = iRecorderDB;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocalRecordRepo invoke() {
            return new LocalRecordRepo(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.devicerecorder.repository.RecordRepo", f = "RecordRepo.kt", i = {0}, l = {34}, m = "refreshRemoteData", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return RecordRepo.this.c(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicerecorder/repository/DeviceRecordRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<DeviceRecordRepo> {
        public final /* synthetic */ IRecorderDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IRecorderDevice iRecorderDevice) {
            super(0);
            this.a = iRecorderDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceRecordRepo invoke() {
            return new DeviceRecordRepo(this.a);
        }
    }

    public RecordRepo(@NotNull IRecorderDB iRecorderDB, @NotNull IRecorderDevice iRecorderDevice) {
        this.localRepo = LazyKt__LazyJVMKt.lazy(new b(iRecorderDB));
        this.remoteRepo = LazyKt__LazyJVMKt.lazy(new d(iRecorderDevice));
    }

    private final LocalRecordRepo a() {
        return (LocalRecordRepo) this.localRepo.getValue();
    }

    private final DeviceRecordRepo b() {
        return (DeviceRecordRepo) this.remoteRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Continuation<? super Unit> continuation) {
        c cVar;
        RecordRepo recordRepo;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object allDeviceRecords = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(allDeviceRecords);
            DeviceRecordRepo deviceRecordRepoB = b();
            cVar.a = this;
            cVar.d = 1;
            allDeviceRecords = deviceRecordRepoB.getAllDeviceRecords(cVar);
            if (allDeviceRecords == coroutine_suspended) {
                return coroutine_suspended;
            }
            recordRepo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recordRepo = (RecordRepo) cVar.a;
            ResultKt.throwOnFailure(allDeviceRecords);
        }
        List list = (List) allDeviceRecords;
        recordRepo.cachedRemoteData.clear();
        if (list != null && (!list.isEmpty())) {
            recordRepo.cachedRemoteData.addAll(list);
        }
        recordRepo.hasCached = true;
        return Unit.INSTANCE;
    }

    @Override // com.huami.devicerecorder.repository.IRecordRepo
    @Nullable
    public Object addLocalRecordFile(@NotNull RecordFile recordFile, @NotNull Continuation<? super Boolean> continuation) {
        recordFile.setHasSynced(true);
        return a().add(recordFile, continuation);
    }

    @Override // com.huami.devicerecorder.repository.IRecordRepo
    @Nullable
    public Object addLocalRecordFiles(@NotNull List<RecordFile> list, @NotNull Continuation<? super Boolean> continuation) {
        return a().add(list, continuation);
    }

    @Override // com.huami.devicerecorder.repository.IRecordRepo
    @Nullable
    public Object deleteLocalRecordFile(@NotNull RecordFile recordFile, @NotNull Continuation<? super Boolean> continuation) {
        return a().delete(recordFile, continuation);
    }

    @Override // com.huami.devicerecorder.repository.IRecordRepo
    @Nullable
    public Object deleteLocalRecordFiles(@NotNull List<RecordFile> list, @NotNull Continuation<? super Boolean> continuation) {
        return a().delete(list, continuation);
    }

    public final void fetchNewDataNextTime() {
        this.hasCached = false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0 A[LOOP:0: B:31:0x009a->B:33:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.devicerecorder.repository.IRecordRepo
    @Nullable
    public Object getRecordFiles(@NotNull Continuation<? super Collection<RecordFile>> continuation) {
        a aVar;
        RecordRepo recordRepo;
        RecordRepo recordRepo2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQueryAll = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                recordRepo = (RecordRepo) aVar.a;
                ResultKt.throwOnFailure(objQueryAll);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                recordRepo2 = (RecordRepo) aVar.a;
                ResultKt.throwOnFailure(objQueryAll);
            }
            List list = (List) objQueryAll;
            linkedHashMap = new LinkedHashMap();
            linkedHashMap2 = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap2.put(Boxing.boxLong(((RecordFile) obj).getId()), obj);
            }
            linkedHashMap.putAll(linkedHashMap2);
            for (RecordFile recordFile : recordRepo2.cachedRemoteData) {
                if (linkedHashMap.containsKey(Boxing.boxLong(recordFile.getId()))) {
                    linkedHashMap.put(Boxing.boxLong(recordFile.getId()), recordFile);
                }
            }
            return linkedHashMap.values();
        }
        ResultKt.throwOnFailure(objQueryAll);
        if (this.hasCached) {
            Iterator<T> it2 = this.cachedRemoteData.iterator();
            while (it2.hasNext()) {
                ((RecordFile) it2.next()).setHasSynced(false);
            }
        } else {
            aVar.a = this;
            aVar.d = 1;
            if (c(aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        recordRepo = this;
        LocalRecordRepo localRecordRepoA = recordRepo.a();
        aVar.a = recordRepo;
        aVar.d = 2;
        objQueryAll = localRecordRepoA.queryAll(aVar);
        if (objQueryAll == coroutine_suspended) {
            return coroutine_suspended;
        }
        recordRepo2 = recordRepo;
        List list2 = (List) objQueryAll;
        linkedHashMap = new LinkedHashMap();
        linkedHashMap2 = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)), 16));
        while (r7.hasNext()) {
            linkedHashMap2.put(Boxing.boxLong(((RecordFile) obj).getId()), obj);
        }
        linkedHashMap.putAll(linkedHashMap2);
        while (r7.hasNext()) {
            if (linkedHashMap.containsKey(Boxing.boxLong(recordFile.getId()))) {
                linkedHashMap.put(Boxing.boxLong(recordFile.getId()), recordFile);
            }
        }
        return linkedHashMap.values();
    }
}
