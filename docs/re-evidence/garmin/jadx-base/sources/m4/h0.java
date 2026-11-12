package m4;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm4/h0;", "Lm4/g0;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum h0 implements g0 {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116481a;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f116481a = iArr;
        }
    }

    @Override // m4.g0
    public final boolean a() {
        int i14 = a.f116481a[ordinal()];
        if (i14 == 1 || i14 == 2) {
            return true;
        }
        if (i14 == 3 || i14 == 4) {
            return false;
        }
        u0.r();
        return false;
    }

    @Override // m4.g0
    public final boolean b() {
        int i14 = a.f116481a[ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            return true;
        }
        if (i14 == 4) {
            return false;
        }
        u0.r();
        return false;
    }
}
