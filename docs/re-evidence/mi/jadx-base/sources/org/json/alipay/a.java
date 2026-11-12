package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f29557a;

    public a() {
        this.f29557a = new ArrayList();
    }

    public final int a() {
        return this.f29557a.size();
    }

    public String toString() {
        try {
            return "[" + a(",") + AbstractJsonLexerKt.END_LIST;
        } catch (Exception unused) {
            return null;
        }
    }

    public a(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f29557a.add(Array.get(obj, i));
        }
    }

    public final Object a(int i) throws JSONException {
        Object obj = (i < 0 || i >= this.f29557a.size()) ? null : this.f29557a.get(i);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONArray[" + i + "] not found.");
    }

    public a(String str) {
        this(new c(str));
    }

    private String a(String str) {
        int size = this.f29557a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.a(this.f29557a.get(i)));
        }
        return stringBuffer.toString();
    }

    public a(Collection collection) {
        this.f29557a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(c cVar) throws JSONException {
        char c;
        ArrayList arrayList;
        Object objD;
        this();
        char c2 = cVar.c();
        if (c2 == '[') {
            c = ']';
        } else {
            if (c2 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c3 = cVar.c();
            cVar.a();
            if (c3 == ',') {
                arrayList = this.f29557a;
                objD = null;
            } else {
                arrayList = this.f29557a;
                objD = cVar.d();
            }
            arrayList.add(objD);
            char c4 = cVar.c();
            if (c4 != ')') {
                if (c4 != ',' && c4 != ';') {
                    if (c4 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c == c4) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c) + "'");
        } while (cVar.c() != ']');
    }
}
