package vn2;

import android.app.Activity;
import com.garmin.feature.garminpay.providers.felica.exception.AlreadyHasOneCardException;
import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00032\u00020\u00032\u00020\u0003:\u0002\u000b\fJ\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\t\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lvn2/w0;", "Lsy2/c;", "Lvn2/x0;", "", "Lq03/b;", "y0", "()Lq03/b;", "Lq03/r;", "", "s0", "()Lq03/r;", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface w0 extends sy2.c<x0> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvn2/w0$a;", "Lxy2/o;", "Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements xy2.o<ExpressCardSettingException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f178963a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.DEVICE_IS_BUSY, "sample error");
            eVar.getClass();
            this.f178963a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final ExpressCardSettingException getF173457a() {
            return (ExpressCardSettingException) this.f178963a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvn2/w0$b;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xy2.o<int[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f178964a;

        public b() {
            uy2.e eVar = uy2.e.f173458a;
            int[] iArr = {1000, 2000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, 4000, 5000};
            eVar.getClass();
            this.f178964a = new uy2.d(iArr);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final int[] getF173457a() {
            return (int[]) this.f178964a.f173457a;
        }
    }

    @uy2.j0(description = "Init fails", exceptionClass = Exception.class)
    @uy2.k(description = "Init succeeds")
    /* synthetic */ q03.b B0();

    @uy2.r(providerClass = xn2.e0.class)
    /* JADX INFO: renamed from: E */
    /* synthetic */ pn2.t getUserInfoDto();

    @uy2.f0("token")
    /* JADX INFO: renamed from: M */
    /* synthetic */ String getPaymentToken();

    @uy2.r(providerClass = xn2.b0.class)
    /* JADX INFO: renamed from: S */
    /* synthetic */ sd2.f getDeviceRecord();

    @Override // sy2.c
    @uy2.k
    /* synthetic */ void a(x0 x0Var);

    /* synthetic */ Object b();

    @uy2.o0(description = "Daily maintenance", providerClass = yn2.f.class)
    @uy2.k(description = "Not in maintenance")
    @uy2.k0(description = "10M before daily maintenance", providerClass = yn2.e.class)
    @uy2.l0(description = "Monthly maintenance", providerClass = yn2.h.class)
    @uy2.m0(description = "10M before monthly maintenance", providerClass = yn2.g.class)
    /* synthetic */ q03.b e(tn2.f0.a aVar);

    @uy2.j0(description = "Has one provisioned", exceptionClass = AlreadyHasOneCardException.class)
    @uy2.k(description = "Happy path")
    /* synthetic */ q03.b f0();

    @uy2.y(1000)
    /* JADX INFO: renamed from: g */
    /* synthetic */ int getChargingAmount();

    @uy2.f0("{DEVICE_NAME}")
    /* synthetic */ String getDeviceName();

    @uy2.b0(1)
    /* synthetic */ long getDeviceUnitId();

    @uy2.i(description = "No user info")
    @uy2.r(description = "Has user info", providerClass = xn2.x.class)
    /* synthetic */ q03.i getUserInfo();

    @uy2.k(description = "GooglePay is ready")
    default q03.b i(Activity activity) {
        activity.getClass();
        tr2.b bVar = new tr2.b(new un2.a(activity, pn2.a.d.f138714a), 13);
        int i14 = w03.b.f181178a;
        return new z03.c(bVar);
    }

    @uy2.k
    /* synthetic */ void k(int i14);

    @uy2.f0("0492679114")
    /* JADX INFO: renamed from: n */
    /* synthetic */ String getGarminJpPhoneNumber();

    @uy2.j0(description = "Provision fails", exceptionClass = Exception.class)
    @uy2.k(description = "Provision succeeds")
    @uy2.o0(description = "Urgent maintenance", providerClass = xn2.f0.class)
    /* synthetic */ q03.b p(pn2.t tVar, String str, String str2, e23.l lVar);

    @uy2.j0(description = "Failed to get initial charge options", exceptionClass = RuntimeException.class)
    @uy2.r(description = "Succeeded to get initial charge options", providerClass = b.class)
    q03.r<int[]> s0();

    @uy2.k
    /* synthetic */ void x0(pn2.t tVar);

    @uy2.k(description = "Happy path")
    @uy2.o0(description = "Fail to setup rapid pass", providerClass = a.class)
    q03.b y0();

    @uy2.k
    /* synthetic */ void z(String str);
}
