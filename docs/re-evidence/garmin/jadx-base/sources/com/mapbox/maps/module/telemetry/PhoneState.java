package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.mapbox.common.TelemetrySystemUtils;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 12\u00020\u0001:\u000212B\u0007\b\u0017¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0003J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u00100\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\t\"\u0004\b-\u0010\u000b¨\u00063"}, d2 = {"Lcom/mapbox/maps/module/telemetry/PhoneState;", "", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "accessibilityFontScale", "", "getAccessibilityFontScale", "()F", "setAccessibilityFontScale", "(F)V", "batteryLevel", "", "getBatteryLevel", "()I", "setBatteryLevel", "(I)V", "carrier", "", "getCarrier", "()Ljava/lang/String;", "setCarrier", "(Ljava/lang/String;)V", "cellularNetworkType", "getCellularNetworkType", "setCellularNetworkType", "created", "getCreated", "setCreated", "isPluggedIn", "", "()Z", "setPluggedIn", "(Z)V", "isWifi", "setWifi", ModelSourceWrapper.ORIENTATION, "Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;", "getOrientation", "()Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;", "setOrientation", "(Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;)V", "resolution", "getResolution", "setResolution", "isConnectedToWifi", "obtainCellularCarrier", "obtainDisplayDensity", "Companion", "Orientation", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PhoneState {
    private static final String NO_CARRIER = "EMPTY_CARRIER";
    private static final int NO_NETWORK = -1;

    @SerializedName("accessibilityFontScale")
    private float accessibilityFontScale;

    @SerializedName("batteryLevel")
    private int batteryLevel;

    @SerializedName("carrier")
    private String carrier;

    @SerializedName("cellularNetworkType")
    private String cellularNetworkType;

    @SerializedName("created")
    private String created;

    @SerializedName("pluggedIn")
    private boolean isPluggedIn;

    @SerializedName("wifi")
    private boolean isWifi;

    @SerializedName(ModelSourceWrapper.ORIENTATION)
    private Orientation orientation;

    @SerializedName("resolution")
    private float resolution;

    public PhoneState(Context context) {
        context.getClass();
        String strObtainCurrentDate = TelemetrySystemUtils.obtainCurrentDate();
        strObtainCurrentDate.getClass();
        this.created = strObtainCurrentDate;
        this.batteryLevel = TelemetrySystemUtils.obtainBatteryLevel(context);
        this.isPluggedIn = TelemetrySystemUtils.isPluggedIn(context);
        this.cellularNetworkType = TelemetrySystemUtils.obtainCellularNetworkType(context);
        this.orientation = Orientation.INSTANCE.getOrientation(context.getResources().getConfiguration().orientation);
        this.accessibilityFontScale = context.getResources().getConfiguration().fontScale;
        this.carrier = obtainCellularCarrier(context);
        this.resolution = obtainDisplayDensity(context);
        this.isWifi = isConnectedToWifi(context);
    }

    @SuppressLint({"MissingPermission"})
    private final boolean isConnectedToWifi(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(1);
        } catch (Exception unused) {
            return false;
        }
    }

    private final String obtainCellularCarrier(Context context) {
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            return NO_CARRIER;
        }
        networkOperatorName.getClass();
        return networkOperatorName;
    }

    private final float obtainDisplayDensity(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public final float getAccessibilityFontScale() {
        return this.accessibilityFontScale;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getCellularNetworkType() {
        return this.cellularNetworkType;
    }

    public final String getCreated() {
        return this.created;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final float getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: isPluggedIn, reason: from getter */
    public final boolean getIsPluggedIn() {
        return this.isPluggedIn;
    }

    /* JADX INFO: renamed from: isWifi, reason: from getter */
    public final boolean getIsWifi() {
        return this.isWifi;
    }

    public final void setAccessibilityFontScale(float f14) {
        this.accessibilityFontScale = f14;
    }

    public final void setBatteryLevel(int i14) {
        this.batteryLevel = i14;
    }

    public final void setCarrier(String str) {
        this.carrier = str;
    }

    public final void setCellularNetworkType(String str) {
        this.cellularNetworkType = str;
    }

    public final void setCreated(String str) {
        str.getClass();
        this.created = str;
    }

    public final void setOrientation(Orientation orientation) {
        orientation.getClass();
        this.orientation = orientation;
    }

    public final void setPluggedIn(boolean z14) {
        this.isPluggedIn = z14;
    }

    public final void setResolution(float f14) {
        this.resolution = f14;
    }

    public final void setWifi(boolean z14) {
        this.isWifi = z14;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;", "", ModelSourceWrapper.ORIENTATION, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getOrientation", "()Ljava/lang/String;", "ORIENTATION_PORTRAIT", "ORIENTATION_LANDSCAPE", "Companion", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Orientation {
        ORIENTATION_PORTRAIT("Portrait"),
        ORIENTATION_LANDSCAPE("Landscape");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String orientation;

        Orientation(String str) {
            this.orientation = str;
        }

        public final String getOrientation() {
            return this.orientation;
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation$Companion;", "", "()V", "getOrientation", "Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;", FirebaseAnalytics.Param.INDEX, "", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final Orientation getOrientation(int index) {
                return 1 == index ? Orientation.ORIENTATION_PORTRAIT : Orientation.ORIENTATION_LANDSCAPE;
            }

            private Companion() {
            }
        }
    }

    public PhoneState() {
        this.created = "2020-07-12";
        this.orientation = Orientation.ORIENTATION_PORTRAIT;
    }
}
