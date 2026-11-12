package com.xiaomi.infra.galaxy.fds.android.auth;

import com.google.common.collect.LinkedListMultimap;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.auth.signature.SignAlgorithm;
import com.xiaomi.infra.galaxy.fds.auth.signature.Signer;
import com.xiaomi.infra.galaxy.fds.model.HttpMethod;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpRequestBase;

/* JADX INFO: loaded from: classes22.dex */
public class SignatureCredential implements GalaxyFDSCredential {
    private static final ThreadLocal<SimpleDateFormat> c = new a();
    private final String a;
    private final String b;

    public static class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat;
        }
    }

    public SignatureCredential(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential
    public void addHeader(HttpRequestBase httpRequestBase) throws GalaxyFDSClientException {
        httpRequestBase.setHeader("date", c.get().format(new Date()));
        try {
            URI uri = httpRequestBase.getURI();
            LinkedListMultimap linkedListMultimapCreate = LinkedListMultimap.create();
            for (Header header : httpRequestBase.getAllHeaders()) {
                linkedListMultimapCreate.put(header.getName(), header.getValue());
            }
            httpRequestBase.setHeader("Authorization", Signer.getAuthorizationHeader(HttpMethod.valueOf(httpRequestBase.getMethod()), uri, linkedListMultimapCreate, this.a, this.b, SignAlgorithm.HmacSHA1));
        } catch (UnsupportedEncodingException e) {
            throw new GalaxyFDSClientException("Fail to get signature for request:" + httpRequestBase, e);
        } catch (InvalidKeyException e2) {
            throw new GalaxyFDSClientException("Fail to get signature for request:" + httpRequestBase, e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new GalaxyFDSClientException("Fail to get signature for request:" + httpRequestBase, e3);
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential
    public String addParam(String str) {
        return str;
    }
}
