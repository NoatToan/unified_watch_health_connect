package ai;

import java.io.IOException;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import vh.v0;
import zh.e;
import zh.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lai/a;", "Lzh/g;", "wrappedWriter", "<init>", "(Lzh/g;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f3305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3306b;

    public a(g gVar) {
        gVar.getClass();
        this.f3305a = gVar;
        this.f3306b = new LinkedHashMap();
    }

    @Override // zh.g
    public final g A() {
        this.f3305a.A();
        return this;
    }

    @Override // zh.g
    public final g P0(long j8) {
        this.f3305a.P0(j8);
        return this;
    }

    @Override // zh.g
    public final g R0(int i14) {
        this.f3305a.R0(i14);
        return this;
    }

    @Override // zh.g
    public final g S0(double d14) {
        this.f3305a.S0(d14);
        return this;
    }

    @Override // zh.g
    public final g U1(e eVar) {
        eVar.getClass();
        this.f3305a.U1(eVar);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3305a.close();
    }

    @Override // zh.g
    public final g e1(boolean z14) {
        this.f3305a.e1(z14);
        return this;
    }

    @Override // zh.g
    public final g g() {
        this.f3305a.g();
        return this;
    }

    @Override // zh.g
    public final String getPath() {
        return this.f3305a.getPath();
    }

    @Override // zh.g
    public final g k0(v0 v0Var) {
        v0Var.getClass();
        g gVar = this.f3305a;
        this.f3306b.put(gVar.getPath(), v0Var);
        gVar.l4();
        return this;
    }

    @Override // zh.g
    public final g l4() {
        this.f3305a.l4();
        return this;
    }

    @Override // zh.g
    public final g n0(String str) {
        str.getClass();
        this.f3305a.n0(str);
        return this;
    }

    @Override // zh.g
    public final g q() {
        this.f3305a.q();
        return this;
    }

    @Override // zh.g
    public final g v1(String str) {
        str.getClass();
        this.f3305a.v1(str);
        return this;
    }

    @Override // zh.g
    public final g y() {
        this.f3305a.y();
        return this;
    }
}
