package com.mapbox.maps;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.EventsServiceResponseCallback;
import com.mapbox.common.TelemetryUtilsResponseCallback;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.extension.compose.style.atmosphere.AtmosphereStateApplier;
import com.mapbox.maps.extension.compose.style.lights.generated.AmbientLightState;
import com.mapbox.maps.extension.compose.style.lights.generated.DirectionalLightState;
import com.mapbox.maps.extension.compose.style.lights.generated.FlatLightState;
import com.mapbox.maps.extension.compose.style.precipitations.RainStateApplier;
import com.mapbox.maps.extension.compose.style.precipitations.SnowStateApplier;
import com.mapbox.maps.extension.compose.style.terrain.TerrainStateApplier;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import com.nimbusds.jose.JOSEException;
import java.text.ParseException;
import java.util.Locale;
import p3.o0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Expected.Transformer, Expected.Action, EventsServiceResponseCallback, TelemetryUtilsResponseCallback, GeofencingUtilsUserConsentResponseCallback, FeatureStateOperationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54523a;

    public /* synthetic */ p(int i14) {
        this.f54523a = i14;
    }

    public static Value a(String str, String str2) {
        Value value = StyleManager.getStyleLayerPropertyDefaultValue(str, str2).getValue();
        value.getClass();
        return value;
    }

    public static PropertyValue b(StyleTransition styleTransition, String str, StyleTransition styleTransition2) {
        styleTransition.getClass();
        return new PropertyValue(str, styleTransition2);
    }

    public static PropertyValue c(String str, Expression expression, Expression expression2) {
        expression.getClass();
        return new PropertyValue(str, expression2);
    }

    public static Double d(JsonElement jsonElement) {
        String asString = jsonElement.getAsString();
        asString.getClass();
        return Double.valueOf(Double.parseDouble(asString));
    }

    public static Integer e(JsonElement jsonElement, ColorUtils colorUtils) {
        String asString = jsonElement.getAsString();
        asString.getClass();
        return colorUtils.rgbaToColor(asString);
    }

    public static Object f(p3.m mVar, int i14, p3.m.a aVar) {
        mVar.L(i14);
        Object objQ = mVar.q();
        aVar.getClass();
        return objQ;
    }

    public static Object g(o0 o0Var, int i14, int i15, p3.m.a aVar) {
        o0Var.L(i14);
        o0Var.L(i15);
        Object objQ = o0Var.q();
        aVar.getClass();
        return objQ;
    }

    public static String h(Locale locale, String str, Locale locale2, char c14, char c15) {
        locale.getClass();
        String upperCase = str.toUpperCase(locale2);
        upperCase.getClass();
        String strReplace = upperCase.replace(c14, c15);
        strReplace.getClass();
        return strReplace;
    }

    public static /* synthetic */ void i(int i14, String str) throws ParseException {
        throw new ParseException(str, i14);
    }

    public static void j(PointAnnotationManager pointAnnotationManager, String str, Double d14, String str2) {
        pointAnnotationManager.getDataDrivenPropertyDefaultValues().addProperty(str, d14);
        pointAnnotationManager.enableDataDrivenProperty(str2);
    }

    public static void k(Double d14, JsonObject jsonObject, String str) {
        jsonObject.addProperty(str, Double.valueOf(d14.doubleValue()));
    }

    public static void l(Integer num, ColorUtils colorUtils, JsonObject jsonObject, String str) {
        jsonObject.addProperty(str, colorUtils.colorToRgbaString(num.intValue()));
    }

    public static /* synthetic */ void m(Object obj, String str) throws JOSEException {
        throw new JOSEException(str + obj);
    }

    public static /* synthetic */ void n(String str) {
        throw new MapboxStyleException(str);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException(str + obj + obj2);
    }

    public static /* synthetic */ void p(String str) throws JOSEException {
        throw new JOSEException(str);
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        return Snapshotter.cameraForCoordinates$lambda$20((String) obj);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        String str = (String) obj;
        switch (this.f54523a) {
            case 2:
                AtmosphereStateApplier.attachTo$lambda$3(str);
                break;
            case 3:
            default:
                AnimatableModel.updateFeatureState$lambda$1$lambda$0(str);
                break;
            case 4:
                AmbientLightState.UpdateLightProperty$lambda$0(str);
                break;
            case 5:
                DirectionalLightState.UpdateLightProperty$lambda$0(str);
                break;
            case 6:
                FlatLightState.UpdateLightProperty$lambda$0(str);
                break;
            case 7:
                RainStateApplier.attachTo$lambda$3(str);
                break;
            case 8:
                SnowStateApplier.attachTo$lambda$3(str);
                break;
            case 9:
                TerrainStateApplier.attachTo$lambda$5(str);
                break;
        }
    }

    @Override // com.mapbox.common.EventsServiceResponseCallback
    public void run(Expected expected) {
        switch (this.f54523a) {
            case 15:
                MapTelemetryImpl.onAppUserTurnstileEvent$lambda$0(expected);
                break;
            case 16:
                MapTelemetryImpl.sendEvent$lambda$2(expected);
                break;
            case 17:
                MapTelemetryImpl.enableTelemetryCollection$lambda$3(expected);
                break;
            case 24:
                AttributionDialogManagerImpl.showGeofencingConsentDialog$lambda$7(expected);
                break;
            default:
                AnimatableModel.updateFeatureState$lambda$1(expected);
                break;
        }
    }
}
