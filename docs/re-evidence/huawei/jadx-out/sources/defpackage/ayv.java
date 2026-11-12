package defpackage;

import android.util.Log;
import com.huawei.algorithm.peeranalysis.PeerPercentage;

/* JADX INFO: loaded from: classes4.dex */
public class ayv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f812c;
    private float d;
    private float e;
    private float f;
    private float g;
    private int h;
    private float i;
    private int j;

    public ayv() {
    }

    public ayv(int i, int i2, int i3, float f, float f2, float f3, int i4, float f4, float f5) {
        this.e = f;
        this.f811b = i;
        this.h = i2;
        this.f810a = i + (i2 / 12.0f);
        this.j = i3;
        this.d = f2;
        this.f812c = f3;
        this.i = i4;
        this.g = f4;
        this.f = f5;
    }

    public int k() {
        int i;
        double d = this.e;
        if (d < 0.5d || d > 2.5d) {
            return -3;
        }
        int i2 = this.f811b;
        if (i2 < 6 || i2 > 80 || (i = this.h) < 0 || i > 11) {
            return -4;
        }
        if (this.j > 1) {
            return -5;
        }
        float f = this.d;
        if (f < 10.0f || f > 45.0f) {
            return -7;
        }
        float f2 = this.f812c;
        if (f2 > 1.0d || f2 < 0.0f) {
            return -7;
        }
        float f3 = this.i;
        if (f3 > 50.0f || f3 < 0.0f || this.g < 0.0f) {
            return -7;
        }
        float f4 = this.f;
        return (f4 < 4.0f || f4 > 20.0f) ? -7 : 0;
    }

    public int n() {
        int i;
        double d = this.e;
        if (d < 0.5d || d > 2.5d) {
            return -3;
        }
        int i2 = this.f811b;
        if (i2 < 6 || i2 > 80 || (i = this.h) < 0 || i > 11) {
            return -4;
        }
        if (this.j > 1) {
            return -5;
        }
        float f = this.d;
        if (f < 10.0f || f > 45.0f) {
            return -7;
        }
        float f2 = this.f812c;
        if (f2 > 1.0d || f2 < 0.0f) {
            return -7;
        }
        float f3 = this.i;
        return (f3 > 50.0f || f3 < 0.0f || this.g < 0.0f) ? -7 : 0;
    }

    public float e() {
        return new PeerPercentage().GetBMIMean(this.f810a, this.j);
    }

    public float b() {
        return new PeerPercentage().GetBFRMean(this.f810a, this.j);
    }

    public float j() {
        return new PeerPercentage().GetVFLMean(this.f810a, this.j);
    }

    public float g() {
        return new PeerPercentage().GetSMMMean(this.f810a, this.j, this.e);
    }

    public float a() {
        return new PeerPercentage().GetRASMMean(this.f810a, this.j);
    }

    public float c() {
        return new PeerPercentage().GetBMIPeerPercent(this.f811b, this.j, this.d);
    }

    public float d() {
        return new PeerPercentage().GetBFRPeerPercent(this.f811b, this.j, this.f812c);
    }

    public float f() {
        return new PeerPercentage().GetVFLPeerPercent(this.f811b, this.j, this.i);
    }

    public float h() {
        return new PeerPercentage().GetSMMPeerPercent(this.f811b, this.j, this.e, this.g);
    }

    public float i() {
        return new PeerPercentage().GetRASMPeerPercent(this.f811b, this.j, this.f);
    }

    static {
        System.loadLibrary("peeranalysis");
        Log.d("PeerPercentageUtil", "load lib success");
    }
}
