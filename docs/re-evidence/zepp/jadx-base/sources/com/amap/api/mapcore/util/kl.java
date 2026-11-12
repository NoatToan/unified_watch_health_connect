package com.amap.api.mapcore.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class kl {
    private static kl b;
    private kp c = null;
    private long d = 0;
    private long e = 0;
    public long a = 0;

    private kl() {
    }

    public static synchronized kl a() {
        if (b == null) {
            b = new kl();
        }
        return b;
    }

    public final kp a(kp kpVar) {
        if (ki.b() - this.a > 30000) {
            this.c = kpVar;
            this.a = ki.b();
            return this.c;
        }
        this.a = ki.b();
        if (!kt.a(this.c) || !kt.a(kpVar)) {
            this.d = ki.b();
            this.c = kpVar;
            return kpVar;
        }
        if (kpVar.getTime() == this.c.getTime() && kpVar.getAccuracy() < 300.0f) {
            return kpVar;
        }
        if (kpVar.getProvider().equalsIgnoreCase("gps")) {
            this.d = ki.b();
            this.c = kpVar;
            return kpVar;
        }
        if (kpVar.c() != this.c.c()) {
            this.d = ki.b();
            this.c = kpVar;
            return kpVar;
        }
        if (!kpVar.getBuildingId().equals(this.c.getBuildingId()) && !TextUtils.isEmpty(kpVar.getBuildingId())) {
            this.d = ki.b();
            this.c = kpVar;
            return kpVar;
        }
        float fA = ki.a(new double[]{kpVar.getLatitude(), kpVar.getLongitude(), this.c.getLatitude(), this.c.getLongitude()});
        float accuracy = this.c.getAccuracy();
        float accuracy2 = kpVar.getAccuracy();
        float f = accuracy2 - accuracy;
        long jB = ki.b();
        long j = jB - this.d;
        if ((accuracy < 101.0f && accuracy2 > 299.0f) || (accuracy > 299.0f && accuracy2 > 299.0f)) {
            long j2 = this.e;
            if (j2 == 0) {
                this.e = jB;
            } else if (jB - j2 > 30000) {
                this.d = jB;
                this.c = kpVar;
                this.e = 0L;
                return kpVar;
            }
            return this.c;
        }
        if (accuracy2 < 101.0f && accuracy > 299.0f) {
            this.d = jB;
            this.c = kpVar;
            this.e = 0L;
            return kpVar;
        }
        if (accuracy2 <= 299.0f) {
            this.e = 0L;
        }
        if (fA < 10.0f && fA > 0.1d && accuracy2 > 5.0f) {
            if (f < -300.0f && accuracy / accuracy2 >= 2.0f) {
                this.d = jB;
                this.c = kpVar;
                return kpVar;
            }
            return this.c;
        }
        if (f < 300.0f) {
            this.d = ki.b();
            this.c = kpVar;
            return kpVar;
        }
        if (j < 30000) {
            return this.c;
        }
        this.d = ki.b();
        this.c = kpVar;
        return kpVar;
    }
}
