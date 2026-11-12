package com.mapbox.maps.plugin.logo.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.logo.R;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/logo/generated/LogoAttributeParser;", "", "()V", "parseLogoSettings", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "plugin-logo_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LogoAttributeParser {
    public static final LogoAttributeParser INSTANCE = new LogoAttributeParser();

    private LogoAttributeParser() {
    }

    public static /* synthetic */ LogoSettings parseLogoSettings$default(LogoAttributeParser logoAttributeParser, Context context, AttributeSet attributeSet, float f14, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            f14 = 1.0f;
        }
        return logoAttributeParser.parseLogoSettings(context, attributeSet, f14);
    }

    public final LogoSettings parseLogoSettings(Context context, AttributeSet attrs, float pixelRatio) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            return LogoSettingsKt.LogoSettings(new AnonymousClass1(typedArrayObtainStyledAttributes, pixelRatio));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.logo.generated.LogoAttributeParser$parseLogoSettings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettings$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<LogoSettings.Builder, Unit> {
        final /* synthetic */ float $pixelRatio;
        final /* synthetic */ TypedArray $typedArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TypedArray typedArray, float f14) {
            super(1);
            this.$typedArray = typedArray;
            this.$pixelRatio = f14;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LogoSettings.Builder builder) {
            builder.getClass();
            builder.m292setEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_logoEnabled, true));
            builder.m297setPosition(this.$typedArray.getInt(R.styleable.mapbox_MapView_mapbox_logoGravity, 8388691));
            builder.m294setMarginLeft(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_logoMarginLeft, this.$pixelRatio * 4.0f));
            builder.m296setMarginTop(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_logoMarginTop, this.$pixelRatio * 4.0f));
            builder.m295setMarginRight(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_logoMarginRight, this.$pixelRatio * 4.0f));
            builder.m293setMarginBottom(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_logoMarginBottom, this.$pixelRatio * 4.0f));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(LogoSettings.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }
}
