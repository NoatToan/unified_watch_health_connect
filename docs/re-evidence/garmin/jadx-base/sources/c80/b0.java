package c80;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lc80/b0;", "", "Lc80/s0;", FirebaseAnalytics.Param.LOCATION, "<init>", "(Lc80/s0;)V", "b", "a", "Lc80/b0$b;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25300a = new a(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc80/b0$b;", "Lc80/b0;", "", "titleText", "bodyText", "confirmButtonText", "dismissButtonText", "Lc80/s0;", FirebaseAnalytics.Param.LOCATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc80/s0;)V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f25303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f25304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f25305e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4, s0 s0Var) {
            super(s0Var, null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            s0Var.getClass();
            this.f25302b = str;
            this.f25303c = str2;
            this.f25304d = str3;
            this.f25305e = str4;
        }
    }

    public /* synthetic */ b0(s0 s0Var, p005kotlin.jvm.internal.j jVar) {
        this(s0Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc80/b0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: c80.b0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0376a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25301a;

            static {
                int[] iArr = new int[p0.values().length];
                try {
                    iArr[p0.SYSTEM_ALERT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f25301a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private b0(s0 s0Var) {
    }
}
