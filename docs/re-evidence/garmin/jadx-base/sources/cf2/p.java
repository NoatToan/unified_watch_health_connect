package cf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcf2/p;", "", "T", "<init>", "()V", "b", "a", "Lcf2/p$a;", "Lcf2/p$b;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p<T> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\f\b\u0001\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcf2/p$b;", "", "T", "Lcf2/p;", "data", "", "responseCode", "<init>", "(Ljava/lang/Object;I)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b<T> extends p<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f27078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27079b;

        public b(T t7, int i14) {
            super(null);
            this.f27078a = t7;
            this.f27079b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f27078a, bVar.f27078a) && this.f27079b == bVar.f27079b;
        }

        public final int hashCode() {
            T t7 = this.f27078a;
            return Integer.hashCode(this.f27079b) + ((t7 == null ? 0 : t7.hashCode()) * 31);
        }

        public final String toString() {
            return "Success(data=" + this.f27078a + ", responseCode=" + this.f27079b + ")";
        }
    }

    public /* synthetic */ p(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private p() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcf2/p$a;", "Lcf2/p;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "responseCode", "", "errorResponse", "<init>", "(Ljava/lang/Exception;Ljava/lang/Integer;Ljava/lang/String;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f27075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f27076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f27077c;

        public /* synthetic */ a(Exception exc, Integer num, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(exc, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f27075a, aVar.f27075a) && p005kotlin.jvm.internal.s.g(this.f27076b, aVar.f27076b) && p005kotlin.jvm.internal.s.g(this.f27077c, aVar.f27077c);
        }

        public final int hashCode() {
            int iHashCode = this.f27075a.hashCode() * 31;
            Integer num = this.f27076b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f27077c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Error(exception=");
            sb3.append(this.f27075a);
            sb3.append(", responseCode=");
            sb3.append(this.f27076b);
            sb3.append(", errorResponse=");
            return am.j.o(this.f27077c, ")", sb3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc, Integer num, String str) {
            super(null);
            exc.getClass();
            this.f27075a = exc;
            this.f27076b = num;
            this.f27077c = str;
        }
    }
}
