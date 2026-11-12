package com.huami.moving.ui.event;

import com.huami.moving.ui.sport.detail.segment.dialog.StrengthTrainEditResult;

/* JADX INFO: loaded from: classes3.dex */
public class SegmentEditItemSaveEvent {
    private final StrengthTrainEditResult a;
    private final int b;

    public SegmentEditItemSaveEvent(StrengthTrainEditResult strengthTrainEditResult, int i) {
        this.a = strengthTrainEditResult;
        this.b = i;
    }

    public StrengthTrainEditResult getEditResult() {
        return this.a;
    }

    public int getModifyType() {
        return this.b;
    }
}
