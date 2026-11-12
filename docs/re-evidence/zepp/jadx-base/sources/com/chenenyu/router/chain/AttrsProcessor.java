package com.chenenyu.router.chain;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.chenenyu.router.RealInterceptorChain;
import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.RouteRequest;
import com.chenenyu.router.RouteResponse;
import com.chenenyu.router.RouteStatus;

/* JADX INFO: loaded from: classes2.dex */
public class AttrsProcessor implements RouteInterceptor {
    private void a(Intent intent, RouteRequest routeRequest) {
        if (routeRequest.getExtras() != null && !routeRequest.getExtras().isEmpty()) {
            intent.putExtras(routeRequest.getExtras());
        }
        if (routeRequest.getFlags() != 0) {
            intent.addFlags(routeRequest.getFlags());
        }
        if (routeRequest.getData() != null) {
            intent.setData(routeRequest.getData());
        }
        if (routeRequest.getType() != null) {
            intent.setType(routeRequest.getType());
        }
        if (routeRequest.getAction() != null) {
            intent.setAction(routeRequest.getAction());
        }
    }

    @Override // com.chenenyu.router.RouteInterceptor
    @NonNull
    public RouteResponse intercept(RouteInterceptor.Chain chain) {
        Bundle extras;
        Object targetInstance = ((RealInterceptorChain) chain).getTargetInstance();
        if (targetInstance instanceof Intent) {
            a((Intent) targetInstance, chain.getRequest());
        } else if ((targetInstance instanceof Fragment) && (extras = chain.getRequest().getExtras()) != null && !extras.isEmpty()) {
            ((Fragment) targetInstance).setArguments(extras);
        }
        RouteResponse routeResponseAssemble = RouteResponse.assemble(RouteStatus.SUCCEED, null);
        if (targetInstance != null) {
            routeResponseAssemble.setResult(targetInstance);
        } else {
            routeResponseAssemble.setStatus(RouteStatus.FAILED);
        }
        return routeResponseAssemble;
    }
}
