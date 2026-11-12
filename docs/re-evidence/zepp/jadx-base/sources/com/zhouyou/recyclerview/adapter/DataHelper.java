package com.zhouyou.recyclerview.adapter;

import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface DataHelper<T> {
    void add(int i, T t);

    boolean addAll(int i, List<T> list);

    void addItemToHead(T t);

    boolean addItemToLast(T t);

    boolean addItemsToHead(List<T> list);

    boolean addItemsToLast(List<T> list);

    void alterObj(int i, T t);

    void alterObj(T t, T t2);

    void clear();

    boolean contains(T t);

    T getData(int i);

    boolean isEnabled(int i);

    boolean remove(T t);

    void removeToIndex(int i);

    void replaceAll(List<T> list);

    boolean setListAll(List<T> list);
}
