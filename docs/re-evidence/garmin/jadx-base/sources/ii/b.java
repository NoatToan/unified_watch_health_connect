package ii;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e23.l;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lii/b;", "Lb03/d;", "Lhi/b;", "Lii/a;", "database", "Ld03/d;", "driver", "<init>", "(Lii/a;Ld03/d;)V", "a", "b", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b extends b03.d implements hi.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii.a f93522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d03.d f93523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f93524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f93525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f93526g;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lii/b$a;", "", "T", "Lb03/a;", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Ld03/c;", "mapper", "<init>", "(Lii/b;Ljava/lang/String;Le23/l;)V", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class a<T> extends b03.a<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f93527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f93528f;

        /* JADX INFO: renamed from: ii.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ld03/g;", "", "invoke", "(Ld03/g;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1790a extends w implements l<d03.g, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a<T> f93529a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1790a(a<? extends T> aVar) {
                super(1);
                this.f93529a = aVar;
            }

            @Override // e23.l
            public final Unit invoke(d03.g gVar) {
                d03.g gVar2 = gVar;
                gVar2.getClass();
                gVar2.r(1, this.f93529a.f93527e);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, String str, l<? super d03.c, ? extends T> lVar) {
            super(bVar.f93524e, lVar);
            str.getClass();
            lVar.getClass();
            this.f93528f = bVar;
            this.f93527e = str;
        }

        @Override // b03.a
        public final d03.c a() {
            return this.f93528f.f93523d.g0(-1788979202, "SELECT key, record FROM records WHERE key=?", 1, new C1790a(this));
        }

        public final String toString() {
            return "json.sq:recordForKey";
        }
    }

    /* JADX INFO: renamed from: ii.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lii/b$b;", "", "T", "Lb03/a;", "", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Ld03/c;", "mapper", "<init>", "(Lii/b;Ljava/util/Collection;Le23/l;)V", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class C1791b<T> extends b03.a<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Collection<String> f93530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f93531f;

        /* JADX INFO: renamed from: ii.b$b$a */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ld03/g;", "", "invoke", "(Ld03/g;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends w implements l<d03.g, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1791b<T> f93532a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C1791b<? extends T> c1791b) {
                super(1);
                this.f93532a = c1791b;
            }

            @Override // e23.l
            public final Unit invoke(d03.g gVar) {
                d03.g gVar2 = gVar;
                gVar2.getClass();
                int i14 = 0;
                for (T t7 : this.f93532a.f93530e) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    gVar2.r(i15, (String) t7);
                    i14 = i15;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1791b(b bVar, Collection<String> collection, l<? super d03.c, ? extends T> lVar) {
            super(bVar.f93525f, lVar);
            collection.getClass();
            lVar.getClass();
            this.f93531f = bVar;
            this.f93530e = collection;
        }

        @Override // b03.a
        public final d03.c a() {
            String string;
            Collection<String> collection = this.f93530e;
            int size = collection.size();
            b bVar = this.f93531f;
            bVar.getClass();
            if (size == 0) {
                string = "()";
            } else {
                StringBuilder sb3 = new StringBuilder(size + 2);
                sb3.append("(?");
                int i14 = size - 1;
                for (int i15 = 0; i15 < i14; i15++) {
                    sb3.append(",?");
                }
                sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                string = sb3.toString();
            }
            return bVar.f93523d.g0(null, "SELECT key, record FROM records WHERE key IN ".concat(string), collection.size(), new a(this));
        }

        public final String toString() {
            return "json.sq:recordsForKeys";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld03/g;", "", "invoke", "(Ld03/g;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends w implements l<d03.g, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f93533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f93533a = str;
        }

        @Override // e23.l
        public final Unit invoke(d03.g gVar) {
            d03.g gVar2 = gVar;
            gVar2.getClass();
            gVar2.r(1, this.f93533a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lb03/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends w implements e23.a<List<? extends b03.a<?>>> {
        public d() {
            super(0);
        }

        @Override // e23.a
        public final List<? extends b03.a<?>> invoke() {
            b bVar = b.this;
            b bVar2 = bVar.f93522c.f93520c;
            return h0.C0(h0.C0(bVar2.f93524e, bVar2.f93526g), bVar.f93522c.f93520c.f93525f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lb03/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends w implements e23.a<List<? extends b03.a<?>>> {
        public e() {
            super(0);
        }

        @Override // e23.a
        public final List<? extends b03.a<?>> invoke() {
            b bVar = b.this;
            b bVar2 = bVar.f93522c.f93520c;
            return h0.C0(h0.C0(bVar2.f93524e, bVar2.f93526g), bVar.f93522c.f93520c.f93525f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld03/g;", "", "invoke", "(Ld03/g;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends w implements l<d03.g, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f93536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f93537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2) {
            super(1);
            this.f93536a = str;
            this.f93537b = str2;
        }

        @Override // e23.l
        public final Unit invoke(d03.g gVar) {
            d03.g gVar2 = gVar;
            gVar2.getClass();
            gVar2.r(1, this.f93536a);
            gVar2.r(2, this.f93537b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lb03/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends w implements e23.a<List<? extends b03.a<?>>> {
        public g() {
            super(0);
        }

        @Override // e23.a
        public final List<? extends b03.a<?>> invoke() {
            b bVar = b.this;
            b bVar2 = bVar.f93522c.f93520c;
            return h0.C0(h0.C0(bVar2.f93524e, bVar2.f93526g), bVar.f93522c.f93520c.f93525f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld03/g;", "", "invoke", "(Ld03/g;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends w implements l<d03.g, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f93539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f93540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2) {
            super(1);
            this.f93539a = str;
            this.f93540b = str2;
        }

        @Override // e23.l
        public final Unit invoke(d03.g gVar) {
            d03.g gVar2 = gVar;
            gVar2.getClass();
            gVar2.r(1, this.f93539a);
            gVar2.r(2, this.f93540b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lb03/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends w implements e23.a<List<? extends b03.a<?>>> {
        public i() {
            super(0);
        }

        @Override // e23.a
        public final List<? extends b03.a<?>> invoke() {
            b bVar = b.this;
            b bVar2 = bVar.f93522c.f93520c;
            return h0.C0(h0.C0(bVar2.f93524e, bVar2.f93526g), bVar.f93522c.f93520c.f93525f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ii.a aVar, d03.d dVar) {
        super(dVar);
        aVar.getClass();
        dVar.getClass();
        this.f93522c = aVar;
        this.f93523d = dVar;
        this.f93524e = new CopyOnWriteArrayList();
        this.f93525f = new CopyOnWriteArrayList();
        this.f93526g = new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
    }

    @Override // hi.b
    public final void a(String str) {
        str.getClass();
        this.f93523d.Z2(1791947362, "DELETE FROM records WHERE key=?", new c(str));
        g(1791947362, new d());
    }

    @Override // hi.b
    public final C1791b b(Collection collection) {
        collection.getClass();
        ii.f fVar = ii.f.f93545a;
        fVar.getClass();
        return new C1791b(this, collection, new ii.e(fVar));
    }

    @Override // hi.b
    public final void c(String str, String str2) {
        str2.getClass();
        this.f93523d.Z2(-2006407808, "UPDATE records SET record=? WHERE key=?", new h(str, str2));
        g(-2006407808, new i());
    }

    @Override // hi.b
    public final void d(String str, String str2) {
        str.getClass();
        this.f93523d.Z2(1943613296, "INSERT INTO records (key, record) VALUES (?,?)", new f(str, str2));
        g(1943613296, new g());
    }

    @Override // hi.b
    public final void deleteAll() {
        this.f93523d.Z2(1755405279, "DELETE FROM records", null);
        g(1755405279, new e());
    }

    @Override // hi.b
    public final a e(String str) {
        str.getClass();
        ii.d dVar = ii.d.f93543a;
        dVar.getClass();
        return new a(this, str, new ii.c(dVar));
    }
}
