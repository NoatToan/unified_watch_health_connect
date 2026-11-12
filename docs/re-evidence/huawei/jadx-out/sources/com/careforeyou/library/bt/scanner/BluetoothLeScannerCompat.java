package com.careforeyou.library.bt.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import com.careforeyou.library.enums.Protocal_Type;
import com.careforeyou.library.intface.OnWeightScalesListener;
import com.careforeyou.library.intface.SeachDeviceCallback;
import defpackage.vp;
import defpackage.vr;
import defpackage.vu;
import defpackage.wf;
import defpackage.wg;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BluetoothLeScannerCompat {
    protected static final String TAG = "CsBtUtil_v11";
    private boolean mScanning = false;
    private int mRefreshInterval = 1000;
    private OnWeightScalesListener onWeightScalesListener = null;
    private SeachDeviceCallback searchCallBack = null;
    private String mBoundMac = "";
    private Runnable mScanRunnable = new Runnable() { // from class: com.careforeyou.library.bt.scanner.BluetoothLeScannerCompat.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (BluetoothLeScannerCompat.this.isBluetoothEnable()) {
                    BluetoothLeScannerCompat.this.stopLeScanInternal();
                    if (BluetoothLeScannerCompat.this.isBluetoothEnable()) {
                        BluetoothLeScannerCompat.this.startLeScanInternal();
                        BluetoothLeScannerCompat.this.mHandler.postDelayed(this, BluetoothLeScannerCompat.this.mRefreshInterval);
                    }
                }
            } catch (Exception e) {
                wf.b(BluetoothLeScannerCompat.TAG, e.getMessage());
            }
        }
    };
    private vu lastFrame = null;
    private Timer xiangShanTimer = null;
    private final Handler mHandler = new Handler();

    protected abstract boolean startLeScanInternal();

    protected abstract void stopLeScanInternal();

    public void setWeightScalesListener(OnWeightScalesListener onWeightScalesListener) {
        this.onWeightScalesListener = onWeightScalesListener;
    }

    public void starSeachBindDevice(String str, SeachDeviceCallback seachDeviceCallback) {
        if (this.mScanning) {
            return;
        }
        this.mScanning = true;
        this.searchCallBack = seachDeviceCallback;
        this.mBoundMac = str;
        if (vp.d(this instanceof vr)) {
            this.mRefreshInterval = 1000;
            this.mHandler.post(this.mScanRunnable);
        } else {
            startLeScanInternal();
        }
    }

    public void stopSeachBindDevice() {
        this.mScanning = false;
        this.searchCallBack = null;
        this.mBoundMac = "";
        this.mHandler.removeCallbacks(this.mScanRunnable);
        stopLeScanInternal();
    }

    public void startSearching() {
        if (this.mScanning) {
            return;
        }
        this.mScanning = true;
        this.searchCallBack = null;
        if (vp.d(this instanceof vr)) {
            wf.e(TAG, "++LollipopBluetoothLeScannerImpl+");
            this.mRefreshInterval = 1000;
            this.mHandler.post(this.mScanRunnable);
        } else {
            wf.e(TAG, "++JBBluetoothLeScannerImpl+");
            this.mRefreshInterval = 30000;
            this.mHandler.post(this.mScanRunnable);
        }
    }

    public void stopSearching() {
        this.mScanning = false;
        this.mHandler.removeCallbacks(this.mScanRunnable);
        stopLeScanInternal();
    }

    protected boolean isBluetoothEnable() {
        if (BluetoothAdapter.getDefaultAdapter() != null) {
            return BluetoothAdapter.getDefaultAdapter().isEnabled() && BluetoothAdapter.getDefaultAdapter().getState() == 12;
        }
        return false;
    }

    private a getProtocalTypeByBroadcast(BluetoothDevice bluetoothDevice, byte[] bArr) {
        byte b2;
        int i;
        int i2;
        a aVar = new a();
        aVar.f4035b = Protocal_Type.UNKNOWN;
        int i3 = 0;
        boolean z = false;
        while (i3 < bArr.length && (b2 = bArr[i3]) > 0 && (i2 = (i = i3 + 1) + b2) < bArr.length) {
            try {
                byte[] bArrC = wg.c(bArr, i, b2);
                if (bArrC.length > 0) {
                    if (bArrC[0] == -1 && bArrC.length >= 4) {
                        aVar.f4034a = new byte[bArrC.length - 1];
                        aVar.f4034a = wg.c(bArrC, 1, aVar.f4034a.length);
                        byte b3 = bArrC[1];
                        if (b3 == -54 || b3 == -64 || b3 == -63 || b3 == -62) {
                            aVar.f4035b = Protocal_Type.OKOK;
                        } else if (b3 == -88 && bArrC[2] == 1) {
                            byte b4 = bArrC[3];
                        } else if (b3 == -1 && bArrC[2] == -16) {
                            byte b5 = bArrC[3];
                            if (b5 == 3) {
                                aVar.f4035b = Protocal_Type.OKOKCloudV3;
                            } else if (b5 == 16 || b5 == 17) {
                                aVar.f4035b = Protocal_Type.OKOKCloudV4;
                            } else {
                                aVar.f4035b = Protocal_Type.OKOKCloud;
                            }
                        } else if (b3 == 0 && bArrC[2] == 1) {
                            aVar.f4035b = Protocal_Type.XIANGSHAN;
                        }
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                }
                i3 = i2;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return aVar;
    }

    public void handleBroadcastInfo(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        wf.e(TAG, "++BluetoothDevice++name:" + bluetoothDevice.getName() + "++mac++" + bluetoothDevice.getAddress());
        a aVar = new a();
        if (this.searchCallBack != null && this.mBoundMac != null) {
            if (bluetoothDevice.getAddress().equalsIgnoreCase(this.mBoundMac)) {
                this.searchCallBack.success();
                return;
            }
        } else {
            aVar = getProtocalTypeByBroadcast(bluetoothDevice, bArr);
        }
        if (aVar.f4035b == Protocal_Type.OKOK || aVar.f4035b == Protocal_Type.OKOKCloud || aVar.f4035b == Protocal_Type.OKOKCloudV3 || aVar.f4035b == Protocal_Type.OKOKCloudV4 || aVar.f4035b == Protocal_Type.XIANGSHAN) {
            try {
                vu vuVar = new vu(aVar.f4034a, bluetoothDevice, i);
                vuVar.h = aVar.f4035b;
                if (vuVar.h != Protocal_Type.XIANGSHAN || vuVar.e != 1 || vuVar.f51591a == 789) {
                    OnWeightScalesListener onWeightScalesListener = this.onWeightScalesListener;
                    if (onWeightScalesListener != null) {
                        onWeightScalesListener.broadcastChipseaData(vuVar);
                        return;
                    }
                    return;
                }
                if (vuVar.i == 0.0f) {
                    this.lastFrame = vuVar;
                    addTimer();
                    return;
                }
                OnWeightScalesListener onWeightScalesListener2 = this.onWeightScalesListener;
                if (onWeightScalesListener2 != null) {
                    onWeightScalesListener2.broadcastChipseaData(vuVar);
                }
                this.lastFrame = null;
                stopTimer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void addTimer() {
        if (this.xiangShanTimer == null) {
            Timer timer = new Timer();
            this.xiangShanTimer = timer;
            timer.schedule(new TimerTask() { // from class: com.careforeyou.library.bt.scanner.BluetoothLeScannerCompat.5
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (BluetoothLeScannerCompat.this.onWeightScalesListener != null && BluetoothLeScannerCompat.this.lastFrame != null) {
                        BluetoothLeScannerCompat.this.onWeightScalesListener.broadcastChipseaData(BluetoothLeScannerCompat.this.lastFrame);
                    }
                    BluetoothLeScannerCompat.this.stopTimer();
                }
            }, 6000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopTimer() {
        Timer timer = this.xiangShanTimer;
        if (timer != null) {
            timer.cancel();
            this.xiangShanTimer = null;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f4034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Protocal_Type f4035b;

        private a() {
        }
    }
}
