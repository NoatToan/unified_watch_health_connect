package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Count implements Serializable {
    private int value;

    public Count(int i14) {
        this.value = i14;
    }

    public void add(int i14) {
        this.value += i14;
    }

    public int addAndGet(int i14) {
        int i15 = this.value + i14;
        this.value = i15;
        return i15;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Count) && ((Count) obj).value == this.value;
    }

    public int get() {
        return this.value;
    }

    public int getAndSet(int i14) {
        int i15 = this.value;
        this.value = i14;
        return i15;
    }

    public int hashCode() {
        return this.value;
    }

    public void set(int i14) {
        this.value = i14;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
