package com.huawei.hwarkuix;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.engine.StageDelegateProxy;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad;
import com.huawei.hwarkuix.oHBrigdePlugin.load.PluginLoadFactory;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import defpackage.qrs;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import ohos.stage.ability.adapter.StageApplicationDelegate;

/* JADX INFO: loaded from: classes36.dex */
public class EntryAbilityActivity extends BaseActivity {
    private static final String INSTANCE_NAME = "com.huawei.hmos.health:arkuix:ArkuixAbility:";
    private static final String R_TAG = "R_ArkUIX_EntryAbilityActivity";
    private static final String TAG = "ArkUIX_EntryAbilityActivity";
    private Context mBaseApplicationContext;
    private int mModuleType = 0;
    private IPluginLoad mPluginLoad;
    private boolean reInjectBridge;

    @Override // com.huawei.hwarkuix.BaseActivity, ohos.stage.ability.adapter.StageActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ReleaseLogUtil.c(R_TAG, "EntryEntryAbilityActivity onCreate");
        StageDelegateProxy.getInstance().tryAlreadyAvailable();
        checkModifyParams();
        if (!StageDelegateProxy.getInstance().isPluginAvaiable()) {
            new StageApplicationDelegate().initApplication(getApplication());
            ReleaseLogUtil.c(R_TAG, "StageApplicationDelegate initApplication");
        }
        ReleaseLogUtil.c(R_TAG, "onCreate INSTANCE_NAME = ", INSTANCE_NAME, "model is  ", Build.MODEL, "MANUFACTURER is  ", Build.MANUFACTURER, "  Build.BRAND ", Build.BRAND);
        super.onCreate(bundle);
        ActivityTransitionAnimator activityTransitionAnimatorA = ActivityTransitionAnimator.c().a((Activity) this);
        boolean zA = activityTransitionAnimatorA.a();
        if (zA) {
            activityTransitionAnimatorA.f();
        }
        this.mBaseApplicationContext = BaseApplication.b();
        initModules();
        if (zA) {
            activityTransitionAnimatorA.d(false).d(new TransitionEnterAnimatorListener(this)).e();
        }
    }

    private void checkModifyParams() {
        Intent intent;
        if (BaseApplication.d("com.huawei.health.MainActivity") == -1 && (intent = getIntent()) != null) {
            String stringExtra = intent.getStringExtra(e.n);
            LogUtil.b(TAG, "checkModifyParams params:", stringExtra);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            String string = IntentParams.builder(stringExtra).addInfo("reInjectBridge", 10, Boolean.TRUE.toString()).build().toString();
            LogUtil.b(TAG, "checkModifyParams newParams:", string);
            intent.putExtra(e.n, string);
            this.reInjectBridge = true;
        }
    }

    @Override // com.huawei.hwarkuix.BaseActivity
    protected String getModuleName() {
        return "arkuix";
    }

    private void initModules() {
        int intExtra = getIntent().getIntExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 0);
        this.mModuleType = intExtra;
        LogUtil.b(TAG, "initModules moduleType:", Integer.valueOf(intExtra));
        IPluginLoad iPluginLoadGeneratedPluginLoad = PluginLoadFactory.generatedPluginLoad(this.mModuleType);
        this.mPluginLoad = iPluginLoadGeneratedPluginLoad;
        if (iPluginLoadGeneratedPluginLoad == null) {
            LogUtil.e(TAG, "initModules pluginLoad == null");
        } else {
            iPluginLoadGeneratedPluginLoad.loadPlugin(this.mBaseApplicationContext, getBridgeManager(), this.reInjectBridge);
        }
    }

    @Override // ohos.stage.ability.adapter.StageActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        ReleaseLogUtil.c(R_TAG, "onNewIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        initModules();
    }

    @Override // ohos.stage.ability.adapter.StageActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.hwarkuix.BaseActivity, ohos.stage.ability.adapter.StageActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.b(TAG, "onDestroy");
        super.onDestroy();
        IPluginLoad iPluginLoad = this.mPluginLoad;
        if (iPluginLoad != null) {
            iPluginLoad.onDestroy();
        }
    }

    @Override // ohos.stage.ability.adapter.StageActivity, android.app.Activity
    public void finish() {
        if (ActivityTransitionAnimator.c().a()) {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.hwarkuix.EntryAbilityActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1401lambda$finish$0$comhuaweihwarkuixEntryAbilityActivity();
                }
            });
        } else {
            super.finish();
        }
    }

    /* JADX INFO: renamed from: lambda$finish$0$com-huawei-hwarkuix-EntryAbilityActivity, reason: not valid java name */
    /* synthetic */ void m1401lambda$finish$0$comhuaweihwarkuixEntryAbilityActivity() {
        ActivityTransitionAnimator.c().a(qrs.ad(this)).c(qrs.q(this)).b();
    }

    static class TransitionEnterAnimatorListener implements ActivityTransitionAnimator.EnterListener {
        private final WeakReference<BaseActivity> mWeakReference;

        @Override // com.huawei.ui.commonui.transition.ActivityTransitionAnimator.EnterListener
        public void start() {
        }

        TransitionEnterAnimatorListener(BaseActivity baseActivity) {
            this.mWeakReference = new WeakReference<>(baseActivity);
        }

        @Override // com.huawei.ui.commonui.transition.ActivityTransitionAnimator.EnterListener
        public void end() {
            BaseActivity baseActivity = this.mWeakReference.get();
            if (baseActivity == null || baseActivity.isDestroyed() || baseActivity.isFinishing()) {
                ReleaseLogUtil.d(EntryAbilityActivity.TAG, "TransitionEnterAnimatorListener end activity ", baseActivity);
            } else {
                baseActivity.initSystemBar();
                baseActivity.initMinibar();
            }
        }
    }
}
