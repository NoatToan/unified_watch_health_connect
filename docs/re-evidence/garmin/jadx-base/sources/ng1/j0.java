package ng1;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125951a;

        static {
            int[] iArr = new int[zb0.u0.values().length];
            f125951a = iArr;
            try {
                iArr[zb0.u0.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125951a[zb0.u0.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125951a[zb0.u0.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125951a[zb0.u0.f203842y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125951a[zb0.u0.f203824v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125951a[zb0.u0.f203848z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125951a[zb0.u0.f203836x.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f125951a[zb0.u0.U0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f125951a[zb0.u0.O0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static boolean a(String str) {
        zb0.u0 u0Var;
        if (TextUtils.isEmpty(str) || (u0Var = (zb0.u0) zb0.u0.f203782n6.get(str)) == null) {
            return false;
        }
        int i14 = a.f125951a[u0Var.ordinal()];
        return i14 == 8 || i14 == 9;
    }
}
