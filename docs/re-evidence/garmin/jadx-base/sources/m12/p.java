package m12;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lm12/p;", "", "<init>", "()V", "b", "c", "a", "Lm12/p$a;", "Lm12/p$b;", "Lm12/p$c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm12/p$a;", "Lm12/p;", "", "eventName", "<init>", "(Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f115852a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            str.getClass();
            this.f115852a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f115852a, ((a) obj).f115852a);
        }

        public final int hashCode() {
            return this.f115852a.hashCode();
        }

        public final String toString() {
            return am.j.m("AnalyticsOnly(eventName=", this.f115852a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm12/p$b;", "Lm12/p;", "Lw12/d;", FirebaseAnalytics.Param.DESTINATION, "<init>", "(Lw12/d;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w12.d f115853a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w12.d dVar) {
            super(null);
            dVar.getClass();
            this.f115853a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f115853a, ((b) obj).f115853a);
        }

        public final int hashCode() {
            return this.f115853a.hashCode();
        }

        public final String toString() {
            return "Navigate(destination=" + this.f115853a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm12/p$c;", "Lm12/p;", "", "url", "<init>", "(Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f115854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            str.getClass();
            this.f115854a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f115854a, ((c) obj).f115854a);
        }

        public final int hashCode() {
            return this.f115854a.hashCode();
        }

        public final String toString() {
            return am.j.m("OpenUrl(url=", this.f115854a, ")");
        }
    }

    public /* synthetic */ p(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private p() {
    }
}
