package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.support.picker.common.AccountPickerUtil;

/* JADX INFO: loaded from: classes3.dex */
public class nns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43333a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f43334c;
    private volatile SharedPreferences e;

    public nns(Context context, String str) {
        this.f43333a = "";
        this.f43334c = context.getApplicationContext();
        this.f43333a = str;
        a();
    }

    private boolean a() {
        if (AccountPickerUtil.isPhoneStillInLockMode(this.f43334c)) {
            nox.b("HwIdCeSharedPreferences", "Phone Still In Lock Mode", true);
            return false;
        }
        this.e = this.f43334c.getSharedPreferences(this.f43333a, 0);
        boolean z = this.e == null;
        nox.b("HwIdCeSharedPreferences", "createSharedPreferences: " + z, false);
        return z;
    }

    private boolean d() {
        if (this.f43334c == null) {
            nox.a("HwIdCeSharedPreferences", "mContext is null, can not use SharedPreferences.", true);
            return false;
        }
        if (this.e == null) {
            nox.a("HwIdCeSharedPreferences", "mSharedPreferences is null, need init.", true);
            synchronized (nns.class) {
                if (this.e == null) {
                    return a();
                }
            }
        }
        return true;
    }

    public String a(String str, String str2) {
        nox.b("HwIdCeSharedPreferences", "getString, key:" + str, false);
        return !d() ? str2 : this.e.getString(str, str2);
    }

    public boolean d(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        nox.b("HwIdCeSharedPreferences", "setString, key:" + str, false);
        if (!d() || (editorEdit = this.e.edit()) == null) {
            return false;
        }
        return editorEdit.putString(str, str2).commit();
    }

    public long c(String str, long j) {
        nox.b("HwIdCeSharedPreferences", "getLong, key:" + str, false);
        return !d() ? j : this.e.getLong(str, j);
    }

    public boolean a(String str, long j) {
        SharedPreferences.Editor editorEdit;
        nox.b("HwIdCeSharedPreferences", "saveLong, key:" + str, false);
        if (!d() || (editorEdit = this.e.edit()) == null) {
            return false;
        }
        return editorEdit.putLong(str, j).commit();
    }

    public boolean b(String str, boolean z) {
        nox.b("HwIdCeSharedPreferences", "getBoolean, key:" + str, false);
        return !d() ? z : this.e.getBoolean(str, z);
    }

    public boolean e(String str, boolean z) {
        SharedPreferences.Editor editorEdit;
        nox.b("HwIdCeSharedPreferences", "saveBoolean, key:" + str, false);
        if (!d() || (editorEdit = this.e.edit()) == null) {
            return false;
        }
        return editorEdit.putBoolean(str, z).commit();
    }
}
