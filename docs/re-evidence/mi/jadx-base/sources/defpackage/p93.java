package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.xiaomi.fitness.common.utils.DisplayUtil;

/* JADX INFO: loaded from: classes7.dex */
public class p93 {
    public static o93 a(Context context, AttributeSet attributeSet) {
        o93 o93Var = new o93();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.w2);
        o93Var.f28879a = typedArrayObtainStyledAttributes.getColor(z4j.k3, context.getResources().getColor(gki.p));
        o93Var.f28880b = typedArrayObtainStyledAttributes.getColor(z4j.i3, context.getResources().getColor(gki.p));
        o93Var.c = typedArrayObtainStyledAttributes.getColor(z4j.p3, context.getResources().getColor(gki.s));
        o93Var.d = typedArrayObtainStyledAttributes.getColor(z4j.o3, context.getResources().getColor(gki.f19085b));
        o93Var.h = typedArrayObtainStyledAttributes.getColor(z4j.j3, context.getResources().getColor(gki.o));
        o93Var.i = typedArrayObtainStyledAttributes.getColor(z4j.e3, context.getResources().getColor(gki.m));
        o93Var.j = typedArrayObtainStyledAttributes.getDimension(z4j.l3, DisplayUtil.sp2px(context, 18.0f));
        o93Var.m = typedArrayObtainStyledAttributes.getDimension(z4j.f3, DisplayUtil.dp2px(context, 22.0f));
        o93Var.K = typedArrayObtainStyledAttributes.getBoolean(z4j.O2, true);
        o93Var.o = typedArrayObtainStyledAttributes.getBoolean(z4j.S2, true);
        o93Var.p = typedArrayObtainStyledAttributes.getDimension(z4j.d3, DisplayUtil.dp2px(context, 2.0f));
        o93Var.q = typedArrayObtainStyledAttributes.getDimension(z4j.b3, DisplayUtil.dp2px(context, 18.0f));
        o93Var.f28882r = typedArrayObtainStyledAttributes.getColor(z4j.a3, context.getResources().getColor(gki.l));
        o93Var.u = typedArrayObtainStyledAttributes.getColor(z4j.q3, context.getResources().getColor(gki.t));
        o93Var.v = typedArrayObtainStyledAttributes.getColor(z4j.n3, context.getResources().getColor(gki.common_transparent));
        o93Var.w = typedArrayObtainStyledAttributes.getDimension(z4j.N2, DisplayUtil.dp2px(context, 2.0f));
        o93Var.z = (int) typedArrayObtainStyledAttributes.getDimension(z4j.A2, DisplayUtil.dp2px(context, 300.0f));
        o93Var.A = typedArrayObtainStyledAttributes.getInt(z4j.F2, 240);
        o93Var.C = typedArrayObtainStyledAttributes.getBoolean(z4j.Q2, false);
        o93Var.B = typedArrayObtainStyledAttributes.getBoolean(z4j.T2, false);
        o93Var.D = typedArrayObtainStyledAttributes.getColor(z4j.I2, context.getResources().getColor(gki.g));
        o93Var.H = typedArrayObtainStyledAttributes.getColor(z4j.t3, context.getResources().getColor(gki.x));
        o93Var.I = typedArrayObtainStyledAttributes.getColor(z4j.y2, context.getResources().getColor(gki.common_transparent));
        o93Var.J = typedArrayObtainStyledAttributes.getColor(z4j.z2, context.getResources().getColor(gki.w));
        o93Var.x = typedArrayObtainStyledAttributes.getInt(z4j.H2, 300);
        o93Var.s = typedArrayObtainStyledAttributes.getInt(z4j.c3, 200);
        o93Var.y = typedArrayObtainStyledAttributes.getInt(z4j.C2, 101);
        o93Var.Q = typedArrayObtainStyledAttributes.getBoolean(z4j.g3, false);
        o93Var.G = typedArrayObtainStyledAttributes.getInt(z4j.K2, 400);
        o93Var.e = typedArrayObtainStyledAttributes.getColor(z4j.W2, context.getResources().getColor(gki.j));
        o93Var.g = typedArrayObtainStyledAttributes.getColor(z4j.V2, context.getResources().getColor(gki.i));
        o93Var.f = typedArrayObtainStyledAttributes.getColor(z4j.h3, context.getResources().getColor(gki.n));
        o93Var.f28881k = typedArrayObtainStyledAttributes.getDimension(z4j.X2, DisplayUtil.sp2px(context, 10.0f));
        o93Var.l = typedArrayObtainStyledAttributes.getDimension(z4j.U2, DisplayUtil.sp2px(context, 15.0f));
        o93Var.n = typedArrayObtainStyledAttributes.getBoolean(z4j.R2, false);
        o93Var.F = typedArrayObtainStyledAttributes.getDimension(z4j.J2, DisplayUtil.sp2px(context, 15.0f));
        o93Var.E = typedArrayObtainStyledAttributes.getDimension(z4j.L2, DisplayUtil.sp2px(context, 10.0f));
        o93Var.t = typedArrayObtainStyledAttributes.getColor(z4j.M2, context.getResources().getColor(gki.h));
        o93Var.N = typedArrayObtainStyledAttributes.getInt(z4j.x2, 90);
        o93Var.O = typedArrayObtainStyledAttributes.getInt(z4j.D2, 50);
        o93Var.T = typedArrayObtainStyledAttributes.getColor(z4j.r3, -7829368);
        o93Var.U = typedArrayObtainStyledAttributes.getDimension(z4j.s3, DisplayUtil.sp2px(context, 12.0f));
        o93Var.R = typedArrayObtainStyledAttributes.getDimension(z4j.Y2, DisplayUtil.sp2px(23.0f));
        o93Var.S = typedArrayObtainStyledAttributes.getDimension(z4j.Z2, DisplayUtil.sp2px(20.0f));
        String string = typedArrayObtainStyledAttributes.getString(z4j.m3);
        String string2 = typedArrayObtainStyledAttributes.getString(z4j.G2);
        o93Var.P = typedArrayObtainStyledAttributes.getString(z4j.E2);
        if (TextUtils.isEmpty(string)) {
            string = "1901-01-01";
        }
        o93Var.L = string;
        if (TextUtils.isEmpty(string2)) {
            string2 = "2099-12-31";
        }
        o93Var.M = string2;
        o93Var.V = typedArrayObtainStyledAttributes.getResourceId(z4j.B2, -1);
        typedArrayObtainStyledAttributes.recycle();
        return o93Var;
    }
}
