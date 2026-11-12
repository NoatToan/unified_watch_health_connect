package com.huawei.hwbtsdk.btmanager.btdeviceservice;

import com.google.android.gms.wearable.Node;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback;
import defpackage.loc;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class WearableSwitchAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f17017a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17018c = new Object();
    private static WearableSwitchAdapter d;

    public interface ISmartWatchFoundCallback {
        void onResponse(List<Node> list);
    }

    private WearableSwitchAdapter() {
    }

    public static WearableSwitchAdapter b() {
        WearableSwitchAdapter wearableSwitchAdapter;
        synchronized (f17017a) {
            if (d == null) {
                d = new WearableSwitchAdapter();
            }
            wearableSwitchAdapter = d;
        }
        return wearableSwitchAdapter;
    }

    public BTDeviceServiceBase e(String str, BtDeviceStateCallback btDeviceStateCallback) {
        return new loc(BaseApplication.b(), str, btDeviceStateCallback);
    }
}
