package qj;

/* JADX INFO: loaded from: classes7.dex */
public class f implements g<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f144970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f144971b;

    public f(g gVar) {
        this.f144971b = gVar;
    }

    @Override // qj.g
    public final Object get() {
        if (this.f144970a == null) {
            synchronized (this) {
                try {
                    if (this.f144970a == null) {
                        Object obj = this.f144971b.get();
                        l.c(obj, "Argument must not be null");
                        this.f144970a = obj;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f144970a;
    }
}
