package com.xiaomi.fitness.watch.face.edit.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/ui/DecodeBoundItem;", "", "sumWidth", "", "sumHeight", "maxWidth", "maxHeight", "<init>", "(IIII)V", "getSumWidth", "()I", "setSumWidth", "(I)V", "getSumHeight", "setSumHeight", "getMaxWidth", "setMaxWidth", "getMaxHeight", "setMaxHeight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DecodeBoundItem {
    private int maxHeight;
    private int maxWidth;
    private int sumHeight;
    private int sumWidth;

    public DecodeBoundItem() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ DecodeBoundItem copy$default(DecodeBoundItem decodeBoundItem, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = decodeBoundItem.sumWidth;
        }
        if ((i5 & 2) != 0) {
            i2 = decodeBoundItem.sumHeight;
        }
        if ((i5 & 4) != 0) {
            i3 = decodeBoundItem.maxWidth;
        }
        if ((i5 & 8) != 0) {
            i4 = decodeBoundItem.maxHeight;
        }
        return decodeBoundItem.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSumWidth() {
        return this.sumWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSumHeight() {
        return this.sumHeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxWidth() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxHeight() {
        return this.maxHeight;
    }

    @NotNull
    public final DecodeBoundItem copy(int sumWidth, int sumHeight, int maxWidth, int maxHeight) {
        return new DecodeBoundItem(sumWidth, sumHeight, maxWidth, maxHeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecodeBoundItem)) {
            return false;
        }
        DecodeBoundItem decodeBoundItem = (DecodeBoundItem) other;
        return this.sumWidth == decodeBoundItem.sumWidth && this.sumHeight == decodeBoundItem.sumHeight && this.maxWidth == decodeBoundItem.maxWidth && this.maxHeight == decodeBoundItem.maxHeight;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final int getSumHeight() {
        return this.sumHeight;
    }

    public final int getSumWidth() {
        return this.sumWidth;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.sumWidth) * 31) + Integer.hashCode(this.sumHeight)) * 31) + Integer.hashCode(this.maxWidth)) * 31) + Integer.hashCode(this.maxHeight);
    }

    public final void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public final void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public final void setSumHeight(int i) {
        this.sumHeight = i;
    }

    public final void setSumWidth(int i) {
        this.sumWidth = i;
    }

    @NotNull
    public String toString() {
        return "DecodeBoundItem(sumWidth=" + this.sumWidth + ", sumHeight=" + this.sumHeight + ", maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + ")";
    }

    public DecodeBoundItem(int i, int i2, int i3, int i4) {
        this.sumWidth = i;
        this.sumHeight = i2;
        this.maxWidth = i3;
        this.maxHeight = i4;
    }

    public /* synthetic */ DecodeBoundItem(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? -1 : i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? -1 : i4);
    }
}
