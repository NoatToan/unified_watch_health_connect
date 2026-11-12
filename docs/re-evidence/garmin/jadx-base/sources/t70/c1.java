package t70;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lt70/c1;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "a", "b", "Lt70/c1$a;", "Lt70/c1$b;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162819a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt70/c1$a;", "Lt70/c1;", "", "titleResId", "", "cardKey", "<init>", "(ILjava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f162820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f162821c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i14, String str) {
            super(str, null);
            str.getClass();
            this.f162820b = i14;
            this.f162821c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f162820b == aVar.f162820b && p005kotlin.jvm.internal.s.g(this.f162821c, aVar.f162821c);
        }

        public final int hashCode() {
            return this.f162821c.hashCode() + (Integer.hashCode(this.f162820b) * 31);
        }

        public final String toString() {
            return o2.c.e(this.f162820b, "Header(titleResId=", ", cardKey=", this.f162821c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt70/c1$b;", "Lt70/c1;", "Lo70/r;", "primaryStatType", "", "shown", "<init>", "(Lo70/r;Z)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o70.r f162822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f162823c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o70.r rVar, boolean z14) {
            super(rVar.getF129941a(), null);
            rVar.getClass();
            this.f162822b = rVar;
            this.f162823c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f162822b, bVar.f162822b) && this.f162823c == bVar.f162823c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f162823c) + (this.f162822b.hashCode() * 31);
        }

        public final String toString() {
            return "PrimaryStat(primaryStatType=" + this.f162822b + ", shown=" + this.f162823c + ")";
        }
    }

    private c1(String str) {
        this.f162819a = str;
    }

    public /* synthetic */ c1(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
