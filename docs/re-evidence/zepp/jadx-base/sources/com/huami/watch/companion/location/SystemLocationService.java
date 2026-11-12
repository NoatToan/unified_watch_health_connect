package com.huami.watch.companion.location;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SystemLocationService implements LocationService, android.location.LocationListener {
    private static final String f = "SystemLocationService";
    private Context a;
    private android.location.LocationManager b;
    private LocationListener c;
    private String d;
    private int e;

    public SystemLocationService(Context context) {
        this.a = context;
        this.b = (android.location.LocationManager) context.getSystemService("location");
        Log.d(f, "Provider : " + this.b.getAllProviders(), new Object[0]);
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void cancelLocation() {
    }

    @Override // com.huami.watch.companion.location.LocationService
    public Location getLastLocation() {
        return null;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(android.location.Location location) {
        Location.Address address;
        IOException e;
        Log.d(f, "Time : " + location.getTime(), new Object[0]);
        Log.d(f, "Latitude : " + location.getLatitude(), new Object[0]);
        Log.d(f, "Longitude : " + location.getLongitude(), new Object[0]);
        Location.Address address2 = null;
        try {
            List<Address> fromLocation = new Geocoder(this.a).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            Log.d(f, "Address : " + fromLocation, new Object[0]);
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
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                }
                address2 = address;
            }
        } catch (IOException e3) {
            address = null;
            e = e3;
        }
        if (this.c != null) {
            Location location2 = new Location();
            location2.setLatitude(location.getLatitude());
            location2.setLongitude(location.getLongitude());
            if (address2 != null) {
                location2.setAddress(address2);
            }
            this.c.onLocationReceived(location2);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void optionLocationService(LocationOption locationOption) {
        if (LocationOption.LocationMode.HighAccuracy == locationOption.getMode()) {
            this.d = "gps";
        } else if (LocationOption.LocationMode.BatterySave == locationOption.getMode()) {
            this.d = "network";
        } else if (LocationOption.LocationMode.GpsOnly == locationOption.getMode()) {
            this.d = "gps";
        }
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void registerLocationListener(LocationListener locationListener) {
        this.c = locationListener;
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void startLocation() {
        Log.d(f, "Start Location!!", new Object[0]);
        this.b.requestLocationUpdates(this.d, this.e, 15.0f, this);
        Log.d(f, "Last Loc : " + this.b.getLastKnownLocation("network"), new Object[0]);
    }

    @Override // com.huami.watch.companion.location.LocationService
    public void stopLocation() {
        Log.d(f, "Stop Location!!", new Object[0]);
        this.b.removeUpdates(this);
    }
}
