package qm;

import android.content.Context;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqm/k;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f145395a = new k();

    private k() {
    }

    public static l0 a(int i14) {
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        if (i14 == 17) {
            return new r();
        }
        if (i14 == 18) {
            return new i0();
        }
        if (i14 == 79) {
            return new e0();
        }
        if (i14 == 95) {
            return new l();
        }
        if (i14 == 90) {
            return new j0(zY);
        }
        if (i14 != 91) {
            return null;
        }
        return new k0();
    }

    public static tr.g b(int i14, Context context) {
        context.getClass();
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        if (i14 == 17) {
            return new tr.b(new l22.a(context));
        }
        if (i14 == 18) {
            return new tr.d(new l22.a(context));
        }
        if (i14 == 79) {
            return new tr.c(new l22.a(context));
        }
        if (i14 == 95) {
            return new tr.a(new l22.a(context));
        }
        if (i14 == 90) {
            return new tr.e(new l22.a(context), zY);
        }
        if (i14 != 91) {
            return null;
        }
        return new tr.f(new l22.a(context));
    }
}
