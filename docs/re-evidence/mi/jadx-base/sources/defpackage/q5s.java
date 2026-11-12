package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class q5s extends k5s.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31149b;
    public final /* synthetic */ String c;
    public final /* synthetic */ k5s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5s(k5s k5sVar, k5s.a aVar, boolean z, String str) {
        super(aVar);
        this.d = k5sVar;
        this.f31149b = z;
        this.c = str;
    }

    @Override // k5s.b
    public void a() {
        super.a();
    }

    @Override // k5s.b
    public void b() {
        if (this.f31149b) {
            return;
        }
        this.d.d.edit().putLong(this.c, System.currentTimeMillis()).commit();
    }
}
