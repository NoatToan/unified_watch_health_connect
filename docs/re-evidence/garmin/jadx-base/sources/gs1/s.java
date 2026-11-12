package gs1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lgs1/s;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "h", "c", "a", "f", IntegerTokenConverter.CONVERTER_KEY, "d", "b", "g", "j", JWKParameterNames.RSA_EXPONENT, "Lgs1/s$a;", "Lgs1/s$b;", "Lgs1/s$c;", "Lgs1/s$d;", "Lgs1/s$f;", "Lgs1/s$g;", "Lgs1/s$h;", "Lgs1/s$i;", "Lgs1/s$j;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f78860b = new e(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78861a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$a;", "Lgs1/s;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f78862c = new a();

        private a() {
            super("BALANCED", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$b;", "Lgs1/s;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f78863c = new b();

        private b() {
            super("BALANCED_AWAKE", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$c;", "Lgs1/s;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f78864c = new c();

        private c() {
            super("CALM", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$d;", "Lgs1/s;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f78865c = new d();

        private d() {
            super("CALM_AWAKE", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$f;", "Lgs1/s;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f78866c = new f();

        private f() {
            super("STRESSFUL", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$g;", "Lgs1/s;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f78867c = new g();

        private g() {
            super("STRESSFUL_AWAKE", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$h;", "Lgs1/s;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f78868c = new h();

        private h() {
            super("UNKNOWN", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$i;", "Lgs1/s;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f78869c = new i();

        private i() {
            super("VERY_STRESSFUL", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$j;", "Lgs1/s;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f78870c = new j();

        private j() {
            super("VERY_STRESSFUL_AWAKE", null);
        }
    }

    private s(String str) {
        this.f78861a = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/s$e;", "", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e {
        public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private e() {
        }
    }

    public /* synthetic */ s(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
