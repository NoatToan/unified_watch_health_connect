package com.chenenyu.router.matcher;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.chenenyu.router.RouteRequest;

/* JADX INFO: loaded from: classes2.dex */
public class BrowserMatcher extends AbsImplicitMatcher {
    public BrowserMatcher(int i) {
        super(i);
    }

    @Override // com.chenenyu.router.matcher.AbsMatcher, com.chenenyu.router.matcher.a
    public boolean match(Context context, Uri uri, @Nullable String str, RouteRequest routeRequest) {
        return uri.toString().toLowerCase().startsWith("http://") || uri.toString().toLowerCase().startsWith("https://");
    }
}
