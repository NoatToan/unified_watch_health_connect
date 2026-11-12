package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.network.base.util.HttpUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public URL f14698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MalformedURLException f14699c;
    public List<String> d = new ArrayList();

    public String toString() {
        return super.toString();
    }

    public d3 setIps(List<String> list) {
        this.d = list;
        return this;
    }

    public String getUrl() {
        return this.f14697a;
    }

    public URL getURL() throws MalformedURLException {
        URL url = this.f14698b;
        if (url != null) {
            return url;
        }
        throw this.f14699c;
    }

    public int getPort() {
        URL url = this.f14698b;
        if (url == null) {
            return -1;
        }
        return url.getPort();
    }

    public List<String> getIps() {
        return this.d;
    }

    public String getHost() {
        URL url = this.f14698b;
        return url == null ? "" : url.getHost();
    }

    public d3 addIp(String str) {
        this.d.add(str);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private d3 a(String str) {
        StringBuilder sb;
        int i;
        CheckParamUtils.checkNotNull(str, "url == null");
        if (!str.regionMatches(true, 0, "ws:", 0, 3)) {
            if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                sb = new StringBuilder("https:");
                i = 4;
            }
            if (HttpUtils.isHttpOrGrsUrl(str)) {
                throw new IllegalArgumentException("url not valid must be http://;https://;grs://");
            }
            this.f14697a = str;
            if (HttpUtils.isHttpUrl(str)) {
                try {
                    this.f14698b = new URL(str);
                    return this;
                } catch (MalformedURLException e) {
                    this.f14699c = e;
                }
            }
            return this;
        }
        sb = new StringBuilder("http:");
        i = 3;
        sb.append(str.substring(i));
        str = sb.toString();
        if (HttpUtils.isHttpOrGrsUrl(str)) {
            throw new IllegalArgumentException("url not valid must be http://;https://;grs://");
        }
        this.f14697a = str;
        if (HttpUtils.isHttpUrl(str)) {
            this.f14698b = new URL(str);
            return this;
        }
        return this;
    }

    public d3(String str) {
        a(str);
    }
}
