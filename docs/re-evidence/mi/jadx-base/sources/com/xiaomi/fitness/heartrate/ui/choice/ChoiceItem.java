package com.xiaomi.fitness.heartrate.ui.choice;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/choice/ChoiceItem;", "", "titleId", "", "summaryId", "mType", "<init>", "(III)V", "type", "checked", "", "(IIIZ)V", "getTitleId", "()I", "setTitleId", "(I)V", "getSummaryId", "setSummaryId", "getMType", "setMType", "getChecked", "()Z", "setChecked", "(Z)V", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChoiceItem {
    private boolean checked;
    private int mType;
    private int summaryId;
    private int titleId;

    public ChoiceItem(int i, int i2, int i3) {
        this.titleId = i;
        this.summaryId = i2;
        this.mType = i3;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getSummaryId() {
        return this.summaryId;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setSummaryId(int i) {
        this.summaryId = i;
    }

    public final void setTitleId(int i) {
        this.titleId = i;
    }

    public ChoiceItem(int i, int i2, int i3, boolean z) {
        this(i, i2, i3);
        this.checked = z;
    }
}
