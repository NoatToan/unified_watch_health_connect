package com.google.android.play.integrity.internal;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public abstract class as extends ao implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient ar f53433a;

    public static as h() {
        return au.f53436a;
    }

    @Override // com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: d */
    public abstract av iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof as) {
            ((as) obj).i();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final ar f() {
        ar arVar = this.f53433a;
        if (arVar != null) {
            return arVar;
        }
        ar arVarG = g();
        this.f53433a = arVarG;
        return arVarG;
    }

    public ar g() {
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public boolean i() {
        throw null;
    }
}
