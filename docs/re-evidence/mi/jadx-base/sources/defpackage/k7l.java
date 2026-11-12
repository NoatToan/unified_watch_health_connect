package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import org.bouncycastle.util.MemoableResetException;

/* JADX INFO: loaded from: classes3.dex */
public class k7l extends xre {
    public int p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f23559r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;

    public k7l(int i) {
        if (i >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i2 = i / 8;
        this.p = i2;
        s(i2 * 8);
        reset();
    }

    public static void q(int i, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(4, i3);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return;
            } else {
                bArr[i2 + iMin] = (byte) (i >>> ((3 - iMin) * 8));
            }
        }
    }

    public static void r(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            q((int) (j >>> 32), bArr, i, i2);
            if (i2 > 4) {
                q((int) (j & 4294967295L), bArr, i + 4, i2 - 4);
            }
        }
    }

    @Override // defpackage.dpf
    public void a(dpf dpfVar) {
        k7l k7lVar = (k7l) dpfVar;
        if (this.p != k7lVar.p) {
            throw new MemoableResetException("digestLength inappropriate in other");
        }
        super.l(k7lVar);
        this.q = k7lVar.q;
        this.f23559r = k7lVar.f23559r;
        this.s = k7lVar.s;
        this.t = k7lVar.t;
        this.u = k7lVar.u;
        this.v = k7lVar.v;
        this.w = k7lVar.w;
        this.x = k7lVar.x;
    }

    @Override // defpackage.aw6
    public int c() {
        return this.p;
    }

    @Override // defpackage.dpf
    public dpf copy() {
        return new k7l(this);
    }

    @Override // defpackage.aw6
    public int doFinal(byte[] bArr, int i) {
        m();
        r(this.e, bArr, i, this.p);
        r(this.f, bArr, i + 8, this.p - 8);
        r(this.g, bArr, i + 16, this.p - 16);
        r(this.h, bArr, i + 24, this.p - 24);
        r(this.i, bArr, i + 32, this.p - 32);
        r(this.j, bArr, i + 40, this.p - 40);
        r(this.f39390k, bArr, i + 48, this.p - 48);
        r(this.l, bArr, i + 56, this.p - 56);
        reset();
        return this.p;
    }

    @Override // defpackage.aw6
    public String getAlgorithmName() {
        return "SHA-512/" + Integer.toString(this.p * 8);
    }

    @Override // defpackage.xre, defpackage.aw6
    public void reset() {
        super.reset();
        this.e = this.q;
        this.f = this.f23559r;
        this.g = this.s;
        this.h = this.t;
        this.i = this.u;
        this.j = this.v;
        this.f39390k = this.w;
        this.l = this.x;
    }

    public final void s(int i) {
        this.e = -3482333909917012819L;
        this.f = 2216346199247487646L;
        this.g = -7364697282686394994L;
        this.h = 65953792586715988L;
        this.i = -816286391624063116L;
        this.j = 4512832404995164602L;
        this.f39390k = -5033199132376557362L;
        this.l = -124578254951840548L;
        update((byte) 83);
        update((byte) 72);
        update(HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION);
        update((byte) 45);
        update(HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC);
        update((byte) 49);
        update(HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR);
        update(HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE);
        if (i <= 100) {
            if (i > 10) {
            }
            update((byte) (i + 48));
            m();
            this.q = this.e;
            this.f23559r = this.f;
            this.s = this.g;
            this.t = this.h;
            this.u = this.i;
            this.v = this.j;
            this.w = this.f39390k;
            this.x = this.l;
        }
        update((byte) ((i / 100) + 48));
        i %= 100;
        update((byte) ((i / 10) + 48));
        i %= 10;
        update((byte) (i + 48));
        m();
        this.q = this.e;
        this.f23559r = this.f;
        this.s = this.g;
        this.t = this.h;
        this.u = this.i;
        this.v = this.j;
        this.w = this.f39390k;
        this.x = this.l;
    }

    public k7l(k7l k7lVar) {
        super(k7lVar);
        this.p = k7lVar.p;
        a(k7lVar);
    }
}
