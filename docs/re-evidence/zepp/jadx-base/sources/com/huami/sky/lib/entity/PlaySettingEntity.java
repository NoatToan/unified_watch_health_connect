package com.huami.sky.lib.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/lib/entity/PlaySettingEntity;", "", "", "component1", "", "component2", "smartStopEnable", "minutesToPlay", "copy", "", "toString", "hashCode", "other", "equals", "Z", "getSmartStopEnable", "()Z", "setSmartStopEnable", "(Z)V", LogUtil.I, "getMinutesToPlay", "()I", "setMinutesToPlay", "(I)V", "<init>", "(ZI)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PlaySettingEntity {
    private int minutesToPlay;
    private boolean smartStopEnable;

    public PlaySettingEntity(boolean z, int i) {
        this.smartStopEnable = z;
        this.minutesToPlay = i;
    }

    public static /* synthetic */ PlaySettingEntity copy$default(PlaySettingEntity playSettingEntity, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = playSettingEntity.smartStopEnable;
        }
        if ((i2 & 2) != 0) {
            i = playSettingEntity.minutesToPlay;
        }
        return playSettingEntity.copy(z, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSmartStopEnable() {
        return this.smartStopEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinutesToPlay() {
        return this.minutesToPlay;
    }

    @NotNull
    public final PlaySettingEntity copy(boolean smartStopEnable, int minutesToPlay) {
        return new PlaySettingEntity(smartStopEnable, minutesToPlay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaySettingEntity)) {
            return false;
        }
        PlaySettingEntity playSettingEntity = (PlaySettingEntity) other;
        return this.smartStopEnable == playSettingEntity.smartStopEnable && this.minutesToPlay == playSettingEntity.minutesToPlay;
    }

    public final int getMinutesToPlay() {
        return this.minutesToPlay;
    }

    public final boolean getSmartStopEnable() {
        return this.smartStopEnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.smartStopEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.minutesToPlay;
    }

    public final void setMinutesToPlay(int i) {
        this.minutesToPlay = i;
    }

    public final void setSmartStopEnable(boolean z) {
        this.smartStopEnable = z;
    }

    @NotNull
    public String toString() {
        return "PlaySettingEntity(smartStopEnable=" + this.smartStopEnable + ", minutesToPlay=" + this.minutesToPlay + ")";
    }
}
