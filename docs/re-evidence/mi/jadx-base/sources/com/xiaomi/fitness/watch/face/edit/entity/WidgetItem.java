package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/WidgetItem;", "", "ref", "", "x", "", "y", "<init>", "(Ljava/lang/String;FF)V", "getRef", "()Ljava/lang/String;", "getX", "()F", "getY", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WidgetItem {

    @Nullable
    private final String ref;
    private final float x;
    private final float y;

    public WidgetItem(@Nullable String str, float f, float f2) {
        this.ref = str;
        this.x = f;
        this.y = f2;
    }

    public static /* synthetic */ WidgetItem copy$default(WidgetItem widgetItem, String str, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = widgetItem.ref;
        }
        if ((i & 2) != 0) {
            f = widgetItem.x;
        }
        if ((i & 4) != 0) {
            f2 = widgetItem.y;
        }
        return widgetItem.copy(str, f, f2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @NotNull
    public final WidgetItem copy(@Nullable String ref, float x, float y) {
        return new WidgetItem(ref, x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetItem)) {
            return false;
        }
        WidgetItem widgetItem = (WidgetItem) other;
        return Intrinsics.areEqual(this.ref, widgetItem.ref) && Float.compare(this.x, widgetItem.x) == 0 && Float.compare(this.y, widgetItem.y) == 0;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        String str = this.ref;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y);
    }

    @NotNull
    public String toString() {
        return "WidgetItem(ref=" + this.ref + ", x=" + this.x + ", y=" + this.y + ")";
    }
}
