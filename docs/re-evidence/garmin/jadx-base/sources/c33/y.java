package c33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f24303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24305f;

    public y(int i14, String str, int i15, b0 b0Var) {
        str.getClass();
        b0Var.getClass();
        this.f24300a = i14;
        this.f24301b = str;
        this.f24302c = i15;
        this.f24303d = b0Var;
        this.f24304e = new ArrayList(1);
        e33.k.f62827a.getClass();
        List listA = e33.k.a.a();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((e33.k) it.next()).l());
        }
        this.f24305f = arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(String str, int i14, b0 b0Var) {
        this(0, str, i14, b0Var);
        str.getClass();
        b0Var.getClass();
    }
}
