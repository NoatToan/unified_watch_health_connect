package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import com.huami.network.base.model.HMContentType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private static final int e = 5;
    private final HttpDataSource.Factory a;

    @Nullable
    private final String b;
    private final boolean c;
    private final Map<String, String> d;

    public HttpMediaDrmCallback(@Nullable String defaultLicenseUrl, HttpDataSource.Factory dataSourceFactory) {
        this(defaultLicenseUrl, false, dataSourceFactory);
    }

    private static byte[] a(HttpDataSource.Factory dataSourceFactory, String url, @Nullable byte[] httpBody, Map<String, String> requestProperties) throws MediaDrmCallbackException {
        StatsDataSource statsDataSource = new StatsDataSource(dataSourceFactory.createDataSource());
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(url).setHttpRequestHeaders(requestProperties).setHttpMethod(2).setHttpBody(httpBody).setFlags(1).build();
        int i = 0;
        DataSpec dataSpecBuild2 = dataSpecBuild;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(statsDataSource, dataSpecBuild2);
                try {
                    try {
                        byte[] byteArray = Util.toByteArray(dataSourceInputStream);
                        Util.closeQuietly(dataSourceInputStream);
                        return byteArray;
                    } catch (HttpDataSource.InvalidResponseCodeException e2) {
                        String strB = b(e2, i);
                        if (strB == null) {
                            throw e2;
                        }
                        i++;
                        dataSpecBuild2 = dataSpecBuild2.buildUpon().setUri(strB).build();
                        Util.closeQuietly(dataSourceInputStream);
                    }
                } catch (Throwable th) {
                    Util.closeQuietly(dataSourceInputStream);
                    throw th;
                }
            } catch (Exception e3) {
                throw new MediaDrmCallbackException(dataSpecBuild, (Uri) Assertions.checkNotNull(statsDataSource.getLastOpenedUri()), statsDataSource.getResponseHeaders(), statsDataSource.getBytesRead(), e3);
            }
        }
    }

    @Nullable
    private static String b(HttpDataSource.InvalidResponseCodeException exception, int manualRedirectCount) {
        Map<String, List<String>> map;
        List<String> list;
        int i = exception.responseCode;
        if (!((i == 307 || i == 308) && manualRedirectCount < 5) || (map = exception.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.d) {
            this.d.clear();
        }
    }

    public void clearKeyRequestProperty(String name) {
        Assertions.checkNotNull(name);
        synchronized (this.d) {
            this.d.remove(name);
        }
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest request) throws MediaDrmCallbackException {
        String str;
        String licenseServerUrl = request.getLicenseServerUrl();
        if (this.c || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.b;
        }
        if (TextUtils.isEmpty(licenseServerUrl)) {
            throw new MediaDrmCallbackException(new DataSpec.Builder().setUri(Uri.EMPTY).build(), Uri.EMPTY, ImmutableMap.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C.PLAYREADY_UUID;
        if (uuid2.equals(uuid)) {
            str = HMContentType.CONTENT_TYPE_TEXT_XML;
        } else {
            str = C.CLEARKEY_UUID.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.d) {
            map.putAll(this.d);
        }
        return a(this.a, licenseServerUrl, request.getData(), map);
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest request) throws MediaDrmCallbackException {
        String defaultUrl = request.getDefaultUrl();
        String strFromUtf8Bytes = Util.fromUtf8Bytes(request.getData());
        StringBuilder sb = new StringBuilder(String.valueOf(defaultUrl).length() + 15 + String.valueOf(strFromUtf8Bytes).length());
        sb.append(defaultUrl);
        sb.append("&signedRequest=");
        sb.append(strFromUtf8Bytes);
        return a(this.a, sb.toString(), null, Collections.emptyMap());
    }

    public void setKeyRequestProperty(String name, String value) {
        Assertions.checkNotNull(name);
        Assertions.checkNotNull(value);
        synchronized (this.d) {
            this.d.put(name, value);
        }
    }

    public HttpMediaDrmCallback(@Nullable String defaultLicenseUrl, boolean forceDefaultLicenseUrl, HttpDataSource.Factory dataSourceFactory) {
        Assertions.checkArgument((forceDefaultLicenseUrl && TextUtils.isEmpty(defaultLicenseUrl)) ? false : true);
        this.a = dataSourceFactory;
        this.b = defaultLicenseUrl;
        this.c = forceDefaultLicenseUrl;
        this.d = new HashMap();
    }
}
