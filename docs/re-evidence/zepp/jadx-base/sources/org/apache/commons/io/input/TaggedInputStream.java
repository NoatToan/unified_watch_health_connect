package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

/* JADX INFO: loaded from: classes23.dex */
public class TaggedInputStream extends ProxyInputStream {
    private final Serializable a;

    public TaggedInputStream(InputStream inputStream) {
        super(inputStream);
        this.a = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    public void handleIOException(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.a);
    }

    public boolean isCauseOf(Throwable th) {
        return TaggedIOException.isTaggedWith(th, this.a);
    }

    public void throwIfCauseOf(Throwable th) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(th, this.a);
    }
}
