package com.airbnb.lottie.model;

import am.j;
import k7.d;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class MutablePair<T> {
    T first;
    T second;

    private static boolean objectsEqual(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return objectsEqual(dVar.f103262a, this.first) && objectsEqual(dVar.f103263b, this.second);
    }

    public int hashCode() {
        T t7 = this.first;
        int iHashCode = t7 == null ? 0 : t7.hashCode();
        T t14 = this.second;
        return iHashCode ^ (t14 != null ? t14.hashCode() : 0);
    }

    public void set(T t7, T t14) {
        this.first = t7;
        this.second = t14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Pair{");
        sb3.append(this.first);
        sb3.append(StringUtils.SPACE);
        return j.k(this.second, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
