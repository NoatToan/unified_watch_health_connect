package com.xiaomi.fitness.util;

import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResUtilExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/util/SportPathViewUtil;", "", "<init>", "()V", "getTraceStyleResModelByIndex", "", "index", "isStart", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportPathViewUtil {

    @NotNull
    public static final SportPathViewUtil INSTANCE = new SportPathViewUtil();

    private SportPathViewUtil() {
    }

    public final int getTraceStyleResModelByIndex(int index, boolean isStart) {
        TraceStyleResModel traceStyleModel = TraceStyleResUtilExtKt.getTraceStyleModel(index);
        return isStart ? traceStyleModel.getStartIcon() : traceStyleModel.getEndIcon();
    }
}
