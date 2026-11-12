package defpackage;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.xms.wearable.utils.net.NoNetException;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class f64 implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean netWorkAvailable = NetUtil.INSTANCE.getNetWorkAvailable(AppUtil.getApp());
        Logger.d("CommonInterceptor", "intercept: netEnable = " + netWorkAvailable);
        if (netWorkAvailable) {
            return chain.proceed(chain.request());
        }
        throw new NoNetException("network is unavailable");
    }
}
