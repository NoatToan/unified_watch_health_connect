package z0;

import android.util.Size;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f200672a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap<Size, u> f200673b = new TreeMap<>(new j0.e());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1.i f200674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1.i f200675d;

    public m(e1 e1Var, int i14) {
        int iD;
        i iVar = u.f200708a;
        Iterator it = new ArrayList(u.f200716i).iterator();
        while (true) {
            b1.a aVar = null;
            if (!it.hasNext()) {
                if (this.f200672a.isEmpty()) {
                    this.f200675d = null;
                    this.f200674c = null;
                    return;
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque(this.f200672a.values());
                    this.f200674c = (b1.i) arrayDeque.peekFirst();
                    this.f200675d = (b1.i) arrayDeque.peekLast();
                    return;
                }
            }
            u uVar = (u) it.next();
            k7.h.f(uVar instanceof u.b, "Currently only support ConstantQuality");
            u.b bVar = (u.b) uVar;
            if (i14 == 1) {
                iD = bVar.d();
            } else {
                if (i14 != 2) {
                    bVar.getClass();
                    vb.h.q(am.j.h(i14, "Unknown quality source: "));
                    throw null;
                }
                iD = bVar.a();
            }
            f1 f1VarA = e1Var.a(iD);
            if (f1VarA != null) {
                f1VarA.toString();
                if (!f1VarA.d().isEmpty()) {
                    int iC = f1VarA.c();
                    int iA = f1VarA.a();
                    List<f1.a> listB = f1VarA.b();
                    List<f1.c> listD = f1VarA.d();
                    k7.h.b(true ^ listD.isEmpty(), "Should contain at least one VideoProfile.");
                    aVar = new b1.a(iC, iA, Collections.unmodifiableList(new ArrayList(listB)), Collections.unmodifiableList(new ArrayList(listD)), listB.isEmpty() ? null : listB.get(0), listD.get(0));
                }
                if (aVar == null) {
                    Objects.toString(uVar);
                } else {
                    this.f200673b.put(aVar.f14187f.j(), uVar);
                    this.f200672a.put(uVar, aVar);
                }
            }
        }
    }

    public final b1.i a(u uVar) {
        k7.h.b(u.f200715h.contains(uVar), "Unknown quality: " + uVar);
        if (uVar == u.f200713f) {
            return this.f200674c;
        }
        return uVar == u.f200712e ? this.f200675d : (b1.i) this.f200672a.get(uVar);
    }
}
