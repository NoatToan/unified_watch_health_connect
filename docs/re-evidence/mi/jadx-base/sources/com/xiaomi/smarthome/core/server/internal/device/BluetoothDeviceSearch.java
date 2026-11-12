package com.xiaomi.smarthome.core.server.internal.device;

import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.bluetooth.SearchRequest;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothHelper;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BtConstants;
import com.xiaomi.smarthome.core.server.internal.bluetooth.LocalSearchResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.decorator.BluetoothDeviceDecorator;
import com.xiaomi.smarthome.core.server.internal.bluetooth.decorator.BluetoothDeviceDidDecorator;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.BluetoothRecognizeResult;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.BluetoothRecognizer;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.IBluetoothRecognizeResponse;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchHelper;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResponse;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ListUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothDeviceSearch {
    private static volatile BluetoothDeviceSearch sInstance;
    private volatile boolean mScanning;
    private ScheduledFuture mScheduledFuture;
    private LocalSearchResponse mSearchResponse;
    private final BluetoothSearchResponse mBluetoothSearchResponse = new BluetoothSearchResponse() { // from class: com.xiaomi.smarthome.core.server.internal.device.BluetoothDeviceSearch.3
        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onSearchCanceled() {
            BluetoothDeviceSearch.this.processSearchCanceled();
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onSearchStarted() {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onSearchStopped() {
            BluetoothDeviceSearch.this.processSearchStopped();
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onDeviceFounded(BluetoothSearchResult bluetoothSearchResult) {
            BluetoothDeviceSearch.this.processDeviceFounded(bluetoothSearchResult);
        }
    };
    private HashMap<String, Device> mRecognizedDevices = new HashMap<>();
    private HashMap<String, Device> mRemoteDevices = new HashMap<>();
    private ScheduledExecutorService mExecutorService = Executors.newSingleThreadScheduledExecutor();

    public class SearchTask implements Runnable {
        SearchRequest request;

        public SearchTask(SearchRequest searchRequest) {
            this.request = searchRequest == null ? getDefaultSearchRequest() : searchRequest;
        }

        private SearchRequest getDefaultSearchRequest() {
            return new SearchRequest.Builder().searchBluetoothLeDevice(10000).searchBluetoothClassicDevice(10000).build();
        }

        @Override // java.lang.Runnable
        public void run() {
            BluetoothDeviceSearch.this.processSearchStarted();
            BluetoothDeviceSearch.this.processConnectedBleDevices();
            BluetoothDeviceSearch.this.startSearchBluetoothDevice(this.request);
        }
    }

    private BluetoothDeviceSearch() {
    }

    private boolean addRecognizedDevice(BtDevice btDevice) {
        synchronized (this.mRecognizedDevices) {
            try {
                if (this.mRecognizedDevices.containsKey(btDevice.getMac())) {
                    return false;
                }
                this.mRecognizedDevices.put(btDevice.getMac(), btDevice);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void broadcastRemoteDevices(ArrayList<BtDevice> arrayList) {
        Intent intent = new Intent(BtConstants.ACTION_REMOTE_REFRESHED);
        intent.putParcelableArrayListExtra("extra.device", arrayList);
        BluetoothUtils.sendBroadcast(intent);
    }

    private void clearDeviceCache() {
        synchronized (this.mRecognizedDevices) {
            this.mRecognizedDevices.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decorRecognizedDevice(BtDevice btDevice) {
        BluetoothDeviceDecorator.getInstance().decorate(btDevice);
    }

    private void executeDelayed(SearchTask searchTask, long j) {
        this.mScheduledFuture = this.mExecutorService.schedule(searchTask, j, TimeUnit.MILLISECONDS);
    }

    public static BluetoothDeviceSearch getInstance() {
        if (sInstance == null) {
            synchronized (BluetoothDeviceSearch.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BluetoothDeviceSearch();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processConnectedBleDevices() {
        ArrayList<BluetoothSearchResult> arrayList = new ArrayList();
        arrayList.addAll(BluetoothUtils.getConnectedBluetoothLeDevices());
        arrayList.addAll(BluetoothUtils.getBondedBluetoothClassicDevices());
        if (ListUtils.isEmpty(arrayList)) {
            return;
        }
        for (BluetoothSearchResult bluetoothSearchResult : arrayList) {
            BluetoothLog.v(String.format("Connected Device: %s", bluetoothSearchResult));
            BluetoothRecognizeResult bluetoothRecognizeResultRecognizeSync = BluetoothRecognizer.getInstance().recognizeSync(bluetoothSearchResult, 30000);
            BluetoothLog.v(String.format("Connected Device recognize Device: %s, result.model: %s, isBleDevice: %b, isBleDeviceConnected: %b", bluetoothSearchResult, bluetoothRecognizeResultRecognizeSync.model, Boolean.valueOf(bluetoothSearchResult.isBleDevice()), Boolean.valueOf(BluetoothUtils.isBleDeviceConnected(bluetoothSearchResult.getDevice()))));
            if (!TextUtils.isEmpty(bluetoothRecognizeResultRecognizeSync.model)) {
                BtDevice btDevice = new BtDevice(bluetoothSearchResult);
                btDevice.setModel(bluetoothRecognizeResultRecognizeSync.model);
                decorRecognizedDevice(btDevice);
                if (btDevice.isLocalBoundDevice()) {
                    btDevice.setLocalBounded();
                }
                processDeviceRecognized(btDevice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDeviceFounded(final BluetoothSearchResult bluetoothSearchResult) {
        BluetoothRecognizer.getInstance().recognizeAsync(bluetoothSearchResult, new IBluetoothRecognizeResponse() { // from class: com.xiaomi.smarthome.core.server.internal.device.BluetoothDeviceSearch.2
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.IBluetoothRecognizeResponse
            public void onRecognized(BluetoothRecognizeResult bluetoothRecognizeResult) {
                if (bluetoothRecognizeResult == null || TextUtils.isEmpty(bluetoothRecognizeResult.model)) {
                    return;
                }
                BtDevice btDevice = new BtDevice(bluetoothSearchResult);
                btDevice.setModel(bluetoothRecognizeResult.model);
                btDevice.setPacket(bluetoothRecognizeResult.packet);
                BluetoothDeviceSearch.this.decorRecognizedDevice(btDevice);
                BluetoothCache.setPropScanRecord(bluetoothSearchResult.getAddress(), bluetoothSearchResult.getScanRecord());
                BluetoothDeviceSearch.this.processDeviceRecognized(btDevice);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDeviceRecognized(BtDevice btDevice) {
        BluetoothCache.setPropRssi(btDevice.getMac(), btDevice.getRssi());
        addRecognizedDevice(btDevice);
        LocalSearchResponse localSearchResponse = this.mSearchResponse;
        if (localSearchResponse != null) {
            localSearchResponse.onDeviceFounded(btDevice);
        }
    }

    private void processRemoteDevicesInner(ArrayList<BtDevice> arrayList) {
        this.mRemoteDevices.clear();
        resetMiuiBoundedDevices(arrayList);
        ArrayList<BtDevice> remoteBoundedDevices = BluetoothCache.getRemoteBoundedDevices();
        HashSet<String> hashSet = new HashSet();
        if (remoteBoundedDevices != null && remoteBoundedDevices.size() > 0) {
            Iterator<BtDevice> it = remoteBoundedDevices.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getMac());
            }
        }
        if (!ListUtils.isEmpty(arrayList)) {
            for (BtDevice btDevice : arrayList) {
                String mac = btDevice.getMac();
                this.mRemoteDevices.put(mac, btDevice);
                BluetoothCache.setPropName(mac, btDevice.getName());
                BluetoothCache.setPropDid(mac, btDevice.getDid());
                String propToken = BluetoothCache.getPropToken(mac);
                if (!TextUtils.equals(btDevice.getToken(), propToken)) {
                    BluetoothMyLogger.d(String.format("check %s local(empty=%s) and remote(empty=%s) token not equal!", btDevice.getName(), String.valueOf(TextUtils.isEmpty(propToken)), String.valueOf(TextUtils.isEmpty(btDevice.getToken()))));
                    BluetoothCache.setPropToken(mac, "");
                    BluetoothCache.setPropToken(mac, btDevice.getToken());
                    BluetoothCache.setPropLtmk(mac, "");
                    BluetoothCache.setPropPincode(mac, "");
                    BluetoothCache.setPropLtmkEncryptType(mac, 0);
                    BluetoothCache.setShowPincode(mac, true);
                }
                BluetoothCache.setPropModel(mac, btDevice.getModel());
                BluetoothCache.setPropSharedKeyId(mac, btDevice.getKeyId());
                BluetoothCache.setPropProductId(mac, BluetoothHelper.getProductId(mac));
                try {
                    String strOptString = TextUtils.isEmpty(btDevice.getPropInfo()) ? "" : new JSONObject(btDevice.getPropInfo()).optString("smac", "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        BluetoothCache.setPropSMac(mac, strOptString);
                    }
                } catch (Throwable th) {
                    BluetoothLog.e(th);
                }
                BluetoothCache.setPropPermitlevel(mac, btDevice.getPermitLevel());
                BluetoothCache.setPropOwnerName(mac, btDevice.getOwnerName());
                if (TextUtils.isEmpty(btDevice.getOwnerId())) {
                    BluetoothCache.setPropOwnerId(mac, BluetoothService.getBleCoreProvider().getMiId());
                } else {
                    BluetoothCache.setPropOwnerId(mac, btDevice.getOwnerId());
                }
                BluetoothCache.setPropBoundStatus(mac, 2);
                hashSet.remove(mac);
                if (BluetoothLog.isShowSearchLog()) {
                    BluetoothLog.w(String.format("Remote Ble Device: %s", btDevice));
                }
            }
        }
        if (hashSet.size() > 0) {
            for (String str : hashSet) {
                BluetoothMyLogger.d("BluetoothDeviceSearch set device NOT_BOUNDED: " + str);
                BluetoothCache.setPropBoundStatus(str, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSearchCanceled() {
        this.mScanning = false;
        this.mScheduledFuture = null;
        BluetoothUtils.sendBroadcast(BtConstants.ACTION_SEARCH_CANCELED);
        LocalSearchResponse localSearchResponse = this.mSearchResponse;
        if (localSearchResponse != null) {
            localSearchResponse.onSearchCanceled();
        }
        this.mSearchResponse = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSearchStarted() {
        BluetoothUtils.sendBroadcast(BtConstants.ACTION_SEARCH_START);
        LocalSearchResponse localSearchResponse = this.mSearchResponse;
        if (localSearchResponse != null) {
            localSearchResponse.onSearchStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSearchStopped() {
        this.mScanning = false;
        this.mScheduledFuture = null;
        BluetoothUtils.sendBroadcast(BtConstants.ACTION_SEARCH_STOP);
        LocalSearchResponse localSearchResponse = this.mSearchResponse;
        if (localSearchResponse != null) {
            localSearchResponse.onSearchStopped();
        }
        this.mSearchResponse = null;
    }

    private void resetMiuiBoundedDevices(List<BtDevice> list) {
        for (BtDevice btDevice : BluetoothCache.getMiuiBoundedDevices()) {
            if (!list.contains(btDevice)) {
                BluetoothApi.disconnect(btDevice.getMac(), 0L);
                BluetoothApi.unBindDevice(btDevice.getMac());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSearchBluetoothDevice(SearchRequest searchRequest) {
        BluetoothSearchHelper.getInstance().startSearch(searchRequest.transform(), this.mBluetoothSearchResponse);
    }

    public List<Device> getLocalBluetoothDevices() {
        ArrayList arrayList = new ArrayList();
        ArrayList<BtDevice> localBoundedDevices = BluetoothCache.getLocalBoundedDevices();
        synchronized (this.mRecognizedDevices) {
            try {
                for (BtDevice btDevice : localBoundedDevices) {
                    if (!arrayList.contains(btDevice)) {
                        arrayList.add(btDevice);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BluetoothDeviceDidDecorator.getInstance().decorate((BtDevice) ((Device) it.next()));
        }
        return arrayList;
    }

    public void processRemoteDevices(List<Device> list) {
        ArrayList<BtDevice> arrayList = new ArrayList<>();
        for (Device device : list) {
            if (device.getPid() == 6 || TextUtils.equals(device.getModel(), "lumi.lock.wbmcn1") || BluetoothService.getBleCoreProvider().isBluetoothSecurityChipDevice(device.getModel())) {
                arrayList.add(new BtDevice(device));
            }
        }
        synchronized (this.mRemoteDevices) {
            processRemoteDevicesInner(arrayList);
        }
    }

    public void searchMiioBluetoothDevice(SearchRequest searchRequest, LocalSearchResponse localSearchResponse) {
        if (BluetoothUtils.isBluetoothEnabledInKuailian()) {
            if (this.mScanning) {
                BluetoothLog.w("BluetoothDeviceSearch current request execute,please cancel");
                return;
            }
            this.mScanning = true;
            clearDeviceCache();
            this.mSearchResponse = localSearchResponse;
            executeDelayed(new SearchTask(searchRequest), 500L);
        }
    }

    public void stopSearchBluetoothDevice() {
        this.mExecutorService.execute(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.device.BluetoothDeviceSearch.1
            @Override // java.lang.Runnable
            public void run() {
                if (BluetoothDeviceSearch.this.mScheduledFuture != null && !BluetoothDeviceSearch.this.mScheduledFuture.isDone()) {
                    try {
                        BluetoothDeviceSearch.this.mScheduledFuture.cancel(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    BluetoothDeviceSearch.this.processSearchCanceled();
                }
                BluetoothSearchHelper.getInstance().cancelSearch(null);
            }
        });
    }
}
