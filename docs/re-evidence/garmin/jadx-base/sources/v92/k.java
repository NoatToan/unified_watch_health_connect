package v92;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lv92/k;", "", "<init>", "()V", "d", "c", "b", "a", "Lv92/k$a;", "Lv92/k$b;", "Lv92/k$c;", "Lv92/k$d;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/k$a;", "Lv92/k;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f176414a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -954121314;
        }

        public final String toString() {
            return "AdminConsentRequest";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/k$c;", "Lv92/k;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f176417a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 165157108;
        }

        public final String toString() {
            return "HideLoading";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/k$d;", "Lv92/k;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f176418a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 673727193;
        }

        public final String toString() {
            return "ShowLoading";
        }
    }

    public /* synthetic */ k(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private k() {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv92/k$b;", "Lv92/k;", "Lv92/e;", "consentErrorType", "Lkotlin/Function0;", "", "retry", "<init>", "(Lv92/e;Le23/a;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f176415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f176416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, e23.a<Unit> aVar) {
            super(null);
            eVar.getClass();
            this.f176415a = eVar;
            this.f176416b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f176415a, bVar.f176415a) && p005kotlin.jvm.internal.s.g(this.f176416b, bVar.f176416b);
        }

        public final int hashCode() {
            int iHashCode = this.f176415a.hashCode() * 31;
            e23.a<Unit> aVar = this.f176416b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "ConsentError(consentErrorType=" + this.f176415a + ", retry=" + this.f176416b + ")";
        }

        public /* synthetic */ b(e eVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(eVar, (i14 & 2) != 0 ? null : aVar);
        }
    }
}
