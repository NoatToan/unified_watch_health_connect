package com.huawei.health.suggestion.ui;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.common.Constant;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hzi;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseCloudActivity extends com.huawei.ui.commonui.base.BaseActivity {
    private static final String TAG = "Suggestion_BaseCloudActivity";
    private int mGetUiCallbackCount;
    private AtomicInteger mCloudTaskCount = new AtomicInteger();
    private SparseArray<UiCallback> mUiCallbacks = new SparseArray<>();

    protected abstract void bindView();

    protected abstract void initCloudData();

    protected abstract void initLayout();

    protected abstract void initLocalData();

    protected abstract void initViewController();

    protected void preInitCloudData() {
    }

    protected abstract void registerUiCallback();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hzi.b(new WeakReference(this));
        setHealthTheme();
        bindView();
        preInitCloudData();
        registerUiCallback();
        initCloudData();
        addTaskCountAndCheckComplete(this.mGetUiCallbackCount);
    }

    protected void initCloudDataComplete() {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.BaseCloudActivity.3
            @Override // java.lang.Runnable
            public void run() {
                BaseCloudActivity.this.initLocalData();
                BaseCloudActivity.this.initLayout();
                BaseCloudActivity.this.initViewController();
            }
        });
    }

    protected void registerUiCallback(int i, UiCallback uiCallback) {
        if (uiCallback == null) {
            LogUtil.j(TAG, "uiCallback == null");
        } else {
            this.mUiCallbacks.put(i, new b(uiCallback));
        }
    }

    protected UiCallback getUiCallback(int i) {
        this.mGetUiCallbackCount++;
        return this.mUiCallbacks.get(i);
    }

    private void setHealthTheme() {
        int identifier = getResources().getIdentifier("HealthTheme", TtmlNode.TAG_STYLE, Constant.HEALTH_SERVICE_NAME);
        if (identifier == 0) {
            LogUtil.j(TAG, "onCreate if (themeId == 0)");
        } else {
            LogUtil.a(TAG, "onCreate if (themeId == 0) ELSE themeId=", Integer.valueOf(identifier));
            setTheme(identifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTaskCountAndCheckComplete(int i) {
        if (this.mCloudTaskCount.addAndGet(i) == 0) {
            initCloudDataComplete();
        }
    }

    class b<T> extends UiCallback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicBoolean f8958a = new AtomicBoolean();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private UiCallback<T> f8959c;

        b(UiCallback<T> uiCallback) {
            this.f8959c = uiCallback;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            this.f8959c.onFailure(i, str);
            b();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(T t) {
            this.f8959c.onSuccess(t);
            b();
        }

        private void b() {
            LogUtil.d(BaseCloudActivity.TAG, "complete()");
            if (this.f8958a.getAndSet(true)) {
                return;
            }
            LogUtil.d(BaseCloudActivity.TAG, "complete() !mIsComplete.getAndSet(true)");
            BaseCloudActivity.this.addTaskCountAndCheckComplete(-1);
        }
    }
}
