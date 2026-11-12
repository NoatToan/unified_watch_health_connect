package wr2;

import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.util.WalletItemsUtilKt$resetDeviceWallet$2", f = "WalletItemsUtil.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f186829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f186830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j8, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f186830b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a0 a0Var = new a0(this.f186830b, dVar);
        a0Var.f186829a = obj;
        return a0Var;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        long j8 = this.f186830b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        try {
            ps2.w.f140538a.getClass();
            ps2.n nVarI = ps2.w.i(j8);
            if (nVarI != null) {
                nVarI.n().e();
                z14 = true;
                return Boolean.valueOf(z14);
            }
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.i(Logger.ROOT_LOGGER_NAME).error("Failed to reset passcode / wallet on device " + j8 + ", wallet is null");
            return Boolean.FALSE;
        } catch (Exception e4) {
            int i15 = gt2.c.f79010a;
            gt2.b.f79005a.i(Logger.ROOT_LOGGER_NAME).error("Failed to reset passcode / wallet on device " + j8, (Throwable) e4);
            z14 = false;
        }
    }
}
