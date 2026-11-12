package com.xiaomi.fitness.detail;

import com.mi.health.map.data.GpsValues;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.wearable.gpsalgorithm.FitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.data.GpsTrackData;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a,\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\u0012\u001a\u0012\u0010\u0013\u001a\u00020\u000e*\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0014\u001a\f\u0010\u0015\u001a\u00020\u000e*\u00020\u000fH\u0002\u001a\"\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\u0018\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"mGpsTrackData", "Lcom/xiaomi/wearable/gpsalgorithm/data/GpsTrackData;", "getMGpsTrackData", "()Lcom/xiaomi/wearable/gpsalgorithm/data/GpsTrackData;", "setMGpsTrackData", "(Lcom/xiaomi/wearable/gpsalgorithm/data/GpsTrackData;)V", "pauseRecordList", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "getPauseRecordList", "()Ljava/util/List;", "setPauseRecordList", "(Ljava/util/List;)V", "putGpsTrackData", "", "Lcom/mi/health/map/data/GpsValues;", "trackData", "recordList", "(Lcom/mi/health/map/data/GpsValues;Lcom/xiaomi/wearable/gpsalgorithm/data/GpsTrackData;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "smooth", "(Lcom/mi/health/map/data/GpsValues;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeSpeed", "addIntegerKilometerPoint", "valueMap", "(Lcom/mi/health/map/data/GpsValues;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGpsValuesEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpsValuesEx.kt\ncom/xiaomi/fitness/detail/GpsValuesExKt\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,96:1\n120#2,10:97\n120#2,10:107\n120#2,10:117\n*S KotlinDebug\n*F\n+ 1 GpsValuesEx.kt\ncom/xiaomi/fitness/detail/GpsValuesExKt\n*L\n17#1:97,10\n29#1:107,10\n61#1:117,10\n*E\n"})
public final class GpsValuesExKt {

    @Nullable
    private static GpsTrackData mGpsTrackData;

