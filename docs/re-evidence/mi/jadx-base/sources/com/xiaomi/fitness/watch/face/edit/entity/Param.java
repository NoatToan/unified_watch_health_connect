package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/Param;", "", "offsetX", "", "offsetY", "value", "", "<init>", "(FFLjava/lang/String;)V", "getOffsetX", "()F", "getOffsetY", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Param {
    private final float offsetX;
    private final float offsetY;

    @Nullable
    private final String value;

    public Param() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public static /* synthetic */ Param copy$default(Param param, float f, float f2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = param.offsetX;
        }
        if ((i & 2) != 0) {
            f2 = param.offsetY;
        }
        if ((i & 4) != 0) {
            str = param.value;
        }
        return param.copy(f, f2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getOffsetX() {
        return this.offsetX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getOffsetY() {
        return this.offsetY;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final Param copy(float offsetX, float offsetY, @Nullable String value) {
        return new Param(offsetX, offsetY, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Param)) {
            return false;
        }
        Param param = (Param) other;
        return Float.compare(this.offsetX, param.offsetX) == 0 && Float.compare(this.offsetY, param.offsetY) == 0 && Intrinsics.areEqual(this.value, param.value);
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.offsetX) * 31) + Float.hashCode(this.offsetY)) * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "Param(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", value=" + this.value + ")";
    }

    public Param(float f, float f2, @Nullable String str) {
        this.offsetX = f;
        this.offsetY = f2;
        this.value = str;
    }

    public /* synthetic */ Param(float f, float f2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? null : str);
    }
}
