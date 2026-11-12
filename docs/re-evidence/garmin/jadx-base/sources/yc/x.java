package yc;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lyc/x;", "", "Key", "Value", "Lyc/x$e;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lyc/x$e;)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class x<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f196573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0<d> f196574b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyc/x$c;", "", "Key", "Value", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c<Key, Value> {
        public abstract s51.c a();
    }

    public interface d {
        void a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/x$e;", "", "<init>", "(Ljava/lang/String;I)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum e {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyc/x$f;", "", "K", "Lyc/c1;", NotificationConstants.KEY_DATA_MIME_TYPE, Action.KEY_ATTRIBUTE, "", "initialLoadSize", "", "placeholdersEnabled", "pageSize", "<init>", "(Lyc/c1;Ljava/lang/Object;IZI)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f196585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f196586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f196587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f196588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f196589e;

        public f(c1 c1Var, K k14, int i14, boolean z14, int i15) {
            c1Var.getClass();
            this.f196585a = c1Var;
            this.f196586b = k14;
            this.f196587c = i14;
            this.f196588d = z14;
            this.f196589e = i15;
            if (c1Var == c1.REFRESH || k14 != null) {
                return;
            }
            vb.h.s("Key must be non-null for prepend/append");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/x$d;", "it", "", "invoke", "(Lyc/x$d;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.l<d, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f196590a = new g();

        public g() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(d dVar) {
            d dVar2 = dVar;
            dVar2.getClass();
            dVar2.a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x<Key, Value> f196591a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(x<Key, Value> xVar) {
            super(0);
            this.f196591a = xVar;
        }

        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f196591a.f196574b.f196327e);
        }
    }

    static {
        new b(null);
    }

    public x(e eVar) {
        eVar.getClass();
        this.f196573a = eVar;
        this.f196574b = new q0<>(g.f196590a, new h(this));
    }

    public abstract Key a(Value value);

    public final void b() {
        this.f196574b.a();
    }

    public abstract Object c(f fVar, w0 w0Var);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\fB?\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lyc/x$a;", "", "Value", "", "data", "prevKey", "nextKey", "", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<Value> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C3679a f196575f = new C3679a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Value> f196576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f196577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f196578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f196579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f196580e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Value> list, Object obj, Object obj2, int i14, int i15) {
            list.getClass();
            this.f196576a = list;
            this.f196577b = obj;
            this.f196578c = obj2;
            this.f196579d = i14;
            this.f196580e = i15;
            if (i14 < 0 && i14 != Integer.MIN_VALUE) {
                vb.h.s("Position must be non-negative");
                throw null;
            }
            if (list.isEmpty() && (i14 > 0 || i15 > 0)) {
                vb.h.s("Initial result cannot be empty if items are present in data set.");
                throw null;
            }
            if (i15 >= 0 || i15 == Integer.MIN_VALUE) {
                return;
            }
            vb.h.s("List size + position too large, last item in list beyond totalCount.");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (p005kotlin.jvm.internal.s.g(this.f196576a, aVar.f196576a) && p005kotlin.jvm.internal.s.g(this.f196577b, aVar.f196577b) && p005kotlin.jvm.internal.s.g(this.f196578c, aVar.f196578c) && this.f196579d == aVar.f196579d && this.f196580e == aVar.f196580e) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: yc.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/x$a$a;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C3679a {
            public /* synthetic */ C3679a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3679a() {
            }
        }

        public /* synthetic */ a(List list, Object obj, Object obj2, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
            this(list, obj, obj2, (i16 & 8) != 0 ? Integer.MIN_VALUE : i14, (i16 & 16) != 0 ? Integer.MIN_VALUE : i15);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/x$b;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
