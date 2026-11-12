package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f133509a;

    public a(c cVar) throws JSONException {
        char c14;
        ArrayList arrayList;
        Object objD;
        this();
        char c15 = cVar.c();
        if (c15 == '[') {
            c14 = ']';
        } else {
            if (c15 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c14 = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c16 = cVar.c();
            cVar.a();
            if (c16 == ',') {
                arrayList = this.f133509a;
                objD = null;
            } else {
                arrayList = this.f133509a;
                objD = cVar.d();
            }
            arrayList.add(objD);
            char c17 = cVar.c();
            if (c17 != ')') {
                if (c17 != ',' && c17 != ';') {
                    if (c17 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c14 == c17) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c14) + "'");
        } while (cVar.c() != ']');
    }

    private String a(String str) {
        int size = this.f133509a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.a(this.f133509a.get(i14)));
        }
        return stringBuffer.toString();
    }

    public String toString() {
        try {
            return "[" + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object a(int i14) throws JSONException {
        Object obj = (i14 < 0 || i14 >= this.f133509a.size()) ? null : this.f133509a.get(i14);
        if (obj != null) {
            return obj;
        }
        throw new JSONException(e0.f(i14, "JSONArray[", "] not found."));
    }

    public final int a() {
        return this.f133509a.size();
    }

    public a(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i14 = 0; i14 < length; i14++) {
            this.f133509a.add(Array.get(obj, i14));
        }
    }

    public a(String str) {
        this(new c(str));
    }

    public a(Collection collection) {
        this.f133509a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a() {
        this.f133509a = new ArrayList();
    }
}
