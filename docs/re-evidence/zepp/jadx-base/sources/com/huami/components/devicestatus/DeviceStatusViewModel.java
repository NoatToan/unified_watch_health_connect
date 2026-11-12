package com.huami.components.devicestatus;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceStatusViewModel extends ViewModel {
    private DeviceStatusDataSource d;
    private DeviceStatusDelegate e;
    public final MutableLiveData<Boolean> a = new MutableLiveData<>();
    public final MutableLiveData<Boolean> b = new MutableLiveData<>();
    public final MediatorLiveData<c> c = new MediatorLiveData<>();
    private b f = new b(this);
    private DeviceStatusListener g = new a();

    public class a implements DeviceStatusListener {
        public a() {
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onConnected(int i) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                if (DeviceStatusViewModel.this.d.hasBoundExpectedDevice()) {
                    DeviceStatusViewModel.this.r(true);
                } else {
                    DeviceStatusViewModel.this.u();
                }
            }
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onConnecting(int i) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                if (DeviceStatusViewModel.this.d.hasBoundExpectedDevice()) {
                    DeviceStatusViewModel.this.s();
                } else {
                    DeviceStatusViewModel.this.u();
                }
            }
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onConnectingTimeout(int i) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                if (!DeviceStatusViewModel.this.d.hasBoundExpectedDevice()) {
                    DeviceStatusViewModel.this.u();
                } else if (l.b()) {
                    DeviceStatusViewModel.this.t();
                } else {
                    DeviceStatusViewModel.this.v();
                }
            }
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onDisconnected(int i) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                if (!DeviceStatusViewModel.this.d.hasBoundExpectedDevice()) {
                    DeviceStatusViewModel.this.u();
                } else if (l.b()) {
                    DeviceStatusViewModel.this.s();
                } else {
                    DeviceStatusViewModel.this.v();
                }
            }
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onStartSyncAGPS(int i) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                DeviceStatusViewModel.this.o();
                DeviceStatusViewModel.this.y(0);
                DeviceStatusViewModel.this.q(false);
            }
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onStartSyncData(int i) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                DeviceStatusViewModel.this.o();
                DeviceStatusViewModel.this.z(0);
                DeviceStatusViewModel.this.q(false);
            }
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onStopSyncAGPS(int i, boolean z) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                DeviceStatusViewModel.this.q(true);
                if (z) {
                    DeviceStatusViewModel.this.w();
                }
            }
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onStopSyncData(int i, boolean z) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                DeviceStatusViewModel.this.q(true);
                if (z) {
                    DeviceStatusViewModel.this.x();
                }
            }
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onSynchronizingAGPS(int i, int i2) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                DeviceStatusViewModel.this.y(Integer.valueOf(i2));
            }
        }

        @Override // com.huami.components.devicestatus.DeviceStatusListener
        public void onSynchronizingData(int i, int i2) {
            if (DeviceStatusViewModel.this.d.isExpectedDeviceType(i)) {
                DeviceStatusViewModel.this.z(Integer.valueOf(i2));
            }
        }
    }

    public static class b extends Handler {
        public WeakReference<DeviceStatusViewModel> a;

        public b(DeviceStatusViewModel deviceStatusViewModel) {
            this.a = new WeakReference<>(deviceStatusViewModel);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DeviceStatusViewModel deviceStatusViewModel = this.a.get();
            if (deviceStatusViewModel != null && message.what == 0) {
                deviceStatusViewModel.q(((Boolean) message.obj).booleanValue());
            }
        }
    }

    public static class c {
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;
        public Integer g = null;
        public Integer h = null;
    }

    public DeviceStatusViewModel(@NonNull DeviceStatusDelegate deviceStatusDelegate) {
        this.e = deviceStatusDelegate;
        DeviceStatusDataSource dataSource = deviceStatusDelegate.getDataSource();
        this.d = dataSource;
        if (dataSource == null) {
            throw new IllegalStateException("Missing called DeviceStatusDelegate.getInstance().setDataSource()");
        }
        this.e.registerDeviceStatusListener(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f.removeMessages(0);
    }

    private c p() {
        c value = this.c.getValue();
        if (value == null) {
            value = new c();
        }
        value.a = false;
        value.b = false;
        value.c = false;
        value.d = false;
        value.e = false;
        value.f = false;
        value.g = null;
        value.h = null;
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(boolean z) {
        this.b.postValue(Boolean.valueOf(!z));
        this.a.postValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(boolean z) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = Boolean.valueOf(z);
        this.f.sendMessageDelayed(messageObtain, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        c cVarP = p();
        cVarP.c = true;
        this.c.postValue(cVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        c cVarP = p();
        cVarP.d = true;
        this.c.postValue(cVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        c cVarP = p();
        cVarP.b = true;
        this.c.postValue(cVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        c cVarP = p();
        cVarP.a = true;
        this.c.postValue(cVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        c cVarP = p();
        cVarP.f = true;
        this.c.postValue(cVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        c cVarP = p();
        cVarP.e = true;
        this.c.postValue(cVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Integer num) {
        c cVarP = p();
        cVarP.h = num;
        this.c.postValue(cVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Integer num) {
        c cVarP = p();
        cVarP.g = num;
        this.c.postValue(cVarP);
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        o();
        this.e.unregisterDeviceStatusListener(this.g);
    }

    public void refresh() {
        if (!l.b()) {
            v();
            return;
        }
        if (!this.d.hasBoundExpectedDevice()) {
            u();
            return;
        }
        if (!this.d.isConnectedExpectedDevice()) {
            s();
            return;
        }
        int syncDataProgress = this.d.getSyncDataProgress();
        int syncAGPSProgress = this.d.getSyncAGPSProgress();
        if (syncDataProgress >= 0) {
            this.a.postValue(Boolean.FALSE);
            z(Integer.valueOf(syncDataProgress));
        } else if (this.d.isSyncFailed()) {
            x();
        } else if (syncAGPSProgress >= 0) {
            this.a.postValue(Boolean.FALSE);
            y(Integer.valueOf(syncAGPSProgress));
        } else {
            this.b.postValue(Boolean.FALSE);
            this.a.postValue(Boolean.TRUE);
        }
    }

    public void startSyncData() {
        this.d.startSyncData();
    }
}
