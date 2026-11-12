package com.huami.wallet.ui.helper;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WalletPageHelper implements Application.ActivityLifecycleCallbacks {
    private static final String c = "Wallet-Navigation";
    private static WalletPageHelper d;
    private final List<Activity> a = new ArrayList();
    private final List<WalletPageListener> b = new ArrayList();

    public interface WalletPageListener {
        void onEnter();

        void onLeave();
    }

    public static WalletPageHelper getInstance() {
        if (d == null) {
            synchronized (WalletPageHelper.class) {
                if (d == null) {
                    d = new WalletPageHelper();
                }
            }
        }
        return d;
    }

    public void finishPreviousActivities() {
        for (int i = 0; i < this.a.size() - 1; i++) {
            Activity activity = this.a.get(i);
            activity.finish();
            HMLog.d(c, "关闭之前打开过的页面，关闭了:" + activity.getClass().getName(), new Object[0]);
        }
    }

    public int getCreatedActivityCount() {
        return this.a.size();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.add(activity);
        if (this.a.size() == 1) {
            HMLog.w(c, String.format("进入了钱包模块 wallet_version:%s", "3.4.6"), new Object[0]);
            Iterator<WalletPageListener> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().onEnter();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.a.remove(activity);
        if (this.a.size() == 0) {
            HMLog.i(c, "离开了钱包模块", new Object[0]);
            Iterator<WalletPageListener> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().onLeave();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        HMLog.i(c, "Activity onStart() " + activity.getClass().getName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        HMLog.i(c, "Activity onStop() " + activity.getClass().getName(), new Object[0]);
    }

    public void registerWalletPageListener(WalletPageListener walletPageListener) {
        this.b.add(walletPageListener);
    }

    public void unregisterWalletPageListener(WalletPageListener walletPageListener) {
        this.b.remove(walletPageListener);
    }
}
