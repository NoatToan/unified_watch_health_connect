package hj2;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lhj2/j;", "T", "", "<init>", "()V", "b", "a", "Lhj2/j$a;", "Lhj2/j$b;", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class j<T> {
    public /* synthetic */ j(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private j() {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhj2/j$a;", "T", "Lhj2/j;", "", "code", "", "errorMessage", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a<T> extends j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f84034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84036c;

        public /* synthetic */ a(Integer num, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f84034a, aVar.f84034a) && s.g(this.f84035b, aVar.f84035b) && s.g(this.f84036c, aVar.f84036c);
        }

        public final int hashCode() {
            Integer num = this.f84034a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f84035b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f84036c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return am.j.o(this.f84036c, ")", l2.f("Error(code=", this.f84034a, ", errorMessage=", this.f84035b, ", method="));
        }

        public a(Integer num, String str, String str2) {
            super(null);
            this.f84034a = num;
            this.f84035b = str;
            this.f84036c = str2;
        }

        public a() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhj2/j$b;", "T", "Lhj2/j;", "", "code", "data", "", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;)V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b<T> extends j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f84037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f84038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84039c;

        public /* synthetic */ b(Integer num, Object obj, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : obj, (i14 & 4) != 0 ? null : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f84037a, bVar.f84037a) && s.g(this.f84038b, bVar.f84038b) && s.g(this.f84039c, bVar.f84039c);
        }

        public final int hashCode() {
            Integer num = this.f84037a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            T t7 = this.f84038b;
            int iHashCode2 = (iHashCode + (t7 == null ? 0 : t7.hashCode())) * 31;
            String str = this.f84039c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Success(code=");
            sb3.append(this.f84037a);
            sb3.append(", data=");
            sb3.append(this.f84038b);
            sb3.append(", method=");
            return am.j.o(this.f84039c, ")", sb3);
        }

        public b(Integer num, T t7, String str) {
            super(null);
            this.f84037a = num;
            this.f84038b = t7;
            this.f84039c = str;
        }

        public b() {
            this(null, null, null, 7, null);
        }
    }
}
