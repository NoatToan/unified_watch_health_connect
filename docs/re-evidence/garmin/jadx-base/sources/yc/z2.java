package yc;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lyc/z2;", "", "T", "<init>", "()V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "Lyc/z2$a;", "Lyc/z2$b;", "Lyc/z2$c;", "Lyc/z2$d;", "Lyc/z2$e;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class z2<T> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyc/z2$a;", "", "T", "Lyc/z2;", "", "startIndex", "", "inserted", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(ILjava/util/List;II)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> extends z2<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f196684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<T> f196685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f196686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f196687d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i14, List<? extends T> list, int i15, int i16) {
            super(null);
            list.getClass();
            this.f196684a = i14;
            this.f196685b = list;
            this.f196686c = i15;
            this.f196687d = i16;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f196684a == aVar.f196684a && p005kotlin.jvm.internal.s.g(this.f196685b, aVar.f196685b) && this.f196686c == aVar.f196686c && this.f196687d == aVar.f196687d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f196687d) + Integer.hashCode(this.f196686c) + this.f196685b.hashCode() + Integer.hashCode(this.f196684a);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PagingDataEvent.Append loaded ");
            List<T> list = this.f196685b;
            sb3.append(list.size());
            sb3.append(" items (\n                    |   startIndex: ");
            sb3.append(this.f196684a);
            sb3.append("\n                    |   first item: ");
            sb3.append(p13.h0.d0(list));
            sb3.append("\n                    |   last item: ");
            sb3.append(p13.h0.n0(list));
            sb3.append("\n                    |   newPlaceholdersBefore: ");
            sb3.append(this.f196686c);
            sb3.append("\n                    |   oldPlaceholdersBefore: ");
            sb3.append(this.f196687d);
            sb3.append("\n                    |)\n                    |");
            return d53.n.d(sb3.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/z2$b;", "", "T", "Lyc/z2;", "", "startIndex", "dropCount", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(IIII)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> extends z2<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f196688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f196689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f196690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f196691d;

        public b(int i14, int i15, int i16, int i17) {
            super(null);
            this.f196688a = i14;
            this.f196689b = i15;
            this.f196690c = i16;
            this.f196691d = i17;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f196688a == bVar.f196688a && this.f196689b == bVar.f196689b && this.f196690c == bVar.f196690c && this.f196691d == bVar.f196691d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f196691d) + Integer.hashCode(this.f196690c) + Integer.hashCode(this.f196689b) + Integer.hashCode(this.f196688a);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PagingDataEvent.DropAppend dropped ");
            int i14 = this.f196689b;
            sb3.append(i14);
            sb3.append(" items (\n                    |   startIndex: ");
            ds.e0.m(this.f196688a, i14, "\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb3);
            sb3.append(this.f196690c);
            sb3.append("\n                    |   oldPlaceholdersBefore: ");
            sb3.append(this.f196691d);
            sb3.append("\n                    |)\n                    |");
            return d53.n.d(sb3.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyc/z2$c;", "", "T", "Lyc/z2;", "", "dropCount", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(III)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c<T> extends z2<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f196692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f196693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f196694c;

        public c(int i14, int i15, int i16) {
            super(null);
            this.f196692a = i14;
            this.f196693b = i15;
            this.f196694c = i16;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f196692a == cVar.f196692a && this.f196693b == cVar.f196693b && this.f196694c == cVar.f196694c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f196694c) + Integer.hashCode(this.f196693b) + Integer.hashCode(this.f196692a);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
            int i14 = this.f196692a;
            ds.e0.m(i14, i14, " items (\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb3);
            sb3.append(this.f196693b);
            sb3.append("\n                    |   oldPlaceholdersBefore: ");
            sb3.append(this.f196694c);
            sb3.append("\n                    |)\n                    |");
            return d53.n.d(sb3.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/z2$d;", "", "T", "Lyc/z2;", "", "inserted", "", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(Ljava/util/List;II)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d<T> extends z2<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f196695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f196696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f196697c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends T> list, int i14, int i15) {
            super(null);
            list.getClass();
            this.f196695a = list;
            this.f196696b = i14;
            this.f196697c = i15;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f196695a, dVar.f196695a) && this.f196696b == dVar.f196696b && this.f196697c == dVar.f196697c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f196697c) + Integer.hashCode(this.f196696b) + this.f196695a.hashCode();
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PagingDataEvent.Prepend loaded ");
            List<T> list = this.f196695a;
            sb3.append(list.size());
            sb3.append(" items (\n                    |   first item: ");
            sb3.append(p13.h0.d0(list));
            sb3.append("\n                    |   last item: ");
            sb3.append(p13.h0.n0(list));
            sb3.append("\n                    |   newPlaceholdersBefore: ");
            sb3.append(this.f196696b);
            sb3.append("\n                    |   oldPlaceholdersBefore: ");
            sb3.append(this.f196697c);
            sb3.append("\n                    |)\n                    |");
            return d53.n.d(sb3.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B%\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyc/z2$e;", "", "T", "Lyc/z2;", "Lyc/k3;", "newList", "previousList", "<init>", "(Lyc/k3;Lyc/k3;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e<T> extends z2<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k3<T> f196698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k3<T> f196699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k3<T> k3Var, k3<T> k3Var2) {
            super(null);
            k3Var.getClass();
            k3Var2.getClass();
            this.f196698a = k3Var;
            this.f196699b = k3Var2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            k3<T> k3Var = this.f196698a;
            int f196448b = k3Var.getF196448b();
            e eVar = (e) obj;
            k3<T> k3Var2 = eVar.f196699b;
            k3<T> k3Var3 = eVar.f196698a;
            if (f196448b != k3Var3.getF196448b() || k3Var.getF196449c() != k3Var3.getF196449c() || k3Var.getSize() != k3Var3.getSize() || k3Var.getF196452f() != k3Var3.getF196452f()) {
                return false;
            }
            k3<T> k3Var4 = this.f196699b;
            return k3Var4.getF196448b() == k3Var2.getF196448b() && k3Var4.getF196449c() == k3Var2.getF196449c() && k3Var4.getSize() == k3Var2.getSize() && k3Var4.getF196452f() == k3Var2.getF196452f();
        }

        public final int hashCode() {
            return this.f196699b.hashCode() + this.f196698a.hashCode();
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
            k3<T> k3Var = this.f196698a;
            sb3.append(k3Var.getF196448b());
            sb3.append("\n                    |       placeholdersAfter: ");
            sb3.append(k3Var.getF196449c());
            sb3.append("\n                    |       size: ");
            sb3.append(k3Var.getSize());
            sb3.append("\n                    |       dataCount: ");
            sb3.append(k3Var.getF196452f());
            sb3.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
            k3<T> k3Var2 = this.f196699b;
            sb3.append(k3Var2.getF196448b());
            sb3.append("\n                    |       placeholdersAfter: ");
            sb3.append(k3Var2.getF196449c());
            sb3.append("\n                    |       size: ");
            sb3.append(k3Var2.getSize());
            sb3.append("\n                    |       dataCount: ");
            sb3.append(k3Var2.getF196452f());
            sb3.append("\n                    |   )\n                    |");
            return d53.n.d(sb3.toString());
        }
    }

    public /* synthetic */ z2(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private z2() {
    }
}
