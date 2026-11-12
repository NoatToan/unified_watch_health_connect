package vn2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.common.base.Optional;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u000f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&\"\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b)\u0010\u001d¨\u0006+"}, d2 = {"Lvn2/g0;", "Lvn2/b;", "Lvn2/d1;", "Lvn2/c1;", "", "cId", "", "deviceUnitId", "<init>", "(Ljava/lang/String;J)V", "Lq03/r;", "", "f", "()Lq03/r;", "j", "chargingAmount", "N", "(I)Lq03/r;", "paymentToken", "Lkotlin/Function1;", "", "longWaitingCallback", "Lq03/b;", "Q", "(Ljava/lang/String;Le23/l;)Lq03/b;", "", "c", "()Z", "getDeviceName", "()Ljava/lang/String;", "g", "Ljava/lang/String;", "h", "J", "getDeviceUnitId", "()J", IntegerTokenConverter.CONVERTER_KEY, "I", "()I", JWKParameterNames.OCT_KEY_VALUE, "(I)V", JWKParameterNames.RSA_MODULUS, "garminJpPhoneNumber", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends b<d1> implements c1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f178880k = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String cId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long deviceUnitId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int chargingAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String garminJpPhoneNumber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String str, long j8) {
        super(j8);
        str.getClass();
        this.cId = str;
        this.deviceUnitId = j8;
        this.garminJpPhoneNumber = "0492679114";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer Z0(Optional optional) {
        optional.getClass();
        return (Integer) ((as2.b) optional.get()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer a1(e23.l lVar, Object obj) {
        obj.getClass();
        return (Integer) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer b1(Optional optional) {
        optional.getClass();
        return (Integer) ((as2.b) optional.get()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer c1(e23.l lVar, Object obj) {
        obj.getClass();
        return (Integer) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q03.f d1(g0 g0Var, String str, e23.l lVar) {
        if (g0Var.getChargingAmount() > 0) {
            return g0Var.R0().a(g0Var.cId, String.valueOf(g0Var.getChargingAmount()), str, lVar);
        }
        vb.h.z("Top up balance should not < 0");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer e1(g0 g0Var, int i14, Integer num) {
        num.getClass();
        g0Var.k(i14);
        return num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f1(e23.l lVar, Object obj) {
        obj.getClass();
        return (Integer) lVar.invoke(obj);
    }

    @Override // vn2.c1
    public q03.r<Integer> N(int chargingAmount) {
        q03.r<Integer> rVarJ = j();
        int i14 = 18;
        y yVar = new y(new ap.b(this, chargingAmount, i14), i14);
        rVarJ.getClass();
        int i15 = w03.b.f181178a;
        return new e13.o(rVarJ, yVar);
    }

    @Override // vn2.c1
    public q03.b Q(String paymentToken, e23.l<? super Long, Unit> longWaitingCallback) {
        paymentToken.getClass();
        longWaitingCallback.getClass();
        com.airbnb.lottie.k kVar = new com.airbnb.lottie.k(this, paymentToken, 7, longWaitingCallback);
        int i14 = w03.b.f181178a;
        return new z03.d(kVar);
    }

    @Override // vn2.c1
    public boolean c() {
        return P0().f165680a.s();
    }

    @Override // vn2.c1
    public q03.r<Integer> f() {
        e13.b bVarA = R0().f165643l.a(this.cId, true, false);
        y yVar = new y(new vb1.d(26), 17);
        int i14 = w03.b.f181178a;
        return new e13.o(bVarA, yVar);
    }

    @Override // vn2.c1
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getChargingAmount() {
        return this.chargingAmount;
    }

    @Override // vn2.c1
    public String getDeviceName() {
        return R0().f165641j;
    }

    @Override // vn2.c1
    public long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    @Override // vn2.c1
    public q03.r<Integer> j() {
        e13.b bVarA = R0().f165643l.a(this.cId, false, true);
        y yVar = new y(new vb1.d(27), 19);
        int i14 = w03.b.f181178a;
        return new e13.o(bVarA, yVar);
    }

    @Override // vn2.c1
    public void k(int i14) {
        this.chargingAmount = i14;
    }

    @Override // vn2.c1
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getGarminJpPhoneNumber() {
        return this.garminJpPhoneNumber;
    }
}
