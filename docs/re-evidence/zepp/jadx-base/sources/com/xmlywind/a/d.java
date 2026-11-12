package com.xmlywind.a;

import java.io.InputStream;

/* JADX INFO: loaded from: classes22.dex */
public class d {
    public c a(String str, InputStream inputStream) throws b {
        if (str == null) {
            throw new IllegalArgumentException("Archivername must not be null.");
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream must not be null.");
        }
        if ("tar".equalsIgnoreCase(str)) {
            return new com.xmlywind.a.a.b(inputStream);
        }
        throw new b("Archiver: " + str + " not found.");
    }
}
