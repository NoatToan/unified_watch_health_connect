package com.huawei.hwidauth.g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwidauth.c.k;
import com.huawei.secure.android.common.intent.SafeBundle;
import defpackage.nnr;
import defpackage.nox;
import defpackage.noy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f<T extends k> {
    private static final String e = "f";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f17584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17586c;
    public a d;

    public interface a {
        void a(int i, String str);

        void a(SafeBundle safeBundle);
    }

    protected abstract void a(T t, Response<ResponseBody> response);

    public void a() {
        nnr.d().execute(new Runnable() { // from class: com.huawei.hwidauth.g.f.2
            @Override // java.lang.Runnable
            public void run() {
                RestClient restClientE = noy.e(f.this.f17585b, f.this.f17586c);
                if (restClientE == null) {
                    nox.a(f.e, "restClient is null.", true);
                    f.this.a(2003, "restClient is null.");
                    return;
                }
                com.huawei.hwidauth.utils.a aVar = (com.huawei.hwidauth.utils.a) restClientE.create(com.huawei.hwidauth.utils.a.class);
                try {
                    String strA = f.this.f17584a.a();
                    if (strA == null) {
                        nox.a(f.e, "pack is null.", true);
                        f.this.a(2003, "pack is null.");
                        return;
                    }
                    String strC = f.this.f17584a.c();
                    nox.b(f.e, "request url  >>> " + strC + f.this.f17586c, false);
                    nox.b(f.e, "request body >>> " + strA, false);
                    aVar.a(f.this.f17586c, RequestBody.create(" text/html; charset=utf-8", strA.getBytes("UTF-8"))).enqueue(new ResultCallback<ResponseBody>() { // from class: com.huawei.hwidauth.g.f.2.5
                        @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                        public void onResponse(Response<ResponseBody> response) {
                            nox.b(f.e, "request onResponse", true);
                            if (response == null) {
                                f.this.a(2005, "response is null.");
                            } else {
                                f.this.a(f.this.f17584a, response);
                            }
                        }

                        @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                        public void onFailure(Throwable th) {
                            nox.b(f.e, "onFailure", true);
                            f.this.a(2005, "request fail.");
                        }
                    });
                } catch (Exception e2) {
                    nox.a(f.e, "Exception:" + e2.getClass().getSimpleName(), true);
                    f.this.a(2015, e2.getMessage());
                }
            }
        });
    }

    protected void a(final SafeBundle safeBundle) {
        if (this.d == null) {
            nox.b(e, "mCallback is null", true);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.hwidauth.g.f.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.d.a(safeBundle);
                }
            });
        }
    }

    protected void a(final int i, final String str) {
        if (this.d == null) {
            nox.b(e, "mCallback is null", true);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.hwidauth.g.f.5
                @Override // java.lang.Runnable
                public void run() {
                    f.this.d.a(i, str);
                }
            });
        }
    }
}
