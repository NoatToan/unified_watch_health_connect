package f5;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1.i0 f69114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r2[] f69115b;

    static {
        p1.i0 i0Var = new p1.i0(8);
        r2.f69091a.getClass();
        s2 s2Var = r2.a.f69098g;
        i0Var.i(1, s2Var);
        s2 s2Var2 = r2.a.f69097f;
        i0Var.i(2, s2Var2);
        s2 s2Var3 = r2.a.f69093b;
        i0Var.i(4, s2Var3);
        s2 s2Var4 = r2.a.f69095d;
        i0Var.i(8, s2Var4);
        s2 s2Var5 = r2.a.f69099h;
        i0Var.i(16, s2Var5);
        s2 s2Var6 = r2.a.f69096e;
        i0Var.i(32, s2Var6);
        s2 s2Var7 = r2.a.f69100i;
        i0Var.i(64, s2Var7);
        s2 s2Var8 = r2.a.f69094c;
        i0Var.i(128, s2Var8);
        f69114a = i0Var;
        f69115b = new r2[]{s2Var, s2Var2, s2Var3, s2Var7, s2Var5, s2Var6, s2Var4, r2.a.f69101j, s2Var8};
    }

    public static final void a(e2 e2Var, x1 x1Var, long j8, int i14, int i15) {
        if (m2.a(j8, -1L)) {
            return;
        }
        float f14 = (int) ((j8 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f15 = (int) ((j8 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f16 = i14 - ((int) ((j8 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        float f17 = i15 - ((int) (j8 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        e2Var.V(x1Var.getF69108c(), f14);
        e2Var.V(x1Var.getF69109d(), f15);
        e2Var.V(x1Var.getF69110e(), f16);
        e2Var.V(x1Var.getF69111f(), f17);
    }
}
