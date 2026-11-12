package com.facebook.yrn.manager;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.facebook.react.ReactRootView;
import com.facebook.react.a;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.yrn.manager.utils.YRNLogUtils;

/* JADX INFO: loaded from: classes4.dex */
public class YRNReactContainerView extends FrameLayout {
    Bundle mAppProperties;
    YRNBizInstance mBizInstance;
    String mInitialUITemplate;
    String mJSModuleName;
    OnYRNInstanceListener mListener;
    private OnReactRootViewProvider mProvider;
    a mReactInstanceManager;
    private ReactRootView mReactRootView;
    private boolean mRegisterListener;

    public interface OnReactRootViewProvider {
        ReactRootView getNewView(Context context);
    }

    public YRNReactContainerView(Context context) {
        this(context, null);
    }

    private ReactRootView createCustomReactRootView() {
        OnReactRootViewProvider onReactRootViewProvider = this.mProvider;
        if (onReactRootViewProvider == null) {
            return null;
        }
        ReactRootView newView = onReactRootViewProvider.getNewView(getContext());
        if (newView != null && newView == this.mReactRootView) {
            throw new IllegalStateException("This New View Created can not be same with before!");
        }
        YRNLogUtils.d(YRNInstanceManager.TAG, "createCustomReactRootView");
        return newView;
    }

    private ReactRootView createDefaultReactRootView() {
        YRNLogUtils.d(YRNInstanceManager.TAG, "createDefaultReactRootView");
        return new ReactRootView(getContext());
    }

    private void createInnerReactRootView() {
        ReactRootView reactRootViewCreateCustomReactRootView = createCustomReactRootView();
        if (reactRootViewCreateCustomReactRootView != null) {
            this.mReactRootView = reactRootViewCreateCustomReactRootView;
        } else {
            this.mReactRootView = createDefaultReactRootView();
        }
        addView(this.mReactRootView, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private void customStartReactApplication(a aVar, String str, Bundle bundle, String str2) {
        ReactRootView reactRootView = this.mReactRootView;
        if (reactRootView != null) {
            if (str2 != null) {
                reactRootView.p(aVar, str, bundle, str2);
            } else if (bundle == null) {
                reactRootView.n(aVar, str);
            } else {
                reactRootView.o(aVar, str, bundle);
            }
        }
    }

    private void init() {
        createInnerReactRootView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reCreate() {
        ReactRootView reactRootView = this.mReactRootView;
        if (reactRootView != null && reactRootView.getReactInstanceManager() == null) {
            startReactApplication(this.mReactInstanceManager, this.mBizInstance, this.mJSModuleName, this.mAppProperties, this.mInitialUITemplate);
            return;
        }
        ReactRootView reactRootView2 = this.mReactRootView;
        createInnerReactRootView();
        startReactApplication(this.mReactInstanceManager, this.mBizInstance, this.mJSModuleName, this.mAppProperties, this.mInitialUITemplate);
        if (reactRootView2 != null) {
            reactRootView2.q();
            removeView(reactRootView2);
        }
    }

    private void registerListenerOnce(YRNBizInstance yRNBizInstance) {
        if (yRNBizInstance == null || this.mRegisterListener) {
            return;
        }
        yRNBizInstance.addYRNBizInstanceListener(this.mListener);
        this.mRegisterListener = true;
    }

    public void destroy() {
        YRNBizInstance yRNBizInstance = this.mBizInstance;
        if (yRNBizInstance != null) {
            yRNBizInstance.removeYRNInstanceEventListener(this.mListener);
            this.mRegisterListener = false;
        }
        ReactRootView reactRootView = this.mReactRootView;
        if (reactRootView != null) {
            reactRootView.q();
        }
        removeAllViews();
        this.mReactRootView = null;
    }

    public ReactRootView getReactRootView() {
        return this.mReactRootView;
    }

    public YRNBizInstance getYRNBizInstance() {
        return this.mBizInstance;
    }

    public void startReactApplication(a aVar, YRNBizInstance yRNBizInstance, String str) {
        startReactApplication(aVar, yRNBizInstance, str, null);
    }

    public YRNReactContainerView(Context context, OnReactRootViewProvider onReactRootViewProvider) {
        super(context);
        this.mRegisterListener = false;
        this.mListener = new OnYRNInstanceListener() { // from class: com.facebook.yrn.manager.YRNReactContainerView.1
            @Override // com.facebook.yrn.manager.OnYRNInstanceListener
            public void onInstanceInitialized() {
                YRNReactContainerView.this.reCreate();
            }
        };
        this.mProvider = onReactRootViewProvider;
        init();
    }

    public void startReactApplication(a aVar, YRNBizInstance yRNBizInstance, String str, Bundle bundle) {
        startReactApplication(aVar, yRNBizInstance, str, bundle, null);
    }

    public void startReactApplication(a aVar, YRNBizInstance yRNBizInstance, String str, Bundle bundle, String str2) {
        UiThreadUtil.assertOnUiThread();
        this.mReactInstanceManager = aVar;
        this.mBizInstance = yRNBizInstance;
        this.mJSModuleName = str;
        this.mAppProperties = bundle;
        this.mInitialUITemplate = str2;
        if (this.mReactRootView != null) {
            if (yRNBizInstance == null) {
                YRNLogUtils.d(YRNInstanceManager.TAG, "mBizInstance is null,go NO-YRN path");
                customStartReactApplication(aVar, str, bundle, str2);
            } else {
                if (yRNBizInstance.hasInstanceCreated()) {
                    YRNLogUtils.d(YRNInstanceManager.TAG, "begin startReactApplication");
                    customStartReactApplication(aVar, str, bundle, str2);
                }
                registerListenerOnce(yRNBizInstance);
            }
        }
    }
}
