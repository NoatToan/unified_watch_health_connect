package com.huawei.hwcloudjs.service.debugtool;

/* JADX INFO: loaded from: classes37.dex */
public class SetUrl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SetUrl f17125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GetUrlCallBack f17126b;

    public interface GetUrlCallBack {
        void onResult(String str);
    }

    public GetUrlCallBack b() {
        return this.f17126b;
    }

    public void a(GetUrlCallBack getUrlCallBack) {
        this.f17126b = getUrlCallBack;
    }

    public static SetUrl a() {
        SetUrl setUrl;
        synchronized (SetUrl.class) {
            if (f17125a == null) {
                f17125a = new SetUrl();
            }
            setUrl = f17125a;
        }
        return setUrl;
    }
}
