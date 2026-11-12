package cf;

import ca0.d2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcf/s;", "Lcf/r;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f26938b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.b0 f26939a;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cf/s$a", "Landroidx/room/g;", "Lcf/q;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.g<q> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, q qVar) {
            q qVar2 = qVar;
            cVar.getClass();
            qVar2.getClass();
            cVar.q3(1, qVar2.f26936a);
            androidx.work.c.b bVar = androidx.work.c.f11464b;
            androidx.work.c cVar2 = qVar2.f26937b;
            bVar.getClass();
            cVar.t(2, androidx.work.c.b.c(cVar2));
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    public s(androidx.room.b0 b0Var) {
        b0Var.getClass();
        this.f26939a = b0Var;
        new a();
    }

    @Override // cf.r
    public final void a(String str) {
        str.getClass();
        gl1.d.O(this.f26939a, false, true, new c82.b(str, 9));
    }

    @Override // cf.r
    public final void deleteAll() {
        gl1.d.O(this.f26939a, false, true, new d2(21));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf/s$b;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
