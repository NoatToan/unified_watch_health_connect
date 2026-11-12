package com.huawei.openalliance.ad.utils.dcservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.utils.dg;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f20634c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f20637c;
        private String d;
        private String e;
        private String f;
        private int g;
        private String h;

        public a c(String str) {
            this.e = str;
            return this;
        }

        public a b(String str) {
            this.f20636b = str;
            return this;
        }

        public c a() {
            return new c(this);
        }

        public a a(String str) {
            this.f20635a = str;
            return this;
        }

        public a a(AppInfo appInfo) {
            if (appInfo != null) {
                String packageName = appInfo.getPackageName();
                String strA = appInfo.A();
                if (!dg.b(packageName)) {
                    this.e = packageName;
                }
                if (!dg.b(strA)) {
                    this.f = strA;
                }
            }
            return this;
        }

        public a a(ContentRecord contentRecord, Context context) {
            if (contentRecord == null) {
                hw.c("RedirectionMatchParam.Builder", "send param by content record,record is null.");
                return this;
            }
            this.f20635a = contentRecord.o();
            this.f20636b = contentRecord.p();
            this.f20637c = contentRecord.n();
            this.d = contentRecord.ai();
            this.g = contentRecord.f();
            if (context != null) {
                this.h = contentRecord.c(context.getApplicationContext());
            }
            return this;
        }

        public a a(ApkInfo apkInfo) {
            if (apkInfo != null) {
                String strA = apkInfo.a();
                String strQ = apkInfo.Q();
                if (!dg.b(strA)) {
                    this.e = strA;
                }
                if (!dg.b(strQ)) {
                    this.f = strQ;
                }
            }
            return this;
        }

        public a a(Intent intent) {
            if (intent != null) {
                if (dg.b(this.e)) {
                    this.e = intent.getPackage();
                }
                ComponentName component = intent.getComponent();
                if (component != null && dg.b(this.f)) {
                    this.f = component.getClassName();
                }
            }
            return this;
        }

        public a a(int i) {
            this.g = i;
            return this;
        }
    }

    public String h() {
        return this.h;
    }

    public String g() {
        return this.f;
    }

    public String f() {
        return this.e;
    }

    public String e() {
        return this.f20633b;
    }

    public String d() {
        return this.d;
    }

    public String c() {
        return this.f20634c;
    }

    public void b(String str) {
        this.f = str;
    }

    public String b() {
        return this.f20632a;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(Intent intent) {
        if (intent == null) {
            return;
        }
        if (this.e == null) {
            this.e = intent.getPackage();
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            b(component.getClassName());
        }
    }

    public int a() {
        return this.g;
    }

    public c(a aVar) {
        this.e = aVar.e;
        this.f = aVar.f;
        this.f20632a = aVar.f20635a;
        this.f20633b = aVar.f20636b;
        this.f20634c = aVar.f20637c;
        this.d = aVar.d;
        this.g = aVar.g;
        this.h = aVar.h;
    }
}
