package cf;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcf/f;", "Lcf/e;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f26912c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.b0 f26913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26914b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cf/f$a", "Landroidx/room/g;", "Lcf/d;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.g<d> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, d dVar) {
            d dVar2 = dVar;
            cVar.getClass();
            dVar2.getClass();
            cVar.q3(1, dVar2.f26907a);
            Long l14 = dVar2.f26908b;
            if (l14 == null) {
                cVar.u(2);
            } else {
                cVar.h(2, l14.longValue());
            }
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public f(androidx.room.b0 b0Var) {
        b0Var.getClass();
        this.f26913a = b0Var;
        this.f26914b = new a();
    }

    @Override // cf.e
    public final Long a(String str) {
        return (Long) gl1.d.O(this.f26913a, true, false, new c82.b(str, 6));
    }

    @Override // cf.e
    public final void b(d dVar) {
        gl1.d.O(this.f26913a, false, true, new bp.h(24, this, dVar));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf/f$b;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
