package com.facebook.yoga;

import defpackage.i0s;
import defpackage.l0s;
import defpackage.o0s;
import defpackage.v07;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@v07
public abstract class YogaNodeJNIBase extends l0s implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public YogaNodeJNIBase f7611a;

    @v07
    private float[] arr;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<YogaNodeJNIBase> f7612b;
    public YogaMeasureFunction c;
    public YogaBaselineFunction d;
    public long e;
    public Object f;
    public boolean g;

    @v07
    private int mLayoutDirection;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7613a;

        static {
            int[] iArr = new int[YogaEdge.values().length];
            f7613a = iArr;
            try {
                iArr[YogaEdge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7613a[YogaEdge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7613a[YogaEdge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7613a[YogaEdge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7613a[YogaEdge.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7613a[YogaEdge.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.g = true;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.e = j;
    }

    public static o0s p0(long j) {
        return new o0s(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    @v07
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.f7612b;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.f7612b.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.f7611a = this;
        return yogaNodeJNIBase.e;
    }

    @Override // defpackage.l0s
    public void A(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetBorder(this.e, yogaEdge.intValue(), f);
    }

    @Override // defpackage.l0s
    public void B(Object obj) {
        this.f = obj;
    }

    @Override // defpackage.l0s
    public void C(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirection(this.e, yogaDirection.intValue());
    }

    @Override // defpackage.l0s
    public void D(YogaDisplay yogaDisplay) {
        YogaNative.jni_YGNodeStyleSetDisplay(this.e, yogaDisplay.intValue());
    }

    @Override // defpackage.l0s
    public void F(float f) {
        YogaNative.jni_YGNodeStyleSetFlex(this.e, f);
    }

    @Override // defpackage.l0s
    public void G(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasis(this.e, f);
    }

    @Override // defpackage.l0s
    public void H() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAuto(this.e);
    }

    @Override // defpackage.l0s
    public void I(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercent(this.e, f);
    }

    @Override // defpackage.l0s
    public void J(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirection(this.e, yogaFlexDirection.intValue());
    }

    @Override // defpackage.l0s
    public void K(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrow(this.e, f);
    }

    @Override // defpackage.l0s
    public void L(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrink(this.e, f);
    }

    @Override // defpackage.l0s
    public void M(float f) {
        YogaNative.jni_YGNodeStyleSetHeight(this.e, f);
    }

    @Override // defpackage.l0s
    public void N() {
        YogaNative.jni_YGNodeStyleSetHeightAuto(this.e);
    }

    @Override // defpackage.l0s
    public void O(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercent(this.e, f);
    }

    @Override // defpackage.l0s
    public void Q(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContent(this.e, yogaJustify.intValue());
    }

    @Override // defpackage.l0s
    public void R(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMargin(this.e, yogaEdge.intValue(), f);
    }

    @Override // defpackage.l0s
    public void S(YogaEdge yogaEdge) {
        YogaNative.jni_YGNodeStyleSetMarginAuto(this.e, yogaEdge.intValue());
    }

    @Override // defpackage.l0s
    public void T(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercent(this.e, yogaEdge.intValue(), f);
    }

    @Override // defpackage.l0s
    public void U(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeight(this.e, f);
    }

    @Override // defpackage.l0s
    public void V(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercent(this.e, f);
    }

    @Override // defpackage.l0s
    public void W(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidth(this.e, f);
    }

    @Override // defpackage.l0s
    public void X(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercent(this.e, f);
    }

    @Override // defpackage.l0s
    public void Y(YogaMeasureFunction yogaMeasureFunction) {
        this.c = yogaMeasureFunction;
        YogaNative.jni_YGNodeSetHasMeasureFunc(this.e, yogaMeasureFunction != null);
    }

    @Override // defpackage.l0s
    public void Z(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeight(this.e, f);
    }

    @Override // defpackage.l0s
    public void a(l0s l0sVar, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) l0sVar;
        if (yogaNodeJNIBase.f7611a != null) {
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
        if (this.f7612b == null) {
            this.f7612b = new ArrayList(4);
        }
        this.f7612b.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.f7611a = this;
        YogaNative.jni_YGNodeInsertChild(this.e, yogaNodeJNIBase.e, i);
    }

    @Override // defpackage.l0s
    public void a0(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercent(this.e, f);
    }

    @Override // defpackage.l0s
    public void b(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i)).f7612b;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].e;
        }
        YogaNative.jni_YGNodeCalculateLayout(this.e, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // defpackage.l0s
    public void b0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidth(this.e, f);
    }

    @v07
    public final float baseline(float f, float f2) {
        return this.d.baseline(this, f, f2);
    }

    @Override // defpackage.l0s
    public void c0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercent(this.e, f);
    }

    @Override // defpackage.l0s
    public void d() {
        YogaNative.jni_YGNodeMarkDirty(this.e);
    }

    @Override // defpackage.l0s
    public void d0(YogaOverflow yogaOverflow) {
        YogaNative.jni_YGNodeStyleSetOverflow(this.e, yogaOverflow.intValue());
    }

    @Override // defpackage.l0s
    public o0s e() {
        return p0(YogaNative.jni_YGNodeStyleGetHeight(this.e));
    }

    @Override // defpackage.l0s
    public void e0(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPadding(this.e, yogaEdge.intValue(), f);
    }

    @Override // defpackage.l0s
    public YogaDirection f() {
        float[] fArr = this.arr;
        return YogaDirection.fromInt(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // defpackage.l0s
    public void f0(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercent(this.e, yogaEdge.intValue(), f);
    }

    @Override // defpackage.l0s
    public float g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // defpackage.l0s
    public void g0(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPosition(this.e, yogaEdge.intValue(), f);
    }

    @Override // defpackage.l0s
    public float h(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f = fArr[0];
        if ((((int) f) & 2) != 2) {
            return 0.0f;
        }
        int i = (((int) f) & 1) != 1 ? 4 : 0;
        int i2 = 10 - i;
        switch (a.f7613a[yogaEdge.ordinal()]) {
            case 1:
                return this.arr[i2];
            case 2:
                return this.arr[11 - i];
            case 3:
                return this.arr[12 - i];
            case 4:
                return this.arr[13 - i];
            case 5:
                return f() == YogaDirection.RTL ? this.arr[12 - i] : this.arr[i2];
            case 6:
                return f() == YogaDirection.RTL ? this.arr[i2] : this.arr[12 - i];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // defpackage.l0s
    public void h0(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercent(this.e, yogaEdge.intValue(), f);
    }

    @Override // defpackage.l0s
    public float i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // defpackage.l0s
    public void i0(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionType(this.e, yogaPositionType.intValue());
    }

    @Override // defpackage.l0s
    public float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // defpackage.l0s
    public void j0(float f) {
        YogaNative.jni_YGNodeStyleSetWidth(this.e, f);
    }

    @Override // defpackage.l0s
    public float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // defpackage.l0s
    public void k0() {
        YogaNative.jni_YGNodeStyleSetWidthAuto(this.e);
    }

    @Override // defpackage.l0s
    public o0s l(YogaEdge yogaEdge) {
        return p0(YogaNative.jni_YGNodeStyleGetPadding(this.e, yogaEdge.intValue()));
    }

    @Override // defpackage.l0s
    public void l0(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercent(this.e, f);
    }

    @Override // defpackage.l0s
    public void m0(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrap(this.e, yogaWrap.intValue());
    }

    @v07
    public final long measure(float f, int i, float f2, int i2) {
        if (r()) {
            return this.c.measure(this, f, YogaMeasureMode.fromInt(i), f2, YogaMeasureMode.fromInt(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // defpackage.l0s
    public o0s n() {
        return p0(YogaNative.jni_YGNodeStyleGetWidth(this.e));
    }

    @Override // defpackage.l0s
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase t(int i) {
        List<YogaNodeJNIBase> list = this.f7612b;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i);
        yogaNodeJNIBaseRemove.f7611a = null;
        YogaNative.jni_YGNodeRemoveChild(this.e, yogaNodeJNIBaseRemove.e);
        return yogaNodeJNIBaseRemove;
    }

    @Override // defpackage.l0s
    public boolean p() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return (((int) fArr[0]) & 16) == 16;
        }
        return this.g;
    }

    @Override // defpackage.l0s
    public boolean q() {
        return YogaNative.jni_YGNodeIsDirty(this.e);
    }

    @Override // defpackage.l0s
    public boolean r() {
        return this.c != null;
    }

    @Override // defpackage.l0s
    public void s() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.g = false;
    }

    @Override // defpackage.l0s
    public void u() {
        this.c = null;
        this.d = null;
        this.f = null;
        this.arr = null;
        this.g = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeReset(this.e);
    }

    @Override // defpackage.l0s
    public void v(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContent(this.e, yogaAlign.intValue());
    }

    @Override // defpackage.l0s
    public void w(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItems(this.e, yogaAlign.intValue());
    }

    @Override // defpackage.l0s
    public void x(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelf(this.e, yogaAlign.intValue());
    }

    @Override // defpackage.l0s
    public void y(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatio(this.e, f);
    }

    @Override // defpackage.l0s
    public void z(YogaBaselineFunction yogaBaselineFunction) {
        this.d = yogaBaselineFunction;
        YogaNative.jni_YGNodeSetHasBaselineFunc(this.e, yogaBaselineFunction != null);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNew());
    }

    public YogaNodeJNIBase(i0s i0sVar) {
        this(YogaNative.jni_YGNodeNewWithConfig(i0sVar.f20656a));
    }
}
