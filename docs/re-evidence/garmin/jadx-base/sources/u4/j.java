package u4;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lu4/j;", "", "<init>", "()V", "Lu4/c;", "Lu4/f;", "Lu4/k;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l<? super j, Unit> f168492a;

    public /* synthetic */ j(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract void a(q4.f fVar);

    public e23.l<j, Unit> b() {
        return this.f168492a;
    }

    public final void c() {
        e23.l<j, Unit> lVarB = b();
        if (lVarB != null) {
            lVarB.invoke(this);
        }
    }

    public void d(c.a aVar) {
        this.f168492a = aVar;
    }

    private j() {
    }
}
