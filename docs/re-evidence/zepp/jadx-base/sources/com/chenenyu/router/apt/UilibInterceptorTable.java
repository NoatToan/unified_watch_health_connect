package com.chenenyu.router.apt;

import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.template.InterceptorTable;
import com.huami.femalehealth.uilib.ui.interceptor.FHFirstLoginInterceptor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class UilibInterceptorTable implements InterceptorTable {
    @Override // com.chenenyu.router.template.InterceptorTable
    public void handle(Map<String, Class<? extends RouteInterceptor>> map) {
        map.put("fh_interceptor_first_login", FHFirstLoginInterceptor.class);
    }
}
