package com.mapbox.maps.plugin.attribution.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.attribution.R;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/generated/AttributionAttributeParser;", "", "()V", "parseAttributionSettings", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "plugin-attribution_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AttributionAttributeParser {
    public static final AttributionAttributeParser INSTANCE = new AttributionAttributeParser();

    private AttributionAttributeParser() {
    }

    public static /* synthetic */ AttributionSettings parseAttributionSettings$default(AttributionAttributeParser attributionAttributeParser, Context context, AttributeSet attributeSet, float f14, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            f14 = 1.0f;
        }
        return attributionAttributeParser.parseAttributionSettings(context, attributeSet, f14);
    }

    public final AttributionSettings parseAttributionSettings(Context context, AttributeSet attrs, float pixelRatio) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            return AttributionSettingsKt.AttributionSettings(new AnonymousClass1(typedArrayObtainStyledAttributes, pixelRatio));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.attribution.generated.AttributionAttributeParser$parseAttributionSettings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<AttributionSettings.Builder, Unit> {
        final /* synthetic */ float $pixelRatio;
        final /* synthetic */ TypedArray $typedArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TypedArray typedArray, float f14) {
            super(1);
            this.$typedArray = typedArray;
            this.$pixelRatio = f14;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AttributionSettings.Builder builder) {
            builder.getClass();
            builder.m243setEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_attributionEnabled, true));
            builder.m244setIconColor(this.$typedArray.getColor(R.styleable.mapbox_MapView_mapbox_attributionIconColor, Color.parseColor("#FF1E8CAB")));
            builder.m249setPosition(this.$typedArray.getInt(R.styleable.mapbox_MapView_mapbox_attributionGravity, 8388691));
            builder.m246setMarginLeft(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_attributionMarginLeft, this.$pixelRatio * 92.0f));
            builder.m248setMarginTop(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_attributionMarginTop, this.$pixelRatio * 4.0f));
            builder.m247setMarginRight(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_attributionMarginRight, this.$pixelRatio * 4.0f));
            builder.m245setMarginBottom(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_attributionMarginBottom, this.$pixelRatio * 4.0f));
            builder.m242setClickable(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_attributionClickable, true));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(AttributionSettings.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }
}
