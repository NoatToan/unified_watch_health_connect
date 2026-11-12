package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class n7g extends hnq {
    public final a i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f27619k;

    public n7g(ReadableMap readableMap, a aVar) {
        this.i = aVar;
        this.j = readableMap.getInt("input");
        this.f27619k = readableMap.getDouble("modulus");
    }

    @Override // defpackage.dc1
    public void e() {
        dc1 dc1VarL = this.i.l(this.j);
        if (dc1VarL == null || !(dc1VarL instanceof hnq)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double dI = ((hnq) dc1VarL).i();
        double d = this.f27619k;
        this.f = ((dI % d) + d) % d;
    }
}
