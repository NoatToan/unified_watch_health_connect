package cn.hutool.core.lang;

import cn.hutool.core.lang.ConsistentHash;
import defpackage.glb;
import defpackage.nlb;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class ConsistentHash<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private final SortedMap<Integer, T> circle;
    glb<Object> hashFunc;
    private final int numberOfReplicas;

    public ConsistentHash(int i, Collection<T> collection) {
        this.circle = new TreeMap();
        this.numberOfReplicas = i;
        this.hashFunc = new glb() { // from class: gf4
            @Override // defpackage.glb
            public final int a(Object obj) {
                return ConsistentHash.lambda$new$0(obj);
            }
        };
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Object obj) {
        return nlb.a(obj.toString());
    }

    public void add(T t) {
        for (int i = 0; i < this.numberOfReplicas; i++) {
            this.circle.put(Integer.valueOf(this.hashFunc.a(t.toString() + i)), t);
        }
    }

    public T get(Object obj) {
        if (this.circle.isEmpty()) {
            return null;
        }
        int iA = this.hashFunc.a(obj);
        if (!this.circle.containsKey(Integer.valueOf(iA))) {
            SortedMap<Integer, T> sortedMapTailMap = this.circle.tailMap(Integer.valueOf(iA));
            if (sortedMapTailMap.isEmpty()) {
                sortedMapTailMap = this.circle;
            }
            iA = sortedMapTailMap.firstKey().intValue();
        }
        return this.circle.get(Integer.valueOf(iA));
    }

    public void remove(T t) {
        for (int i = 0; i < this.numberOfReplicas; i++) {
            this.circle.remove(Integer.valueOf(this.hashFunc.a(t.toString() + i)));
        }
    }

    public ConsistentHash(glb<Object> glbVar, int i, Collection<T> collection) {
        this.circle = new TreeMap();
        this.numberOfReplicas = i;
        this.hashFunc = glbVar;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}
