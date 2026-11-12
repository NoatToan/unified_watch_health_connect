package com.chenenyu.router;

import android.net.Uri;
import com.chenenyu.router.matcher.AbsMatcher;
import com.chenenyu.router.template.RouteTable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Router {
    public static final String RAW_URI = "raw_uri";
    private static final List<RouteInterceptor> a = new ArrayList();

    public static void addGlobalInterceptor(RouteInterceptor routeInterceptor) {
        a.add(routeInterceptor);
    }

    public static IRouter build(String str) {
        return build(str == null ? null : Uri.parse(str));
    }

    public static void clearMatcher() {
        MatcherRegistry.clear();
    }

    public static List<RouteInterceptor> getGlobalInterceptors() {
        return a;
    }

    public static void handleRouteTable(RouteTable routeTable) {
        if (routeTable != null) {
            routeTable.handle(AptHub.routeTable);
        }
    }

    public static void injectParams(Object obj) {
        AptHub.a(obj);
    }

    public static void registerMatcher(AbsMatcher absMatcher) {
        MatcherRegistry.register(absMatcher);
    }

    public static IRouter build(Uri uri) {
        return b.b().build(uri);
    }

    public static IRouter build(RouteRequest routeRequest) {
        return b.b().build(routeRequest);
    }
}
