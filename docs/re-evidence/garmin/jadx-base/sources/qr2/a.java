package qr2;

import androidx.lifecycle.y0;
import e23.p;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import uy2.f0;
import uy2.g0;
import uy2.j;
import uy2.k;
import uy2.p0;
import uy2.s0;
import uy2.v;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lqr2/a;", "Lry2/a;", "", "deviceUnitId", "", "J2", "(J)V", "N1", "Landroidx/lifecycle/s0;", "", "L2", "()Landroidx/lifecycle/s0;", "isResettingWallet", "S1", "wasWalletResetSuccessful", "c", "()Z", "isDeviceConnected", "", "getDeviceName", "()Ljava/lang/String;", "deviceName", "f", "isPhoneBluetoothTurnedOn", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a extends ry2.a<a> {

    /* JADX INFO: renamed from: qr2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqr2/a$a;", "Luy2/b;", "Landroidx/lifecycle/y0;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2764a implements uy2.b<y0<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f146928a;

        /* JADX INFO: renamed from: qr2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.passcode.viewmodels.IResetWalletViewModel$LoadingStateProvider$1$1", f = "IResetWalletViewModel.kt", l = {22}, m = "invokeSuspend", v = 2)
        public static final class C2765a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f146929a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0<Boolean> f146930b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2765a(y0<Boolean> y0Var, t13.d<? super C2765a> dVar) {
                super(2, dVar);
                this.f146930b = y0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2765a(this.f146930b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2765a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f146929a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f146930b.j(Boolean.TRUE);
                    this.f146929a = 1;
                    if (m0.b(500L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: qr2.a$a$b */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"uy2/g", "Luy2/b;", "Landroidx/lifecycle/y0;", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements uy2.b<y0<Boolean>> {
            @Override // uy2.b
            public final void a(y0<Boolean> y0Var, Object[] objArr) throws Throwable {
                ge1.b.W(t13.h.f161748a, new C2765a(y0Var, null));
            }
        }

        public C2764a() {
            int i14 = uy2.h.f173460a;
            this.f146928a = new b();
        }

        @Override // uy2.b
        public final void a(y0<Boolean> y0Var, Object[] objArr) throws Throwable {
            this.f146928a.a(y0Var, objArr);
        }
    }

    @k
    void J2(long deviceUnitId);

    @s0(providerClass = C2764a.class)
    @j(keys = {"loading"})
    @v
    androidx.lifecycle.s0<Boolean> L2();

    @k
    @p0(keys = {"reset", "loading"})
    void N1(long deviceUnitId);

    @g0(description = "Reset succeeded")
    @j(keys = {"reset"})
    @v(description = "Reset failed")
    androidx.lifecycle.s0<Boolean> S1();

    @g0
    /* JADX INFO: renamed from: c */
    boolean getIsDeviceConnected();

    @g0
    boolean f();

    @f0("{device name}")
    String getDeviceName();
}
