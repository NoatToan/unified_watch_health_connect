package i31;

import java.util.ArrayList;
import java.util.Set;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li31/v;", "", "Lh31/b;", "onboardingDelegate", "<init>", "(Lh31/b;)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h31.b f90765a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90766a;

        static {
            int[] iArr = new int[d31.d.values().length];
            try {
                iArr[d31.d.ECG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d31.d.VO2MAX_TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90766a = iArr;
        }
    }

    public v(h31.b bVar) {
        bVar.getClass();
        this.f90765a = bVar;
    }

    public final Set<d31.d> a(Set<Long> set) {
        set.getClass();
        ArrayList arrayListY0 = h0.y0(d31.d.f57356e1, d31.d.UNKNOWN);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListY0) {
            int i14 = a.f90766a[((d31.d) obj).ordinal()];
            h31.b bVar = this.f90765a;
            boolean zA = true;
            if (i14 == 1) {
                bVar.b();
            } else if (i14 == 2) {
                zA = bVar.a();
            }
            if (zA) {
                arrayList.add(obj);
            }
        }
        return h0.g1(arrayList);
    }
}
