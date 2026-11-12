package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class hnq extends dc1 {
    public Object e;
    public double f;
    public double g;
    public ec1 h;

    public hnq() {
        this.e = null;
        this.f = Double.NaN;
        this.g = 0.0d;
    }

    public void f() {
        this.g += this.f;
        this.f = 0.0d;
    }

    public void g() {
        this.f += this.g;
        this.g = 0.0d;
    }

    public Object h() {
        return this.e;
    }

    public double i() {
        return this.g + this.f;
    }

    public void j() {
        ec1 ec1Var = this.h;
        if (ec1Var == null) {
            return;
        }
        ec1Var.a(i());
    }

    public void k(ec1 ec1Var) {
        this.h = ec1Var;
    }

    public hnq(ReadableMap readableMap) {
        this.e = null;
        this.f = Double.NaN;
        this.g = 0.0d;
        this.f = readableMap.getDouble("value");
        this.g = readableMap.getDouble("offset");
    }
}
