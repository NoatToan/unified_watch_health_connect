package com.chenenyu.router.chain;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.RouteResponse;
import com.chenenyu.router.RouteStatus;

/* JADX INFO: loaded from: classes2.dex */
public class BaseValidator implements RouteInterceptor {
    @Override // com.chenenyu.router.RouteInterceptor
    @NonNull
    public RouteResponse intercept(RouteInterceptor.Chain chain) {
        if (chain.getRequest().getUri() == null) {
            return RouteResponse.assemble(RouteStatus.FAILED, "uri == null.");
        }
        Context context = null;
        if (chain.getSource() instanceof Context) {
            context = (Context) chain.getSource();
        } else if (chain.getSource() instanceof Fragment) {
            context = Build.VERSION.SDK_INT >= 23 ? ((Fragment) chain.getSource()).getContext() : ((Fragment) chain.getSource()).getActivity();
        }
        return context == null ? RouteResponse.assemble(RouteStatus.FAILED, "Can't retrieve context from source.") : chain.process();
    }
}