    @Nullable
    private static List<SportRecordItem> pauseRecordList;

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.GpsValuesExKt$addIntegerKilometerPoint$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.GpsValuesExKt", f = "GpsValuesEx.kt", i = {0, 0, 0}, l = {102}, m = "addIntegerKilometerPoint", n = {"$this$addIntegerKilometerPoint", "valueMap", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return GpsValuesExKt.addIntegerKilometerPoint(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.GpsValuesExKt$putGpsTrackData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.GpsValuesExKt", f = "GpsValuesEx.kt", i = {0, 0, 0, 0}, l = {102}, m = "putGpsTrackData", n = {"$this$putGpsTrackData", "trackData", "recordList", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C18581 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C18581(Continuation<? super C18581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GpsValuesExKt.putGpsTrackData(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.GpsValuesExKt$smooth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.GpsValuesExKt", f = "GpsValuesEx.kt", i = {0, 0}, l = {102}, m = "smooth", n = {"$this$smooth", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    public static final class C18591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18591(Continuation<? super C18591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GpsValuesExKt.smooth(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object addIntegerKilometerPoint(@NotNull GpsValues gpsValues, @Nullable List<SportRecordItem> list, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Mutex mutexMutex$default;
        GpsValues gpsValues2;
        Object obj;
        long j;
        long j2;
        List<SportRecordItem> list2 = list;
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
        int i3 = 0;
        Location location = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            if (list2 == null || list.isEmpty()) {
                return Unit.INSTANCE;
            }
            mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
            anonymousClass1.L$0 = gpsValues;
            anonymousClass1.L$1 = list2;
            anonymousClass1.L$2 = mutexMutex$default;
            anonymousClass1.label = 1;
            if (mutexMutex$default.lock(null, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gpsValues2 = gpsValues;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex = (Mutex) anonymousClass1.L$2;
            List<SportRecordItem> list3 = (List) anonymousClass1.L$1;
            gpsValues2 = (GpsValues) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj2);
            mutexMutex$default = mutex;
            list2 = list3;
        }
        try {
            if (gpsValues2.integerKilometerList.size() > 0) {
                try {
                    gpsValues2.integerKilometerList.clear();
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    mutexMutex$default.unlock(obj);
                    throw th;
                }
            }
            int size = list2.size();
            while (i3 < size) {
                SportRecordItem sportRecordItem = list2.get(i3);
                long endTime = sportRecordItem.getEndTime();
                Number value = sportRecordItem.getValue();
                if (value.floatValue() >= 1.0f) {
                    long j3 = 30;
                    long j4 = endTime - j3;
                    long j5 = j3 + endTime;
                    Location location2 = location;
                    for (Location location3 : gpsValues2.originalLocationList) {
                        long j6 = endTime;
                        long j7 = location3.timeStamp;
                        if (j7 > j5) {
                            break;
                        }
                        if (j7 >= j4) {
                            if (location2 != null) {
                                j = j6;
                                j2 = j5;
                                if (Math.abs(j7 - j) < Math.abs(location2.timeStamp - j)) {
                                }
                                endTime = j;
                            } else {
                                j = j6;
                                j2 = j5;
                            }
                            j5 = j2;
                            location2 = location3;
                            endTime = j;
                        } else {
                            j = j6;
                            j2 = j5;
                        }
                        j5 = j2;
                        endTime = j;
                    }
                    if (location2 != null) {
                        int iIntValue = value.intValue();
                        location2.kilometer = iIntValue;
                        Location location4 = new Location();
                        location4.timeStamp = location2.timeStamp;
                        location4.startTimeStamp = location2.startTimeStamp;
                        location4.latitude = location2.latitude;
                        location4.longitude = location2.longitude;
                        location4.kilometer = iIntValue;
                        gpsValues2.integerKilometerList.add(location4);
                    }
                }
                i3++;
                location = null;
            }
            Unit unit = Unit.INSTANCE;
            mutexMutex$default.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    private static final void computeSpeed(GpsValues gpsValues) {
        Location location = null;
        for (Location location2 : gpsValues.locationList) {
            if (location != null) {
                double d = location2.total_distance - location.total_distance;
                long j = location2.timeStamp - location.timeStamp;
                if (d > 0.0d && j > 0) {
                    location2.speed = (float) ((d * ((double) 1.0f)) / j);
                }
            }
            location = location2;
        }
    }

    @Nullable
    public static final GpsTrackData getMGpsTrackData() {
        return mGpsTrackData;
    }

    @Nullable
    public static final List<SportRecordItem> getPauseRecordList() {
        return pauseRecordList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object putGpsTrackData(@NotNull GpsValues gpsValues, @NotNull GpsTrackData gpsTrackData, @Nullable List<SportRecordItem> list, @NotNull Continuation<? super Unit> continuation) {
        C18581 c18581;
        Mutex mutexMutex$default;
        if (continuation instanceof C18581) {
            c18581 = (C18581) continuation;
            int i = c18581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18581.label = i - Integer.MIN_VALUE;
            } else {
                c18581 = new C18581(continuation);
            }
        } else {
            c18581 = new C18581(continuation);
        }
        Object obj = c18581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
            c18581.L$0 = gpsValues;
            c18581.L$1 = gpsTrackData;
            c18581.L$2 = list;
            c18581.L$3 = mutexMutex$default;
            c18581.label = 1;
            if (mutexMutex$default.lock(null, c18581) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex = (Mutex) c18581.L$3;
            list = (List) c18581.L$2;
            gpsTrackData = (GpsTrackData) c18581.L$1;
            GpsValues gpsValues2 = (GpsValues) c18581.L$0;
            ResultKt.throwOnFailure(obj);
            mutexMutex$default = mutex;
            gpsValues = gpsValues2;
        }
        try {
            mGpsTrackData = gpsTrackData;
            pauseRecordList = list;
            List<Location> list2 = gpsTrackData.locationList;
            if (list2 != null && list2.size() > 0) {
                List<Location> locationList = gpsTrackData.locationList;
                Intrinsics.checkNotNullExpressionValue(locationList, "locationList");
                CollectionsKt__MutableCollectionsJVMKt.sort(locationList);
                List<Location> list3 = gpsValues.originalLocationList;
                List<Location> locationList2 = gpsTrackData.locationList;
                Intrinsics.checkNotNullExpressionValue(locationList2, "locationList");
                list3.addAll(locationList2);
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            mutexMutex$default.unlock(null);
        }
    }

    public static /* synthetic */ Object putGpsTrackData$default(GpsValues gpsValues, GpsTrackData gpsTrackData, List list, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return putGpsTrackData(gpsValues, gpsTrackData, list, continuation);
    }

    public static final void setMGpsTrackData(@Nullable GpsTrackData gpsTrackData) {
        mGpsTrackData = gpsTrackData;
    }

    public static final void setPauseRecordList(@Nullable List<SportRecordItem> list) {
        pauseRecordList = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object smooth(@NotNull GpsValues gpsValues, @NotNull Continuation<? super Unit> continuation) {
        C18591 c18591;
        Mutex mutexMutex$default;
        if (continuation instanceof C18591) {
            c18591 = (C18591) continuation;
            int i = c18591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18591.label = i - Integer.MIN_VALUE;
            } else {
                c18591 = new C18591(continuation);
            }
        } else {
            c18591 = new C18591(continuation);
        }
        Object obj = c18591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
            c18591.L$0 = gpsValues;
            c18591.L$1 = mutexMutex$default;
            c18591.label = 1;
            if (mutexMutex$default.lock(null, c18591) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex = (Mutex) c18591.L$1;
            GpsValues gpsValues2 = (GpsValues) c18591.L$0;
            ResultKt.throwOnFailure(obj);
            mutexMutex$default = mutex;
            gpsValues = gpsValues2;
        }
        try {
            GpsTrackData gpsTrackData = mGpsTrackData;
            List<Location> listSmoothGpsTrack = gpsTrackData == null ? null : FitnessSportAlgo.smoothGpsTrack(gpsTrackData, pauseRecordList);
            if (listSmoothGpsTrack != null && listSmoothGpsTrack.size() > 0) {
                gpsValues.locationList.clear();
                gpsValues.locationList.addAll(listSmoothGpsTrack);
            }
            computeSpeed(gpsValues);
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            mutexMutex$default.unlock(null);
        }
    }
}
