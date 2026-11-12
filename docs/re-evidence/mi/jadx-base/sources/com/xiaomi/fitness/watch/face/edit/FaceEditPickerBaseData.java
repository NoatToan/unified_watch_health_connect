package com.xiaomi.fitness.watch.face.edit;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseData;", "", "type", "", "title", "<init>", "(II)V", "getType", "()I", "isFirstData", "", "()Z", "setFirstData", "(Z)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FaceEditPickerBaseData {
    private boolean isFirstData;
    private final int type;

    public FaceEditPickerBaseData(int i, int i2) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isFirstData, reason: from getter */
    public final boolean getIsFirstData() {
        return this.isFirstData;
    }

    public final void setFirstData(boolean z) {
        this.isFirstData = z;
    }
}
