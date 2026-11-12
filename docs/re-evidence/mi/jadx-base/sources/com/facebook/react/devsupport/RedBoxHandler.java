package com.facebook.react.devsupport;

import android.content.Context;
import defpackage.m8o;

/* JADX INFO: loaded from: classes4.dex */
public interface RedBoxHandler {

    public enum ErrorType {
        JS("JS"),
        NATIVE("Native");

        private final String name;

        ErrorType(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public interface a {
    }

    boolean a();

    void b(Context context, String str, m8o[] m8oVarArr, String str2, a aVar);

    void c(String str, m8o[] m8oVarArr, ErrorType errorType);
}
