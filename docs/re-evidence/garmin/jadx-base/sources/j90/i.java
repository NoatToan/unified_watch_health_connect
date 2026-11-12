package j90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj90/i$a;", "Lj90/i;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97823a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2111036543;
        }

        public final String toString() {
            return "Complete";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj90/i$b;", "Lj90/i;", "", "canRetry", "<init>", "(Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f97824a;

        public b(boolean z14) {
            this.f97824a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f97824a == ((b) obj).f97824a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97824a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("Error(canRetry=", ")", this.f97824a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj90/i$c;", "Lj90/i;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f97825a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1919213221;
        }

        public final String toString() {
            return "Timeout";
        }
    }
}
