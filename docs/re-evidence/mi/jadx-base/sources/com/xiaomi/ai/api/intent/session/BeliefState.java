package com.xiaomi.ai.api.intent.session;

import com.xiaomi.ai.api.intent.Slot;
import defpackage.zsd;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class BeliefState {
    private boolean isFocus;
    private Map<String, Slot<zsd>> slots;

    public BeliefState(Map<String, Slot<zsd>> map, boolean z) {
        this.slots = map;
        this.isFocus = z;
    }

    public Map<String, Slot<zsd>> getSlots() {
        return this.slots;
    }

    public boolean isFocus() {
        return this.isFocus;
    }

    public void setFocus(boolean z) {
        this.isFocus = z;
    }

    public void setSlots(Map<String, Slot<zsd>> map) {
        this.slots = map;
    }
}
