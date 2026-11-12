package com.huawei.skinner.base;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.huawei.skinner.internal.IDynamicNewView;
import com.huawei.skinner.internal.ISkinUpdate2;
import com.huawei.skinner.internal.ISkinnableViewManager2;
import defpackage.pye;
import defpackage.pyk;
import defpackage.pyp;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SkinBaseAppcompatActivity extends AppCompatActivity implements ISkinUpdate2, IDynamicNewView, ISkinnableViewManager2 {
    private pyp d = new pyp(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23169b = false;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        b();
        super.onCreate(bundle);
    }

    private void b() {
        if (this.f23169b) {
            return;
        }
        this.f23169b = true;
        this.d.d();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.d.e();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.d.c();
    }

    @Override // com.huawei.skinner.internal.ISkinUpdate
    public void onThemeServiceUpdate() {
        this.d.onThemeServiceUpdate();
    }

    @Override // com.huawei.skinner.internal.ISkinUpdate
    public void onThemeUpdate() {
        onThemeUpdate(false);
    }

    @Override // com.huawei.skinner.internal.ISkinUpdate2
    public void onThemeUpdate(boolean z) {
        applySkin(z);
    }

    @Override // com.huawei.skinner.internal.IDynamicNewView
    public void dynamicAddSkinableView(View view, String str, int i) {
        this.d.dynamicAddSkinableView(view, str, i);
    }

    @Override // com.huawei.skinner.internal.IDynamicNewView
    public void dynamicAddSkinableView(View view, List<pye> list) {
        this.d.dynamicAddSkinableView(view, list);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public pyk addSkinnableView(pyk pykVar) {
        return this.d.addSkinnableView(pykVar);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public pyk removeSkinnableView(pyk pykVar) {
        return this.d.removeSkinnableView(pykVar);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public void applySkin() {
        applySkin(false);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager2
    public void applySkin(boolean z) {
        this.d.applySkin(z);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public void clean() {
        this.d.clean();
    }
}
