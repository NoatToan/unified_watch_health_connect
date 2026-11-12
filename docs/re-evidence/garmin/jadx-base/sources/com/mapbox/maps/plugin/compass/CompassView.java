package com.mapbox.maps.plugin.compass;

import android.graphics.drawable.Drawable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000fH&J0\u0010\u001f\u001a\u00020\u001c2\b\b\u0001\u0010 \u001a\u00020\u00032\b\b\u0001\u0010!\u001a\u00020\u00032\b\b\u0001\u0010\"\u001a\u00020\u00032\b\b\u0001\u0010#\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006$"}, d2 = {"Lcom/mapbox/maps/plugin/compass/CompassView;", "", "compassGravity", "", "getCompassGravity", "()I", "setCompassGravity", "(I)V", "compassImage", "Landroid/graphics/drawable/Drawable;", "getCompassImage", "()Landroid/graphics/drawable/Drawable;", "setCompassImage", "(Landroid/graphics/drawable/Drawable;)V", "compassRotation", "", "getCompassRotation", "()F", "setCompassRotation", "(F)V", "isCompassEnabled", "", "()Z", "setCompassEnabled", "(Z)V", "isCompassVisible", "setCompassVisible", "requestLayout", "", "setCompassAlpha", "float", "setCompassMargins", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CompassView {
    int getCompassGravity();

    Drawable getCompassImage();

    float getCompassRotation();

    boolean isCompassEnabled();

    boolean isCompassVisible();

    void requestLayout();

    void setCompassAlpha(float f14);

    void setCompassEnabled(boolean z14);

    void setCompassGravity(int i14);

    void setCompassImage(Drawable drawable);

    void setCompassMargins(int left, int top, int right, int bottom);

    void setCompassRotation(float f14);

    void setCompassVisible(boolean z14);
}
