package com.huami.sky.ui.intro.preference;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.sky.ui.view.SkyPlayView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\t\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/sky/ui/intro/preference/SelectEntity;", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "component1", "", "component2", "", "component3", "preferenceItem", "isSelected", "playState", "copy", "", "toString", "hashCode", "other", "equals", "a", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "getPreferenceItem", "()Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "b", "Z", "()Z", "setSelected", "(Z)V", "c", LogUtil.I, "getPlayState", "()I", "setPlayState", "(I)V", "<init>", "(Lcom/huami/sky/lib/entity/MusicPreferenceItem;ZI)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SelectEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final MusicPreferenceItem preferenceItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int playState;

    public SelectEntity(@NotNull MusicPreferenceItem musicPreferenceItem, boolean z, @SkyPlayView.PlayState int i) {
        this.preferenceItem = musicPreferenceItem;
        this.isSelected = z;
        this.playState = i;
    }

    public static /* synthetic */ SelectEntity copy$default(SelectEntity selectEntity, MusicPreferenceItem musicPreferenceItem, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            musicPreferenceItem = selectEntity.preferenceItem;
        }
        if ((i2 & 2) != 0) {
            z = selectEntity.isSelected;
        }
        if ((i2 & 4) != 0) {
            i = selectEntity.playState;
        }
        return selectEntity.copy(musicPreferenceItem, z, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MusicPreferenceItem getPreferenceItem() {
        return this.preferenceItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPlayState() {
        return this.playState;
    }

    @NotNull
    public final SelectEntity copy(@NotNull MusicPreferenceItem preferenceItem, boolean isSelected, @SkyPlayView.PlayState int playState) {
        return new SelectEntity(preferenceItem, isSelected, playState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectEntity)) {
            return false;
        }
        SelectEntity selectEntity = (SelectEntity) other;
        return Intrinsics.areEqual(this.preferenceItem, selectEntity.preferenceItem) && this.isSelected == selectEntity.isSelected && this.playState == selectEntity.playState;
    }

    public final int getPlayState() {
        return this.playState;
    }

    @NotNull
    public final MusicPreferenceItem getPreferenceItem() {
        return this.preferenceItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = this.preferenceItem.hashCode() * 31;
        boolean z = this.isSelected;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.playState;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setPlayState(int i) {
        this.playState = i;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @NotNull
    public String toString() {
        return "SelectEntity(preferenceItem=" + this.preferenceItem + ", isSelected=" + this.isSelected + ", playState=" + this.playState + ")";
    }
}
