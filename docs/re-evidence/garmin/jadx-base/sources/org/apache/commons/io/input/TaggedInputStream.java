package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

/* JADX INFO: loaded from: classes3.dex */
public class TaggedInputStream extends ProxyInputStream {
    private final Serializable tag;

    public TaggedInputStream(InputStream inputStream) {
        super(inputStream);
        this.tag = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    public void handleIOException(IOException iOException) throws TaggedIOException {
        throw new TaggedIOException(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th3) {
        return TaggedIOException.isTaggedWith(th3, this.tag);
    }

    public void throwIfCauseOf(Throwable th3) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(th3, this.tag);
    }
}
