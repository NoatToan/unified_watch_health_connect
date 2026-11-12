package com.xmlywind.volley;

import android.content.Intent;

/* JADX INFO: loaded from: classes22.dex */
public class a extends s {
    private Intent b;

    public a() {
    }

    public a(i iVar) {
        super(iVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
