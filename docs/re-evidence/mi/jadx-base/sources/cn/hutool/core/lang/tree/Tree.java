package cn.hutool.core.lang.tree;

import cn.hutool.core.collection.CollUtil;
import defpackage.g4h;
import defpackage.qj1;
import defpackage.qk1;
import defpackage.tt3;
import defpackage.u1q;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Tree<T> extends LinkedHashMap<String, Object> implements Node<T> {
    private static final long serialVersionUID = 1;
    private Tree<T> parent;
    private final TreeNodeConfig treeNodeConfig;

    public Tree() {
        this(null);
    }

    private static void printTree(Tree<?> tree, PrintWriter printWriter, int i) {
        printWriter.println(tt3.y("{}{}[{}]", tt3.T(' ', i), tree.getName(), tree.getId()));
        printWriter.flush();
        List<Tree<?>> children = tree.getChildren();
        if (CollUtil.j(children)) {
            Iterator<Tree<?>> it = children.iterator();
            while (it.hasNext()) {
                printTree(it.next(), printWriter, i + 2);
            }
        }
    }

    @SafeVarargs
    public final Tree<T> addChildren(Tree<T>... treeArr) {
        if (qj1.E(treeArr)) {
            List<Tree<T>> children = getChildren();
            if (children == null) {
                children = new ArrayList<>();
                setChildren(children);
            }
            for (Tree<T> tree : treeArr) {
                tree.setParent(this);
                children.add(tree);
            }
        }
        return this;
    }

    public List<Tree<T>> getChildren() {
        return (List) get(this.treeNodeConfig.getChildrenKey());
    }

    public TreeNodeConfig getConfig() {
        return this.treeNodeConfig;
    }

    @Override // cn.hutool.core.lang.tree.Node
    public T getId() {
        return (T) get(this.treeNodeConfig.getIdKey());
    }

    @Override // cn.hutool.core.lang.tree.Node
    public CharSequence getName() {
        return (CharSequence) get(this.treeNodeConfig.getNameKey());
    }

    public Tree<T> getNode(T t) {
        return u1q.a(this, t);
    }

    public Tree<T> getParent() {
        return this.parent;
    }

    @Override // cn.hutool.core.lang.tree.Node
    public T getParentId() {
        return (T) get(this.treeNodeConfig.getParentIdKey());
    }

    public List<CharSequence> getParentsName(T t, boolean z) {
        return u1q.b(getNode(t), z);
    }

    @Override // cn.hutool.core.lang.tree.Node
    public Comparable<?> getWeight() {
        return (Comparable) get(this.treeNodeConfig.getWeightKey());
    }

    public void putExtra(String str, Object obj) {
        qk1.r(str, "Key must be not empty !", new Object[0]);
        put(str, obj);
    }

    public Tree<T> setChildren(List<Tree<T>> list) {
        put(this.treeNodeConfig.getChildrenKey(), list);
        return this;
    }

    public Tree<T> setParent(Tree<T> tree) {
        this.parent = tree;
        if (tree != null) {
            setParentId((Object) tree.getId());
        }
        return this;
    }

    @Override // cn.hutool.core.lang.tree.Node
    public /* bridge */ /* synthetic */ Node setWeight(Comparable comparable) {
        return setWeight((Comparable<?>) comparable);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringWriter stringWriter = new StringWriter();
        printTree(this, new PrintWriter(stringWriter), 0);
        return stringWriter.toString();
    }

    public Tree(TreeNodeConfig treeNodeConfig) {
        this.treeNodeConfig = (TreeNodeConfig) g4h.e(treeNodeConfig, TreeNodeConfig.DEFAULT_CONFIG);
    }

    public List<CharSequence> getParentsName(boolean z) {
        return u1q.b(this, z);
    }

    @Override // cn.hutool.core.lang.tree.Node
    public Tree<T> setId(T t) {
        put(this.treeNodeConfig.getIdKey(), t);
        return this;
    }

    @Override // cn.hutool.core.lang.tree.Node
    public Tree<T> setName(CharSequence charSequence) {
        put(this.treeNodeConfig.getNameKey(), charSequence);
        return this;
    }

    @Override // cn.hutool.core.lang.tree.Node
    public Tree<T> setParentId(T t) {
        put(this.treeNodeConfig.getParentIdKey(), t);
        return this;
    }

    @Override // cn.hutool.core.lang.tree.Node
    public Tree<T> setWeight(Comparable<?> comparable) {
        put(this.treeNodeConfig.getWeightKey(), comparable);
        return this;
    }
}
