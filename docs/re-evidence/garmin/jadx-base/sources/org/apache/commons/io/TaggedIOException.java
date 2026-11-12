package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TaggedIOException extends IOExceptionWithCause {
    private static final long serialVersionUID = -6994123481142850163L;
    private final Serializable tag;

    public TaggedIOException(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.tag = serializable;
    }

    public static boolean isTaggedWith(Throwable th3, Object obj) {
        return obj != null && (th3 instanceof TaggedIOException) && obj.equals(((TaggedIOException) th3).tag);
    }

    public static void throwCauseIfTaggedWith(Throwable th3, Object obj) throws IOException {
        if (isTaggedWith(th3, obj)) {
            throw ((TaggedIOException) th3).getCause();
        }
    }

    @Override // java.lang.Throwable
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }

    public Serializable getTag() {
        return this.tag;
    }
}
