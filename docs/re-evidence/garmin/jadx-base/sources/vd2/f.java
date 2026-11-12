package vd2;

import android.util.Size;
import lc.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177508a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Vivomove3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.Quartz.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.Jade.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f177508a = iArr;
        }
    }

    public static final Size a(e eVar) {
        eVar.getClass();
        int i14 = a.f177508a[eVar.ordinal()];
        if (i14 == 1) {
            return new Size(-1, 720);
        }
        if (i14 == 2 || i14 == 3) {
            return new Size(-1, 1080);
        }
        u0.r();
        return null;
    }
}
