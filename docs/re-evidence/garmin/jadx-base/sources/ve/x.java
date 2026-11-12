package ve;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lve/x;", "Lve/v;", "delegate", "<init>", "(Lve/v;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f177627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f177628c;

    public x(v vVar) {
        vVar.getClass();
        this.f177627b = vVar;
        this.f177628c = new Object();
    }

    @Override // ve.v
    public final boolean a(cf.m mVar) {
        boolean zA;
        synchronized (this.f177628c) {
            zA = this.f177627b.a(mVar);
        }
        return zA;
    }

    @Override // ve.v
    public final u b(cf.m mVar) {
        u uVarB;
        mVar.getClass();
        synchronized (this.f177628c) {
            uVarB = this.f177627b.b(mVar);
        }
        return uVarB;
    }

    @Override // ve.v
    public final u c(cf.m mVar) {
        u uVarC;
        synchronized (this.f177628c) {
            uVarC = this.f177627b.c(mVar);
        }
        return uVarC;
    }

    @Override // ve.v
    public final List<u> remove(String str) {
        List<u> listRemove;
        str.getClass();
        synchronized (this.f177628c) {
            listRemove = this.f177627b.remove(str);
        }
        return listRemove;
    }
}
