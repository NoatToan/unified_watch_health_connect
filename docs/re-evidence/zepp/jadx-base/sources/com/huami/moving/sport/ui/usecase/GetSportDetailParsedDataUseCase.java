package com.huami.moving.sport.ui.usecase;

import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.datacenter.TrackDataManager;
import com.tekartik.sqflite.Constant;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/moving/sport/ui/usecase/GetSportDetailParsedDataUseCase;", "", "", "trackId", "", "source", "sportType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", Constant.METHOD_EXECUTE, "(JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", PointCategory.LOAD, "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class GetSportDetailParsedDataUseCase {
    @Nullable
    public final Object execute(long j, int i, int i2, @NotNull Continuation<? super Flow<ParsedSportDetailData>> continuation) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackDataManager.getInstance().getTrackData(j, i, i2));
        return FlowKt.distinctUntilChanged(FlowKt.asFlow(arrayList));
    }

    @Nullable
    public final Object load(long j, int i, int i2, @NotNull Continuation<? super ParsedSportDetailData> continuation) {
        return TrackDataManager.getInstance().getTrackData(j, i, i2);
    }
}
