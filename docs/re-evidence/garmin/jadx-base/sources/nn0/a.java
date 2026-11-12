package nn0;

import f12.l;
import j70.d;
import n70.a0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pb2.e;
import r53.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001:\u0001\u000bB%\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lnn0/a;", "Ln70/a0;", "Lr53/i;", "Lnn0/c;", "Lj70/d;", "Lpb2/e$l;", "data", "Lf12/l;", "userSettings", "<init>", "(Lr53/i;Lf12/l;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements a0<i<? extends c>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f126675c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<d<e.l>> f126676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f126677b;

    static {
        new C2435a(null);
    }

    public a(i<d<e.l>> iVar, l lVar) {
        iVar.getClass();
        lVar.getClass();
        this.f126676a = iVar;
        this.f126677b = lVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetHealthStatusCardDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends c> invoke() {
        return new b(this.f126676a, this);
    }

    /* JADX INFO: renamed from: nn0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnn0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2435a {
        public /* synthetic */ C2435a(j jVar) {
            this();
        }

        private C2435a() {
        }
    }
}
