package com.xiaomi.fitness.watch.face.edit.color;

import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseData;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorGroupListData;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseData;", "type", "", "title", "<init>", "(II)V", "getTitle", "()I", "colorGroupList", "", "", "getColorGroupList", "()Ljava/util/List;", "setColorGroupList", "(Ljava/util/List;)V", "selectIndex", "getSelectIndex", "setSelectIndex", "(I)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditColorGroupListData extends FaceEditPickerBaseData {

    @Nullable
    private List<String> colorGroupList;
    private int selectIndex;
    private final int title;

    public FaceEditColorGroupListData(int i, int i2) {
        super(i, i2);
        this.title = i2;
    }

    @Nullable
    public final List<String> getColorGroupList() {
        return this.colorGroupList;
    }

    public final int getSelectIndex() {
        return this.selectIndex;
    }

    public final int getTitle() {
        return this.title;
    }

    public final void setColorGroupList(@Nullable List<String> list) {
        this.colorGroupList = list;
    }

    public final void setSelectIndex(int i) {
        this.selectIndex = i;
    }
}
