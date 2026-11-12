package com.google.maps.android.quadtree;

import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PointQuadTree<T extends Item> {
    private static final int e = 50;
    private static final int f = 40;
    private final Bounds a;
    private final int b;
    private List<T> c;
    private List<PointQuadTree<T>> d;

    public interface Item {
        Point getPoint();
    }

    public PointQuadTree(double d, double d2, double d3, double d4) {
        this(new Bounds(d, d2, d3, d4));
    }

    private void a(double d, double d2, T t) {
        List<PointQuadTree<T>> list = this.d;
        if (list == null) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(t);
            if (this.c.size() <= 50 || this.b >= 40) {
                return;
            }
            d();
            return;
        }
        Bounds bounds = this.a;
        if (d2 < bounds.midY) {
            if (d < bounds.midX) {
                list.get(0).a(d, d2, t);
                return;
            } else {
                list.get(1).a(d, d2, t);
                return;
            }
        }
        if (d < bounds.midX) {
            list.get(2).a(d, d2, t);
        } else {
            list.get(3).a(d, d2, t);
        }
    }

    private boolean b(double d, double d2, T t) {
        List<PointQuadTree<T>> list = this.d;
        if (list == null) {
            return this.c.remove(t);
        }
        Bounds bounds = this.a;
        if (d2 < bounds.midY) {
            return d < bounds.midX ? list.get(0).b(d, d2, t) : list.get(1).b(d, d2, t);
        }
        return d < bounds.midX ? list.get(2).b(d, d2, t) : list.get(3).b(d, d2, t);
    }

    private void c(Bounds bounds, Collection<T> collection) {
        if (this.a.intersects(bounds)) {
            List<PointQuadTree<T>> list = this.d;
            if (list != null) {
                Iterator<PointQuadTree<T>> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().c(bounds, collection);
                }
            } else if (this.c != null) {
                if (bounds.contains(this.a)) {
                    collection.addAll(this.c);
                    return;
                }
                for (T t : this.c) {
                    if (bounds.contains(t.getPoint())) {
                        collection.add(t);
                    }
                }
            }
        }
    }

    private void d() {
        ArrayList arrayList = new ArrayList(4);
        this.d = arrayList;
        Bounds bounds = this.a;
        arrayList.add(new PointQuadTree(bounds.minX, bounds.midX, bounds.minY, bounds.midY, this.b + 1));
        List<PointQuadTree<T>> list = this.d;
        Bounds bounds2 = this.a;
        list.add(new PointQuadTree<>(bounds2.midX, bounds2.maxX, bounds2.minY, bounds2.midY, this.b + 1));
        List<PointQuadTree<T>> list2 = this.d;
        Bounds bounds3 = this.a;
        list2.add(new PointQuadTree<>(bounds3.minX, bounds3.midX, bounds3.midY, bounds3.maxY, this.b + 1));
        List<PointQuadTree<T>> list3 = this.d;
        Bounds bounds4 = this.a;
        list3.add(new PointQuadTree<>(bounds4.midX, bounds4.maxX, bounds4.midY, bounds4.maxY, this.b + 1));
        List<T> list4 = this.c;
        this.c = null;
        for (T t : list4) {
            a(t.getPoint().x, t.getPoint().y, t);
        }
    }

    public void add(T t) {
        Point point = t.getPoint();
        if (this.a.contains(point.x, point.y)) {
            a(point.x, point.y, t);
        }
    }

    public void clear() {
        this.d = null;
        List<T> list = this.c;
        if (list != null) {
            list.clear();
        }
    }

    public boolean remove(T t) {
        Point point = t.getPoint();
        if (this.a.contains(point.x, point.y)) {
            return b(point.x, point.y, t);
        }
        return false;
    }

    public Collection<T> search(Bounds bounds) {
        ArrayList arrayList = new ArrayList();
        c(bounds, arrayList);
        return arrayList;
    }

    public PointQuadTree(Bounds bounds) {
        this(bounds, 0);
    }

    private PointQuadTree(double d, double d2, double d3, double d4, int i) {
        this(new Bounds(d, d2, d3, d4), i);
    }

    private PointQuadTree(Bounds bounds, int i) {
        this.d = null;
        this.a = bounds;
        this.b = i;
    }
}
