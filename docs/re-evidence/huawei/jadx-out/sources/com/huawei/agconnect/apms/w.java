package com.huawei.agconnect.apms;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends srq {
    public final rqp abc;
    public final SharedPreferences bcd;
    public final SharedPreferences.Editor cde;
    public final ReentrantLock def;

    public w(Context context) {
        rqp rqpVar = new rqp();
        this.abc = rqpVar;
        rqpVar.bcd();
        this.def = new ReentrantLock();
        SharedPreferences sharedPreferences = context.getSharedPreferences(abc(context.getPackageName()), 0);
        this.bcd = sharedPreferences;
        this.cde = sharedPreferences.edit();
    }

    public final void abc(String str, boolean z) {
        this.def.lock();
        try {
            this.cde.putBoolean(str, z);
            this.cde.apply();
        } finally {
            this.def.unlock();
        }
    }

    @Override // com.huawei.agconnect.apms.srq, com.huawei.agconnect.apms.qpo
    public final void ijk() {
        this.def.lock();
        try {
            this.cde.clear();
            this.cde.apply();
            this.abc.bcd();
        } finally {
            this.def.unlock();
        }
    }

    public final void bcd(String str) {
        this.def.lock();
        try {
            this.cde.putString("apms.disabled_app_versions", str);
            this.cde.apply();
        } finally {
            this.def.unlock();
        }
    }

    public final String klm() {
        if (!this.bcd.contains("apms.cdn_header_name")) {
            return "";
        }
        try {
            return this.bcd.getString("apms.cdn_header_name", "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String lmn() {
        if (!this.bcd.contains("apms.disabled_app_versions")) {
            return "";
        }
        try {
            return this.bcd.getString("apms.disabled_app_versions", "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public final boolean nop() {
        try {
            return this.bcd.getBoolean("apms.enable_anr_monitor", true);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean opq() {
        try {
            return this.bcd.getBoolean("apms.disable_collection", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean pqr() {
        try {
            return this.bcd.getBoolean("apms.disable_collection_by_user", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean qrs() {
        try {
            return this.bcd.getBoolean("apms.enable_web_view_monitor", true);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String abc(String str) {
        return "com.huawei.agconnect.apms.v1_" + str;
    }
}
