package defpackage;

import cn.hutool.core.lang.tree.Tree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class u1q {
    public static <T> Tree<T> a(Tree<T> tree, T t) {
        if (g4h.g(t, tree.getId())) {
            return tree;
        }
        List<Tree<T>> children = tree.getChildren();
        if (children == null) {
            return null;
        }
        Iterator<Tree<T>> it = children.iterator();
        while (it.hasNext()) {
            Tree<T> node = it.next().getNode(t);
            if (node != null) {
                return node;
            }
        }
        return null;
    }

    public static <T> List<CharSequence> b(Tree<T> tree, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (tree == null) {
            return arrayList;
        }
        if (z) {
            arrayList.add(tree.getName());
        }
        for (Tree<T> parent = tree.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent.getName());
        }
        return arrayList;
    }
}
