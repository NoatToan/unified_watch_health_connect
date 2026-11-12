package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/DiffGpsNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FullGpsNode;", "fullGpsNode", TransportUri.ACTION_ADD, "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class DiffGpsNodeKt {
    @NotNull
    public static final FullGpsNode add(@NotNull DiffGpsNode diffGpsNode, @NotNull FullGpsNode fullGpsNode) {
        return new FullGpsNode(diffGpsNode.getTimeDiff(), diffGpsNode.getLng() + fullGpsNode.getLng(), fullGpsNode.getLat() + diffGpsNode.getLat(), diffGpsNode.getType());
    }
}
