package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.data.FontData;
import com.google.typography.font.sfntly.table.core.CMap;
import com.google.typography.font.sfntly.table.core.g;
import com.google.typography.font.sfntly.table.core.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class x83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Font.b f38824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, Integer> f38825b;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38827b;
        public List<Integer> c = new ArrayList();

        public a(int i, int i2) {
            this.f38826a = i;
            this.f38827b = i2;
        }

        public int b() {
            return this.f38827b;
        }

        public List<Integer> c() {
            return this.c;
        }

        public int d() {
            return this.f38826a;
        }

        public int e() {
            if (f()) {
                return c().get(0).intValue() - d();
            }
            return 0;
        }

        public final boolean f() {
            int iIntValue = this.c.get(0).intValue();
            for (int i = 1; i < this.c.size(); i++) {
                if (this.c.get(i).intValue() != iIntValue + i) {
                    return false;
                }
            }
            return true;
        }

        public void g(int i) {
            this.f38827b = i;
        }
    }

    public x83(Font.b bVar, Map<Integer, Integer> map) {
        this.f38824a = bVar;
        this.f38825b = map;
    }

    public void a() {
        b((g.b) ((j.b) this.f38824a.k(tzo.f35226b)).A(j.d.c, CMap.CMapFormat.Format4), c());
    }

    public final void b(g.b bVar, List<a> list) {
        int size;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = list.size();
        for (int i = 0; i < list.size(); i++) {
            a aVar = list.get(i);
            if (aVar.f()) {
                size = 0;
            } else {
                size = (size2 - i) * FontData.DataSize.USHORT.size();
                arrayList2.addAll(aVar.c());
                size2 += aVar.c().size();
            }
            arrayList.add(new g.b.a(aVar.d(), aVar.b(), aVar.e(), size));
        }
        bVar.B(arrayList2);
        bVar.C(arrayList);
    }

    public final List<a> c() {
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(this.f38825b);
        if (!treeMap.containsKey(65535)) {
            treeMap.put(65535, 0);
        }
        a aVar = null;
        for (Map.Entry entry : treeMap.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if (iIntValue > 65535) {
                break;
            }
            Integer num = (Integer) entry.getValue();
            num.intValue();
            if (aVar == null || iIntValue != aVar.b() + 1) {
                aVar = new a(iIntValue, iIntValue);
                arrayList.add(aVar);
            } else {
                aVar.g(iIntValue);
            }
            aVar.c().add(num);
        }
        return arrayList;
    }
}
