package com.xiaomi.onetrack.b;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13822b;
    public long c;
    public String d;
    public JSONObject e;

    public String toString() {
        return "ConfigModel{appId='" + this.f13821a + "', commonSample=" + this.f13822b + ", timeStamp=" + this.c + ", eventsHash='" + this.d + "', appData='" + this.e + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
