package com.xiaomi.fitness.watch.face.edit.photo.crop;

import android.view.ScaleGestureDetector;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/crop/OnPortraitScaleListener;", "", "onScale", "", "scaleFactor", "", "detector", "Landroid/view/ScaleGestureDetector;", "onMove", "distanceX", "distanceY", "onchangeEnd", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OnPortraitScaleListener {
    void onMove(float distanceX, float distanceY);

    void onScale(float scaleFactor, @NotNull ScaleGestureDetector detector);

    void onchangeEnd();
}
