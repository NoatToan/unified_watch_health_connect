package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected d f13300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f13302c;
    private final int d;
    private final Context e;
    private final String f;
    private final GrsBaseInfo g;
    private final com.huawei.hms.framework.network.grs.e.c h;

    public Callable<d> g() {
        return new f(this.f13301b, this.d, this.f13302c, this.e, this.f, this.g, this.h);
    }

    public com.huawei.hms.framework.network.grs.e.c f() {
        return this.h;
    }

    public String e() {
        return this.f;
    }

    public int d() {
        return this.d;
    }

    public String c() {
        return this.f13301b;
    }

    public c b() {
        return this.f13302c;
    }

    public Context a() {
        return this.e;
    }

    public a(String str, int i, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        this.f13301b = str;
        this.f13302c = cVar;
        this.d = i;
        this.e = context;
        this.f = str2;
        this.g = grsBaseInfo;
        this.h = cVar2;
    }
}
