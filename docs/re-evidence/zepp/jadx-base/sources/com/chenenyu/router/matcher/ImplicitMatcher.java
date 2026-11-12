package com.chenenyu.router.matcher;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.chenenyu.router.RouteRequest;

/* JADX INFO: loaded from: classes2.dex */
public class ImplicitMatcher extends AbsImplicitMatcher {
    public ImplicitMatcher(int i) {
        super(i);
    }

    @Override // com.chenenyu.router.matcher.AbsMatcher, com.chenenyu.router.matcher.a
    public boolean match(Context context, Uri uri, @Nullable String str, RouteRequest routeRequest) {
        if (uri.toString().toLowerCase().startsWith("http://") || uri.toString().toLowerCase().startsWith("https://") || context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", uri), 65536) == null) {
            return false;
        }
        if (uri.getQuery() == null) {
            return true;
        }
        parseParams(uri, routeRequest);
        return true;
    }
}
