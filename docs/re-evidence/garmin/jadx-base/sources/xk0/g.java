package xk0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zk0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxk0/g;", "Landroidx/lifecycle/u1;", "Lyk0/b;", "getWeightGoalUseCase", "<init>", "(Lyk0/b;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yk0.b f191209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al0.a f191210b;

    public g(yk0.b bVar) {
        bVar.getClass();
        this.f191209a = bVar;
        this.f191210b = al0.a.C0064a.a(al0.a.f3717b);
    }

    public static y0 x4(g gVar, String str, h hVar) {
        String string = new fz0.c(DateTime.now(), null, 2, null).toString();
        gVar.getClass();
        return xy2.b.K(gVar, new f(gVar, str, string, hVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ g(yk0.b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? new yk0.b(null, 1, null) : bVar);
    }
}
