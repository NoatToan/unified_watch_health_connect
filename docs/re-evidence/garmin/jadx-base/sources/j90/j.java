package j90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface j {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj90/j$a;", "Lj90/j;", "", "canRetry", "<init>", "(Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f97826a;

        public a(boolean z14) {
            this.f97826a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f97826a == ((a) obj).f97826a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97826a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("Error(canRetry=", ")", this.f97826a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj90/j$b;", "Lj90/j;", "", "jobId", "<init>", "(Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97827a;

        public b(String str) {
            str.getClass();
            this.f97827a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f97827a.equals(((b) obj).f97827a);
        }

        public final int hashCode() {
            return this.f97827a.hashCode();
        }

        public final String toString() {
            return am.j.m("Processing(jobId=", this.f97827a, ")");
        }
    }
}
