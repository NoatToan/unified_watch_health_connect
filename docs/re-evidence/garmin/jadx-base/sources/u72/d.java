package u72;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lu72/d;", "", "", "route", "<init>", "(Ljava/lang/String;)V", "a", "b", "c", "Lu72/d$a;", "Lu72/d$b;", "Lu72/d$c;", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169453a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu72/d$a;", "Lu72/d;", "<init>", "()V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f169454b = new a();

        private a() {
            super("SCREEN_1_ROUTE", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1100407739;
        }

        public final String toString() {
            return "Screen1";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu72/d$b;", "Lu72/d;", "<init>", "()V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f169455b = new b();

        private b() {
            super("SCREEN_2_ROUTE", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1100407738;
        }

        public final String toString() {
            return "Screen2";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu72/d$c;", "Lu72/d;", "<init>", "()V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f169456b = new c();

        private c() {
            super("SCREEN_3_ROUTE", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1100407737;
        }

        public final String toString() {
            return "Screen3";
        }
    }

    private d(String str) {
        this.f169453a = str;
    }

    public /* synthetic */ d(String str, j jVar) {
        this(str);
    }
}
