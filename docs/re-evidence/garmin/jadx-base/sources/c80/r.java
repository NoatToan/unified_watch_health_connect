package c80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lc80/r;", "", "<init>", "()V", "a", "b", "Lc80/r$a;", "Lc80/r$b;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class r {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc80/r$a;", "Lc80/r;", "", "userHasAccess", "<init>", "(Z)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f25554a;

        public a(boolean z14) {
            super(null);
            this.f25554a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f25554a == ((a) obj).f25554a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f25554a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("PurchaseCompleted(userHasAccess=", ")", this.f25554a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/r$b;", "Lc80/r;", "<init>", "()V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25555a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -535561467;
        }

        public final String toString() {
            return "SubscriptionChange";
        }
    }

    public /* synthetic */ r(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private r() {
    }
}
