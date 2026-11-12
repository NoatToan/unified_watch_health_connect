package com.mibi.sdk.channel.mipay;

import android.app.Activity;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.model.IBaseModel;
import defpackage.r9s;

/* JADX INFO: loaded from: classes5.dex */
public class c extends BaseMvpPresenter<com.mibi.sdk.channel.mipay.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f10110b;

    public class b implements IBaseModel.IResultCallback<Bundle> {
        public b() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bundle bundle) {
            MibiLog.d("MipayChannelPresenter", "requestMipayChannel success");
            ((com.mibi.sdk.channel.mipay.b) c.this.getView()).a(bundle);
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("MipayChannelPresenter", "requestMipayChannel failed:" + i, th);
            ((com.mibi.sdk.channel.mipay.b) c.this.getView()).b(i, str, th);
        }
    }

    public c(Class<com.mibi.sdk.channel.mipay.b> cls) {
        super(cls);
    }

    public void c(Activity activity) {
        this.f10110b = activity;
    }

    public final void d(boolean z) {
        MibiLog.d("MipayChannelPresenter", "requestMipayChannel");
        r9s r9sVar = new r9s(getSession());
        r9sVar.b(this.f10110b);
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f10109a);
        bundle.putBoolean(CommonConstants.KEY_IS_RESTORED, z);
        addLifeCycleListener(r9sVar);
        r9sVar.request(bundle, new b());
    }

    @Override // com.mibi.sdk.mvp.Presenter, com.mibi.sdk.mvp.IPresenter
    public void handleResult(int i, int i2, Bundle bundle) {
        MibiLog.d("MipayChannelPresenter", "handleResult");
        super.handleResult(i, i2, bundle);
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        boolean z = bundle != null;
        MibiLog.d("MipayChannelPresenter", "savedState == null ? " + z);
        if (z) {
            this.f10109a = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        } else {
            this.f10109a = getArguments().getString(CommonConstants.KEY_PROCESS_ID);
        }
        d(z);
    }

    @Override // com.mibi.sdk.mvp.Presenter
    public void onRelease() {
        super.onRelease();
        this.f10110b = null;
    }

    @Override // com.mibi.sdk.mvp.Presenter
    public void onSave(Bundle bundle) {
        super.onSave(bundle);
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f10109a);
    }
}
