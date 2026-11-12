package com.chenenyu.router;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RealInterceptorChain implements RouteInterceptor.Chain {
    public static final /* synthetic */ boolean g = false;

    @NonNull
    private final Object a;

    @NonNull
    private final RouteRequest b;

    @NonNull
    private final List<RouteInterceptor> c;
    private int d;

    @Nullable
    private Class<?> e;

    @Nullable
    private Object f;

    public RealInterceptorChain(@NonNull Object obj, @NonNull RouteRequest routeRequest, @NonNull List<RouteInterceptor> list) {
        this.a = obj;
        this.b = routeRequest;
        this.c = list;
    }

    @Override // com.chenenyu.router.RouteInterceptor.Chain
    @NonNull
    public Context getContext() {
        Object obj = this.a;
        if (obj instanceof Context) {
            return (Context) obj;
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).requireContext();
        }
        return null;
    }

    @Override // com.chenenyu.router.RouteInterceptor.Chain
    @Nullable
    public Fragment getFragment() {
        Object obj = this.a;
        if (obj instanceof Fragment) {
            return (Fragment) obj;
        }
        return null;
    }

    @NonNull
    public List<RouteInterceptor> getInterceptors() {
        return this.c;
    }

    @Override // com.chenenyu.router.RouteInterceptor.Chain
    @NonNull
    public RouteRequest getRequest() {
        return this.b;
    }

    @Override // com.chenenyu.router.RouteInterceptor.Chain
    @NonNull
    public Object getSource() {
        return this.a;
    }

    @Nullable
    public Class<?> getTargetClass() {
        return this.e;
    }

    @Nullable
    public Object getTargetInstance() {
        return this.f;
    }

    @Override // com.chenenyu.router.RouteInterceptor.Chain
    @NonNull
    public RouteResponse intercept() {
        return RouteResponse.assemble(RouteStatus.INTERCEPTED, null);
    }

    @Override // com.chenenyu.router.RouteInterceptor.Chain
    @NonNull
    public RouteResponse process() {
        if (!this.c.isEmpty()) {
            return this.c.remove(0).intercept(this);
        }
        RouteResponse routeResponseAssemble = RouteResponse.assemble(RouteStatus.SUCCEED, null);
        Object obj = this.f;
        if (obj != null) {
            routeResponseAssemble.setResult(obj);
        } else {
            routeResponseAssemble.setStatus(RouteStatus.FAILED);
        }
        return routeResponseAssemble;
    }

    public void setTargetClass(@Nullable Class<?> cls) {
        this.e = cls;
    }

    public void setTargetInstance(@Nullable Object obj) {
        this.f = obj;
    }
}
