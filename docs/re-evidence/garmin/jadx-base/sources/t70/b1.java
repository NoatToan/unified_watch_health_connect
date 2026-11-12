package t70;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lt70/b1;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "b", "a", "Lt70/b1$a;", "Lt70/b1$b;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162810a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt70/b1$a;", "Lt70/b1;", "Lo70/i;", "essentialStatType", "", "shown", "<init>", "(Lo70/i;Z)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o70.i f162811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f162812c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o70.i iVar, boolean z14) {
            super(iVar.f130007a, null);
            iVar.getClass();
            this.f162811b = iVar;
            this.f162812c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f162811b == aVar.f162811b && this.f162812c == aVar.f162812c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f162812c) + (this.f162811b.hashCode() * 31);
        }

        public final String toString() {
            return "EssentialsStat(essentialStatType=" + this.f162811b + ", shown=" + this.f162812c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt70/b1$b;", "Lt70/b1;", "", "titleResId", "", "cardKey", "<init>", "(ILjava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends b1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f162813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f162814c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i14, String str) {
            super(str, null);
            str.getClass();
            this.f162813b = i14;
            this.f162814c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f162813b == bVar.f162813b && p005kotlin.jvm.internal.s.g(this.f162814c, bVar.f162814c);
        }

        public final int hashCode() {
            return this.f162814c.hashCode() + (Integer.hashCode(this.f162813b) * 31);
        }

        public final String toString() {
            return o2.c.e(this.f162813b, "Header(titleResId=", ", cardKey=", this.f162814c, ")");
        }
    }

    private b1(String str) {
        this.f162810a = str;
    }

    public /* synthetic */ b1(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
