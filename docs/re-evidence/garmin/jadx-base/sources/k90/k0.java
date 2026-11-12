package k90;

import android.database.Cursor;
import android.database.SQLException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.GetDeviceScanUnavailableReasonUseCase$isTruSwingDeviceAndOneAlreadyPaired$2", f = "GetDeviceScanUnavailableReasonUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l90.b f103511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f103512b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l90.b bVar, l0 l0Var, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f103511a = bVar;
        this.f103512b = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k0(this.f103511a, this.f103512b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z15 = false;
        if (yl2.b.b(p13.w.c(yl2.b.N5)).contains(this.f103511a.f111522g)) {
            rd2.j jVar = this.f103512b.f103577a;
            String str = u0.E5.f203854a;
            jVar.getClass();
            if (str == null || str.length() == 0) {
                z14 = false;
            } else {
                String[] strArrSplit = str.split(",");
                String[] strArr = {"unit_id"};
                StringBuilder sb3 = new StringBuilder("mac_address IS NOT NULL AND product_nbr");
                if (strArrSplit.length == 1) {
                    sb3.append("='");
                    sb3.append(strArrSplit[0]);
                    sb3.append("'");
                } else {
                    sb3.append(" IN(");
                    int i14 = 0;
                    while (i14 < strArrSplit.length) {
                        sb3.append("'");
                        sb3.append(strArrSplit[i14]);
                        sb3.append("'");
                        i14++;
                        if (i14 < strArrSplit.length) {
                            sb3.append(",");
                        }
                    }
                    sb3.append(")");
                }
                Cursor cursorQuery = null;
                try {
                    try {
                        cursorQuery = rd2.a.b().query("devices", strArr, sb3.toString(), null, null, null, null);
                        z14 = cursorQuery != null && cursorQuery.moveToFirst();
                        rd2.a.a(cursorQuery);
                    } catch (SQLException e4) {
                        rd2.j.f152077a.error("isAnyProductNbrPaired", (Throwable) e4);
                        rd2.a.a(cursorQuery);
                        z14 = false;
                        if (z14) {
                            z15 = true;
                        }
                        return Boolean.valueOf(z15);
                    }
                } catch (Throwable th3) {
                    rd2.a.a(cursorQuery);
                    throw th3;
                }
            }
            if (z14) {
                z15 = true;
            }
        }
        return Boolean.valueOf(z15);
    }
}
