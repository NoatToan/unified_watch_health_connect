package p005kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import p13.h0;
import p13.y;
import q23.h;
import x33.b;
import x33.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105828a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f105829b;

    static {
        Set<h> set = h.f142322e;
        ArrayList arrayList = new ArrayList(y.r(set, 10));
        for (h hVar : set) {
            hVar.getClass();
            arrayList.add(f.f105860l.a(hVar.f142332a));
        }
        ArrayList<c> arrayListD0 = h0.D0(h0.D0(h0.D0(arrayList, f.a.f105879g.i()), f.a.f105883i.i()), f.a.f105885k.i());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f188590d;
        for (c cVar : arrayListD0) {
            aVar.getClass();
            linkedHashSet.add(b.a.b(cVar));
        }
        f105829b = linkedHashSet;
    }

    private a() {
    }
}
