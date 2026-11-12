package com.chenenyu.router.matcher;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.chenenyu.router.RouteRequest;

/* JADX INFO: loaded from: classes2.dex */
public class DirectMatcher extends AbsExplicitMatcher {
    public DirectMatcher(int i) {
        super(i);
    }

    @Override // com.chenenyu.router.matcher.AbsMatcher, com.chenenyu.router.matcher.a
    public boolean match(Context context, Uri uri, @Nullable String str, RouteRequest routeRequest) {
        return !isEmpty(str) && uri.toString().equals(str);
    }
}
