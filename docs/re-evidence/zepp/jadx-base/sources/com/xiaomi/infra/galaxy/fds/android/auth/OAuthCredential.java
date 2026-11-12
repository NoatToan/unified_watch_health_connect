package com.xiaomi.infra.galaxy.fds.android.auth;

import com.alipay.sdk.m.s.a;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import com.google.gson.Gson;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.StorageAccessToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.text.Typography;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class OAuthCredential implements GalaxyFDSCredential {
    private static final String d = "storageAccessToken";
    private static final String e = "appId";
    private static final String f = "oauthAppId";
    private static final String g = "oauthAccessToken";
    private static final String h = "oauthProvider";
    private static final String i = "oauthMacKey";
    private static final String j = "oauthMacAlgorithm";
    private final String a = "OAuth";
    private final String b;
    private final StorageAccessToken c;

    public OAuthCredential(String str, String str2, String str3, String str4, String str5, String str6, String str7) throws GalaxyFDSClientException {
        this.b = str2;
        this.c = a(str, str2, str3, str4, str5, str6, str7);
    }

    private StorageAccessToken a(String str, String str2, String str3, String str4, String str5, String str6, String str7) throws GalaxyFDSClientException {
        try {
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(str + "/?" + d + a.l + "appId" + SearchCriteria.EQ + str2 + a.l + f + SearchCriteria.EQ + str3 + a.l + g + SearchCriteria.EQ + str4 + a.l + h + SearchCriteria.EQ + str5 + a.l + j + SearchCriteria.EQ + str7 + a.l + i + SearchCriteria.EQ + str6);
            httpGet.setHeader("Authorization", "OAuth");
            HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(defaultHttpClient, httpGet);
            if (httpResponseExecute.getStatusLine().getStatusCode() == 200) {
                InputStream content = httpResponseExecute.getEntity().getContent();
                StorageAccessToken storageAccessToken = (StorageAccessToken) new Gson().fromJson((Reader) new InputStreamReader(content), StorageAccessToken.class);
                content.close();
                return storageAccessToken;
            }
            throw new GalaxyFDSClientException("Failed to get the storage access token from FDS server. URI:" + httpGet.getURI().toString() + ".Reason:" + httpResponseExecute.getStatusLine().toString());
        } catch (IOException e2) {
            throw new GalaxyFDSClientException("Failed to get the storage access token", e2);
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential
    public void addHeader(HttpRequestBase httpRequestBase) {
        httpRequestBase.setHeader("Authorization", "OAuth");
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential
    public String addParam(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) == -1) {
            sb.append('?');
        } else {
            sb.append(Typography.amp);
        }
        sb.append("appId");
        sb.append(com.alipay.sdk.m.n.a.h);
        sb.append(this.b);
        sb.append(Typography.amp);
        sb.append(d);
        sb.append(com.alipay.sdk.m.n.a.h);
        sb.append(this.c.getToken());
        return sb.toString();
    }
}
