package l90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ll90/i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum i {
    LEGACY_DEVICE_SETUP,
    LEGACY_DEVICE_WIZARD_SETUP,
    GOLF_APP_DEVICE_SETUP,
    DIVE_APP_DEVICE_SETUP;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f111561a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll90/i$a;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: l90.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2134a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f111567a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.GOLF.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.DIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f111567a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static i a(String str, j jVar) {
            int i14 = jVar == null ? -1 : C2134a.f111567a[jVar.ordinal()];
            if (i14 == 1) {
                return i.GOLF_APP_DEVICE_SETUP;
            }
            if (i14 == 2) {
                return i.DIVE_APP_DEVICE_SETUP;
            }
            if (x80.d.b(str)) {
                return i.LEGACY_DEVICE_WIZARD_SETUP;
            }
            if (x80.d.a(str)) {
                return i.LEGACY_DEVICE_SETUP;
            }
            return null;
        }

        private a() {
        }
    }
}
