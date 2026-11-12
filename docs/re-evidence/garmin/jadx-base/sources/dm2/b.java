package dm2;

import android.content.Context;
import android.content.Intent;
import androidx.room.b0;
import bd0.c0;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import d53.t;

/* JADX INFO: loaded from: classes11.dex */
public class b extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f60457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f60458j;

    public b(com.garmin.android.library.backgroundtaskmanagement.b bVar, long j8, String str) {
        super(bVar);
        this.f60457i = j8;
        this.f60458j = str;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        String str = this.f60458j;
        long j8 = this.f60457i;
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        try {
            rd2.f.a().f152046b.getClass();
            if (rd2.g.d(j8)) {
                Intent intent = new Intent("com.garmin.android.apps.ACTION_DEVICE_REMOVED");
                intent.putExtra("com.garmin.android.apps.EXTRA_UNIT_ID", j8);
                intent.putExtra("com.garin.android.apps.EXTRA_PRODUCT_NUMBER", str);
                Context context = ((c0) lm2.h.d()).f17547a;
                String str2 = oa2.b.f131086a;
                context.sendBroadcast(intent, context.getPackageName() + ".permission.RECEIVE_THIRD_PARTY_BROADCASTS");
                Context context2 = ((c0) lm2.h.d()).f17547a;
                cn2.d dVar = cn2.d.f28092a;
                Integer numI = str != null ? t.i(str) : null;
                cn2.d.f28092a.getClass();
                cn2.d.a(context2, "com.garmin.device.sharing.management.ACTION_DEVICE_REMOVED", j8, numI);
                cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            }
            ConnectDatabase.g().f().b(j8);
            rd2.c cVar2 = (rd2.c) ConnectDatabase.g().e();
            b0 b0Var = cVar2.f152036a;
            b0Var.assertNotSuspendingTransaction();
            rd2.c.b bVar = cVar2.f152038c;
            vd.g gVarAcquire = bVar.acquire();
            gVarAcquire.h(1, j8);
            b0Var.beginTransaction();
            try {
                gVarAcquire.b2();
                b0Var.setTransactionSuccessful();
                b0Var.endTransaction();
                bVar.release(gVarAcquire);
                km2.a.j();
                c(cVar);
            } catch (Throwable th3) {
                b0Var.endTransaction();
                bVar.release(gVarAcquire);
                throw th3;
            }
        } catch (Throwable th4) {
            c(cVar);
            throw th4;
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }
}
