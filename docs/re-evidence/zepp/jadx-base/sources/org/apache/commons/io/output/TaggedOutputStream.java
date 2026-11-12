package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

/* JADX INFO: loaded from: classes23.dex */
public class TaggedOutputStream extends ProxyOutputStream {
    private final Serializable a;

    public TaggedOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.a = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream
    public void handleIOException(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.a);
    }

    public boolean isCauseOf(Exception exc) {
        return TaggedIOException.isTaggedWith(exc, this.a);
    }

    public void throwIfCauseOf(Exception exc) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(exc, this.a);
    }
}
