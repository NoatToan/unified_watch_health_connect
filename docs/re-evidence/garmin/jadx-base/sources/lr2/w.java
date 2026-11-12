package lr2;

import androidx.lifecycle.u1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Llr2/w;", "Landroidx/lifecycle/u1;", "Llr2/n;", "", "deviceUnitId", "", "deviceName", "Lhs2/c;", "expressCard", "Lvr2/q;", "currentUserWalletCardItem", "<init>", "(JLjava/lang/String;Lhs2/c;Lvr2/q;)V", "", "balanceThreshold", "", "L1", "(FLt13/d;)Ljava/lang/Object;", "a", "J", "getDeviceUnitId", "()J", "b", "Ljava/lang/String;", "getDeviceName", "()Ljava/lang/String;", "c", "Lhs2/c;", "o", "()Lhs2/c;", "d", "Lvr2/q;", "U3", "()Lvr2/q;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends u1 implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f114445e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long deviceUnitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String deviceName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hs2.c expressCard;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final vr2.q currentUserWalletCardItem;

    public w(long j8, String str, hs2.c cVar, vr2.q qVar) {
        str.getClass();
        cVar.getClass();
        this.deviceUnitId = j8;
        this.deviceName = str;
        this.expressCard = cVar;
        this.currentUserWalletCardItem = qVar;
    }

    @Override // lr2.n
    public Object L1(float f14, t13.d<? super Unit> dVar) {
        qs2.a aVar;
        ps2.w wVar = ps2.w.f140538a;
        long deviceUnitId = getDeviceUnitId();
        wVar.getClass();
        ps2.n nVarI = ps2.w.i(deviceUnitId);
        if (nVarI == null) {
            vb.h.z("Something goes wrong, cannot get device wallet");
            return null;
        }
        vr2.q currentUserWalletCardItem = getCurrentUserWalletCardItem();
        if (currentUserWalletCardItem == null || (aVar = currentUserWalletCardItem.f179658e.f73428c) == null) {
            vb.h.z("Should find the businessOperator from deviceWalletItem, intent data error");
            return null;
        }
        byte[] bArrD = getCurrentUserWalletCardItem().d();
        bArrD.getClass();
        nVarI.p(bArrD, aVar.f147399d, f14).e();
        return Unit.INSTANCE;
    }

    @Override // lr2.n
    /* JADX INFO: renamed from: U3, reason: from getter */
    public vr2.q getCurrentUserWalletCardItem() {
        return this.currentUserWalletCardItem;
    }

    @Override // lr2.n
    public String getDeviceName() {
        return this.deviceName;
    }

    @Override // lr2.n
    public long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    @Override // lr2.n
    /* JADX INFO: renamed from: o, reason: from getter */
    public hs2.c getExpressCard() {
        return this.expressCard;
    }
}
