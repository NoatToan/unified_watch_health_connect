package com.huami.watch.companion.location;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J$\u0010\u0018\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010'\u001a\u00020\u00128\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/huami/watch/companion/location/SystemSingleLocationService;", "Lcom/huami/watch/companion/location/LocationService;", "Landroid/location/LocationListener;", "Lcom/huami/watch/companion/location/LocationOption;", "opt", "", "optionLocationService", "Lcom/huami/watch/companion/location/LocationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerLocationListener", "startLocation", "stopLocation", "cancelLocation", "Lcom/huami/watch/companion/location/Location;", "getLastLocation", "Landroid/location/Location;", "loc", "onLocationChanged", "", "provider", "", "status", "Landroid/os/Bundle;", "extras", "onStatusChanged", "onProviderEnabled", "onProviderDisabled", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/location/LocationManager;", "b", "Landroid/location/LocationManager;", "locManager", "c", "Ljava/lang/String;", "getLocProvider", "()Ljava/lang/String;", "locProvider", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/companion/location/LocationListener;", "mLocListener", "<init>", "(Landroid/content/Context;)V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class SystemSingleLocationService implements LocationService, android.location.LocationListener {

    @NotNull
    private static final String e = "SystemSingleLocationService";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final android.location.LocationManager locManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String locProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private LocationListener mLocListener;

    public SystemSingleLocationService(@NotNull Context context) {
        this.context = context;
        Object systemService = context.getSystemService("location");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.locManager = (android.location.LocationManager) systemService;
        this.locProvider = "gps";
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void cancelLocation() {
    }

    @Override // com.huami.watch.companion.location.LocationService
    @Nullable
    public Location getLastLocation() {
        Object objM3845constructorimpl;
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") != 0 && ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(this.locManager.getLastKnownLocation(getLocProvider()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        android.location.Location location = (android.location.Location) objM3845constructorimpl;
        if (location == null) {
            return null;
        }
        Location location2 = new Location();
        location2.setLatitude(location.getLatitude());
        location2.setLongitude(location.getLongitude());
        if (location.hasAltitude()) {
            location2.setHasAltitude(true);
            location2.setAltitude(location.getAltitude());
        }
        return location2;
    }

    @NotNull
    public final String getLocProvider() {
        return this.locProvider;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(@NotNull android.location.Location loc) {
        Location.Address address;
        IOException e2;
        Log.d(e, "Time : " + loc.getTime(), new Object[0]);
        Log.d(e, "Latitude : " + loc.getLatitude(), new Object[0]);
        Log.d(e, "Longitude : " + loc.getLongitude(), new Object[0]);
        Location.Address address2 = null;
        try {
            List<Address> fromLocation = new Geocoder(this.context).getFromLocation(loc.getLatitude(), loc.getLongitude(), 1);
            Log.d(e, "Address : " + fromLocation, new Object[0]);
            if (fromLocation != null && fromLocation.size() > 0) {
                Address address3 = fromLocation.get(0);
                address = new Location.Address();
                try {
                    address.setCountry(address3.getCountryName());
                    address.setCountryCode(address3.getCountryCode());
                    address.setAdmin(address3.getAdminArea());
                    address.setSubAdmin(address3.getSubAdminArea());
                    address.setLocality(address3.getLocality());
                    address.setSubLocality(address3.getSubLocality());
                    address.setThoroughfare(address3.getThoroughfare());
                } catch (IOException e3) {
                    e2 = e3;
                    e2.printStackTrace();
                }
                address2 = address;
            }
        } catch (IOException e4) {
            address = null;
            e2 = e4;
        }
        if (this.mLocListener != null) {
            Location location = new Location();
            location.setLatitude(loc.getLatitude());
            location.setLongitude(loc.getLongitude());
            if (loc.hasAltitude()) {
                location.setHasAltitude(true);
                location.setAltitude(loc.getAltitude());
            }
            if (address2 != null) {
                location.setAddress(address2);
            }
            LocationListener locationListener = this.mLocListener;
            if (locationListener == null) {
                return;
            }
            locationListener.onLocationReceived(location);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(@NotNull String provider) {
        System.out.println((Object) ("on provider diable:" + provider));
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(@NotNull String provider) {
        System.out.println((Object) ("on provider enable:" + provider));
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(@Nullable String provider, int status, @Nullable Bundle extras) {
        System.out.println((Object) ("On state changed:" + provider + "," + status + "," + extras));
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void optionLocationService(@Nullable LocationOption opt) {
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void registerLocationListener(@Nullable LocationListener listener) {
        this.mLocListener = listener;
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void startLocation() {
        Log.d(e, "Start Location!!", new Object[0]);
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.locManager.requestSingleUpdate(this.locProvider, this, (Looper) null);
            Log.d(e, "Last Loc : " + this.locManager.getLastKnownLocation(this.locProvider), new Object[0]);
        }
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void stopLocation() {
        Log.d(e, "Stop Location!!", new Object[0]);
        this.locManager.removeUpdates(this);
    }
}
