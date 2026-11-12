package ch.qos.logback.core.encoder;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.OutputStreamAppender;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public class LayoutWrappingEncoder<E> extends EncoderBase<E> {
    private Charset charset;
    Boolean immediateFlush = null;
    protected Layout<E> layout;
    Appender<?> parent;

    private void appendIfNotNull(StringBuilder sb3, String str) {
        if (str != null) {
            sb3.append(str);
        }
    }

    private byte[] convertToBytes(String str) {
        Charset charset = this.charset;
        return charset == null ? str.getBytes() : str.getBytes(charset);
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] encode(E e4) {
        return convertToBytes(this.layout.doLayout(e4));
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] footerBytes() {
        if (this.layout == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        appendIfNotNull(sb3, this.layout.getPresentationFooter());
        appendIfNotNull(sb3, this.layout.getFileFooter());
        return convertToBytes(sb3.toString());
    }

    public Charset getCharset() {
        return this.charset;
    }

    public Layout<E> getLayout() {
        return this.layout;
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] headerBytes() {
        if (this.layout == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        appendIfNotNull(sb3, this.layout.getFileHeader());
        appendIfNotNull(sb3, this.layout.getPresentationHeader());
        if (sb3.length() > 0) {
            sb3.append(CoreConstants.LINE_SEPARATOR);
        }
        return convertToBytes(sb3.toString());
    }

    @Override // ch.qos.logback.core.encoder.EncoderBase, ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return false;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public void setImmediateFlush(boolean z14) {
        addWarn("As of version 1.2.0 \"immediateFlush\" property should be set within the enclosing Appender.");
        addWarn("Please move \"immediateFlush\" property into the enclosing appender.");
        this.immediateFlush = Boolean.valueOf(z14);
    }

    public void setLayout(Layout<E> layout) {
        this.layout = layout;
    }

    public void setParent(Appender<?> appender) {
        this.parent = appender;
    }

    @Override // ch.qos.logback.core.encoder.EncoderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.immediateFlush != null) {
            if (this.parent instanceof OutputStreamAppender) {
                addWarn("Setting the \"immediateFlush\" property of the enclosing appender to " + this.immediateFlush);
                ((OutputStreamAppender) this.parent).setImmediateFlush(this.immediateFlush.booleanValue());
            } else {
                addError("Could not set the \"immediateFlush\" property of the enclosing appender.");
            }
        }
        this.started = true;
    }

    @Override // ch.qos.logback.core.encoder.EncoderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }
}
