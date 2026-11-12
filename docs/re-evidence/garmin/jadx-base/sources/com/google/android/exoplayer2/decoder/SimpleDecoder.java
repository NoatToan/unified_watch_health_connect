package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayDeque;
import yc.l2;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private boolean flushed;
    private final Object lock = new Object();
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i14 = 0; i14 < this.availableInputBufferCount; i14++) {
            ((I[]) this.availableInputBuffers)[i14] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i15 = 0; i15 < this.availableOutputBufferCount; i15++) {
            ((O[]) this.availableOutputBuffers)[i15] = createOutputBuffer();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: com.google.android.exoplayer2.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder.this.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    private boolean canDecodeBuffer() {
        return !this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0;
    }

    private boolean decode() {
        E e4;
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                try {
                    this.lock.wait();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.released) {
                return false;
            }
            I iRemoveFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i14 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i14;
            O o7 = oArr[i14];
            boolean z14 = this.flushed;
            this.flushed = false;
            if (iRemoveFirst.isEndOfStream()) {
                o7.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o7.addFlag(Integer.MIN_VALUE);
                }
                try {
                    e4 = (E) decode(iRemoveFirst, o7, z14);
                } catch (OutOfMemoryError e14) {
                    e4 = (E) createUnexpectedDecodeException(e14);
                } catch (RuntimeException e15) {
                    e4 = (E) createUnexpectedDecodeException(e15);
                }
                if (e4 != null) {
                    synchronized (this.lock) {
                        this.exception = e4;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        o7.release();
                    } else {
                        boolean zIsDecodeOnly = o7.isDecodeOnly();
                        int i15 = this.skippedOutputBufferCount;
                        if (zIsDecodeOnly) {
                            this.skippedOutputBufferCount = i15 + 1;
                            o7.release();
                        } else {
                            o7.skippedOutputBufferCount = i15;
                            this.skippedOutputBufferCount = 0;
                            this.queuedOutputBuffers.addLast(o7);
                        }
                    }
                    releaseInputBufferInternal(iRemoveFirst);
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return true;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    private void maybeThrowException() throws E {
        E e4 = this.exception;
        if (e4 != null) {
            throw e4;
        }
    }

    private void releaseInputBufferInternal(I i14) {
        i14.clear();
        I[] iArr = this.availableInputBuffers;
        int i15 = this.availableInputBufferCount;
        this.availableInputBufferCount = i15 + 1;
        iArr[i15] = i14;
    }

    private void releaseOutputBufferInternal(O o7) {
        o7.clear();
        O[] oArr = this.availableOutputBuffers;
        int i14 = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i14 + 1;
        oArr[i14] = o7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e4) {
                l2.p(e4);
                return;
            }
        } while (decode());
    }

    public abstract I createInputBuffer();

    public abstract O createOutputBuffer();

    public abstract E createUnexpectedDecodeException(Throwable th3);

    public abstract E decode(I i14, O o7, boolean z14);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final I dequeueInputBuffer() {
        I i14;
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkState(this.dequeuedInputBuffer == null);
            int i15 = this.availableInputBufferCount;
            if (i15 == 0) {
                i14 = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i16 = i15 - 1;
                this.availableInputBufferCount = i16;
                i14 = iArr[i16];
            }
            this.dequeuedInputBuffer = i14;
        }
        return i14;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final O dequeueOutputBuffer() {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                I i14 = this.dequeuedInputBuffer;
                if (i14 != null) {
                    releaseInputBufferInternal(i14);
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    releaseInputBufferInternal(this.queuedInputBuffers.removeFirst());
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    this.queuedOutputBuffers.removeFirst().release();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void queueInputBuffer(I i14) {
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkArgument(i14 == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i14);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void releaseOutputBuffer(O o7) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o7);
            maybeNotifyDecodeLoop();
        }
    }

    public final void setInitialInputBufferSize(int i14) {
        Assertions.checkState(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (I i15 : this.availableInputBuffers) {
            i15.ensureSpaceForWrite(i14);
        }
    }
}
