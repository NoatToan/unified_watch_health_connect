package j9;

import android.os.IBinder;
import android.os.IInterface;
import com.google.common.util.concurrent.SettableFuture;
import ds.e0;
import k9.g;
import p9.l;

/* JADX INFO: loaded from: classes.dex */
public class c extends k9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f97774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SettableFuture f97775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f97776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, k9.b bVar, e eVar, SettableFuture settableFuture) {
        super(bVar);
        this.f97776d = aVar;
        this.f97774b = eVar;
        this.f97775c = settableFuture;
    }

    @Override // k9.a, k9.g
    public final void b(IBinder iBinder) {
        l c2587a;
        ((e0) this.f97776d.f97764c).getClass();
        int i14 = l.a.f136445a;
        if (iBinder == null) {
            c2587a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IHealthDataService");
            c2587a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) ? new l.a.C2587a(iBinder) : (l) iInterfaceQueryLocalInterface;
        }
        this.f97774b.b(c2587a, this.f97775c);
    }

    @Override // k9.a, k9.g
    public final void c(Exception exc) {
        this.f97775c.setException(exc);
    }

    @Override // k9.a, k9.g
    public final g d(k9.e eVar) {
        eVar.a(this.f97775c);
        return this;
    }
}
