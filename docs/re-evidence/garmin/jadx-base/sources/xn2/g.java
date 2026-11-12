package xn2;

import p005kotlin.Metadata;
import sy2.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxn2/g;", "Lsy2/d;", "IFelicaBasicUserInfoEventHandler", "Lvn2/b;", "", "", "deviceUnitId", "<init>", "(J)V", "Lq03/i;", "Lpn2/t;", "getUserInfo", "()Lq03/i;", "g", "J", "getDeviceUnitId", "()J", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g<IFelicaBasicUserInfoEventHandler extends sy2.d<?, ?>> extends vn2.b<IFelicaBasicUserInfoEventHandler> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f191705h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long deviceUnitId;

    public g(long j8) {
        super(j8);
        this.deviceUnitId = j8;
    }

    public long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    public q03.i<pn2.t> getUserInfo() {
        q03.r<c83.a0<pn2.t>> rVarP = R0().f165633b.p();
        tn2.k0 k0Var = new tn2.k0(new tn2.m(23), 4);
        rVarP.getClass();
        int i14 = w03.b.f181178a;
        return new e13.l(rVarP, k0Var);
    }
}
