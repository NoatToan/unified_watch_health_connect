package com.huami.bluetooth.profile.channel.module.assistant.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/dto/AppCardItemDto;", "", "", "component1", "", "component2", "type", "isEnable", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getType", "()I", "b", "Z", "()Z", "<init>", "(IZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppCardItemDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isEnable;

    public AppCardItemDto(int i, boolean z) {
        this.type = i;
        this.isEnable = z;
    }

    public static /* synthetic */ AppCardItemDto copy$default(AppCardItemDto appCardItemDto, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = appCardItemDto.type;
        }
        if ((i2 & 2) != 0) {
            z = appCardItemDto.isEnable;
        }
        return appCardItemDto.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    @NotNull
    public final AppCardItemDto copy(int type, boolean isEnable) {
        return new AppCardItemDto(type, isEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppCardItemDto)) {
            return false;
        }
        AppCardItemDto appCardItemDto = (AppCardItemDto) other;
        return this.type == appCardItemDto.type && this.isEnable == appCardItemDto.isEnable;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int i = this.type * 31;
        boolean z = this.isEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    @NotNull
    public String toString() {
        return "AppCardItemDto(type=" + this.type + ", isEnable=" + this.isEnable + ')';
    }
}
