package com.chenenyu.router;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteResponse {

    @NonNull
    private RouteStatus a = RouteStatus.PROCESSING;
    private String b;

    @Nullable
    private Object c;

    private RouteResponse() {
    }

    public static RouteResponse assemble(@NonNull RouteStatus routeStatus, @Nullable String str) {
        RouteResponse routeResponse = new RouteResponse();
        routeResponse.a = routeStatus;
        routeResponse.b = str;
        return routeResponse;
    }

    public String getMessage() {
        return this.b;
    }

    @Nullable
    public Object getResult() {
        return this.c;
    }

    @NonNull
    public RouteStatus getStatus() {
        return this.a;
    }

    public void setResult(@Nullable Object obj) {
        this.c = obj;
    }

    public void setStatus(@NonNull RouteStatus routeStatus) {
        this.a = routeStatus;
    }
}
