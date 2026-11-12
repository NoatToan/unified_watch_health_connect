package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.RemoteKeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKMatcher;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jose.util.ResourceRetriever;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
@Deprecated
public class RemoteJWKSet<C extends SecurityContext> implements JWKSource<C> {
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_SIZE_LIMIT = 51200;
    private final JWKSource<C> failoverJWKSource;
    private final JWKSetCache jwkSetCache;
    private final ResourceRetriever jwkSetRetriever;
    private final URL jwkSetURL;

    public RemoteJWKSet(URL url, JWKSource<C> jWKSource, ResourceRetriever resourceRetriever, JWKSetCache jWKSetCache) {
        Objects.requireNonNull(url);
        this.jwkSetURL = url;
        this.failoverJWKSource = jWKSource;
        if (resourceRetriever != null) {
            this.jwkSetRetriever = resourceRetriever;
        } else {
            this.jwkSetRetriever = new DefaultResourceRetriever(resolveDefaultHTTPConnectTimeout(), resolveDefaultHTTPReadTimeout(), resolveDefaultHTTPSizeLimit());
        }
        if (jWKSetCache != null) {
            this.jwkSetCache = jWKSetCache;
        } else {
            this.jwkSetCache = new DefaultJWKSetCache();
        }
    }

    private List<JWK> failover(Exception exc, JWKSelector jWKSelector, C c14) throws RemoteKeySourceException {
        if (getFailoverJWKSource() == null) {
            return null;
        }
        try {
            return getFailoverJWKSource().get(jWKSelector, c14);
        } catch (KeySourceException e4) {
            throw new RemoteKeySourceException(exc.getMessage() + "; Failover JWK source retrieval failed with: " + e4.getMessage(), e4);
        }
    }

    public static String getFirstSpecifiedKeyID(JWKMatcher jWKMatcher) {
        Set<String> keyIDs = jWKMatcher.getKeyIDs();
        if (keyIDs != null && !keyIDs.isEmpty()) {
            for (String str : keyIDs) {
                if (str != null) {
                    return str;
                }
            }
        }
        return null;
    }

    private static int resolveDefault(String str, int i14) {
        String property = System.getProperty(str);
        if (property == null) {
            return i14;
        }
        try {
            return Integer.parseInt(property);
        } catch (NumberFormatException unused) {
            return i14;
        }
    }

    public static int resolveDefaultHTTPConnectTimeout() {
        return resolveDefault(RemoteJWKSet.class.getName().concat(".defaultHttpConnectTimeout"), 500);
    }

    public static int resolveDefaultHTTPReadTimeout() {
        return resolveDefault(RemoteJWKSet.class.getName().concat(".defaultHttpReadTimeout"), 500);
    }

    public static int resolveDefaultHTTPSizeLimit() {
        return resolveDefault(RemoteJWKSet.class.getName().concat(".defaultHttpSizeLimit"), 51200);
    }

    private JWKSet updateJWKSetFromURL() throws RemoteKeySourceException {
        try {
            try {
                JWKSet jWKSet = JWKSet.parse(this.jwkSetRetriever.retrieveResource(this.jwkSetURL).getContent());
                this.jwkSetCache.put(jWKSet);
                return jWKSet;
            } catch (ParseException e4) {
                throw new RemoteKeySourceException("Couldn't parse remote JWK set: " + e4.getMessage(), e4);
            }
        } catch (IOException e14) {
            throw new RemoteKeySourceException("Couldn't retrieve remote JWK set: " + e14.getMessage(), e14);
        }
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public List<JWK> get(JWKSelector jWKSelector, C c14) throws Exception {
        JWKSet jWKSetUpdateJWKSetFromURL = this.jwkSetCache.get();
        if (this.jwkSetCache.requiresRefresh() || jWKSetUpdateJWKSetFromURL == null) {
            try {
                synchronized (this) {
                    jWKSetUpdateJWKSetFromURL = this.jwkSetCache.get();
                    if (this.jwkSetCache.requiresRefresh() || jWKSetUpdateJWKSetFromURL == null) {
                        jWKSetUpdateJWKSetFromURL = updateJWKSetFromURL();
                    }
                }
            } catch (Exception e4) {
                List<JWK> listFailover = failover(e4, jWKSelector, c14);
                if (listFailover != null) {
                    return listFailover;
                }
                if (jWKSetUpdateJWKSetFromURL == null) {
                    throw e4;
                }
            }
        }
        List<JWK> listSelect = jWKSelector.select(jWKSetUpdateJWKSetFromURL);
        if (!listSelect.isEmpty()) {
            return listSelect;
        }
        String firstSpecifiedKeyID = getFirstSpecifiedKeyID(jWKSelector.getMatcher());
        if (firstSpecifiedKeyID != null && jWKSetUpdateJWKSetFromURL.getKeyByKeyId(firstSpecifiedKeyID) == null) {
            try {
                synchronized (this) {
                    try {
                        JWKSet jWKSetUpdateJWKSetFromURL2 = jWKSetUpdateJWKSetFromURL == this.jwkSetCache.get() ? updateJWKSetFromURL() : this.jwkSetCache.get();
                        return jWKSetUpdateJWKSetFromURL2 == null ? Collections.EMPTY_LIST : jWKSelector.select(jWKSetUpdateJWKSetFromURL2);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (KeySourceException e14) {
                List<JWK> listFailover2 = failover(e14, jWKSelector, c14);
                if (listFailover2 != null) {
                    return listFailover2;
                }
                throw e14;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public JWKSet getCachedJWKSet() {
        return this.jwkSetCache.get();
    }

    public JWKSource<C> getFailoverJWKSource() {
        return this.failoverJWKSource;
    }

    public JWKSetCache getJWKSetCache() {
        return this.jwkSetCache;
    }

    public URL getJWKSetURL() {
        return this.jwkSetURL;
    }

    public ResourceRetriever getResourceRetriever() {
        return this.jwkSetRetriever;
    }

    public RemoteJWKSet(URL url, JWKSource<C> jWKSource) {
        this(url, jWKSource, null, null);
    }

    public RemoteJWKSet(URL url, ResourceRetriever resourceRetriever) {
        this(url, resourceRetriever, null);
    }

    public RemoteJWKSet(URL url, ResourceRetriever resourceRetriever, JWKSetCache jWKSetCache) {
        this(url, null, resourceRetriever, jWKSetCache);
    }

    public RemoteJWKSet(URL url) {
        this(url, (JWKSource) null);
    }
}
