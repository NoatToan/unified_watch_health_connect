package com.chenenyu.router.matcher;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.chenenyu.router.RouteRequest;

/* JADX INFO: loaded from: classes2.dex */
interface a extends Comparable<a> {
    Object generate(Context context, Uri uri, @Nullable Class<?> cls);

    boolean match(Context context, Uri uri, @Nullable String str, RouteRequest routeRequest);
}
