package ag2;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lag2/a;", "", "", "_type", "", "Lag2/c;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("componentType")
    private final String _type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<c> items;

    public a(String str, List<c> list) {
        str.getClass();
        this._type = str;
        this.items = list;
    }

    public static a a(a aVar, ArrayList arrayList) {
        String str = aVar._type;
        str.getClass();
        return new a(str, arrayList);
    }

    public final List<c> b() {
        return this.items;
    }

    public final EnumC0052a c() {
        Object next;
        EnumC0052a.C0053a c0053a = EnumC0052a.f3159b;
        String str = this._type;
        c0053a.getClass();
        str.getClass();
        Iterator<T> it = EnumC0052a.f3165h.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (s.g(((EnumC0052a) next).f3166a, str)) {
                return (EnumC0052a) next;
            }
        }
        next = null;
        return (EnumC0052a) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this._type, aVar._type) && s.g(this.items, aVar.items);
    }

    public final int hashCode() {
        int iHashCode = this._type.hashCode() * 31;
        List<c> list = this.items;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return fb1.c.o("Component(_type=", this._type, ", items=", this.items, ")");
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ag2.a$a[], still in use, count: 1, list:
      (r0v1 ag2.a$a[]) from 0x0038: CONSTRUCTOR (r0v1 ag2.a$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: ag2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lag2/a$a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EnumC0052a {
        MEDIA_CAROUSEL("mediaCarousel"),
        STATS("stats"),
        ACTIVITY_DETAILS("activityDetails"),
        DEVICE_INFO("deviceInfo");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0053a f3159b = new C0053a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f3165h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3166a;

        static {
            f3165h = new w13.c(new EnumC0052a[]{r0, r1, r2, r3});
        }

        private EnumC0052a(String str) {
            super(str, i);
            this.f3166a = str;
        }

        public static EnumC0052a valueOf(String str) {
            return (EnumC0052a) Enum.valueOf(EnumC0052a.class, str);
        }

        public static EnumC0052a[] values() {
            return (EnumC0052a[]) f3164g.clone();
        }

        /* JADX INFO: renamed from: ag2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lag2/a$a$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0053a {
            public /* synthetic */ C0053a(j jVar) {
                this();
            }

            private C0053a() {
            }
        }
    }
}
