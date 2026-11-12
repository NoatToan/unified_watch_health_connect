package com.xiaomi.infra.galaxy.fds.exception;

/* JADX INFO: loaded from: classes22.dex */
public class CacheFullException extends Exception {
    private int a;
    private int b;

    public CacheFullException(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int bucketIndex() {
        return this.b;
    }

    public int requestedSize() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("Allocator requested size ");
        sb.append(this.a);
        sb.append(" for bucket ");
        sb.append(this.b);
        return sb.toString();
    }
}
