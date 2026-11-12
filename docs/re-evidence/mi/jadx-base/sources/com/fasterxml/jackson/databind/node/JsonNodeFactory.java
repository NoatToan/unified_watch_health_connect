package com.fasterxml.jackson.databind.node;

import defpackage.atd;
import defpackage.c4h;
import defpackage.dj2;
import defpackage.fcj;
import defpackage.hcd;
import defpackage.i8p;
import defpackage.kgh;
import defpackage.mj1;
import defpackage.p43;
import defpackage.qam;
import defpackage.qx9;
import defpackage.rnq;
import defpackage.u2h;
import defpackage.vi2;
import defpackage.vr5;
import defpackage.w27;
import defpackage.y1h;
import defpackage.zre;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class JsonNodeFactory implements Serializable {
    private static final JsonNodeFactory decimalsAsIs;
    private static final JsonNodeFactory decimalsNormalized;
    public static final JsonNodeFactory instance;
    private static final long serialVersionUID = 1;
    private final boolean _cfgBigDecimalExact;

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        decimalsNormalized = jsonNodeFactory;
        decimalsAsIs = new JsonNodeFactory(true);
        instance = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    public static JsonNodeFactory withExactBigDecimals(boolean z) {
        return z ? decimalsAsIs : decimalsNormalized;
    }

    public boolean _inIntRange(long j) {
        return ((long) ((int) j)) == j;
    }

    public mj1 arrayNode() {
        return new mj1(this);
    }

    /* JADX INFO: renamed from: booleanNode, reason: merged with bridge method [inline-methods] */
    public p43 m127booleanNode(boolean z) {
        return z ? p43.W() : p43.V();
    }

    public rnq numberNode(Byte b2) {
        return b2 == null ? nullNode() : hcd.W(b2.intValue());
    }

    public c4h objectNode() {
        return new c4h(this);
    }

    public rnq pojoNode(Object obj) {
        return new kgh(obj);
    }

    public rnq rawValueNode(fcj fcjVar) {
        return new kgh(fcjVar);
    }

    public mj1 arrayNode(int i) {
        return new mj1(this, i);
    }

    public y1h nullNode() {
        return y1h.V();
    }

    /* JADX INFO: renamed from: textNode, reason: merged with bridge method [inline-methods] */
    public i8p m135textNode(String str) {
        return i8p.X(str);
    }

    public JsonNodeFactory() {
        this(false);
    }

    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public dj2 m125binaryNode(byte[] bArr) {
        return dj2.V(bArr);
    }

    public rnq numberNode(Double d) {
        return d == null ? nullNode() : w27.W(d.doubleValue());
    }

    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public dj2 m126binaryNode(byte[] bArr, int i, int i2) {
        return dj2.W(bArr, i, i2);
    }

    public rnq numberNode(Float f) {
        return f == null ? nullNode() : qx9.W(f.floatValue());
    }

    public rnq numberNode(Integer num) {
        return num == null ? nullNode() : hcd.W(num.intValue());
    }

    public rnq numberNode(Long l) {
        if (l == null) {
            return nullNode();
        }
        return zre.W(l.longValue());
    }

    public rnq numberNode(Short sh) {
        return sh == null ? nullNode() : qam.W(sh.shortValue());
    }

    public rnq numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return nullNode();
        }
        if (this._cfgBigDecimalExact) {
            return vr5.W(bigDecimal);
        }
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0 ? vr5.f37151b : vr5.W(atd.a(bigDecimal));
    }

    public rnq numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return nullNode();
        }
        return vi2.W(bigInteger);
    }

    public u2h numberNode(byte b2) {
        return hcd.W(b2);
    }

    public u2h numberNode(short s) {
        return qam.W(s);
    }

    public u2h numberNode(int i) {
        return hcd.W(i);
    }

    public u2h numberNode(long j) {
        return zre.W(j);
    }

    public u2h numberNode(float f) {
        return qx9.W(f);
    }

    public u2h numberNode(double d) {
        return w27.W(d);
    }
}
