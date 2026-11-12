package q52;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.q;
import o13.r;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lq52/a;", "Lzr1/c;", "syncStatus", "", "<anonymous>", "(Lr53/j;Lzr1/c;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.domain.details.ObserveDeviceSyncStatusUseCase$invoke$2", f = "ObserveDeviceSyncStatusUseCase.kt", l = {26, 29, 34, 37, 40, 43}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements q<j<? super a>, zr1.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j f142938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ zr1.c f142939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f142940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f142941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j8, long j14, t13.d<? super h> dVar) {
        super(3, dVar);
        this.f142940d = j8;
        this.f142941e = j14;
    }

    @Override // e23.q
    public final Object invoke(j<? super a> jVar, zr1.c cVar, t13.d<? super Unit> dVar) {
        h hVar = new h(this.f142940d, this.f142941e, dVar);
        hVar.f142938b = jVar;
        hVar.f142939c = cVar;
        return hVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r0.emit(r12, r11) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (r0.emit(r12, r11) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        if (r0.emit(r12, r11) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ea, code lost:
    
        if (r0.emit(r12, r11) == r2) goto L32;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar = this.f142938b;
        zr1.c cVar = this.f142939c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142937a;
        long j8 = this.f142940d;
        switch (i14) {
            case 0:
                r.b(obj);
                if (!(cVar instanceof zr1.c.a)) {
                    if (cVar instanceof zr1.c.C3852c) {
                        a aVar2 = a.NOT_STARTED;
                        this.f142938b = jVar;
                        this.f142939c = null;
                        this.f142937a = 3;
                        if (jVar.emit(aVar2, this) != aVar) {
                            String strF = a0.f(j8, "Starting sync timeout timer for device[", "]");
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.b(a2Var, "ObserveDeviceSyncStatusUseCase", strF);
                            this.f142938b = jVar;
                            this.f142939c = null;
                            this.f142937a = 4;
                            if (m0.c(this.f142941e, this) != aVar) {
                                String strF2 = a0.f(j8, "Device sync did not start within expected time for device[", "]");
                                i2.a aVar4 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar4.getClass();
                                i2.a.b(a2Var2, "ObserveDeviceSyncStatusUseCase", strF2);
                                a aVar5 = a.START_TIMEOUT;
                                this.f142938b = null;
                                this.f142939c = null;
                                this.f142937a = 5;
                            }
                        }
                        break;
                    } else {
                        a aVar6 = a.IN_PROGRESS;
                        this.f142938b = null;
                        this.f142939c = null;
                        this.f142937a = 6;
                        break;
                    }
                    return aVar;
                }
                if (!((zr1.c.a) cVar).f206772b) {
                    String str = "Device sync finished with failure for device[" + j8 + "] - " + cVar;
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.b(a2Var3, "ObserveDeviceSyncStatusUseCase", str);
                    a aVar8 = a.FAILURE;
                    this.f142938b = null;
                    this.f142939c = null;
                    this.f142937a = 2;
                } else {
                    String strF3 = a0.f(j8, "Device sync finished successfully for device[", "] -> Starting workout");
                    i2.a aVar9 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar9.getClass();
                    i2.a.b(a2Var4, "ObserveDeviceSyncStatusUseCase", strF3);
                    a aVar10 = a.SUCCESS;
                    this.f142938b = null;
                    this.f142939c = null;
                    this.f142937a = 1;
                }
                break;
                break;
            case 1:
            case 2:
            case 5:
            case 6:
                r.b(obj);
                return Unit.INSTANCE;
            case 3:
                r.b(obj);
                String strF4 = a0.f(j8, "Starting sync timeout timer for device[", "]");
                i2.a aVar11 = i2.f36769a;
                a2 a2Var5 = a2.GENERAL;
                aVar11.getClass();
                i2.a.b(a2Var5, "ObserveDeviceSyncStatusUseCase", strF4);
                this.f142938b = jVar;
                this.f142939c = null;
                this.f142937a = 4;
                if (m0.c(this.f142941e, this) != aVar) {
                    String strF5 = a0.f(j8, "Device sync did not start within expected time for device[", "]");
                    i2.a aVar12 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar12.getClass();
                    i2.a.b(a2Var6, "ObserveDeviceSyncStatusUseCase", strF5);
                    a aVar13 = a.START_TIMEOUT;
                    this.f142938b = null;
                    this.f142939c = null;
                    this.f142937a = 5;
                    break;
                }
                return aVar;
            case 4:
                r.b(obj);
                String strF6 = a0.f(j8, "Device sync did not start within expected time for device[", "]");
                i2.a aVar14 = i2.f36769a;
                a2 a2Var7 = a2.GENERAL;
                aVar14.getClass();
                i2.a.b(a2Var7, "ObserveDeviceSyncStatusUseCase", strF6);
                a aVar15 = a.START_TIMEOUT;
                this.f142938b = null;
                this.f142939c = null;
                this.f142937a = 5;
                break;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
