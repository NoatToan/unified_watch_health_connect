package com.xiaomi.push;

import defpackage.c2t;
import defpackage.l2t;
import defpackage.m3t;
import defpackage.r2t;
import defpackage.v3t;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class ij implements jm<ij, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f115a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public id f116a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f117a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f118a = new BitSet(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f114a = new v3t("DataCollectionItem");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14084a = new l2t("", (byte) 10, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14085b = new l2t("", (byte) 8, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);

    public ij a(long j) {
        this.f115a = j;
        a(true);
        return this;
    }

    public boolean b() {
        return this.f116a != null;
    }

    public boolean c() {
        return this.f117a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ij)) {
            return m693a((ij) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(");
        sb.append("collectedAt:");
        sb.append(this.f115a);
        sb.append(", ");
        sb.append("collectionType:");
        id idVar = this.f116a;
        if (idVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(idVar);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f117a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m691a();
        r2tVar.v(f114a);
        r2tVar.s(f14084a);
        r2tVar.p(this.f115a);
        r2tVar.z();
        if (this.f116a != null) {
            r2tVar.s(f14085b);
            r2tVar.o(this.f116a.a());
            r2tVar.z();
        }
        if (this.f117a != null) {
            r2tVar.s(c);
            r2tVar.q(this.f117a);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m692a() {
        return this.f118a.get(0);
    }

    public void a(boolean z) {
        this.f118a.set(0, z);
    }

    public ij a(id idVar) {
        this.f116a = idVar;
        return this;
    }

    public String a() {
        return this.f117a;
    }

    public ij a(String str) {
        this.f117a = str;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m693a(ij ijVar) {
        if (ijVar == null || this.f115a != ijVar.f115a) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = ijVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f116a.equals(ijVar.f116a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = ijVar.c();
        if (zC || zC2) {
            return zC && zC2 && this.f117a.equals(ijVar.f117a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ij ijVar) {
        int iE;
        int iD;
        int iC;
        if (!getClass().equals(ijVar.getClass())) {
            return getClass().getName().compareTo(ijVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m692a()).compareTo(Boolean.valueOf(ijVar.m692a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m692a() && (iC = c2t.c(this.f115a, ijVar.f115a)) != 0) {
            return iC;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ijVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iD = c2t.d(this.f116a, ijVar.f116a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ijVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!c() || (iE = c2t.e(this.f117a, ijVar.f117a)) == 0) {
            return 0;
        }
        return iE;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) throws jy {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                break;
            }
            short s = l2tVarG.c;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        m3t.a(r2tVar, b2);
                    } else if (b2 == 11) {
                        this.f117a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                } else if (b2 == 8) {
                    this.f116a = id.a(r2tVar.c());
                } else {
                    m3t.a(r2tVar, b2);
                }
            } else if (b2 == 10) {
                this.f115a = r2tVar.d();
                a(true);
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
        r2tVar.D();
        if (m692a()) {
            m691a();
            return;
        }
        throw new jy("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m691a() throws jy {
        if (this.f116a != null) {
            if (this.f117a != null) {
                return;
            }
            throw new jy("Required field 'content' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'collectionType' was not present! Struct: " + toString());
    }
}
