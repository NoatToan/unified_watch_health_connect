package com.huawei.openalliance.ad.download;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.hw;
import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c implements Closeable {
    public abstract InputStream a();

    public abstract String a(String str);

    public abstract int b();

    public abstract int c();

    public abstract HttpConnection d();

    public static c a(Context context, String str, long j) {
        try {
            hw.b("DownloadNetworkConnection", "create OkHttpNetworkConnection");
            return new j(context, str, j);
        } catch (Throwable unused) {
            hw.b("DownloadNetworkConnection", "create HttpUrlNetworkConnection");
            return new i(str, j);
        }
    }
}
