package com.garmin.android.library.livetrack;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/library/livetrack/j;", "", "", "hostName", "<init>", "(Ljava/lang/String;)V", "a", "b", "Lcom/garmin/android/library/livetrack/j$b;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50230a;

    static {
        new a(null);
    }

    private j(String str) {
        this.f50230a = str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/livetrack/j$a;", "", "<init>", "()V", "", "PROTOCOL", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/library/livetrack/j$b;", "Lcom/garmin/android/library/livetrack/j;", "", "hostName", "<init>", "(Ljava/lang/String;)V", "c", "b", "a", "Lcom/garmin/android/library/livetrack/j$b$a;", "Lcom/garmin/android/library/livetrack/j$b$b;", "Lcom/garmin/android/library/livetrack/j$b$c;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b extends j {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/livetrack/j$b$a;", "Lcom/garmin/android/library/livetrack/j$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f50231b = new a();

            private a() {
                super("api.gcs.garmin.cn", null);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.library.livetrack.j$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/livetrack/j$b$b;", "Lcom/garmin/android/library/livetrack/j$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0999b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0999b f50232b = new C0999b();

            private C0999b() {
                super("api.gcs.garmin.com", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/livetrack/j$b$c;", "Lcom/garmin/android/library/livetrack/j$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f50233b = new c();

            private c() {
                super("api.gcs.test.garmin.com", null);
            }
        }

        private b(String str) {
            super(str, null);
        }

        public /* synthetic */ b(String str, p005kotlin.jvm.internal.j jVar) {
            this(str);
        }
    }

    public /* synthetic */ j(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
