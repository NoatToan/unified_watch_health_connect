package com.mapbox.common;

import android.content.Context;
import com.mapbox.common.http_backend.Service;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.common.module.cronet.CronetClientDetail;
import com.mapbox.common.module.okhttp.OkHttpClientDetail;
import com.mapbox.common.module.okhttp.WssBackend;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0007J\f\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/mapbox/common/PlatformHttpService;", "", "()V", "USE_LEGACY_SERVICE_KEY", "", "forceLegacyService", "", "createPlatformHttpService", "Lcom/mapbox/common/http_backend/Service;", "Lcom/mapbox/common/HttpService;", "createPlatformWssService", "Lcom/mapbox/common/experimental/wss_backend/Service;", "Lcom/mapbox/common/WssService;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PlatformHttpService {
    public static final PlatformHttpService INSTANCE = new PlatformHttpService();
    private static final String USE_LEGACY_SERVICE_KEY = "com.mapbox.common.use_legacy_http_service";
    private static final boolean forceLegacyService;

    static {
        boolean z14 = false;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            z14 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean(USE_LEGACY_SERVICE_KEY, false);
        } catch (Throwable unused) {
        }
        if (z14) {
            FeatureTelemetryCounter.create("common/network/http3/CronetDisabledWithManifestFlag").increment();
        }
        forceLegacyService = z14;
    }

    private PlatformHttpService() {
    }

    public static final Service createPlatformHttpService() {
        return !forceLegacyService ? new MapboxHttpClient(new CronetClientDetail(new OkHttpClientDetail())) : new MapboxHttpClient(new OkHttpClientDetail());
    }

    public static final com.mapbox.common.experimental.wss_backend.Service createPlatformWssService() {
        return new WssBackend();
    }
}
