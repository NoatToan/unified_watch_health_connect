package com.xiaomi.fitness.detail.video.share.util;

import defpackage.dki;
import defpackage.hoi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleModelVisitor;", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "<init>", "()V", "startIcon", "", "getStartIcon", "()I", "setStartIcon", "(I)V", "endIcon", "getEndIcon", "setEndIcon", "traceBgColor", "getTraceBgColor", "setTraceBgColor", "traceColor", "getTraceColor", "setTraceColor", "shouldBeCentered", "", "getShouldBeCentered", "()Z", "setShouldBeCentered", "(Z)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TraceStyleModelVisitor extends TraceStyleResModel {

    @NotNull
    public static final TraceStyleModelVisitor INSTANCE = new TraceStyleModelVisitor();
    private static int startIcon = hoi.E;
    private static int endIcon = hoi.v;
    private static int traceBgColor = dki.J1;
    private static int traceColor = dki.R1;
    private static boolean shouldBeCentered = true;

    private TraceStyleModelVisitor() {
        super(6);
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public int getEndIcon() {
        return endIcon;
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public boolean getShouldBeCentered() {
        return shouldBeCentered;
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public int getStartIcon() {
        return startIcon;
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public int getTraceBgColor() {
        return traceBgColor;
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public int getTraceColor() {
        return traceColor;
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public void setEndIcon(int i) {
        endIcon = i;
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public void setShouldBeCentered(boolean z) {
        shouldBeCentered = z;
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public void setStartIcon(int i) {
        startIcon = i;
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public void setTraceBgColor(int i) {
        traceBgColor = i;
    }

    @Override // com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel
    public void setTraceColor(int i) {
        traceColor = i;
    }
}
