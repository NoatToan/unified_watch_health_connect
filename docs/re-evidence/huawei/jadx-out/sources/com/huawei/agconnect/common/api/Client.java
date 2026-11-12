package com.huawei.agconnect.common.api;

import android.content.Context;
import com.huawei.agconnect.common.server.ClientImpl;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes22.dex */
public class Client {
    public static OkHttpClient build(Context context, List<Interceptor> list, boolean z) {
        return new ClientImpl(context, list, z).a();
    }

    public static OkHttpClient build(Context context, List<Interceptor> list) {
        return new ClientImpl(context, list, false).a();
    }
}
