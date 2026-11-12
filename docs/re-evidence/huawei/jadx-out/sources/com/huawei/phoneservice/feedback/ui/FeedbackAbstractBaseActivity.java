package com.huawei.phoneservice.feedback.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.framework.common.Logger;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import com.huawei.phoneservice.faq.base.network.SdkAppInfo;
import com.huawei.phoneservice.faq.base.util.FaqBaseCallback;
import com.huawei.phoneservice.faq.base.util.FaqHwFrameworkUtil;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.h;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.o;
import com.huawei.phoneservice.faq.base.util.p;
import com.huawei.phoneservice.feedback.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FeedbackAbstractBaseActivity extends FragmentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21726b;

    protected abstract int j();

    protected abstract void l();

    protected abstract void m();

    protected abstract void n();

    protected abstract int p();

    protected abstract int s();

    @Override // android.app.Activity
    public void setTitle(int i) {
        setTitle(getString(i));
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (Build.VERSION.SDK_INT == 26 && o()) {
            return;
        }
        super.setRequestedOrientation(i);
    }

    protected void q() {
        p.c(this, i());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        d(TrackConstants$Opers.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        d(TrackConstants$Opers.STARTED);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        h.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        FaqBaseCallback callback = i.a().getCallback();
        if (callback != null) {
            g.e("FeedbackAbstractActivity", " baseCallback ");
            View viewOnCreateView = callback.onCreateView(getWindow(), str, context, attributeSet);
            if (viewOnCreateView != null) {
                g.e("FeedbackAbstractActivity", "return view");
                return viewOnCreateView;
            }
        }
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        SdkAppInfo.initAppInfo(getApplication());
        int identifier = getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
        if (identifier == 0) {
            identifier = R.style.FeedbackTheme;
            this.f21725a = true;
        }
        super.setTheme(identifier);
        int i = Build.VERSION.SDK_INT;
        if (i == 26 && o()) {
            g.b("FeedbackAbstractActivity", "onCreate fixOrientation version Oreo, result = " + h());
        }
        FaqHwFrameworkUtil.b(this, 1);
        com.huawei.phoneservice.faq.base.util.c.d(this, new int[]{android.R.id.content}, p());
        if (i >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        p.b(this, this.f21725a, getResources().getColor(R.color.faq_emui_white_bg));
        g();
        super.onCreate(bundle);
        try {
            setContentView(j());
            p.e((Activity) this);
            r();
        } catch (RuntimeException e) {
            Log.e("FeedbackAbstractActivity", "RuntimeException:" + e.getMessage());
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q();
        boolean zD = o.d(this);
        g.c("FeedbackAbstractActivity", "onConfigurationChanged newConfig.orientation:%s", Integer.valueOf(configuration.orientation));
        o.e(this, k(), s());
        if (zD != this.f21726b) {
            this.f21726b = zD;
            setRequestedOrientation((zD || com.huawei.phoneservice.faq.base.util.d.d()) ? -1 : 1);
        }
    }

    public void onBackPressed(View view) {
        onBackPressed();
    }

    protected int[] k() {
        return new int[]{0};
    }

    public int[] i() {
        return new int[]{android.R.id.content};
    }

    public void d(String str) {
        String simpleName = getClass().getSimpleName();
        CharSequence title = getTitle();
        com.huawei.phoneservice.faq.base.tracker.c.e("activity", new com.huawei.phoneservice.faq.base.tracker.c.C0255c().a(str).b(title == null ? "" : title.toString()).c(simpleName).b().c());
    }

    private void r() {
        n();
        m();
        l();
        if (com.huawei.phoneservice.faq.base.util.d.d()) {
            q();
        }
    }

    private boolean o() {
        boolean zBooleanValue;
        Exception e;
        try {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            AccessController.doPrivileged(new c(method));
            zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
                return zBooleanValue;
            } catch (Exception e2) {
                e = e2;
                g.c("FeedbackAbstractActivity", e.getMessage());
                return zBooleanValue;
            }
        } catch (Exception e3) {
            zBooleanValue = false;
            e = e3;
        }
    }

    class c implements PrivilegedAction<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f21727c;

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.f21727c.setAccessible(true);
            return null;
        }

        c(Method method) {
            this.f21727c = method;
        }
    }

    class d implements PrivilegedAction<Object> {
        final /* synthetic */ Field d;

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.d.setAccessible(true);
            return null;
        }

        d(Field field) {
            this.d = field;
        }
    }

    private boolean h() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            AccessController.doPrivileged(new d(declaredField));
            ActivityInfo activityInfo = (ActivityInfo) declaredField.get(this);
            if (activityInfo != null) {
                activityInfo.screenOrientation = -1;
            }
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e) {
            g.c("FeedbackAbstractActivity", e.getMessage());
            return false;
        }
    }

    private void g() {
        try {
            this.f21726b = o.d(this);
            if (o.b(this)) {
                setRequestedOrientation(-1);
            } else {
                setRequestedOrientation(1);
            }
        } catch (IllegalStateException e) {
            Logger.d("FeedbackAbstractActivity", "e: " + e.getMessage());
        }
    }
}
