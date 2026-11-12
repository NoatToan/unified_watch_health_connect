package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l1 f13515b;

    public void b(s0 s0Var) {
        v.a("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f13514a);
        if (s0Var != null) {
            this.f13515b.b(s0Var);
        } else {
            this.f13515b.b(null);
            v.e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }

    public void b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        v.d("hmsSdk", "onStreamEvent. TAG: " + this.f13514a + ", TYPE: " + i + ", eventId : " + str);
        if (e1.a(str) || !c(i)) {
            v.e("hmsSdk", "onStreamEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f13514a + ", TYPE: " + i);
            return;
        }
        if (!e1.a(linkedHashMap)) {
            v.e("hmsSdk", "onStreamEvent() parameter mapValue will be cleared.TAG: " + this.f13514a + ", TYPE: " + i);
            linkedHashMap = null;
        }
        g0.a().b(this.f13514a, i, str, linkedHashMap);
    }

    public void a(s0 s0Var) {
        v.a("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f13514a);
        if (s0Var != null) {
            this.f13515b.a(s0Var);
        } else {
            v.e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.f13515b.a((s0) null);
        }
    }

    public void a(Context context, String str, String str2) {
        v.d("hmsSdk", "onEvent(context). TAG: " + this.f13514a + ", eventId : " + str);
        if (context == null) {
            v.e("hmsSdk", "context is null in onevent ");
            return;
        }
        if (e1.a(str) || !c(0)) {
            v.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f13514a);
        } else {
            if (!e1.a("value", str2, 65536)) {
                v.e("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f13514a);
                str2 = "";
            }
            g0.a().a(this.f13514a, context, str, str2);
        }
    }

    public void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        v.d("hmsSdk", "onEvent. TAG: " + this.f13514a + ", TYPE: " + i + ", eventId : " + str);
        if (e1.a(str) || !c(i)) {
            v.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f13514a + ", TYPE: " + i);
            return;
        }
        if (!e1.a(linkedHashMap)) {
            v.e("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f13514a + ", TYPE: " + i);
            linkedHashMap = null;
        }
        g0.a().a(this.f13514a, i, str, linkedHashMap);
    }

    public void a(int i) {
        v.d("hmsSdk", "onReport. TAG: " + this.f13514a + ", TYPE: " + i);
        g0.a().a(this.f13514a, i);
    }

    private boolean c(int i) {
        String str;
        if (i != 2) {
            s0 s0VarB = b(i);
            if (s0VarB != null && !TextUtils.isEmpty(s0VarB.h())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i;
        } else {
            if ("_default_config_tag".equals(this.f13514a)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        v.e("hmsSdk", str);
        return false;
    }

    private s0 b(int i) {
        if (i == 0) {
            return this.f13515b.c();
        }
        if (i == 1) {
            return this.f13515b.b();
        }
        if (i == 2) {
            return this.f13515b.d();
        }
        if (i != 3) {
            return null;
        }
        return this.f13515b.a();
    }

    public z0(String str) {
        this.f13514a = str;
        this.f13515b = new l1(str);
        s.c().a(this.f13514a, this.f13515b);
    }
}
