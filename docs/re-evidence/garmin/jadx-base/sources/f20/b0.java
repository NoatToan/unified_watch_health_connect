package f20;

import gg1.v0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lf20/b0;", "", "", "url", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b0 {
    PROD("https://www.garmin.com/sms?p=programKey&u=phoneUUID"),
    DEV("https://www.dev.garmin.com/sms?p=programKey&u=phoneUUID");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f68352b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68356a;

    b0(String str) {
        this.f68356a = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf20/b0$a;", "", "<init>", "()V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: f20.b0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1416a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f68357a;

            static {
                int[] iArr = new int[v0.values().length];
                try {
                    iArr[v0.ProdServerEnvironment.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v0.ChinaServerEnvironment.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f68357a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
