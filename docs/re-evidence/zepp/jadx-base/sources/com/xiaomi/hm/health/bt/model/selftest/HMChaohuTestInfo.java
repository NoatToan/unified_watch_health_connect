package com.xiaomi.hm.health.bt.model.selftest;

import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes19.dex */
public class HMChaohuTestInfo {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    private byte[] l;

    public HMChaohuTestInfo() {
        this.e = -1;
        this.l = null;
    }

    public int getBarometerDelta() {
        return this.i;
    }

    public int getBarometerValue() {
        return this.h;
    }

    public int getGeomagnetic() {
        return this.j;
    }

    public int getMotorGValue() {
        return this.k;
    }

    public boolean isBarometerOK() {
        return this.b;
    }

    public boolean isChargingOK() {
        return this.f;
    }

    public boolean isFlashOK() {
        return this.c;
    }

    public boolean isGpsOK() {
        return this.a;
    }

    public boolean isGsensorOK() {
        return this.e == 0;
    }

    public boolean isMotorOK() {
        return this.d;
    }

    public boolean isPPGOK() {
        return this.g;
    }

    public void setBarometerDelta(int barometerDelta) {
        this.i = barometerDelta;
    }

    public void setBarometerOK(boolean barometerOK) {
        this.b = barometerOK;
    }

    public void setBarometerValue(int barometerValue) {
        this.h = barometerValue;
    }

    public void setChargingOK(boolean chargingOK) {
        this.f = chargingOK;
    }

    public void setFlashOK(boolean flashOK) {
        this.c = flashOK;
    }

    public void setGeomagnetic(int geomagnetic) {
        this.j = geomagnetic;
    }

    public void setGpsOK(boolean gpsOK) {
        this.a = gpsOK;
    }

    public void setGsensorStatus(int status) {
        this.e = status;
    }

    public void setMotorGValue(int motorGValue) {
        this.k = motorGValue;
    }

    public void setMotorOK(boolean motorOK) {
        this.d = motorOK;
    }

    public void setPPGOK(boolean ppgok) {
        this.g = ppgok;
    }

    public String toString() {
        return "\n" + GattUtils.bytesToHexString(this.l) + "\nisGpsOK          = " + this.a + "\nisBarometerOK    = " + this.b + "\nisFlashOK        = " + this.c + "\nisMotorOK        = " + this.d + "\ngsensorStatus    = " + this.e + "\nisChargingOK     = " + this.f + "\nisPPGOK          = " + this.g + "\nbarometerValue   = " + this.h + "\nbarometerDelta   = " + this.i + "\ngeomagnetic      = " + this.j + "\nmotorGValue      = " + this.k;
    }

    public HMChaohuTestInfo(byte[] value) {
        this.e = -1;
        this.l = null;
        this.l = value;
    }
}
