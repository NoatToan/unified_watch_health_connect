package com.huami.treadmill.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/treadmill/data/InProgress;", "", "", "total", LogUtil.I, "getTotal", "()I", "setTotal", "(I)V", "progress", "getProgress", "setProgress", "<init>", "(II)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class InProgress {
    private int progress;
    private int total;

    /* JADX WARN: Illegal instructions before constructor call */
    public InProgress() {
        int i = 0;
        this(i, i, 3, null);
    }

    public InProgress(int i, int i2) {
        this.total = i;
        this.progress = i2;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    public /* synthetic */ InProgress(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
