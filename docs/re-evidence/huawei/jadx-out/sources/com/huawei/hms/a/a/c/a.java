package com.huawei.hms.a.a.c;

import com.huawei.hms.support.picker.request.AccountPickerParams;
import com.huawei.hms.support.picker.result.AuthAccountPicker;
import defpackage.nox;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f12657a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f12658b = new ConcurrentHashMap();

    private a() {
    }

    public static a a() {
        return f12657a;
    }

    public void a(AuthAccountPicker authAccountPicker, AccountPickerParams accountPickerParams) {
        String json;
        nox.b("[ACCOUNTSDK]AccountPickerMemCache", "saveDefaultAccountPickerAccount start.", true);
        if (authAccountPicker != null) {
            try {
                json = authAccountPicker.toJson();
            } catch (Throwable th) {
                nox.a("[ACCOUNTSDK]AccountPickerMemCache", "store SignInAccount faild, exception:" + th.getClass().getSimpleName(), true);
                return;
            }
        } else {
            json = null;
        }
        a(json, accountPickerParams != null ? accountPickerParams.toJson() : null);
    }

    private void a(String str, String str2) {
        nox.b("[ACCOUNTSDK]AccountPickerMemCache", "saveDefaultAccountPickerAccount start.", true);
        this.f12658b.remove("AccountPickerAccount");
        this.f12658b.remove("AccountPickerAuthParams");
        if (str != null) {
            this.f12658b.put("AccountPickerAccount", str);
        }
        if (str2 != null) {
            this.f12658b.put("AccountPickerAuthParams", str2);
        }
    }

    public final AuthAccountPicker b() {
        nox.b("[ACCOUNTSDK]AccountPickerMemCache", "getAccountPickerAccount start.", true);
        try {
            String str = this.f12658b.get("AccountPickerAccount");
            if (str != null) {
                return AuthAccountPicker.fromJson(str);
            }
            return null;
        } catch (Throwable th) {
            nox.a("[ACCOUNTSDK]AccountPickerMemCache", "getHuaweiSignInAccount faild, exception:" + th.getClass().getSimpleName(), true);
            return null;
        }
    }

    public void c() {
        this.f12658b.clear();
    }
}
