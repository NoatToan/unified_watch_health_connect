package com.huawei.hwidauth.provider;

import android.content.Context;
import android.content.pm.ProviderInfo;
import androidx.core.content.FileProvider;
import defpackage.nox;

/* JADX INFO: loaded from: classes38.dex */
public class HwIDFileProvider extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        try {
            super.attachInfo(context, providerInfo);
        } catch (IllegalArgumentException e) {
            nox.a("HwIDFileProvider", "IllegalArgumentException. " + e.getLocalizedMessage(), true);
        }
    }
}
