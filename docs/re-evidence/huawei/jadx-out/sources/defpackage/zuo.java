package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.ahocorasick.interval.IntervalNode;
import org.ahocorasick.interval.Intervalable;

/* JADX INFO: loaded from: classes20.dex */
public class zuo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IntervalNode f54581c;

    public zuo(List<Intervalable> list) {
        this.f54581c = null;
        this.f54581c = new IntervalNode(list);
    }

    public List<Intervalable> a(List<Intervalable> list) {
        Collections.sort(list, new zum());
        TreeSet treeSet = new TreeSet();
        for (Intervalable intervalable : list) {
            if (!treeSet.contains(intervalable)) {
                treeSet.addAll(d(intervalable));
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            list.remove((Intervalable) it.next());
        }
        Collections.sort(list, new zun());
        return list;
    }

    public List<Intervalable> d(Intervalable intervalable) {
        return this.f54581c.d(intervalable);
    }
}
