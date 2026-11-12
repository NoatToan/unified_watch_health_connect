package lv0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import d53.w;
import fw.p;
import gv0.y;
import lc.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115045a;

        static {
            int[] iArr = new int[ge2.b.values().length];
            try {
                iArr[ge2.b.OnlyMe.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ge2.b.Everyone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f115045a = iArr;
        }
    }

    public static final int a(ge2.b bVar) {
        bVar.getClass();
        int i14 = a.f115045a[bVar.ordinal()];
        if (i14 == 1) {
            return R.string.privacy_only_me;
        }
        if (i14 == 2) {
            return R.string.privacy_everyone;
        }
        u0.r();
        return 0;
    }

    public static final y b(pu0.b bVar, boolean z14) {
        bVar.getClass();
        boolean zIsEmpty = bVar.f141192j.isEmpty();
        boolean zIsEmpty2 = bVar.f141191i.isEmpty();
        if (z14 && !zIsEmpty) {
            return y.Both;
        }
        if (z14 && !zIsEmpty2) {
            return y.Sender;
        }
        if (zIsEmpty) {
            return null;
        }
        return y.Receiver;
    }

    public static final <T> boolean c(g3<? extends T> g3Var) {
        Integer num;
        String str;
        g3Var.getClass();
        return g3Var.f35300a == p.ERROR && (num = g3Var.f35304e) != null && num.intValue() == 403 && (str = g3Var.f35302c) != null && w.z(str, "ManagedChildAccountForbiddenException", false);
    }
}
