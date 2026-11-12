package com.facebook.react;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.fv5;
import defpackage.gsh;
import defpackage.kcj;
import defpackage.prh;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReactActivity extends AppCompatActivity implements fv5, prh {
    public final kcj h = k();

    @Override // defpackage.fv5
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }

    public kcj k() {
        return new kcj(this, l());
    }

    public String l() {
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.h.i(i, i2, intent);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.h.j()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h.k(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.h.l();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.h.m(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.h.n(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.h.o(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.h.p(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.h.q();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.h.r(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.h.s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.h.t(z);
    }

    @Override // defpackage.prh
    public void requestPermissions(String[] strArr, int i, gsh gshVar) {
        this.h.u(strArr, i, gshVar);
    }
}
