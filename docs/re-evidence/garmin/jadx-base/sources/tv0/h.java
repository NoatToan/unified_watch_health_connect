package tv0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface h {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltv0/h$a;", "Ltv0/h;", "", "Lpv0/d;", "updatedBehaviours", "updatedOriginalBehaviours", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<pv0.d> f166556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<pv0.d> f166557b;

        public a(List<pv0.d> list, List<pv0.d> list2) {
            list.getClass();
            list2.getClass();
            this.f166556a = list;
            this.f166557b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f166556a.equals(aVar.f166556a) && this.f166557b.equals(aVar.f166557b);
        }

        public final int hashCode() {
            return this.f166557b.hashCode() + (this.f166556a.hashCode() * 31);
        }

        public final String toString() {
            return c22.t.f("Error(updatedBehaviours=", ", updatedOriginalBehaviours=", ")", this.f166556a, this.f166557b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltv0/h$b;", "Ltv0/h;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f166558a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -805133767;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltv0/h$c;", "Ltv0/h;", "", "Lpv0/d;", "behaviours", "", "changed", "<init>", "(Ljava/util/List;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<pv0.d> f166559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f166560b;

        public c(List<pv0.d> list, boolean z14) {
            list.getClass();
            this.f166559a = list;
            this.f166560b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f166559a.equals(cVar.f166559a) && this.f166560b == cVar.f166560b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f166560b) + (this.f166559a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(behaviours=" + this.f166559a + ", changed=" + this.f166560b + ")";
        }
    }
}
