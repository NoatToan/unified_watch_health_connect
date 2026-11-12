package com.mibi.sdk.channel.alipay;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.model.IBaseModel;
import defpackage.b2s;

/* JADX INFO: loaded from: classes5.dex */
public class c extends BaseMvpPresenter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f10099b;

    public class b implements IBaseModel.IResultCallback<Void> {
        public b() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            MibiLog.d("AlipayChannelPresenter", "requestAlipayChannel success");
            ((e) c.this.getView()).a();
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("AlipayChannelPresenter", "requestAlipayChannel failed:" + str, th);
            ((e) c.this.getView()).b(i, str, th);
        }
    }

    public c(Class<e> cls) {
        super(cls);
    }

    private void a() {
        MibiLog.d("AlipayChannelPresenter", "requestAlipayChannel");
        b2s b2sVar = new b2s(getSession());
        b2sVar.d(this.f10099b);
        addLifeCycleListener(b2sVar);
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f10098a);
        b2sVar.request(bundle, new b());
    }

    public void c(Activity activity) {
        this.f10099b = activity;
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        String string = getArguments().getString(CommonConstants.KEY_PROCESS_ID);
        this.f10098a = string;
        if (TextUtils.isEmpty(string)) {
            throw new IllegalStateException("processId is null");
        }
        a();
    }

    @Override // com.mibi.sdk.mvp.Presenter
    public void onRelease() {
        super.onRelease();
        this.f10099b = null;
    }
}
