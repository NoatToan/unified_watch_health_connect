package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/RecolorCustom;", "", "recolorEnable", "", "color", "", "<init>", "(ZLjava/lang/String;)V", "getRecolorEnable", "()Z", "setRecolorEnable", "(Z)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecolorCustom {

    @Nullable
    private String color;
    private boolean recolorEnable;

    /* JADX WARN: Multi-variable type inference failed */
    public RecolorCustom() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecolorCustom copy$default(RecolorCustom recolorCustom, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recolorCustom.recolorEnable;
        }
        if ((i & 2) != 0) {
            str = recolorCustom.color;
        }
        return recolorCustom.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRecolorEnable() {
        return this.recolorEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final RecolorCustom copy(boolean recolorEnable, @Nullable String color) {
        return new RecolorCustom(recolorEnable, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecolorCustom)) {
            return false;
        }
        RecolorCustom recolorCustom = (RecolorCustom) other;
        return this.recolorEnable == recolorCustom.recolorEnable && Intrinsics.areEqual(this.color, recolorCustom.color);
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    public final boolean getRecolorEnable() {
        return this.recolorEnable;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.recolorEnable) * 31;
        String str = this.color;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }

    public final void setRecolorEnable(boolean z) {
        this.recolorEnable = z;
    }

    @NotNull
    public String toString() {
        return "RecolorCustom(recolorEnable=" + this.recolorEnable + ", color=" + this.color + ")";
    }

    public RecolorCustom(boolean z, @Nullable String str) {
        this.recolorEnable = z;
        this.color = str;
    }

    public /* synthetic */ RecolorCustom(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }
}
