package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class u5s extends k5s.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k5s f35437b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5s(k5s k5sVar, k5s.a aVar) {
        super(aVar);
        this.f35437b = k5sVar;
    }

    @Override // k5s.b
    public void b() {
        synchronized (this.f35437b.c) {
            this.f35437b.f23502b.remove(this.f23503a.a());
        }
    }
}
