package ua;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f169595a = new a();

    public class a implements e {
        @Override // ua.e
        public final long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // ua.e
        public final long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // ua.e
        public final boolean next() {
            return false;
        }
    }

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    boolean next();
}
