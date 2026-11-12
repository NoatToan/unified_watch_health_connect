package cf;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcf/c;", "Lcf/b;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements cf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f26902c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.b0 f26903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26904b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cf/c$a", "Landroidx/room/g;", "Lcf/a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.g<cf.a> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, cf.a aVar) {
            cf.a aVar2 = aVar;
            cVar.getClass();
            aVar2.getClass();
            cVar.q3(1, aVar2.f26894a);
            cVar.q3(2, aVar2.f26895b);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public c(androidx.room.b0 b0Var) {
        b0Var.getClass();
        this.f26903a = b0Var;
        this.f26904b = new a();
    }

    @Override // cf.b
    public final List<String> a(String str) {
        str.getClass();
        return (List) gl1.d.O(this.f26903a, true, false, new c82.b(str, 4));
    }

    @Override // cf.b
    public final boolean b(String str) {
        str.getClass();
        return ((Boolean) gl1.d.O(this.f26903a, true, false, new c82.b(str, 5))).booleanValue();
    }

    @Override // cf.b
    public final void c(cf.a aVar) {
        gl1.d.O(this.f26903a, false, true, new bp.h(23, this, aVar));
    }

    @Override // cf.b
    public final boolean d(String str) {
        return ((Boolean) gl1.d.O(this.f26903a, true, false, new c82.b(str, 3))).booleanValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf/c$b;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
