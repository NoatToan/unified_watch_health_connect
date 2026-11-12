package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.RtlMode;

/* JADX INFO: loaded from: classes6.dex */
public class fm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s7d f17908a;

    public fm1(s7d s7dVar) {
        this.f17908a = s7dVar;
    }

    public final AnimationType a(int i) {
        switch (i) {
            case 0:
                return AnimationType.NONE;
            case 1:
                return AnimationType.COLOR;
            case 2:
                return AnimationType.SCALE;
            case 3:
                return AnimationType.WORM;
            case 4:
                return AnimationType.SLIDE;
            case 5:
                return AnimationType.FILL;
            case 6:
                return AnimationType.THIN_WORM;
            case 7:
                return AnimationType.DROP;
            case 8:
                return AnimationType.SWAP;
            case 9:
                return AnimationType.SCALE_DOWN;
            default:
                return AnimationType.NONE;
        }
    }

    public final RtlMode b(int i) {
        if (i == 0) {
            return RtlMode.On;
        }
        if (i != 1) {
            return i != 2 ? RtlMode.Auto : RtlMode.Auto;
        }
        return RtlMode.Off;
    }

    public void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.b3, 0, 0);
        f(typedArrayObtainStyledAttributes);
        e(typedArrayObtainStyledAttributes);
        d(typedArrayObtainStyledAttributes);
        g(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d(TypedArray typedArray) {
        boolean z = typedArray.getBoolean(b5j.j3, false);
        long j = typedArray.getInt(b5j.c3, 350);
        if (j < 0) {
            j = 0;
        }
        AnimationType animationTypeA = a(typedArray.getInt(b5j.d3, AnimationType.NONE.ordinal()));
        RtlMode rtlModeB = b(typedArray.getInt(b5j.n3, RtlMode.Off.ordinal()));
        boolean z2 = typedArray.getBoolean(b5j.h3, false);
        long j2 = typedArray.getInt(b5j.i3, 3000);
        this.f17908a.y(j);
        this.f17908a.H(z);
        this.f17908a.z(animationTypeA);
        this.f17908a.Q(rtlModeB);
        this.f17908a.D(z2);
        this.f17908a.G(j2);
    }

    public final void e(TypedArray typedArray) {
        int color = typedArray.getColor(b5j.s3, Color.parseColor("#33ffffff"));
        int color2 = typedArray.getColor(b5j.q3, Color.parseColor("#ffffff"));
        this.f17908a.W(color);
        this.f17908a.S(color2);
    }

    public final void f(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(b5j.t3, -1);
        boolean z = typedArray.getBoolean(b5j.e3, true);
        int i = 0;
        boolean z2 = typedArray.getBoolean(b5j.g3, false);
        int i2 = typedArray.getInt(b5j.f3, -1);
        if (i2 == -1) {
            i2 = 3;
        }
        int i3 = typedArray.getInt(b5j.p3, 0);
        if (i3 >= 0 && (i2 <= 0 || i3 <= (i = i2 - 1))) {
            i = i3;
        }
        this.f17908a.X(resourceId);
        this.f17908a.A(z);
        this.f17908a.C(z2);
        this.f17908a.B(i2);
        this.f17908a.T(i);
        this.f17908a.U(i);
        this.f17908a.I(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[PHI: r5
      0x0043: PHI (r5v6 float) = (r5v1 float), (r5v2 float) binds: [B:13:0x0041, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    public final void g(TypedArray typedArray) {
        int i = b5j.k3;
        Orientation orientation = Orientation.HORIZONTAL;
        if (typedArray.getInt(i, orientation.ordinal()) != 0) {
            orientation = Orientation.VERTICAL;
        }
        int dimension = (int) typedArray.getDimension(b5j.m3, ez5.a(6));
        if (dimension < 0) {
            dimension = 0;
        }
        int dimension2 = (int) typedArray.getDimension(b5j.l3, ez5.a(8));
        if (dimension2 < 0) {
            dimension2 = 0;
        }
        float f = typedArray.getFloat(b5j.o3, 0.7f);
        float f2 = 0.3f;
        if (f < 0.3f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
                f = f2;
            }
        }
        int dimension3 = (int) typedArray.getDimension(b5j.r3, ez5.a(1));
        if (dimension3 > dimension) {
            dimension3 = dimension;
        }
        int i2 = this.f17908a.b() == AnimationType.FILL ? dimension3 : 0;
        this.f17908a.P(dimension);
        this.f17908a.J(orientation);
        this.f17908a.K(dimension2);
        this.f17908a.R(f);
        this.f17908a.V(i2);
    }
}
