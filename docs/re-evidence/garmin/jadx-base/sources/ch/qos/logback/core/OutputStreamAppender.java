package ch.qos.logback.core;

import am.j;
import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import ch.qos.logback.core.status.ErrorStatus;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class OutputStreamAppender<E> extends UnsynchronizedAppenderBase<E> {
    protected Encoder<E> encoder;
    private OutputStream outputStream;
    protected final ReentrantLock lock = new ReentrantLock(false);
    private boolean immediateFlush = true;

    private void writeBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        this.lock.lock();
        try {
            this.outputStream.write(bArr);
            if (this.immediateFlush) {
                this.outputStream.flush();
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(E e4) {
        if (isStarted()) {
            subAppend(e4);
        }
    }

    public void closeOutputStream() {
        if (this.outputStream != null) {
            try {
                encoderClose();
                this.outputStream.close();
                this.outputStream = null;
            } catch (IOException e4) {
                addStatus(new ErrorStatus("Could not close output stream for OutputStreamAppender.", this, e4));
            }
        }
    }

    public void encoderClose() {
        Encoder<E> encoder = this.encoder;
        if (encoder == null || this.outputStream == null) {
            return;
        }
        try {
            writeBytes(encoder.footerBytes());
        } catch (IOException e4) {
            this.started = false;
            addStatus(new ErrorStatus(j.o(this.name, "].", new StringBuilder("Failed to write footer for appender named [")), this, e4));
        }
    }

    public void encoderInit() {
        Encoder<E> encoder = this.encoder;
        if (encoder == null || this.outputStream == null) {
            return;
        }
        try {
            writeBytes(encoder.headerBytes());
        } catch (IOException e4) {
            this.started = false;
            addStatus(new ErrorStatus(j.o(this.name, "].", new StringBuilder("Failed to initialize encoder for appender named [")), this, e4));
        }
    }

    public Encoder<E> getEncoder() {
        return this.encoder;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public boolean isImmediateFlush() {
        return this.immediateFlush;
    }

    public void setEncoder(Encoder<E> encoder) {
        this.encoder = encoder;
    }

    public void setImmediateFlush(boolean z14) {
        this.immediateFlush = z14;
    }

    public void setLayout(Layout<E> layout) {
        addWarn("This appender no longer admits a layout as a sub-component, set an encoder instead.");
        addWarn("To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.");
        addWarn("See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details");
        LayoutWrappingEncoder layoutWrappingEncoder = new LayoutWrappingEncoder();
        layoutWrappingEncoder.setLayout(layout);
        layoutWrappingEncoder.setContext(this.context);
        this.encoder = layoutWrappingEncoder;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.lock.lock();
        try {
            closeOutputStream();
            this.outputStream = outputStream;
            if (this.encoder == null) {
                addWarn("Encoder has not been set. Cannot invoke its init method.");
            } else {
                encoderInit();
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i14;
        if (this.encoder == null) {
            addStatus(new ErrorStatus(j.o(this.name, "\".", new StringBuilder("No encoder set for the appender named \"")), this));
            i14 = 1;
        } else {
            i14 = 0;
        }
        if (this.outputStream == null) {
            addStatus(new ErrorStatus(j.o(this.name, "\".", new StringBuilder("No output stream set for the appender named \"")), this));
            i14++;
        }
        if (i14 == 0) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.lock.lock();
        try {
            closeOutputStream();
            super.stop();
        } finally {
            this.lock.unlock();
        }
    }

    public void subAppend(E e4) {
        if (isStarted()) {
            try {
                if (e4 instanceof DeferredProcessingAware) {
                    ((DeferredProcessingAware) e4).prepareForDeferredProcessing();
                }
                writeBytes(this.encoder.encode(e4));
            } catch (IOException e14) {
                this.started = false;
                addStatus(new ErrorStatus("IO failure in appender", this, e14));
            }
        }
    }

    public void writeOut(E e4) {
        writeBytes(this.encoder.encode(e4));
    }
}
