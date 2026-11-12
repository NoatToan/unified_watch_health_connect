package cf;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcf/e0;", "Lcf/d0;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 implements d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f26909c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.b0 f26910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26911b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cf/e0$a", "Landroidx/room/g;", "Lcf/c0;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.g<c0> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, c0 c0Var) {
            c0 c0Var2 = c0Var;
            cVar.getClass();
            c0Var2.getClass();
            cVar.q3(1, c0Var2.f26905a);
            cVar.q3(2, c0Var2.f26906b);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public e0(androidx.room.b0 b0Var) {
        b0Var.getClass();
        this.f26910a = b0Var;
        this.f26911b = new a();
    }

    @Override // cf.d0
    public final void a(String str) {
        str.getClass();
        gl1.d.O(this.f26910a, false, true, new c82.b(str, 22));
    }

    @Override // cf.d0
    public final List<String> c(String str) {
        str.getClass();
        return (List) gl1.d.O(this.f26910a, true, false, new c82.b(str, 21));
    }

    @Override // cf.d0
    public final void d(c0 c0Var) {
        gl1.d.O(this.f26910a, false, true, new bp.h(29, this, c0Var));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf/e0$b;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
