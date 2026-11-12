package com.huami.bloodpressure_core.dc.local;

import com.facebook.appevents.UserDataStore;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bodymeasurements.common.remote.friend.FriendConstants;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\b5\u00106J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J#\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J#\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0015J!\u0010\u001e\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0007J\u001b\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\tJ\u001b\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J3\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J+\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u00100R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/huami/bloodpressure_core/dc/local/LocalDelegateImpl;", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "list", "", Constant.METHOD_INSERT, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", WorkoutExercises.CLEAN, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "userId", "Lkotlinx/coroutines/flow/Flow;", "getDataByUserId", "", "timeStamp", "delDataByUserId", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dateString", "getDateFlowByUserId", "getMaxTimeByUserId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTime", "endTime", "getBetweenDataFlowByUserId", "getBetweenDataByUserId", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMaxDataByUserId", "getUnuploadDataByUserId", "localList", "setListUploaded", "getAllDataByUserId", "", ParamKey.dataSource, "getDataCountByDataSource", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", FriendConstants.Param.FROM_DATE, "endDate", "getDataByDateStr", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "limit", "getUnuploadDataByDataSource", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDataByUserIdAndSource", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isUpload", "getDataCountByUserIdAndSource", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDatabase;", "a", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDatabase;", UserDataStore.DATE_OF_BIRTH, "<init>", "(Lcom/huami/bloodpressure_core/dc/local/BloodPressureDatabase;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class LocalDelegateImpl implements ILocalDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodPressureDatabase db;

    public LocalDelegateImpl(@NotNull BloodPressureDatabase bloodPressureDatabase) {
        this.db = bloodPressureDatabase;
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object clean(@NotNull Continuation<? super Unit> continuation) {
        this.db.bpDao().clean();
        return Unit.INSTANCE;
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object delDataByUserId(@NotNull String str, long j, @NotNull Continuation<? super Unit> continuation) {
        this.db.bpDao().delDataByUserId(str, j);
        return Unit.INSTANCE;
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object getAllDataByUserId(@NotNull Continuation<? super List<BloodPressureDbVo>> continuation) {
        return this.db.bpDao().getAllDataByUserId(UserEx.getUserId(), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object getAllDataByUserIdAndSource(@NotNull String str, int i, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation) {
        return this.db.bpDao().getAllData(str, i, continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object getBetweenDataByUserId(@NotNull String str, long j, long j2, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation) {
        return this.db.bpDao().getBetweenDataByUserId(str, j, j2, continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @NotNull
    public Flow<List<BloodPressureDbVo>> getBetweenDataFlowByUserId(@NotNull String userId, long startTime, long endTime) {
        return this.db.bpDao().getBetweenDataFlowByUserId(userId, startTime, endTime);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object getDataByDateStr(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation) {
        return this.db.bpDao().getBetweenDataByDateStr(UserEx.getUserId(), str, str2, continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @NotNull
    public Flow<List<BloodPressureDbVo>> getDataByUserId(@NotNull String userId) {
        return IBloodPressureDao.DefaultImpls.getUserDataByUserId$default(this.db.bpDao(), userId, false, 2, null);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object getDataCountByDataSource(int i, @NotNull Continuation<? super Integer> continuation) {
        return this.db.bpDao().getDataCountByDataSource(UserEx.getUserId(), i, continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object getDataCountByUserIdAndSource(@NotNull String str, int i, boolean z, @NotNull Continuation<? super Long> continuation) {
        return this.db.bpDao().getDataCountByDataSource(str, i, z, continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @NotNull
    public Flow<List<BloodPressureDbVo>> getDateFlowByUserId(@NotNull String userId, @NotNull String dateString) {
        return this.db.bpDao().getDateFlowByUserId(userId, dateString);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @NotNull
    public Flow<BloodPressureDbVo> getMaxDataByUserId(@NotNull String userId) {
        return this.db.bpDao().getMaxDataByUserId(userId);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object getMaxTimeByUserId(@NotNull String str, @NotNull Continuation<? super Long> continuation) {
        return this.db.bpDao().getMaxTimeByUserId(str, continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object getUnuploadDataByDataSource(@NotNull String str, int i, int i2, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation) {
        return this.db.bpDao().getLocalData(str, false, i, i2, continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object getUnuploadDataByUserId(@NotNull String str, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation) {
        return this.db.bpDao().getLocalDataByUserId(str, false, 30, continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object insert(@NotNull List<BloodPressureDbVo> list, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertOrUpdate = this.db.bpDao().insertOrUpdate(list, continuation);
        return objInsertOrUpdate == a.getCOROUTINE_SUSPENDED() ? objInsertOrUpdate : Unit.INSTANCE;
    }

    @Override // com.huami.bloodpressure_core.dc.local.ILocalDelegate
    @Nullable
    public Object setListUploaded(@NotNull List<BloodPressureDbVo> list, @NotNull Continuation<? super Unit> continuation) {
        IBloodPressureDao iBloodPressureDaoBpDao = this.db.bpDao();
        String userId = UserEx.getUserId();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boxing.boxLong(((BloodPressureDbVo) it2.next()).getMeasureTime()));
        }
        iBloodPressureDaoBpDao.setDataUploadedByUserId(userId, true, arrayList);
        return Unit.INSTANCE;
    }
}
