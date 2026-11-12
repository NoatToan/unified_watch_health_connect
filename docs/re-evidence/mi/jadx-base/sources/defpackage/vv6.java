package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;

/* JADX INFO: loaded from: classes4.dex */
public class vv6 extends hnq {
    public final a i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f37262k;
    public final double l;
    public double m = 0.0d;

    public vv6(ReadableMap readableMap, a aVar) {
        this.i = aVar;
        this.j = readableMap.getInt("input");
        this.f37262k = readableMap.getDouble("min");
        this.l = readableMap.getDouble(VibrateModeSetFragment.MAX);
        this.f = 0.0d;
    }

    @Override // defpackage.dc1
    public void e() {
        double dL = l();
        double d = dL - this.m;
        this.m = dL;
        this.f = Math.min(Math.max(this.f + d, this.f37262k), this.l);
    }

    public final double l() {
        dc1 dc1VarL = this.i.l(this.j);
        if (dc1VarL == null || !(dc1VarL instanceof hnq)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((hnq) dc1VarL).i();
    }
}
