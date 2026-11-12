package kj0;

import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.GarminPayInitializer;
import e23.l;
import java.util.concurrent.atomic.AtomicReference;
import kg.f;
import lc.u0;
import o13.h;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import vr2.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lkj0/c;", "", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f104941a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f104942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static y0 f104943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kj0.d f104944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference<e> f104945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f104946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReference<kj0.a> f104947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicReference<Boolean> f104948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicReference<Boolean> f104949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicReference<q> f104950j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkj0/c$a;", "", "", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        ON_USER_SIGN_IN("onUserSignedIn"),
        ON_CREATE_MAIN_APP("onCreateMainApplication"),
        ON_RE_INIT("onReInit");

        a(String str) {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkj0/c$b;", "Lkj0/d;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements kj0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f104955a;

        public b(Throwable th3) {
            th3.getClass();
            this.f104955a = th3;
        }

        @Override // kj0.d
        public final void initialize(Context context, boolean z14, boolean z15) {
            c.f104942b.error("GarminPay feature cannot get initialized", this.f104955a);
        }

        @Override // kj0.d
        public final void signOut(Context context) {
            context.getClass();
            c.f104942b.error("GarminPay feature cannot get initialized", this.f104955a);
        }
    }

    /* JADX INFO: renamed from: kj0.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C2019c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104956a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ON_CREATE_MAIN_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ON_RE_INIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ON_USER_SIGN_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104956a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f104957a;

        public d(l lVar) {
            lVar.getClass();
            this.f104957a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f104957a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104957a.invoke(obj);
        }
    }

    static {
        kj0.d bVar;
        int i14 = gt2.c.f79010a;
        f104942b = gt2.b.f79005a.h("PAY#FeatureUtils");
        try {
            GarminPayInitializer.Companion companion = GarminPayInitializer.INSTANCE;
            Object objNewInstance = GarminPayInitializer.class.newInstance();
            objNewInstance.getClass();
            bVar = (kj0.d) objNewInstance;
        } catch (Throwable th3) {
            bVar = new b(th3);
        }
        f104944d = bVar;
        f104945e = new AtomicReference<>(e.NOT_STARTED);
        f104947g = new AtomicReference<>(null);
        Boolean bool = Boolean.FALSE;
        f104948h = new AtomicReference<>(bool);
        f104949i = new AtomicReference<>(bool);
        f104950j = new AtomicReference<>(null);
    }

    private c() {
    }

    public static String a() {
        return f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.mobile_auth_msg_sign_in_attempt_failed);
    }

    public static String b() {
        return f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.golf_lbl_setup_error);
    }

    public static void c(Context context, boolean z14, a aVar) {
        aVar.getClass();
        f104945e.set(e.IN_PROGRESS);
        Logger logger = f104942b;
        logger.debug("initGarminPayFeature: status set to IN_PROGRESS");
        if (f104943c == null) {
            ab2.b.f2642a.getClass();
            y0 y0VarA = ab2.b.a();
            f104943c = y0VarA;
            y0VarA.getClass();
            y0VarA.g(new d(new kb0.d(20)));
        }
        logger.debug("initGarminPayFeature: invoke initializer.initialize()");
        int i14 = C2019c.f104956a[aVar.ordinal()];
        if (i14 == 1) {
            new Handler().postDelayed(new a0.a(context, z14, 11), 1000L);
        } else if (i14 == 2 || i14 == 3) {
            f104944d.initialize(context, z14, true);
        } else {
            u0.r();
        }
    }
}
