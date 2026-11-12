package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
final class c0 implements Serializable {
    private int a;

    public c0(int i) {
        this.a = i;
    }

    public void a(int i) {
        this.a += i;
    }

    public int b(int i) {
        int i2 = this.a + i;
        this.a = i2;
        return i2;
    }

    public int c() {
        return this.a;
    }

    public int e(int i) {
        int i2 = this.a;
        this.a = i;
        return i2;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof c0) && ((c0) obj).a == this.a;
    }

    public void f(int i) {
        this.a = i;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return Integer.toString(this.a);
    }
}
