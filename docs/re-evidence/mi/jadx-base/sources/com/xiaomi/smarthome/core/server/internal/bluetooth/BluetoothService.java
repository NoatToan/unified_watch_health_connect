package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.bluetooth.SearchRequest;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.bluetooth.SearchResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.IPCChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecNotifyChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecWriteChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.StandardAuthChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate;
import com.xiaomi.smarthome.core.server.internal.device.BluetoothDeviceSearch;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.report.DefaultReportCoreProvider;
import com.xiaomi.smarthome.report.IReportCoreProvider;
import defpackage.aje;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothService implements IBluetoothService {
    private static final String ACTION_PROCESS_DEAD = "action.coremanager.process_dead";
    private static final String KEY_PROCESS_NAME = "process_name";
    private static Context mContext;
    private static volatile IBluetoothService sInstance;
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("process_name");
            BluetoothLog.v(String.format("BluetoothService onReceive %s, processName = %s", action, stringExtra));
            if ("action.coremanager.process_dead".equals(action) && TextUtils.equals(stringExtra, context.getPackageName())) {
                BluetoothLog.v(String.format("App process died", new Object[0]));
                BluetoothService.this.stopSearchBluetoothDevice();
            }
        }
    };
    private static IBleGreyProvider sBleGreyProvider = new DefaultBleGreyProvider();
    private static IBleCoreProvider sBleCoreProvider = new DefaultBleCoreProvider();
    private static ExecutorService sExecutorService = Executors.newSingleThreadExecutor();
    private static IReportCoreProvider sReportCoreProvider = new DefaultReportCoreProvider();

    private BluetoothService(Context context) {
        Context applicationContext = context.getApplicationContext();
        mContext = applicationContext;
        BluetoothContextManager.setContext(applicationContext, true);
    }

    public static Context getAppContext() {
        return mContext;
    }

    public static IBleCoreProvider getBleCoreProvider() {
        return sBleCoreProvider;
    }

    public static ExecutorService getExecutorService() {
        return sExecutorService;
    }

    public static IBleGreyProvider getGreyProvider() {
        return sBleGreyProvider;
    }

    public static IBluetoothService getInstance(Context context) {
        if (sInstance == null) {
            synchronized (BluetoothService.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BluetoothService(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static IReportCoreProvider getReportCoreProvider() {
        return sReportCoreProvider;
    }

    private void registerReceiver() {
        aje.b(mContext).c(this.mReceiver, new IntentFilter("action.coremanager.process_dead"));
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void callBluetoothApi(String str, int i, Bundle bundle, IBleResponse iBleResponse) {
        switch (i) {
            case 1:
                BluetoothApi.connect(str, bundle != null ? (BleConnectOptions) bundle.getParcelable(BtConstants.KEY_OPTIONS) : null, iBleResponse);
                break;
            case 2:
                long j = bundle != null ? bundle.getLong(IBluetoothService.EXTRA_DELAY, 0L) : 0L;
                if (bundle != null && bundle.getBoolean(IBluetoothService.EXTRA_FROM_RN, false) && MeshDfuManager.getInstance().isUpgrading() && TextUtils.equals(str, MeshDfuManager.getInstance().getCurrentUpgradeMac())) {
                    BluetoothLog.formatLog("BluetoothService RN request disconnect ble,but current ble device is doing OTA, so ignore it!!!", new Object[0]);
                } else {
                    BluetoothApi.disconnect(str, j);
                }
                break;
            case 3:
                BluetoothApi.read(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID), iBleResponse);
                break;
            case 4:
                BluetoothApi.write(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID), bundle.getByteArray(IBluetoothService.EXTRA_BYTE_ARRAY), iBleResponse);
                break;
            case 5:
                BluetoothApi.writeNoRsp(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID), bundle.getByteArray(IBluetoothService.EXTRA_BYTE_ARRAY), iBleResponse);
                break;
            case 6:
                BluetoothApi.notify(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID), iBleResponse);
                break;
            case 7:
                BluetoothApi.unnotify(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID));
                break;
            default:
                switch (i) {
                    case 10:
                        BluetoothApi.readRssi(str, iBleResponse);
                        break;
                    case 11:
                        BluetoothApi.writeBlock(str, bundle.getByteArray(IBluetoothService.EXTRA_BYTE_ARRAY), iBleResponse);
                        break;
                    case 12:
                        BluetoothApi.registerBlockListener(str, iBleResponse);
                        break;
                    case 13:
                        BluetoothApi.unregisterBlockListener(str);
                        break;
                    case 14:
                        BluetoothApi.requestMtu(str, bundle.getInt(IBluetoothService.EXTRA_MTU), iBleResponse);
                        break;
                    case 15:
                        BluetoothApi.indication(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID), iBleResponse);
                        break;
                    case 16:
                        BluetoothApi.unindication(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID));
                        break;
                    default:
                        switch (i) {
                            case 30:
                                BluetoothApi.disconnectAll();
                                break;
                            case 31:
                                BluetoothApi.clearDisconnection(str);
                                break;
                            case 32:
                                BluetoothApi.clearAllDisconnection();
                                break;
                            case 33:
                                BluetoothApi.bindDevice(str);
                                break;
                            case 34:
                                BluetoothApi.unBindDevice(str);
                                break;
                            case 35:
                                BluetoothApi.refreshDeviceStatus(str, bundle.getLong(IBluetoothService.EXTRA_DURATION), iBleResponse);
                                break;
                            case 36:
                                BluetoothApi.report(bundle.getString(IBluetoothService.EXTRA_KEY, ""), bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                                break;
                            case 37:
                                BluetoothApi.findComboMac(bundle.getString(IBluetoothService.EXTRA_SUBMAC, ""), iBleResponse);
                                break;
                            default:
                                switch (i) {
                                    case 40:
                                        BluetoothApi.refreshGattCache(str);
                                        break;
                                    case 41:
                                        BluetoothApi.registerCharacterChanged(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID), iBleResponse);
                                        break;
                                    case 42:
                                        BluetoothApi.unregisterCharacterChanged(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID));
                                        break;
                                    case 43:
                                        BluetoothApi.securityChipEncrypt(str, bundle.getByteArray(IBluetoothService.EXTRA_BYTE_ARRAY), iBleResponse);
                                        break;
                                    case 44:
                                        BluetoothApi.securityChipDecrypt(str, bundle.getByteArray(IBluetoothService.EXTRA_BYTE_ARRAY), iBleResponse);
                                        break;
                                    case 45:
                                        BluetoothApi.securityChipOperate(str, bundle.getInt(IBluetoothService.EXTRA_VALUE), iBleResponse);
                                        break;
                                    case 46:
                                        BluetoothApi.isBleGatewayConnected(str, iBleResponse);
                                        break;
                                    case 47:
                                        BluetoothApi.getOneTimePassword(str, bundle.getInt(IBluetoothService.EXTRA_INTERVAL), bundle.getInt(IBluetoothService.EXTRA_DIGITS), bundle.getLong(IBluetoothService.EXTRA_UTCDELAYTIEM, -1L), iBleResponse);
                                        break;
                                    case 48:
                                        BluetoothApi.getBleMeshVersion(str, iBleResponse);
                                        break;
                                    case 49:
                                        BluetoothApi.miotBleEncrypt(str, bundle.getByteArray(IBluetoothService.EXTRA_BYTE_ARRAY), iBleResponse);
                                        break;
                                    case 50:
                                        BluetoothApi.miotBleDecrypt(str, bundle.getByteArray(IBluetoothService.EXTRA_BYTE_ARRAY), iBleResponse);
                                        break;
                                    case 51:
                                        BluetoothApi.standardAuthEncrypt(str, bundle.getByteArray(IBluetoothService.EXTRA_BYTE_ARRAY), iBleResponse);
                                        break;
                                    case 52:
                                        BluetoothApi.standardAuthDecrypt(str, bundle.getByteArray(IBluetoothService.EXTRA_BYTE_ARRAY), iBleResponse);
                                        break;
                                    case 53:
                                        BluetoothApi.getBleStandardAuthFirmwareVersion(str, iBleResponse);
                                        break;
                                    case 54:
                                        BluetoothApi.isBleCharacterExist(str, (UUID) bundle.getSerializable(IBluetoothService.EXTRA_SERVICE_UUID), (UUID) bundle.getSerializable(IBluetoothService.EXTRA_CHARACTER_UUID), iBleResponse);
                                        break;
                                    case 55:
                                        BluetoothApi.initOneTimeContextBySelf(bundle.getString(IBluetoothService.EXTRA_DID), bundle.getInt(IBluetoothService.EXTRA_INTERVAL), bundle.getInt(IBluetoothService.EXTRA_DIGITS), iBleResponse);
                                        break;
                                    case 56:
                                        BluetoothApi.generateOneTimePwdBySelf(bundle.getString(IBluetoothService.EXTRA_DID), iBleResponse);
                                        break;
                                    default:
                                        BluetoothLog.debug(String.format("callBluetoothApi unknown code %d", Integer.valueOf(i)));
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void cancelBleMeshUpgrade(String str) {
        MeshDfuManager.getInstance().cancelUpgrade(str);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void getBluetoothCache(String str, int i, Bundle bundle) {
        switch (i) {
            case 1:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropName(str));
                break;
            case 2:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropDid(str));
                break;
            case 3:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropDesc(str));
                break;
            case 4:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropModel(str));
                break;
            case 5:
                bundle.putInt(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropBoundStatus(str));
                break;
            case 6:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropToken(str));
                break;
            case 7:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropExtra(str, bundle.getString(IBluetoothService.EXTRA_KEY)));
                break;
            case 8:
                bundle.putByteArray(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropScanRecord(str));
                break;
            case 9:
                bundle.putParcelable(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropGattProfile(str));
                break;
            case 10:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropOwnerId(str));
                break;
            case 11:
                bundle.putInt(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropProductId(str));
                break;
            case 12:
                bundle.putInt(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropType(str));
                break;
            case 13:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropBeaconName(str));
                break;
            case 14:
                bundle.putInt(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropRssi(str));
                break;
            case 15:
                bundle.putInt(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropPermitLevel(str));
                break;
            case 16:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropOwnerName(str));
                break;
            case 17:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropSMac(str));
                break;
            case 18:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropSessionKey(str));
                break;
            case 19:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropLtmk(str));
                break;
            case 20:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropSharedKeyId(str));
                break;
            case 21:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropPincode(str));
                break;
            case 22:
                bundle.putInt(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropLtmkEncryptType(str));
                break;
            case 23:
                bundle.putBoolean(IBluetoothService.EXTRA_RESULT, BluetoothCache.isShowPincode(str));
                break;
            case 24:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getPropMeshBindInfo(str));
                break;
            case 25:
                bundle.putString(IBluetoothService.EXTRA_RESULT, BluetoothCache.getLockShareUserKey(str));
                break;
            case 26:
                try {
                    String lockShareKeyId = BluetoothCache.getLockShareKeyId(str);
                    bundle.putInt(IBluetoothService.EXTRA_RESULT, TextUtils.isEmpty(lockShareKeyId) ? 0 : Integer.parseInt(lockShareKeyId));
                } catch (Exception unused) {
                    bundle.putInt(IBluetoothService.EXTRA_RESULT, 0);
                    return;
                }
                break;
            case 27:
                try {
                    String lockShareCreateTime = BluetoothCache.getLockShareCreateTime(str);
                    bundle.putLong(IBluetoothService.EXTRA_RESULT, TextUtils.isEmpty(lockShareCreateTime) ? 0L : Integer.parseInt(lockShareCreateTime));
                } catch (Exception unused2) {
                    bundle.putInt(IBluetoothService.EXTRA_RESULT, 0);
                    return;
                }
                break;
            default:
                switch (i) {
                    case 100:
                        bundle.putParcelableArrayList(IBluetoothService.EXTRA_DEVICES, BluetoothApi.getLocalBoundedDevices());
                        break;
                    case 101:
                        bundle.putParcelableArrayList(IBluetoothService.EXTRA_DEVICES, BluetoothApi.getLocalRemovedDevices());
                        break;
                    case 102:
                        bundle.putParcelableArrayList(IBluetoothService.EXTRA_DEVICES, BluetoothApi.getRemoteBoundedDevices());
                        break;
                    default:
                        BluetoothLog.debug(String.format("getBluetoothCache unknown code %d", Integer.valueOf(i)));
                        break;
                }
                break;
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public List<Device> getBluetoothGatewayDevices() {
        return BluetoothApi.getBluetoothGatewayDevices();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void init() {
        BluetoothCache.reloadCache();
        MiuiSDKHelper.getInstance();
        IPCChannelManager.getInstance().init();
        StandardAuthChannelManager.getInstance().init();
        SpecNotifyChannelManager.getInstance().init();
        SpecWriteChannelManager.getInstance().init();
        registerReceiver();
        BleSecurityChipOperate.init();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public byte[] miotBleDecryptSync(String str, byte[] bArr) {
        return BluetoothApi.miotBleDecryptSync(str, bArr);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public byte[] miotBleEncryptSync(String str, byte[] bArr) {
        return BluetoothApi.miotBleEncryptSync(str, bArr);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void searchBluetoothDevice(SearchRequest searchRequest, SearchResponse searchResponse) {
        BluetoothApi.searchBluetoothDevice(searchRequest, searchResponse);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void searchMiioBluetoothDevice(SearchRequest searchRequest, final IBleResponse iBleResponse) {
        BluetoothDeviceSearch.getInstance().searchMiioBluetoothDevice(searchRequest, new LocalSearchResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService.2
            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchCanceled() {
                try {
                    iBleResponse.onResponse(BtConstants.ON_SEARCH_CANCEL, null);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStarted() {
                try {
                    iBleResponse.onResponse(BtConstants.ON_SEARCH_START, null);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStopped() {
                try {
                    iBleResponse.onResponse(BtConstants.ON_SEARCH_STOP, null);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onDeviceFounded(BtDevice btDevice) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("extra.device", btDevice);
                    iBleResponse.onResponse(BtConstants.ON_DEVICE_FIND, bundle);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void setBleCoreProvider(IBleCoreProvider iBleCoreProvider) {
        if (iBleCoreProvider != null) {
            sBleCoreProvider = iBleCoreProvider;
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void setBluetoothCache(String str, int i, Bundle bundle) {
        switch (i) {
            case 1:
                BluetoothCache.setPropName(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 2:
                BluetoothCache.setPropDid(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 3:
                BluetoothCache.setPropDesc(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 4:
                BluetoothCache.setPropModel(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 5:
                BluetoothCache.setPropBoundStatus(str, bundle.getInt(IBluetoothService.EXTRA_VALUE, 0));
                break;
            case 6:
                BluetoothCache.setPropToken(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 7:
                String string = bundle.getString(IBluetoothService.EXTRA_KEY);
                if (!TextUtils.isEmpty(string)) {
                    BluetoothCache.setPropExtra(str, string, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                }
                break;
            case 8:
                BluetoothCache.setPropScanRecord(str, bundle.getByteArray(IBluetoothService.EXTRA_VALUE));
                break;
            case 9:
                BluetoothCache.setPropGattProfile(str, (BleGattProfile) bundle.getParcelable(IBluetoothService.EXTRA_VALUE));
                break;
            case 10:
                BluetoothCache.setPropOwnerId(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 11:
            case 24:
            default:
                BluetoothLog.debug(String.format("setBluetoothCache unknown code %d", Integer.valueOf(i)));
                break;
            case 12:
                BluetoothCache.setPropType(str, bundle.getInt(IBluetoothService.EXTRA_VALUE, 0));
                break;
            case 13:
                BluetoothCache.setPropBeaconName(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 14:
                BluetoothCache.setPropRssi(str, bundle.getInt(IBluetoothService.EXTRA_VALUE, -60));
                break;
            case 15:
                BluetoothCache.setPropPermitlevel(str, bundle.getInt(IBluetoothService.EXTRA_VALUE, 0));
                break;
            case 16:
                BluetoothCache.setPropOwnerName(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 17:
                BluetoothCache.setPropSMac(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 18:
                BluetoothCache.setPropSessionKey(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 19:
                BluetoothCache.setPropLtmk(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 20:
                BluetoothCache.setPropSharedKeyId(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 21:
                BluetoothCache.setPropPincode(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 22:
                BluetoothCache.setPropLtmkEncryptType(str, bundle.getInt(IBluetoothService.EXTRA_VALUE, 0));
                break;
            case 23:
                BluetoothCache.setShowPincode(str, bundle.getBoolean(IBluetoothService.EXTRA_VALUE, true));
                break;
            case 25:
                BluetoothCache.setLockShareUserKey(str, bundle.getString(IBluetoothService.EXTRA_VALUE, ""));
                break;
            case 26:
                int i2 = bundle.getInt(IBluetoothService.EXTRA_VALUE, 0);
                BluetoothCache.setLockShareKeyId(str, i2 != 0 ? String.valueOf(i2) : "");
                break;
            case 27:
                long j = bundle.getLong(IBluetoothService.EXTRA_VALUE, 0L);
                BluetoothCache.setLockShareCreateTime(str, j != 0 ? String.valueOf(j) : "");
                break;
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void setEnvironment(boolean z) {
        BluetoothContextManager.setContext(mContext, z);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void setGreyProvider(IBleGreyProvider iBleGreyProvider) {
        if (iBleGreyProvider != null) {
            sBleGreyProvider = iBleGreyProvider;
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void setReportCoreProvider(IReportCoreProvider iReportCoreProvider) {
        if (iReportCoreProvider != null) {
            sReportCoreProvider = iReportCoreProvider;
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void startBleMeshUpgrade(String str, final String str2, final String str3, String str4, final IBleMeshUpgradeResponse iBleMeshUpgradeResponse) {
        MeshDfuManager.getInstance().startUpgrade(str3, str, str4, new IBleMeshUpgradeResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService.4
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public boolean isMeshDevice() throws RemoteException {
                IBleMeshUpgradeResponse iBleMeshUpgradeResponse2 = iBleMeshUpgradeResponse;
                if (iBleMeshUpgradeResponse2 == null) {
                    return false;
                }
                return iBleMeshUpgradeResponse2.isMeshDevice();
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public void onProgress(int i) throws RemoteException {
                IBleMeshUpgradeResponse iBleMeshUpgradeResponse2 = iBleMeshUpgradeResponse;
                if (iBleMeshUpgradeResponse2 != null) {
                    iBleMeshUpgradeResponse2.onProgress(i);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public void onResponse(int i, String str5) throws RemoteException {
                IBleMeshUpgradeResponse iBleMeshUpgradeResponse2 = iBleMeshUpgradeResponse;
                if (iBleMeshUpgradeResponse2 != null) {
                    iBleMeshUpgradeResponse2.onResponse(i, str5);
                }
                if (i != 0 || TextUtils.isEmpty(str2)) {
                    return;
                }
                TextUtils.isEmpty(str3);
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void startMcuUpgrade(String str, String str2, String str3, boolean z, String str4, int i, final IBleMeshUpgradeResponse iBleMeshUpgradeResponse) {
        MeshDfuManager.getInstance().startMcuUpgrade(str2, str3, z, str, str4, i, new IBleMeshUpgradeResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService.3
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public boolean isMeshDevice() throws RemoteException {
                IBleMeshUpgradeResponse iBleMeshUpgradeResponse2 = iBleMeshUpgradeResponse;
                if (iBleMeshUpgradeResponse2 == null) {
                    return false;
                }
                return iBleMeshUpgradeResponse2.isMeshDevice();
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public void onProgress(int i2) throws RemoteException {
                IBleMeshUpgradeResponse iBleMeshUpgradeResponse2 = iBleMeshUpgradeResponse;
                if (iBleMeshUpgradeResponse2 != null) {
                    iBleMeshUpgradeResponse2.onProgress(i2);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public void onResponse(int i2, String str5) throws RemoteException {
                IBleMeshUpgradeResponse iBleMeshUpgradeResponse2 = iBleMeshUpgradeResponse;
                if (iBleMeshUpgradeResponse2 != null) {
                    iBleMeshUpgradeResponse2.onResponse(i2, str5);
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService
    public void stopSearchBluetoothDevice() {
        BluetoothDeviceSearch.getInstance().stopSearchBluetoothDevice();
    }
}
