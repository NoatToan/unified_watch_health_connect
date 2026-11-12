package pg2;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;
import r53.o2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpg2/c;", "Landroidx/lifecycle/x1$d;", "Lqg2/c;", "chartType", "Lr53/o2;", "", "isPaused", "isDisconnected", "<init>", "(Lqg2/c;Lr53/o2;Lr53/o2;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends x1.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qg2.c f137633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o2<Boolean> f137634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o2<Boolean> f137635e;

    public c(qg2.c cVar, o2<Boolean> o2Var, o2<Boolean> o2Var2) {
        cVar.getClass();
        o2Var.getClass();
        o2Var2.getClass();
        this.f137633c = cVar;
        this.f137634d = o2Var;
        this.f137635e = o2Var2;
    }

    @Override // androidx.lifecycle.x1.d, androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        return new b(this.f137633c, this.f137634d, this.f137635e);
    }
}
