package com.xiaomi.hm.health.ui.sportfitness.event;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/event/EventChoosedMap;", "", "", "a", "Ljava/lang/Integer;", "getMapType", "()Ljava/lang/Integer;", "mapType", "type", "<init>", "(I)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EventChoosedMap {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Integer mapType;

    public EventChoosedMap(int i) {
        this.mapType = Integer.valueOf(i);
    }

    @Nullable
    public final Integer getMapType() {
        return this.mapType;
    }
}
