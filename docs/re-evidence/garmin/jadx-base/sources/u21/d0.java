package u21;

import c22.c3;
import c22.g2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lu21/d0;", "", "Lc22/c3;", "errorResId", "<init>", "(Lc22/c3;)V", "b", "a", "c", "Lu21/d0$a;", "Lu21/d0$b;", "Lu21/d0$c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f167927a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu21/d0$a;", "Lu21/d0;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends d0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f167928b = new a();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private a() {
            super(g2.b(c22.x0.Af), null);
            c22.x0.f23314a.getClass();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 875226140;
        }

        public final String toString() {
            return "AlreadyInUse";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu21/d0$b;", "Lu21/d0;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends d0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f167929b = new b();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private b() {
            super(g2.b(c22.x0.Ve), null);
            c22.x0.f23314a.getClass();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1567936529;
        }

        public final String toString() {
            return "Required";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu21/d0$c;", "Lu21/d0;", "", "name", "<init>", "(Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends d0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f167930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(g2.b(c22.x0.f23696wf), null);
            str.getClass();
            c22.x0.f23314a.getClass();
            this.f167930b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f167930b, ((c) obj).f167930b);
        }

        public final int hashCode() {
            return this.f167930b.hashCode();
        }

        public final String toString() {
            return am.j.m("Uncategorized(name=", this.f167930b, ")");
        }
    }

    private d0(c3 c3Var) {
        this.f167927a = c3Var;
    }

    public /* synthetic */ d0(c3 c3Var, p005kotlin.jvm.internal.j jVar) {
        this(c3Var);
    }
}
