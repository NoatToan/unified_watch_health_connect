package ohos.ace.plugin.locationserviceplugin;

import android.app.Activity;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Address;
import android.location.Geocoder;
import android.location.GnssStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes46.dex */
public class LocationServicePlugin {
    private static final String ACTION_GEOFENCE = "geofence";
    private static final int ERR_DISABLED = -4;
    private static final int ERR_NO_PERMISSION = 201;
    private static final int ERR_PROVIDER_DISABLED = 2003;
    private static final int ERR_PROVIDER_OUT_OF_SERVICE = 801;
    private static final int ERR_PROVIDER_TEMP_UNAVAILABLE = 2002;
    private static final int FAIL = -1;
    private static final String FENCE_ID = "fence_id";
    private static final int FLAG_MUTABLE = 33554432;
    private static final String LOG_TAG = "LocationServicePlugin";
    private static final int PRIORITY_ACCURACY_BALANCED = 1;
    private static final int PRIORITY_ACCURACY_HIGH = 0;
    private static final int PRIORITY_ACCURACY_LOW = 2;
    private static final int REQUEST_BLUETOOTH_RELATED_PERM = 102;
    private static final int REQUEST_LOCATION_PERMISSION = 1001;
    private static final int SUCCESS = 0;
    private static final long TIMEOUT = 10000;
    private static final int VERSION_CODES_S = 31;
    private BluetoothLeScanner bluetoothLeScanner;
    private Context context;
    private String currentCountryCode;
    private Location currentLocation;
    private BroadcastReceiver geofenceReceiver;
    private GnssStatus.Callback gnssStatusCallback;
    private LocationListener internalLocationListener;
    private BroadcastReceiver localeReceiver;
    private Handler locationHandler;
    private HandlerThread locationHandlerThread;
    private LocationManager locationManager;
    private HandlerThread locationThread;
    private Activity mActivity;
    private OnNmeaMessageListener nmeaListener;
    private volatile boolean geofenceReceiverRegistered = false;
    private volatile boolean locatingStarted = false;
    private volatile boolean pendingGnssStatusRegister = false;
    private final Map<Integer, PendingIntent> geofencePendingIntents = new ConcurrentHashMap();
    private final Map<Integer, Boolean> countryCodeCallbacks = new ConcurrentHashMap();
    private final Map<Integer, Boolean> locationChangeCallbacks = new ConcurrentHashMap();
    private boolean isMonitoring = false;
    private boolean errorListenerRegistered = false;
    private boolean gnssStatusRegistered = false;
    private final Object gnssStatusCbLock = new Object();
    private boolean nmeaRegistered = false;
    private final Object nmeaLock = new Object();
    private boolean countryCodeRegistered = false;
    private final Object countryLock = new Object();
    private int receivedFixCount = 0;
    private final Object geofenceLock = new Object();
    private final CountDownLatch latch = new CountDownLatch(1);
    private final LocationListener statusListener = new LocationListener() { // from class: ohos.ace.plugin.locationserviceplugin.LocationServicePlugin.1
        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            LocationServicePlugin.nativeOnLocationChanged(location.getLatitude(), location.getLongitude(), location.hasAccuracy() ? location.getAccuracy() : 0.0f, location.hasAltitude() ? location.getAltitude() : 0.0d, location.hasSpeed() ? location.getSpeed() : 0.0f, location.hasBearing() ? location.getBearing() : 0.0f, location.getTime(), location.getBearingAccuracyDegrees(), location.getProvider());
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (i == 0) {
                LocationServicePlugin.nativeOnLocationError(801);
            } else if (i == 1) {
                LocationServicePlugin.nativeOnLocationError(2002);
            } else {
                Log.i(LocationServicePlugin.LOG_TAG, "status is available");
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            LocationServicePlugin.nativeOnLocationError(2003);
        }
    };
    private final ScanCallback scanCallback = new ScanCallback() { // from class: ohos.ace.plugin.locationserviceplugin.LocationServicePlugin.2
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            Log.i(LocationServicePlugin.LOG_TAG, "onScanResult called");
            if (scanResult == null) {
                return;
            }
            String name = "";
            String address = scanResult.getDevice() != null ? scanResult.getDevice().getAddress() : "";
            if (scanResult.getDevice() != null && scanResult.getDevice().getName() != null) {
                name = scanResult.getDevice().getName();
            }
            String str = name;
            int rssi = scanResult.getRssi();
            byte[] bytes = (scanResult.getScanRecord() == null || scanResult.getScanRecord().getBytes() == null) ? new byte[0] : scanResult.getScanRecord().getBytes();
            LocationServicePlugin.this.nativeOnBluetoothScanResult(address, str, rssi, bytes, scanResult.isConnectable());
            Log.i(LocationServicePlugin.LOG_TAG, "onScanResult processed");
        }
    };
    private final LocationListener locationListener = new LocationListener() { // from class: ohos.ace.plugin.locationserviceplugin.LocationServicePlugin.3
        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            LocationServicePlugin.nativeOnLocationChanged(location.getLatitude(), location.getLongitude(), location.hasAccuracy() ? location.getAccuracy() : 0.0f, location.hasAltitude() ? location.getAltitude() : 0.0d, location.hasSpeed() ? location.getSpeed() : 0.0f, location.hasBearing() ? location.getBearing() : 0.0f, location.getTime(), location.getBearingAccuracyDegrees(), location.getProvider());
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnBluetoothScanResult(String str, String str2, int i, byte[] bArr, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnCountryCodeChanged(String str, int i);

    private native void nativeOnGeofenceEvent(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnGnssStatusChanged(int i, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, int[] iArr2, int[] iArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnLocationChanged(double d, double d2, float f, double d3, float f2, float f3, long j, float f4, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnLocationError(int i);

    private native void nativeOnNmeaMessage(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnNotificationEvent(int i, boolean z);

    private native void nativeOnSwitchStateChanged(int i);

    protected native void nativeInit();

    public void unregisterSwitchCallback() {
    }

    static /* synthetic */ int access$908(LocationServicePlugin locationServicePlugin) {
        int i = locationServicePlugin.receivedFixCount;
        locationServicePlugin.receivedFixCount = i + 1;
        return i;
    }

    static class CountryResult {
        String code;
        int type;

        CountryResult(int i, String str) {
            this.type = i;
            this.code = str;
        }
    }

    public LocationServicePlugin(Context context) {
        this.context = context;
        init();
    }

    public boolean requestAndCheckLocationPermission() {
        Log.i(LOG_TAG, "Java requestLocationPermission called");
        Activity mainActivity = getMainActivity();
        if (mainActivity == null) {
            Log.e(LOG_TAG, "Java activity is null");
            return false;
        }
        if (mainActivity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0 || mainActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 || mainActivity.checkSelfPermission("android.permission.ACCESS_WIFI_STATE") != 0) {
            return false;
        }
        Log.i(LOG_TAG, "All required permissions are granted");
        return true;
    }

    private void ensureLocationManagerInitialized() {
        synchronized (this) {
            if (this.locationManager == null) {
                this.locationManager = (LocationManager) this.context.getSystemService("location");
            }
        }
    }

    public Location getCurrentLocation() {
        ensureLocationManagerInitialized();
        Location lastKnownLocation = getLastKnownLocation();
        if (lastKnownLocation != null) {
            return lastKnownLocation;
        }
        LocationListener locationListener = new LocationListener() { // from class: ohos.ace.plugin.locationserviceplugin.LocationServicePlugin.4
            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i, Bundle bundle) {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                LocationServicePlugin.this.currentLocation = location;
                LocationServicePlugin.this.latch.countDown();
                LocationServicePlugin.this.stopListener();
            }
        };
        registerListener(locationListener);
        try {
            try {
                this.latch.await(10000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.e(LOG_TAG, "latch await interrupted, no upper logic to handle", e);
            }
            return this.currentLocation;
        } finally {
            stopListener(locationListener);
        }
    }

    private Location getLastKnownLocation() {
        ensureLocationManagerInitialized();
        Location lastKnownLocation = this.locationManager.isProviderEnabled(GeocodeSearch.GPS) ? this.locationManager.getLastKnownLocation(GeocodeSearch.GPS) : null;
        Location lastKnownLocation2 = this.locationManager.isProviderEnabled("network") ? this.locationManager.getLastKnownLocation("network") : null;
        return (lastKnownLocation == null || lastKnownLocation2 == null ? lastKnownLocation == null : lastKnownLocation.getTime() <= lastKnownLocation2.getTime()) ? lastKnownLocation2 : lastKnownLocation;
    }

    private void registerListener(LocationListener locationListener) {
        ensureLocationManagerInitialized();
        if (this.locationManager.isProviderEnabled("network")) {
            this.locationManager.requestLocationUpdates("network", 0L, 0.0f, locationListener);
        }
        if (this.locationManager.isProviderEnabled(GeocodeSearch.GPS)) {
            this.locationManager.requestLocationUpdates(GeocodeSearch.GPS, 0L, 0.0f, locationListener);
        }
    }

    private void stopListener(LocationListener locationListener) {
        ensureLocationManagerInitialized();
        if (locationListener != null) {
            this.locationManager.removeUpdates(locationListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopListener() {
        LocationListener locationListener;
        LocationManager locationManager = this.locationManager;
        if (locationManager == null || (locationListener = this.locationListener) == null) {
            return;
        }
        try {
            locationManager.removeUpdates(locationListener);
        } catch (SecurityException e) {
            Log.e("LocationManager", "SecurityException occurred while removing updates", e);
        }
    }

    public Address[] getAddressByCoordinate(double d, double d2, int i, String str, String str2, String str3) {
        Locale locale;
        String str4;
        String str5;
        ensureLocationManagerInitialized();
        if (str == null || str.isEmpty()) {
            locale = Locale.getDefault();
        } else {
            if (str.contains("_")) {
                String[] strArrSplit = str.split("_", 2);
                str4 = strArrSplit[0];
                str5 = strArrSplit[1];
            } else if (!str.contains(Constants.LINK)) {
                str4 = str;
                str5 = "";
            } else {
                String[] strArrSplit2 = str.split(Constants.LINK, 2);
                str4 = strArrSplit2[0];
                str5 = strArrSplit2[1];
            }
            if (!str5.isEmpty()) {
                locale = new Locale(str4, str5);
            } else {
                locale = new Locale(str4);
            }
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                List<Address> fromLocation = new Geocoder(this.context, locale).getFromLocation(d, d2, i);
                if (fromLocation != null) {
                    arrayList.addAll(fromLocation);
                }
            } catch (IOException e) {
                e = e;
                Log.e(LOG_TAG, "getAddressByCoordinate geocoder IO error: " + e.getMessage());
            } catch (IllegalArgumentException e2) {
                e = e2;
                Log.e(LOG_TAG, "getAddressByCoordinate invalid lat/lon: " + e.getMessage());
            } catch (Exception e3) {
                e = e3;
                Log.e(LOG_TAG, "getAddressByCoordinate unexpected: " + e.getMessage());
            }
        } catch (IOException e4) {
            e = e4;
        } catch (IllegalArgumentException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        }
        return (Address[]) arrayList.toArray(new Address[0]);
    }

    public void registerCountryCodeCallback() {
        synchronized (this.countryLock) {
            handleCountryCodeRegistration();
        }
    }

    private void handleCountryCodeRegistration() {
        if (this.countryCodeRegistered) {
            return;
        }
        CountryResult countryResultResolveCountryCode = resolveCountryCode();
        nativeOnCountryCodeChanged(countryResultResolveCountryCode.code, countryResultResolveCountryCode.type);
        if (this.localeReceiver == null) {
            this.localeReceiver = new BroadcastReceiver() { // from class: ohos.ace.plugin.locationserviceplugin.LocationServicePlugin.5
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    CountryResult countryResultResolveCountryCode2 = LocationServicePlugin.this.resolveCountryCode();
                    LocationServicePlugin.this.nativeOnCountryCodeChanged(countryResultResolveCountryCode2.code, countryResultResolveCountryCode2.type);
                }
            };
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        this.context.registerReceiver(this.localeReceiver, intentFilter);
        this.countryCodeRegistered = true;
    }

    public void unregisterCountryCodeCallback() {
        synchronized (this.countryLock) {
            if (this.countryCodeRegistered) {
                try {
                    BroadcastReceiver broadcastReceiver = this.localeReceiver;
                    if (broadcastReceiver != null) {
                        this.context.unregisterReceiver(broadcastReceiver);
                    }
                } catch (IllegalArgumentException | SecurityException e) {
                    Log.e(LOG_TAG, "unregisterCountryCodeCallback exception: " + e.getMessage());
                }
                this.countryCodeRegistered = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CountryResult resolveCountryCode() {
        TelephonyManager telephonyManager = (TelephonyManager) this.context.getSystemService("phone");
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso != null && !simCountryIso.isEmpty()) {
                return new CountryResult(2, simCountryIso);
            }
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null && !networkCountryIso.isEmpty()) {
                return new CountryResult(4, networkCountryIso);
            }
        }
        return new CountryResult(1, Locale.getDefault().getCountry());
    }

    public void registerNmeaMessageCallback() {
        ensureLocationManagerInitialized();
        if (checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        synchronized (this.nmeaLock) {
            doRegisterNmeaListener();
        }
    }

    private void doRegisterNmeaListener() {
        if (this.nmeaRegistered) {
            return;
        }
        if (this.nmeaListener == null) {
            this.nmeaListener = new OnNmeaMessageListener() { // from class: ohos.ace.plugin.locationserviceplugin.LocationServicePlugin$$ExternalSyntheticLambda0
                @Override // android.location.OnNmeaMessageListener
                public final void onNmeaMessage(String str, long j) {
                    this.f$0.m2055x12828ebb(str, j);
                }
            };
        }
        if (this.locationManager.addNmeaListener(this.nmeaListener)) {
            this.nmeaRegistered = true;
        }
    }

    /* JADX INFO: renamed from: lambda$doRegisterNmeaListener$0$ohos-ace-plugin-locationserviceplugin-LocationServicePlugin, reason: not valid java name */
    /* synthetic */ void m2055x12828ebb(String str, long j) {
        if (str != null) {
            nativeOnNmeaMessage(j, str);
        }
    }

    public void unregisterNmeaMessageCallback() {
        OnNmeaMessageListener onNmeaMessageListener;
        if (this.locationManager == null) {
            return;
        }
        synchronized (this.nmeaLock) {
            if (this.nmeaRegistered && (onNmeaMessageListener = this.nmeaListener) != null) {
                this.locationManager.removeNmeaListener(onNmeaMessageListener);
                this.nmeaRegistered = false;
            }
        }
    }

    public void registerGnssStatusCallback() {
        Log.i(LOG_TAG, "registerGnssStatusCallback called");
        if (checkRegisterPreconditions()) {
            synchronized (this.gnssStatusCbLock) {
                if (this.gnssStatusRegistered) {
                    Log.i(LOG_TAG, "GNSS status already registered");
                } else {
                    initGnssStatusCallback();
                    registerGnssCallbackWithSdkCheck();
                }
            }
        }
    }

    private boolean checkRegisterPreconditions() {
        if (this.locationManager == null) {
            Log.e(LOG_TAG, "registerGnssStatusCallback locationManager null");
            return false;
        }
        int iCheckSelfPermission = checkSelfPermission("android.permission.ACCESS_FINE_LOCATION");
        int iCheckSelfPermission2 = checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
        if (iCheckSelfPermission == 0 && iCheckSelfPermission2 == 0) {
            return true;
        }
        this.pendingGnssStatusRegister = true;
        return false;
    }

    private void initGnssStatusCallback() {
        if (this.gnssStatusCallback != null) {
            return;
        }
        this.gnssStatusCallback = new GnssStatus.Callback() { // from class: ohos.ace.plugin.locationserviceplugin.LocationServicePlugin.6
            @Override // android.location.GnssStatus.Callback
            public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
                Log.i(LocationServicePlugin.LOG_TAG, "onSatelliteStatusChanged called");
                if (gnssStatus == null) {
                    return;
                }
                int satelliteCount = gnssStatus.getSatelliteCount();
                Log.i(LocationServicePlugin.LOG_TAG, "onSatelliteStatusChanged count=" + satelliteCount);
                if (satelliteCount <= 0) {
                    LocationServicePlugin.this.nativeOnGnssStatusChanged(0, new int[0], new double[0], new double[0], new double[0], new double[0], new int[0], new int[0]);
                    return;
                }
                int[] iArr = new int[satelliteCount];
                double[] dArr = new double[satelliteCount];
                double[] dArr2 = new double[satelliteCount];
                double[] dArr3 = new double[satelliteCount];
                double[] dArr4 = new double[satelliteCount];
                int[] iArr2 = new int[satelliteCount];
                int[] iArr3 = new int[satelliteCount];
                for (int i = 0; i < satelliteCount; i++) {
                    iArr[i] = gnssStatus.getSvid(i);
                    dArr[i] = gnssStatus.getCn0DbHz(i);
                    dArr2[i] = gnssStatus.getElevationDegrees(i);
                    dArr3[i] = gnssStatus.getAzimuthDegrees(i);
                    iArr2[i] = gnssStatus.getConstellationType(i);
                    iArr3[i] = gnssStatus.usedInFix(i) ? 1 : 0;
                    dArr4[i] = gnssStatus.hasCarrierFrequencyHz(i) ? gnssStatus.getCarrierFrequencyHz(i) : -1.0d;
                }
                LocationServicePlugin.this.nativeOnGnssStatusChanged(satelliteCount, iArr, dArr, dArr2, dArr3, dArr4, iArr2, iArr3);
                Log.i(LocationServicePlugin.LOG_TAG, "onSatelliteStatusChanged processed");
            }
        };
    }

    private void registerGnssCallbackWithSdkCheck() {
        ensureLocationManagerInitialized();
        try {
            this.locationManager.registerGnssStatusCallback(this.gnssStatusCallback, new Handler(Looper.getMainLooper()));
            this.gnssStatusRegistered = true;
            this.pendingGnssStatusRegister = false;
            Log.i(LOG_TAG, "GNSS status registered success");
            forceGpsLocationUpdate();
        } catch (IllegalArgumentException e) {
            e = e;
            Log.e(LOG_TAG, "registerGnssStatusCallback ex: " + e.getMessage());
        } catch (IllegalStateException e2) {
            e = e2;
            Log.e(LOG_TAG, "registerGnssStatusCallback ex: " + e.getMessage());
        } catch (SecurityException e3) {
            Log.e(LOG_TAG, "registerGnssStatusCallback security: " + e3.getMessage());
        }
    }

    private void forceGpsLocationUpdate() {
        try {
            if (!this.locationManager.isProviderEnabled(GeocodeSearch.GPS)) {
                Log.i(LOG_TAG, "GPS provider disabled, skip force request");
            } else {
                this.locationManager.requestLocationUpdates(GeocodeSearch.GPS, 1000L, 0.0f, this.locationListener);
                Log.i(LOG_TAG, "Force GPS request to trigger GNSS scan");
            }
        } catch (SecurityException e) {
            Log.e(LOG_TAG, "Force GPS request failed: " + e.getMessage());
        }
    }

    public void unregisterGnssStatusCallback() {
        Log.i(LOG_TAG, "unregisterGnssStatusCallback called");
        if (this.locationManager == null) {
            return;
        }
        synchronized (this.gnssStatusCbLock) {
            if (this.gnssStatusRegistered) {
                try {
                    GnssStatus.Callback callback = this.gnssStatusCallback;
                    if (callback != null) {
                        this.locationManager.unregisterGnssStatusCallback(callback);
                    }
                } catch (IllegalArgumentException | SecurityException e) {
                    Log.e(LOG_TAG, "unregisterGnssStatusCallback exception: " + e.getMessage());
                }
                this.gnssStatusRegistered = false;
            }
        }
    }

    public void registerSwitchCallback() {
        nativeOnSwitchStateChanged(isLocationEnabled() ? 1 : 0);
    }

    private boolean isLocationEnabled() {
        LocationManager locationManager = (LocationManager) this.context.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        return locationManager.isProviderEnabled(GeocodeSearch.GPS) || locationManager.isProviderEnabled("network");
    }

    public int registerBluetoothScanResultCallback() {
        BluetoothManager bluetoothManager = (BluetoothManager) this.context.getSystemService("bluetooth");
        BluetoothAdapter adapter = bluetoothManager == null ? null : bluetoothManager.getAdapter();
        BluetoothLeScanner bluetoothLeScanner = adapter != null ? adapter.getBluetoothLeScanner() : null;
        this.bluetoothLeScanner = bluetoothLeScanner;
        if (bluetoothLeScanner == null) {
            Log.e(LOG_TAG, "BLE scanner null");
            return -1;
        }
        try {
            Log.i(LOG_TAG, "Starting BLE scan");
            this.bluetoothLeScanner.startScan(this.scanCallback);
            Log.i(LOG_TAG, "BLE scan started");
            return 0;
        } catch (IllegalArgumentException e) {
            e = e;
            Log.e(LOG_TAG, "startScan exception: " + e.getMessage());
            return -1;
        } catch (IllegalStateException e2) {
            e = e2;
            Log.e(LOG_TAG, "startScan exception: " + e.getMessage());
            return -1;
        } catch (SecurityException e3) {
            Log.e(LOG_TAG, "startScan missing permission: " + e3.getMessage());
            return -1;
        }
    }

    public void unregisterBluetoothScanResultCallback() {
        BluetoothLeScanner bluetoothLeScanner = this.bluetoothLeScanner;
        if (bluetoothLeScanner == null) {
            return;
        }
        try {
            bluetoothLeScanner.stopScan(this.scanCallback);
        } catch (IllegalArgumentException | IllegalStateException e) {
            Log.e(LOG_TAG, "stopScan exception: " + e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    public int registerLocationChangeCallbackWithConfig(int i, int i2, int i3, double d, float f, int i4, int i5, boolean z, boolean z2) {
        String str = GeocodeSearch.GPS;
        ensureLocationManagerInitialized();
        if (i2 == 1) {
            try {
                if (!this.locationManager.isProviderEnabled(GeocodeSearch.GPS)) {
                    str = "network";
                }
            } catch (IllegalArgumentException e) {
                e = e;
                Log.e(LOG_TAG, "registerLocationChangeCallbackWithConfig ex: " + e.getMessage());
                return -1;
            } catch (IllegalStateException e2) {
                e = e2;
                Log.e(LOG_TAG, "registerLocationChangeCallbackWithConfig ex: " + e.getMessage());
                return -1;
            } catch (SecurityException e3) {
                Log.e(LOG_TAG, "registerLocationChangeCallbackWithConfig security: " + e3.getMessage());
                return -1;
            }
        } else {
            str = "network";
        }
        String str2 = str;
        this.locationManager.requestLocationUpdates(str2, Math.max(0, i3) * 1000, (float) Math.max(0.0d, d), this.locationListener);
        return 0;
    }

    public void registerLocationErrorCallback() {
        synchronized (this) {
            if (this.errorListenerRegistered) {
                Log.e(LOG_TAG, "Location error listener already registered");
                return;
            }
            if (this.locationManager == null) {
                nativeOnLocationError(2003);
                return;
            }
            if (!hasLocationPermission()) {
                nativeOnLocationError(201);
                return;
            }
            try {
                String strChooseProvider = chooseProvider();
                if (strChooseProvider == null) {
                    nativeOnLocationError(2003);
                    return;
                }
                this.locationManager.requestLocationUpdates(strChooseProvider, 0L, 0.0f, this.statusListener);
                this.errorListenerRegistered = true;
                Log.i(LOG_TAG, "registerLocationErrorCallback success, provider=" + strChooseProvider);
            } catch (SecurityException unused) {
                nativeOnLocationError(201);
            } catch (Exception unused2) {
                nativeOnLocationError(-4);
            }
        }
    }

    public void unregisterLocationErrorCallback() {
        synchronized (this) {
            if (this.errorListenerRegistered) {
                LocationManager locationManager = this.locationManager;
                if (locationManager != null) {
                    try {
                        locationManager.removeUpdates(this.statusListener);
                    } catch (IllegalArgumentException | SecurityException e) {
                        Log.e(LOG_TAG, "removeUpdates exception: " + e.getMessage());
                    }
                }
                this.errorListenerRegistered = false;
            }
        }
    }

    private String chooseProvider() {
        ensureLocationManagerInitialized();
        try {
            if (this.locationManager.isProviderEnabled(GeocodeSearch.GPS)) {
                return GeocodeSearch.GPS;
            }
            if (this.locationManager.isProviderEnabled("network")) {
                return "network";
            }
            return null;
        } catch (IllegalArgumentException | SecurityException e) {
            Log.e(LOG_TAG, "chooseProvider exception: " + e.getMessage());
            return null;
        }
    }

    private boolean hasLocationPermission() {
        return checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private int checkSelfPermission(String str) {
        Context context = this.context;
        if (context == null) {
            Log.e(LOG_TAG, "checkSelfPermission: context null, treat as denied");
            return -1;
        }
        return context.checkSelfPermission(str);
    }

    public int startLocating() {
        Log.i(LOG_TAG, "Java startLocating called");
        if (this.locatingStarted) {
            return 0;
        }
        ensureLocationManagerInitialized();
        ensureLocationThread();
        createListenerIfNeed();
        try {
            String strChooseProvider = chooseProvider();
            if (strChooseProvider == null) {
                return -1;
            }
            this.locationManager.requestLocationUpdates(strChooseProvider, 5000L, 10.0f, this.internalLocationListener, this.locationHandler.getLooper());
            this.locatingStarted = true;
            return 0;
        } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
            Log.e(LOG_TAG, "startLocating error: " + e.getMessage());
            return -1;
        }
    }

    public int stopLocating() {
        LocationListener locationListener;
        if (!this.locatingStarted) {
            return -1;
        }
        try {
            LocationManager locationManager = this.locationManager;
            if (locationManager != null && (locationListener = this.internalLocationListener) != null) {
                locationManager.removeUpdates(locationListener);
            }
            this.locatingStarted = false;
            this.receivedFixCount = 0;
            return 0;
        } catch (IllegalArgumentException | SecurityException unused) {
            Log.e(LOG_TAG, "stopLocating removeUpdates warn");
            return -1;
        }
    }

    private String mapPriorityToProvider(int i) {
        ensureLocationManagerInitialized();
        if (i != 1) {
            if (i == 2) {
                return this.locationManager.isProviderEnabled("network") ? "network" : "passive";
            }
            if (this.locationManager.isProviderEnabled(GeocodeSearch.GPS)) {
                return GeocodeSearch.GPS;
            }
            return this.locationManager.isProviderEnabled("network") ? "network" : "passive";
        }
        if (this.locationManager.isProviderEnabled("network")) {
            return "network";
        }
        if (this.locationManager.isProviderEnabled(GeocodeSearch.GPS)) {
            return GeocodeSearch.GPS;
        }
        return "passive";
    }

    private void ensureLocationThread() {
        if (this.locationThread == null) {
            HandlerThread handlerThread = new HandlerThread("LocThread");
            this.locationThread = handlerThread;
            handlerThread.start();
            this.locationHandler = new Handler(this.locationThread.getLooper());
        }
    }

    private void createListenerIfNeed() {
        if (this.internalLocationListener != null) {
            return;
        }
        this.internalLocationListener = new LocationListener() { // from class: ohos.ace.plugin.locationserviceplugin.LocationServicePlugin.7
            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i, Bundle bundle) {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                if (location == null) {
                    return;
                }
                LocationServicePlugin.nativeOnLocationChanged(location.getLatitude(), location.getLongitude(), location.hasAccuracy() ? location.getAccuracy() : 0.0f, location.hasAltitude() ? location.getAltitude() : 0.0d, location.hasSpeed() ? location.getSpeed() : 0.0f, location.hasBearing() ? location.getBearing() : 0.0f, location.getTime(), location.getBearingAccuracyDegrees(), location.getProvider());
                LocationServicePlugin.access$908(LocationServicePlugin.this);
            }
        };
    }

    public int getSwitchState() {
        Log.i(LOG_TAG, "getSwitchState called");
        try {
            return Settings.Secure.getInt(this.context.getContentResolver(), "location_mode") == 0 ? 0 : 1;
        } catch (Settings.SettingNotFoundException unused) {
            return 0;
        }
    }

    public boolean isGeoConvertAvailable() {
        Log.i(LOG_TAG, "isGeoConvertAvailable called");
        return Geocoder.isPresent();
    }

    public Address[] getAddressByLocationName(String str, int i, String str2, String str3, double d, double d2, double d3, double d4, String str4) {
        Locale locale;
        String str5;
        String str6;
        if (str2 == null || str2.isEmpty()) {
            locale = Locale.getDefault();
        } else {
            if (str2.contains("_")) {
                String[] strArrSplit = str2.split("_", 2);
                str5 = strArrSplit[0];
                str6 = strArrSplit[1];
            } else if (!str2.contains(Constants.LINK)) {
                str5 = str2;
                str6 = "";
            } else {
                String[] strArrSplit2 = str2.split(Constants.LINK, 2);
                str5 = strArrSplit2[0];
                str6 = strArrSplit2[1];
            }
            locale = str6.isEmpty() ? new Locale(str5) : new Locale(str5, str6);
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                List<Address> fromLocationName = new Geocoder(this.context, locale).getFromLocationName(str, i, d, d2, d3, d4);
                if (fromLocationName != null) {
                    arrayList.addAll(fromLocationName);
                }
            } catch (IOException e) {
                e = e;
                Log.e(LOG_TAG, "getAddressByLocationName error: " + e.getMessage());
            }
        } catch (IOException e2) {
            e = e2;
        }
        return (Address[]) arrayList.toArray(new Address[0]);
    }

    public String getIsoCountryCode() {
        String simCountryIso;
        Log.i(LOG_TAG, "Get the ISO country code");
        TelephonyManager telephonyManager = (TelephonyManager) this.context.getSystemService("phone");
        if (telephonyManager != null && (simCountryIso = telephonyManager.getSimCountryIso()) != null && !simCountryIso.isEmpty()) {
            return simCountryIso.toUpperCase(Locale.ROOT);
        }
        return Locale.getDefault().getCountry().toUpperCase(Locale.ROOT);
    }

    public void addGnssGeofence(double d, double d2, float f, long j, int i) {
        try {
            try {
                LocationManager locationManager = (LocationManager) this.context.getSystemService("location");
                if (locationManager == null) {
                    Log.e(LOG_TAG, "Get locationManager failed");
                    return;
                }
                ensureGeofenceReceiverRegistered();
                PendingIntent pendingIntentRemove = this.geofencePendingIntents.remove(Integer.valueOf(i));
                if (pendingIntentRemove != null) {
                    try {
                        locationManager.removeProximityAlert(pendingIntentRemove);
                    } catch (IllegalArgumentException | SecurityException unused) {
                        Log.e(LOG_TAG, "remove old proximity alert fail");
                    }
                }
                PendingIntent pendingIntentCreatePendingIntent = createPendingIntent(i, createGeofenceIntent(i));
                locationManager.addProximityAlert(d, d2, f, j, pendingIntentCreatePendingIntent);
                this.geofencePendingIntents.put(Integer.valueOf(i), pendingIntentCreatePendingIntent);
                nativeOnGeofenceEvent(i);
            } catch (SecurityException e) {
                Log.e(LOG_TAG, "Geofence addition failed: permission error", e);
            }
        } catch (Exception e2) {
            Log.e(LOG_TAG, "Geofence addition encountered an unexpected error", e2);
        }
    }

    private void ensureGeofenceReceiverRegistered() {
        if (this.geofenceReceiverRegistered) {
            return;
        }
        this.geofenceReceiver = new BroadcastReceiver() { // from class: ohos.ace.plugin.locationserviceplugin.LocationServicePlugin.8
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null || !LocationServicePlugin.ACTION_GEOFENCE.equals(intent.getAction())) {
                    return;
                }
                int intExtra = intent.getIntExtra("fence_id", -1);
                if (intExtra > 0) {
                    LocationServicePlugin.nativeOnNotificationEvent(intExtra, intent.getBooleanExtra("entering", false));
                } else {
                    Log.e(LocationServicePlugin.LOG_TAG, "GeofenceReceiver invalid fenceId");
                }
            }
        };
        this.context.registerReceiver(this.geofenceReceiver, new IntentFilter(ACTION_GEOFENCE));
        this.geofenceReceiverRegistered = true;
        Log.i(LOG_TAG, "Geofence receiver registered");
    }

    public void removeGnssGeofence(int i) {
        Log.i(LOG_TAG, "removeGnssGeofence called with fenceId: " + i);
        try {
            LocationManager locationManager = (LocationManager) this.context.getSystemService("location");
            if (locationManager == null) {
                Log.e(LOG_TAG, "Failed to obtain the LocationManager instance");
            } else {
                locationManager.removeProximityAlert(createPendingIntent(i, createGeofenceIntent(i)));
            }
        } catch (SecurityException e) {
            Log.e(LOG_TAG, "Failed to remove geofence: Permission error", e);
        } catch (Exception e2) {
            Log.e(LOG_TAG, "An unexpected error occurred while removing the geofence", e2);
        }
    }

    private Intent createGeofenceIntent(int i) {
        Intent intent = new Intent(ACTION_GEOFENCE);
        intent.setPackage(this.context.getApplicationInfo().packageName);
        intent.putExtra("fence_id", i);
        return intent;
    }

    private PendingIntent createPendingIntent(int i, Intent intent) {
        return PendingIntent.getBroadcast(this.context, i, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public String getCurrentWifiBssidForLocating() {
        Log.i(LOG_TAG, "getCurrentWifiBssidForLocating called");
        if (!checkRequiredPermissions()) {
            Log.e(LOG_TAG, "Missing necessary permissions, unable to obtain WiFi BSSID.");
            return "Permission Denied";
        }
        WifiManager wifiManager = (WifiManager) this.context.getSystemService("wifi");
        if (wifiManager == null) {
            Log.e(LOG_TAG, "WiFi Manager is null, cannot obtain WiFi BSSID.");
            return "WiFi Not Supported";
        }
        try {
            if (!wifiManager.isWifiEnabled()) {
                Log.e(LOG_TAG, "WiFi is disabled.");
                return "WiFi Disabled";
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo == null) {
                Log.e(LOG_TAG, "Failed to get WiFi connection info: WifiInfo is null.");
                return "No WiFi Connection";
            }
            String bssid = connectionInfo.getBSSID();
            if (isInvalidBssid(bssid)) {
                Log.e(LOG_TAG, "Invalid or placeholder BSSID received: " + bssid);
                return "Invalid BSSID";
            }
            Log.i(LOG_TAG, "Successfully obtained WiFi BSSID: " + bssid);
            return bssid;
        } catch (SecurityException e) {
            Log.e(LOG_TAG, "Failed to get WiFi BSSID: Security exception - missing permissions.", e);
            return "Security Exception";
        } catch (Exception e2) {
            Log.e(LOG_TAG, "Failed to get WiFi BSSID: Unexpected exception.", e2);
            return "Unknown Error";
        }
    }

    private boolean checkRequiredPermissions() {
        boolean z = this.context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = this.context.checkSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0;
        if (!z) {
            Log.e(LOG_TAG, "Missing required permission: ACCESS_FINE_LOCATION (Fine Location Permission)");
        }
        if (!z2) {
            Log.e(LOG_TAG, "Missing required permission: ACCESS_WIFI_STATE (WiFi State Permission)");
        }
        return z && z2;
    }

    private boolean isInvalidBssid(String str) {
        return str == null || str.trim().isEmpty() || "02:00:00:00:00:00".equals(str);
    }

    private Activity getMainActivity() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            if (!(obj instanceof Map)) {
                return null;
            }
            Iterator it = ((Map) obj).values().iterator();
            while (it.hasNext()) {
                Activity nonPausedActivity = getNonPausedActivity(it.next());
                if (nonPausedActivity != null) {
                    return nonPausedActivity;
                }
            }
        } catch (ClassNotFoundException e) {
            Log.e("TAG", "ClassNotFoundException occurred: " + e.getMessage());
        } catch (IllegalAccessException e2) {
            Log.e("TAG", "IllegalAccessException occurred: " + e2.getMessage());
        } catch (NoSuchFieldException e3) {
            Log.e("TAG", "NoSuchFieldException occurred: " + e3.getMessage());
        } catch (NoSuchMethodException e4) {
            Log.e("TAG", "NoSuchMethodException occurred: " + e4.getMessage());
        } catch (InvocationTargetException e5) {
            Log.e("TAG", "InvocationTargetException occurred: " + e5.getMessage());
        }
        return null;
    }

    private Activity getNonPausedActivity(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Class<?> cls = obj.getClass();
        Field declaredField = cls.getDeclaredField("paused");
        declaredField.setAccessible(true);
        if (declaredField.getBoolean(obj)) {
            return null;
        }
        Field declaredField2 = cls.getDeclaredField("activity");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(obj);
        if (obj2 instanceof Activity) {
            return (Activity) obj2;
        }
        return null;
    }

    private void init() {
        nativeInit();
    }
}
