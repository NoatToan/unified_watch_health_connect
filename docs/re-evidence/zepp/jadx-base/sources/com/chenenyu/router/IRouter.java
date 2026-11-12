package com.chenenyu.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public interface IRouter {
    IRouter activityOptionsBundle(Bundle bundle);

    IRouter addFlags(int i);

    IRouter addInterceptors(String... strArr);

    IRouter anim(@AnimRes int i, @AnimRes int i2);

    IRouter build(Uri uri);

    IRouter build(@NonNull RouteRequest routeRequest);

    IRouter callback(RouteCallback routeCallback);

    Fragment getFragment(@NonNull Object obj);

    Intent getIntent(@NonNull Object obj);

    void go(Context context);

    void go(Context context, RouteCallback routeCallback);

    void go(Fragment fragment);

    void go(Fragment fragment, RouteCallback routeCallback);

    IRouter requestCode(int i);

    IRouter setAction(String str);

    IRouter setData(Uri uri);

    IRouter setDataAndType(Uri uri, String str);

    IRouter setType(String str);

    IRouter skipImplicitMatcher();

    IRouter skipInterceptors();

    IRouter skipInterceptors(String... strArr);

    IRouter with(Bundle bundle);

    @RequiresApi(21)
    IRouter with(PersistableBundle persistableBundle);

    IRouter with(String str, Object obj);
}
