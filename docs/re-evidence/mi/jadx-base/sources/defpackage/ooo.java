package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.a;
import com.google.typography.font.sfntly.table.core.CMap;
import com.google.typography.font.sfntly.table.core.j;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public class ooo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Font f29345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f29346b;
    public Set<izo> c;
    public Set<Integer> d;
    public List<Integer> e;
    public List<j.d> f;
    public Map<Integer, Integer> g = null;

    public ooo(Font font, a aVar) {
        this.f29345a = font;
        this.f29346b = aVar;
    }

    public Map<Integer, Integer> a() {
        if (this.g == null) {
            this.g = new HashMap();
            List<Integer> listB = b();
            for (int i = 0; i < listB.size(); i++) {
                this.g.put(listB.get(i), Integer.valueOf(i));
            }
        }
        return this.g;
    }

    public List<Integer> b() {
        return this.e;
    }

    public void c(List<j.d> list, int i) {
        this.f = new ArrayList();
        j jVar = (j) this.f29345a.h(tzo.f35226b);
        if (jVar == null) {
            throw new InvalidParameterException("Font has no cmap table.");
        }
        Iterator<j.d> it = list.iterator();
        while (it.hasNext()) {
            CMap cMapO = jVar.o(it.next());
            if (cMapO != null) {
                this.f.add(cMapO.k());
                i--;
                if (i <= 0) {
                    break;
                }
            }
        }
        if (this.f.size() != 0) {
            return;
        }
        this.f = null;
        throw new InvalidParameterException("CMap Id settings would generate font with no cmap sub-table.");
    }

    public void d(List<Integer> list) {
        this.e = new ArrayList(list);
    }

    public void e(Set<Integer> set) {
        this.d = new HashSet(set);
    }

    public void f(Font.b bVar) {
    }

    public Font.b g() throws IOException {
        Font.b bVarI = this.f29346b.i();
        f(bVarI);
        TreeSet<Integer> treeSet = new TreeSet(this.f29345a.p().keySet());
        Set<Integer> set = this.d;
        if (set != null) {
            treeSet.removeAll(set);
        }
        for (izo izoVar : this.c) {
            if (izoVar.a(this, this.f29345a, bVarI)) {
                treeSet.removeAll(izoVar.b());
            }
        }
        for (Integer num : treeSet) {
            dzo dzoVarH = this.f29345a.h(num.intValue());
            if (dzoVarH != null) {
                bVarI.l(num.intValue(), dzoVarH.f());
            }
        }
        return bVarI;
    }
}
