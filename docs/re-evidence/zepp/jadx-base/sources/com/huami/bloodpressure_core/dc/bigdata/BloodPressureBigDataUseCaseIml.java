package com.huami.bloodpressure_core.dc.bigdata;

import com.huami.bigdata.statistics.bloodpressure.BloodPressureBigDataUseCase;
import com.huami.bigdata.statistics.bloodpressure.BloodPressureSingleData;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.dc.local.ILocalDelegate;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_core.ext.TimeZoneEx;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/bloodpressure_core/dc/bigdata/BloodPressureBigDataUseCaseIml;", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureBigDataUseCase;", "", "from", "to", "", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureSingleData;", "getLocalDataList", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "f", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "iLocalDelegate", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "g", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureBigDataUseCaseIml extends BloodPressureBigDataUseCase {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ILocalDelegate iLocalDelegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final IBigDataExportedApi iBigDataExportedApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.bigdata.BloodPressureBigDataUseCaseIml", f = "BloodPressureBigDataUseCaseIml.kt", i = {}, l = {29}, m = "getLocalDataList", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureBigDataUseCaseIml.this.getLocalDataList(0L, 0L, this);
        }
    }

    public BloodPressureBigDataUseCaseIml(@NotNull ILocalDelegate iLocalDelegate, @NotNull IBigDataExportedApi iBigDataExportedApi) {
        super(iBigDataExportedApi);
        this.iLocalDelegate = iLocalDelegate;
        this.iBigDataExportedApi = iBigDataExportedApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @Nullable
    public Object getLocalDataList(long j, long j2, @NotNull Continuation<? super List<BloodPressureSingleData>> continuation) {
        a aVar;
        ArrayList arrayList;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object dataByDateStr = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(dataByDateStr);
            TimeFormatEx timeFormatEx = TimeFormatEx.INSTANCE;
            String timeYMD = timeFormatEx.formatTimeYMD(j);
            String timeYMD2 = timeFormatEx.formatTimeYMD(j2);
            ILocalDelegate iLocalDelegate = this.iLocalDelegate;
            aVar.c = 1;
            dataByDateStr = iLocalDelegate.getDataByDateStr(timeYMD, timeYMD2, aVar);
            if (dataByDateStr == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(dataByDateStr);
        }
        List<BloodPressureDbVo> list = (List) dataByDateStr;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (BloodPressureDbVo bloodPressureDbVo : list) {
                arrayList.add(new BloodPressureSingleData(bloodPressureDbVo.getMeasureTime(), TimeZoneEx.INSTANCE.getTimeZoneIdFromSeconds(bloodPressureDbVo.getTimeZone()), bloodPressureDbVo.getSbp(), bloodPressureDbVo.getDbp()));
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }
}
