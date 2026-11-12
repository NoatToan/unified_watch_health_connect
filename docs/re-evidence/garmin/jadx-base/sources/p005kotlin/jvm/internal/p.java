package p005kotlin.jvm.internal;

import k23.c;
import k23.g;

/* JADX INFO: loaded from: classes3.dex */
public class p extends e implements o, g {
    private final int arity;

    public p(int i14, Object obj, Class cls, String str, String str2, int i15) {
        super(obj, cls, str, str2, (i15 & 1) == 1);
        this.arity = i14;
    }

    @Override // p005kotlin.jvm.internal.e
    public c computeReflected() {
        return s0.f105811a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return getF122483i().equals(pVar.getF122483i()) && getSignature().equals(pVar.getSignature()) && s.g(getBoundReceiver(), pVar.getBoundReceiver()) && s.g(getOwner(), pVar.getOwner());
        }
        if (obj instanceof g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.o
    public int getArity() {
        return this.arity;
    }

    @Override // p005kotlin.jvm.internal.e
    public g getReflected() {
        return (g) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getF122483i().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // k23.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // k23.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // k23.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // k23.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p005kotlin.jvm.internal.e, k23.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getF122483i())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getF122483i() + " (Kotlin reflection is not available)";
    }

    public p(int i14, Object obj) {
        this(i14, obj, null, null, null, 0);
    }

    public p(int i14) {
        this(i14, e.NO_RECEIVER, null, null, null, 0);
    }
}
