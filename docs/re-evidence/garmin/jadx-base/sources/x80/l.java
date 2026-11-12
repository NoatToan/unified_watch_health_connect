package x80;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel$updatePrimaryDevice$1", f = "DeviceSetupViewModel.kt", l = {393, 398, 403, WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f189543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q90.f f189544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f189545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q90.f fVar, e eVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f189544c = fVar;
        this.f189545d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f189544c, this.f189545d, dVar);
        lVar.f189543b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (x80.e.y4(r7, r2, r11) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (x80.e.x4(r7, r2, r11) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (x80.e.x4(r7, r3, r11) == r0) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189542a;
        e eVar = this.f189545d;
        q90.f fVar = this.f189544c;
        if (i14 != 0) {
            if (i14 != 1 && i14 != 2) {
                if (i14 == 3) {
                    r.b(obj);
                    long j8 = ((q90.f.C2707f) fVar).f143528a;
                    this.f189543b = null;
                    this.f189542a = 4;
                } else if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            r.b(obj);
            return Unit.INSTANCE;
        }
        r.b(obj);
        if (fVar instanceof q90.f.e) {
            a2 a2Var = a2.DEVICE_SETUP;
            long j14 = ((q90.f.e) fVar).f143527a;
            String strF = a0.f(j14, "Setting device with unit id ", " as primary wearable device");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSetupViewModel", strF);
            this.f189543b = null;
            this.f189542a = 1;
        } else {
            if (!(fVar instanceof q90.f.d)) {
                if (fVar instanceof q90.f.C2707f) {
                    a2 a2Var2 = a2.DEVICE_SETUP;
                    long j15 = ((q90.f.C2707f) fVar).f143528a;
                    String strF2 = a0.f(j15, "Setting device with unit id ", " as primary wearable and training device");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "DeviceSetupViewModel", strF2);
                    this.f189543b = null;
                    this.f189542a = 3;
                    if (e.y4(eVar, j15, this) != aVar) {
                        long j16 = ((q90.f.C2707f) fVar).f143528a;
                        this.f189543b = null;
                        this.f189542a = 4;
                    }
                    return aVar;
                }
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "DeviceSetupViewModel", "No action needed: " + fVar);
                return Unit.INSTANCE;
            }
            a2 a2Var3 = a2.DEVICE_SETUP;
            long j17 = ((q90.f.d) fVar).f143526a;
            String strF3 = a0.f(j17, "Setting device with unit id ", " as primary training device");
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "DeviceSetupViewModel", strF3);
            this.f189543b = null;
            this.f189542a = 2;
        }
    }
}
