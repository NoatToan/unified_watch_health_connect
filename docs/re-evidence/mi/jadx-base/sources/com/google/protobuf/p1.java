package com.google.protobuf;

import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f9733b = Logger.getLogger(p1.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Descriptors.b> f9734a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p1 f9735a = new p1(Collections.emptyMap());
    }

    public p1(Map<String, Descriptors.b> map) {
        this.f9734a = map;
    }

    public static p1 c() {
        return a.f9735a;
    }

    public static String d(String str) throws InvalidProtocolBufferException {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length != 1) {
            return strArrSplit[strArrSplit.length - 1];
        }
        throw new InvalidProtocolBufferException("Invalid type url found: " + str);
    }

    public Descriptors.b a(String str) {
        return this.f9734a.get(str);
    }

    public final Descriptors.b b(String str) throws InvalidProtocolBufferException {
        return a(d(str));
    }
}
