package com.mapbox.maps.extension.compose.internal;

import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"applySettings", "", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettingsInterface;", "gesturesSettings", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SettingsUtilsKt {
    public static final void applySettings(GesturesSettingsInterface gesturesSettingsInterface, GesturesSettings gesturesSettings) {
        gesturesSettingsInterface.getClass();
        gesturesSettings.getClass();
        gesturesSettingsInterface.updateSettings(new AnonymousClass1(gesturesSettings));
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.internal.SettingsUtilsKt$applySettings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<GesturesSettings.Builder, Unit> {
        final /* synthetic */ GesturesSettings $gesturesSettings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GesturesSettings gesturesSettings) {
            super(1);
            this.$gesturesSettings = gesturesSettings;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesSettings.Builder builder) {
            builder.getClass();
            builder.m273setRotateEnabled(this.$gesturesSettings.getRotateEnabled());
            builder.m269setPinchToZoomEnabled(this.$gesturesSettings.getPinchToZoomEnabled());
            builder.m275setScrollEnabled(this.$gesturesSettings.getScrollEnabled());
            builder.m277setSimultaneousRotateAndPinchToZoomEnabled(this.$gesturesSettings.getSimultaneousRotateAndPinchToZoomEnabled());
            builder.m270setPitchEnabled(this.$gesturesSettings.getPitchEnabled());
            builder.m276setScrollMode(this.$gesturesSettings.getScrollMode());
            builder.m262setDoubleTapToZoomInEnabled(this.$gesturesSettings.getDoubleTapToZoomInEnabled());
            builder.m263setDoubleTouchToZoomOutEnabled(this.$gesturesSettings.getDoubleTouchToZoomOutEnabled());
            builder.m271setQuickZoomEnabled(this.$gesturesSettings.getQuickZoomEnabled());
            builder.m264setFocalPoint(this.$gesturesSettings.getFocalPoint());
            builder.m268setPinchToZoomDecelerationEnabled(this.$gesturesSettings.getPinchToZoomDecelerationEnabled());
            builder.m272setRotateDecelerationEnabled(this.$gesturesSettings.getRotateDecelerationEnabled());
            builder.m274setScrollDecelerationEnabled(this.$gesturesSettings.getScrollDecelerationEnabled());
            builder.m266setIncreaseRotateThresholdWhenPinchingToZoom(this.$gesturesSettings.getIncreaseRotateThresholdWhenPinchingToZoom());
            builder.m265setIncreasePinchToZoomThresholdWhenRotating(this.$gesturesSettings.getIncreasePinchToZoomThresholdWhenRotating());
            builder.m278setZoomAnimationAmount(this.$gesturesSettings.getZoomAnimationAmount());
            builder.m267setPinchScrollEnabled(this.$gesturesSettings.getPinchScrollEnabled());
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesSettings.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }
}
