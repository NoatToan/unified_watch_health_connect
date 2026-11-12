package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeCreator;
import com.fasterxml.jackson.databind.node.NumericNode;
import com.fasterxml.jackson.databind.node.ValueNode;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class aes implements Serializable, JsonNodeCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aes f339a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final aes f340c;
    public static final aes e;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f341b;

    static {
        aes aesVar = new aes(false);
        f339a = aesVar;
        f340c = new aes(true);
        e = aesVar;
    }

    public aes(boolean z) {
        this.f341b = z;
    }

    protected aes() {
        this(false);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public aef booleanNode(boolean z) {
        return z ? aef.d() : aef.c();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public aer nullNode() {
        return aer.b();
    }

    public JsonNode a() {
        return aeq.b();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public NumericNode numberNode(byte b2) {
        return aem.a(b2);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Byte b2) {
        return b2 == null ? nullNode() : aem.a(b2.intValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public NumericNode numberNode(short s) {
        return aev.a(s);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Short sh) {
        return sh == null ? nullNode() : aev.a(sh.shortValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumericNode numberNode(int i) {
        return aem.a(i);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Integer num) {
        return num == null ? nullNode() : aem.a(num.intValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumericNode numberNode(long j) {
        return aeo.d(j);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Long l) {
        if (l == null) {
            return nullNode();
        }
        return aeo.d(l.longValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return nullNode();
        }
        return aei.c(bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public NumericNode numberNode(float f) {
        return aen.e(f);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Float f) {
        return f == null ? nullNode() : aen.e(f.floatValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public NumericNode numberNode(double d) {
        return ael.d(d);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Double d) {
        return d == null ? nullNode() : ael.d(d.doubleValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return nullNode();
        }
        if (this.f341b) {
            return aeh.d(bigDecimal);
        }
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0 ? aeh.f325c : aeh.d(aej.a(bigDecimal));
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public aex textNode(String str) {
        return aex.c(str);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public aee binaryNode(byte[] bArr) {
        return aee.a(bArr);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public aee binaryNode(byte[] bArr, int i, int i2) {
        return aee.b(bArr, i, i2);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public aeg arrayNode() {
        return new aeg(this);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public aeg arrayNode(int i) {
        return new aeg(this, i);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public aeu objectNode() {
        return new aeu(this);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode pojoNode(Object obj) {
        return new aew(obj);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode rawValueNode(aid aidVar) {
        return new aew(aidVar);
    }
}
