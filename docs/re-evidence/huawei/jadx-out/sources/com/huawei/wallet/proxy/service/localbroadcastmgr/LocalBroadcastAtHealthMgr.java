package com.huawei.wallet.proxy.service.localbroadcastmgr;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes45.dex */
class LocalBroadcastAtHealthMgr implements ILocalBroadcastMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30030b = "LocalBroadcastAtHealthMgr";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f30031c;

    public LocalBroadcastAtHealthMgr() {
        try {
            this.f30031c = Class.forName("com.huawei.haf.localbroadcastmanager.LocalBroadcastManager").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException unused) {
            Log.e(f30030b, "catch ClassNotFoundException on new LocalBroadcastMgr");
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            Log.e(f30030b, "catch IllegalAccessException | InvocationTargetException on new LocalBroadcastMgr");
        } catch (NoSuchMethodException unused3) {
            Log.e(f30030b, "catch NoSuchMethodException on new LocalBroadcastMgr");
        }
    }

    @Override // com.huawei.wallet.proxy.service.localbroadcastmgr.ILocalBroadcastMgr
    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            this.f30031c.getClass().getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class).invoke(this.f30031c, broadcastReceiver, intentFilter);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            Log.e(f30030b, "catch IllegalAccessException | InvocationTargetException on registerReceiver");
        } catch (NoSuchMethodException unused2) {
            Log.e(f30030b, "catch NoSuchMethodException on registerReceiver");
        }
    }

    @Override // com.huawei.wallet.proxy.service.localbroadcastmgr.ILocalBroadcastMgr
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            this.f30031c.getClass().getMethod("unregisterReceiver", BroadcastReceiver.class).invoke(this.f30031c, broadcastReceiver);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            Log.e(f30030b, "catch IllegalAccessException | InvocationTargetException on unregisterReceiver");
        } catch (NoSuchMethodException unused2) {
            Log.e(f30030b, "catch NoSuchMethodException on unregisterReceiver");
        }
    }

    @Override // com.huawei.wallet.proxy.service.localbroadcastmgr.ILocalBroadcastMgr
    public boolean sendBroadcast(Intent intent) {
        try {
            Object objInvoke = this.f30031c.getClass().getMethod("sendBroadcast", Intent.class).invoke(this.f30031c, intent);
            return objInvoke != null && ((Boolean) objInvoke).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            Log.e(f30030b, "catch IllegalAccessException | InvocationTargetException on sendBroadcast");
            return false;
        } catch (NoSuchMethodException unused2) {
            Log.e(f30030b, "catch NoSuchMethodException on sendBroadcast");
            return false;
        }
    }

    @Override // com.huawei.wallet.proxy.service.localbroadcastmgr.ILocalBroadcastMgr
    public void sendBroadcastSync(Intent intent) {
        try {
            this.f30031c.getClass().getMethod("sendBroadcastSync", Intent.class).invoke(this.f30031c, intent);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            Log.e(f30030b, "catch IllegalAccessException | InvocationTargetException on sendBroadcastSync");
        } catch (NoSuchMethodException unused2) {
            Log.e(f30030b, "catch NoSuchMethodException on sendBroadcastSync");
        }
    }
}
