package wn;

import android.content.Context;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwn/b;", "", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f186094a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwn/b$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: wn.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3463a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f186095a;

            static {
                int[] iArr = new int[un.b.values().length];
                try {
                    iArr[un.b.HEART_RATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[un.b.RESPIRATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[un.b.PULSE_OX.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[un.b.STRESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f186095a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static wn.a a(Context context, un.b bVar) {
            bVar.getClass();
            int i14 = C3463a.f186095a[bVar.ordinal()];
            if (i14 == 1) {
                return new d(context);
            }
            if (i14 == 2) {
                return new f(context);
            }
            if (i14 == 3) {
                return new e(context);
            }
            if (i14 == 4) {
                return new h(context);
            }
            u0.r();
            return null;
        }

        private a() {
        }
    }
}
