package defpackage;

import defpackage.iyc;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyc<T extends iyc> implements hyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<T> f23243a = new CopyOnWriteArrayList();

    public List<T> a() {
        return this.f23243a;
    }

    public void b(T t) {
        if (this.f23243a.contains(t)) {
            return;
        }
        this.f23243a.add(t);
    }

    public void c(T t) {
        this.f23243a.remove(t);
    }
}
