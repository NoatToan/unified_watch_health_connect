package lr2;

import androidx.lifecycle.u1;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Llr2/u;", "Landroidx/lifecycle/u1;", "Llr2/m;", "", "deviceUnitId", "", "deviceName", "", "Lvr2/q;", "cardList", "Lhs2/c;", "currentRapidPass", "<init>", "(JLjava/lang/String;Ljava/util/List;Lhs2/c;)V", "newRapidPass", "", "p0", "(Lvr2/q;Lt13/d;)Ljava/lang/Object;", "a", "J", "getDeviceUnitId", "()J", "b", "Ljava/lang/String;", "getDeviceName", "()Ljava/lang/String;", "c", "Ljava/util/List;", "r2", "()Ljava/util/List;", "d", "Lhs2/c;", "o3", "()Lhs2/c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends u1 implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f114438e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long deviceUnitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String deviceName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<vr2.q> cardList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hs2.c currentRapidPass;

    public u(long j8, String str, List<vr2.q> list, hs2.c cVar) {
        str.getClass();
        list.getClass();
        this.deviceUnitId = j8;
        this.deviceName = str;
        this.cardList = list;
        this.currentRapidPass = cVar;
    }

    @Override // lr2.m
    public String getDeviceName() {
        return this.deviceName;
    }

    @Override // lr2.m
    public long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    @Override // lr2.m
    /* JADX INFO: renamed from: o3, reason: from getter */
    public hs2.c getCurrentRapidPass() {
        return this.currentRapidPass;
    }

    @Override // lr2.m
    public Object p0(vr2.q qVar, t13.d<? super Unit> dVar) {
        String str;
        ps2.w wVar = ps2.w.f140538a;
        long deviceUnitId = getDeviceUnitId();
        wVar.getClass();
        ps2.n nVarI = ps2.w.i(deviceUnitId);
        if (nVarI == null) {
            vb.h.z("Something goes wrong, cannot get device wallet");
            return null;
        }
        if (qVar == null && getCurrentRapidPass() != null) {
            ps2.g gVar = new ps2.g(nVarI, 2);
            int i14 = w03.b.f181178a;
            new z03.d(gVar).e();
        } else if (qVar != null) {
            byte[] bArrD = qVar.d();
            if (bArrD == null) {
                vb.h.z("rapidPassCardId shouldn't be null here");
                return null;
            }
            qs2.a aVar = qVar.f179658e.f73428c;
            if (aVar == null || (str = aVar.f147399d) == null) {
                vb.h.z("watchCardType shouldn't be null here");
                return null;
            }
            nVarI.p(bArrD, str, Float.POSITIVE_INFINITY).e();
        }
        return Unit.INSTANCE;
    }

    @Override // lr2.m
    public List<vr2.q> r2() {
        return this.cardList;
    }
}
