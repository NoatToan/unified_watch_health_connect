package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingFavorite;", "", "", "toString", "", "component1", "component2", "left", "right", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getLeft", "()I", "b", "getRight", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HearingFavorite {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int right;

    public HearingFavorite(int i, int i2) {
        this.left = i;
        this.right = i2;
    }

    public static /* synthetic */ HearingFavorite copy$default(HearingFavorite hearingFavorite, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hearingFavorite.left;
        }
        if ((i3 & 2) != 0) {
            i2 = hearingFavorite.right;
        }
        return hearingFavorite.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    @NotNull
    public final HearingFavorite copy(int left, int right) {
        return new HearingFavorite(left, right);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingFavorite)) {
            return false;
        }
        HearingFavorite hearingFavorite = (HearingFavorite) other;
        return this.left == hearingFavorite.left && this.right == hearingFavorite.right;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public int hashCode() {
        return (this.left * 31) + this.right;
    }

    @NotNull
    public String toString() {
        return "HearingFavorite{left=" + this.left + ", right=" + this.right + '}';
    }
}
