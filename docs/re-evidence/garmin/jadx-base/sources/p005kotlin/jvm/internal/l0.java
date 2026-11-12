package p005kotlin.jvm.internal;

import k23.c;
import k23.l;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 extends e implements l {
    private final boolean syntheticJavaProperty;

    public l0(Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, (i14 & 1) == 1);
        this.syntheticJavaProperty = (i14 & 2) == 2;
    }

    @Override // p005kotlin.jvm.internal.e
    public c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            return getOwner().equals(l0Var.getOwner()) && getName().equals(l0Var.getName()) && getSignature().equals(l0Var.getSignature()) && s.g(getBoundReceiver(), l0Var.getBoundReceiver());
        }
        if (obj instanceof l) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.e
    public l getReflected() {
        if (!this.syntheticJavaProperty) {
            return (l) super.getReflected();
        }
        e.w("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // k23.l
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // k23.l
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public l0(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public l0() {
        this.syntheticJavaProperty = false;
    }
}
