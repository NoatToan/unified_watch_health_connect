package com.github.tamir7.contacts;

import android.database.DatabaseUtils;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
final class b {
    private StringBuilder a;

    public enum a {
        Equal(SearchCriteria.EQ),
        NotEqual(SearchCriteria.NEQ),
        GreaterThan(SearchCriteria.GT),
        GreaterThanOrEqual(SearchCriteria.GE),
        LessThan(SearchCriteria.LT),
        LessThanOrEqual(SearchCriteria.LE),
        Like(" LIKE "),
        NotLike(" NOT LIKE "),
        Is(" IS "),
        IsNot(" IS NOT "),
        In(" IN "),
        NotIn(" NOT IN ");

        private final String value;

        a(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    private b(String str, String str2, a aVar) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(aVar.toString());
        sb.append(str2);
        this.a = sb;
    }

    public static b b(String str, Object obj) {
        return new b(str, String.format("'%%%s%%'", obj.toString()), a.Like);
    }

    public static b c(String str, Object obj) {
        return new b(str, String.format("'%s%%'", obj.toString()), a.NotLike);
    }

    public static b d(String str, Object obj) {
        return new b(str, String.format("'%%%s'", obj.toString()), a.Like);
    }

    public static b e(String str, Object obj) {
        return new b(str, r(obj), a.Equal);
    }

    public static b f(String str, Object obj) {
        return new b(str, r(obj), a.GreaterThan);
    }

    public static b g(String str, Object obj) {
        return new b(str, r(obj), a.GreaterThanOrEqual);
    }

    public static b h(String str, String str2) {
        return new b(str, str2, a.In);
    }

    public static b i(String str, List<?> list) {
        return new b(str, list, a.In);
    }

    public static b j(String str, Object obj) {
        return new b(str, r(obj), a.Is);
    }

    public static b k(String str, Object obj) {
        return new b(str, r(obj), a.IsNot);
    }

    public static b l(String str, Object obj) {
        return new b(str, r(obj), a.LessThan);
    }

    public static b m(String str, Object obj) {
        return new b(str, r(obj), a.LessThanOrEqual);
    }

    public static b n(String str, Object obj) {
        return new b(str, r(obj), a.NotEqual);
    }

    public static b o(String str, List<?> list) {
        return new b(str, list, a.NotIn);
    }

    public static b q(String str, Object obj) {
        return new b(str, String.format("'%s%%'", obj.toString()), a.Like);
    }

    private static String r(Object obj) {
        boolean z = obj instanceof String;
        String string = obj.toString();
        return z ? DatabaseUtils.sqlEscapeString(string) : string;
    }

    public b a(b bVar) {
        this.a = new StringBuilder(String.format("( %s AND %s )", this.a.toString(), bVar.toString()));
        return this;
    }

    public b p(b bVar) {
        this.a = new StringBuilder(String.format("( %s OR %s )", this.a.toString(), bVar.toString()));
        return this;
    }

    public String toString() {
        return this.a.toString();
    }

    private b(String str, List<?> list, a aVar) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(aVar);
        sb.append("(");
        this.a = sb;
        boolean z = true;
        for (Object obj : list) {
            if (z) {
                z = false;
            } else {
                this.a.append(", ");
            }
            this.a.append(r(obj));
        }
        this.a.append(")");
    }
}
