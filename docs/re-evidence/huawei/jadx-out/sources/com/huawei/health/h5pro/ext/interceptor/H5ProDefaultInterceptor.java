package com.huawei.health.h5pro.ext.interceptor;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProDefaultInterceptor implements H5ProInterceptor<String, String> {
    @Override // com.huawei.health.h5pro.ext.interceptor.H5ProInterceptor
    public void intercept(String str, H5ProInterceptor.InterceptCallback<String> interceptCallback) {
        interceptCallback.onNotIntercepted();
    }
}
