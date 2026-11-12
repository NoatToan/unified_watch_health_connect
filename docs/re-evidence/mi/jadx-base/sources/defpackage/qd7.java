package defpackage;

import com.xiaomi.eco.api.a;
import com.xiaomi.eco.api.b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qd7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f31405b;
    public final a c;
    public int d;
    public qj7 e;
    public b f;
    public volatile boolean g;

    public qd7(String str, byte[] bArr, a aVar) {
        this.f31404a = str;
        this.f31405b = bArr;
        this.c = aVar;
    }

    public void a() {
        this.g = true;
        b bVar = this.f;
        if (bVar != null) {
            bVar.a();
            this.f = null;
        }
    }

    public int b() {
        return this.d;
    }

    public final boolean c() {
        return this.g;
    }

    public void d(qj7 qj7Var) {
        this.e = qj7Var;
    }
}
