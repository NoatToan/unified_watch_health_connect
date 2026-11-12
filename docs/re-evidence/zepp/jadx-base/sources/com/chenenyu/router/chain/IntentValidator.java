package com.chenenyu.router.chain;

import androidx.annotation.NonNull;
import com.chenenyu.router.AptHub;
import com.chenenyu.router.MatcherRegistry;
import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.RouteRequest;
import com.chenenyu.router.RouteResponse;
import com.chenenyu.router.RouteStatus;

/* JADX INFO: loaded from: classes2.dex */
public class IntentValidator implements RouteInterceptor {
    @Override // com.chenenyu.router.RouteInterceptor
    @NonNull
    public RouteResponse intercept(RouteInterceptor.Chain chain) {
        RouteRequest request = chain.getRequest();
        if (MatcherRegistry.getMatcher().isEmpty()) {
            return RouteResponse.assemble(RouteStatus.FAILED, "The MatcherRegistry contains no matcher.");
        }
        if (request.isSkipImplicitMatcher()) {
            if (MatcherRegistry.getExplicitMatcher().isEmpty()) {
                return RouteResponse.assemble(RouteStatus.FAILED, "The MatcherRegistry contains no explicit matcher.");
            }
            if (AptHub.routeTable.isEmpty()) {
                return RouteResponse.assemble(RouteStatus.FAILED, "The route table is empty.");
            }
        }
        return chain.process();
    }
}
