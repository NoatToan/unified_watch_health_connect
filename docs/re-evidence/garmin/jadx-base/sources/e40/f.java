package e40;

import am.j;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.messaging.Constants;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Le40/f;", "", "<init>", "()V", "a", "b", "Le40/f$a;", "Le40/f$b;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le40/f$a;", "Le40/f;", "", "text", "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            str.getClass();
            this.f62854a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f62854a, ((a) obj).f62854a);
        }

        public final int hashCode() {
            return this.f62854a.hashCode();
        }

        public final String toString() {
            return j.m("HeaderItem(text=", this.f62854a, ")");
        }
    }

    public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private f() {
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le40/f$b;", "Le40/f;", "", Action.KEY_ATTRIBUTE, "", "iconResId", Constants.ScionAnalytics.PARAM_LABEL, "", "checked", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f62856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f62858d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Integer num, String str2, boolean z14) {
            super(null);
            str.getClass();
            this.f62855a = str;
            this.f62856b = num;
            this.f62857c = str2;
            this.f62858d = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f62855a, bVar.f62855a) && s.g(this.f62856b, bVar.f62856b) && s.g(this.f62857c, bVar.f62857c) && this.f62858d == bVar.f62858d;
        }

        public final int hashCode() {
            int iHashCode = this.f62855a.hashCode() * 31;
            Integer num = this.f62856b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f62857c;
            return Boolean.hashCode(this.f62858d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            boolean z14 = this.f62858d;
            return j.n(this.f62857c, ", checked=", ")", u0.n("SelectableItem(key=", this.f62856b, this.f62855a, ", iconResId=", ", label="), z14);
        }

        public /* synthetic */ b(String str, Integer num, String str2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : num, str2, (i14 & 8) != 0 ? false : z14);
        }
    }
}
