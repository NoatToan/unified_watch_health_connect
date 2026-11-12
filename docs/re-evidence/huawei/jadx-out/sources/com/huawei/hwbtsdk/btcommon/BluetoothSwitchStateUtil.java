package com.huawei.hwbtsdk.btcommon;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothSwitchStateUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f17011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<BtSwitchStateCallback> f17012b = new ArrayList(16);
    private final BroadcastReceiver e = new BroadcastReceiver() { // from class: com.huawei.hwbtsdk.btcommon.BluetoothSwitchStateUtil.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothAdapter defaultAdapter;
            if (intent == null) {
                LogUtil.e("BluetoothSwitchStateUtil", "intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.b("BluetoothSwitchStateUtil", "mBluetoothSwitchStateReceiver action:", action);
            if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(action) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || BluetoothSwitchStateUtil.this.f17012b == null || BluetoothSwitchStateUtil.this.f17012b.size() == 0) {
                return;
            }
            LogUtil.b("BluetoothSwitchStateUtil", "mBluetoothSwitchStateCallbackList size :", Integer.valueOf(BluetoothSwitchStateUtil.this.f17012b.size()));
            int state = defaultAdapter.getState();
            if (state == 12) {
                synchronized (BluetoothSwitchStateUtil.this.f17012b) {
                    Iterator it = BluetoothSwitchStateUtil.this.f17012b.iterator();
                    while (it.hasNext()) {
                        ((BtSwitchStateCallback) it.next()).onBtSwitchStateCallback(3);
                    }
                }
                return;
            }
            LogUtil.e("BluetoothSwitchStateUtil", "bluetoothSwitchState is error:", Integer.valueOf(state));
        }
    };

    public BluetoothSwitchStateUtil(Context context) {
        this.f17011a = null;
        if (context == null) {
            LogUtil.e("BluetoothSwitchStateUtil", "context is null");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.f17011a = applicationContext;
        } else {
            this.f17011a = context;
        }
        b();
    }

    private void b() {
        this.f17011a.registerReceiver(this.e, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public void a() {
        Context context = this.f17011a;
        if (context == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.e);
        } catch (IllegalArgumentException unused) {
            LogUtil.d("BluetoothSwitchStateUtil", "destroy IllegalArgumentException");
        }
        LogUtil.b("BluetoothSwitchStateUtil", "destroy finish.");
    }

    private List<BtSwitchStateCallback> c() {
        List<BtSwitchStateCallback> list;
        synchronized (this) {
            list = this.f17012b;
        }
        return list;
    }

    public void b(BtSwitchStateCallback btSwitchStateCallback) {
        List<BtSwitchStateCallback> list;
        if (btSwitchStateCallback == null || (list = this.f17012b) == null || list.contains(btSwitchStateCallback)) {
            return;
        }
        synchronized (c()) {
            this.f17012b.add(btSwitchStateCallback);
            LogUtil.b("BluetoothSwitchStateUtil", "Register mBtSwitchStateCallbackList size :", Integer.valueOf(this.f17012b.size()));
        }
    }

    public void d(BtSwitchStateCallback btSwitchStateCallback) {
        List<BtSwitchStateCallback> list;
        if (btSwitchStateCallback == null || (list = this.f17012b) == null || !list.contains(btSwitchStateCallback)) {
            return;
        }
        synchronized (c()) {
            this.f17012b.remove(btSwitchStateCallback);
            LogUtil.b("BluetoothSwitchStateUtil", "Unregister mBtSwitchStateCallbackList size :", Integer.valueOf(this.f17012b.size()));
        }
    }

    public void e(BtSwitchStateCallback btSwitchStateCallback) {
        if (btSwitchStateCallback == null) {
            LogUtil.e("BluetoothSwitchStateUtil", "openBluetoothSwitch callback is null");
            return;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                LogUtil.e("BluetoothSwitchStateUtil", "openBluetoothSwitch adapter is null");
                btSwitchStateCallback.onBtSwitchStateCallback(1);
                return;
            }
            if (defaultAdapter.isEnabled()) {
                btSwitchStateCallback.onBtSwitchStateCallback(3);
                return;
            }
            b(btSwitchStateCallback);
            if (Build.VERSION.SDK_INT < 33) {
                LogUtil.b("BluetoothSwitchStateUtil", "openBluetoothSwitch:", Boolean.valueOf(defaultAdapter.enable()));
                return;
            }
            try {
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                Activity activityJ = BaseApplication.j();
                if (activityJ != null) {
                    activityJ.startActivityForResult(intent, 35189);
                } else {
                    intent.setFlags(268435456);
                    BaseApplication.b().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                btSwitchStateCallback.onBtSwitchStateCallback(1);
                LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothSwitchStateUtil", "btSwitchEnable ActivityNotFoundException");
            }
        } catch (SecurityException e) {
            LogUtil.d("BluetoothSwitchStateUtil", "cancelBRDiscoveryForConnect SecurityException:", ExceptionUtils.c(e));
        }
    }
}
