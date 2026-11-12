package com.xiaomi.fitness.repo.bloodpressure;

import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.repo.BaseDataSource;
import com.xiaomi.fitness.repo.bloodpressure.BloodPressureDataSource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/repo/bloodpressure/BloodPressureDataSource;", "Lcom/xiaomi/fitness/repo/BaseDataSource;", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "<init>", "(Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;)V", "TAG", "", "getDataRecord", "", "startTime", "", "endTime", "zoneOffsetInSec", "", "pageSize", "reverse", "", "(JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodPressureDataSource extends BaseDataSource<BloodPressureItem> {

    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.bloodpressure.BloodPressureDataSource$getDataRecord$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.bloodpressure.BloodPressureDataSource", f = "BloodPressureDataSource.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {22, 28}, m = "getDataRecord", n = {"startTime", "endTime", "zoneOffsetInSec", "pageSize", "reverse", "bpList", "pageSize", "reverse"}, s = {"J$0", "J$1", "I$0", "I$1", "Z$0", "L$0", "I$0", "Z$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BloodPressureDataSource.this.getDataRecord(0L, 0L, 0, 0, false, this);
        }
    }

    public BloodPressureDataSource(@Nullable PagingSourceParams pagingSourceParams) {
        super(pagingSourceParams);
        this.TAG = "BloodPressureDataSource";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getDataRecord$lambda$0(BloodPressureItem bloodPressureItem, BloodPressureItem bloodPressureItem2) {
        return (int) (bloodPressureItem2.getTime() - bloodPressureItem.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getDataRecord$lambda$1(BloodPressureItem bloodPressureItem, BloodPressureItem bloodPressureItem2) {
        return (int) (bloodPressureItem.getTime() - bloodPressureItem2.getTime());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x0110  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.xiaomi.fitness.repo.BaseDataSource
    @Nullable
    public Object getDataRecord(long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<BloodPressureItem>> continuation) {
        AnonymousClass1 anonymousClass1;
        Object limitedDataRecord;
        long j3;
        long j4;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i6 = anonymousClass1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i6 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = anonymousClass1.label;
        if (i7 != 0) {
            if (i7 == 1) {
                boolean z4 = anonymousClass1.Z$0;
                int i8 = anonymousClass1.I$1;
                int i9 = anonymousClass1.I$0;
                long j5 = anonymousClass1.J$1;
                long j6 = anonymousClass1.J$0;
                ResultKt.throwOnFailure(obj);
                z2 = z4;
                i3 = i9;
                limitedDataRecord = obj;
                i4 = i8;
                j3 = j6;
                j4 = j5;
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = anonymousClass1.Z$0;
                i5 = anonymousClass1.I$0;
                list = (List) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodPressureItem>");
            list2 = (List) obj;
            arrayList = new ArrayList();
            list3 = list;
            if (list3 != null || list3.isEmpty()) {
                Boxing.boxBoolean(arrayList.addAll(list2));
            } else {
                List list4 = list2;
                if (list4.isEmpty()) {
                    Boxing.boxBoolean(arrayList.addAll(list3));
                } else {
                    arrayList.addAll(list3);
                    arrayList.addAll(list4);
                    if (z3) {
                        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: fz2
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                return BloodPressureDataSource.getDataRecord$lambda$0((BloodPressureItem) obj2, (BloodPressureItem) obj3);
                            }
                        });
                    } else {
                        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: gz2
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                return BloodPressureDataSource.getDataRecord$lambda$1((BloodPressureItem) obj2, (BloodPressureItem) obj3);
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            if (arrayList.size() > i5) {
                return arrayList.subList(0, i5);
            }
            return arrayList;
        }
        ResultKt.throwOnFailure(obj);
        DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
        anonymousClass1.J$0 = j;
        anonymousClass1.J$1 = j2;
        anonymousClass1.I$0 = i;
        anonymousClass1.I$1 = i2;
        anonymousClass1.Z$0 = z;
        anonymousClass1.label = 1;
        limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord("blood_pressure", (String) null, j, j2, i, i2, z, anonymousClass1);
        if (limitedDataRecord == coroutine_suspended) {
            return coroutine_suspended;
        }
        j3 = j;
        j4 = j2;
        i3 = i;
        i4 = i2;
        z2 = z;
        Intrinsics.checkNotNull(limitedDataRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodPressureItem>");
        List list5 = (List) limitedDataRecord;
        DailyRecordDaoUtils dailyRecordDaoUtils2 = DailyRecordDaoUtils.INSTANCE;
        anonymousClass1.L$0 = list5;
        anonymousClass1.I$0 = i4;
        anonymousClass1.Z$0 = z2;
        anonymousClass1.label = 2;
        boolean z5 = z2;
        int i10 = i4;
        Object limitedDataRecord2 = dailyRecordDaoUtils2.getLimitedDataRecord(FitnessPersistKey.BloodPressureMedical, (String) null, j3, j4, i3, i4, z2, anonymousClass1);
        if (limitedDataRecord2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        z3 = z5;
        i5 = i10;
        list = list5;
        obj = limitedDataRecord2;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodPressureItem>");
        list2 = (List) obj;
        arrayList = new ArrayList();
        list3 = list;
        if (list3 != null) {
            Boxing.boxBoolean(arrayList.addAll(list2));
        } else {
            Boxing.boxBoolean(arrayList.addAll(list2));
        }
        if (arrayList.size() > i5) {
            return arrayList.subList(0, i5);
        }
        return arrayList;
    }
}
