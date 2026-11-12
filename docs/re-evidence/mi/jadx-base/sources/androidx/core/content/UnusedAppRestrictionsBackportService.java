package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.f0d;
import defpackage.g0d;
import defpackage.pbq;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0d.a f2070a = new a();

    public class a extends g0d.a {
        public a() {
        }

        @Override // defpackage.g0d
        public void A2(f0d f0dVar) throws RemoteException {
            if (f0dVar == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.a(new pbq(f0dVar));
        }
    }

    public abstract void a(pbq pbqVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2070a;
    }
}
