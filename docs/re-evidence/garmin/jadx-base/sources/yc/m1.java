package yc;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lyc/m1;", "", "T", "<init>", "()V", "a", "b", "c", "d", "Lyc/m1$a;", "Lyc/m1$b;", "Lyc/m1$c;", "Lyc/m1$d;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class m1<T> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyc/m1$a;", "", "T", "Lyc/m1;", "Lyc/c1;", "loadType", "", "minPageOffset", "maxPageOffset", "placeholdersRemaining", "<init>", "(Lyc/c1;III)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a<T> extends m1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f196155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f196156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f196157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f196158d;

        /* JADX INFO: renamed from: yc.m1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3663a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f196159a;

            static {
                int[] iArr = new int[c1.values().length];
                try {
                    iArr[c1.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c1.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f196159a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c1 c1Var, int i14, int i15, int i16) {
            super(null);
            c1Var.getClass();
            this.f196155a = c1Var;
            this.f196156b = i14;
            this.f196157c = i15;
            this.f196158d = i16;
            if (c1Var == c1.REFRESH) {
                vb.h.s("Drop load type must be PREPEND or APPEND");
                throw null;
            }
            if (c() > 0) {
                if (i16 >= 0) {
                    return;
                }
                vb.h.x(am.j.h(i16, "Invalid placeholdersRemaining "));
                throw null;
            }
            throw new IllegalArgumentException(("Drop count must be > 0, but was " + c()).toString());
        }

        public final int c() {
            return (this.f196157c - this.f196156b) + 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f196155a == aVar.f196155a && this.f196156b == aVar.f196156b && this.f196157c == aVar.f196157c && this.f196158d == aVar.f196158d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f196158d) + r1.q2.d(this.f196157c, r1.q2.d(this.f196156b, this.f196155a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            String str;
            int i14 = C3663a.f196159a[this.f196155a.ordinal()];
            if (i14 == 1) {
                str = TtmlNode.END;
            } else {
                if (i14 != 2) {
                    vb.h.s("Drop load type must be PREPEND or APPEND");
                    return null;
                }
                str = "front";
            }
            StringBuilder sbL = hb.a.l("PageEvent.Drop from the ", str, " (\n                    |   minPageOffset: ");
            sbL.append(this.f196156b);
            sbL.append("\n                    |   maxPageOffset: ");
            sbL.append(this.f196157c);
            sbL.append("\n                    |   placeholdersRemaining: ");
            sbL.append(this.f196158d);
            sbL.append("\n                    |)");
            return d53.n.d(sbL.toString());
        }
    }

    public /* synthetic */ m1(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public Object a(e23.p<? super T, ? super t13.d<? super Boolean>, ? extends Object> pVar, t13.d<? super m1<T>> dVar) {
        return this;
    }

    public <R> Object b(e23.p<? super T, ? super t13.d<? super R>, ? extends Object> pVar, t13.d<? super m1<R>> dVar) {
        return this;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0011BI\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lyc/m1$b;", "", "T", "Lyc/m1;", "Lyc/c1;", "loadType", "", "Lyc/p4;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Lyc/b1;", "sourceLoadStates", "mediatorLoadStates", "<init>", "(Lyc/c1;Ljava/util/List;IILyc/b1;Lyc/b1;)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b<T> extends m1<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f196160g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b<Object> f196161h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f196162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<p4<T>> f196163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f196164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f196165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b1 f196166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b1 f196167f;

        /* JADX INFO: renamed from: yc.m1$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {158}, m = "filter")
        public static final class C3664b extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public e23.p f196168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public b f196169b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public c1 f196170c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Collection f196171d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Iterator f196172e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public p4 f196173f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public List f196174g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public List f196175h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public Iterator f196176i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f196177j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Collection f196178k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f196179l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f196180m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f196181n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b<T> f196182o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f196183p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3664b(b<T> bVar, t13.d<? super C3664b> dVar) {
                super(dVar);
                this.f196182o = bVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f196181n = obj;
                this.f196183p |= Integer.MIN_VALUE;
                return this.f196182o.a(null, this);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {128}, m = "map")
        public static final class c<R> extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public e23.p f196184a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public b f196185b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public c1 f196186c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Collection f196187d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Iterator f196188e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public p4 f196189f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f196190g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Collection f196191h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public Iterator f196192i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Collection f196193j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Collection f196194k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f196195l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ b<T> f196196m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f196197n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b<T> bVar, t13.d<? super c> dVar) {
                super(dVar);
                this.f196196m = bVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f196195l = obj;
                this.f196197n |= Integer.MIN_VALUE;
                return this.f196196m.b(null, this);
            }
        }

        static {
            p4.f196316e.getClass();
            List listC = p13.w.c(p4.f196317f);
            z0.c.f196665b.getClass();
            z0.c cVar = z0.c.f196667d;
            z0.c cVar2 = z0.c.f196666c;
            f196161h = a.a(listC, 0, 0, new b1(cVar, cVar2, cVar2), null);
        }

        private b(c1 c1Var, List<p4<T>> list, int i14, int i15, b1 b1Var, b1 b1Var2) {
            super(null);
            this.f196162a = c1Var;
            this.f196163b = list;
            this.f196164c = i14;
            this.f196165d = i15;
            this.f196166e = b1Var;
            this.f196167f = b1Var2;
            if (c1Var != c1.APPEND && i14 < 0) {
                vb.h.x(am.j.h(i14, "Prepend insert defining placeholdersBefore must be > 0, but was "));
                throw null;
            }
            if (c1Var != c1.PREPEND && i15 < 0) {
                vb.h.x(am.j.h(i15, "Append insert defining placeholdersAfter must be > 0, but was "));
                throw null;
            }
            if (c1Var == c1.REFRESH && list.isEmpty()) {
                vb.h.s("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
                throw null;
            }
        }

        public static b c(b bVar, b1 b1Var, b1 b1Var2) {
            c1 c1Var = bVar.f196162a;
            List<p4<T>> list = bVar.f196163b;
            int i14 = bVar.f196164c;
            int i15 = bVar.f196165d;
            bVar.getClass();
            c1Var.getClass();
            list.getClass();
            b1Var.getClass();
            return new b(c1Var, list, i14, i15, b1Var, b1Var2);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0088  */
        /* JADX WARN: Code duplicated, block: B:20:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:22:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:24:0x00df A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:33:0x011b  */
        /* JADX WARN: Code duplicated, block: B:35:0x0120  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0088 -> B:18:0x00a8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e0 -> B:26:0x00ef). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // yc.m1
        public final java.lang.Object a(e23.p<? super T, ? super t13.d<? super java.lang.Boolean>, ? extends java.lang.Object> r19, t13.d<? super yc.m1<T>> r20) {
            /*
                Method dump skipped, instruction units count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: yc.m1.b.a(e23.p, t13.d):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x007e  */
        /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:22:0x00cd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:18:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ce -> B:24:0x00da). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // yc.m1
        public final <R> java.lang.Object b(e23.p<? super T, ? super t13.d<? super R>, ? extends java.lang.Object> r18, t13.d<? super yc.m1<R>> r19) {
            /*
                Method dump skipped, instruction units count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: yc.m1.b.b(e23.p, t13.d):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f196162a == bVar.f196162a && p005kotlin.jvm.internal.s.g(this.f196163b, bVar.f196163b) && this.f196164c == bVar.f196164c && this.f196165d == bVar.f196165d && p005kotlin.jvm.internal.s.g(this.f196166e, bVar.f196166e) && p005kotlin.jvm.internal.s.g(this.f196167f, bVar.f196167f);
        }

        public final int hashCode() {
            int iHashCode = (this.f196166e.hashCode() + r1.q2.d(this.f196165d, r1.q2.d(this.f196164c, lc.u0.b(this.f196162a.hashCode() * 31, 31, this.f196163b), 31), 31)) * 31;
            b1 b1Var = this.f196167f;
            return iHashCode + (b1Var == null ? 0 : b1Var.hashCode());
        }

        public final String toString() {
            List<T> list;
            List<T> list2;
            List<p4<T>> list3 = this.f196163b;
            Iterator<T> it = list3.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((p4) it.next()).f196319b.size();
            }
            int i14 = this.f196164c;
            String strValueOf = i14 != -1 ? String.valueOf(i14) : "none";
            int i15 = this.f196165d;
            String strValueOf2 = i15 != -1 ? String.valueOf(i15) : "none";
            StringBuilder sb3 = new StringBuilder("PageEvent.Insert for ");
            sb3.append(this.f196162a);
            sb3.append(", with ");
            sb3.append(size);
            sb3.append(" items (\n                    |   first item: ");
            p4 p4Var = (p4) p13.h0.d0(list3);
            Object objN0 = null;
            sb3.append((p4Var == null || (list2 = p4Var.f196319b) == null) ? null : p13.h0.d0(list2));
            sb3.append("\n                    |   last item: ");
            p4 p4Var2 = (p4) p13.h0.n0(list3);
            if (p4Var2 != null && (list = p4Var2.f196319b) != null) {
                objN0 = p13.h0.n0(list);
            }
            sb3.append(objN0);
            sb3.append("\n                    |   placeholdersBefore: ");
            sb3.append(strValueOf);
            sb3.append("\n                    |   placeholdersAfter: ");
            sb3.append(strValueOf2);
            sb3.append("\n                    |   sourceLoadStates: ");
            sb3.append(this.f196166e);
            sb3.append("\n                    ");
            String string = sb3.toString();
            b1 b1Var = this.f196167f;
            if (b1Var != null) {
                string = string + "|   mediatorLoadStates: " + b1Var + '\n';
            }
            return d53.n.d(string.concat("|)"));
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/m1$b$a;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static b a(List list, int i14, int i15, b1 b1Var, b1 b1Var2) {
                list.getClass();
                b1Var.getClass();
                return new b(c1.REFRESH, list, i14, i15, b1Var, b1Var2, null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(c1 c1Var, List list, int i14, int i15, b1 b1Var, b1 b1Var2, int i16, p005kotlin.jvm.internal.j jVar) {
            this(c1Var, list, i14, i15, b1Var, (i16 & 32) != 0 ? null : b1Var2);
        }

        public /* synthetic */ b(c1 c1Var, List list, int i14, int i15, b1 b1Var, b1 b1Var2, p005kotlin.jvm.internal.j jVar) {
            this(c1Var, list, i14, i15, b1Var, b1Var2);
        }
    }

    private m1() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyc/m1$c;", "", "T", "Lyc/m1;", "Lyc/b1;", "source", "mediator", "<init>", "(Lyc/b1;Lyc/b1;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c<T> extends m1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b1 f196198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b1 f196199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b1 b1Var, b1 b1Var2) {
            super(null);
            b1Var.getClass();
            this.f196198a = b1Var;
            this.f196199b = b1Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f196198a, cVar.f196198a) && p005kotlin.jvm.internal.s.g(this.f196199b, cVar.f196199b);
        }

        public final int hashCode() {
            int iHashCode = this.f196198a.hashCode() * 31;
            b1 b1Var = this.f196199b;
            return iHashCode + (b1Var == null ? 0 : b1Var.hashCode());
        }

        public final String toString() {
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f196198a + "\n                    ";
            b1 b1Var = this.f196199b;
            if (b1Var != null) {
                str = str + "|   mediatorLoadStates: " + b1Var + '\n';
            }
            return d53.n.d(str.concat("|)"));
        }

        public /* synthetic */ c(b1 b1Var, b1 b1Var2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(b1Var, (i14 & 2) != 0 ? null : b1Var2);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/m1$d;", "", "T", "Lyc/m1;", "", "data", "Lyc/b1;", "sourceLoadStates", "mediatorLoadStates", "<init>", "(Ljava/util/List;Lyc/b1;Lyc/b1;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class d<T> extends m1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f196200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b1 f196201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b1 f196202c;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {66}, m = "filter")
        public static final class a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public d f196203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public e23.p f196204b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Collection f196205c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Iterator f196206d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f196207e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public /* synthetic */ Object f196208f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ d<T> f196209g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f196210h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d<T> dVar, t13.d<? super a> dVar2) {
                super(dVar2);
                this.f196209g = dVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f196208f = obj;
                this.f196210h |= Integer.MIN_VALUE;
                return this.f196209g.a(null, this);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {48}, m = "map")
        public static final class b<R> extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public d f196211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public e23.p f196212b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Collection f196213c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Iterator f196214d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Collection f196215e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public /* synthetic */ Object f196216f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ d<T> f196217g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f196218h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d<T> dVar, t13.d<? super b> dVar2) {
                super(dVar2);
                this.f196217g = dVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f196216f = obj;
                this.f196218h |= Integer.MIN_VALUE;
                return this.f196217g.b(null, this);
            }
        }

        public /* synthetic */ d(List list, b1 b1Var, b1 b1Var2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(list, (i14 & 2) != 0 ? null : b1Var, (i14 & 4) != 0 ? null : b1Var2);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0050  */
        /* JADX WARN: Code duplicated, block: B:19:0x0069 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x006a  */
        /* JADX WARN: Code duplicated, block: B:23:0x0076  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:21:0x006e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // yc.m1
        public final java.lang.Object a(e23.p<? super T, ? super t13.d<? super java.lang.Boolean>, ? extends java.lang.Object> r9, t13.d<? super yc.m1<T>> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof yc.m1.d.a
                if (r0 == 0) goto L13
                r0 = r10
                yc.m1$d$a r0 = (yc.m1.d.a) r0
                int r1 = r0.f196210h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f196210h = r1
                goto L18
            L13:
                yc.m1$d$a r0 = new yc.m1$d$a
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.f196208f
                u13.a r1 = u13.a.COROUTINE_SUSPENDED
                int r2 = r0.f196210h
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L33
                java.lang.Object r9 = r0.f196207e
                java.util.Iterator r2 = r0.f196206d
                java.util.Collection r4 = r0.f196205c
                java.util.Collection r4 = (java.util.Collection) r4
                e23.p r5 = r0.f196204b
                yc.m1$d r6 = r0.f196203a
                o13.r.b(r10)
                goto L6e
            L33:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r9)
                r9 = 0
                return r9
            L3a:
                o13.r.b(r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.List<T> r2 = r8.f196200a
                java.util.Iterator r2 = r2.iterator()
                r6 = r8
                r4 = r10
            L4a:
                boolean r10 = r2.hasNext()
                if (r10 == 0) goto L7b
                java.lang.Object r10 = r2.next()
                r0.f196203a = r6
                r0.f196204b = r9
                r5 = r4
                java.util.Collection r5 = (java.util.Collection) r5
                r0.f196205c = r5
                r0.f196206d = r2
                r0.f196207e = r10
                r0.f196210h = r3
                java.lang.Object r5 = r9.invoke(r10, r0)
                if (r5 != r1) goto L6a
                return r1
            L6a:
                r7 = r5
                r5 = r9
                r9 = r10
                r10 = r7
            L6e:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L79
                r4.add(r9)
            L79:
                r9 = r5
                goto L4a
            L7b:
                java.util.List r4 = (java.util.List) r4
                yc.b1 r9 = r6.f196201b
                yc.b1 r10 = r6.f196202c
                yc.m1$d r0 = new yc.m1$d
                r0.<init>(r4, r9, r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: yc.m1.d.a(e23.p, t13.d):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0073 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0074  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:21:0x0077). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // yc.m1
        public final <R> java.lang.Object b(e23.p<? super T, ? super t13.d<? super R>, ? extends java.lang.Object> r8, t13.d<? super yc.m1<R>> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof yc.m1.d.b
                if (r0 == 0) goto L13
                r0 = r9
                yc.m1$d$b r0 = (yc.m1.d.b) r0
                int r1 = r0.f196218h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f196218h = r1
                goto L18
            L13:
                yc.m1$d$b r0 = new yc.m1$d$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f196216f
                u13.a r1 = u13.a.COROUTINE_SUSPENDED
                int r2 = r0.f196218h
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L35
                java.util.Collection r8 = r0.f196215e
                java.util.Collection r8 = (java.util.Collection) r8
                java.util.Iterator r2 = r0.f196214d
                java.util.Collection r4 = r0.f196213c
                java.util.Collection r4 = (java.util.Collection) r4
                e23.p r5 = r0.f196212b
                yc.m1$d r6 = r0.f196211a
                o13.r.b(r9)
                goto L77
            L35:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r8)
                r8 = 0
                return r8
            L3c:
                o13.r.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r2 = 10
                java.util.List<T> r4 = r7.f196200a
                int r2 = p13.y.r(r4, r2)
                r9.<init>(r2)
                java.util.Iterator r2 = r4.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
                r6 = r7
            L54:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L7d
                java.lang.Object r4 = r2.next()
                r0.f196211a = r6
                r0.f196212b = r9
                r5 = r8
                java.util.Collection r5 = (java.util.Collection) r5
                r0.f196213c = r5
                r0.f196214d = r2
                r0.f196215e = r5
                r0.f196218h = r3
                java.lang.Object r4 = r9.invoke(r4, r0)
                if (r4 != r1) goto L74
                return r1
            L74:
                r5 = r9
                r9 = r4
                r4 = r8
            L77:
                r8.add(r9)
                r8 = r4
                r9 = r5
                goto L54
            L7d:
                java.util.List r8 = (java.util.List) r8
                yc.b1 r9 = r6.f196201b
                yc.b1 r0 = r6.f196202c
                yc.m1$d r1 = new yc.m1$d
                r1.<init>(r8, r9, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: yc.m1.d.b(e23.p, t13.d):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f196200a, dVar.f196200a) && p005kotlin.jvm.internal.s.g(this.f196201b, dVar.f196201b) && p005kotlin.jvm.internal.s.g(this.f196202c, dVar.f196202c);
        }

        public final int hashCode() {
            int iHashCode = this.f196200a.hashCode() * 31;
            b1 b1Var = this.f196201b;
            int iHashCode2 = (iHashCode + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
            b1 b1Var2 = this.f196202c;
            return iHashCode2 + (b1Var2 != null ? b1Var2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PageEvent.StaticList with ");
            List<T> list = this.f196200a;
            sb3.append(list.size());
            sb3.append(" items (\n                    |   first item: ");
            sb3.append(p13.h0.d0(list));
            sb3.append("\n                    |   last item: ");
            sb3.append(p13.h0.n0(list));
            sb3.append("\n                    |   sourceLoadStates: ");
            sb3.append(this.f196201b);
            sb3.append("\n                    ");
            String string = sb3.toString();
            b1 b1Var = this.f196202c;
            if (b1Var != null) {
                string = string + "|   mediatorLoadStates: " + b1Var + '\n';
            }
            return d53.n.d(string.concat("|)"));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends T> list, b1 b1Var, b1 b1Var2) {
            super(null);
            list.getClass();
            this.f196200a = list;
            this.f196201b = b1Var;
            this.f196202c = b1Var2;
        }
    }
}
