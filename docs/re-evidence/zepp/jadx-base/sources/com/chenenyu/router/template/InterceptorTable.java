package com.chenenyu.router.template;

import com.chenenyu.router.RouteInterceptor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface InterceptorTable {
    void handle(Map<String, Class<? extends RouteInterceptor>> map);
}
