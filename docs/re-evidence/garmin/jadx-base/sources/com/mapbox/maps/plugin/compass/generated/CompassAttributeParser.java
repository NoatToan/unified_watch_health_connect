package com.mapbox.maps.plugin.compass.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.compass.R;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/compass/generated/CompassAttributeParser;", "", "()V", "parseCompassSettings", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "plugin-compass_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CompassAttributeParser {
    public static final CompassAttributeParser INSTANCE = new CompassAttributeParser();

    private CompassAttributeParser() {
    }

    public static /* synthetic */ CompassSettings parseCompassSettings$default(CompassAttributeParser compassAttributeParser, Context context, AttributeSet attributeSet, float f14, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            f14 = 1.0f;
        }
        return compassAttributeParser.parseCompassSettings(context, attributeSet, f14);
    }

    public final CompassSettings parseCompassSettings(Context context, AttributeSet attrs, float pixelRatio) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            return CompassSettingsKt.CompassSettings(new AnonymousClass1(typedArrayObtainStyledAttributes, pixelRatio));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.compass.generated.CompassAttributeParser$parseCompassSettings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<CompassSettings.Builder, Unit> {
        final /* synthetic */ float $pixelRatio;
        final /* synthetic */ TypedArray $typedArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TypedArray typedArray, float f14) {
            super(1);
            this.$typedArray = typedArray;
            this.$pixelRatio = f14;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CompassSettings.Builder builder) {
            builder.getClass();
            builder.m251setEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_compassEnabled, true));
            builder.m259setPosition(this.$typedArray.getInt(R.styleable.mapbox_MapView_mapbox_compassGravity, 8388661));
            builder.m255setMarginLeft(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_compassMarginLeft, this.$pixelRatio * 4.0f));
            builder.m257setMarginTop(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_compassMarginTop, this.$pixelRatio * 4.0f));
            builder.m256setMarginRight(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_compassMarginRight, this.$pixelRatio * 4.0f));
            builder.m254setMarginBottom(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_compassMarginBottom, this.$pixelRatio * 4.0f));
            builder.m258setOpacity(this.$typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_compassOpacity, 1.0f));
            builder.m260setRotation(this.$typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_compassRotation, 0.0f));
            builder.m261setVisibility(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_compassVisibility, true));
            builder.m252setFadeWhenFacingNorth(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_compassFadeWhenFacingNorth, true));
            builder.m250setClickable(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_compassClickable, true));
            builder.m253setImage(ImageHolder.INSTANCE.from(this.$typedArray.getResourceId(R.styleable.mapbox_MapView_mapbox_compassImage, -1)));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(CompassSettings.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }
}
