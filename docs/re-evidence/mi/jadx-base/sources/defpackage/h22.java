package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h22<V, O> implements sb1<V, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e1e<V>> f19598a;

    public h22(List<e1e<V>> list) {
        this.f19598a = list;
    }

    @Override // defpackage.sb1
    public List<e1e<V>> b() {
        return this.f19598a;
    }

    @Override // defpackage.sb1
    public boolean isStatic() {
        if (this.f19598a.isEmpty()) {
            return true;
        }
        return this.f19598a.size() == 1 && this.f19598a.get(0).i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f19598a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f19598a.toArray()));
        }
        return sb.toString();
    }
}
