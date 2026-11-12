package t70;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lt70/p0;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "a", "c", "b", "d", "Lt70/p0$a;", "Lt70/p0$b;", "Lt70/p0$c;", "Lt70/p0$d;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162944a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt70/p0$a;", "Lt70/p0;", "", "enabled", "", "cardKey", "<init>", "(ZLjava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f162945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f162946c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, String str) {
            super(str, null);
            str.getClass();
            this.f162945b = z14;
            this.f162946c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f162945b == aVar.f162945b && p005kotlin.jvm.internal.s.g(this.f162946c, aVar.f162946c);
        }

        public final int hashCode() {
            return this.f162946c.hashCode() + (Boolean.hashCode(this.f162945b) * 31);
        }

        public final String toString() {
            return "AddNewSecondaryCard(enabled=" + this.f162945b + ", cardKey=" + this.f162946c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt70/p0$b;", "Lt70/p0;", "", "cardKey", "", "show", "<init>", "(Ljava/lang/String;Z)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f162947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f162948c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z14) {
            super(str, null);
            str.getClass();
            this.f162947b = str;
            this.f162948c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f162947b, bVar.f162947b) && this.f162948c == bVar.f162948c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f162948c) + (this.f162947b.hashCode() * 31);
        }

        public final String toString() {
            return n23.j.g("EmptyCard(cardKey=", this.f162947b, ", show=", this.f162948c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt70/p0$d;", "Lt70/p0;", "Lo70/t;", "secondaryStatsType", "<init>", "(Lo70/t;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o70.t f162952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o70.t tVar) {
            super(tVar.f130082a, null);
            tVar.getClass();
            this.f162952b = tVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f162952b == ((d) obj).f162952b;
        }

        public final int hashCode() {
            return this.f162952b.hashCode();
        }

        public final String toString() {
            return "SecondaryStats(secondaryStatsType=" + this.f162952b + ")";
        }
    }

    private p0(String str) {
        this.f162944a = str;
    }

    public /* synthetic */ p0(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt70/p0$c;", "Lt70/p0;", "", "cardKey", "", "titleResId", "", "titleParams", "<init>", "(Ljava/lang/String;ILjava/lang/Object;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f162949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f162950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f162951d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i14, Object obj) {
            super(str, null);
            str.getClass();
            this.f162949b = str;
            this.f162950c = i14;
            this.f162951d = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f162949b, cVar.f162949b) && this.f162950c == cVar.f162950c && p005kotlin.jvm.internal.s.g(this.f162951d, cVar.f162951d);
        }

        public final int hashCode() {
            int iD = q2.d(this.f162950c, this.f162949b.hashCode() * 31, 31);
            Object obj = this.f162951d;
            return iD + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return am.j.k(this.f162951d, ")", androidx.core.view.j.k(this.f162950c, "Header(cardKey=", this.f162949b, ", titleResId=", ", titleParams="));
        }

        public /* synthetic */ c(String str, int i14, Object obj, int i15, p005kotlin.jvm.internal.j jVar) {
            this(str, i14, (i15 & 4) != 0 ? null : obj);
        }
    }
}
