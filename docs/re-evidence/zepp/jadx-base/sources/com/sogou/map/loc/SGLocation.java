package com.sogou.map.loc;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class SGLocation {
    public static final int CODE_OK = 0;
    public static final int CODE_PERMISSION_DENIED = 1;
    public static final int CODE_POSITION_UNAVAILABLE = 2;
    public static final int CODE_TIMEOUT = 3;
    public static final byte CONFIDENCE_HIGH = 3;
    public static final byte CONFIDENCE_LOW = 1;
    public static final byte CONFIDENCE_MEDIUM = 2;
    public static final byte TYPE_GPS = 4;
    public static final byte TYPE_NET = 5;
    public static final byte x = 0;
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final byte e;
    private double f;
    private double g;
    private d h;
    private double i;
    private double j;
    public double k;
    public float l;
    public float m;
    public float n;
    public byte o;
    public String p;
    public String q;
    public String r;
    public String s;
    public int t;
    public JSONObject u;
    public SGLocation v;
    public boolean w;

    public SGLocation(int i, String str) {
        this.i = 0.0d;
        this.j = 0.0d;
        this.a = i;
        this.b = str;
        this.e = (byte) 0;
        this.c = j0.b();
        this.d = j0.q();
    }

    public static SGLocation a(SGLocation sGLocation, SGLocation sGLocation2) {
        SGLocation sGLocationM3414clone = sGLocation.m3414clone();
        sGLocationM3414clone.h(sGLocation2.g, sGLocation2.f, sGLocation.h);
        sGLocationM3414clone.v = sGLocation;
        return sGLocationM3414clone;
    }

    public static double b(SGLocation sGLocation, SGLocation sGLocation2) {
        return k0.a(sGLocation.g, sGLocation.f, sGLocation2.g, sGLocation2.f);
    }

    public int c() {
        return this.a;
    }

    public long d() {
        return this.d;
    }

    public String e() {
        return this.b;
    }

    public SGLocation f() {
        return this.v;
    }

    public boolean g() {
        return this.a != 0;
    }

    public float getAccuracy() {
        return this.l;
    }

    public String getAddress() {
        return this.s;
    }

    public double getAltitude() {
        return this.k;
    }

    public float getBearing() {
        return this.n;
    }

    public String getCity() {
        return this.q;
    }

    public byte getConfidence() {
        return this.o;
    }

    public String getCounty() {
        return this.r;
    }

    public long getCreateTime() {
        return this.c;
    }

    public double getLatitude() {
        return this.j;
    }

    public double getLongitude() {
        return this.i;
    }

    public String getProvince() {
        return this.p;
    }

    public float getSpeed() {
        return this.m;
    }

    public byte getType() {
        return this.e;
    }

    public void h(double d, double d2, d dVar) {
        this.g = d;
        this.f = d2;
        this.h = dVar;
        try {
            if (dVar == d.GCJ02) {
                double[] dArrB = k0.b(d, d2);
                this.i = dArrB[0];
                this.j = dArrB[1];
            } else {
                if (dVar != d.SG) {
                    this.i = d;
                    this.j = d2;
                    return;
                }
                double[] dArrC = k0.c(d, d2);
                if (dArrC == null || dArrC.length != 2) {
                    return;
                }
                this.i = dArrC[0];
                this.j = dArrC[1];
            }
        } catch (Exception unused) {
        }
    }

    public boolean hasAltitude() {
        return this.w;
    }

    public String toString() {
        return "[SGLocation@" + this.c + ", " + this.i + ", " + this.j + "]";
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SGLocation m3414clone() {
        return new SGLocation(this);
    }

    public SGLocation(byte b) {
        this.i = 0.0d;
        this.j = 0.0d;
        this.a = 0;
        this.b = null;
        this.e = b;
        this.c = j0.b();
        this.d = j0.q();
    }

    private SGLocation(SGLocation sGLocation) {
        this.i = 0.0d;
        this.j = 0.0d;
        this.a = sGLocation.a;
        this.b = sGLocation.b;
        this.e = sGLocation.e;
        this.c = sGLocation.c;
        this.d = sGLocation.d;
        this.f = sGLocation.f;
        this.g = sGLocation.g;
        this.h = sGLocation.h;
        this.i = sGLocation.i;
        this.j = sGLocation.j;
        this.k = sGLocation.k;
        this.l = sGLocation.l;
        this.m = sGLocation.m;
        this.n = sGLocation.n;
        this.o = sGLocation.o;
        this.p = sGLocation.p;
        this.q = sGLocation.q;
        this.r = sGLocation.r;
        this.s = sGLocation.s;
        this.t = sGLocation.t;
        this.u = sGLocation.u;
    }
}
