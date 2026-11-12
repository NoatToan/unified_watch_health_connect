package cn.hutool.core.lang.tree;

import defpackage.t94;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public interface Node<T> extends Comparable<Node<T>>, Serializable {
    T getId();

    CharSequence getName();

    T getParentId();

    Comparable<?> getWeight();

    Node<T> setId(T t);

    Node<T> setName(CharSequence charSequence);

    Node<T> setParentId(T t);

    Node<T> setWeight(Comparable<?> comparable);

    @Override // java.lang.Comparable
    default int compareTo(Node node) {
        if (node == null) {
            return 1;
        }
        return t94.a(getWeight(), node.getWeight());
    }
}
