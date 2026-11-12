package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.util.Task;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothRecognizer {
    private static final IBluetoothRecognizer[] BlUETOOTH_RECOGNIZERS = {BluetoothBeaconRecognizer.newInstance(), BluetoothCacheRecognizer.newInstance(), BluetoothFilterRecognizer.newInstance()};
    private static BluetoothRecognizer sInstance;
    private ConcurrentHashMap<String, MiotBleAdvPacket> rawPacketMap = new ConcurrentHashMap<>();
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private final Executor mRecognizeExecutor = Executors.newScheduledThreadPool(1);

    public class BluetoothRecognizeTask extends Task {
        BluetoothSearchResult device;
        IBluetoothRecognizeResponse response;

        public BluetoothRecognizeTask(BluetoothSearchResult bluetoothSearchResult, IBluetoothRecognizeResponse iBluetoothRecognizeResponse) {
            this.device = bluetoothSearchResult;
            this.response = iBluetoothRecognizeResponse;
        }

        private void onRecognizeResponse(final BluetoothRecognizeResult bluetoothRecognizeResult) {
            BluetoothRecognizer.this.mHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.BluetoothRecognizer.BluetoothRecognizeTask.1
                @Override // java.lang.Runnable
                public void run() {
                    IBluetoothRecognizeResponse iBluetoothRecognizeResponse = BluetoothRecognizeTask.this.response;
                    if (iBluetoothRecognizeResponse != null) {
                        iBluetoothRecognizeResponse.onRecognized(bluetoothRecognizeResult);
                    }
                }
            });
        }

        @Override // com.xiaomi.smarthome.library.common.util.Task
        public void doInBackground() {
            BluetoothRecognizeResult bluetoothRecognizeResult = new BluetoothRecognizeResult();
            IBluetoothRecognizer[] iBluetoothRecognizerArr = BluetoothRecognizer.BlUETOOTH_RECOGNIZERS;
            int length = iBluetoothRecognizerArr.length;
            int i = 0;
            while (i < length) {
                IBluetoothRecognizer iBluetoothRecognizer = iBluetoothRecognizerArr[i];
                BluetoothRecognizeResult bluetoothRecognizeResultRecognize = iBluetoothRecognizer.recognize(this.device);
                if (bluetoothRecognizeResultRecognize != null && bluetoothRecognizeResultRecognize.packet4Pid != null) {
                    ConcurrentHashMap concurrentHashMap = BluetoothRecognizer.this.rawPacketMap;
                    MiotBleAdvPacket miotBleAdvPacket = bluetoothRecognizeResultRecognize.packet4Pid;
                    concurrentHashMap.put(miotBleAdvPacket.mac, miotBleAdvPacket);
                }
                if (bluetoothRecognizeResultRecognize != null && !TextUtils.isEmpty(bluetoothRecognizeResultRecognize.model)) {
                    if ("xiaomi.ble.v1".equalsIgnoreCase(bluetoothRecognizeResultRecognize.model)) {
                        bluetoothRecognizeResultRecognize.model = "";
                    } else if (!TextUtils.isEmpty(bluetoothRecognizeResultRecognize.model)) {
                        if (BluetoothLog.isShowSearchLog()) {
                            BluetoothLog.v(String.format("recognize %s by %s: %s", this.device.getAddress(), iBluetoothRecognizer.getClass().getSimpleName(), bluetoothRecognizeResultRecognize.model));
                        }
                        BluetoothCache.setPropModel(this.device.getAddress(), bluetoothRecognizeResultRecognize.model);
                        if (!BluetoothService.getBleCoreProvider().isPluginDevice(bluetoothRecognizeResultRecognize.model)) {
                            BluetoothLog.e(String.format("Model %s is not plugin", bluetoothRecognizeResultRecognize.model));
                        }
                    }
                    bluetoothRecognizeResult = bluetoothRecognizeResultRecognize;
                    break;
                }
                i++;
                bluetoothRecognizeResult = bluetoothRecognizeResultRecognize;
            }
            onRecognizeResponse(bluetoothRecognizeResult);
        }
    }

    private BluetoothRecognizer() {
    }

    public static BluetoothRecognizer getInstance() {
        if (sInstance == null) {
            sInstance = new BluetoothRecognizer();
        }
        return sInstance;
    }

    public void clearRawPackets() {
        this.rawPacketMap.clear();
    }

    public ConcurrentHashMap<String, MiotBleAdvPacket> getRawPacketMap() {
        return this.rawPacketMap;
    }

    public void recognizeAsync(BluetoothSearchResult bluetoothSearchResult, IBluetoothRecognizeResponse iBluetoothRecognizeResponse) {
        Task.execute(new BluetoothRecognizeTask(bluetoothSearchResult, iBluetoothRecognizeResponse), this.mRecognizeExecutor);
    }

    public BluetoothRecognizeResult recognizeSync(BluetoothSearchResult bluetoothSearchResult, int i) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final BluetoothRecognizeResult bluetoothRecognizeResult = new BluetoothRecognizeResult();
        recognizeAsync(bluetoothSearchResult, new IBluetoothRecognizeResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.BluetoothRecognizer.1
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.IBluetoothRecognizeResponse
            public void onRecognized(BluetoothRecognizeResult bluetoothRecognizeResult2) {
                if (bluetoothRecognizeResult2 != null) {
                    bluetoothRecognizeResult.clone(bluetoothRecognizeResult2);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        return bluetoothRecognizeResult;
    }

    public BluetoothRecognizeResult recognizeSync(BluetoothSearchResult bluetoothSearchResult) {
        return recognizeSync(bluetoothSearchResult, 5000);
    }
}
