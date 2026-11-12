package yd2;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lyd2/b;", "", "T", "<init>", "()V", "b", "a", "Lyd2/b$a;", "Lyd2/b$b;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<T> {

    /* JADX INFO: renamed from: yd2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyd2/b$b;", "", "T", "Lyd2/b;", "data", "", "responseCode", "<init>", "(Ljava/lang/Object;I)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3683b<T> extends b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f196776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f196777b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3683b(T t7, int i14) {
            super(null);
            t7.getClass();
            this.f196776a = t7;
            this.f196777b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3683b)) {
                return false;
            }
            C3683b c3683b = (C3683b) obj;
            return s.g(this.f196776a, c3683b.f196776a) && this.f196777b == c3683b.f196777b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f196777b) + (this.f196776a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(data=" + this.f196776a + ", responseCode=" + this.f196777b + ")";
        }
    }

    public /* synthetic */ b(j jVar) {
        this();
    }

    private b() {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyd2/b$a;", "Lyd2/b;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "responseCode", "", "errorBodyJson", "", "headers", "<init>", "(Ljava/lang/Exception;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f196772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f196773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f196774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<String, String> f196775d;

        public /* synthetic */ a(Exception exc, Integer num, String str, Map map, int i14, j jVar) {
            this(exc, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f196772a, aVar.f196772a) && s.g(this.f196773b, aVar.f196773b) && s.g(this.f196774c, aVar.f196774c) && s.g(this.f196775d, aVar.f196775d);
        }

        public final int hashCode() {
            int iHashCode = this.f196772a.hashCode() * 31;
            Integer num = this.f196773b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f196774c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, String> map = this.f196775d;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            return "Error(exception=" + this.f196772a + ", responseCode=" + this.f196773b + ", errorBodyJson=" + this.f196774c + ", headers=" + this.f196775d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc, Integer num, String str, Map<String, String> map) {
            super(null);
            exc.getClass();
            this.f196772a = exc;
            this.f196773b = num;
            this.f196774c = str;
            this.f196775d = map;
        }
    }
}
