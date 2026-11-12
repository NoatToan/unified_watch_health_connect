package com.huami.moving.ui.event;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/moving/ui/event/EventHeatMapRadioButton;", "", "", "a", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "type", "<init>", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class EventHeatMapRadioButton {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Integer type;

    public EventHeatMapRadioButton(@Nullable Integer num) {
        this.type = num;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
