package dk2;

import android.content.Context;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import zy2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ldk2/g;", "", "Lkotlin/Function1;", "Lek2/a;", "Lik2/d;", "scannerFactory", "Lkotlin/Function0;", "Lhk2/d;", "probeFactory", "<init>", "(Le23/l;Le23/a;)V", "a", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f60256e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f60257f = zy2.c.f207527a.a("DISC#DiscoveryManager");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f60258g = 5000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<ek2.a, ik2.d> f60259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<hk2.d> f60260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f60261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dk2.a f60262d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(l<? super ek2.a, ? extends ik2.d> lVar, e23.a<? extends hk2.d> aVar) {
        lVar.getClass();
        this.f60259a = lVar;
        this.f60260b = aVar;
        this.f60261c = new Object();
    }

    public final void a(ek2.a aVar, e eVar, int i14, Context context) {
        eVar.getClass();
        synchronized (this.f60261c) {
            try {
                b();
                f60257f.debug("startDiscovery");
                ik2.d dVarInvoke = this.f60259a.invoke(aVar);
                e23.a<hk2.d> aVar2 = this.f60260b;
                this.f60262d = new dk2.a(dVarInvoke, eVar, context, aVar, i14, aVar2 != null ? aVar2.invoke() : null);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b() {
        synchronized (this.f60261c) {
            dk2.a aVar = this.f60262d;
            if (aVar != null) {
                aVar.c();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldk2/g$a;", "", "<init>", "()V", "", "PREFIX", "Ljava/lang/String;", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ g(l lVar, e23.a aVar, int i14, j jVar) {
        this(lVar, (i14 & 2) != 0 ? null : aVar);
    }
}
