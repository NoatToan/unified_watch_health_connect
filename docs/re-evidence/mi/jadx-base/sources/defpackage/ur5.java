package defpackage;

import com.facebook.react.bridge.ReadableMap;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public class ur5 extends kc1 {
    public final double e;
    public double f;
    public long g;
    public double h;
    public double i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36046k;

    public ur5(ReadableMap readableMap) {
        this.e = readableMap.getDouble("velocity");
        a(readableMap);
    }

    @Override // defpackage.kc1
    public void a(ReadableMap readableMap) {
        this.f = readableMap.getDouble("deceleration");
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.j = i;
        this.f36046k = 1;
        this.f23702a = i == 0;
        this.g = -1L;
        this.h = 0.0d;
        this.i = 0.0d;
    }

    @Override // defpackage.kc1
    public void b(long j) {
        long j2 = j / FolmeCore.NANOS_TO_MS;
        if (this.g == -1) {
            this.g = j2 - 16;
            double d = this.h;
            if (d == this.i) {
                this.h = this.f23703b.f;
            } else {
                this.f23703b.f = d;
            }
            this.i = this.f23703b.f;
        }
        double d2 = this.h;
        double d3 = this.e;
        double d4 = this.f;
        double dExp = d2 + ((d3 / (1.0d - d4)) * (1.0d - Math.exp((-(1.0d - d4)) * (j2 - this.g))));
        if (Math.abs(this.i - dExp) < 0.1d) {
            int i = this.j;
            if (i != -1 && this.f36046k >= i) {
                this.f23702a = true;
                return;
            } else {
                this.g = -1L;
                this.f36046k++;
            }
        }
        this.i = dExp;
        this.f23703b.f = dExp;
    }
}
