package com.huawei.hianalytics.visual;

import android.content.SharedPreferences;
import com.huawei.hianalytics.core.log.HiLog;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes33.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FutureTask f11683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f11685c;
    public Object d;

    public q0(FutureTask futureTask, String str, p0 p0Var) {
        this.f11683a = futureTask;
        this.f11684b = str;
        this.f11685c = p0Var;
    }

    public final Object a() {
        Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        synchronized (this.f11683a) {
            String string = null;
            try {
                SharedPreferences sharedPreferences = (SharedPreferences) this.f11683a.get();
                if (sharedPreferences != null) {
                    string = sharedPreferences.getString(this.f11684b, null);
                }
            } catch (Exception unused) {
                HiLog.w("PreferencesHolder", "fail to get sp file");
            }
            if (string != null) {
                return this.f11685c.a(string);
            }
            Object objA = this.f11685c.a();
            this.d = objA;
            a(objA);
            return this.d;
        }
    }

    public final void a(Object obj) {
        SharedPreferences sharedPreferences;
        if (w.a().f()) {
            return;
        }
        this.d = obj;
        synchronized (this.f11683a) {
            try {
                sharedPreferences = (SharedPreferences) this.f11683a.get();
            } catch (Exception unused) {
                HiLog.w("PreferencesHolder", "fail to get sp file");
                sharedPreferences = null;
            }
            if (sharedPreferences == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (this.d == null) {
                this.d = this.f11685c.a();
            }
            editorEdit.putString(this.f11684b, this.f11685c.a(this.d));
            editorEdit.apply();
        }
    }
}
