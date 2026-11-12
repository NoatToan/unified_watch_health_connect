package au0;

import am.x0;
import android.content.res.Resources;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau0/h0;", "", "<init>", "()V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12930a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau0/h0$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: au0.h0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0183a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12931a;

            static {
                int[] iArr = new int[c22.l.values().length];
                try {
                    iArr[c22.l.LIGHT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c22.l.DARK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c22.l.SYSTEM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f12931a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static x0 a(String str) {
            Object next;
            w13.c cVar = x0.H3;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((x0) next).f4358a, str)) {
                    return (x0) next;
                }
            }
            next = null;
            return (x0) next;
        }

        public static boolean b(c22.l lVar, Resources resources) {
            lVar.getClass();
            int i14 = C0183a.f12931a[lVar.ordinal()];
            if (i14 == 1) {
                return false;
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    u0.r();
                    return false;
                }
                if ((resources.getConfiguration().uiMode & 48) != 32) {
                    return false;
                }
            }
            return true;
        }

        private a() {
        }
    }
}
