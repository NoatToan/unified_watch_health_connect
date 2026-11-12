package he0;

import c80.f0;
import c80.g0;
import c80.m0;
import c80.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhe0/d;", "Lzd0/e0;", "Lf12/l;", "sharedPreferences", "<init>", "(Lf12/l;)V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements e0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f83480j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m0 f83481k = m0.f25457w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f12.l f83482i;

    public d(f12.l lVar) {
        lVar.getClass();
        this.f83482i = lVar;
    }

    @Override // zd0.e0
    public final m0 a() {
        return f83481k;
    }

    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        g0 g0Var = n0Var.f25495t;
        if (g0Var == null) {
            return l0.HIDE;
        }
        List<c80.e0> list = g0Var.f25375a;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zEquals = true;
            boolean z14 = false;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (!((Boolean) it3.next()).booleanValue()) {
                            zEquals = false;
                            break;
                        }
                    }
                }
                return e0.b(zEquals);
            }
            c80.e0 e0Var = (c80.e0) it.next();
            String str = e0Var.f25360a;
            f12.l lVar = this.f83482i;
            if (lVar.m3(str)) {
                f0 f0Var = e0Var.f25361b;
                if (f0Var instanceof f0.d) {
                    if (lVar.k0(str) != ((f0.d) f0Var).f25370b) {
                        zEquals = false;
                    }
                } else if (f0Var instanceof f0.c) {
                    if (lVar.R0(str) != ((f0.c) f0Var).f25369b) {
                        zEquals = false;
                    }
                } else if (f0Var instanceof f0.e) {
                    zEquals = lVar.a0(str).equals(((f0.e) f0Var).f25371b);
                } else {
                    if (!(f0Var instanceof f0.a)) {
                        u0.r();
                        return null;
                    }
                    if (lVar.k2(str) != ((f0.a) f0Var).f25368b) {
                        zEquals = false;
                    }
                }
                z14 = zEquals;
            }
            arrayList.add(Boolean.valueOf(z14));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhe0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
