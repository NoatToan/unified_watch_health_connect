package ohos.ace.adapter;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes46.dex */
public class AvoidArea {
    public final Rect bottomRect;
    public final Rect leftRect;
    public final Rect rightRect;
    public final Rect topRect;

    public AvoidArea(Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        this.topRect = rect2 == null ? new Rect() : rect2;
        this.rightRect = rect3 == null ? new Rect() : rect3;
        this.bottomRect = rect4 == null ? new Rect() : rect4;
        this.leftRect = rect == null ? new Rect() : rect;
    }

    public boolean isEqualTo(AvoidArea avoidArea) {
        return avoidArea != null && this.topRect.equals(avoidArea.topRect) && this.rightRect.equals(avoidArea.rightRect) && this.bottomRect.equals(avoidArea.bottomRect) && this.leftRect.equals(avoidArea.leftRect);
    }
}
