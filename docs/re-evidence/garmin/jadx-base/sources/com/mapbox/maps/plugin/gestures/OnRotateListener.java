package com.mapbox.maps.plugin.gestures;

import com.mapbox.android.gestures.RotateGestureDetector;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/OnRotateListener;", "", "onRotate", "", "detector", "Lcom/mapbox/android/gestures/RotateGestureDetector;", "onRotateBegin", "onRotateEnd", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface OnRotateListener {
    void onRotate(RotateGestureDetector detector);

    void onRotateBegin(RotateGestureDetector detector);

    void onRotateEnd(RotateGestureDetector detector);
}
