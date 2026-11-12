package wq0;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lwq0/a0;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "a", "b", "Lwq0/a0$a;", "Lwq0/a0$b;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186579a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwq0/a0$a;", "Lwq0/a0;", "", "titleResId", "", "itemKey", "<init>", "(ILjava/lang/String;)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f186580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f186581c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i14, String str) {
            super(str, null);
            str.getClass();
            this.f186580b = i14;
            this.f186581c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f186580b == aVar.f186580b && p005kotlin.jvm.internal.s.g(this.f186581c, aVar.f186581c);
        }

        public final int hashCode() {
            return this.f186581c.hashCode() + (Integer.hashCode(this.f186580b) * 31);
        }

        public final String toString() {
            return o2.c.e(this.f186580b, "Header(titleResId=", ", itemKey=", this.f186581c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwq0/a0$b;", "Lwq0/a0;", "Ltq0/f;", "preference", "Ltq0/a;", "activityDTO", "<init>", "(Ltq0/f;Ltq0/a;)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final tq0.f f186582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final tq0.a f186583c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(tq0.f fVar, tq0.a aVar) {
            fVar.getClass();
            aVar.getClass();
            String str = fVar.f166057c;
            super(str == null ? "" : str, null);
            this.f186582b = fVar;
            this.f186583c = aVar;
        }

        public static b a(b bVar, tq0.f fVar) {
            tq0.a aVar = bVar.f186583c;
            bVar.getClass();
            aVar.getClass();
            return new b(fVar, aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f186582b, bVar.f186582b) && p005kotlin.jvm.internal.s.g(this.f186583c, bVar.f186583c);
        }

        public final int hashCode() {
            return this.f186583c.hashCode() + (this.f186582b.hashCode() * 31);
        }

        public final String toString() {
            return "PreferenceItem(preference=" + this.f186582b + ", activityDTO=" + this.f186583c + ")";
        }
    }

    private a0(String str) {
        this.f186579a = str;
    }

    public /* synthetic */ a0(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
