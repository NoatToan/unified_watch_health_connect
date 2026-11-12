package com.huami.moving.ui.event;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/moving/ui/event/SportMoreOpenEvent;", "", "", "a", "Z", "getOpen", "()Z", "setOpen", "(Z)V", "open", "<init>", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportMoreOpenEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean open;

    public SportMoreOpenEvent(boolean z) {
        this.open = z;
    }

    public final boolean getOpen() {
        return this.open;
    }

    public final void setOpen(boolean z) {
        this.open = z;
    }
}
