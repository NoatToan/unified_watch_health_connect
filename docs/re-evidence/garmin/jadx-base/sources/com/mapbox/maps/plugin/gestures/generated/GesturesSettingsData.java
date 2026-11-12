package com.mapbox.maps.plugin.gestures.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b?\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0015HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003Jµ\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\t\u0010T\u001a\u00020UHÖ\u0001J\u0013\u0010V\u001a\u00020\u00032\b\u0010W\u001a\u0004\u0018\u00010XHÖ\u0003J\t\u0010Y\u001a\u00020UHÖ\u0001J\t\u0010Z\u001a\u00020[HÖ\u0001J\u0019\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020UHÖ\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\u001bR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006a"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettingsData;", "Landroid/os/Parcelable;", "rotateEnabled", "", "pinchToZoomEnabled", "scrollEnabled", "simultaneousRotateAndPinchToZoomEnabled", "pitchEnabled", "scrollMode", "Lcom/mapbox/maps/plugin/ScrollMode;", "doubleTapToZoomInEnabled", "doubleTouchToZoomOutEnabled", "quickZoomEnabled", "focalPoint", "Lcom/mapbox/maps/ScreenCoordinate;", "pinchToZoomDecelerationEnabled", "rotateDecelerationEnabled", "scrollDecelerationEnabled", "increaseRotateThresholdWhenPinchingToZoom", "increasePinchToZoomThresholdWhenRotating", "zoomAnimationAmount", "", "pinchScrollEnabled", "(ZZZZZLcom/mapbox/maps/plugin/ScrollMode;ZZZLcom/mapbox/maps/ScreenCoordinate;ZZZZZFZ)V", "getDoubleTapToZoomInEnabled", "()Z", "setDoubleTapToZoomInEnabled", "(Z)V", "getDoubleTouchToZoomOutEnabled", "setDoubleTouchToZoomOutEnabled", "getFocalPoint", "()Lcom/mapbox/maps/ScreenCoordinate;", "setFocalPoint", "(Lcom/mapbox/maps/ScreenCoordinate;)V", "getIncreasePinchToZoomThresholdWhenRotating", "setIncreasePinchToZoomThresholdWhenRotating", "getIncreaseRotateThresholdWhenPinchingToZoom", "setIncreaseRotateThresholdWhenPinchingToZoom", "getPinchScrollEnabled", "setPinchScrollEnabled", "getPinchToZoomDecelerationEnabled", "setPinchToZoomDecelerationEnabled", "getPinchToZoomEnabled", "setPinchToZoomEnabled", "getPitchEnabled", "setPitchEnabled", "getQuickZoomEnabled", "setQuickZoomEnabled", "getRotateDecelerationEnabled", "setRotateDecelerationEnabled", "getRotateEnabled", "setRotateEnabled", "getScrollDecelerationEnabled", "setScrollDecelerationEnabled", "getScrollEnabled", "setScrollEnabled", "getScrollMode", "()Lcom/mapbox/maps/plugin/ScrollMode;", "setScrollMode", "(Lcom/mapbox/maps/plugin/ScrollMode;)V", "getSimultaneousRotateAndPinchToZoomEnabled", "setSimultaneousRotateAndPinchToZoomEnabled", "getZoomAnimationAmount", "()F", "setZoomAnimationAmount", "(F)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final /* data */ class GesturesSettingsData implements Parcelable {
    public static final Parcelable.Creator<GesturesSettingsData> CREATOR = new Creator();
    private boolean doubleTapToZoomInEnabled;
    private boolean doubleTouchToZoomOutEnabled;
    private ScreenCoordinate focalPoint;
    private boolean increasePinchToZoomThresholdWhenRotating;
    private boolean increaseRotateThresholdWhenPinchingToZoom;
    private boolean pinchScrollEnabled;
    private boolean pinchToZoomDecelerationEnabled;
    private boolean pinchToZoomEnabled;
    private boolean pitchEnabled;
    private boolean quickZoomEnabled;
    private boolean rotateDecelerationEnabled;
    private boolean rotateEnabled;
    private boolean scrollDecelerationEnabled;
    private boolean scrollEnabled;
    private ScrollMode scrollMode;
    private boolean simultaneousRotateAndPinchToZoomEnabled;
    private float zoomAnimationAmount;

    public /* synthetic */ GesturesSettingsData(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, ScrollMode scrollMode, boolean z19, boolean z24, boolean z25, ScreenCoordinate screenCoordinate, boolean z26, boolean z27, boolean z28, boolean z29, boolean z34, float f14, boolean z35, int i14, j jVar) {
        this(z14, z15, z16, z17, z18, scrollMode, z19, z24, z25, (i14 & 512) != 0 ? null : screenCoordinate, z26, z27, z28, z29, z34, f14, z35);
    }

    public static /* synthetic */ GesturesSettingsData copy$default(GesturesSettingsData gesturesSettingsData, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, ScrollMode scrollMode, boolean z19, boolean z24, boolean z25, ScreenCoordinate screenCoordinate, boolean z26, boolean z27, boolean z28, boolean z29, boolean z34, float f14, boolean z35, int i14, Object obj) {
        boolean z36;
        float f15;
        boolean z37 = (i14 & 1) != 0 ? gesturesSettingsData.rotateEnabled : z14;
        boolean z38 = (i14 & 2) != 0 ? gesturesSettingsData.pinchToZoomEnabled : z15;
        boolean z39 = (i14 & 4) != 0 ? gesturesSettingsData.scrollEnabled : z16;
        boolean z44 = (i14 & 8) != 0 ? gesturesSettingsData.simultaneousRotateAndPinchToZoomEnabled : z17;
        boolean z45 = (i14 & 16) != 0 ? gesturesSettingsData.pitchEnabled : z18;
        ScrollMode scrollMode2 = (i14 & 32) != 0 ? gesturesSettingsData.scrollMode : scrollMode;
        boolean z46 = (i14 & 64) != 0 ? gesturesSettingsData.doubleTapToZoomInEnabled : z19;
        boolean z47 = (i14 & 128) != 0 ? gesturesSettingsData.doubleTouchToZoomOutEnabled : z24;
        boolean z48 = (i14 & 256) != 0 ? gesturesSettingsData.quickZoomEnabled : z25;
        ScreenCoordinate screenCoordinate2 = (i14 & 512) != 0 ? gesturesSettingsData.focalPoint : screenCoordinate;
        boolean z49 = (i14 & 1024) != 0 ? gesturesSettingsData.pinchToZoomDecelerationEnabled : z26;
        boolean z54 = (i14 & 2048) != 0 ? gesturesSettingsData.rotateDecelerationEnabled : z27;
        boolean z55 = (i14 & 4096) != 0 ? gesturesSettingsData.scrollDecelerationEnabled : z28;
        boolean z56 = (i14 & 8192) != 0 ? gesturesSettingsData.increaseRotateThresholdWhenPinchingToZoom : z29;
        boolean z57 = z37;
        boolean z58 = (i14 & 16384) != 0 ? gesturesSettingsData.increasePinchToZoomThresholdWhenRotating : z34;
        float f16 = (i14 & 32768) != 0 ? gesturesSettingsData.zoomAnimationAmount : f14;
        if ((i14 & 65536) != 0) {
            f15 = f16;
            z36 = gesturesSettingsData.pinchScrollEnabled;
        } else {
            z36 = z35;
            f15 = f16;
        }
        return gesturesSettingsData.copy(z57, z38, z39, z44, z45, scrollMode2, z46, z47, z48, screenCoordinate2, z49, z54, z55, z56, z58, f15, z36);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRotateEnabled() {
        return this.rotateEnabled;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ScreenCoordinate getFocalPoint() {
        return this.focalPoint;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getPinchToZoomDecelerationEnabled() {
        return this.pinchToZoomDecelerationEnabled;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getRotateDecelerationEnabled() {
        return this.rotateDecelerationEnabled;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getScrollDecelerationEnabled() {
        return this.scrollDecelerationEnabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIncreaseRotateThresholdWhenPinchingToZoom() {
        return this.increaseRotateThresholdWhenPinchingToZoom;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIncreasePinchToZoomThresholdWhenRotating() {
        return this.increasePinchToZoomThresholdWhenRotating;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getZoomAnimationAmount() {
        return this.zoomAnimationAmount;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getPinchScrollEnabled() {
        return this.pinchScrollEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPinchToZoomEnabled() {
        return this.pinchToZoomEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSimultaneousRotateAndPinchToZoomEnabled() {
        return this.simultaneousRotateAndPinchToZoomEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPitchEnabled() {
        return this.pitchEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ScrollMode getScrollMode() {
        return this.scrollMode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDoubleTapToZoomInEnabled() {
        return this.doubleTapToZoomInEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getDoubleTouchToZoomOutEnabled() {
        return this.doubleTouchToZoomOutEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getQuickZoomEnabled() {
        return this.quickZoomEnabled;
    }

    public final GesturesSettingsData copy(boolean rotateEnabled, boolean pinchToZoomEnabled, boolean scrollEnabled, boolean simultaneousRotateAndPinchToZoomEnabled, boolean pitchEnabled, ScrollMode scrollMode, boolean doubleTapToZoomInEnabled, boolean doubleTouchToZoomOutEnabled, boolean quickZoomEnabled, ScreenCoordinate focalPoint, boolean pinchToZoomDecelerationEnabled, boolean rotateDecelerationEnabled, boolean scrollDecelerationEnabled, boolean increaseRotateThresholdWhenPinchingToZoom, boolean increasePinchToZoomThresholdWhenRotating, float zoomAnimationAmount, boolean pinchScrollEnabled) {
        scrollMode.getClass();
        return new GesturesSettingsData(rotateEnabled, pinchToZoomEnabled, scrollEnabled, simultaneousRotateAndPinchToZoomEnabled, pitchEnabled, scrollMode, doubleTapToZoomInEnabled, doubleTouchToZoomOutEnabled, quickZoomEnabled, focalPoint, pinchToZoomDecelerationEnabled, rotateDecelerationEnabled, scrollDecelerationEnabled, increaseRotateThresholdWhenPinchingToZoom, increasePinchToZoomThresholdWhenRotating, zoomAnimationAmount, pinchScrollEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GesturesSettingsData)) {
            return false;
        }
        GesturesSettingsData gesturesSettingsData = (GesturesSettingsData) other;
        return this.rotateEnabled == gesturesSettingsData.rotateEnabled && this.pinchToZoomEnabled == gesturesSettingsData.pinchToZoomEnabled && this.scrollEnabled == gesturesSettingsData.scrollEnabled && this.simultaneousRotateAndPinchToZoomEnabled == gesturesSettingsData.simultaneousRotateAndPinchToZoomEnabled && this.pitchEnabled == gesturesSettingsData.pitchEnabled && this.scrollMode == gesturesSettingsData.scrollMode && this.doubleTapToZoomInEnabled == gesturesSettingsData.doubleTapToZoomInEnabled && this.doubleTouchToZoomOutEnabled == gesturesSettingsData.doubleTouchToZoomOutEnabled && this.quickZoomEnabled == gesturesSettingsData.quickZoomEnabled && s.g(this.focalPoint, gesturesSettingsData.focalPoint) && this.pinchToZoomDecelerationEnabled == gesturesSettingsData.pinchToZoomDecelerationEnabled && this.rotateDecelerationEnabled == gesturesSettingsData.rotateDecelerationEnabled && this.scrollDecelerationEnabled == gesturesSettingsData.scrollDecelerationEnabled && this.increaseRotateThresholdWhenPinchingToZoom == gesturesSettingsData.increaseRotateThresholdWhenPinchingToZoom && this.increasePinchToZoomThresholdWhenRotating == gesturesSettingsData.increasePinchToZoomThresholdWhenRotating && Float.compare(this.zoomAnimationAmount, gesturesSettingsData.zoomAnimationAmount) == 0 && this.pinchScrollEnabled == gesturesSettingsData.pinchScrollEnabled;
    }

    public final boolean getDoubleTapToZoomInEnabled() {
        return this.doubleTapToZoomInEnabled;
    }

    public final boolean getDoubleTouchToZoomOutEnabled() {
        return this.doubleTouchToZoomOutEnabled;
    }

    public final ScreenCoordinate getFocalPoint() {
        return this.focalPoint;
    }

    public final boolean getIncreasePinchToZoomThresholdWhenRotating() {
        return this.increasePinchToZoomThresholdWhenRotating;
    }

    public final boolean getIncreaseRotateThresholdWhenPinchingToZoom() {
        return this.increaseRotateThresholdWhenPinchingToZoom;
    }

    public final boolean getPinchScrollEnabled() {
        return this.pinchScrollEnabled;
    }

    public final boolean getPinchToZoomDecelerationEnabled() {
        return this.pinchToZoomDecelerationEnabled;
    }

    public final boolean getPinchToZoomEnabled() {
        return this.pinchToZoomEnabled;
    }

    public final boolean getPitchEnabled() {
        return this.pitchEnabled;
    }

    public final boolean getQuickZoomEnabled() {
        return this.quickZoomEnabled;
    }

    public final boolean getRotateDecelerationEnabled() {
        return this.rotateDecelerationEnabled;
    }

    public final boolean getRotateEnabled() {
        return this.rotateEnabled;
    }

    public final boolean getScrollDecelerationEnabled() {
        return this.scrollDecelerationEnabled;
    }

    public final boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    public final ScrollMode getScrollMode() {
        return this.scrollMode;
    }

    public final boolean getSimultaneousRotateAndPinchToZoomEnabled() {
        return this.simultaneousRotateAndPinchToZoomEnabled;
    }

    public final float getZoomAnimationAmount() {
        return this.zoomAnimationAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24, types: [int] */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    public int hashCode() {
        boolean z14 = this.rotateEnabled;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = r14 * 31;
        boolean z15 = this.pinchToZoomEnabled;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i15 = (i14 + r15) * 31;
        boolean z16 = this.scrollEnabled;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i16 = (i15 + r16) * 31;
        boolean z17 = this.simultaneousRotateAndPinchToZoomEnabled;
        ?? r17 = z17;
        if (z17) {
            r17 = 1;
        }
        int i17 = (i16 + r17) * 31;
        boolean z18 = this.pitchEnabled;
        ?? r18 = z18;
        if (z18) {
            r18 = 1;
        }
        int iHashCode = (this.scrollMode.hashCode() + ((i17 + r18) * 31)) * 31;
        boolean z19 = this.doubleTapToZoomInEnabled;
        ?? r19 = z19;
        if (z19) {
            r19 = 1;
        }
        int i18 = (iHashCode + r19) * 31;
        boolean z24 = this.doubleTouchToZoomOutEnabled;
        ?? r24 = z24;
        if (z24) {
            r24 = 1;
        }
        int i19 = (i18 + r24) * 31;
        boolean z25 = this.quickZoomEnabled;
        ?? r25 = z25;
        if (z25) {
            r25 = 1;
        }
        int i24 = (i19 + r25) * 31;
        ScreenCoordinate screenCoordinate = this.focalPoint;
        int iHashCode2 = (i24 + (screenCoordinate == null ? 0 : screenCoordinate.hashCode())) * 31;
        boolean z26 = this.pinchToZoomDecelerationEnabled;
        ?? r26 = z26;
        if (z26) {
            r26 = 1;
        }
        int i25 = (iHashCode2 + r26) * 31;
        boolean z27 = this.rotateDecelerationEnabled;
        ?? r27 = z27;
        if (z27) {
            r27 = 1;
        }
        int i26 = (i25 + r27) * 31;
        boolean z28 = this.scrollDecelerationEnabled;
        ?? r28 = z28;
        if (z28) {
            r28 = 1;
        }
        int i27 = (i26 + r28) * 31;
        boolean z29 = this.increaseRotateThresholdWhenPinchingToZoom;
        ?? r29 = z29;
        if (z29) {
            r29 = 1;
        }
        int i28 = (i27 + r29) * 31;
        boolean z34 = this.increasePinchToZoomThresholdWhenRotating;
        ?? r34 = z34;
        if (z34) {
            r34 = 1;
        }
        int iD = f.d(this.zoomAnimationAmount, (i28 + r34) * 31, 31);
        boolean z35 = this.pinchScrollEnabled;
        return iD + (z35 ? 1 : z35);
    }

    public final void setDoubleTapToZoomInEnabled(boolean z14) {
        this.doubleTapToZoomInEnabled = z14;
    }

    public final void setDoubleTouchToZoomOutEnabled(boolean z14) {
        this.doubleTouchToZoomOutEnabled = z14;
    }

    public final void setFocalPoint(ScreenCoordinate screenCoordinate) {
        this.focalPoint = screenCoordinate;
    }

    public final void setIncreasePinchToZoomThresholdWhenRotating(boolean z14) {
        this.increasePinchToZoomThresholdWhenRotating = z14;
    }

    public final void setIncreaseRotateThresholdWhenPinchingToZoom(boolean z14) {
        this.increaseRotateThresholdWhenPinchingToZoom = z14;
    }

    public final void setPinchScrollEnabled(boolean z14) {
        this.pinchScrollEnabled = z14;
    }

    public final void setPinchToZoomDecelerationEnabled(boolean z14) {
        this.pinchToZoomDecelerationEnabled = z14;
    }

    public final void setPinchToZoomEnabled(boolean z14) {
        this.pinchToZoomEnabled = z14;
    }

    public final void setPitchEnabled(boolean z14) {
        this.pitchEnabled = z14;
    }

    public final void setQuickZoomEnabled(boolean z14) {
        this.quickZoomEnabled = z14;
    }

    public final void setRotateDecelerationEnabled(boolean z14) {
        this.rotateDecelerationEnabled = z14;
    }

    public final void setRotateEnabled(boolean z14) {
        this.rotateEnabled = z14;
    }

    public final void setScrollDecelerationEnabled(boolean z14) {
        this.scrollDecelerationEnabled = z14;
    }

    public final void setScrollEnabled(boolean z14) {
        this.scrollEnabled = z14;
    }

    public final void setScrollMode(ScrollMode scrollMode) {
        scrollMode.getClass();
        this.scrollMode = scrollMode;
    }

    public final void setSimultaneousRotateAndPinchToZoomEnabled(boolean z14) {
        this.simultaneousRotateAndPinchToZoomEnabled = z14;
    }

    public final void setZoomAnimationAmount(float f14) {
        this.zoomAnimationAmount = f14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("GesturesSettingsData(rotateEnabled=");
        sb3.append(this.rotateEnabled);
        sb3.append(", pinchToZoomEnabled=");
        sb3.append(this.pinchToZoomEnabled);
        sb3.append(", scrollEnabled=");
        sb3.append(this.scrollEnabled);
        sb3.append(", simultaneousRotateAndPinchToZoomEnabled=");
        sb3.append(this.simultaneousRotateAndPinchToZoomEnabled);
        sb3.append(", pitchEnabled=");
        sb3.append(this.pitchEnabled);
        sb3.append(", scrollMode=");
        sb3.append(this.scrollMode);
        sb3.append(", doubleTapToZoomInEnabled=");
        sb3.append(this.doubleTapToZoomInEnabled);
        sb3.append(", doubleTouchToZoomOutEnabled=");
        sb3.append(this.doubleTouchToZoomOutEnabled);
        sb3.append(", quickZoomEnabled=");
        sb3.append(this.quickZoomEnabled);
        sb3.append(", focalPoint=");
        sb3.append(this.focalPoint);
        sb3.append(", pinchToZoomDecelerationEnabled=");
        sb3.append(this.pinchToZoomDecelerationEnabled);
        sb3.append(", rotateDecelerationEnabled=");
        sb3.append(this.rotateDecelerationEnabled);
        sb3.append(", scrollDecelerationEnabled=");
        sb3.append(this.scrollDecelerationEnabled);
        sb3.append(", increaseRotateThresholdWhenPinchingToZoom=");
        sb3.append(this.increaseRotateThresholdWhenPinchingToZoom);
        sb3.append(", increasePinchToZoomThresholdWhenRotating=");
        sb3.append(this.increasePinchToZoomThresholdWhenRotating);
        sb3.append(", zoomAnimationAmount=");
        sb3.append(this.zoomAnimationAmount);
        sb3.append(", pinchScrollEnabled=");
        return am.j.t(sb3, this.pinchScrollEnabled, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.rotateEnabled ? 1 : 0);
        parcel.writeInt(this.pinchToZoomEnabled ? 1 : 0);
        parcel.writeInt(this.scrollEnabled ? 1 : 0);
        parcel.writeInt(this.simultaneousRotateAndPinchToZoomEnabled ? 1 : 0);
        parcel.writeInt(this.pitchEnabled ? 1 : 0);
        parcel.writeString(this.scrollMode.name());
        parcel.writeInt(this.doubleTapToZoomInEnabled ? 1 : 0);
        parcel.writeInt(this.doubleTouchToZoomOutEnabled ? 1 : 0);
        parcel.writeInt(this.quickZoomEnabled ? 1 : 0);
        parcel.writeSerializable(this.focalPoint);
        parcel.writeInt(this.pinchToZoomDecelerationEnabled ? 1 : 0);
        parcel.writeInt(this.rotateDecelerationEnabled ? 1 : 0);
        parcel.writeInt(this.scrollDecelerationEnabled ? 1 : 0);
        parcel.writeInt(this.increaseRotateThresholdWhenPinchingToZoom ? 1 : 0);
        parcel.writeInt(this.increasePinchToZoomThresholdWhenRotating ? 1 : 0);
        parcel.writeFloat(this.zoomAnimationAmount);
        parcel.writeInt(this.pinchScrollEnabled ? 1 : 0);
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GesturesSettingsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GesturesSettingsData createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            parcel.getClass();
            boolean z19 = false;
            boolean z24 = true;
            boolean z25 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z19 = true;
            }
            if (parcel.readInt() == 0) {
                z24 = z19;
            }
            if (parcel.readInt() != 0) {
                z19 = z24;
            }
            if (parcel.readInt() == 0) {
                z24 = z19;
            }
            ScrollMode scrollModeValueOf = ScrollMode.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                z24 = z19;
            }
            if (parcel.readInt() != 0) {
                z14 = false;
                z15 = z24;
            } else {
                z14 = z19;
                z15 = z14;
            }
            if (parcel.readInt() == 0) {
                z24 = z14;
            }
            ScreenCoordinate screenCoordinate = (ScreenCoordinate) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                z24 = z14;
            }
            if (parcel.readInt() != 0) {
                z16 = z14;
                z17 = z24;
            } else {
                z16 = z14;
                z17 = z16;
            }
            if (parcel.readInt() == 0) {
                z24 = z16;
            }
            if (parcel.readInt() != 0) {
                z16 = z24;
            }
            if (parcel.readInt() != 0) {
                z18 = z16;
            } else {
                z24 = z16;
                z18 = z24;
            }
            return new GesturesSettingsData(z25, z19, z24, z19, z24, scrollModeValueOf, z24, z15, z24, screenCoordinate, z24, z17, z24, z16, z24, parcel.readFloat(), parcel.readInt() == 0 ? z18 : true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GesturesSettingsData[] newArray(int i14) {
            return new GesturesSettingsData[i14];
        }
    }

    public GesturesSettingsData(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, ScrollMode scrollMode, boolean z19, boolean z24, boolean z25, ScreenCoordinate screenCoordinate, boolean z26, boolean z27, boolean z28, boolean z29, boolean z34, float f14, boolean z35) {
        scrollMode.getClass();
        this.rotateEnabled = z14;
        this.pinchToZoomEnabled = z15;
        this.scrollEnabled = z16;
        this.simultaneousRotateAndPinchToZoomEnabled = z17;
        this.pitchEnabled = z18;
        this.scrollMode = scrollMode;
        this.doubleTapToZoomInEnabled = z19;
        this.doubleTouchToZoomOutEnabled = z24;
        this.quickZoomEnabled = z25;
        this.focalPoint = screenCoordinate;
        this.pinchToZoomDecelerationEnabled = z26;
        this.rotateDecelerationEnabled = z27;
        this.scrollDecelerationEnabled = z28;
        this.increaseRotateThresholdWhenPinchingToZoom = z29;
        this.increasePinchToZoomThresholdWhenRotating = z34;
        this.zoomAnimationAmount = f14;
        this.pinchScrollEnabled = z35;
    }
}
