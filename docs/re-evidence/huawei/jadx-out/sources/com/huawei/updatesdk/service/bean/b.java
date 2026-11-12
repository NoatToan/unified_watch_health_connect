package com.huawei.updatesdk.service.bean;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f29944a;

    public void b(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f29944a.edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("SharedPreferencesWrapper", "putString error!!key:" + str, e);
        }
    }

    public void b(String str, long j) {
        try {
            SharedPreferences.Editor editorEdit = this.f29944a.edit();
            editorEdit.putLong(str, j);
            editorEdit.commit();
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("SharedPreferencesWrapper", "putLong error!!key:" + str, e);
        }
    }

    public void a(String str) {
        try {
            if (this.f29944a.contains(str)) {
                SharedPreferences.Editor editorEdit = this.f29944a.edit();
                editorEdit.remove(str);
                editorEdit.commit();
            }
        } catch (Exception unused) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("SharedPreferencesWrapper", "remove error!!key:" + str);
        }
    }

    public String a(String str, String str2) {
        try {
            return this.f29944a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public long a(String str, long j) {
        try {
            return this.f29944a.getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    public static b a(String str, Context context) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
        } catch (Exception unused) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("SharedPreferencesWrapper", "getSharedPreference error");
            sharedPreferences = null;
        }
        return new b(sharedPreferences);
    }

    private b(SharedPreferences sharedPreferences) {
        this.f29944a = sharedPreferences;
    }
}
