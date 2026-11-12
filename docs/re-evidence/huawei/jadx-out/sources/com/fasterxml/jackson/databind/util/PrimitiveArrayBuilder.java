package com.fasterxml.jackson.databind.util;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PrimitiveArrayBuilder<T> {
    static final int INITIAL_CHUNK_SIZE = 12;
    static final int MAX_CHUNK_SIZE = 262144;
    static final int SMALL_CHUNK_SIZE = 16384;
    protected b<T> _bufferHead;
    protected b<T> _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    protected abstract T _constructArray(int i);

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T resetAndStart() {
        _reset();
        T t = this._freeBuffer;
        return t == null ? _constructArray(12) : t;
    }

    public final T appendCompletedChunk(T t, int i) {
        b<T> bVar = new b<>(t, i);
        if (this._bufferHead == null) {
            this._bufferTail = bVar;
            this._bufferHead = bVar;
        } else {
            this._bufferTail.d(bVar);
            this._bufferTail = bVar;
        }
        this._bufferedEntryCount += i;
        return _constructArray(i < 16384 ? i + i : i + (i >> 2));
    }

    public T completeAndClearBuffer(T t, int i) {
        int i2 = this._bufferedEntryCount + i;
        T t_constructArray = _constructArray(i2);
        int iC = 0;
        for (b<T> bVarE = this._bufferHead; bVarE != null; bVarE = bVarE.e()) {
            iC = bVarE.c(t_constructArray, iC);
        }
        System.arraycopy(t, 0, t_constructArray, iC, i);
        int i3 = iC + i;
        if (i3 == i2) {
            return t_constructArray;
        }
        throw new IllegalStateException("Should have gotten " + i2 + " entries, got " + i3);
    }

    protected void _reset() {
        b<T> bVar = this._bufferTail;
        if (bVar != null) {
            this._freeBuffer = bVar.c();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b<T> f4206a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f4207c;
        final T d;

        public b(T t, int i) {
            this.d = t;
            this.f4207c = i;
        }

        public T c() {
            return this.d;
        }

        public int c(T t, int i) {
            System.arraycopy(this.d, 0, t, i, this.f4207c);
            return i + this.f4207c;
        }

        public b<T> e() {
            return this.f4206a;
        }

        public void d(b<T> bVar) {
            if (this.f4206a != null) {
                throw new IllegalStateException();
            }
            this.f4206a = bVar;
        }
    }
}
