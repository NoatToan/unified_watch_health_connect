package com.xiaomi.smarthome.homeroom.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UnduplicateList<E> extends ForwardingList<E> {
    public UnduplicateList(List<E> list) {
        super(list);
    }

    @Override // com.xiaomi.smarthome.homeroom.model.ForwardingList, java.util.List, java.util.Collection
    public synchronized boolean add(E e) {
        return contains(e) || super.add(e);
    }

    @Override // com.xiaomi.smarthome.homeroom.model.ForwardingList, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(collection);
            arrayList.removeAll(this);
        }
        return super.addAll(arrayList);
    }

    @Override // com.xiaomi.smarthome.homeroom.model.ForwardingList, java.util.List
    public synchronized void add(int i, E e) {
        synchronized (this) {
            if (contains(e)) {
                return;
            }
            super.add(i, e);
        }
    }

    @Override // com.xiaomi.smarthome.homeroom.model.ForwardingList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(collection);
            arrayList.removeAll(this);
        }
        return super.addAll(i, arrayList);
    }
}
