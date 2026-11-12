package com.huawei.profile.client.profile;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.profile.client.connect.RemoteServiceConnection;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import com.huawei.profile.kv.ProfileStoreBaseProxy;
import com.huawei.profile.kv.ProfileStoreExtendProxy;
import com.huawei.profile.kv.ProfileStoreFactory;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.DeviceProfileEx;
import com.huawei.profile.profile.ProfileGeneralException;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import com.huawei.profile.profile.ServiceProfileEx;
import com.huawei.profile.profile.SubscribeInfo;
import com.huawei.profile.profile.SyncMode;
import com.huawei.profile.service.AbstractSubscribeProfileListener;
import com.huawei.profile.service.GetDeviceInfoListener;
import com.huawei.profile.service.GetDeviceInfoListenerEx;
import com.huawei.profile.service.IProfileServiceCall;
import com.huawei.profile.service.PutDeviceExListener;
import com.huawei.profile.service.SyncDeviceInfoExListener;
import com.huawei.profile.service.SyncDeviceInfoListener;
import com.huawei.profile.subscription.event.EventInfo;
import com.huawei.profile.utils.BaseUtil;
import com.huawei.profile.utils.DeviceListType;
import com.huawei.profile.utils.OpResult;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class ProfileClient implements IProfileClient, ISwitchClient, IDeviceListClient {
    private static final String CERTIFICATE_FOR_X509 = "X509";
    public static final String CLOUD_LOCAL_DOMAIN = "cloud_local_domain";
    private static final int DATA_SOURCE_CLOUD = 1;
    private static final int DATA_SOURCE_DEVICE = 2;
    private static final int DATA_SOURCE_INVALID = -1;
    private static final int DATA_SOURCE_P2P = 4;
    private static final String DEAD_OBJECT_EXCEPTION = "receive a dead object exception";
    public static final String DEFAULT_TRUST_DOMAIN = "default_trust_domain";
    private static final int DEFAULT_VERSION_CODE = -1;
    private static final String DEFAULT_WRONG_SDK_VERSION = "1.0.0";
    private static final String DEVICE_PROFILE_SDK_VERSION = "device_profile_sdk_version";
    private static final String EMPTY_STRING = " ";
    private static final String HIV = "hiv";
    public static final String IS_UPLOAD_IMMEDIATELY = "isUploadImmediately";
    private static final int LEN_BYTE_TO_HEX = 2;
    private static final int MAX_CHARACTERS_SIZE = 200;
    private static final int MAX_NUM_SID_TO_DELETE = 20;
    private static final int MAX_SERVICES_SIZE = 2500;
    private static final String MESSAGE_FOR_SHA = "SHA256";
    private static final String OBTAIN_EXTEND_PROXY_FAILED = "Failed to obtain the ProfileStoreExtendProxy.";
    private static final String ON_CONNECTED_SERVICE = " no profile service connected";
    public static final String P2P_TRUST_DOMAIN = "p2p_trust_domain";
    private static final String PRE_FOR_HEX_STRING = "0";
    private static final List<String> PROFILE_CERT = new ArrayList<String>() { // from class: com.huawei.profile.client.profile.ProfileClient.1
        {
            add("1E:3E:EE:2A:88:A6:DF:75:FB:4A:F5:6A:DC:83:73:BB:81:8F:3C:B9:0A:49:35:C7:82:15:82:B8:CE:BB:69:4C");
            add("35:17:26:22:15:D8:D3:00:8C:BF:88:87:50:B6:41:8E:DC:4D:56:2A:C3:3E:D6:87:4E:0D:73:AB:A6:67:BC:3C");
            add("60:3A:C6:A5:7E:20:23:E0:0C:9C:93:BB:53:9C:A6:53:DF:30:03:EB:A4:E9:2E:A1:90:4B:A4:AA:A5:D9:38:F0");
        }
    };
    private static final String PROFILE_SERVICE = "com.huawei.profile";
    public static final int RETURN_CACHE = 0;
    public static final int RETURN_FAIL = 1;
    public static final String SYNC_TIMEOUT_MODE = "syncTimeoutMode";
    private static final String TAG = "ProfileClient";
    private String callingPkgName;
    private volatile ServiceConnectCallback connectCallback;
    private Context context;
    private final RemoteServiceConnection dsConnection;
    private volatile boolean isBinded;
    private volatile boolean isConnected;
    private final boolean isUseProfileApk;
    private final Object locker;
    private volatile IProfileServiceCall profileService;
    private final ProfileStoreFactory profileStoreFactory;
    private String sdkVersionCode;

    private boolean hasP2pDataSource(int i) {
        return (i & 4) != 0;
    }

    public ProfileClient(Context context) throws IllegalArgumentException {
        this(context, -2);
        BaseUtil.markCallInterface(TAG, this.callingPkgName);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileClient(Context context, int i) throws IllegalArgumentException {
        boolean z;
        if (BaseUtil.isProfileApkInstalled(context)) {
            if ("com.huawei.health".equals(context == null ? "" : context.getPackageName())) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        this(context, z, i);
        Log.i(TAG, "new ProfileClient, userId:" + i);
        BaseUtil.markCallInterface("ProfileClientWithUserId", this.callingPkgName);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileClient(Context context, CloudInteractionMode cloudInteractionMode) throws IllegalArgumentException {
        boolean z;
        if (cloudInteractionMode != CloudInteractionMode.BY_PROFILE) {
            z = false;
        } else {
            if ("com.huawei.health".equals(context == null ? "" : context.getPackageName())) {
                z = false;
            } else {
                z = true;
            }
        }
        this(context, z, -2);
        BaseUtil.markCallInterface("ProfileClient_" + cloudInteractionMode, this.callingPkgName);
    }

    private ProfileClient(Context context, boolean z, int i) throws IllegalArgumentException {
        this.profileStoreFactory = new ProfileStoreFactory();
        if (context == null) {
            throw new IllegalArgumentException("Context is null");
        }
        this.dsConnection = new RemoteServiceConnection(context, i);
        this.connectCallback = null;
        this.profileService = null;
        this.callingPkgName = context.getPackageName();
        this.locker = new Object();
        this.isConnected = false;
        this.isBinded = false;
        this.context = context;
        this.isUseProfileApk = z;
        this.sdkVersionCode = getSdkVersion();
    }

    private void invokeConnectCallback(boolean z) {
        if (this.connectCallback == null) {
            Log.i(TAG, "invokeConnectCallback but connectCallback is null");
        } else if (z) {
            this.connectCallback.onConnect();
        } else {
            this.connectCallback.onDisconnect();
        }
    }

    public boolean connect() {
        return connect(null);
    }

    public boolean connect(ServiceConnectCallback serviceConnectCallback) {
        synchronized (this.locker) {
            BaseUtil.markCallInterface("connect", this.callingPkgName);
            Log.i(TAG, "sdk version = " + this.sdkVersionCode);
            if (!isProfileServiceValid()) {
                Log.e(TAG, "the profile service is invalid");
                return false;
            }
            if (this.isBinded) {
                Log.i(TAG, "isBinded");
                return true;
            }
            this.connectCallback = serviceConnectCallback;
            if (this.isUseProfileApk && !"com.huawei.health".equals(this.callingPkgName)) {
                if (this.profileService != null) {
                    Log.i(TAG, "profileService is not null, invoke connectCallback");
                    invokeConnectCallback(true);
                }
                this.isBinded = this.dsConnection.open(new RemoteServiceConnection.OnConnectListener() { // from class: com.huawei.profile.client.profile.ProfileClient.2
                    @Override // com.huawei.profile.client.connect.RemoteServiceConnection.OnConnectListener
                    public void onConnect(IBinder iBinder) {
                        ProfileClient.this.invokeOnConnected(iBinder);
                    }

                    @Override // com.huawei.profile.client.connect.RemoteServiceConnection.OnConnectListener
                    public void onDisconnect() {
                        ProfileClient.this.invokeOnDisconnected();
                    }
                });
                if (!this.isBinded) {
                    Log.e(TAG, "Failed to open connection");
                }
                return this.isBinded;
            }
            this.isConnected = true;
            this.isBinded = true;
            invokeConnectCallback(true);
            Log.i(TAG, "APK is not installed, invoke SDK.");
            return true;
        }
    }

    private boolean isProfileServiceValid() {
        String certificate = getCertificate(this.context, "com.huawei.profile");
        if (TextUtils.isEmpty(certificate)) {
            Log.e(TAG, "the profile cert is empty");
            return false;
        }
        return PROFILE_CERT.contains(certificate);
    }

    private String getCertificate(Context context, String str) {
        PackageManager packageManager;
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "getRawSignature: not the super application");
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                if (packageInfo == null) {
                    Log.e(TAG, "getRawSignature: get package info failed.");
                    return null;
                }
                Signature[] apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners();
                if (apkContentsSigners != null && apkContentsSigners.length > 0) {
                    return getSha256Data(apkContentsSigners[0].toByteArray());
                }
                return null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "not find this package name");
        } catch (RuntimeException unused2) {
            Log.e(TAG, "runtime for getPackageInfo");
        }
        return null;
    }

    private String getSha256Data(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance(CERTIFICATE_FOR_X509).generateCertificate(byteArrayInputStream);
                if (certificateGenerateCertificate instanceof X509Certificate) {
                    String strByte2Hex = byte2Hex(MessageDigest.getInstance(MESSAGE_FOR_SHA).digest(((X509Certificate) certificateGenerateCertificate).getEncoded()));
                    byteArrayInputStream.close();
                    return strByte2Hex;
                }
                byteArrayInputStream.close();
                return null;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            Log.e(TAG, "getSha256Data: IOException");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            Log.e(TAG, "getSha256Data: NoSuchAlgorithmException");
            return null;
        } catch (CertificateException unused3) {
            Log.e(TAG, "getSha256Data: CertificateException");
            return null;
        }
    }

    private String byte2Hex(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            } else if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase(Locale.ENGLISH));
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeOnConnected(IBinder iBinder) {
        if (iBinder != null) {
            synchronized (this.locker) {
                this.profileStoreFactory.releaseStore(this.isUseProfileApk);
                this.profileService = (IProfileServiceCall) BaseUtil.cast(Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{IProfileServiceCall.class}, new ProfileServiceHandler(IProfileServiceCall.Stub.asInterface(iBinder))), IProfileServiceCall.class);
                this.isConnected = true;
                this.isBinded = true;
                Log.i(TAG, "Succeed to connect, invoke callback");
                invokeConnectCallback(true);
            }
            return;
        }
        Log.e(TAG, "Binder is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeOnDisconnected() {
        synchronized (this.locker) {
            this.profileService = null;
            this.isConnected = false;
            this.isBinded = false;
            invokeConnectCallback(false);
        }
        Log.w(TAG, "Connection to is broken down");
    }

    public boolean disconnect() {
        synchronized (this.locker) {
            BaseUtil.markCallInterface(AwarenessRequest.MessageType.DISCONNECT, this.callingPkgName);
            if (!this.isUseProfileApk) {
                invokeConnectCallback(false);
                this.isConnected = false;
                this.isBinded = false;
                Log.i(TAG, "Profile SDK close connection");
                return true;
            }
            invokeConnectCallback(false);
            boolean zClose = this.dsConnection.close();
            Log.i(TAG, "close connection: " + zClose);
            this.profileService = null;
            this.isBinded = false;
            this.isConnected = false;
            return zClose;
        }
    }

    public boolean hasConnected() {
        BaseUtil.markCallInterface("hasConnected", this.callingPkgName);
        synchronized (this.locker) {
            boolean z = false;
            if (this.isUseProfileApk && (this.profileService == null || !this.profileService.asBinder().isBinderAlive())) {
                Log.i(TAG, "profileService is null or not active, return false");
                if (this.isConnected && isBinded()) {
                    disconnect();
                }
                return false;
            }
            Log.i(TAG, "isConnected = " + this.isConnected + ", isBinded = " + isBinded());
            if (this.isConnected && isBinded()) {
                z = true;
            }
            return z;
        }
    }

    public boolean isBinded() {
        BaseUtil.markCallInterface("isBinded", this.callingPkgName);
        return this.isBinded;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public String getApiVersion() {
        BaseUtil.markCallInterface("getApiVersion", this.callingPkgName);
        if (this.profileService == null) {
            Log.e(TAG, "getApiVersion: no profile service connected");
            return "";
        }
        try {
            return this.profileService.getApiVersion();
        } catch (RemoteException e) {
            Log.e(TAG, "getApiVersion failed: " + e.getClass().getName());
            return "";
        }
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public int getApiVersionCode() {
        BaseUtil.markCallInterface("getApiVersionCode", this.callingPkgName);
        if (this.profileService == null) {
            Log.e(TAG, "getApiVersionCode: no profile service connected");
            return -1;
        }
        try {
            return this.profileService.getApiVersionCode();
        } catch (RemoteException e) {
            Log.e(TAG, "getApiVersionCode failed: " + e.getClass().getName());
            return -1;
        }
    }

    private String getSdkVersion() {
        try {
            PackageManager packageManager = this.context.getPackageManager();
            if (packageManager == null) {
                Log.e(TAG, "Failed to get packageManager.");
                return DEFAULT_WRONG_SDK_VERSION;
            }
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.context.getPackageName(), 128);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            if (bundle != null) {
                return bundle.getString(DEVICE_PROFILE_SDK_VERSION);
            }
            return DEFAULT_WRONG_SDK_VERSION;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "name not found: " + e.getMessage());
        } catch (RuntimeException unused) {
            Log.e(TAG, "runtime for get app info");
        }
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean putDevice(DeviceProfile deviceProfile) {
        BaseUtil.markCallInterface("putDevice", this.callingPkgName);
        if (deviceProfile == null) {
            Log.e(TAG, "putDevice: empty deviceProfile");
            return false;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        deviceProfile.addEntityInfo("hiv", this.sdkVersionCode);
        boolean zPutDevice = profileStoreBaseProxyGenerateStore.putDevice(this.callingPkgName, deviceProfile);
        Log.i(TAG, "putDevice result is " + zPutDevice);
        return zPutDevice;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean putDevice(DeviceProfile deviceProfile, Bundle bundle) {
        BaseUtil.markCallInterface("putDeviceWithExtraInfo", this.callingPkgName);
        if (deviceProfile == null) {
            Log.e(TAG, "putDeviceWithExtraInfo: empty deviceProfile");
            return false;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        deviceProfile.addEntityInfo("hiv", this.sdkVersionCode);
        boolean zPutDeviceWithExtraInfo = profileStoreBaseProxyGenerateStore.putDeviceWithExtraInfo(this.callingPkgName, deviceProfile, bundle);
        Log.i(TAG, "putDeviceWithExtraInfo result is " + zPutDeviceWithExtraInfo);
        return zPutDeviceWithExtraInfo;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean putServiceOfDevice(String str, ServiceProfile serviceProfile) {
        BaseUtil.markCallInterface("putServiceOfDevice", this.callingPkgName);
        if (TextUtils.isEmpty(str) || serviceProfile == null) {
            Log.e(TAG, "putServiceOfDevice: invalid parameter.");
            return false;
        }
        boolean zPutServiceOfDevice = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).putServiceOfDevice(this.callingPkgName, str, serviceProfile);
        Log.i(TAG, "putServiceOfDevice result is " + zPutServiceOfDevice);
        return zPutServiceOfDevice;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean putServiceOfDevice(String str, ServiceProfile serviceProfile, Bundle bundle) {
        BaseUtil.markCallInterface("putServiceOfDeviceWithExtraInfo", this.callingPkgName);
        if (TextUtils.isEmpty(str) || serviceProfile == null) {
            Log.e(TAG, "putServiceOfDeviceWithExtraInfo: invalid parameter.");
            return false;
        }
        boolean zPutServiceOfDeviceWithExtraInfo = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).putServiceOfDeviceWithExtraInfo(this.callingPkgName, str, serviceProfile, bundle);
        Log.i(TAG, "putServiceOfDeviceWithExtraInfo result is " + zPutServiceOfDeviceWithExtraInfo);
        return zPutServiceOfDeviceWithExtraInfo;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean putServiceCharacteristic(String str, String str2, ServiceCharacteristicProfile serviceCharacteristicProfile) {
        BaseUtil.markCallInterface("putServiceCharacteristic", this.callingPkgName);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || serviceCharacteristicProfile == null) {
            Log.e(TAG, "putServiceCharacteristic: invalid parameter.");
            return false;
        }
        boolean zPutServiceCharacteristic = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).putServiceCharacteristic(this.callingPkgName, str, str2, serviceCharacteristicProfile);
        Log.i(TAG, "putServiceCharacteristic result is " + zPutServiceCharacteristic);
        return zPutServiceCharacteristic;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean putServiceCharacteristic(String str, String str2, ServiceCharacteristicProfile serviceCharacteristicProfile, Bundle bundle) {
        BaseUtil.markCallInterface("putServiceCharacteristicWithExtraInfo", this.callingPkgName);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || serviceCharacteristicProfile == null) {
            Log.e(TAG, "putServiceCharacteristicWithExtraInfo: invalid parameter.");
            return false;
        }
        boolean zPutServiceCharacteristicWithExtraInfo = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).putServiceCharacteristicWithExtraInfo(this.callingPkgName, str, str2, serviceCharacteristicProfile, bundle);
        Log.i(TAG, "putServiceCharacteristicWithExtraInfo result is " + zPutServiceCharacteristicWithExtraInfo);
        return zPutServiceCharacteristicWithExtraInfo;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<DeviceProfile> getDevices(boolean z, List<String> list) {
        BaseUtil.markCallInterface("getDevices", this.callingPkgName);
        int dataSource = getDataSource(list);
        if (dataSource == -1) {
            Log.e(TAG, "getDevices: data source is invalid.");
            return null;
        }
        if (hasP2pSync(z, dataSource)) {
            Log.e(TAG, "getDevices: don't support p2p synchronization. ");
            return null;
        }
        List<DeviceProfile> devices = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).getDevices(this.callingPkgName, z, dataSource);
        Log.i(TAG, "getDevices result is " + size(devices));
        return devices;
    }

    private boolean hasP2pSync(boolean z, int i) {
        return z && hasP2pDataSource(i);
    }

    private int size(Collection<?> collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public DeviceProfileEx getHostDevice(List<String> list, List<String> list2) {
        BaseUtil.markCallInterface("getHostDevice", this.callingPkgName);
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        DeviceProfileEx hostDevice = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).getHostDevice(this.callingPkgName, list, list2);
        StringBuilder sb = new StringBuilder("getHostDevice result is ");
        sb.append(hostDevice != null);
        Log.i(TAG, sb.toString());
        return hostDevice;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    private int getDataSource(List<String> list) {
        byte b2;
        if (list == null || list.isEmpty()) {
            return 1;
        }
        int i = 0;
        for (String str : list) {
            str.hashCode();
            int iHashCode = str.hashCode();
            if (iHashCode != -866597431) {
                if (iHashCode != -10177988) {
                    if (iHashCode == 1118821858 && str.equals(CLOUD_LOCAL_DOMAIN)) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals(P2P_TRUST_DOMAIN)) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(DEFAULT_TRUST_DOMAIN)) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                i |= 2;
            } else if (b2 == 1) {
                i |= 4;
            } else {
                if (b2 != 2) {
                    return -1;
                }
                i |= 1;
            }
        }
        Log.i(TAG, "data source is " + i);
        return i;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<DeviceProfile> getDevicesById(String str, boolean z, List<String> list) {
        BaseUtil.markCallInterface("getDevicesById", this.callingPkgName);
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "getDevicesById: invalid parameter.");
            return null;
        }
        int dataSource = getDataSource(list);
        if (dataSource == -1) {
            Log.e(TAG, "getDevicesById: data source is invalid.");
            return null;
        }
        if (hasP2pSync(z, dataSource)) {
            Log.e(TAG, "getDevicesById: don't support p2p synchronization. ");
            return null;
        }
        List<DeviceProfile> devicesById = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).getDevicesById(this.callingPkgName, str, z, dataSource);
        Log.i(TAG, "getDevicesById result is " + size(devicesById));
        return devicesById;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<DeviceProfile> getDevicesByType(String str, boolean z, List<String> list) {
        BaseUtil.markCallInterface("getDevicesByType", this.callingPkgName);
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "getDevicesByType: invalid parameter.");
            return null;
        }
        int dataSource = getDataSource(list);
        if (dataSource == -1) {
            Log.e(TAG, "getDevicesByType: data source is invalid.");
            return null;
        }
        if (hasP2pSync(z, dataSource)) {
            Log.e(TAG, "getDevicesByType: don't support p2p synchronization. ");
            return null;
        }
        List<DeviceProfile> devicesByType = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).getDevicesByType(this.callingPkgName, str, z, dataSource);
        Log.i(TAG, "getDevicesByType result is " + size(devicesByType));
        return devicesByType;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    @Deprecated
    public List<ServiceProfile> getServicesOfDevice(String str, boolean z, List<String> list) {
        BaseUtil.markCallInterface("getServicesOfDevice", this.callingPkgName);
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "getServicesOfDevice: invalid parameter.");
            return null;
        }
        int dataSource = getDataSource(list);
        if (dataSource == -1) {
            Log.e(TAG, "getServicesOfDevice: data source is invalid.");
            return null;
        }
        if (hasP2pSync(z, dataSource)) {
            Log.e(TAG, "getServicesOfDevice: don't support p2p synchronization.");
            return Collections.EMPTY_LIST;
        }
        List<ServiceProfile> servicesOfDevice = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).getServicesOfDevice(this.callingPkgName, str, z, dataSource);
        Log.i(TAG, "getServicesOfDevice result is " + size(servicesOfDevice));
        return servicesOfDevice;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<ServiceProfile> getServicesOfDevice(String str, boolean z, List<String> list, Bundle bundle) throws ProfileGeneralException {
        BaseUtil.markCallInterface("getServicesOfDevice with extra info", this.callingPkgName);
        if (TextUtils.isEmpty(str) || bundle == null || bundle.isEmpty()) {
            Log.e(TAG, "getServicesOfDevice: invalid parameter.");
            return null;
        }
        int dataSource = getDataSource(list);
        if (dataSource == -1) {
            Log.e(TAG, "getServicesOfDevice: data source is invalid.");
            return null;
        }
        if (hasP2pSync(z, dataSource)) {
            Log.e(TAG, "getServicesOfDevice: don't support p2p synchronization.");
            return null;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return new ArrayList();
        }
        List<ServiceProfile> servicesOfDevice = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).getServicesOfDevice(this.callingPkgName, str, z, dataSource, bundle);
        Log.i(TAG, "getServicesOfDevice result is " + size(servicesOfDevice));
        return servicesOfDevice;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    @Deprecated
    public ServiceCharacteristicProfile getServiceCharacteristics(String str, String str2, boolean z, List<String> list) {
        BaseUtil.markCallInterface("getServiceCharacteristics", this.callingPkgName);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "getServiceCharacteristics: invalid parameter.");
            return null;
        }
        int dataSource = getDataSource(list);
        if (dataSource == -1) {
            Log.e(TAG, "getServiceCharacteristics: data source is invalid.");
            return null;
        }
        if (hasP2pSync(z, dataSource)) {
            Log.e(TAG, "getServiceCharacteristics: don't support p2p synchronization.");
            return null;
        }
        ServiceCharacteristicProfile serviceCharacteristics = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).getServiceCharacteristics(this.callingPkgName, str, str2, z, dataSource);
        Log.i(TAG, "getServiceCharacteristics result is " + ((serviceCharacteristics == null || serviceCharacteristics.getProfile() == null) ? 0 : serviceCharacteristics.getProfile().size()));
        return serviceCharacteristics;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public ServiceCharacteristicProfile getServiceCharacteristics(String str, String str2, boolean z, List<String> list, Bundle bundle) {
        BaseUtil.markCallInterface("getServiceCharacteristics with extra info", this.callingPkgName);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "getServiceCharacteristics: invalid parameter.");
            return null;
        }
        int dataSource = getDataSource(list);
        if (dataSource == -1) {
            Log.e(TAG, "getServiceCharacteristics: invalid dataSource");
            return null;
        }
        if (hasP2pSync(z, dataSource)) {
            Log.e(TAG, "getServiceCharacteristics: don't support p2p synchronization.");
            return null;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        ServiceCharacteristicProfile serviceCharacteristics = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).getServiceCharacteristics(this.callingPkgName, str, str2, z, dataSource, bundle);
        Log.i(TAG, "getServiceCharacteristics result is " + ((serviceCharacteristics == null || serviceCharacteristics.getProfile() == null) ? 0 : serviceCharacteristics.getProfile().size()));
        return serviceCharacteristics;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean deleteDevice(String str) {
        BaseUtil.markCallInterface("deleteDevice", this.callingPkgName);
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "deleteDevice: empty devId");
            return false;
        }
        boolean zDeleteDevice = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).deleteDevice(this.callingPkgName, str);
        Log.i(TAG, "deleteDevice result is " + zDeleteDevice);
        return zDeleteDevice;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    @Deprecated
    public boolean deleteServiceOfDevice(String str, String str2) {
        BaseUtil.markCallInterface("deleteServiceOfDevice", this.callingPkgName);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "deleteServiceOfDevice: empty devId or sid");
            return false;
        }
        boolean zDeleteServiceOfDevice = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).deleteServiceOfDevice(this.callingPkgName, str, str2);
        Log.i(TAG, "deleteServiceOfDevice result is " + zDeleteServiceOfDevice);
        return zDeleteServiceOfDevice;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public Bundle deleteServiceOfDevice(String str, List<String> list, boolean z, Bundle bundle) {
        BaseUtil.markCallInterface("deleteServiceOfDevice with sid list", this.callingPkgName);
        Bundle bundle2 = new Bundle();
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "deleteServiceOfDevice: empty devId");
            bundle2.putInt("retCode", 2);
            return bundle2;
        }
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "deleteServiceOfDevice: empty sidList");
            bundle2.putInt("retCode", 3);
            return bundle2;
        }
        if (list.size() > 20) {
            Log.e(TAG, "deleteServiceOfDevice: sidList over max num to delete");
            bundle2.putInt("retCode", 4);
            return bundle2;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        Bundle bundleDeleteServiceOfDevice = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).deleteServiceOfDevice(this.callingPkgName, str, list, z, bundle);
        if (bundleDeleteServiceOfDevice == null) {
            Log.i(TAG, "empty result");
            bundle2.putInt("retCode", 1);
        } else {
            bundle2 = bundleDeleteServiceOfDevice;
        }
        Log.i(TAG, "deleteServiceOfDevice with sidList result is " + bundle2.getInt("retCode", 1));
        return bundle2;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean deleteServiceCharacteristic(String str, String str2, String str3) {
        BaseUtil.markCallInterface("deleteServiceCharacteristic", this.callingPkgName);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Log.e(TAG, "deleteServiceCharacteristic: invalid parameter.");
            return false;
        }
        boolean zDeleteServiceCharacteristic = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk).deleteServiceCharacteristic(this.callingPkgName, str, str2, str3);
        Log.i(TAG, "deleteServiceCharacteristic result is " + zDeleteServiceCharacteristic);
        return zDeleteServiceCharacteristic;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean getAvailableDeviceInfo(boolean z, String str, GetDeviceInfoListener getDeviceInfoListener) {
        BaseUtil.markCallInterface("getAvailableDeviceInfo", this.callingPkgName);
        if (this.profileService == null) {
            Log.e(TAG, "getAvailableDeviceInfo: no profile service connected");
            return false;
        }
        try {
            return this.profileService.getAvailableDeviceInfos(this.callingPkgName, z, str, getDeviceInfoListener);
        } catch (RemoteException e) {
            Log.e(TAG, "getAvailableDeviceInfo: error is" + e.getClass().getSimpleName());
            return false;
        } catch (RuntimeException unused) {
            Log.e(TAG, "getAvailableDeviceInfo: with Unexpected runtimeException");
            return false;
        }
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean getAvailableDeviceInfoEx(boolean z, String str, List<String> list, List<String> list2, GetDeviceInfoListenerEx getDeviceInfoListenerEx) {
        BaseUtil.markCallInterface("getAvailableDeviceInfoEx", this.callingPkgName);
        if (this.profileService == null) {
            Log.e(TAG, "getAvailableDeviceInfoExs: no profile service connected");
            return false;
        }
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            Log.e(TAG, "getAvailableDeviceInfoExs: empty services and characters");
            return false;
        }
        try {
            return this.profileService.getAvailableDeviceInfoExs(this.callingPkgName, z, str, list, list2, getDeviceInfoListenerEx);
        } catch (RemoteException e) {
            Log.e(TAG, "getAvailableDeviceInfoEx: error is" + e.getClass().getSimpleName() + " " + e.getMessage());
            return false;
        } catch (RuntimeException unused) {
            Log.e(TAG, "getAvailableDeviceInfoEx: with Unexpected runtimeException");
            return false;
        }
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    @Deprecated
    public boolean syncDevicesInfo(String str, SyncMode syncMode, SyncDeviceInfoListener syncDeviceInfoListener, Bundle bundle) {
        BaseUtil.markCallInterface("deprecated syncDevicesInfo", this.callingPkgName);
        if (this.profileService == null) {
            Log.e(TAG, "deprecated syncDevicesInfo: no profile service connected");
            return false;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return false;
        }
        return ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).syncDevicesInfos(this.callingPkgName, str, syncMode, syncDeviceInfoListener, bundle);
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean syncDevicesInfo(List<String> list, SyncMode syncMode, SyncDeviceInfoExListener syncDeviceInfoExListener, Bundle bundle) {
        BaseUtil.markCallInterface("new syncDevicesInfo", this.callingPkgName);
        if (this.profileService == null) {
            Log.e(TAG, "new syncDeviceInfoEx: no profile service connected");
            return false;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return false;
        }
        return ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).syncDeviceInfoEx(this.callingPkgName, list, syncMode, syncDeviceInfoExListener, bundle);
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<DeviceProfile> getDevicesByTypeLocal(String str, List<String> list) {
        BaseUtil.markCallInterface("getDevicesByTypeLocal", this.callingPkgName);
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "getDevicesByTypeLocal: empty devType");
            return Collections.EMPTY_LIST;
        }
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "getDevicesByTypeLocal: empty sources");
            return Collections.EMPTY_LIST;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return new ArrayList();
        }
        List<DeviceProfile> devicesByTypeLocal = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).getDevicesByTypeLocal(this.callingPkgName, str, list);
        Log.i(TAG, "getDevicesByTypeLocal: result is " + size(devicesByTypeLocal));
        return devicesByTypeLocal;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<DeviceProfile> getDevicesByTypeLocal(String str) {
        BaseUtil.markCallInterface("getDevicesByTypeLocal", this.callingPkgName);
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "getDevicesByTypeLocal: empty devType");
            return Collections.EMPTY_LIST;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return new ArrayList();
        }
        List<DeviceProfile> devicesByTypeLocal = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).getDevicesByTypeLocal(this.callingPkgName, str);
        Log.i(TAG, "getDevicesByTypeLocal: result is " + size(devicesByTypeLocal));
        return devicesByTypeLocal;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean putDeviceLocal(DeviceProfile deviceProfile) {
        BaseUtil.markCallInterface("putDeviceLocal", this.callingPkgName);
        if (deviceProfile == null) {
            Log.e(TAG, "putDeviceLocal: empty deviceProfile");
            return false;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return false;
        }
        boolean zPutDeviceLocal = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).putDeviceLocal(this.callingPkgName, deviceProfile);
        Log.i(TAG, "putDeviceLocal: result is " + zPutDeviceLocal);
        return zPutDeviceLocal;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean deleteDeviceLocal(String str) {
        BaseUtil.markCallInterface("deleteDeviceLocal", this.callingPkgName);
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "deleteDeviceLocal: empty devId");
            return false;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return false;
        }
        boolean zDeleteDeviceLocal = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).deleteDeviceLocal(this.callingPkgName, str);
        Log.i(TAG, "deleteDeviceLocal: result is " + zDeleteDeviceLocal);
        return zDeleteDeviceLocal;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean deleteDeviceLocal(String str, String str2) {
        BaseUtil.markCallInterface("deleteDeviceLocal", this.callingPkgName);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "deleteDeviceLocal: empty devId or sourceId");
            return false;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return false;
        }
        boolean zDeleteDeviceLocal = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).deleteDeviceLocal(this.callingPkgName, str, str2);
        Log.i(TAG, "deleteDeviceLocal: result is " + zDeleteDeviceLocal);
        return zDeleteDeviceLocal;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public Bundle subscribeDeviceProfile(List<SubscribeInfo> list, Bundle bundle) {
        BaseUtil.markCallInterface("subscribeDeviceProfile", this.callingPkgName);
        if (this.profileService == null) {
            Log.e(TAG, "subscribeDeviceProfile: no profile service connected");
            return Bundle.EMPTY;
        }
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "subscribeDeviceProfile: empty subscribeInfo");
            return Bundle.EMPTY;
        }
        try {
            return this.profileService.subscribeDeviceProfile(this.callingPkgName, list, bundle);
        } catch (RemoteException e) {
            Log.e(TAG, "subscribeDeviceProfile: error is" + e.getClass().getSimpleName() + " " + e.getMessage());
            return Bundle.EMPTY;
        } catch (RuntimeException unused) {
            Log.e(TAG, "subscribeDeviceProfile: with Unexpected runtimeException");
            return Bundle.EMPTY;
        }
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public Bundle subscribeDeviceProfile(List<com.huawei.profile.subscription.deviceinfo.SubscribeInfo> list, AbstractSubscribeProfileListener abstractSubscribeProfileListener, Bundle bundle) {
        BaseUtil.markCallInterface("subscribeDeviceProfile with listener", this.callingPkgName);
        if (list == null || list.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("retCode", 3);
            return bundle2;
        }
        if (abstractSubscribeProfileListener == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("retCode", 4);
            return bundle3;
        }
        ComponentName componentName = new ComponentName(this.callingPkgName, abstractSubscribeProfileListener.getClass().getName());
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        Bundle bundleSubscribeDeviceProfileWithListener = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).subscribeDeviceProfileWithListener(this.callingPkgName, list, componentName, bundle);
        showResult("subscribeDeviceProfile with listener", bundleSubscribeDeviceProfileWithListener);
        return bundleSubscribeDeviceProfileWithListener;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public Bundle unsubscribeDeviceProfile(List<SubscribeInfo> list, Bundle bundle) {
        BaseUtil.markCallInterface("unsubscribeDeviceProfile", this.callingPkgName);
        if (this.profileService == null) {
            Log.e(TAG, "unsubscribeDeviceProfile: no profile service connected");
            return Bundle.EMPTY;
        }
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "unsubscribeDeviceProfile: empty subscribeInfo");
            return Bundle.EMPTY;
        }
        try {
            return this.profileService.unsubscribeDeviceProfile(this.callingPkgName, list, bundle);
        } catch (RemoteException e) {
            Log.e(TAG, "unsubscribeDeviceProfile failed: error is" + e.getClass().getSimpleName() + " " + e.getMessage());
            return Bundle.EMPTY;
        } catch (RuntimeException unused) {
            Log.e(TAG, "unsubscribeDeviceProfile failed with Unexpected runtimeException");
            return Bundle.EMPTY;
        }
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public Bundle unsubscribeDeviceProfile(List<com.huawei.profile.subscription.deviceinfo.SubscribeInfo> list, AbstractSubscribeProfileListener abstractSubscribeProfileListener, Bundle bundle) {
        BaseUtil.markCallInterface("unsubscribeDeviceProfile with listener", this.callingPkgName);
        if (list == null || list.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("retCode", 3);
            return bundle2;
        }
        Log.i(TAG, "unsubscribe info size:" + list.size());
        if (abstractSubscribeProfileListener == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("retCode", 4);
            return bundle3;
        }
        ComponentName componentName = new ComponentName(this.callingPkgName, abstractSubscribeProfileListener.getClass().getName());
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        Bundle bundleUnsubscribeDeviceProfileWithListener = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).unsubscribeDeviceProfileWithListener(this.callingPkgName, list, componentName, bundle);
        showResult("unsubscribeDeviceProfile with listener", bundleUnsubscribeDeviceProfileWithListener);
        return bundleUnsubscribeDeviceProfileWithListener;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<DeviceProfileEx> getDevicesByIdEx(List<String> list, boolean z, List<String> list2, Bundle bundle) {
        BaseUtil.markCallInterface("getDevicesByIdEx", this.callingPkgName);
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "getDevicesByIdEx: empty devIds");
            return Collections.EMPTY_LIST;
        }
        int dataSource = getDataSource(list2);
        if (dataSource == -1) {
            Log.e(TAG, "getDevicesByIdEx: invalid dataSource");
            return Collections.EMPTY_LIST;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return new ArrayList();
        }
        List<DeviceProfileEx> devicesByIdEx = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).getDevicesByIdEx(this.callingPkgName, list, z, dataSource, bundle);
        Log.i(TAG, "getDevicesByIdEx size is " + size(devicesByIdEx));
        return devicesByIdEx;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<DeviceProfileEx> getDevicesByTypeEx(List<String> list, boolean z, List<String> list2, Bundle bundle) {
        BaseUtil.markCallInterface("getDevicesByTypeEx", this.callingPkgName);
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "getDevicesByTypeEx: empty devTypes");
            return null;
        }
        int dataSource = getDataSource(list2);
        if (dataSource == -1) {
            Log.e(TAG, "getDevicesByTypeEx: invalid dataSource");
            return null;
        }
        if (z) {
            Log.e(TAG, "getDevicesByTypeEx: invalid isSync: true");
            return null;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return new ArrayList();
        }
        List<DeviceProfileEx> devicesByTypeEx = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).getDevicesByTypeEx(this.callingPkgName, list, z, dataSource, bundle);
        Log.i(TAG, "getDevicesByTypeEx result is " + size(devicesByTypeEx));
        return devicesByTypeEx;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean findDevice(boolean z, String str, GetDeviceInfoListenerEx getDeviceInfoListenerEx, Bundle bundle) {
        BaseUtil.markCallInterface("findDevice", this.callingPkgName);
        if (this.profileService == null) {
            Log.e(TAG, "findDevice: no profile service connected");
            return false;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return false;
        }
        boolean zFindDevice = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).findDevice(this.callingPkgName, z, str, getDeviceInfoListenerEx, bundle);
        Log.i(TAG, "findDevice result is " + zFindDevice);
        return zFindDevice;
    }

    @Override // com.huawei.profile.client.profile.ISwitchClient
    public boolean setSwitch(boolean z) {
        BaseUtil.markCallInterface(" setSwitch", this.callingPkgName);
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return false;
        }
        boolean z2 = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).setSwitch(this.callingPkgName, z);
        Log.i(TAG, "setSwitch result is " + z2);
        return z2;
    }

    @Override // com.huawei.profile.client.profile.IDeviceListClient
    public Bundle addDeviceList(List<DeviceProfile> list, int i, Bundle bundle) {
        BaseUtil.markCallInterface("addDeviceList, type:" + i, this.callingPkgName);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retCode", 1);
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "addDeviceList: empty deviceList");
            return bundle2;
        }
        if (!DeviceListType.isValidListType(i)) {
            Log.e(TAG, "addDeviceList: invalid listType");
            return bundle2;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        Bundle bundleAddDeviceList = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).addDeviceList(this.callingPkgName, list, i, bundle);
        showResult("addDeviceList", bundleAddDeviceList);
        return bundleAddDeviceList;
    }

    @Override // com.huawei.profile.client.profile.IDeviceListClient
    public Bundle deleteDeviceListByType(int i, Bundle bundle) {
        BaseUtil.markCallInterface("deleteDeviceListByType, type:" + i, this.callingPkgName);
        if (!DeviceListType.isValidListTypes(i)) {
            Log.e(TAG, "deleteDeviceListByType: invalid listTypes");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("retCode", 1);
            return bundle2;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        Bundle bundleDeleteDeviceListByType = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).deleteDeviceListByType(this.callingPkgName, i, bundle);
        showResult("deleteDeviceListByType", bundleDeleteDeviceListByType);
        return bundleDeleteDeviceListByType;
    }

    @Override // com.huawei.profile.client.profile.IDeviceListClient
    public Bundle deleteDeviceListById(List<String> list, int i, Bundle bundle) {
        BaseUtil.markCallInterface("deleteDeviceListById, type:" + i, this.callingPkgName);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retCode", 1);
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "deleteDeviceListById: empty deviceIdList");
            return bundle2;
        }
        if (!DeviceListType.isValidListType(i)) {
            Log.e(TAG, "deleteDeviceListById: invalid listType");
            return bundle2;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        Bundle bundleDeleteDeviceListById = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).deleteDeviceListById(this.callingPkgName, list, i, bundle);
        showResult("deleteDeviceListById", bundleDeleteDeviceListById);
        return bundleDeleteDeviceListById;
    }

    @Override // com.huawei.profile.client.profile.IDeviceListClient
    public List<DeviceProfile> queryDeviceList(int i, Bundle bundle) {
        BaseUtil.markCallInterface("queryDeviceList, type:" + i, this.callingPkgName);
        if (!DeviceListType.isValidListType(i)) {
            Log.e(TAG, "queryDeviceList: invalid listType");
            return null;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return new ArrayList();
        }
        List<DeviceProfile> listQueryDeviceList = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).queryDeviceList(this.callingPkgName, i, bundle);
        Log.i(TAG, "queryDeviceList result: size is " + size(listQueryDeviceList));
        return listQueryDeviceList;
    }

    @Override // com.huawei.profile.client.profile.IDeviceListClient
    public Bundle subscribeDeviceList(int i, AbstractSubscribeProfileListener abstractSubscribeProfileListener, Bundle bundle) {
        Bundle bundle2;
        BaseUtil.markCallInterface("subscribeDeviceList, type:" + i, this.callingPkgName);
        Bundle bundle3 = new Bundle();
        bundle3.putInt("retCode", 1);
        if (!DeviceListType.isValidListTypes(i)) {
            Log.e(TAG, "subscribeDeviceList: invalid listTypes");
            return bundle3;
        }
        if (abstractSubscribeProfileListener == null) {
            Log.e(TAG, "subscribeDeviceList: empty listener");
            return bundle3;
        }
        ComponentName componentName = new ComponentName(this.callingPkgName, abstractSubscribeProfileListener.getClass().getName());
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            Object objClone = bundle.clone();
            bundle2 = objClone instanceof Bundle ? (Bundle) objClone : null;
        }
        bundle2.putParcelable("subscriberComponent", componentName);
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        Bundle bundleSubscribeDeviceList = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).subscribeDeviceList(this.callingPkgName, i, bundle2);
        showResult("subscribeDeviceList", bundleSubscribeDeviceList);
        return bundleSubscribeDeviceList;
    }

    @Override // com.huawei.profile.client.profile.IDeviceListClient
    public Bundle unsubscribeDeviceList(int i, AbstractSubscribeProfileListener abstractSubscribeProfileListener, Bundle bundle) {
        Bundle bundle2;
        BaseUtil.markCallInterface("unsubscribeDeviceList, type:" + i, this.callingPkgName);
        Bundle bundle3 = new Bundle();
        bundle3.putInt("retCode", 1);
        if (!DeviceListType.isValidListTypes(i)) {
            Log.e(TAG, "unsubscribeDeviceList: invalid listTypes");
            return bundle3;
        }
        if (abstractSubscribeProfileListener == null) {
            Log.e(TAG, "unsubscribeDeviceList: empty listener");
            return bundle3;
        }
        ComponentName componentName = new ComponentName(this.callingPkgName, abstractSubscribeProfileListener.getClass().getName());
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            Object objClone = bundle.clone();
            bundle2 = objClone instanceof Bundle ? (Bundle) objClone : null;
        }
        bundle2.putParcelable("subscriberComponent", componentName);
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        Bundle bundleUnsubscribeDeviceList = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).unsubscribeDeviceList(this.callingPkgName, i, bundle2);
        showResult("unsubscribeDeviceList", bundleUnsubscribeDeviceList);
        return bundleUnsubscribeDeviceList;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<DeviceProfileEx> getDevicesEx(boolean z, List<String> list, Bundle bundle) {
        BaseUtil.markCallInterface("getDevicesEx", this.callingPkgName);
        if (z) {
            Log.e(TAG, "getDevicesEx: invalid isSync: true");
            return Collections.EMPTY_LIST;
        }
        if (bundle == null || bundle.isEmpty()) {
            Log.e(TAG, "getDevicesEx: empty extraInfo");
            return Collections.EMPTY_LIST;
        }
        int dataSource = getDataSource(list);
        if (dataSource == -1) {
            Log.e(TAG, "getDevicesEx: invalid dataSources");
            return Collections.EMPTY_LIST;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return new ArrayList();
        }
        List<DeviceProfileEx> devicesEx = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).getDevicesEx(this.callingPkgName, false, dataSource, bundle);
        Log.i(TAG, "getDevicesEx result is " + size(devicesEx));
        return devicesEx;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public String subscribeEvents(List<EventInfo> list, AbstractSubscribeProfileListener abstractSubscribeProfileListener, String str) {
        BaseUtil.markCallInterface("subscribeEvents", this.callingPkgName);
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "subscribeEvent: eventInfoList are null or empty");
            return OpResult.EVENTS_SUBSCRIBE_FAILED_RESULT;
        }
        if (abstractSubscribeProfileListener == null) {
            Log.e(TAG, "subscribeEvents: listener is null");
            return OpResult.EVENTS_SUBSCRIBE_FAILED_RESULT;
        }
        ComponentName componentName = new ComponentName(this.callingPkgName, abstractSubscribeProfileListener.getClass().getName());
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        String strSubscribeEvents = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).subscribeEvents(this.callingPkgName, list, componentName, str);
        Log.i(TAG, "subscribeEvents: result is " + strSubscribeEvents);
        return strSubscribeEvents;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public String unsubscribeEvents(List<EventInfo> list, AbstractSubscribeProfileListener abstractSubscribeProfileListener, String str) {
        BaseUtil.markCallInterface("unsubscribeEvents", this.callingPkgName);
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "unsubscribeEvents: eventInfoList are null or empty");
            return OpResult.EVENTS_SUBSCRIBE_FAILED_RESULT;
        }
        if (abstractSubscribeProfileListener == null) {
            Log.e(TAG, "unsubscribeEvents: listener is null");
            return OpResult.EVENTS_SUBSCRIBE_FAILED_RESULT;
        }
        ComponentName componentName = new ComponentName(this.callingPkgName, abstractSubscribeProfileListener.getClass().getName());
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        String strUnsubscribeEvents = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).unsubscribeEvents(this.callingPkgName, list, componentName, str);
        Log.i(TAG, "unsubscribeEvents: result is " + strUnsubscribeEvents);
        return strUnsubscribeEvents;
    }

    @Override // com.huawei.profile.client.profile.IDeviceListClient
    public Bundle updateDeviceListInfo(List<DeviceProfile> list, int i, Bundle bundle) {
        BaseUtil.markCallInterface("updateDeviceListInfo, type:" + i, this.callingPkgName);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retCode", 1);
        if (list == null || list.isEmpty()) {
            Log.e(TAG, "updateDeviceListInfo: empty deviceList");
            return bundle2;
        }
        if (!DeviceListType.isValidListType(i)) {
            Log.e(TAG, "updateDeviceListInfo: invalid listType");
            return bundle2;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return null;
        }
        Bundle bundleUpdateDeviceListInfo = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).updateDeviceListInfo(this.callingPkgName, list, i, bundle);
        showResult("updateDeviceListInfo", bundleUpdateDeviceListInfo);
        return bundleUpdateDeviceListInfo;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public boolean putDeviceEx(DeviceProfileEx deviceProfileEx, PutDeviceExListener putDeviceExListener) {
        BaseUtil.markCallInterface("putDeviceEx", this.callingPkgName);
        if (deviceProfileEx == null || putDeviceExListener == null) {
            Log.e(TAG, "putDeviceEx: invalid parameter.");
            return false;
        }
        if (deviceProfileEx.getIsNeedCloud()) {
            Log.e(TAG, "putDeviceEx not support cloud sync");
            return false;
        }
        if (deviceProfileEx.getServices() != null) {
            if (deviceProfileEx.getServices().size() > 2500) {
                Log.e(TAG, "putDeviceEx: service list size exceed threshold");
                return false;
            }
            Iterator<ServiceProfileEx> it = deviceProfileEx.getServices().iterator();
            while (it.hasNext()) {
                ServiceCharacteristicProfile characters = it.next().getCharacters();
                if (characters != null && characters.getProfile() != null && characters.getProfile().size() > 200) {
                    Log.e(TAG, "putDeviceEx: characters size exceed threshold");
                    return false;
                }
            }
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        deviceProfileEx.addEntityInfo("hiv", this.sdkVersionCode);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return false;
        }
        boolean zPutDeviceEx = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).putDeviceEx(this.callingPkgName, deviceProfileEx, putDeviceExListener);
        Log.i(TAG, "putDeviceEx result is " + zPutDeviceEx);
        return zPutDeviceEx;
    }

    @Override // com.huawei.profile.client.profile.IProfileClient
    public List<DeviceProfile> getDevices(boolean z, List<String> list, Bundle bundle) {
        BaseUtil.markCallInterface("getDevices with extra info", this.callingPkgName);
        if (bundle == null || bundle.isEmpty()) {
            Log.e(TAG, "getDevices: extra info is invalid.");
            return null;
        }
        int dataSource = getDataSource(list);
        if (dataSource == -1) {
            Log.e(TAG, "getDevices: data source is invalid.");
            return null;
        }
        if (hasP2pSync(z, dataSource)) {
            Log.e(TAG, "getDevices: don't support p2p synchronization.");
            return null;
        }
        ProfileStoreBaseProxy profileStoreBaseProxyGenerateStore = this.profileStoreFactory.generateStore(this.context, this.profileService, this.isUseProfileApk);
        assertInstanceOfProfileStoreExtendProxy(profileStoreBaseProxyGenerateStore);
        if (!(profileStoreBaseProxyGenerateStore instanceof ProfileStoreExtendProxy)) {
            Log.e(TAG, "class cast failed");
            return new ArrayList();
        }
        List<DeviceProfile> devices = ((ProfileStoreExtendProxy) profileStoreBaseProxyGenerateStore).getDevices(this.callingPkgName, z, dataSource, bundle);
        Log.i(TAG, "getDevices result is " + size(devices));
        return devices;
    }

    private void showResult(String str, Bundle bundle) {
        if (bundle == null) {
            Log.i(TAG, "call " + str + " result is null");
            return;
        }
        Log.i(TAG, "call " + str + " result code: " + bundle.getInt("retCode", 1));
    }

    private void assertInstanceOfProfileStoreExtendProxy(ProfileStoreBaseProxy profileStoreBaseProxy) {
        if (!(profileStoreBaseProxy instanceof ProfileStoreExtendProxy)) {
            throw new ProfileGeneralException(1, OBTAIN_EXTEND_PROXY_FAILED);
        }
    }

    /* JADX INFO: loaded from: classes42.dex */
    class ProfileServiceHandler implements InvocationHandler {
        private IProfileServiceCall profileServiceCall;

        ProfileServiceHandler(IProfileServiceCall iProfileServiceCall) {
            this.profileServiceCall = iProfileServiceCall;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return method.invoke(this.profileServiceCall, objArr);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof DeadObjectException) {
                    Log.e(ProfileClient.TAG, ProfileClient.DEAD_OBJECT_EXCEPTION);
                    ProfileClient.this.disconnect();
                }
                if (cause instanceof RuntimeException) {
                    throw new RemoteException("Unknown error with Unexpected runtimeException");
                }
                throw cause;
            }
        }
    }
}
