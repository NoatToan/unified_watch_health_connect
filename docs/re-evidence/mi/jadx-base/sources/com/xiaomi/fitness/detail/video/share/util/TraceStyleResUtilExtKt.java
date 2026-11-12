package com.xiaomi.fitness.detail.video.share.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getTraceStyleModel", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "typeId", "", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TraceStyleResUtilExtKt {
    @NotNull
    public static final TraceStyleResModel getTraceStyleModel(int i) {
        switch (i) {
            case 0:
                return TraceStyleModelClassic.INSTANCE;
            case 1:
                return TraceStyleModelDreamer.INSTANCE;
            case 2:
                return TraceStyleModelCompass.INSTANCE;
            case 3:
                return TraceStyleModelRunner.INSTANCE;
            case 4:
                return TraceStyleModelOnFire.INSTANCE;
            case 5:
                return TraceStyleModelPaperPlane.INSTANCE;
            case 6:
                return TraceStyleModelVisitor.INSTANCE;
            default:
                return TraceStyleModelClassic.INSTANCE;
        }
    }
}
