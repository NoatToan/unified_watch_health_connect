package po2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import sy2.d;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0010\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bH\u0084@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u001d\u001a\u00020\u001a8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lpo2/a;", "Lsy2/d;", "PresenterType", "Lsy2/a;", "", "deviceId", "<init>", "(J)V", "Lzn2/t;", "P0", "()Lzn2/t;", "Lkotlin/Function1;", "Lt13/d;", "", "", "block", "Q0", "(Le23/l;Lt13/d;)Ljava/lang/Object;", "c", "J", "Lzn2/z0;", "O0", "()Lzn2/z0;", "serviceProvider", "L0", "deviceServiceProvider", "", "N0", "()Ljava/lang/String;", "fitpayDeviceId", "Lwo2/a;", "M0", "()Lwo2/a;", "deviceSyncQueue", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<PresenterType extends sy2.d<?, ?>> extends sy2.a<PresenterType> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f139067d = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long deviceId;

    public a(long j8) {
        this.deviceId = j8;
    }

    public final zn2.t L0() {
        ps2.w wVar = ps2.w.f140538a;
        long j8 = this.deviceId;
        is2.b bVar = is2.b.FITPAY;
        wVar.getClass();
        ps2.n nVarI = ps2.w.i(j8);
        ms2.d dVar = null;
        if (nVarI != null) {
            ms2.d dVarG = nVarI.g(bVar);
            if (dVarG != null ? dVarG instanceof zn2.t : true) {
                dVar = dVarG;
            }
        }
        return (zn2.t) dVar;
    }

    public final wo2.a M0() {
        NewDeviceSyncQueue newDeviceSyncQueue = P0().f205821g;
        newDeviceSyncQueue.getClass();
        return (wo2.a) newDeviceSyncQueue;
    }

    public final String N0() {
        String str;
        fo2.s sVarE = O0().f205979a.E(this.deviceId);
        if (sVarE != null && (str = sVarE.f73101a) != null) {
            return str;
        }
        vb.h.z(org.apache.commons.lang3.e.e(this.deviceId, "Cannot find fitpay device for unitId "));
        return null;
    }

    public final z0 O0() {
        ms2.g gVarA = ps2.w.f140538a.a(is2.b.FITPAY);
        if (!(gVarA != null ? gVarA instanceof z0 : true)) {
            gVarA = null;
        }
        z0 z0Var = (z0) gVarA;
        if (z0Var != null) {
            return z0Var;
        }
        vb.h.z("NewFitPayServiceProvider is not available");
        return null;
    }

    public final zn2.t P0() {
        zn2.t tVarL0 = L0();
        if (tVarL0 != null) {
            return tVarL0;
        }
        vb.h.z("NewFitPayDeviceServiceProvider is not available");
        return null;
    }

    public final Object Q0(e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, t13.d<? super Unit> dVar) {
        Object objInvoke = lVar.invoke(dVar);
        return objInvoke == u13.a.COROUTINE_SUSPENDED ? objInvoke : Unit.INSTANCE;
    }
}
