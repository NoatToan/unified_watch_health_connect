package t23;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.gms.common.internal.ImagesContract;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f162029a = new l1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q13.c f162030b;

    public static final class a extends m1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f162031c = new a();

        private a() {
            super("inherited", false);
        }
    }

    public static final class b extends m1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f162032c = new b();

        private b() {
            super("internal", false);
        }
    }

    public static final class c extends m1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f162033c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends m1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f162034c = new d();

        private d() {
            super(ImagesContract.LOCAL, false);
        }
    }

    public static final class e extends m1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f162035c = new e();

        private e() {
            super("private", false);
        }
    }

    public static final class f extends m1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f162036c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // t23.m1
        public final String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends m1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f162037c = new g();

        private g() {
            super("protected", true);
        }
    }

    public static final class h extends m1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f162038c = new h();

        private h() {
            super("public", true);
        }
    }

    public static final class i extends m1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f162039c = new i();

        private i() {
            super(PrivacyUpdateRequestError.UNKNOWN, false);
        }
    }

    static {
        q13.c cVar = new q13.c();
        cVar.put(f.f162036c, 0);
        cVar.put(e.f162035c, 0);
        cVar.put(b.f162032c, 1);
        cVar.put(g.f162037c, 1);
        cVar.put(h.f162038c, 2);
        f162030b = cVar.b();
    }

    private l1() {
    }
}
