package com.xiaomi.ai.nlp.factoid.parsers;

import defpackage.yb8;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class ParseResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TreeMap<Integer, yb8> f11077b;

    public ParseResult(String str, TreeMap<Integer, yb8> treeMap) {
        this.f11076a = str;
        this.f11077b = treeMap;
    }

    public TreeMap<Integer, yb8> a() {
        return this.f11077b;
    }

    public String b() {
        return this.f11076a;
    }
}
