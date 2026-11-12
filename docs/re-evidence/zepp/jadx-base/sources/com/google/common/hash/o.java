package com.google.common.hash;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class o extends u implements Serializable, m {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 0;
        this.a = null;
        this.b = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(a());
    }

    @Override // com.google.common.hash.m
    public long a() {
        long j = this.b;
        u.b[] bVarArr = this.a;
        if (bVarArr != null) {
            for (u.b bVar : bVarArr) {
                if (bVar != null) {
                    j += bVar.h;
                }
            }
        }
        return j;
    }

    @Override // com.google.common.hash.m
    public void add(long j) {
        int length;
        u.b bVar;
        u.b[] bVarArr = this.a;
        if (bVarArr == null) {
            long j2 = this.b;
            if (c(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = u.d.get();
        boolean zA = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j3 = bVar.h;
            zA = bVar.a(j3, j3 + j);
            if (zA) {
                return;
            }
        }
        i(j, iArr, zA);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return a();
    }

    @Override // com.google.common.hash.u
    public final long f(long j, long j2) {
        return j + j2;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return a();
    }

    @Override // com.google.common.hash.m
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) a();
    }

    public void j() {
        add(-1L);
    }

    public void k() {
        h(0L);
    }

    @Override // java.lang.Number
    public long longValue() {
        return a();
    }

    public long m() {
        long j = this.b;
        u.b[] bVarArr = this.a;
        this.b = 0L;
        if (bVarArr != null) {
            for (u.b bVar : bVarArr) {
                if (bVar != null) {
                    j += bVar.h;
                    bVar.h = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(a());
    }
}
