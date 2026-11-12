package com.xiaomi.fitness.track;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"getFileTypeList", "", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "getFileTypeListWithoutGps", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData$TCX;", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExportTrackSupportTypeDataKt {
    @NotNull
    public static final List<ExportTrackSupportTypeData> getFileTypeList() {
        return CollectionsKt__CollectionsKt.mutableListOf(ExportTrackSupportTypeData.GPX.INSTANCE, ExportTrackSupportTypeData.KML.INSTANCE, ExportTrackSupportTypeData.TCX.INSTANCE);
    }

    @NotNull
    public static final List<ExportTrackSupportTypeData.TCX> getFileTypeListWithoutGps() {
        return CollectionsKt__CollectionsKt.mutableListOf(ExportTrackSupportTypeData.TCX.INSTANCE);
    }
}
