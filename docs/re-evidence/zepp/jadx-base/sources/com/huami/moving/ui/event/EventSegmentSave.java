package com.huami.moving.ui.event;

/* JADX INFO: loaded from: classes3.dex */
public class EventSegmentSave {
    private boolean a;

    public EventSegmentSave(boolean z) {
        this.a = false;
        this.a = z;
    }

    public boolean isSaveSuccess() {
        return this.a;
    }
}
