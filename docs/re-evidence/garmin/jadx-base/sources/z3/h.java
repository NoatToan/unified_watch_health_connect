package z3;

import java.util.Set;
import p005kotlin.Metadata;
import p3.y2;
import p3.z2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz3/h;", "Lp3/y2;", "", "abandoning", "<init>", "(Ljava/util/Set;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<y2> f202100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.c<z2> f202101b = new q3.c<>(new z2[16], 0);

    public h(Set<y2> set) {
        this.f202100a = set;
    }

    @Override // p3.y2
    public final void onAbandoned() {
    }

    @Override // p3.y2
    public final void onForgotten() {
    }

    @Override // p3.y2
    public final void onRemembered() {
        q3.c<z2> cVar = this.f202101b;
        z2[] z2VarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            y2 f135269a = z2VarArr[i15].getF135269a();
            this.f202100a.remove(f135269a);
            f135269a.onRemembered();
        }
    }
}
