package com.huami.mifit.sportlib.services;

import android.os.RemoteException;
import com.huami.mifit.sportlib.callback.IServiceSportCallback;
import com.huami.mifit.sportlib.locate.GPSSignal;
import com.huami.mifit.sportlib.logkit.LogKit;

/* JADX INFO: loaded from: classes11.dex */
class a {
    private int a = GPSSignal.SignalLevel.DEFAULT.getValue();
    private long b = 0;
    private IServiceSportCallback c;

    public int a() {
        return this.a;
    }

    public void b(int i) {
        IServiceSportCallback iServiceSportCallback;
        if (System.currentTimeMillis() - this.b > 20000) {
            this.b = System.currentTimeMillis();
            LogKit.w2f("TestGPS", "notifyUIStateChanged update forUI=" + i + ",avail=" + GPSSignal.SignalLevel.isAvailable(i) + ",mCurr=" + this.a);
        }
        if (this.a == i || (iServiceSportCallback = this.c) == null) {
            return;
        }
        try {
            this.a = i;
            iServiceSportCallback.onGPSSignalChanged(i);
        } catch (RemoteException e) {
            LogKit.w2f("TestGPS", "notifyUIStateChanged:" + e.toString());
        }
    }

    public void c() {
        this.a = GPSSignal.SignalLevel.DEFAULT.getValue();
    }

    public void d(IServiceSportCallback iServiceSportCallback) {
        this.c = iServiceSportCallback;
    }
}
