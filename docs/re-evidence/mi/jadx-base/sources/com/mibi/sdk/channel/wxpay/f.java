package com.mibi.sdk.channel.wxpay;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.model.IBaseModel;
import defpackage.y2s;

/* JADX INFO: loaded from: classes5.dex */
public class f extends BaseMvpPresenter<com.mibi.sdk.channel.wxpay.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f10126b;

    public class b implements y2s.b {
        public b() {
        }

        @Override // y2s.b
        public void a(boolean z) {
            if (z) {
                ((com.mibi.sdk.channel.wxpay.b) f.this.getView()).a(false);
            } else {
                ((com.mibi.sdk.channel.wxpay.b) f.this.getView()).a(true);
            }
        }
    }

    public class c implements IBaseModel.IResultCallback<Void> {
        public c() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            MibiLog.d("WxpayChannelPresenter", "requestWxpayChannel success");
            ((com.mibi.sdk.channel.wxpay.b) f.this.getView()).a();
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("WxpayChannelPresenter", "requestWxpayChannel failed:" + str, th);
            ((com.mibi.sdk.channel.wxpay.b) f.this.getView()).b(i, str, th);
        }
    }

    public f(Class<com.mibi.sdk.channel.wxpay.b> cls) {
        super(cls);
    }

    private void a() {
        MibiLog.d("WxpayChannelPresenter", "requestWxpayChannel");
        y2s y2sVar = new y2s(getSession());
        y2sVar.f(this.f10126b);
        addLifeCycleListener(y2sVar);
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f10125a);
        y2sVar.d(new b());
        y2sVar.request(bundle, new c());
    }

    public void c(Activity activity) {
        this.f10126b = activity;
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        String string = getArguments().getString(CommonConstants.KEY_PROCESS_ID);
        this.f10125a = string;
        if (TextUtils.isEmpty(string)) {
            throw new IllegalStateException("processId is null");
        }
        a();
    }

    @Override // com.mibi.sdk.mvp.Presenter
    public void onRelease() {
        super.onRelease();
        this.f10126b = null;
    }
}
