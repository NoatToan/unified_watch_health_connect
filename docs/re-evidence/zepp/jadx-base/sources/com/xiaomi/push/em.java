package com.xiaomi.push;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class em {
    public final byte a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final String f172a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final short f173a;

    public em() {
        this("", (byte) 0, (short) 0);
    }

    public em(String str, byte b, short s) {
        this.f172a = str;
        this.a = b;
        this.f173a = s;
    }

    public String toString() {
        return "<TField name:'" + this.f172a + "' type:" + ((int) this.a) + " field-id:" + ((int) this.f173a) + SearchCriteria.GT;
    }
}
