package com.google.maps.android.quadtree;

import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class PointQuadTree<T extends Item> {
    private static final int MAX_DEPTH = 40;
    private static final int MAX_ELEMENTS = 50;
    private final Bounds mBounds;
    private List<PointQuadTree<T>> mChildren;
    private final int mDepth;
    private Set<T> mItems;

    public interface Item {
        Point getPoint();
    }

    private PointQuadTree(double d14, double d15, double d16, double d17, int i14) {
        this(new Bounds(d14, d15, d16, d17), i14);
    }

    private void insert(double d14, double d15, T t7) {
        List<PointQuadTree<T>> list = this.mChildren;
        if (list == null) {
            if (this.mItems == null) {
                this.mItems = new LinkedHashSet();
            }
            this.mItems.add(t7);
            if (this.mItems.size() <= 50 || this.mDepth >= 40) {
                return;
            }
            split();
            return;
        }
        Bounds bounds = this.mBounds;
        if (d15 < bounds.midY) {
            if (d14 < bounds.midX) {
                list.get(0).insert(d14, d15, t7);
                return;
            } else {
                list.get(1).insert(d14, d15, t7);
                return;
            }
        }
        if (d14 < bounds.midX) {
            list.get(2).insert(d14, d15, t7);
        } else {
            list.get(3).insert(d14, d15, t7);
        }
    }

    private boolean remove(double d14, double d15, T t7) {
        List<PointQuadTree<T>> list = this.mChildren;
        if (list != null) {
            Bounds bounds = this.mBounds;
            if (d15 < bounds.midY) {
                return d14 < bounds.midX ? list.get(0).remove(d14, d15, t7) : list.get(1).remove(d14, d15, t7);
            }
            return d14 < bounds.midX ? list.get(2).remove(d14, d15, t7) : list.get(3).remove(d14, d15, t7);
        }
        Set<T> set = this.mItems;
        if (set == null) {
            return false;
        }
        return set.remove(t7);
    }

    private void search(Bounds bounds, Collection<T> collection) {
        if (this.mBounds.intersects(bounds)) {
            List<PointQuadTree<T>> list = this.mChildren;
            if (list != null) {
                Iterator<PointQuadTree<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().search(bounds, collection);
                }
            } else if (this.mItems != null) {
                boolean zContains = bounds.contains(this.mBounds);
                Set<T> set = this.mItems;
                if (zContains) {
                    collection.addAll(set);
                    return;
                }
                for (T t7 : set) {
                    if (bounds.contains(t7.getPoint())) {
                        collection.add(t7);
                    }
                }
            }
        }
    }

    private void split() {
        ArrayList arrayList = new ArrayList(4);
        this.mChildren = arrayList;
        Bounds bounds = this.mBounds;
        arrayList.add(new PointQuadTree(bounds.minX, bounds.midX, bounds.minY, bounds.midY, this.mDepth + 1));
        List<PointQuadTree<T>> list = this.mChildren;
        Bounds bounds2 = this.mBounds;
        list.add(new PointQuadTree<>(bounds2.midX, bounds2.maxX, bounds2.minY, bounds2.midY, this.mDepth + 1));
        List<PointQuadTree<T>> list2 = this.mChildren;
        Bounds bounds3 = this.mBounds;
        list2.add(new PointQuadTree<>(bounds3.minX, bounds3.midX, bounds3.midY, bounds3.maxY, this.mDepth + 1));
        List<PointQuadTree<T>> list3 = this.mChildren;
        Bounds bounds4 = this.mBounds;
        list3.add(new PointQuadTree<>(bounds4.midX, bounds4.maxX, bounds4.midY, bounds4.maxY, this.mDepth + 1));
        Set<T> set = this.mItems;
        this.mItems = null;
        for (T t7 : set) {
            insert(t7.getPoint().f54320x, t7.getPoint().f54321y, t7);
        }
    }

    public void add(T t7) {
        Point point = t7.getPoint();
        if (this.mBounds.contains(point.f54320x, point.f54321y)) {
            insert(point.f54320x, point.f54321y, t7);
        }
    }

    public void clear() {
        this.mChildren = null;
        Set<T> set = this.mItems;
        if (set != null) {
            set.clear();
        }
    }

    public PointQuadTree(Bounds bounds) {
        this(bounds, 0);
    }

    public PointQuadTree(double d14, double d15, double d16, double d17) {
        this(new Bounds(d14, d15, d16, d17));
    }

    private PointQuadTree(Bounds bounds, int i14) {
        this.mChildren = null;
        this.mBounds = bounds;
        this.mDepth = i14;
    }

    public Collection<T> search(Bounds bounds) {
        ArrayList arrayList = new ArrayList();
        search(bounds, arrayList);
        return arrayList;
    }

    public boolean remove(T t7) {
        Point point = t7.getPoint();
        if (this.mBounds.contains(point.f54320x, point.f54321y)) {
            return remove(point.f54320x, point.f54321y, t7);
        }
        return false;
    }
}
