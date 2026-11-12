package com.xiaomi.fitness.watch.face.edit.slot;

import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseData;
import com.xiaomi.fitness.watch.face.edit.entity.SlotEditItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotListData;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseData;", "type", "", "title", "<init>", "(II)V", "getTitle", "()I", "slotWidgetList", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/SlotEditItem;", "getSlotWidgetList", "()Ljava/util/List;", "setSlotWidgetList", "(Ljava/util/List;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditSlotListData extends FaceEditPickerBaseData {

    @NotNull
    private List<SlotEditItem> slotWidgetList;
    private final int title;

    public FaceEditSlotListData(int i, int i2) {
        super(i, i2);
        this.title = i2;
        this.slotWidgetList = new ArrayList();
    }

    @NotNull
    public final List<SlotEditItem> getSlotWidgetList() {
        return this.slotWidgetList;
    }

    public final int getTitle() {
        return this.title;
    }

    public final void setSlotWidgetList(@NotNull List<SlotEditItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.slotWidgetList = list;
    }
}
