package lk1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Llk1/e;", "", "", "route", "<init>", "(Ljava/lang/String;)V", "a", "b", "Llk1/e$a;", "Llk1/e$b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113145a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llk1/e$a;", "Llk1/e;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f113146b = new a();

        private a() {
            super("MAIN_ROUTE", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -955687808;
        }

        public final String toString() {
            return "Main";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llk1/e$b;", "Llk1/e;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f113147b = new b();

        private b() {
            super("SETTINGS_ROUTE", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2009966742;
        }

        public final String toString() {
            return "Settings";
        }
    }

    private e(String str) {
        this.f113145a = str;
    }

    public /* synthetic */ e(String str, j jVar) {
        this(str);
    }
}
