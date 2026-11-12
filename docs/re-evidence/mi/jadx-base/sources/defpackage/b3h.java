package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class b3h<V> extends r53<V> {
    public LinkedList<a3h<V>> f;

    public b3h(int i, int i2, int i3) {
        super(i, i2, i3, false);
        this.f = new LinkedList<>();
    }

    @Override // defpackage.r53
    public void a(V v) {
        a3h<V> a3hVarPoll = this.f.poll();
        if (a3hVarPoll == null) {
            a3hVarPoll = new a3h<>();
        }
        a3hVarPoll.c(v);
        this.c.add(a3hVarPoll);
    }

    @Override // defpackage.r53
    public V h() {
        a3h<V> a3hVar = (a3h) this.c.poll();
        V vB = a3hVar.b();
        a3hVar.a();
        this.f.add(a3hVar);
        return vB;
    }
}
