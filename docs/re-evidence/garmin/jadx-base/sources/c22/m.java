package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/m;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23141a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23141a = iArr;
        }
    }

    static {
        new m();
    }

    private m() {
    }

    public static final void a(l lVar) {
        lVar.getClass();
        int i14 = a.f23141a[lVar.ordinal()];
        if (i14 == 1) {
            i.e.y(1);
            return;
        }
        if (i14 == 2) {
            i.e.y(2);
        } else if (i14 == 3) {
            i.e.y(-1);
        } else {
            lc.u0.r();
        }
    }
}
