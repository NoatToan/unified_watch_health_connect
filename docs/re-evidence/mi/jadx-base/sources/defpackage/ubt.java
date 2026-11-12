package defpackage;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class ubt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35611b;
    public Calendar c;
    public Calendar d;
    public int e;
    public int f;
    public int g;

    public ubt() {
        this(0, null, 0, 0);
    }

    public static ubt b(byte[] bArr) {
        if (bArr != null) {
            try {
                byte b2 = 2;
                if (bArr.length >= 2) {
                    ubt ubtVar = new ubt();
                    byte b3 = bArr[0];
                    ubtVar.i(bArr[1]);
                    boolean z = (b3 & 1) == 1;
                    boolean z2 = ((b3 >> 1) & 1) == 1;
                    boolean z3 = ((b3 >> 2) & 1) == 1;
                    boolean z4 = ((b3 >> 3) & 1) == 1;
                    if (z) {
                        ubtVar.c(bArr[2]);
                        b2 = (byte) 3;
                    }
                    if (z2) {
                        int i = b2 + 8;
                        ubtVar.g(ou.a(Arrays.copyOfRange(bArr, (int) b2, i)));
                        b2 = (byte) i;
                    }
                    if (z3) {
                        int i2 = b2 + 8;
                        ubtVar.d(ou.a(Arrays.copyOfRange(bArr, (int) b2, i2)));
                        b2 = (byte) i2;
                    }
                    if (z4) {
                        ubtVar.f(bArr[b2] & 255);
                    }
                    return ubtVar;
                }
            } catch (Exception e) {
                t5t.d("BatteryInfo", "parseBatteryInfo exception: " + e);
            }
        }
        return null;
    }

    public Calendar a() {
        return this.c;
    }

    public void c(int i) {
        this.g = i;
    }

    public void d(Calendar calendar) {
        this.c = calendar;
    }

    public Calendar e() {
        return this.d;
    }

    public void f(int i) {
        this.f35611b = i;
    }

    public void g(Calendar calendar) {
        this.d = calendar;
    }

    public int h() {
        return this.f35611b;
    }

    public void i(int i) {
        this.f35610a = i;
    }

    public int j() {
        return this.f35610a;
    }

    public boolean k() {
        if (this.f != 3) {
            return this.g == 1 && this.f35610a == 100;
        }
        return true;
    }

    public boolean l() {
        if (this.f != 2) {
            return this.g == 1 && this.f35610a < 100;
        }
        return true;
    }

    public String toString() {
        return "[[[ " + ubt.class.getSimpleName() + " ]]]\n           level: " + this.f35610a + "%\n lastChargeLevel: " + this.f35611b + "%\n      lastCharge: " + DateFormat.getDateTimeInstance().format(this.c.getTime()) + "\n  lastChargeFull: " + DateFormat.getDateTimeInstance().format(this.d.getTime()) + "\n         charges: " + this.e + "\n          status: " + Integer.toHexString(this.f) + "\n        dcStatus: " + Integer.toHexString(this.g) + "\n     batteryHash: " + hashCode();
    }

    public ubt(int i) {
        this(i, null, 0, 0);
    }

    public ubt(int i, Calendar calendar, int i2, int i3) {
        this.c = null;
        this.d = null;
        this.g = -1;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(1970, 1, 1);
        this.f35610a = i;
        this.c = calendar == null ? calendar2 : calendar;
        this.e = i2;
        this.f = i3;
        this.d = calendar2;
    }
}
