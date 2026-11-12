package com.chenenyu.router.matcher;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.chenenyu.router.RouteRequest;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes2.dex */
public class SchemeMatcher extends AbsExplicitMatcher {
    public SchemeMatcher(int i) {
        super(i);
    }

    private String a(String str) {
        if (str.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            return a(str.substring(1));
        }
        return str.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) ? a(str.substring(0, str.length() - 1)) : str;
    }

    @Override // com.chenenyu.router.matcher.AbsMatcher, com.chenenyu.router.matcher.a
    public boolean match(Context context, Uri uri, @Nullable String str, RouteRequest routeRequest) {
        if (isEmpty(str)) {
            return false;
        }
        Uri uri2 = Uri.parse(str);
        if (!uri.isAbsolute() || !uri2.isAbsolute() || !uri.getScheme().equals(uri2.getScheme())) {
            return false;
        }
        if (isEmpty(uri.getAuthority()) && isEmpty(uri2.getAuthority())) {
            return true;
        }
        if (isEmpty(uri.getAuthority()) || isEmpty(uri2.getAuthority()) || !uri.getAuthority().equals(uri2.getAuthority()) || !a(uri.getPath()).equals(a(uri2.getPath()))) {
            return false;
        }
        if (uri.getQuery() != null) {
            parseParams(uri, routeRequest);
        }
        return true;
    }
}
