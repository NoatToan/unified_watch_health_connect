package nw0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface h0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnw0/h0$a;", "Lnw0/h0;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f128042a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -760319878;
        }

        public final String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnw0/h0$b;", "Lnw0/h0;", "", "behavioursChanged", "<init>", "(Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f128043a;

        public b(boolean z14) {
            this.f128043a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f128043a == ((b) obj).f128043a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f128043a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("Saved(behavioursChanged=", ")", this.f128043a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnw0/h0$c;", "Lnw0/h0;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f128044a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1709858104;
        }

        public final String toString() {
            return "Saving";
        }
    }
}
