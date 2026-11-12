package com.mapbox.maps.plugin.scalebar.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import com.mapbox.maps.plugin.scalebar.R;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarAttributeParser;", "", "()V", "parseScaleBarSettings", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ScaleBarAttributeParser {
    public static final ScaleBarAttributeParser INSTANCE = new ScaleBarAttributeParser();

    private ScaleBarAttributeParser() {
    }

    public static /* synthetic */ ScaleBarSettings parseScaleBarSettings$default(ScaleBarAttributeParser scaleBarAttributeParser, Context context, AttributeSet attributeSet, float f14, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            f14 = 1.0f;
        }
        return scaleBarAttributeParser.parseScaleBarSettings(context, attributeSet, f14);
    }

    public final ScaleBarSettings parseScaleBarSettings(Context context, AttributeSet attrs, float pixelRatio) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            return ScaleBarSettingsKt.ScaleBarSettings(new AnonymousClass1(typedArrayObtainStyledAttributes, pixelRatio));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.scalebar.generated.ScaleBarAttributeParser$parseScaleBarSettings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<ScaleBarSettings.Builder, Unit> {
        final /* synthetic */ float $pixelRatio;
        final /* synthetic */ TypedArray $typedArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TypedArray typedArray, float f14) {
            super(1);
            this.$typedArray = typedArray;
            this.$pixelRatio = f14;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ScaleBarSettings.Builder builder) {
            builder.getClass();
            builder.m299setEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_scaleBarEnabled, true));
            builder.m305setPosition(this.$typedArray.getInt(R.styleable.mapbox_MapView_mapbox_scaleBarGravity, 8388659));
            builder.m302setMarginLeft(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarMarginLeft, this.$pixelRatio * 4.0f));
            builder.m304setMarginTop(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarMarginTop, this.$pixelRatio * 4.0f));
            builder.m303setMarginRight(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarMarginRight, this.$pixelRatio * 4.0f));
            builder.m301setMarginBottom(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarMarginBottom, this.$pixelRatio * 4.0f));
            builder.m313setTextColor(this.$typedArray.getColor(R.styleable.mapbox_MapView_mapbox_scaleBarTextColor, -16777216));
            builder.m306setPrimaryColor(this.$typedArray.getColor(R.styleable.mapbox_MapView_mapbox_scaleBarPrimaryColor, -16777216));
            builder.m309setSecondaryColor(this.$typedArray.getColor(R.styleable.mapbox_MapView_mapbox_scaleBarSecondaryColor, -1));
            builder.m298setBorderWidth(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarBorderWidth, this.$pixelRatio * 2.0f));
            builder.m300setHeight(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarHeight, this.$pixelRatio * 2.0f));
            builder.m311setTextBarMargin(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarTextBarMargin, this.$pixelRatio * 8.0f));
            builder.m312setTextBorderWidth(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarTextBorderWidth, this.$pixelRatio * 2.0f));
            builder.m314setTextSize(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarTextSize, this.$pixelRatio * 8.0f));
            builder.setMetricUnits(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_scaleBarIsMetricUnits, LocaleUnitResolver.INSTANCE.isMetricSystem()));
            builder.m308setRefreshInterval(this.$typedArray.getInt(R.styleable.mapbox_MapView_mapbox_scaleBarRefreshInterval, 15));
            builder.m310setShowTextBorder(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_scaleBarShowTextBorder, true));
            builder.m307setRatio(this.$typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_scaleBarRatio, 0.5f));
            builder.m315setUseContinuousRendering(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_scaleBarUseContinuousRendering, false));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ScaleBarSettings.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }
}
