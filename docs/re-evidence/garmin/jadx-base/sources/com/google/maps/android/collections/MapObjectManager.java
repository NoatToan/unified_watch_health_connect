package com.google.maps.android.collections;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.MapObjectManager.Collection;
import fb1.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import vb.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MapObjectManager<O, C extends Collection> {
    protected final GoogleMap mMap;
    private final Map<String, C> mNamedCollections = new HashMap();
    protected final Map<O, C> mAllObjects = new HashMap();

    public class Collection {
        private final Set<O> mObjects = new LinkedHashSet();

        public Collection() {
        }

        public void add(O o7) {
            this.mObjects.add(o7);
            MapObjectManager.this.mAllObjects.put(o7, this);
        }

        public void clear() {
            for (O o7 : this.mObjects) {
                MapObjectManager.this.removeObjectFromMap(o7);
                MapObjectManager.this.mAllObjects.remove(o7);
            }
            this.mObjects.clear();
        }

        public java.util.Collection<O> getObjects() {
            return Collections.unmodifiableCollection(this.mObjects);
        }

        public boolean remove(O o7) {
            if (!this.mObjects.remove(o7)) {
                return false;
            }
            MapObjectManager.this.mAllObjects.remove(o7);
            MapObjectManager.this.removeObjectFromMap(o7);
            return true;
        }
    }

    public MapObjectManager(GoogleMap googleMap) {
        this.mMap = googleMap;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.maps.android.collections.MapObjectManager.1
            @Override // java.lang.Runnable
            public void run() {
                MapObjectManager.this.setListenersOnUiThread();
            }
        });
    }

    public C getCollection(String str) {
        return this.mNamedCollections.get(str);
    }

    public abstract C newCollection();

    public C newCollection(String str) {
        if (this.mNamedCollections.get(str) != null) {
            h.s(c.n("collection id is not unique: ", str));
            return null;
        }
        C c14 = (C) newCollection();
        this.mNamedCollections.put(str, c14);
        return c14;
    }

    public boolean remove(O o7) {
        C c14 = this.mAllObjects.get(o7);
        return c14 != null && c14.remove(o7);
    }

    public abstract void removeObjectFromMap(O o7);

    public abstract void setListenersOnUiThread();
}
