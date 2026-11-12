package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import defpackage.bir;
import defpackage.z3b;
import defpackage.z83;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1898b;
    public boolean c;
    public final ConstraintWidget d;
    public final Type e;
    public ConstraintAnchor f;
    public SolverVariable i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<ConstraintAnchor> f1897a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1899a;

        static {
            int[] iArr = new int[Type.values().length];
            f1899a = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1899a[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1899a[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1899a[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1899a[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1899a[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1899a[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1899a[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1899a[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.d = constraintWidget;
        this.e = type;
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i) {
        return b(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            q();
            return true;
        }
        if (!z && !p(constraintAnchor)) {
            return false;
        }
        this.f = constraintAnchor;
        if (constraintAnchor.f1897a == null) {
            constraintAnchor.f1897a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f.f1897a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public void c(int i, ArrayList<bir> arrayList, bir birVar) {
        HashSet<ConstraintAnchor> hashSet = this.f1897a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                z3b.a(it.next().d, i, arrayList, birVar);
            }
        }
    }

    public HashSet<ConstraintAnchor> d() {
        return this.f1897a;
    }

    public int e() {
        if (this.c) {
            return this.f1898b;
        }
        return 0;
    }

    public int f() {
        ConstraintAnchor constraintAnchor;
        if (this.d.X() == 8) {
            return 0;
        }
        return (this.h == Integer.MIN_VALUE || (constraintAnchor = this.f) == null || constraintAnchor.d.X() != 8) ? this.g : this.h;
    }

    public final ConstraintAnchor g() {
        switch (a.f1899a[this.e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.d.S;
            case 3:
                return this.d.Q;
            case 4:
                return this.d.T;
            case 5:
                return this.d.R;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public ConstraintWidget h() {
        return this.d;
    }

    public SolverVariable i() {
        return this.i;
    }

    public ConstraintAnchor j() {
        return this.f;
    }

    public Type k() {
        return this.e;
    }

    public boolean l() {
        HashSet<ConstraintAnchor> hashSet = this.f1897a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<ConstraintAnchor> hashSet = this.f1897a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f != null;
    }

    public boolean p(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type typeK = constraintAnchor.k();
        Type type = this.e;
        if (typeK == type) {
            return type != Type.BASELINE || (constraintAnchor.h().b0() && h().b0());
        }
        switch (a.f1899a[type.ordinal()]) {
            case 1:
                return (typeK == Type.BASELINE || typeK == Type.CENTER_X || typeK == Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = typeK == Type.LEFT || typeK == Type.RIGHT;
                if (constraintAnchor.h() instanceof f) {
                    return z || typeK == Type.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = typeK == Type.TOP || typeK == Type.BOTTOM;
                if (constraintAnchor.h() instanceof f) {
                    return z2 || typeK == Type.CENTER_Y;
                }
                return z2;
            case 6:
                return (typeK == Type.LEFT || typeK == Type.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public void q() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f1897a) != null) {
            hashSet.remove(this);
            if (this.f.f1897a.size() == 0) {
                this.f.f1897a = null;
            }
        }
        this.f1897a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.f1898b = 0;
    }

    public void r() {
        this.c = false;
        this.f1898b = 0;
    }

    public void s(z83 z83Var) {
        SolverVariable solverVariable = this.i;
        if (solverVariable == null) {
            this.i = new SolverVariable(SolverVariable.Type.UNRESTRICTED, null);
        } else {
            solverVariable.e();
        }
    }

    public void t(int i) {
        this.f1898b = i;
        this.c = true;
    }

    public String toString() {
        return this.d.v() + ":" + this.e.toString();
    }

    public void u(int i) {
        if (o()) {
            this.h = i;
        }
    }
}
