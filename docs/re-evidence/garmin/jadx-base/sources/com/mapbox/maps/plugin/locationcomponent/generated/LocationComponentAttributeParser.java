package com.mapbox.maps.plugin.locationcomponent.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.LocationPuck3D;
import com.mapbox.maps.plugin.ModelElevationReference;
import com.mapbox.maps.plugin.ModelScaleMode;
import com.mapbox.maps.plugin.PuckBearing;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentUtils;
import com.mapbox.maps.plugin.locationcomponent.R;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import e23.l;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p13.u;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentAttributeParser;", "", "()V", "parseLocationComponentSettings", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationComponentAttributeParser {
    public static final LocationComponentAttributeParser INSTANCE = new LocationComponentAttributeParser();

    private LocationComponentAttributeParser() {
    }

    public static /* synthetic */ LocationComponentSettings parseLocationComponentSettings$default(LocationComponentAttributeParser locationComponentAttributeParser, Context context, AttributeSet attributeSet, float f14, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            f14 = 1.0f;
        }
        return locationComponentAttributeParser.parseLocationComponentSettings(context, attributeSet, f14);
    }

    public final LocationComponentSettings parseLocationComponentSettings(Context context, AttributeSet attrs, float pixelRatio) {
        ImageHolder imageHolderFrom;
        ImageHolder imageHolderFrom2;
        LocationPuck locationPuck2D;
        List listI0;
        List listI1;
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_locationComponentPuckBearingEnabled, false);
            int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuck, -1);
            if (i14 == 0) {
                Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck2DTopImage, -1));
                ImageHolder imageHolderFrom3 = null;
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    imageHolderFrom = ImageHolder.INSTANCE.from(numValueOf.intValue());
                } else {
                    imageHolderFrom = null;
                }
                Integer numValueOf2 = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck2DBearingImage, -1));
                if (numValueOf2.intValue() == -1) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    imageHolderFrom2 = ImageHolder.INSTANCE.from(numValueOf2.intValue());
                } else {
                    imageHolderFrom2 = null;
                }
                Integer numValueOf3 = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck2DShadowImage, -1));
                if (numValueOf3.intValue() == -1) {
                    numValueOf3 = null;
                }
                if (numValueOf3 != null) {
                    imageHolderFrom3 = ImageHolder.INSTANCE.from(numValueOf3.intValue());
                }
                locationPuck2D = new LocationPuck2D(imageHolderFrom, imageHolderFrom2, imageHolderFrom3, typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck2DScaleExpression), typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck2DOpacity, 1.0f));
            } else if (i14 != 1) {
                locationPuck2D = LocationComponentUtils.createDefault2DPuck(z14);
            } else {
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelUri);
                if (string == null) {
                    throw new IllegalArgumentException("model-uri must be specified in order to use 3d location puck.");
                }
                List listK = x.k(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DPosition_lon, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DPosition_lat, 0.0f)));
                float f14 = typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelOpacity, 1.0f);
                List listK2 = x.k(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelScale_x, 1.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelScale_y, 1.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelScale_z, 1.0f)));
                String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelScaleExpression);
                List listK3 = x.k(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelTranslation_lon, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelTranslation_lat, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelTranslation_z, 0.0f)));
                List listK4 = x.k(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelRotation_x, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelRotation_y, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelRotation_z, 90.0f)));
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelCastShadows, true);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelReceiveShadows, true);
                ModelScaleMode modelScaleMode = ModelScaleMode.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelScaleMode, ModelScaleMode.VIEWPORT.ordinal())];
                float f15 = typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelEmissiveStrength, 1.0f);
                String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelEmissiveStrengthExpression);
                String string4 = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelOpacityExpression);
                String string5 = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelRotationExpression);
                int color = typedArrayObtainStyledAttributes.getColor(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelColor, Color.parseColor(AnimatableModel.DEFAULT_COLOR));
                String string6 = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelColorExpression);
                float f16 = typedArrayObtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelColorMixIntensity, 0.0f);
                String string7 = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelColorMixIntensityExpression);
                try {
                    String[] stringArray = typedArrayObtainStyledAttributes.getResources().getStringArray(typedArrayObtainStyledAttributes.getResourceId(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DMaterialOverrides, 0));
                    stringArray.getClass();
                    listI0 = u.i0(stringArray);
                } catch (Exception unused) {
                    listI0 = j0.f134944a;
                }
                List list = listI0;
                try {
                    String[] stringArray2 = typedArrayObtainStyledAttributes.getResources().getStringArray(typedArrayObtainStyledAttributes.getResourceId(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DNodeOverrides, 0));
                    stringArray2.getClass();
                    listI1 = u.i0(stringArray2);
                } catch (Exception unused2) {
                    listI1 = j0.f134944a;
                }
                List list2 = listI1;
                ModelElevationReference modelElevationReference = ModelElevationReference.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelElevationReference, ModelElevationReference.GROUND.ordinal())];
                String string8 = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelColorUseTheme);
                if (string8 == null) {
                    string8 = "default";
                }
                locationPuck2D = new LocationPuck3D(string, listK, f14, listK2, string2, listK3, listK4, z15, z16, modelScaleMode, f15, string3, string4, string5, color, string6, f16, string7, list, list2, modelElevationReference, string8, typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLocationPuckLocationPuck3DModelColorUseThemeExpression));
            }
            LocationComponentSettings LocationComponentSettings = LocationComponentSettingsKt.LocationComponentSettings(locationPuck2D, new AnonymousClass7(typedArrayObtainStyledAttributes, pixelRatio, z14));
            typedArrayObtainStyledAttributes.recycle();
            return LocationComponentSettings;
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentAttributeParser$parseLocationComponentSettings$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass7 extends w implements l<LocationComponentSettings.Builder, Unit> {
        final /* synthetic */ float $pixelRatio;
        final /* synthetic */ boolean $puckBearingEnabled;
        final /* synthetic */ TypedArray $typedArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(TypedArray typedArray, float f14, boolean z14) {
            super(1);
            this.$typedArray = typedArray;
            this.$pixelRatio = f14;
            this.$puckBearingEnabled = z14;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LocationComponentSettings.Builder builder) {
            builder.getClass();
            builder.m281setEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_locationComponentEnabled, false));
            builder.m288setPulsingEnabled(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_locationComponentPulsingEnabled, false));
            builder.m287setPulsingColor(this.$typedArray.getColor(R.styleable.mapbox_MapView_mapbox_locationComponentPulsingColor, Color.parseColor("#4A90E2")));
            builder.m289setPulsingMaxRadius(this.$typedArray.getDimension(R.styleable.mapbox_MapView_mapbox_locationComponentPulsingMaxRadius, this.$pixelRatio * 10.0f));
            builder.m290setShowAccuracyRing(this.$typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_locationComponentShowAccuracyRing, false));
            builder.m280setAccuracyRingColor(this.$typedArray.getColor(R.styleable.mapbox_MapView_mapbox_locationComponentAccuracyRingColor, Color.parseColor("#4d89cff0")));
            builder.m279setAccuracyRingBorderColor(this.$typedArray.getColor(R.styleable.mapbox_MapView_mapbox_locationComponentAccuracyRingBorderColor, Color.parseColor("#4d89cff0")));
            builder.m282setLayerAbove(this.$typedArray.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLayerAbove));
            builder.m283setLayerBelow(this.$typedArray.getString(R.styleable.mapbox_MapView_mapbox_locationComponentLayerBelow));
            builder.m286setPuckBearingEnabled(this.$puckBearingEnabled);
            builder.m285setPuckBearing(PuckBearing.values()[this.$typedArray.getInt(R.styleable.mapbox_MapView_mapbox_locationComponentPuckBearing, 0)]);
            builder.m291setSlot(this.$typedArray.getString(R.styleable.mapbox_MapView_mapbox_locationComponentSlot));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(LocationComponentSettings.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }
}
