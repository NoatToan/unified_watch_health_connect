package ye;

import af.m;
import android.content.Context;
import android.net.ConnectivityManager;
import java.util.List;
import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lye/j;", "", "", "Lze/e;", "controllers", "<init>", "(Ljava/util/List;)V", "Laf/m;", "trackers", "(Laf/m;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ze.e> f196805a;

    public j(m mVar) {
        mVar.getClass();
        ze.c cVar = new ze.c(mVar.f3030b);
        ze.d dVar = new ze.d(mVar.f3031c);
        ze.j jVar = new ze.j(mVar.f3033e);
        af.g<f> gVar = mVar.f3032d;
        ze.f fVar = new ze.f(gVar);
        ze.i iVar = new ze.i(gVar);
        ze.h hVar = new ze.h(gVar);
        ze.g gVar2 = new ze.g(gVar);
        Context context = mVar.f3029a;
        int i14 = l.f196812a;
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this(u.C(new ze.e[]{cVar, dVar, jVar, fVar, iVar, hVar, gVar2, new e((ConnectivityManager) systemService, 0L, 2, null)}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends ze.e> list) {
        list.getClass();
        this.f196805a = list;
    }
}
