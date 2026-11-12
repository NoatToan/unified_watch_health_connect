package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/room/r0;", "Lt13/g$a;", "Lt13/e;", "transactionDispatcher", "<init>", "(Lt13/e;)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 implements t13.g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10943b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.e f10944a;

    public r0(t13.e eVar) {
        eVar.getClass();
        this.f10944a = eVar;
    }

    @Override // t13.g
    public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) t13.g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) t13.g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g.a
    public final t13.g.b<r0> getKey() {
        return f10943b;
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return t13.g.a.C3052a.c(this, bVar);
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return t13.g.a.C3052a.d(gVar, this);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/r0$a;", "Lt13/g$b;", "Landroidx/room/r0;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t13.g.b<r0> {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
