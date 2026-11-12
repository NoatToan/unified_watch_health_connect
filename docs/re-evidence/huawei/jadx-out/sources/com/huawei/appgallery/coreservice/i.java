package com.huawei.appgallery.coreservice;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.bhn;

/* JADX INFO: loaded from: classes23.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f5214a;

    public void b(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f5214a.edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        } catch (Exception e) {
            bhn.a("BaseSharedPreference", "putString error!!key:" + str, e);
        }
    }

    public String a(String str, String str2) {
        try {
            return this.f5214a.getString(str, str2);
        } catch (Exception unused) {
            this.f5214a.edit().remove(str).commit();
            return str2;
        }
    }

    public i(Context context, String str) {
        this.f5214a = context.getSharedPreferences(str, 0);
    }
}
