package df;

import java.util.Set;
import p005kotlin.Metadata;
import ve.y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Ldf/s;", "Ljava/lang/Runnable;", "Lve/p;", "processor", "Lve/u;", "token", "", "stopInForeground", "", "reason", "<init>", "(Lve/p;Lve/u;ZI)V", "(Lve/p;Lve/u;Z)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve.p f59423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve.u f59424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59426d;

    public s(ve.p pVar, ve.u uVar, boolean z14, int i14) {
        pVar.getClass();
        uVar.getClass();
        this.f59423a = pVar;
        this.f59424b = uVar;
        this.f59425c = z14;
        this.f59426d = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y0 y0VarB;
        boolean z14 = this.f59425c;
        ve.p pVar = this.f59423a;
        ve.u uVar = this.f59424b;
        if (z14) {
            int i14 = this.f59426d;
            pVar.getClass();
            String str = uVar.f177614a.f26929a;
            synchronized (pVar.f177591k) {
                y0VarB = pVar.b(str);
            }
            ve.p.d(str, y0VarB, i14);
        } else {
            int i15 = this.f59426d;
            pVar.getClass();
            String str2 = uVar.f177614a.f26929a;
            synchronized (pVar.f177591k) {
                try {
                    if (pVar.f177586f.get(str2) != null) {
                        ue.u uVarA = ue.u.a();
                        int i16 = ve.p.f177580l;
                        uVarA.getClass();
                    } else {
                        Set set = (Set) pVar.f177588h.get(str2);
                        if (set != null && set.contains(uVar)) {
                            ve.p.d(str2, pVar.b(str2), i15);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        ue.u uVarA2 = ue.u.a();
        ue.u.b("StopWorkRunnable");
        cf.m mVar = this.f59424b.f177614a;
        uVarA2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(ve.p pVar, ve.u uVar, boolean z14) {
        this(pVar, uVar, z14, -512);
        pVar.getClass();
        uVar.getClass();
    }
}
