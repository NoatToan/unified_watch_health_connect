package rf2;

import com.garmin.proto.generated.GDILiveSessionProto;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f152468a = a.f152469a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf2/e$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f152469a = new a();

        /* JADX INFO: renamed from: rf2.e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2868a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f152470a;

            static {
                int[] iArr = new int[GDILiveSessionProto.ActivityStateRequest.EndReason.values().length];
                try {
                    iArr[GDILiveSessionProto.ActivityStateRequest.EndReason.SAVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GDILiveSessionProto.ActivityStateRequest.EndReason.DISCARDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f152470a = iArr;
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf2/e$b;", "Lrf2/e;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f152471b = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1064968586;
        }

        public final String toString() {
            return "Discarded";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrf2/e$c;", "Lrf2/e;", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f152472b;

        public c(String str) {
            this.f152472b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f152472b, ((c) obj).f152472b);
        }

        public final int hashCode() {
            String str = this.f152472b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("Error(label=", this.f152472b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf2/e$d;", "Lrf2/e;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f152473b = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -787731520;
        }

        public final String toString() {
            return "Saved";
        }
    }

    /* JADX INFO: renamed from: rf2.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf2/e$e;", "Lrf2/e;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2869e implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2869e f152474b = new C2869e();

        private C2869e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2869e);
        }

        public final int hashCode() {
            return 12462138;
        }

        public final String toString() {
            return "TimeOut";
        }
    }
}
