package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"add", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FullGpsNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/DiffGpsNode;", "fullGpsNode", "bluetooth_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DiffGpsNodeKt {
    @NotNull
    public static final FullGpsNode add(@NotNull DiffGpsNode diffGpsNode, @NotNull FullGpsNode fullGpsNode) {
        Intrinsics.checkNotNullParameter(diffGpsNode, "<this>");
        Intrinsics.checkNotNullParameter(fullGpsNode, "fullGpsNode");
        return new FullGpsNode(diffGpsNode.getTimeDiff(), diffGpsNode.getLng() + fullGpsNode.getLng(), fullGpsNode.getLat() + diffGpsNode.getLat(), diffGpsNode.getType());
    }
}
