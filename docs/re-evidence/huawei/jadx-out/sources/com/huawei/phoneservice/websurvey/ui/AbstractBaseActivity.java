package com.huawei.phoneservice.websurvey.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.phoneservice.faq.base.util.FaqBaseCallback;
import com.huawei.phoneservice.faq.base.util.FaqHwFrameworkUtil;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.o;
import com.huawei.phoneservice.faq.base.util.p;
import com.huawei.phoneservice.websurvey.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractBaseActivity extends FragmentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f21984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21985b;

    protected abstract int d();

    protected abstract void f();

    protected abstract void g();

    protected abstract void h();

    protected abstract int j();

    protected abstract int n();

    @Override // android.app.Activity
    public void setTitle(int i) {
        setTitle(getString(i));
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (Build.VERSION.SDK_INT == 26 && i()) {
            return;
        }
        super.setRequestedOrientation(i);
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
        com.huawei.phoneservice.faq.base.util.h.e(this);
        i.a().canceledSubmit(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        FaqBaseCallback callback = i.a().getCallback();
        if (callback != null) {
            g.e("AbstractBaseActivity", " baseCallback ");
            View viewOnCreateView = callback.onCreateView(getWindow(), str, context, attributeSet);
            if (viewOnCreateView != null) {
                g.e("AbstractBaseActivity", "return view");
                return viewOnCreateView;
            }
        }
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int identifier = getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
        if (identifier == 0) {
            identifier = R.style.NpsTheme;
            this.f21984a = true;
        }
        super.setTheme(identifier);
        int i = Build.VERSION.SDK_INT;
        if (i == 26 && i()) {
            g.b("AbstractBaseActivity", "onCreate fixOrientation when Oreo, result = " + b());
        }
        FaqHwFrameworkUtil.b(this, 1);
        com.huawei.phoneservice.faq.base.util.c.d(this, new int[]{android.R.id.content}, j());
        if (i >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        p.b(this, this.f21984a, getResources().getColor(R.color.emui_color_subbg));
        k();
        m();
        a();
        super.onCreate(bundle);
        try {
            setContentView(d());
            p.e((Activity) this);
            h();
            g();
            f();
            if (com.huawei.phoneservice.faq.base.util.d.d()) {
                l();
            }
        } catch (RuntimeException unused) {
            Log.e("AbstractBaseActivity", "content error");
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l();
        boolean zD = o.d(this);
        g.c("AbstractBaseActivity", "onConfigurationChanged newConfig.orientation:%s", Integer.valueOf(configuration.orientation));
        o.e(this, e(), n());
        if (zD != this.f21985b) {
            this.f21985b = zD;
            setRequestedOrientation((zD || com.huawei.phoneservice.faq.base.util.d.d()) ? -1 : 1);
        }
    }

    public void onBackPressed(View view) {
        onBackPressed();
    }

    protected void l() {
        p.c(this, c());
    }

    protected int[] e() {
        return new int[]{0};
    }

    public int[] c() {
        return new int[]{android.R.id.content};
    }

    private void m() {
        Window window = getWindow();
        window.setBackgroundDrawableResource(R.color.emui_color_subbg);
        window.setNavigationBarColor(getResources().getColor(R.color.emui_color_subbg, null));
    }

    private void k() {
        View viewFindViewById = findViewById(Resources.getSystem().getIdentifier("action_bar", "id", OsType.ANDROID));
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setBackground(getDrawable(R.color.emui_color_subbg));
        if (com.huawei.phoneservice.faq.base.util.d.e() || com.huawei.phoneservice.websurvey.utils.e.d()) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.emui_color_subbg, null));
        }
    }

    private boolean i() {
        boolean z = false;
        try {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            final Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.phoneservice.websurvey.ui.b
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return AbstractBaseActivity.a(method);
                }
            });
            boolean zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
                return zBooleanValue;
            } catch (Exception unused) {
                z = zBooleanValue;
                g.c("AbstractBaseActivity", "trans error");
                return z;
            }
        } catch (Exception unused2) {
        }
    }

    private boolean b() {
        try {
            final Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.phoneservice.websurvey.ui.a
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return AbstractBaseActivity.a(declaredField);
                }
            });
            ActivityInfo activityInfo = (ActivityInfo) declaredField.get(this);
            if (activityInfo != null) {
                activityInfo.screenOrientation = -1;
            }
            declaredField.setAccessible(false);
            return true;
        } catch (Exception unused) {
            g.c("AbstractBaseActivity", "fixOrientation error");
            return false;
        }
    }

    private void a() {
        try {
            this.f21985b = o.d(this);
            if (o.b(this)) {
                setRequestedOrientation(-1);
            } else {
                setRequestedOrientation(1);
            }
        } catch (IllegalStateException unused) {
            g.e("AbstractBaseActivity", "adaptationTahiti");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object a(Method method) {
        method.setAccessible(true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object a(Field field) {
        field.setAccessible(true);
        return null;
    }
}
