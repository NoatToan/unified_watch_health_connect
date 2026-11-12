package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f18740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f18741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f18742c;
    protected fz d;
    protected fz e;
    protected gb f;
    protected RemoteCallResultCallback<String> g;
    protected boolean h;

    public f(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback, String str2) {
        this.h = false;
        this.f18740a = str;
        this.f18741b = context;
        this.g = remoteCallResultCallback;
        this.f18742c = str2;
        this.d = ew.a(context);
        this.e = ex.b(context);
        this.f = ez.a(context);
    }

    public f(Context context, RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
        this.h = false;
        this.f18741b = context;
        this.g = remoteCallResultCallback;
        this.f18742c = str;
        this.d = ew.a(context);
        this.e = ex.b(context);
        this.f = ez.a(context);
        this.h = true;
    }
}
