package com.huawei.hianalytics.core.transport.net;

import android.text.TextUtils;
import com.huawei.hianalytics.core.transport.Utils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TransportHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11479c;

    /* JADX INFO: loaded from: classes33.dex */
    public interface Methods {
        public static final String METHOD_GET = "GET";
        public static final String METHOD_POST = "POST";
    }

    public TransportHandler(String str, Map map, byte[] bArr) {
        this.f11477a = str;
        this.f11478b = map;
        this.f11479c = bArr != null ? (byte[]) bArr.clone() : new byte[0];
    }

    public abstract Response a();

    public abstract Response b();

    public Response execute(String str) {
        if (TextUtils.isEmpty(this.f11477a)) {
            return new Response(-104, "collectUrls is empty");
        }
        try {
            return "GET".equals(str) ? a() : b();
        } catch (Exception e) {
            return Utils.handlerException(e);
        }
    }

    public Response execute() {
        return execute("POST");
    }
}
