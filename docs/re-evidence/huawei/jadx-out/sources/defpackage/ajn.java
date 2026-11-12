package defpackage;

import com.github.promeg.pinyinhelper.PinyinDict;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes21.dex */
final class ajn {
    static zup d(List<PinyinDict> list) {
        TreeSet treeSet = new TreeSet();
        zup.b bVarA = zup.a();
        if (list == null) {
            return null;
        }
        for (PinyinDict pinyinDict : list) {
            if (pinyinDict != null && pinyinDict.words() != null) {
                treeSet.addAll(pinyinDict.words());
            }
        }
        if (treeSet.size() <= 0) {
            return null;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            bVarA.e((String) it.next());
        }
        return bVarA.a();
    }
}
