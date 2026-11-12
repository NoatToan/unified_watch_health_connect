package cn.hutool.core.lang.tree;

import cn.hutool.core.builder.Builder;
import cn.hutool.core.collection.CollUtil;
import defpackage.g4h;
import defpackage.qk1;
import defpackage.rvg;
import defpackage.v4f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TreeBuilder<E> implements Builder<Tree<E>> {
    private static final long serialVersionUID = 1;
    private final Map<E, Tree<E>> idTreeMap;
    private boolean isBuild;
    private final Tree<E> root;

    public TreeBuilder(E e, TreeNodeConfig treeNodeConfig) {
        Tree<E> tree = new Tree<>(treeNodeConfig);
        this.root = tree;
        tree.setId(e);
        this.idTreeMap = new HashMap();
    }

    private void buildFromMap() {
        if (v4f.o(this.idTreeMap)) {
            return;
        }
        Map mapB = v4f.B(this.idTreeMap, false);
        ArrayList arrayListP = CollUtil.p(new Tree[0]);
        for (Tree tree : mapB.values()) {
            if (tree != null) {
                Object parentId = tree.getParentId();
                if (g4h.h(this.root.getId(), parentId)) {
                    this.root.addChildren(tree);
                    arrayListP.add(tree);
                } else {
                    Tree tree2 = (Tree) mapB.get(parentId);
                    if (tree2 != null) {
                        tree2.addChildren(tree);
                    }
                }
            }
        }
    }

    private void checkBuilt() throws Throwable {
        qk1.f(this.isBuild, "Current tree has been built.", new Object[0]);
    }

    private void cutTree() {
        Integer deep = this.root.getConfig().getDeep();
        if (deep == null || deep.intValue() < 0) {
            return;
        }
        cutTree(this.root, 0, deep.intValue());
    }

    public static <T> TreeBuilder<T> of(T t) {
        return of(t, null);
    }

    public TreeBuilder<E> append(Map<E, Tree<E>> map) throws Throwable {
        checkBuilt();
        qk1.f(this.isBuild, "Current tree has been built.", new Object[0]);
        this.idTreeMap.putAll(map);
        return this;
    }

    public List<Tree<E>> buildList() {
        return this.isBuild ? this.root.getChildren() : build().getChildren();
    }

    public TreeBuilder<E> reset() {
        this.idTreeMap.clear();
        this.root.setChildren(null);
        this.isBuild = false;
        return this;
    }

    public static <T> TreeBuilder<T> of(T t, TreeNodeConfig treeNodeConfig) {
        return new TreeBuilder<>(t, treeNodeConfig);
    }

    @Override // cn.hutool.core.builder.Builder
    public Tree<E> build() throws Throwable {
        checkBuilt();
        buildFromMap();
        cutTree();
        this.isBuild = true;
        this.idTreeMap.clear();
        return this.root;
    }

    public TreeBuilder<E> append(Iterable<Tree<E>> iterable) throws Throwable {
        checkBuilt();
        for (Tree<E> tree : iterable) {
            this.idTreeMap.put(tree.getId(), tree);
        }
        return this;
    }

    private void cutTree(Tree<E> tree, int i, int i2) {
        if (tree == null) {
            return;
        }
        if (i == i2) {
            tree.setChildren(null);
            return;
        }
        List<Tree<E>> children = tree.getChildren();
        if (CollUtil.j(children)) {
            Iterator<Tree<E>> it = children.iterator();
            while (it.hasNext()) {
                cutTree(it.next(), i + 1, i2);
            }
        }
    }

    public <T> TreeBuilder<E> append(List<T> list, rvg<T, E> rvgVar) throws Throwable {
        checkBuilt();
        TreeNodeConfig config = this.root.getConfig();
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size(), 1.0f);
        for (T t : list) {
            Tree<E> tree = new Tree<>(config);
            rvgVar.a(t, tree);
            linkedHashMap.put(tree.getId(), tree);
        }
        return append(linkedHashMap);
    }
}
