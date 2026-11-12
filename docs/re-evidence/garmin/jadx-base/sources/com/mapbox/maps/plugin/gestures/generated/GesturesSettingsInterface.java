package com.mapbox.maps.plugin.gestures.generated;

import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import e23.l;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0019\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u001c\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\"\u001a\u00020\u001d8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010%\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001c\u0010(\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\u001c\u0010+\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001e\u00101\u001a\u0004\u0018\u00010,8&@&X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00104\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u001c\u00107\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR\u001c\u0010:\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u0010\r\"\u0004\b9\u0010\u000fR\"\u0010?\u001a\u00020\u000b8&@&X§\u000e¢\u0006\u0012\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000fR\u001c\u0010B\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010\r\"\u0004\bA\u0010\u000fR\u001c\u0010H\u001a\u00020C8&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010K\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010\r\"\u0004\bJ\u0010\u000f¨\u0006L"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettingsInterface;", "", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "", "block", "updateSettings", "(Le23/l;)V", "", "getRotateEnabled", "()Z", "setRotateEnabled", "(Z)V", "rotateEnabled", "getPinchToZoomEnabled", "setPinchToZoomEnabled", "pinchToZoomEnabled", "getScrollEnabled", "setScrollEnabled", "scrollEnabled", "getSimultaneousRotateAndPinchToZoomEnabled", "setSimultaneousRotateAndPinchToZoomEnabled", "simultaneousRotateAndPinchToZoomEnabled", "getPitchEnabled", "setPitchEnabled", "pitchEnabled", "Lcom/mapbox/maps/plugin/ScrollMode;", "getScrollMode", "()Lcom/mapbox/maps/plugin/ScrollMode;", "setScrollMode", "(Lcom/mapbox/maps/plugin/ScrollMode;)V", "scrollMode", "getDoubleTapToZoomInEnabled", "setDoubleTapToZoomInEnabled", "doubleTapToZoomInEnabled", "getDoubleTouchToZoomOutEnabled", "setDoubleTouchToZoomOutEnabled", "doubleTouchToZoomOutEnabled", "getQuickZoomEnabled", "setQuickZoomEnabled", "quickZoomEnabled", "Lcom/mapbox/maps/ScreenCoordinate;", "getFocalPoint", "()Lcom/mapbox/maps/ScreenCoordinate;", "setFocalPoint", "(Lcom/mapbox/maps/ScreenCoordinate;)V", "focalPoint", "getPinchToZoomDecelerationEnabled", "setPinchToZoomDecelerationEnabled", "pinchToZoomDecelerationEnabled", "getRotateDecelerationEnabled", "setRotateDecelerationEnabled", "rotateDecelerationEnabled", "getScrollDecelerationEnabled", "setScrollDecelerationEnabled", "scrollDecelerationEnabled", "getIncreaseRotateThresholdWhenPinchingToZoom", "setIncreaseRotateThresholdWhenPinchingToZoom", "getIncreaseRotateThresholdWhenPinchingToZoom$annotations", "()V", "increaseRotateThresholdWhenPinchingToZoom", "getIncreasePinchToZoomThresholdWhenRotating", "setIncreasePinchToZoomThresholdWhenRotating", "increasePinchToZoomThresholdWhenRotating", "", "getZoomAnimationAmount", "()F", "setZoomAnimationAmount", "(F)V", "zoomAnimationAmount", "getPinchScrollEnabled", "setPinchScrollEnabled", "pinchScrollEnabled", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface GesturesSettingsInterface {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        @e
        public static /* synthetic */ void getIncreaseRotateThresholdWhenPinchingToZoom$annotations() {
        }
    }

    boolean getDoubleTapToZoomInEnabled();

    boolean getDoubleTouchToZoomOutEnabled();

    ScreenCoordinate getFocalPoint();

    boolean getIncreasePinchToZoomThresholdWhenRotating();

    boolean getIncreaseRotateThresholdWhenPinchingToZoom();

    boolean getPinchScrollEnabled();

    boolean getPinchToZoomDecelerationEnabled();

    boolean getPinchToZoomEnabled();

    boolean getPitchEnabled();

    boolean getQuickZoomEnabled();

    boolean getRotateDecelerationEnabled();

    boolean getRotateEnabled();

    boolean getScrollDecelerationEnabled();

    boolean getScrollEnabled();

    ScrollMode getScrollMode();

    GesturesSettings getSettings();

    boolean getSimultaneousRotateAndPinchToZoomEnabled();

    float getZoomAnimationAmount();

    void setDoubleTapToZoomInEnabled(boolean z14);

    void setDoubleTouchToZoomOutEnabled(boolean z14);

    void setFocalPoint(ScreenCoordinate screenCoordinate);

    void setIncreasePinchToZoomThresholdWhenRotating(boolean z14);

    void setIncreaseRotateThresholdWhenPinchingToZoom(boolean z14);

    void setPinchScrollEnabled(boolean z14);

    void setPinchToZoomDecelerationEnabled(boolean z14);

    void setPinchToZoomEnabled(boolean z14);

    void setPitchEnabled(boolean z14);

    void setQuickZoomEnabled(boolean z14);

    void setRotateDecelerationEnabled(boolean z14);

    void setRotateEnabled(boolean z14);

    void setScrollDecelerationEnabled(boolean z14);

    void setScrollEnabled(boolean z14);

    void setScrollMode(ScrollMode scrollMode);

    void setSimultaneousRotateAndPinchToZoomEnabled(boolean z14);

    void setZoomAnimationAmount(float f14);

    void updateSettings(l<? super GesturesSettings.Builder, Unit> block);
}
