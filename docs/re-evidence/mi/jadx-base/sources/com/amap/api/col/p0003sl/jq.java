package com.amap.api.col.p0003sl;

import android.os.Build;
import defpackage.p0t;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public enum jq {
    MIUI(p0t.t("IeGlhb21p")),
    Flyme(p0t.t("IbWVpenU")),
    RH(p0t.t("IaHVhd2Vp")),
    ColorOS(p0t.t("Ib3Bwbw")),
    FuntouchOS(p0t.t("Idml2bw")),
    SmartisanOS(p0t.t("Mc21hcnRpc2Fu")),
    AmigoOS(p0t.t("IYW1pZ28")),
    EUI(p0t.t("IbGV0dg")),
    Sense(p0t.t("EaHRj")),
    LG(p0t.t("EbGdl")),
    Google(p0t.t("IZ29vZ2xl")),
    NubiaUI(p0t.t("IbnViaWE")),
    Other("");

    private String n;
    private int o;
    private String p;
    private String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f6176r = Build.MANUFACTURER;

    jq(String str) {
        this.n = str;
    }

    public final String a() {
        return this.n;
    }

    public final String b() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "ROM{name='" + name() + "',versionCode=" + this.o + ", versionName='" + this.q + "',ma=" + this.n + "',manufacturer=" + this.f6176r + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public final void a(int i) {
        this.o = i;
    }

    public final void b(String str) {
        this.q = str;
    }

    public final void a(String str) {
        this.p = str;
    }
}
