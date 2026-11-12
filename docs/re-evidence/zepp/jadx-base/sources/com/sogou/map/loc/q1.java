package com.sogou.map.loc;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

/* JADX INFO: loaded from: classes18.dex */
final class q1 extends PhoneStateListener {
    private /* synthetic */ p1 a;

    public q1(p1 p1Var) {
        this.a = p1Var;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCellLocationChanged(CellLocation cellLocation) {
        try {
            this.a.h(cellLocation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
    }
}
