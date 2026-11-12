package com.huami.moving.sport.ui.usecase;

import com.huami.moving.datacenter.TrackRecordManager;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/sport/ui/usecase/GetSportRecordDataUseCase;", "", "", "trackId", "", "source", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", Constant.METHOD_EXECUTE, "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", PointCategory.LOAD, "record", "", "updateRecord", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class GetSportRecordDataUseCase {

    @NotNull
    private static final String a = "GetSportRecordDataUseCase";

    @Nullable
    public final Object execute(long j, int i, @NotNull Continuation<? super Flow<? extends Trackrecord>> continuation) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackRecordManager.getInstance().getTrackRecordById(j, i));
        return FlowKt.distinctUntilChanged(FlowKt.asFlow(arrayList));
    }

    @Nullable
    public final Object load(long j, int i, @NotNull Continuation<? super Trackrecord> continuation) {
        return TrackRecordManager.getInstance().getTrackRecordById(j, i);
    }

    @Nullable
    public final Object updateRecord(@NotNull Trackrecord trackrecord, @NotNull Continuation<? super Unit> continuation) {
        trackrecord.setOriginalJsonData(TrackRecordManager.getInstance().parseTrackrecord2OriginalJsonData(trackrecord));
        TrackRecordManager.getInstance().updateTrackRecord(trackrecord);
        return Unit.INSTANCE;
    }
}
