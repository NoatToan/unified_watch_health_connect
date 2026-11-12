package com.huawei.hmf.orb.dexloader;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import com.huawei.hmf.orb.dexloader.internal.RunningModuleInfo;

/* JADX INFO: loaded from: classes33.dex */
public class ExposedActivityDelegate {
    private static final String TAG = "ExposedActivityDelegate";
    private final Activity mActivity;
    private Resources mResources;
    private Context mTargetContext;
    private Resources.Theme mTheme;
    private boolean isInit = false;
    private LayoutFactory mFactory = new LayoutFactory();

    public static ExposedActivityDelegate create(Activity activity) {
        if (!(activity instanceof ExposedUIModule)) {
            throw new IllegalArgumentException(activity.getClass().getName() + " must implements interface ExposedUIModule.");
        }
        return new ExposedActivityDelegate(activity);
    }

    protected boolean isHosted() {
        if (!this.isInit && this.mActivity.getIntent() != null) {
            onCreate(null);
        }
        return this.mTargetContext != null;
    }

    protected ExposedActivityDelegate(Activity activity) {
        this.mActivity = activity;
    }

    public void onCreate(Bundle bundle) {
        RunningModuleInfo runningModuleInfoFrom = RunningModuleInfo.from(this.mActivity.getIntent());
        if (runningModuleInfoFrom == null || runningModuleInfoFrom.isExternalModule()) {
            return;
        }
        this.mTargetContext = runningModuleInfoFrom.getTargetContext();
        this.isInit = true;
    }

    public Resources getResources(Resources resources) {
        if (!isHosted()) {
            return resources;
        }
        if (this.mResources == null) {
            this.mResources = this.mTargetContext.getResources();
        }
        return this.mResources;
    }

    public AssetManager getAssets(AssetManager assetManager) {
        return isHosted() ? this.mTargetContext.getAssets() : assetManager;
    }

    public Resources.Theme getTheme(Resources.Theme theme) {
        if (!isHosted()) {
            return theme;
        }
        if (this.mTheme == null) {
            Resources.Theme themeNewTheme = this.mTargetContext.getResources().newTheme();
            this.mTheme = themeNewTheme;
            themeNewTheme.setTo(this.mTargetContext.getTheme());
        }
        return this.mTheme;
    }

    public void setTheme(int i) {
        if (isHosted()) {
            if (this.mTheme == null) {
                Resources.Theme themeNewTheme = this.mTargetContext.getResources().newTheme();
                this.mTheme = themeNewTheme;
                themeNewTheme.setTo(this.mTargetContext.getTheme());
            }
            this.mTheme.applyStyle(i, true);
        }
    }

    public Context getBaseContext(Context context) {
        return isHosted() ? this.mTargetContext : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.view.LayoutInflater, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    public Object getSystemService(String str, Object obj) {
        Exception e;
        ?? CloneInContext;
        if (!(obj instanceof LayoutInflater)) {
            return obj;
        }
        try {
            CloneInContext = ((LayoutInflater) obj).cloneInContext(this.mActivity);
            try {
                CloneInContext.setFactory2(this.mFactory);
                return CloneInContext;
            } catch (Exception e2) {
                e = e2;
                Log.i(TAG, "setFactory2 warning:" + e.getMessage());
                return CloneInContext;
            }
        } catch (Exception e3) {
            e = e3;
            CloneInContext = obj;
        }
    }

    protected Activity getActivity() {
        return this.mActivity;
    }

    protected Context getTargetContext() {
        return this.mTargetContext;
    }

    class LayoutFactory implements LayoutInflater.Factory2 {
        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return null;
        }

        private LayoutFactory() {
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Class<?> cls;
            try {
                ClassLoader classLoader = ExposedActivityDelegate.this.mActivity.getClass().getClassLoader();
                if (classLoader != null) {
                    cls = classLoader.loadClass(str);
                } else {
                    cls = Class.forName(str);
                }
                return (View) cls.getConstructor(Context.class, AttributeSet.class).newInstance(context, attributeSet);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
