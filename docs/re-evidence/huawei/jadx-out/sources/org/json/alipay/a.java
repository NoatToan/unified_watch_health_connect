package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f44588a;

    public String toString() {
        try {
            return "[" + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }

    public Object b(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return this.f44588a.get(i);
    }

    public a a(Object obj) {
        this.f44588a.add(obj);
        return this;
    }

    public String a(String str) {
        int iA = a();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iA; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.b(this.f44588a.get(i)));
        }
        return stringBuffer.toString();
    }

    public Object a(int i) throws JSONException {
        Object objB = b(i);
        if (objB != null) {
            return objB;
        }
        throw new JSONException("JSONArray[" + i + "] not found.");
    }

    public int a() {
        return this.f44588a.size();
    }

    public a(c cVar) throws JSONException {
        char c2;
        ArrayList arrayList;
        Object objD;
        this();
        char c3 = cVar.c();
        if (c3 == '[') {
            c2 = ']';
        } else {
            if (c3 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c2 = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c4 = cVar.c();
            cVar.a();
            if (c4 == ',') {
                arrayList = this.f44588a;
                objD = null;
            } else {
                arrayList = this.f44588a;
                objD = cVar.d();
            }
            arrayList.add(objD);
            char c5 = cVar.c();
            if (c5 != ')') {
                if (c5 != ',' && c5 != ';') {
                    if (c5 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c2 == c5) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c2) + "'");
        } while (cVar.c() != ']');
    }

    public a(Collection collection) {
        this.f44588a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(String str) {
        this(new c(str));
    }

    public a(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            a(Array.get(obj, i));
        }
    }

    public a() {
        this.f44588a = new ArrayList();
    }
}
