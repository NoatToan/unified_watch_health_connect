package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.IntentFilter;
import android.os.RemoteException;
import com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest;
import com.xiaomi.smarthome.core.server.bluetooth.IClassicBtResponse;
import com.xiaomi.smarthome.core.server.bluetooth.IProfileProxyPrepareCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt.BondStateReceiver;
import com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt.ClassicBtProvider;
import com.xiaomi.smarthome.core.server.internal.util.ClassicBtUtil;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class ClassicBtService extends IClassicBtRequest.Stub implements BondStateReceiver.BondStateListener, ClassicBtProvider.IProviderNotify {
    private static final String TAG = "classic-bluetooth:";
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothManager mBluetoothManager;
    private BondStateReceiver mBondStateReceiver;
    private ClassicBtProvider mBtProvider;
    private Context mContext;
    private Map<Integer, BluetoothProfile> mProfileMap;
    private boolean mRegisterReceiver;
    private IClassicBtResponse mResponse;

    public static final class Holder {
        public static final ClassicBtService sInstance = new ClassicBtService();
    }

    public static void error(String str) {
        BluetoothLog.e("classic-bluetooth::" + str);
    }

    public static ClassicBtService getInstance() {
        return Holder.sInstance;
    }

    public static void log(String str) {
        BluetoothLog.d("classic-bluetooth::" + str);
    }

    public static void warn(String str) {
        BluetoothLog.w("classic-bluetooth::" + str);
    }

    public void checkBondedState(String str) {
        BluetoothDevice remoteDevice;
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (bluetoothAdapter == null || (remoteDevice = bluetoothAdapter.getRemoteDevice(str)) == null) {
            return;
        }
        try {
            onBondStateChange(remoteDevice, remoteDevice.getBondState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
    public boolean connectBluetoothProfile(String str, int i) throws RemoteException {
        if (this.mBluetoothAdapter == null) {
            warn("mBluetoothAdapter is null");
            return false;
        }
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            BluetoothProfile bluetoothProfile = this.mProfileMap.get(Integer.valueOf(i));
            if (bluetoothProfile != null) {
                return ClassicBtUtil.connectBluetoothProfile(this.mBluetoothAdapter.getRemoteDevice(str), bluetoothProfile);
            }
            warn(" connectBluetoothProfile ,but profile is null");
            return false;
        }
        error(str + " is not a valid Bluetooth address");
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
    public boolean connectClassicBTSocket(String str, String str2) throws RemoteException {
        ClassicBtProvider classicBtProvider = this.mBtProvider;
        if (classicBtProvider == null) {
            warn("ClassBtProvider is null!!!");
            return false;
        }
        boolean zConnect = classicBtProvider.connect(str, UUID.fromString(str2));
        checkBondedState(str);
        return zConnect;
    }

    @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
    public void createClassicBTService() throws RemoteException {
        initBT();
        initBondStateReceiver();
    }

    @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
    public void destroy() throws RemoteException {
        BondStateReceiver bondStateReceiver = this.mBondStateReceiver;
        if (bondStateReceiver != null && this.mRegisterReceiver) {
            this.mContext.unregisterReceiver(bondStateReceiver);
            this.mRegisterReceiver = false;
        }
        ClassicBtProvider classicBtProvider = this.mBtProvider;
        if (classicBtProvider != null) {
            classicBtProvider.disconnect();
        }
        this.mResponse = null;
    }

    @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
    public boolean disconnectBluetoothProfile(String str, int i) throws RemoteException {
        if (this.mBluetoothAdapter == null) {
            warn("mBluetoothAdapter is null");
            return false;
        }
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            error(str + " is not a valid Bluetooth address");
            return false;
        }
        BluetoothProfile bluetoothProfile = this.mProfileMap.get(Integer.valueOf(i));
        if (bluetoothProfile != null) {
            return ClassicBtUtil.disconnectBluetoothProfile(this.mBluetoothAdapter.getRemoteDevice(str), bluetoothProfile);
        }
        warn("disconnectBluetoothProfile , but profile is null,profile is " + i);
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
    public void disconnectClassicBtSocket() throws RemoteException {
        ClassicBtProvider classicBtProvider = this.mBtProvider;
        if (classicBtProvider == null) {
            warn("disconnect socket ,but bt provider is null");
        } else {
            classicBtProvider.disconnect();
        }
    }

    @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
    public int getBluetoothProfileState(String str, int i) throws RemoteException {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            warn("getBluetoothProfileState fail ,address invalid,address is " + str + ",profile is " + i);
            return 0;
        }
        BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
        if (remoteDevice == null) {
            warn("getBluetoothProfileState fail ,device is null,address is " + str + ",profile is " + i);
            return 0;
        }
        BluetoothProfile bluetoothProfile = this.mProfileMap.get(Integer.valueOf(i));
        if (bluetoothProfile != null) {
            return bluetoothProfile.getConnectionState(remoteDevice);
        }
        warn("getBluetoothProfileState fail , because proxy is null,address is " + str + ",profile is " + i);
        return 0;
    }

    public void initBT() {
        this.mBluetoothManager = (BluetoothManager) this.mContext.getSystemService("bluetooth");
        ClassicBtProvider classicBtProvider = this.mBtProvider;
        if (classicBtProvider != null) {
            classicBtProvider.disconnect();
            this.mBtProvider = null;
        }
        this.mBtProvider = new ClassicBtProvider(this.mBluetoothManager);
        this.mBluetoothAdapter = this.mBluetoothManager.getAdapter();
        this.mBtProvider.setOnProviderNotify(this);
    }

    public void initBondStateReceiver() {
        if (this.mRegisterReceiver) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        this.mContext.registerReceiver(this.mBondStateReceiver, intentFilter);
        this.mRegisterReceiver = true;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt.BondStateReceiver.BondStateListener
    public void onBondStateChange(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
        if (bluetoothDevice == null) {
            warn("onBondStateChange device is null");
            return;
        }
        if (this.mResponse == null) {
            warn("onBondStateChange response is null");
            return;
        }
        log("onBondStateChange ,mac address=" + bluetoothDevice.getAddress() + ", state =" + i);
        this.mResponse.onBondStateChange(bluetoothDevice.getAddress(), i);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt.ClassicBtProvider.IProviderNotify
    public void onConnectionStateChanged(String str, int i) throws RemoteException {
        if (this.mResponse == null) {
            warn("onConnectionStateChanged response is null");
            return;
        }
        log("onConnectionStateChanged macAddress =" + str + ", state =" + i);
        this.mResponse.onConnectionStateChanged(str, i);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt.ClassicBtProvider.IProviderNotify
    public void onReceiveData(String str, byte[] bArr) throws RemoteException {
        if (bArr == null || bArr.length <= 0) {
            warn("onReceiveData data is empty");
            return;
        }
        if (this.mResponse == null) {
            warn("onReceiveData response is null");
            return;
        }
        log("onReceiveData address =" + str + ",data str =" + new String(bArr));
        this.mResponse.onReceiveData(str, bArr);
    }

    @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
    public void prepareBluetoothProfile(int i, final IProfileProxyPrepareCallback iProfileProxyPrepareCallback) throws RemoteException {
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (bluetoothAdapter == null) {
            warn("mBluetoothAdapter is null");
        } else {
            bluetoothAdapter.getProfileProxy(this.mContext, new BluetoothProfile.ServiceListener() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.ClassicBtService.1
                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceConnected(int i2, BluetoothProfile bluetoothProfile) {
                    ClassicBtService.this.mProfileMap.put(Integer.valueOf(i2), bluetoothProfile);
                    IProfileProxyPrepareCallback iProfileProxyPrepareCallback2 = iProfileProxyPrepareCallback;
                    if (iProfileProxyPrepareCallback2 != null) {
                        try {
                            iProfileProxyPrepareCallback2.onServiceConnected(i2);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceDisconnected(int i2) {
                    IProfileProxyPrepareCallback iProfileProxyPrepareCallback2 = iProfileProxyPrepareCallback;
                    if (iProfileProxyPrepareCallback2 != null) {
                        try {
                            iProfileProxyPrepareCallback2.onServiceDisconnected(i2);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, i);
        }
    }

    public void setClassicBtResponse(IClassicBtResponse iClassicBtResponse) {
        this.mResponse = iClassicBtResponse;
    }

    @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
    public boolean write(byte[] bArr) throws RemoteException {
        ClassicBtProvider classicBtProvider = this.mBtProvider;
        if (classicBtProvider != null) {
            return classicBtProvider.sendData(bArr);
        }
        return false;
    }

    private ClassicBtService() {
        this.mResponse = null;
        this.mBondStateReceiver = new BondStateReceiver(this);
        this.mBluetoothManager = null;
        this.mBluetoothAdapter = null;
        this.mBtProvider = null;
        this.mProfileMap = new HashMap();
        this.mRegisterReceiver = false;
        this.mContext = BluetoothService.getAppContext();
    }
}
