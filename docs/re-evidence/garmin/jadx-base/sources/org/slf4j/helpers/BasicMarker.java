package org.slf4j.helpers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Marker;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class BasicMarker implements Marker {
    private static String CLOSE = " ]";
    private static String OPEN = "[ ";
    private static String SEP = ", ";
    private static final long serialVersionUID = -2849567615646933777L;
    private final String name;
    private List<Marker> referenceList = new CopyOnWriteArrayList();

    public BasicMarker(String str) {
        if (str != null) {
            this.name = str;
        } else {
            h.s("A marker name cannot be null");
            throw null;
        }
    }

    @Override // org.slf4j.Marker
    public void add(Marker marker) {
        if (marker == null) {
            h.s("A null value cannot be added to a Marker as reference.");
        } else {
            if (contains(marker) || marker.contains(this)) {
                return;
            }
            this.referenceList.add(marker);
        }
    }

    @Override // org.slf4j.Marker
    public boolean contains(String str) {
        if (str == null) {
            h.s("Other cannot be null");
            return false;
        }
        if (this.name.equals(str)) {
            return true;
        }
        if (!hasReferences()) {
            return false;
        }
        Iterator<Marker> it = this.referenceList.iterator();
        while (it.hasNext()) {
            if (it.next().contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Marker)) {
            return this.name.equals(((Marker) obj).getName());
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.Marker
    public boolean hasChildren() {
        return hasReferences();
    }

    @Override // org.slf4j.Marker
    public boolean hasReferences() {
        return this.referenceList.size() > 0;
    }

    @Override // org.slf4j.Marker
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override // org.slf4j.Marker
    public Iterator<Marker> iterator() {
        return this.referenceList.iterator();
    }

    @Override // org.slf4j.Marker
    public boolean remove(Marker marker) {
        return this.referenceList.remove(marker);
    }

    public String toString() {
        if (!hasReferences()) {
            return getName();
        }
        Iterator<Marker> it = iterator();
        StringBuilder sb3 = new StringBuilder(getName());
        sb3.append(' ');
        sb3.append(OPEN);
        while (it.hasNext()) {
            sb3.append(it.next().getName());
            if (it.hasNext()) {
                sb3.append(SEP);
            }
        }
        sb3.append(CLOSE);
        return sb3.toString();
    }

    @Override // org.slf4j.Marker
    public boolean contains(Marker marker) {
        if (marker != null) {
            if (equals(marker)) {
                return true;
            }
            if (!hasReferences()) {
                return false;
            }
            Iterator<Marker> it = this.referenceList.iterator();
            while (it.hasNext()) {
                if (it.next().contains(marker)) {
                    return true;
                }
            }
            return false;
        }
        h.s("Other cannot be null");
        return false;
    }
}
