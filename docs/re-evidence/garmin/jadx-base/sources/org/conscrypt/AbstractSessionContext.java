package org.conscrypt;

import c22.t;
import j20.x;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractSessionContext implements SSLSessionContext {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 28800;
    private volatile int maximumSize;
    private volatile int timeout = DEFAULT_SESSION_TIMEOUT_SECONDS;
    final long sslCtxNativePointer = NativeCrypto.SSL_CTX_new();
    private final Map<ByteArray, NativeSslSession> sessions = new LinkedHashMap<ByteArray, NativeSslSession>() { // from class: org.conscrypt.AbstractSessionContext.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<ByteArray, NativeSslSession> entry) {
            if (AbstractSessionContext.this.maximumSize <= 0 || size() <= AbstractSessionContext.this.maximumSize) {
                return false;
            }
            AbstractSessionContext.this.onBeforeRemoveSession(entry.getValue());
            return true;
        }
    };

    public AbstractSessionContext(int i14) {
        this.maximumSize = i14;
    }

    private void trimToSize() {
        synchronized (this.sessions) {
            try {
                int size = this.sessions.size();
                if (size > this.maximumSize) {
                    int i14 = size - this.maximumSize;
                    Iterator<NativeSslSession> it = this.sessions.values().iterator();
                    while (true) {
                        int i15 = i14 - 1;
                        if (i14 <= 0) {
                            break;
                        }
                        onBeforeRemoveSession(it.next());
                        it.remove();
                        i14 = i15;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void cacheSession(NativeSslSession nativeSslSession) {
        byte[] id3 = nativeSslSession.getId();
        if (id3 == null || id3.length == 0) {
            return;
        }
        synchronized (this.sessions) {
            try {
                ByteArray byteArray = new ByteArray(id3);
                if (this.sessions.containsKey(byteArray)) {
                    removeSession(this.sessions.get(byteArray));
                }
                onBeforeAddSession(nativeSslSession);
                this.sessions.put(byteArray, nativeSslSession);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void finalize() throws Throwable {
        try {
            NativeCrypto.SSL_CTX_free(this.sslCtxNativePointer, this);
        } finally {
            super.finalize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final Enumeration<byte[]> getIds() {
        final Iterator it;
        synchronized (this.sessions) {
            it = Arrays.asList(this.sessions.values().toArray(new NativeSslSession[this.sessions.size()])).iterator();
        }
        return new Enumeration<byte[]>() { // from class: org.conscrypt.AbstractSessionContext.2
            private NativeSslSession next;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.next != null) {
                    return true;
                }
                while (it.hasNext()) {
                    NativeSslSession nativeSslSession = (NativeSslSession) it.next();
                    if (nativeSslSession.isValid()) {
                        this.next = nativeSslSession;
                        return true;
                    }
                }
                this.next = null;
                return false;
            }

            @Override // java.util.Enumeration
            public byte[] nextElement() {
                if (!hasMoreElements()) {
                    t.g();
                    return null;
                }
                byte[] id3 = this.next.getId();
                this.next = null;
                return id3;
            }
        };
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final SSLSession getSession(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            x.l("sessionId");
            return null;
        }
        ByteArray byteArray = new ByteArray(bArr);
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(byteArray);
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return null;
        }
        return nativeSslSession.toSSLSession();
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionCacheSize() {
        return this.maximumSize;
    }

    public final NativeSslSession getSessionFromCache(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            return null;
        }
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(new ByteArray(bArr));
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return getSessionFromPersistentCache(bArr);
        }
        if (nativeSslSession.isSingleUse()) {
            removeSession(nativeSslSession);
        }
        return nativeSslSession;
    }

    public abstract NativeSslSession getSessionFromPersistentCache(byte[] bArr);

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionTimeout() {
        return this.timeout;
    }

    public abstract void onBeforeAddSession(NativeSslSession nativeSslSession);

    public abstract void onBeforeRemoveSession(NativeSslSession nativeSslSession);

    public final void removeSession(NativeSslSession nativeSslSession) {
        byte[] id3 = nativeSslSession.getId();
        if (id3 == null || id3.length == 0) {
            return;
        }
        onBeforeRemoveSession(nativeSslSession);
        ByteArray byteArray = new ByteArray(id3);
        synchronized (this.sessions) {
            this.sessions.remove(byteArray);
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionCacheSize(int i14) {
        if (i14 < 0) {
            h.s("size < 0");
            return;
        }
        int i15 = this.maximumSize;
        this.maximumSize = i14;
        if (i14 < i15) {
            trimToSize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionTimeout(int i14) {
        if (i14 < 0) {
            h.s("seconds < 0");
            return;
        }
        synchronized (this.sessions) {
            try {
                this.timeout = i14;
                long j8 = this.sslCtxNativePointer;
                if (i14 > 0) {
                    NativeCrypto.SSL_CTX_set_timeout(j8, this, i14);
                } else {
                    NativeCrypto.SSL_CTX_set_timeout(j8, this, 2147483647L);
                }
                Iterator<NativeSslSession> it = this.sessions.values().iterator();
                while (it.hasNext()) {
                    NativeSslSession next = it.next();
                    if (!next.isValid()) {
                        onBeforeRemoveSession(next);
                        it.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
