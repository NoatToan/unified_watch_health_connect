package com.chenenyu.router.chain;

import androidx.annotation.NonNull;
import com.chenenyu.router.AptHub;
import com.chenenyu.router.RealInterceptorChain;
import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.RouteRequest;
import com.chenenyu.router.RouteResponse;
import com.chenenyu.router.Router;
import com.chenenyu.router.util.RLog;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AppInterceptorsHandler implements RouteInterceptor {
    @Override // com.chenenyu.router.RouteInterceptor
    @NonNull
    public RouteResponse intercept(RouteInterceptor.Chain chain) {
        String[] strArr;
        if (chain.getRequest().isSkipInterceptors()) {
            return chain.process();
        }
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RouteRequest request = chain.getRequest();
        int size = 0;
        if (!Router.getGlobalInterceptors().isEmpty()) {
            realInterceptorChain.getInterceptors().addAll(0, Router.getGlobalInterceptors());
            size = Router.getGlobalInterceptors().size();
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        if (realInterceptorChain.getTargetClass() != null && (strArr = AptHub.targetInterceptorsTable.get(realInterceptorChain.getTargetClass())) != null && strArr.length > 0) {
            Collections.addAll(linkedHashSet, strArr);
        }
        if (request.getTempInterceptors() != null) {
            for (Map.Entry<String, Boolean> entry : request.getTempInterceptors().entrySet()) {
                if (entry.getValue() == Boolean.TRUE) {
                    linkedHashSet.add(entry.getKey());
                } else {
                    linkedHashSet.remove(entry.getKey());
                }
            }
        }
        if (!linkedHashSet.isEmpty()) {
            for (String str : linkedHashSet) {
                Map<String, RouteInterceptor> map = AptHub.interceptorInstances;
                RouteInterceptor routeInterceptor = map.get(str);
                if (routeInterceptor == null) {
                    try {
                        RouteInterceptor routeInterceptorNewInstance = AptHub.interceptorTable.get(str).newInstance();
                        try {
                            map.put(str, routeInterceptorNewInstance);
                            routeInterceptor = routeInterceptorNewInstance;
                        } catch (Exception e) {
                            e = e;
                            routeInterceptor = routeInterceptorNewInstance;
                            RLog.e("Can't construct a interceptor instance for: " + str, e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                if (routeInterceptor != null) {
                    realInterceptorChain.getInterceptors().add(size, routeInterceptor);
                    size++;
                }
            }
        }
        return chain.process();
    }
}
