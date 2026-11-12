package uk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d53.w;
import p005kotlin.Metadata;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luk0/r;", "", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f171870a = new r();

    private r() {
    }

    public static String a(Context context, String str, String str2, String str3) {
        context.getClass();
        str2.getClass();
        if (str != null) {
            if (w.J(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        i.f171830a.getClass();
        return i.c(context, str2, str3);
    }

    public static String b(String str, String str2, String str3, p3.m mVar) {
        str2.getClass();
        x1 x1Var = p3.n.f135158a;
        return a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b), str, str2, str3);
    }

    public static String c(String str, String str2, String str3, p3.m mVar) {
        str2.getClass();
        x1 x1Var = p3.n.f135158a;
        if (str == null || w.J(str)) {
            str = null;
        }
        if (str == null) {
            mVar.C(-1983054524);
            mVar.f();
            return null;
        }
        mVar.C(-1983128614);
        i.f171830a.getClass();
        String strC = i.c((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b), str2, str3);
        mVar.f();
        return strC;
    }
}
