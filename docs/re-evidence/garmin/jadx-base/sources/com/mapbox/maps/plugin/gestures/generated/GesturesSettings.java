package com.mapbox.maps.plugin.gestures.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import d53.n;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001<B\u0091\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020.HÖ\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u00020.H\u0016J\u0006\u00103\u001a\u000204J\b\u00105\u001a\u000206H\u0016J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020.HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006="}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "Landroid/os/Parcelable;", "rotateEnabled", "", "pinchToZoomEnabled", "scrollEnabled", "simultaneousRotateAndPinchToZoomEnabled", "pitchEnabled", "scrollMode", "Lcom/mapbox/maps/plugin/ScrollMode;", "doubleTapToZoomInEnabled", "doubleTouchToZoomOutEnabled", "quickZoomEnabled", "focalPoint", "Lcom/mapbox/maps/ScreenCoordinate;", "pinchToZoomDecelerationEnabled", "rotateDecelerationEnabled", "scrollDecelerationEnabled", "increaseRotateThresholdWhenPinchingToZoom", "increasePinchToZoomThresholdWhenRotating", "zoomAnimationAmount", "", "pinchScrollEnabled", "(ZZZZZLcom/mapbox/maps/plugin/ScrollMode;ZZZLcom/mapbox/maps/ScreenCoordinate;ZZZZZFZ)V", "getDoubleTapToZoomInEnabled", "()Z", "getDoubleTouchToZoomOutEnabled", "getFocalPoint", "()Lcom/mapbox/maps/ScreenCoordinate;", "getIncreasePinchToZoomThresholdWhenRotating", "getIncreaseRotateThresholdWhenPinchingToZoom", "getPinchScrollEnabled", "getPinchToZoomDecelerationEnabled", "getPinchToZoomEnabled", "getPitchEnabled", "getQuickZoomEnabled", "getRotateDecelerationEnabled", "getRotateEnabled", "getScrollDecelerationEnabled", "getScrollEnabled", "getScrollMode", "()Lcom/mapbox/maps/plugin/ScrollMode;", "getSimultaneousRotateAndPinchToZoomEnabled", "getZoomAnimationAmount", "()F", "describeContents", "", "equals", "other", "", "hashCode", "toBuilder", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GesturesSettings implements Parcelable {
    public static final Parcelable.Creator<GesturesSettings> CREATOR = new Creator();
    private final boolean doubleTapToZoomInEnabled;
    private final boolean doubleTouchToZoomOutEnabled;
    private final ScreenCoordinate focalPoint;
    private final boolean increasePinchToZoomThresholdWhenRotating;
    private final boolean increaseRotateThresholdWhenPinchingToZoom;
    private final boolean pinchScrollEnabled;
    private final boolean pinchToZoomDecelerationEnabled;
    private final boolean pinchToZoomEnabled;
    private final boolean pitchEnabled;
    private final boolean quickZoomEnabled;
    private final boolean rotateDecelerationEnabled;
    private final boolean rotateEnabled;
    private final boolean scrollDecelerationEnabled;
    private final boolean scrollEnabled;
    private final ScrollMode scrollMode;
    private final boolean simultaneousRotateAndPinchToZoomEnabled;
    private final float zoomAnimationAmount;

    private GesturesSettings(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, ScrollMode scrollMode, boolean z19, boolean z24, boolean z25, ScreenCoordinate screenCoordinate, boolean z26, boolean z27, boolean z28, boolean z29, boolean z34, float f14, boolean z35) {
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

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!GesturesSettings.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        GesturesSettings gesturesSettings = (GesturesSettings) other;
        return this.rotateEnabled == gesturesSettings.rotateEnabled && this.pinchToZoomEnabled == gesturesSettings.pinchToZoomEnabled && this.scrollEnabled == gesturesSettings.scrollEnabled && this.simultaneousRotateAndPinchToZoomEnabled == gesturesSettings.simultaneousRotateAndPinchToZoomEnabled && this.pitchEnabled == gesturesSettings.pitchEnabled && this.scrollMode == gesturesSettings.scrollMode && this.doubleTapToZoomInEnabled == gesturesSettings.doubleTapToZoomInEnabled && this.doubleTouchToZoomOutEnabled == gesturesSettings.doubleTouchToZoomOutEnabled && this.quickZoomEnabled == gesturesSettings.quickZoomEnabled && s.g(this.focalPoint, gesturesSettings.focalPoint) && this.pinchToZoomDecelerationEnabled == gesturesSettings.pinchToZoomDecelerationEnabled && this.rotateDecelerationEnabled == gesturesSettings.rotateDecelerationEnabled && this.scrollDecelerationEnabled == gesturesSettings.scrollDecelerationEnabled && this.increaseRotateThresholdWhenPinchingToZoom == gesturesSettings.increaseRotateThresholdWhenPinchingToZoom && this.increasePinchToZoomThresholdWhenRotating == gesturesSettings.increasePinchToZoomThresholdWhenRotating && Float.compare(this.zoomAnimationAmount, gesturesSettings.zoomAnimationAmount) == 0 && this.pinchScrollEnabled == gesturesSettings.pinchScrollEnabled;
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

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.rotateEnabled), Boolean.valueOf(this.pinchToZoomEnabled), Boolean.valueOf(this.scrollEnabled), Boolean.valueOf(this.simultaneousRotateAndPinchToZoomEnabled), Boolean.valueOf(this.pitchEnabled), this.scrollMode, Boolean.valueOf(this.doubleTapToZoomInEnabled), Boolean.valueOf(this.doubleTouchToZoomOutEnabled), Boolean.valueOf(this.quickZoomEnabled), this.focalPoint, Boolean.valueOf(this.pinchToZoomDecelerationEnabled), Boolean.valueOf(this.rotateDecelerationEnabled), Boolean.valueOf(this.scrollDecelerationEnabled), Boolean.valueOf(this.increaseRotateThresholdWhenPinchingToZoom), Boolean.valueOf(this.increasePinchToZoomThresholdWhenRotating), Float.valueOf(this.zoomAnimationAmount), Boolean.valueOf(this.pinchScrollEnabled));
    }

    public final Builder toBuilder() {
        return new Builder().setRotateEnabled(this.rotateEnabled).setPinchToZoomEnabled(this.pinchToZoomEnabled).setScrollEnabled(this.scrollEnabled).setSimultaneousRotateAndPinchToZoomEnabled(this.simultaneousRotateAndPinchToZoomEnabled).setPitchEnabled(this.pitchEnabled).setScrollMode(this.scrollMode).setDoubleTapToZoomInEnabled(this.doubleTapToZoomInEnabled).setDoubleTouchToZoomOutEnabled(this.doubleTouchToZoomOutEnabled).setQuickZoomEnabled(this.quickZoomEnabled).setFocalPoint(this.focalPoint).setPinchToZoomDecelerationEnabled(this.pinchToZoomDecelerationEnabled).setRotateDecelerationEnabled(this.rotateDecelerationEnabled).setScrollDecelerationEnabled(this.scrollDecelerationEnabled).setIncreaseRotateThresholdWhenPinchingToZoom(this.increaseRotateThresholdWhenPinchingToZoom).setIncreasePinchToZoomThresholdWhenRotating(this.increasePinchToZoomThresholdWhenRotating).setZoomAnimationAmount(this.zoomAnimationAmount).setPinchScrollEnabled(this.pinchScrollEnabled);
    }

    public String toString() {
        return n.c("GesturesSettings(rotateEnabled=" + this.rotateEnabled + ",\n      pinchToZoomEnabled=" + this.pinchToZoomEnabled + ", scrollEnabled=" + this.scrollEnabled + ",\n      simultaneousRotateAndPinchToZoomEnabled=" + this.simultaneousRotateAndPinchToZoomEnabled + ",\n      pitchEnabled=" + this.pitchEnabled + ", scrollMode=" + this.scrollMode + ",\n      doubleTapToZoomInEnabled=" + this.doubleTapToZoomInEnabled + ",\n      doubleTouchToZoomOutEnabled=" + this.doubleTouchToZoomOutEnabled + ", quickZoomEnabled=" + this.quickZoomEnabled + ",\n      focalPoint=" + this.focalPoint + ", pinchToZoomDecelerationEnabled=" + this.pinchToZoomDecelerationEnabled + ",\n      rotateDecelerationEnabled=" + this.rotateDecelerationEnabled + ",\n      scrollDecelerationEnabled=" + this.scrollDecelerationEnabled + ",\n      increaseRotateThresholdWhenPinchingToZoom=" + this.increaseRotateThresholdWhenPinchingToZoom + ",\n      increasePinchToZoomThresholdWhenRotating=" + this.increasePinchToZoomThresholdWhenRotating + ",\n      zoomAnimationAmount=" + this.zoomAnimationAmount + ",\n      pinchScrollEnabled=" + this.pinchScrollEnabled + CoreConstants.RIGHT_PARENTHESIS_CHAR);
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010C\u001a\u00020DJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0004J\u000e\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0004J\u000e\u00103\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0004J\u000e\u00108\u001a\u00020\u00002\u0006\u00105\u001a\u000204J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0004J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR$\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR$\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR$\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR$\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR$\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR$\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR$\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR$\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR$\u00105\u001a\u0002042\u0006\u0010\u0003\u001a\u000204@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR$\u0010>\u001a\u00020=2\u0006\u0010\u0003\u001a\u00020=@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "", "()V", "<set-?>", "", "doubleTapToZoomInEnabled", "getDoubleTapToZoomInEnabled", "()Z", "setDoubleTapToZoomInEnabled", "(Z)V", "doubleTouchToZoomOutEnabled", "getDoubleTouchToZoomOutEnabled", "setDoubleTouchToZoomOutEnabled", "Lcom/mapbox/maps/ScreenCoordinate;", "focalPoint", "getFocalPoint", "()Lcom/mapbox/maps/ScreenCoordinate;", "setFocalPoint", "(Lcom/mapbox/maps/ScreenCoordinate;)V", "increasePinchToZoomThresholdWhenRotating", "getIncreasePinchToZoomThresholdWhenRotating", "setIncreasePinchToZoomThresholdWhenRotating", "increaseRotateThresholdWhenPinchingToZoom", "getIncreaseRotateThresholdWhenPinchingToZoom", "setIncreaseRotateThresholdWhenPinchingToZoom", "pinchScrollEnabled", "getPinchScrollEnabled", "setPinchScrollEnabled", "pinchToZoomDecelerationEnabled", "getPinchToZoomDecelerationEnabled", "setPinchToZoomDecelerationEnabled", "pinchToZoomEnabled", "getPinchToZoomEnabled", "setPinchToZoomEnabled", "pitchEnabled", "getPitchEnabled", "setPitchEnabled", "quickZoomEnabled", "getQuickZoomEnabled", "setQuickZoomEnabled", "rotateDecelerationEnabled", "getRotateDecelerationEnabled", "setRotateDecelerationEnabled", "rotateEnabled", "getRotateEnabled", "setRotateEnabled", "scrollDecelerationEnabled", "getScrollDecelerationEnabled", "setScrollDecelerationEnabled", "scrollEnabled", "getScrollEnabled", "setScrollEnabled", "Lcom/mapbox/maps/plugin/ScrollMode;", "scrollMode", "getScrollMode", "()Lcom/mapbox/maps/plugin/ScrollMode;", "setScrollMode", "(Lcom/mapbox/maps/plugin/ScrollMode;)V", "simultaneousRotateAndPinchToZoomEnabled", "getSimultaneousRotateAndPinchToZoomEnabled", "setSimultaneousRotateAndPinchToZoomEnabled", "", "zoomAnimationAmount", "getZoomAnimationAmount", "()F", "setZoomAnimationAmount", "(F)V", "build", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private ScreenCoordinate focalPoint;
        private boolean rotateEnabled = true;
        private boolean pinchToZoomEnabled = true;
        private boolean scrollEnabled = true;
        private boolean simultaneousRotateAndPinchToZoomEnabled = true;
        private boolean pitchEnabled = true;
        private ScrollMode scrollMode = ScrollMode.HORIZONTAL_AND_VERTICAL;
        private boolean doubleTapToZoomInEnabled = true;
        private boolean doubleTouchToZoomOutEnabled = true;
        private boolean quickZoomEnabled = true;
        private boolean pinchToZoomDecelerationEnabled = true;
        private boolean rotateDecelerationEnabled = true;
        private boolean scrollDecelerationEnabled = true;
        private boolean increaseRotateThresholdWhenPinchingToZoom = true;
        private boolean increasePinchToZoomThresholdWhenRotating = true;
        private float zoomAnimationAmount = 1.0f;
        private boolean pinchScrollEnabled = true;

        public final GesturesSettings build() {
            return new GesturesSettings(this.rotateEnabled, this.pinchToZoomEnabled, this.scrollEnabled, this.simultaneousRotateAndPinchToZoomEnabled, this.pitchEnabled, this.scrollMode, this.doubleTapToZoomInEnabled, this.doubleTouchToZoomOutEnabled, this.quickZoomEnabled, this.focalPoint, this.pinchToZoomDecelerationEnabled, this.rotateDecelerationEnabled, this.scrollDecelerationEnabled, this.increaseRotateThresholdWhenPinchingToZoom, this.increasePinchToZoomThresholdWhenRotating, this.zoomAnimationAmount, this.pinchScrollEnabled, null);
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

        /* JADX INFO: renamed from: setDoubleTapToZoomInEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m262setDoubleTapToZoomInEnabled(boolean z14) {
            this.doubleTapToZoomInEnabled = z14;
        }

        /* JADX INFO: renamed from: setDoubleTouchToZoomOutEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m263setDoubleTouchToZoomOutEnabled(boolean z14) {
            this.doubleTouchToZoomOutEnabled = z14;
        }

        /* JADX INFO: renamed from: setFocalPoint, reason: collision with other method in class */
        public final /* synthetic */ void m264setFocalPoint(ScreenCoordinate screenCoordinate) {
            this.focalPoint = screenCoordinate;
        }

        /* JADX INFO: renamed from: setIncreasePinchToZoomThresholdWhenRotating, reason: collision with other method in class */
        public final /* synthetic */ void m265setIncreasePinchToZoomThresholdWhenRotating(boolean z14) {
            this.increasePinchToZoomThresholdWhenRotating = z14;
        }

        /* JADX INFO: renamed from: setIncreaseRotateThresholdWhenPinchingToZoom, reason: collision with other method in class */
        public final /* synthetic */ void m266setIncreaseRotateThresholdWhenPinchingToZoom(boolean z14) {
            this.increaseRotateThresholdWhenPinchingToZoom = z14;
        }

        /* JADX INFO: renamed from: setPinchScrollEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m267setPinchScrollEnabled(boolean z14) {
            this.pinchScrollEnabled = z14;
        }

        /* JADX INFO: renamed from: setPinchToZoomDecelerationEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m268setPinchToZoomDecelerationEnabled(boolean z14) {
            this.pinchToZoomDecelerationEnabled = z14;
        }

        /* JADX INFO: renamed from: setPinchToZoomEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m269setPinchToZoomEnabled(boolean z14) {
            this.pinchToZoomEnabled = z14;
        }

        /* JADX INFO: renamed from: setPitchEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m270setPitchEnabled(boolean z14) {
            this.pitchEnabled = z14;
        }

        /* JADX INFO: renamed from: setQuickZoomEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m271setQuickZoomEnabled(boolean z14) {
            this.quickZoomEnabled = z14;
        }

        /* JADX INFO: renamed from: setRotateDecelerationEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m272setRotateDecelerationEnabled(boolean z14) {
            this.rotateDecelerationEnabled = z14;
        }

        /* JADX INFO: renamed from: setRotateEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m273setRotateEnabled(boolean z14) {
            this.rotateEnabled = z14;
        }

        /* JADX INFO: renamed from: setScrollDecelerationEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m274setScrollDecelerationEnabled(boolean z14) {
            this.scrollDecelerationEnabled = z14;
        }

        /* JADX INFO: renamed from: setScrollEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m275setScrollEnabled(boolean z14) {
            this.scrollEnabled = z14;
        }

        /* JADX INFO: renamed from: setScrollMode, reason: collision with other method in class */
        public final /* synthetic */ void m276setScrollMode(ScrollMode scrollMode) {
            scrollMode.getClass();
            this.scrollMode = scrollMode;
        }

        /* JADX INFO: renamed from: setSimultaneousRotateAndPinchToZoomEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m277setSimultaneousRotateAndPinchToZoomEnabled(boolean z14) {
            this.simultaneousRotateAndPinchToZoomEnabled = z14;
        }

        /* JADX INFO: renamed from: setZoomAnimationAmount, reason: collision with other method in class */
        public final /* synthetic */ void m278setZoomAnimationAmount(float f14) {
            this.zoomAnimationAmount = f14;
        }

        public final Builder setDoubleTapToZoomInEnabled(boolean doubleTapToZoomInEnabled) {
            this.doubleTapToZoomInEnabled = doubleTapToZoomInEnabled;
            return this;
        }

        public final Builder setDoubleTouchToZoomOutEnabled(boolean doubleTouchToZoomOutEnabled) {
            this.doubleTouchToZoomOutEnabled = doubleTouchToZoomOutEnabled;
            return this;
        }

        public final Builder setFocalPoint(ScreenCoordinate focalPoint) {
            this.focalPoint = focalPoint;
            return this;
        }

        public final Builder setIncreasePinchToZoomThresholdWhenRotating(boolean increasePinchToZoomThresholdWhenRotating) {
            this.increasePinchToZoomThresholdWhenRotating = increasePinchToZoomThresholdWhenRotating;
            return this;
        }

        public final Builder setIncreaseRotateThresholdWhenPinchingToZoom(boolean increaseRotateThresholdWhenPinchingToZoom) {
            this.increaseRotateThresholdWhenPinchingToZoom = increaseRotateThresholdWhenPinchingToZoom;
            return this;
        }

        public final Builder setPinchScrollEnabled(boolean pinchScrollEnabled) {
            this.pinchScrollEnabled = pinchScrollEnabled;
            return this;
        }

        public final Builder setPinchToZoomDecelerationEnabled(boolean pinchToZoomDecelerationEnabled) {
            this.pinchToZoomDecelerationEnabled = pinchToZoomDecelerationEnabled;
            return this;
        }

        public final Builder setPinchToZoomEnabled(boolean pinchToZoomEnabled) {
            this.pinchToZoomEnabled = pinchToZoomEnabled;
            return this;
        }

        public final Builder setPitchEnabled(boolean pitchEnabled) {
            this.pitchEnabled = pitchEnabled;
            return this;
        }

        public final Builder setQuickZoomEnabled(boolean quickZoomEnabled) {
            this.quickZoomEnabled = quickZoomEnabled;
            return this;
        }

        public final Builder setRotateDecelerationEnabled(boolean rotateDecelerationEnabled) {
            this.rotateDecelerationEnabled = rotateDecelerationEnabled;
            return this;
        }

        public final Builder setRotateEnabled(boolean rotateEnabled) {
            this.rotateEnabled = rotateEnabled;
            return this;
        }

        public final Builder setScrollDecelerationEnabled(boolean scrollDecelerationEnabled) {
            this.scrollDecelerationEnabled = scrollDecelerationEnabled;
            return this;
        }

        public final Builder setScrollEnabled(boolean scrollEnabled) {
            this.scrollEnabled = scrollEnabled;
            return this;
        }

        public final Builder setSimultaneousRotateAndPinchToZoomEnabled(boolean simultaneousRotateAndPinchToZoomEnabled) {
            this.simultaneousRotateAndPinchToZoomEnabled = simultaneousRotateAndPinchToZoomEnabled;
            return this;
        }

        public final Builder setZoomAnimationAmount(float zoomAnimationAmount) {
            this.zoomAnimationAmount = zoomAnimationAmount;
            return this;
        }

        public final Builder setScrollMode(ScrollMode scrollMode) {
            scrollMode.getClass();
            this.scrollMode = scrollMode;
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GesturesSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GesturesSettings createFromParcel(Parcel parcel) {
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
            return new GesturesSettings(z25, z19, z24, z19, z24, scrollModeValueOf, z24, z15, z24, screenCoordinate, z24, z17, z24, z16, z24, parcel.readFloat(), parcel.readInt() == 0 ? z18 : true, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GesturesSettings[] newArray(int i14) {
            return new GesturesSettings[i14];
        }
    }

    public /* synthetic */ GesturesSettings(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, ScrollMode scrollMode, boolean z19, boolean z24, boolean z25, ScreenCoordinate screenCoordinate, boolean z26, boolean z27, boolean z28, boolean z29, boolean z34, float f14, boolean z35, j jVar) {
        this(z14, z15, z16, z17, z18, scrollMode, z19, z24, z25, screenCoordinate, z26, z27, z28, z29, z34, f14, z35);
    }
}
