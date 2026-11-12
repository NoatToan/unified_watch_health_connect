package defpackage;

import com.github.promeg.pinyinhelper.SegmentationSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes21.dex */
final class ajg implements SegmentationSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final aje.b f475a = new aje.b();

    ajg() {
    }

    @Override // com.github.promeg.pinyinhelper.SegmentationSelector
    public List<zul> select(Collection<zul> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList<zul> arrayList = new ArrayList(collection);
        Collections.sort(arrayList, f475a);
        TreeSet treeSet = new TreeSet();
        int end = -1;
        for (zul zulVar : arrayList) {
            if (zulVar.getStart() > end && zulVar.getEnd() > end) {
                end = zulVar.getEnd();
            } else {
                treeSet.add(zulVar);
            }
        }
        arrayList.removeAll(treeSet);
        return arrayList;
    }
}
