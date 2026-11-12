package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.generic.RoundingParams;

/* JADX INFO: loaded from: classes4.dex */
public class bya {
    public static Drawable a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    public static RoundingParams b(aya ayaVar) {
        if (ayaVar.s() == null) {
            ayaVar.J(new RoundingParams());
        }
        return ayaVar.s();
    }

    public static rbl.b c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return rbl.b.f32389a;
            case 1:
                return rbl.b.f32390b;
            case 2:
                return rbl.b.c;
            case 3:
                return rbl.b.d;
            case 4:
                return rbl.b.e;
            case 5:
                return rbl.b.f;
            case 6:
                return rbl.b.g;
            case 7:
                return rbl.b.h;
            case 8:
                return rbl.b.i;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static aya d(Context context, AttributeSet attributeSet) throws Throwable {
        if (epa.d()) {
            epa.a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        aya ayaVarE = e(new aya(context.getResources()), context, attributeSet);
        if (epa.d()) {
            epa.b();
        }
        return ayaVarE;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[PHI: r1 r2 r3
      0x01c6: PHI (r1v18 boolean) = (r1v14 boolean), (r1v20 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r2v13 boolean) = (r2v10 boolean), (r2v15 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    public static aya e(aya ayaVar, Context context, AttributeSet attributeSet) throws Throwable {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, x3j.f38649a);
            try {
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                int integer = 0;
                int i3 = 0;
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                int dimensionPixelSize = 0;
                while (i3 < indexCount) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i3);
                        if (index == x3j.f38650b) {
                            ayaVar.v(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.h) {
                            ayaVar.C(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.j) {
                            ayaVar.E(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.l) {
                            ayaVar.F(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.d) {
                            ayaVar.y(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == x3j.D) {
                            ayaVar.x(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                        } else if (index == x3j.i) {
                            ayaVar.D(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.n) {
                            ayaVar.H(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.o) {
                            ayaVar.I(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.e) {
                            ayaVar.z(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.f) {
                            ayaVar.A(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.m) {
                            ayaVar.G(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.f38651k) {
                            integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                        } else if (index == x3j.c) {
                            ayaVar.w(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.g) {
                            ayaVar.B(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == x3j.p) {
                            b(ayaVar).s(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        } else if (index == x3j.z) {
                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                        } else {
                            int i4 = dimensionPixelSize;
                            if (index == x3j.v) {
                                z6 = typedArrayObtainStyledAttributes.getBoolean(index, z6);
                            } else if (index == x3j.w) {
                                z8 = typedArrayObtainStyledAttributes.getBoolean(index, z8);
                            } else if (index == x3j.f38652r) {
                                z12 = typedArrayObtainStyledAttributes.getBoolean(index, z12);
                            } else if (index == x3j.s) {
                                z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                            } else if (index == x3j.x) {
                                z7 = typedArrayObtainStyledAttributes.getBoolean(index, z7);
                            } else if (index == x3j.u) {
                                z9 = typedArrayObtainStyledAttributes.getBoolean(index, z9);
                            } else if (index == x3j.t) {
                                z13 = typedArrayObtainStyledAttributes.getBoolean(index, z13);
                            } else {
                                if (index == x3j.q) {
                                    z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                                } else if (index == x3j.y) {
                                    dimensionPixelSize = i4;
                                    b(ayaVar).q(typedArrayObtainStyledAttributes.getColor(index, 0));
                                } else {
                                    dimensionPixelSize = i4;
                                    if (index == x3j.C) {
                                        b(ayaVar).n(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    } else if (index == x3j.A) {
                                        b(ayaVar).m(typedArrayObtainStyledAttributes.getColor(index, 0));
                                    } else if (index == x3j.B) {
                                        b(ayaVar).r(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    }
                                }
                                i3++;
                                context2 = context;
                            }
                            dimensionPixelSize = i4;
                        }
                        i3++;
                        context2 = context;
                    } catch (Throwable th) {
                        th = th;
                        typedArrayObtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                boolean z14 = false;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z5 = z6 && z9;
                    z = z8 && z7;
                    z2 = z10 && z13;
                    if (z12 && z11) {
                        z14 = true;
                    }
                } else {
                    z5 = z6 && z7;
                    z = z8 && z9;
                    z2 = z10 && z11;
                    if (z12 && z13) {
                        z14 = true;
                    }
                }
                z4 = z14;
                i = integer;
                z3 = z5;
                i2 = dimensionPixelSize;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            z = true;
            i = 0;
            z2 = true;
            z3 = true;
            z4 = true;
            i2 = 0;
        }
        if (ayaVar.n() != null && i > 0) {
            ayaVar.F(new vr1(ayaVar.n(), i));
        }
        if (i2 > 0) {
            b(ayaVar).o(z3 ? i2 : 0.0f, z ? i2 : 0.0f, z2 ? i2 : 0.0f, z4 ? i2 : 0.0f);
        }
        return ayaVar;
    }
}
