package oe;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface c extends oe.a {
    boolean a();

    a b();

    b getOrientation();

    C2494c getState();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Loe/c$a;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f131198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f131199c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f131200a;

        static {
            new C2493a(null);
            f131198b = new a("NONE");
            f131199c = new a("FULL");
        }

        private a(String str) {
            this.f131200a = str;
        }

        /* JADX INFO: renamed from: toString, reason: from getter */
        public final String getF131200a() {
            return this.f131200a;
        }

        /* JADX INFO: renamed from: oe.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Loe/c$a$a;", "", "<init>", "()V", "Loe/c$a;", "NONE", "Loe/c$a;", "FULL", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2493a {
            public /* synthetic */ C2493a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C2493a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Loe/c$b;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f131201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f131202c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f131203a;

        static {
            new a(null);
            f131201b = new b("VERTICAL");
            f131202c = new b("HORIZONTAL");
        }

        private b(String str) {
            this.f131203a = str;
        }

        /* JADX INFO: renamed from: toString, reason: from getter */
        public final String getF131203a() {
            return this.f131203a;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Loe/c$b$a;", "", "<init>", "()V", "Loe/c$b;", "VERTICAL", "Loe/c$b;", "HORIZONTAL", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX INFO: renamed from: oe.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Loe/c$c;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2494c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2494c f131204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2494c f131205c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f131206a;

        static {
            new a(null);
            f131204b = new C2494c("FLAT");
            f131205c = new C2494c("HALF_OPENED");
        }

        private C2494c(String str) {
            this.f131206a = str;
        }

        /* JADX INFO: renamed from: toString, reason: from getter */
        public final String getF131206a() {
            return this.f131206a;
        }

        /* JADX INFO: renamed from: oe.c$c$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Loe/c$c$a;", "", "<init>", "()V", "Loe/c$c;", "FLAT", "Loe/c$c;", "HALF_OPENED", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }
}
