package com.xiaomi.yrn.controller.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import com.xiaomi.yrn.view.base.YRNBaseFragmentActivity;
import defpackage.jvr;
import defpackage.lwr;
import defpackage.ovr;
import defpackage.ssi;
import defpackage.vvr;
import defpackage.yvi;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class YRNCLiveSingleTaskMainActivity extends YRNBaseFragmentActivity {
    public WeakReference<Activity> h;
    public Fragment i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f14532k;
    public Uri l;

    public final boolean k(Bundle bundle) {
        String str;
        String defaultUrlWhenEmpty;
        Uri data = getIntent().getData();
        this.l = data;
        if (bundle != null && data == null) {
            String string = bundle.getString("url");
            if (!TextUtils.isEmpty(string)) {
                data = Uri.parse(string);
            }
        }
        if (data == null) {
            defaultUrlWhenEmpty = lwr.b().getMIYRNControllerInfoProvider() != null ? lwr.b().getMIYRNControllerInfoProvider().getDefaultUrlWhenEmpty() : "";
            str = null;
        } else {
            String queryParameter = data.getQueryParameter("id");
            String string2 = data.toString();
            str = queryParameter;
            defaultUrlWhenEmpty = string2;
        }
        String str2 = this.f14532k;
        if (str2 != null && str2.equalsIgnoreCase(str)) {
            return true;
        }
        String str3 = this.j;
        if (str3 != null && str3.equalsIgnoreCase(defaultUrlWhenEmpty)) {
            return true;
        }
        this.j = defaultUrlWhenEmpty;
        this.f14532k = str;
        return false;
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        vvr.g(true, this);
        vvr.b(this);
        k(bundle);
        WeakReference<Activity> weakReference = new WeakReference<>(this);
        this.h = weakReference;
        ovr.a(weakReference, "TAG_LIVE");
        setContentView(yvi.f40614a);
        k kVarO = getSupportFragmentManager().o();
        Fragment fragmentNewYRNFragment = lwr.b().newYRNFragment(this.j, null);
        this.i = fragmentNewYRNFragment;
        kVarO.w(ssi.f33949a, fragmentNewYRNFragment);
        kVarO.l();
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        getSupportFragmentManager().o().v(this.i).o();
        this.i = null;
        if (getWindow() != null && getWindow().getDecorView() != null && getWindow().getDecorView().getHandler() != null) {
            getWindow().getDecorView().getHandler().removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        jvr.a(this);
        ovr.d(this.h);
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (k(intent.getExtras())) {
            return;
        }
        this.i = lwr.b().newYRNFragment(this.j, null);
        getSupportFragmentManager().o().w(ssi.f33949a, this.i).o();
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("url")) {
            this.j = bundle.getString("url");
        }
        if (bundle.containsKey("id")) {
            this.f14532k = bundle.getString("id");
        }
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.j)) {
            bundle.putString("url", this.j);
        }
        if (TextUtils.isEmpty(this.f14532k)) {
            return;
        }
        bundle.putString("id", this.f14532k);
    }
}
