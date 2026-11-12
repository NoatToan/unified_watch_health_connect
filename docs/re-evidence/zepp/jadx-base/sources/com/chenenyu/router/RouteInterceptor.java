package com.chenenyu.router;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public interface RouteInterceptor {

    public interface Chain {
        @NonNull
        Context getContext();

        @Nullable
        Fragment getFragment();

        @NonNull
        RouteRequest getRequest();

        @NonNull
        Object getSource();

        @NonNull
        RouteResponse intercept();

        @NonNull
        RouteResponse process();
    }

    @NonNull
    RouteResponse intercept(Chain chain);
}
