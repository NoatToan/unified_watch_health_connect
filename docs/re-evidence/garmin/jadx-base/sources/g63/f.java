package g63;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg63/f$a;", "Lg63/f;", "", "conflicting", "<init>", "(Ljava/lang/Object;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f76132a;

        public a(Object obj) {
            obj.getClass();
            this.f76132a = obj;
        }

        @Override // g63.f
        public final String a() {
            return wr.g.p(new StringBuilder("attempted to overwrite the existing value '"), this.f76132a, CoreConstants.SINGLE_QUOTE_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg63/f$b;", "Lg63/f;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f76133a = new b();

        private b() {
        }

        @Override // g63.f
        public final String a() {
            return "expected an Int value";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg63/f$c;", "Lg63/f;", "", "minDigits", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76134a;

        public c(int i14) {
            this.f76134a = i14;
        }

        @Override // g63.f
        public final String a() {
            return am.j.q(new StringBuilder("expected at least "), this.f76134a, " digits");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg63/f$d;", "Lg63/f;", "", "maxDigits", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76135a;

        public d(int i14) {
            this.f76135a = i14;
        }

        @Override // g63.f
        public final String a() {
            return am.j.q(new StringBuilder("expected at most "), this.f76135a, " digits");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg63/f$e;", "Lg63/f;", "", "expected", "<init>", "(Ljava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76136a;

        public e(String str) {
            str.getClass();
            this.f76136a = str;
        }

        @Override // g63.f
        public final String a() {
            return a0.m(new StringBuilder("expected '"), this.f76136a, CoreConstants.SINGLE_QUOTE_CHAR);
        }
    }

    String a();
}
