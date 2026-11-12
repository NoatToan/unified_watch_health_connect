package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDataSource implements DataSource {
    private static final String l = "DefaultDataSource";
    private static final String m = "asset";
    private static final String n = "content";
    private static final String o = "rtmp";
    private static final String p = "udp";
    private static final String q = "data";
    private static final String r = "rawresource";
    private static final String s = "android.resource";
    private final Context a;
    private final List<TransferListener> b;
    private final DataSource c;

    @Nullable
    private DataSource d;

    @Nullable
    private DataSource e;

    @Nullable
    private DataSource f;

    @Nullable
    private DataSource g;

    @Nullable
    private DataSource h;

    @Nullable
    private DataSource i;

    @Nullable
    private DataSource j;

    @Nullable
    private DataSource k;

    public DefaultDataSource(Context context, boolean allowCrossProtocolRedirects) {
        this(context, null, 8000, 8000, allowCrossProtocolRedirects);
    }

    private void c(DataSource dataSource) {
        for (int i = 0; i < this.b.size(); i++) {
            dataSource.addTransferListener(this.b.get(i));
        }
    }

    private DataSource d() {
        if (this.e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.a);
            this.e = assetDataSource;
            c(assetDataSource);
        }
        return this.e;
    }

    private DataSource e() {
        if (this.f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.a);
            this.f = contentDataSource;
            c(contentDataSource);
        }
        return this.f;
    }

    private DataSource f() {
        if (this.i == null) {
            DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource();
            this.i = dataSchemeDataSource;
            c(dataSchemeDataSource);
        }
        return this.i;
    }

    private DataSource g() {
        if (this.d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.d = fileDataSource;
            c(fileDataSource);
        }
        return this.d;
    }

    private DataSource h() {
        if (this.j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.a);
            this.j = rawResourceDataSource;
            c(rawResourceDataSource);
        }
        return this.j;
    }

    private DataSource i() {
        if (this.g == null) {
            try {
                DataSource dataSource = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.g = dataSource;
                c(dataSource);
            } catch (ClassNotFoundException unused) {
                Log.w(l, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    private DataSource j() {
        if (this.h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.h = udpDataSource;
            c(udpDataSource);
        }
        return this.h;
    }

    private void k(@Nullable DataSource dataSource, TransferListener listener) {
        if (dataSource != null) {
            dataSource.addTransferListener(listener);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.c.addTransferListener(transferListener);
        this.b.add(transferListener);
        k(this.d, transferListener);
        k(this.e, transferListener);
        k(this.f, transferListener);
        k(this.g, transferListener);
        k(this.h, transferListener);
        k(this.i, transferListener);
        k(this.j, transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        DataSource dataSource = this.k;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        DataSource dataSource = this.k;
        return dataSource == null ? Collections.emptyMap() : dataSource.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        DataSource dataSource = this.k;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        Assertions.checkState(this.k == null);
        String scheme = dataSpec.uri.getScheme();
        if (Util.isLocalFileUri(dataSpec.uri)) {
            String path = dataSpec.uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.k = g();
            } else {
                this.k = d();
            }
        } else if (m.equals(scheme)) {
            this.k = d();
        } else if ("content".equals(scheme)) {
            this.k = e();
        } else if (o.equals(scheme)) {
            this.k = i();
        } else if (p.equals(scheme)) {
            this.k = j();
        } else if ("data".equals(scheme)) {
            this.k = f();
        } else if ("rawresource".equals(scheme) || s.equals(scheme)) {
            this.k = h();
        } else {
            this.k = this.c;
        }
        return this.k.open(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
        return ((DataSource) Assertions.checkNotNull(this.k)).read(buffer, offset, length);
    }

    public DefaultDataSource(Context context, @Nullable String userAgent, boolean allowCrossProtocolRedirects) {
        this(context, userAgent, 8000, 8000, allowCrossProtocolRedirects);
    }

    public DefaultDataSource(Context context, @Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects) {
        this(context, new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setConnectTimeoutMs(connectTimeoutMillis).setReadTimeoutMs(readTimeoutMillis).setAllowCrossProtocolRedirects(allowCrossProtocolRedirects).createDataSource());
    }

    public DefaultDataSource(Context context, DataSource baseDataSource) {
        this.a = context.getApplicationContext();
        this.c = (DataSource) Assertions.checkNotNull(baseDataSource);
        this.b = new ArrayList();
    }
}
