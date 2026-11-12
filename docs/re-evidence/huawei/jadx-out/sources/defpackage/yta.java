package defpackage;

import com.ultrasoniclibrary.ultrasoundcore.classfun.FreqParam;

/* JADX INFO: loaded from: classes46.dex */
public class yta {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53835b;
    FreqParam d;
    public float[] e;

    public yta() {
    }

    public yta(int i, float[] fArr, FreqParam freqParam) {
        this.f53835b = i;
        this.e = fArr;
        this.d = freqParam;
    }

    public FreqParam c() {
        return this.d;
    }

    public String toString() {
        return "PositioningResult flag: " + this.f53835b + " mValue: " + this.e[0] + " freqParam: " + this.d.toString();
    }
}
