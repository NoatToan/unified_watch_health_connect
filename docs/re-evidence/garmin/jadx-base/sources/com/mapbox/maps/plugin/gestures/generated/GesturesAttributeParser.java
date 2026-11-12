package com.mapbox.maps.plugin.gestures.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import com.mapbox.maps.plugin.gestures.R;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesAttributeParser;", "", "()V", "parseGesturesSettings", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GesturesAttributeParser {
    public static final GesturesAttributeParser INSTANCE = new GesturesAttributeParser();

    private GesturesAttributeParser() {
    }

    public final GesturesSettings parseGesturesSettings(Context context, AttributeSet attrs) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            return GesturesSettingsKt.GesturesSettings(new AnonymousClass1(typedArrayObtainStyledAttributes));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.generated.GesturesAttributeParser$parseGesturesSettings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<GesturesSettings.Builder, Unit> {
        final /* synthetic */ TypedArray $typedArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TypedArray typedArray) {
            super(1);
            this.$typedArray = typedArray;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x009c  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesSettings.Builder builder) {
            ScreenCoordinate screenCoordinate;
            builder.getClass();
            builder.m273setRotateEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesRotateEnabled, true));
            builder.m269setPinchToZoomEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesPinchToZoomEnabled, true));
            builder.m275setScrollEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesScrollEnabled, true));
            builder.m277setSimultaneousRotateAndPinchToZoomEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesSimultaneousRotateAndPinchToZoomEnabled, true));
            builder.m270setPitchEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesPitchEnabled, true));
            builder.m276setScrollMode(ScrollMode.values()[this.$typedArray.getInt(R.styleable.mapbox_MapView_mapbox_gesturesScrollMode, ScrollMode.HORIZONTAL_AND_VERTICAL.ordinal())]);
            builder.m262setDoubleTapToZoomInEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesDoubleTapToZoomInEnabled, true));
            builder.m263setDoubleTouchToZoomOutEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesDoubleTouchToZoomOutEnabled, true));
            builder.m271setQuickZoomEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesQuickZoomEnabled, true));
            TypedArray typedArray = this.$typedArray;
            int i14 = R.styleable.mapbox_MapView_mapbox_gesturesFocalPointX;
            if (typedArray.hasValue(i14)) {
                TypedArray typedArray2 = this.$typedArray;
                int i15 = R.styleable.mapbox_MapView_mapbox_gesturesFocalPointY;
                if (typedArray2.hasValue(i15)) {
                    screenCoordinate = new ScreenCoordinate(this.$typedArray.getFloat(i14, 0.0f), this.$typedArray.getFloat(i15, 0.0f));
                } else {
                    screenCoordinate = null;
                }
            } else {
                screenCoordinate = null;
            }
            builder.m264setFocalPoint(screenCoordinate);
            builder.m268setPinchToZoomDecelerationEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesPinchToZoomDecelerationEnabled, true));
            builder.m272setRotateDecelerationEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesRotateDecelerationEnabled, true));
            builder.m274setScrollDecelerationEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesScrollDecelerationEnabled, true));
            builder.m266setIncreaseRotateThresholdWhenPinchingToZoom(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesIncreaseRotateThresholdWhenPinchingToZoom, true));
            builder.m265setIncreasePinchToZoomThresholdWhenRotating(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesIncreasePinchToZoomThresholdWhenRotating, true));
            builder.m278setZoomAnimationAmount(this.$typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_gesturesZoomAnimationAmount, 1.0f));
            builder.m267setPinchScrollEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesPinchScrollEnabled, true));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesSettings.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }
}
