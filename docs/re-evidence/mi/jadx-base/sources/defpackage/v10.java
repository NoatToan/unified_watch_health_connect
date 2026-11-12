package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public abstract class v10 extends w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f36363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36364b;
    public final int c;

    public v10(int i) {
        this(i, i);
    }

    @Override // defpackage.olb
    public final hlb a() {
        d();
        uqd.a(this.f36363a);
        if (this.f36363a.remaining() > 0) {
            f(this.f36363a);
            ByteBuffer byteBuffer = this.f36363a;
            uqd.b(byteBuffer, byteBuffer.limit());
        }
        return c();
    }

    public abstract hlb c();

    public final void d() {
        uqd.a(this.f36363a);
        while (this.f36363a.remaining() >= this.c) {
            e(this.f36363a);
        }
        this.f36363a.compact();
    }

    public abstract void e(ByteBuffer byteBuffer);

    public abstract void f(ByteBuffer byteBuffer);

    public v10(int i, int i2) {
        c6i.d(i2 % i == 0);
        this.f36363a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f36364b = i2;
        this.c = i;
    }
}
