package com.huami.moving.sport.ui.usecase;

import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.utils.TriathlonChildSportUtil;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/moving/sport/ui/usecase/GetChildSportRecordDataUseCase;", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "parent", "Lkotlinx/coroutines/flow/Flow;", Constant.METHOD_EXECUTE, "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", PointCategory.LOAD, "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class GetChildSportRecordDataUseCase {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.usecase.GetChildSportRecordDataUseCase", f = "GetChildSportRecordDataUseCase.kt", i = {}, l = {21}, m = Constant.METHOD_EXECUTE, n = {}, s = {})
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
            return GetChildSportRecordDataUseCase.this.execute(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object execute(@NotNull Trackrecord trackrecord, @NotNull Continuation<? super Flow<? extends Trackrecord>> continuation) {
        a aVar;
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
        Object objLoad = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad);
            aVar.c = 1;
            objLoad = load(trackrecord, aVar);
            if (objLoad == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoad);
        }
        return FlowKt.distinctUntilChanged(FlowKt.asFlow((Iterable) objLoad));
    }

    @Nullable
    public final Object load(@NotNull Trackrecord trackrecord, @NotNull Continuation<? super List<? extends Trackrecord>> continuation) {
        ArrayList arrayList = new ArrayList();
        long[][] jArrAnaChildSport = TriathlonChildSportUtil.anaChildSport(trackrecord.getChildListData());
        if (jArrAnaChildSport != null) {
            int i = 0;
            long[] jArr = jArrAnaChildSport[0];
            int length = jArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = i + 1;
                    Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(jArr[i], trackrecord.getSource().intValue());
                    if (trackRecordById != null) {
                        arrayList.add(trackRecordById);
                    }
                    if (i2 > length) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return arrayList;
    }
}
