package com.google.android.exoplayer2.decoder;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends OutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque<I> c = new ArrayDeque<>();
    private final ArrayDeque<O> d = new ArrayDeque<>();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    public class a extends Thread {
        public a(String name) {
            super(name);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            SimpleDecoder.this.h();
        }
    }

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            ((I[]) this.e)[i] = createInputBuffer();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            ((O[]) this.f)[i2] = createOutputBuffer();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.a = aVar;
        aVar.start();
    }

    private boolean b() {
        return !this.c.isEmpty() && this.h > 0;
    }

    private boolean c() throws InterruptedException {
        E e;
        synchronized (this.b) {
            while (!this.l && !b()) {
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            I iRemoveFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i = this.h - 1;
            this.h = i;
            O o = oArr[i];
            boolean z = this.k;
            this.k = false;
            if (iRemoveFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o.addFlag(Integer.MIN_VALUE);
                }
                try {
                    e = (E) decode(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) createUnexpectedDecodeException(e2);
                } catch (RuntimeException e3) {
                    e = (E) createUnexpectedDecodeException(e3);
                }
                if (e != null) {
                    synchronized (this.b) {
                        this.j = e;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    o.release();
                } else if (o.isDecodeOnly()) {
                    this.m++;
                    o.release();
                } else {
                    o.skippedOutputBufferCount = this.m;
                    this.m = 0;
                    this.d.addLast(o);
                }
                f(iRemoveFirst);
            }
            return true;
        }
    }

    private void d() {
        if (b()) {
            this.b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    private void e() throws E, DecoderException {
        E e = this.j;
        if (e != null) {
            throw e;
        }
    }

    private void f(I inputBuffer) {
        inputBuffer.clear();
        I[] iArr = this.e;
        int i = this.g;
        this.g = i + 1;
        iArr[i] = inputBuffer;
    }

    private void g(O outputBuffer) {
        outputBuffer.clear();
        O[] oArr = this.f;
        int i = this.h;
        this.h = i + 1;
        oArr[i] = outputBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (c());
    }

    public abstract I createInputBuffer();

    public abstract O createOutputBuffer();

    public abstract E createUnexpectedDecodeException(Throwable error);

    @Nullable
    public abstract E decode(I inputBuffer, O outputBuffer, boolean reset);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            I i = this.i;
            if (i != null) {
                f(i);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                f(this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                this.d.removeFirst().release();
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @CallSuper
    public void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @CallSuper
    public void releaseOutputBuffer(O outputBuffer) {
        synchronized (this.b) {
            g(outputBuffer);
            d();
        }
    }

    public final void setInitialInputBufferSize(int size) {
        Assertions.checkState(this.g == this.e.length);
        for (I i : this.e) {
            i.ensureSpaceForWrite(size);
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public final I dequeueInputBuffer() throws DecoderException {
        I i;
        synchronized (this.b) {
            e();
            Assertions.checkState(this.i == null);
            int i2 = this.g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.e;
                int i3 = i2 - 1;
                this.g = i3;
                i = iArr[i3];
            }
            this.i = i;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public final O dequeueOutputBuffer() throws DecoderException {
        synchronized (this.b) {
            e();
            if (this.d.isEmpty()) {
                return null;
            }
            return this.d.removeFirst();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void queueInputBuffer(I inputBuffer) throws DecoderException {
        synchronized (this.b) {
            e();
            Assertions.checkArgument(inputBuffer == this.i);
            this.c.addLast(inputBuffer);
            d();
            this.i = null;
        }
    }
}
