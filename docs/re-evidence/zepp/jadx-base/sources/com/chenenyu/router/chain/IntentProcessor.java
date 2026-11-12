package com.chenenyu.router.chain;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.chenenyu.router.AptHub;
import com.chenenyu.router.MatcherRegistry;
import com.chenenyu.router.RealInterceptorChain;
import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.RouteRequest;
import com.chenenyu.router.RouteResponse;
import com.chenenyu.router.RouteStatus;
import com.chenenyu.router.matcher.AbsExplicitMatcher;
import com.chenenyu.router.matcher.AbsImplicitMatcher;
import com.chenenyu.router.matcher.AbsMatcher;
import com.chenenyu.router.util.RLog;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class IntentProcessor implements RouteInterceptor {
    @Override // com.chenenyu.router.RouteInterceptor
    @NonNull
    public RouteResponse intercept(RouteInterceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RouteRequest request = chain.getRequest();
        Map<String, Class<?>> map = AptHub.routeTable;
        Intent intent = null;
        if (!map.isEmpty()) {
            List<AbsMatcher> matcher = MatcherRegistry.getMatcher();
            List<AbsExplicitMatcher> explicitMatcher = MatcherRegistry.getExplicitMatcher();
            Set<Map.Entry<String, Class<?>>> setEntrySet = map.entrySet();
            if (request.isSkipImplicitMatcher()) {
                matcher = explicitMatcher;
            }
            loop1: for (AbsMatcher absMatcher : matcher) {
                if (absMatcher instanceof AbsImplicitMatcher) {
                    if (absMatcher.match(chain.getContext(), request.getUri(), null, request)) {
                        RLog.i(String.format("{uri=%s, matcher=%s}", chain.getRequest().getUri(), absMatcher.getClass().getCanonicalName()));
                        realInterceptorChain.setTargetClass(null);
                        Object objGenerate = absMatcher.generate(chain.getContext(), request.getUri(), null);
                        if (!(objGenerate instanceof Intent)) {
                            return RouteResponse.assemble(RouteStatus.FAILED, String.format("The matcher can't generate an intent for uri: %s", request.getUri().toString()));
                        }
                        intent = (Intent) objGenerate;
                        realInterceptorChain.setTargetInstance(intent);
                        break;
                    }
                } else {
                    for (Map.Entry<String, Class<?>> entry : setEntrySet) {
                        if (absMatcher.match(chain.getContext(), request.getUri(), entry.getKey(), request)) {
                            RLog.i(String.format("{uri=%s, matcher=%s}", chain.getRequest().getUri(), absMatcher.getClass().getCanonicalName()));
                            realInterceptorChain.setTargetClass(entry.getValue());
                            Object objGenerate2 = absMatcher.generate(chain.getContext(), request.getUri(), entry.getValue());
                            if (!(objGenerate2 instanceof Intent)) {
                                return RouteResponse.assemble(RouteStatus.FAILED, String.format("The matcher can't generate an intent for uri: %s", request.getUri().toString()));
                            }
                            intent = (Intent) objGenerate2;
                            realInterceptorChain.setTargetInstance(intent);
                            break loop1;
                        }
                    }
                }
            }
        } else {
            for (AbsImplicitMatcher absImplicitMatcher : MatcherRegistry.getImplicitMatcher()) {
                if (absImplicitMatcher.match(chain.getContext(), request.getUri(), null, request)) {
                    RLog.i(String.format("{uri=%s, matcher=%s}", chain.getRequest().getUri(), absImplicitMatcher.getClass().getCanonicalName()));
                    realInterceptorChain.setTargetClass(null);
                    Object objGenerate3 = absImplicitMatcher.generate(chain.getContext(), request.getUri(), null);
                    if (!(objGenerate3 instanceof Intent)) {
                        return RouteResponse.assemble(RouteStatus.FAILED, String.format("The matcher can't generate an intent for uri: %s", request.getUri().toString()));
                    }
                    intent = (Intent) objGenerate3;
                    realInterceptorChain.setTargetInstance(intent);
                    break;
                }
            }
        }
        return intent == null ? RouteResponse.assemble(RouteStatus.NOT_FOUND, String.format("Can't find an activity that matches the given uri: %s", request.getUri().toString())) : chain.process();
    }
}
