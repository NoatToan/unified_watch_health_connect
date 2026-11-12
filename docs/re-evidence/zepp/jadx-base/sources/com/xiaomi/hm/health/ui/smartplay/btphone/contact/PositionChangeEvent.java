package com.xiaomi.hm.health.ui.smartplay.btphone.contact;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/PositionChangeEvent;", "", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/PositionChangeType;", "component1", "", "component2", "component3", "type", "originPos", "toPos", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/PositionChangeType;", "getType", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/PositionChangeType;", "b", LogUtil.I, "getOriginPos", "()I", "c", "getToPos", "<init>", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/PositionChangeType;II)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PositionChangeEvent {
    public static final int INVALID_POS = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final PositionChangeType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int originPos;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int toPos;

    public PositionChangeEvent(@NotNull PositionChangeType positionChangeType, int i, int i2) {
        this.type = positionChangeType;
        this.originPos = i;
        this.toPos = i2;
    }

    public static /* synthetic */ PositionChangeEvent copy$default(PositionChangeEvent positionChangeEvent, PositionChangeType positionChangeType, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            positionChangeType = positionChangeEvent.type;
        }
        if ((i3 & 2) != 0) {
            i = positionChangeEvent.originPos;
        }
        if ((i3 & 4) != 0) {
            i2 = positionChangeEvent.toPos;
        }
        return positionChangeEvent.copy(positionChangeType, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PositionChangeType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOriginPos() {
        return this.originPos;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getToPos() {
        return this.toPos;
    }

    @NotNull
    public final PositionChangeEvent copy(@NotNull PositionChangeType type, int originPos, int toPos) {
        return new PositionChangeEvent(type, originPos, toPos);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionChangeEvent)) {
            return false;
        }
        PositionChangeEvent positionChangeEvent = (PositionChangeEvent) other;
        return this.type == positionChangeEvent.type && this.originPos == positionChangeEvent.originPos && this.toPos == positionChangeEvent.toPos;
    }

    public final int getOriginPos() {
        return this.originPos;
    }

    public final int getToPos() {
        return this.toPos;
    }

    @NotNull
    public final PositionChangeType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.originPos) * 31) + this.toPos;
    }

    @NotNull
    public String toString() {
        return "PositionChangeEvent(type=" + this.type + ", originPos=" + this.originPos + ", toPos=" + this.toPos + ")";
    }

    public /* synthetic */ PositionChangeEvent(PositionChangeType positionChangeType, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(positionChangeType, i, (i3 & 4) != 0 ? -1 : i2);
    }
}
