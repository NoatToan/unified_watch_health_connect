package s83;

/* JADX INFO: loaded from: classes11.dex */
public class f implements n83.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n83.a f157961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j83.h.a f157962b;

    public f(g gVar, n83.a aVar, j83.h.a aVar2) {
        this.f157961a = aVar;
        this.f157962b = aVar2;
    }

    @Override // n83.a
    public final void d() {
        j83.h.a aVar = this.f157962b;
        try {
            this.f157961a.d();
        } finally {
            aVar.f();
        }
    }
}
