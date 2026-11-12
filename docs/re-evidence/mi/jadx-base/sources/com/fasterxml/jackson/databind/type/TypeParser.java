package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.h04;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes4.dex */
public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    protected final TypeFactory _factory;

    public static final class a extends StringTokenizer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7721b;
        public String c;

        public a(String str) {
            super(str, "<,>", true);
            this.f7720a = str;
        }

        public String a() {
            return this.f7720a;
        }

        public String b() {
            return this.f7720a.substring(this.f7721b);
        }

        public void c(String str) {
            this.c = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this.c != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this.c;
            if (str != null) {
                this.c = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this.f7721b += strNextToken.length();
            return strNextToken.trim();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public IllegalArgumentException _problem(a aVar, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", aVar.a(), aVar.b(), str));
    }

    public Class<?> findClass(String str, a aVar) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e) {
            h04.f0(e);
            throw _problem(aVar, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        a aVar = new a(str.trim());
        JavaType type = parseType(aVar);
        if (aVar.hasMoreTokens()) {
            throw _problem(aVar, "Unexpected tokens after complete type");
        }
        return type;
    }

    public JavaType parseType(a aVar) throws IllegalArgumentException {
        if (!aVar.hasMoreTokens()) {
            throw _problem(aVar, "Unexpected end-of-string");
        }
        Class<?> clsFindClass = findClass(aVar.nextToken(), aVar);
        if (aVar.hasMoreTokens()) {
            String strNextToken = aVar.nextToken();
            if ("<".equals(strNextToken)) {
                return this._factory._fromClass(null, clsFindClass, TypeBindings.create(clsFindClass, parseTypes(aVar)));
            }
            aVar.c(strNextToken);
        }
        return this._factory._fromClass(null, clsFindClass, TypeBindings.emptyBindings());
    }

    public List<JavaType> parseTypes(a aVar) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (aVar.hasMoreTokens()) {
            arrayList.add(parseType(aVar));
            if (!aVar.hasMoreTokens()) {
                break;
            }
            String strNextToken = aVar.nextToken();
            if (">".equals(strNextToken)) {
                return arrayList;
            }
            if (!",".equals(strNextToken)) {
                throw _problem(aVar, "Unexpected token '" + strNextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(aVar, "Unexpected end-of-string");
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        return typeFactory == this._factory ? this : new TypeParser(typeFactory);
    }
}
