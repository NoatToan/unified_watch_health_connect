package com.xiaomi.fitness.watch.face.edit.entity;

import com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010)\u001a\u00020*H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001a\u0010&\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\t¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DialEditEntity;", "", "<init>", "()V", "recolorIndex", "", "getRecolorIndex", "()I", "setRecolorIndex", "(I)V", "colorGroupIndex", "getColorGroupIndex", "setColorGroupIndex", "positionIndex", "getPositionIndex", "setPositionIndex", "dialSlotEditItem", "Lcom/xiaomi/fitness/watch/face/edit/entity/SlotEditItem;", "getDialSlotEditItem", "()Lcom/xiaomi/fitness/watch/face/edit/entity/SlotEditItem;", "setDialSlotEditItem", "(Lcom/xiaomi/fitness/watch/face/edit/entity/SlotEditItem;)V", "timeSlotEditItem", "getTimeSlotEditItem", "setTimeSlotEditItem", "fontSlotEditItem", "getFontSlotEditItem", "setFontSlotEditItem", "slotItemList", "", "getSlotItemList", "()Ljava/util/List;", "setSlotItemList", "(Ljava/util/List;)V", "textItemList", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "getTextItemList", "setTextItemList", "slotItemEditProcessIndex", "getSlotItemEditProcessIndex", "setSlotItemEditProcessIndex", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialEditEntity {

    @Nullable
    private SlotEditItem dialSlotEditItem;

    @Nullable
    private SlotEditItem fontSlotEditItem;

    @Nullable
    private List<FaceEditLiteralBean> textItemList;

    @Nullable
    private SlotEditItem timeSlotEditItem;
    private int recolorIndex = -1;
    private int colorGroupIndex = -1;
    private int positionIndex = -1;

    @NotNull
    private List<SlotEditItem> slotItemList = new ArrayList();
    private int slotItemEditProcessIndex = -1;

    public final int getColorGroupIndex() {
        return this.colorGroupIndex;
    }

    @Nullable
    public final SlotEditItem getDialSlotEditItem() {
        return this.dialSlotEditItem;
    }

    @Nullable
    public final SlotEditItem getFontSlotEditItem() {
        return this.fontSlotEditItem;
    }

    public final int getPositionIndex() {
        return this.positionIndex;
    }

    public final int getRecolorIndex() {
        return this.recolorIndex;
    }

    public final int getSlotItemEditProcessIndex() {
        return this.slotItemEditProcessIndex;
    }

    @NotNull
    public final List<SlotEditItem> getSlotItemList() {
        return this.slotItemList;
    }

    @Nullable
    public final List<FaceEditLiteralBean> getTextItemList() {
        return this.textItemList;
    }

    @Nullable
    public final SlotEditItem getTimeSlotEditItem() {
        return this.timeSlotEditItem;
    }

    public final void setColorGroupIndex(int i) {
        this.colorGroupIndex = i;
    }

    public final void setDialSlotEditItem(@Nullable SlotEditItem slotEditItem) {
        this.dialSlotEditItem = slotEditItem;
    }

    public final void setFontSlotEditItem(@Nullable SlotEditItem slotEditItem) {
        this.fontSlotEditItem = slotEditItem;
    }

    public final void setPositionIndex(int i) {
        this.positionIndex = i;
    }

    public final void setRecolorIndex(int i) {
        this.recolorIndex = i;
    }

    public final void setSlotItemEditProcessIndex(int i) {
        this.slotItemEditProcessIndex = i;
    }

    public final void setSlotItemList(@NotNull List<SlotEditItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.slotItemList = list;
    }

    public final void setTextItemList(@Nullable List<FaceEditLiteralBean> list) {
        this.textItemList = list;
    }

    public final void setTimeSlotEditItem(@Nullable SlotEditItem slotEditItem) {
        this.timeSlotEditItem = slotEditItem;
    }

    @NotNull
    public String toString() {
        return "DialEditEntity(recolorIndex=" + this.recolorIndex + ", colorGroupIndex=" + this.colorGroupIndex + ", positionIndex=" + this.positionIndex + ", dialSlotEditItem=" + this.dialSlotEditItem + ", timeSlotEditItem=" + this.timeSlotEditItem + ", fontSlotEditItem=" + this.fontSlotEditItem + ", slotItemList=" + this.slotItemList + ", slotItemEditProcessIndex=" + this.slotItemEditProcessIndex + ")";
    }
}
