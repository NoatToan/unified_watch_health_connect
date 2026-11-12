package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.huawei.hihealth.HiDataFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes21.dex */
public class ahm implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ahp f410b;

    public ahm(ahp ahpVar) {
        this.f410b = ahpVar;
    }

    public ahm c(ahp ahpVar) {
        return ahpVar == this.f410b ? this : new ahm(ahpVar);
    }

    public JavaType e(String str) throws IllegalArgumentException {
        b bVar = new b(str.trim());
        JavaType javaTypeD = d(bVar);
        if (bVar.hasMoreTokens()) {
            throw c(bVar, "Unexpected tokens after complete type");
        }
        return javaTypeD;
    }

    protected JavaType d(b bVar) throws IllegalArgumentException {
        if (!bVar.hasMoreTokens()) {
            throw c(bVar, "Unexpected end-of-string");
        }
        Class<?> clsD = d(bVar.nextToken(), bVar);
        if (bVar.hasMoreTokens()) {
            String strNextToken = bVar.nextToken();
            if (HiDataFilter.DataFilterExpression.LESS_THAN.equals(strNextToken)) {
                return this.f410b.d((ahf) null, clsD, ahn.c(clsD, b(bVar)));
            }
            bVar.a(strNextToken);
        }
        return this.f410b.d((ahf) null, clsD, ahn.e());
    }

    protected List<JavaType> b(b bVar) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (bVar.hasMoreTokens()) {
            arrayList.add(d(bVar));
            if (!bVar.hasMoreTokens()) {
                break;
            }
            String strNextToken = bVar.nextToken();
            if (HiDataFilter.DataFilterExpression.BIGGER_THAN.equals(strNextToken)) {
                return arrayList;
            }
            if (!",".equals(strNextToken)) {
                throw c(bVar, "Unexpected token '" + strNextToken + "', expected ',' or '>')");
            }
        }
        throw c(bVar, "Unexpected end-of-string");
    }

    protected Class<?> d(String str, b bVar) {
        try {
            return this.f410b.e(str);
        } catch (Exception e) {
            ahw.i(e);
            throw c(bVar, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    protected IllegalArgumentException c(b bVar, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", bVar.b(), bVar.a(), str));
    }

    static final class b extends StringTokenizer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final String f412b;
        protected String d;

        public b(String str) {
            super(str, "<,>", true);
            this.f412b = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this.d != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this.d;
            if (str != null) {
                this.d = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this.f411a += strNextToken.length();
            return strNextToken.trim();
        }

        public void a(String str) {
            this.d = str;
        }

        public String b() {
            return this.f412b;
        }

        public String a() {
            return this.f412b.substring(this.f411a);
        }
    }
}
