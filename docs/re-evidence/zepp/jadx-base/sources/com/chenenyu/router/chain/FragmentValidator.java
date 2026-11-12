package com.chenenyu.router.chain;

import androidx.annotation.NonNull;
import com.chenenyu.router.AptHub;
import com.chenenyu.router.MatcherRegistry;
import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.RouteResponse;
import com.chenenyu.router.RouteStatus;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentValidator implements RouteInterceptor {
    @Override // com.chenenyu.router.RouteInterceptor
    @NonNull
    public RouteResponse intercept(RouteInterceptor.Chain chain) {
        if (MatcherRegistry.getExplicitMatcher().isEmpty()) {
            return RouteResponse.assemble(RouteStatus.FAILED, "The MatcherRegistry contains no explicit matcher.");
        }
        return AptHub.routeTable.isEmpty() ? RouteResponse.assemble(RouteStatus.FAILED, "The RouteTable is empty.") : chain.process();
    }
}
