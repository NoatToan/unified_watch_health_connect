package com.huawei.haf.router.core;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.facade.model.RouteMeta;
import com.huawei.haf.router.facade.template.ServiceProvider;

/* JADX INFO: loaded from: classes2.dex */
public class AppRouterPostcard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6046c;
    private final String d;
    private ServiceProvider e;
    private RouteMeta f;
    private Object h;
    private final Uri j;

    public AppRouterPostcard(String str, String str2, Uri uri) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("path parameter invalid!");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("group parameter invalid!");
        }
        this.f6045b = str;
        this.d = str2;
        this.j = uri;
    }

    public String l() {
        return this.f6045b;
    }

    public String g() {
        return this.d;
    }

    public Uri o() {
        return this.j;
    }

    protected void a(RouteMeta routeMeta) {
        this.f = routeMeta;
        this.f6044a = routeMeta.getExtra();
    }

    protected RouteMeta n() {
        return this.f;
    }

    protected void b(ServiceProvider serviceProvider) {
        this.e = serviceProvider;
    }

    protected ServiceProvider m() {
        return this.e;
    }

    protected void r() {
        this.f6046c = true;
    }

    protected boolean s() {
        return this.f6046c;
    }

    protected void d(Object obj) {
        this.h = obj;
    }

    protected Object k() {
        return this.h;
    }

    public int h() {
        RouteMeta routeMeta = this.f;
        return routeMeta == null ? this.f6044a : routeMeta.getExtra();
    }

    public void c(int i) {
        this.f6044a = i;
    }
}
