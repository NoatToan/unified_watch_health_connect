package com.huami.tools.analytics;

import com.huami.tools.analytics.internal.utils.JavaUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes15.dex */
class d {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public int o;

    public String a() {
        return this.b + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.c + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.d + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.e + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.f + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.g + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.h + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.i + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.j + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.k + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.l + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.m + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.n + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return JavaUtils.equals(this.a, ((d) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return String.valueOf(this.a).hashCode();
    }

    public String toString() {
        return "Client{hashId='" + this.a + "', uid='" + this.b + "', packageName='" + this.c + "', deviceBrand='" + this.d + "', deviceModel='" + this.e + "', osLevel=" + this.f + ", osVersion='" + this.g + "', appVersionCode=" + this.h + ", appVersionName='" + this.i + "', locale='" + this.j + "', sdkVersion='" + this.k + "', networkStatus='" + this.l + "', screenResolution='" + this.m + "', channel='" + this.n + "', eventVersion='" + this.o + "'}";
    }
}
