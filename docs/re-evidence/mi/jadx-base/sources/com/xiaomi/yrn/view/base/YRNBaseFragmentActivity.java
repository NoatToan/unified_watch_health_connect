package com.xiaomi.yrn.view.base;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactContext;
import defpackage.a1d;
import defpackage.b1d;
import defpackage.fur;
import defpackage.fv5;
import defpackage.gsh;
import defpackage.prh;

/* JADX INFO: loaded from: classes2.dex */
public abstract class YRNBaseFragmentActivity extends FragmentActivity implements fv5, prh, b1d {
    protected fur mDelegate = createReactActivityDelegate();

    public void attachModule(String str, String str2) {
        fur furVar = this.mDelegate;
        if (furVar != null) {
            furVar.a(str, str2);
        }
    }

    public fur createReactActivityDelegate() {
        return new fur(this);
    }

    @Override // defpackage.b1d
    public a1d getActivityDelegate() {
        return this.mDelegate;
    }

    public final a getReactInstanceManager() {
        fur furVar = this.mDelegate;
        if (furVar != null) {
            return furVar.c();
        }
        return null;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    @Override // defpackage.fv5
    public void invokeDefaultOnBackPressed() {
        super.lambda$onCreate$0();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        fur furVar = this.mDelegate;
        if (furVar != null) {
            furVar.d(i, i2, intent);
        }
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        ReactContext reactContextC;
        fur furVar = this.mDelegate;
        if (furVar != null) {
            a aVarC = furVar.c();
            Activity currentActivity = (aVarC == null || (reactContextC = aVarC.C()) == null) ? null : reactContextC.getCurrentActivity();
            if (this.mDelegate.e() && currentActivity == this) {
                return;
            }
            super.lambda$onCreate$0();
        }
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fur furVar = this.mDelegate;
        if (furVar != null) {
            furVar.f(configuration);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fur furVar = this.mDelegate;
        if (furVar != null) {
            furVar.g(bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fur furVar = this.mDelegate;
        if (furVar != null) {
            furVar.h();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.mDelegate.i(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.mDelegate.j(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        fur furVar = this.mDelegate;
        if (furVar != null) {
            furVar.k();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        fur furVar = this.mDelegate;
        if (furVar != null) {
            furVar.l(i, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        fur furVar = this.mDelegate;
        if (furVar != null) {
            furVar.m();
        }
    }

    @Override // defpackage.prh
    @TargetApi(23)
    public void requestPermissions(String[] strArr, int i, gsh gshVar) {
        super.requestPermissions(strArr, i);
        fur furVar = this.mDelegate;
        if (furVar != null) {
            furVar.n(strArr, i, gshVar);
        }
    }
}
