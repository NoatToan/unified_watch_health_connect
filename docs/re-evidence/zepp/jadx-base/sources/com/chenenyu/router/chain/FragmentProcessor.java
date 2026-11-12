package com.chenenyu.router.chain;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.chenenyu.router.AptHub;
import com.chenenyu.router.MatcherRegistry;
import com.chenenyu.router.RealInterceptorChain;
import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.RouteResponse;
import com.chenenyu.router.RouteStatus;
import com.chenenyu.router.matcher.AbsExplicitMatcher;
import com.chenenyu.router.util.RLog;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentProcessor implements RouteInterceptor {
    @Override // com.chenenyu.router.RouteInterceptor
    @NonNull
    public RouteResponse intercept(RouteInterceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Set<Map.Entry<String, Class<?>>> setEntrySet = AptHub.routeTable.entrySet();
        for (AbsExplicitMatcher absExplicitMatcher : MatcherRegistry.getExplicitMatcher()) {
            for (Map.Entry<String, Class<?>> entry : setEntrySet) {
                if (absExplicitMatcher.match(chain.getContext(), chain.getRequest().getUri(), entry.getKey(), chain.getRequest())) {
                    RLog.i(String.format("{uri=%s, matcher=%s}", chain.getRequest().getUri(), absExplicitMatcher.getClass().getCanonicalName()));
                    realInterceptorChain.setTargetClass(entry.getValue());
                    Object objGenerate = absExplicitMatcher.generate(chain.getContext(), chain.getRequest().getUri(), entry.getValue());
                    if (!(objGenerate instanceof Fragment)) {
                        return RouteResponse.assemble(RouteStatus.FAILED, String.format("The matcher can't generate a fragment instance for uri: %s", chain.getRequest().getUri().toString()));
                    }
                    realInterceptorChain.setTargetInstance(objGenerate);
                    return chain.process();
                }
            }
        }
        return RouteResponse.assemble(RouteStatus.NOT_FOUND, String.format("Can't find a fragment that matches the given uri: %s", chain.getRequest().getUri().toString()));
    }
}
