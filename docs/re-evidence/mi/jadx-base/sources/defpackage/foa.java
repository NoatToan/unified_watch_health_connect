package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public class foa extends kc1 {
    public long e;
    public double[] f;
    public double g;
    public double h;
    public int i;
    public int j;

    public foa(ReadableMap readableMap) {
        a(readableMap);
    }

    @Override // defpackage.kc1
    public void a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f;
        if (dArr == null || dArr.length != size) {
            this.f = new double[size];
        }
        for (int i = 0; i < size; i++) {
            this.f[i] = array.getDouble(i);
        }
        if (readableMap.hasKey("toValue")) {
            this.g = readableMap.getType("toValue") == ReadableType.Number ? readableMap.getDouble("toValue") : 0.0d;
        } else {
            this.g = 0.0d;
        }
        if (readableMap.hasKey("iterations")) {
            this.i = readableMap.getType("iterations") == ReadableType.Number ? readableMap.getInt("iterations") : 1;
        } else {
            this.i = 1;
        }
        this.j = 1;
        this.f23702a = this.i == 0;
        this.e = -1L;
    }

    @Override // defpackage.kc1
    public void b(long j) {
        double d;
        if (this.e < 0) {
            this.e = j;
            if (this.j == 1) {
                this.h = this.f23703b.f;
            }
        }
        int iRound = (int) Math.round(((j - this.e) / FolmeCore.NANOS_TO_MS) / 16.666666666666668d);
        if (iRound < 0) {
            cm8.C("ReactNative", "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j + " and mStartFrameTimeNanos " + this.e);
            return;
        }
        if (this.f23702a) {
            return;
        }
        double[] dArr = this.f;
        if (iRound >= dArr.length - 1) {
            d = this.g;
            int i = this.i;
            if (i == -1 || this.j < i) {
                this.e = -1L;
                this.j++;
            } else {
                this.f23702a = true;
            }
        } else {
            double d2 = this.h;
            d = d2 + (dArr[iRound] * (this.g - d2));
        }
        this.f23703b.f = d;
    }
}
