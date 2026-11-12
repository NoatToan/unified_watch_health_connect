package k33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l33.d1;
import o33.u;
import o33.v;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f102790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.l f102791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f102792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f102793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.i<u, d1> f102794e;

    public k(i iVar, t23.l lVar, v vVar, int i14) {
        iVar.getClass();
        lVar.getClass();
        vVar.getClass();
        this.f102790a = iVar;
        this.f102791b = lVar;
        this.f102792c = i14;
        ArrayList typeParameters = vVar.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i15));
            i15++;
        }
        this.f102793d = linkedHashMap;
        this.f102794e = this.f102790a.f102785a.f102751a.h(new j(this));
    }

    @Override // k33.n
    public final t23.d1 a(u uVar) {
        uVar.getClass();
        d1 d1VarInvoke = this.f102794e.invoke(uVar);
        return d1VarInvoke != null ? d1VarInvoke : this.f102790a.f102786b.a(uVar);
    }
}
