package vn2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH'¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H'¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\r\u001a\u00020\f8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\"À\u0006\u0003"}, d2 = {"Lvn2/c1;", "Lsy2/c;", "Lvn2/d1;", "", "paymentToken", "Lkotlin/Function1;", "", "", "longWaitingCallback", "Lq03/b;", "Q", "(Ljava/lang/String;Le23/l;)Lq03/b;", "", "chargingAmount", "Lq03/r;", "N", "(I)Lq03/r;", "f", "()Lq03/r;", "j", "", "c", "()Z", "getDeviceName", "()Ljava/lang/String;", "getDeviceUnitId", "()J", "deviceUnitId", JWKParameterNames.RSA_MODULUS, "garminJpPhoneNumber", "g", "()I", JWKParameterNames.OCT_KEY_VALUE, "(I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c1 extends sy2.c<d1> {
    @uy2.y(description = "Not exceeds max", value = 1000)
    q03.r<Integer> N(int chargingAmount);

    @uy2.j0(description = "Failed to top up", exceptionClass = Exception.class)
    @uy2.k(description = "Happy path")
    q03.b Q(String paymentToken, e23.l<? super Long, Unit> longWaitingCallback);

    @Override // sy2.c
    @uy2.k
    /* synthetic */ void a(d1 d1Var);

    /* synthetic */ Object b();

    @uy2.g0(description = "Device is connected")
    @uy2.v(description = "Device is disconnected")
    boolean c();

    @uy2.y(1000)
    q03.r<Integer> f();

    @uy2.y(1000)
    /* JADX INFO: renamed from: g */
    int getChargingAmount();

    @uy2.f0("vivoactive 4")
    String getDeviceName();

    @uy2.b0(1)
    long getDeviceUnitId();

    @uy2.y(1000)
    q03.r<Integer> j();

    @uy2.k
    void k(int i14);

    @uy2.f0("0492679114")
    /* JADX INFO: renamed from: n */
    String getGarminJpPhoneNumber();
}
