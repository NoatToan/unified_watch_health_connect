package com.huawei.skinner.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.huawei.skinner.internal.IDynamicNewView;
import com.huawei.skinner.internal.ISkinUpdate2;
import com.huawei.skinner.internal.ISkinnableViewManager2;
import defpackage.pye;
import defpackage.pyk;
import defpackage.pyp;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SkinBaseActivity extends Activity implements ISkinUpdate2, IDynamicNewView, ISkinnableViewManager2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pyp f23167b = new pyp(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23168c = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
    }

    private void b() {
        if (this.f23168c) {
            return;
        }
        this.f23168c = true;
        this.f23167b.d();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f23167b.e();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f23167b.c();
    }

    @Override // com.huawei.skinner.internal.ISkinUpdate
    public void onThemeServiceUpdate() {
        this.f23167b.onThemeServiceUpdate();
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
        this.f23167b.dynamicAddSkinableView(view, str, i);
    }

    @Override // com.huawei.skinner.internal.IDynamicNewView
    public void dynamicAddSkinableView(View view, List<pye> list) {
        this.f23167b.dynamicAddSkinableView(view, list);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public pyk addSkinnableView(pyk pykVar) {
        return this.f23167b.addSkinnableView(pykVar);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public pyk removeSkinnableView(pyk pykVar) {
        return this.f23167b.removeSkinnableView(pykVar);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public void applySkin() {
        applySkin(false);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager2
    public void applySkin(boolean z) {
        this.f23167b.applySkin(z);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public void clean() {
        this.f23167b.clean();
    }
}
