package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/Layout;", "", "ref", "", "x", "", "y", "parameter", "<init>", "(Ljava/lang/String;FFLjava/lang/String;)V", "getRef", "()Ljava/lang/String;", "getX", "()F", "getY", "getParameter", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Layout {

    @Nullable
    private final String parameter;

    @Nullable
    private final String ref;
    private final float x;
    private final float y;

    public Layout() {
        this(null, 0.0f, 0.0f, null, 15, null);
    }

    public static /* synthetic */ Layout copy$default(Layout layout, String str, float f, float f2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = layout.ref;
        }
        if ((i & 2) != 0) {
            f = layout.x;
        }
        if ((i & 4) != 0) {
            f2 = layout.y;
        }
        if ((i & 8) != 0) {
            str2 = layout.parameter;
        }
        return layout.copy(str, f, f2, str2);
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getParameter() {
        return this.parameter;
    }

    @NotNull
    public final Layout copy(@Nullable String ref, float x, float y, @Nullable String parameter) {
        return new Layout(ref, x, y, parameter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Layout)) {
            return false;
        }
        Layout layout = (Layout) other;
        return Intrinsics.areEqual(this.ref, layout.ref) && Float.compare(this.x, layout.x) == 0 && Float.compare(this.y, layout.y) == 0 && Intrinsics.areEqual(this.parameter, layout.parameter);
    }

    @Nullable
    public final String getParameter() {
        return this.parameter;
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
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31;
        String str2 = this.parameter;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Layout(ref=" + this.ref + ", x=" + this.x + ", y=" + this.y + ", parameter=" + this.parameter + ")";
    }

    public Layout(@Nullable String str, float f, float f2, @Nullable String str2) {
        this.ref = str;
        this.x = f;
        this.y = f2;
        this.parameter = str2;
    }

    public /* synthetic */ Layout(String str, float f, float f2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? null : str2);
    }
}
