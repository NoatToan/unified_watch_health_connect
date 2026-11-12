package com.google.androidbrowserhelper.trusted;

import android.content.Context;
import androidx.browser.trusted.i;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements QualityEnforcer.Delegate, TwaLauncher.FallbackStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53455a;

    public /* synthetic */ a(int i14) {
        this.f53455a = i14;
    }

    @Override // com.google.androidbrowserhelper.trusted.QualityEnforcer.Delegate
    public void crash(String str) {
        QualityEnforcer.lambda$new$1(str);
    }

    @Override // com.google.androidbrowserhelper.trusted.TwaLauncher.FallbackStrategy
    public void launch(Context context, i iVar, String str, Runnable runnable) {
        switch (this.f53455a) {
            case 1:
                TwaLauncher.lambda$static$0(context, iVar, str, runnable);
                break;
            default:
                TwaLauncher.lambda$static$1(context, iVar, str, runnable);
                break;
        }
    }
}
