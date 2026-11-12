package com.chenenyu.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.chenenyu.router.chain.AppInterceptorsHandler;
import com.chenenyu.router.chain.AttrsProcessor;
import com.chenenyu.router.chain.BaseValidator;
import com.chenenyu.router.chain.FragmentProcessor;
import com.chenenyu.router.chain.FragmentValidator;
import com.chenenyu.router.chain.IntentProcessor;
import com.chenenyu.router.chain.IntentValidator;
import com.chenenyu.router.util.RLog;
import java.util.Collections;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
final class b extends com.chenenyu.router.a {
    private static final ThreadLocal<b> i = new a();
    private final RouteInterceptor b;
    private final RouteInterceptor c;
    private final RouteInterceptor d;
    private final RouteInterceptor e;
    private final RouteInterceptor f;
    private final RouteInterceptor g;
    private final RouteInterceptor h;

    public static class a extends ThreadLocal<b> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b initialValue() {
            return new b(null);
        }
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    private void a(RouteResponse routeResponse) {
        if (routeResponse.getStatus() != RouteStatus.SUCCEED) {
            RLog.w(routeResponse.getMessage());
        }
        if (this.a.getRouteCallback() != null) {
            this.a.getRouteCallback().callback(routeResponse.getStatus(), this.a.getUri(), routeResponse.getMessage());
        }
    }

    public static b b() {
        return i.get();
    }

    @Override // com.chenenyu.router.IRouter
    public Fragment getFragment(@NonNull Object obj) {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, this.b, this.d, this.f, this.g, this.h);
        RouteResponse routeResponseProcess = new RealInterceptorChain(obj, this.a, linkedList).process();
        a(routeResponseProcess);
        return (Fragment) routeResponseProcess.getResult();
    }

    @Override // com.chenenyu.router.IRouter
    public Intent getIntent(@NonNull Object obj) {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, this.b, this.c, this.e, this.g, this.h);
        RouteResponse routeResponseProcess = new RealInterceptorChain(obj, this.a, linkedList).process();
        a(routeResponseProcess);
        return (Intent) routeResponseProcess.getResult();
    }

    @Override // com.chenenyu.router.IRouter
    public void go(Context context) {
        Intent intent = getIntent(context);
        if (intent != null) {
            Bundle activityOptionsBundle = this.a.getActivityOptionsBundle();
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
                context.startActivity(intent, activityOptionsBundle);
                return;
            }
            Activity activity = (Activity) context;
            activity.startActivityForResult(intent, this.a.getRequestCode(), activityOptionsBundle);
            if (this.a.getEnterAnim() < 0 || this.a.getExitAnim() < 0) {
                return;
            }
            activity.overridePendingTransition(this.a.getEnterAnim(), this.a.getExitAnim());
        }
    }

    private b() {
        this.b = new BaseValidator();
        this.c = new IntentValidator();
        this.d = new FragmentValidator();
        this.e = new IntentProcessor();
        this.f = new FragmentProcessor();
        this.g = new AppInterceptorsHandler();
        this.h = new AttrsProcessor();
    }

    @Override // com.chenenyu.router.IRouter
    public void go(Fragment fragment) {
        Intent intent = getIntent(fragment);
        if (intent != null) {
            Bundle activityOptionsBundle = this.a.getActivityOptionsBundle();
            if (this.a.getRequestCode() < 0) {
                fragment.startActivity(intent, activityOptionsBundle);
            } else {
                fragment.startActivityForResult(intent, this.a.getRequestCode(), activityOptionsBundle);
            }
            if (this.a.getEnterAnim() < 0 || this.a.getExitAnim() < 0 || fragment.getActivity() == null) {
                return;
            }
            fragment.getActivity().overridePendingTransition(this.a.getEnterAnim(), this.a.getExitAnim());
        }
    }
}
