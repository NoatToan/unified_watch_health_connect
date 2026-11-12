package p33;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f135446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<r1> f135447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f135448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f135449d;

    public h1(r1 r1Var, List<r1> list, String str, b43.z zVar) {
        list.getClass();
        this.f135446a = r1Var;
        this.f135447b = list;
        this.f135448c = str;
        h1 h1Var = null;
        if (str != null) {
            r1 r1VarA = r1Var != null ? r1Var.a() : null;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            for (r1 r1Var2 : list) {
                arrayList.add(r1Var2 != null ? r1Var2.a() : null);
            }
            h1Var = new h1(r1VarA, arrayList, null, null, 8, null);
        }
        this.f135449d = h1Var;
    }

    public h1() {
        this(null, null, null, null, 15, null);
    }

    public h1(r1 r1Var, List list, String str, b43.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : r1Var, (i14 & 2) != 0 ? p13.j0.f134944a : list, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : zVar);
    }
}
