package com.xiaomi.fitness.common.recycer.expandable;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/expandable/HeaderItem;", "", "expandStatus", "", "headerTimeMillis", "", "headerFormat", "", "showArrow", "<init>", "(ZJLjava/lang/String;Z)V", "getExpandStatus", "()Z", "setExpandStatus", "(Z)V", "getHeaderTimeMillis", "()J", "setHeaderTimeMillis", "(J)V", "getHeaderFormat", "()Ljava/lang/String;", "setHeaderFormat", "(Ljava/lang/String;)V", "getShowArrow", "setShowArrow", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeaderItem {
    private boolean expandStatus;

    @NotNull
    private String headerFormat;
    private long headerTimeMillis;
    private boolean showArrow;

    public HeaderItem(boolean z, long j, @NotNull String headerFormat, boolean z2) {
        Intrinsics.checkNotNullParameter(headerFormat, "headerFormat");
        this.expandStatus = z;
        this.headerTimeMillis = j;
        this.headerFormat = headerFormat;
        this.showArrow = z2;
    }

    public final boolean getExpandStatus() {
        return this.expandStatus;
    }

    @NotNull
    public final String getHeaderFormat() {
        return this.headerFormat;
    }

    public final long getHeaderTimeMillis() {
        return this.headerTimeMillis;
    }

    public final boolean getShowArrow() {
        return this.showArrow;
    }

    public final void setExpandStatus(boolean z) {
        this.expandStatus = z;
    }

    public final void setHeaderFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headerFormat = str;
    }

    public final void setHeaderTimeMillis(long j) {
        this.headerTimeMillis = j;
    }

    public final void setShowArrow(boolean z) {
        this.showArrow = z;
    }

    public /* synthetic */ HeaderItem(boolean z, long j, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, str, (i & 8) != 0 ? true : z2);
    }
}
