package com.xiaomi.hm.health.training.utils;

import android.content.Context;
import androidx.annotation.Nullable;
import com.danikula.videocache.HttpProxyCacheServer;
import com.danikula.videocache.file.Md5FileNameGenerator;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.utils.HttpProxyCacheServerHolder;

/* JADX INFO: loaded from: classes22.dex */
public class HttpProxyCacheServerHolder {
    private static final String a = "Train-HttpProxyCacheServerHolder";
    private static HttpProxyCacheServer b;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b() {
        return "创建HttpProxyCacheServer失败";
    }

    @Nullable
    private static HttpProxyCacheServer c(Context context) {
        try {
            return new HttpProxyCacheServer.Builder(context.getApplicationContext()).cacheDirectory(FileUtils.getTrainingDir()).fileNameGenerator(new Md5FileNameGenerator()).build();
        } catch (Exception e) {
            Loggers.getLogger().e(a, e, new Supplier() { // from class: wa4
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return HttpProxyCacheServerHolder.b();
                }
            });
            return null;
        }
    }

    @Nullable
    public static HttpProxyCacheServer getProxy(Context context) {
        HttpProxyCacheServer httpProxyCacheServer = b;
        if (httpProxyCacheServer != null) {
            return httpProxyCacheServer;
        }
        HttpProxyCacheServer httpProxyCacheServerC = c(context);
        b = httpProxyCacheServerC;
        return httpProxyCacheServerC;
    }
}
